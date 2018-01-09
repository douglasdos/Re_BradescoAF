package br.com.plusoft.csi.bradescoaf.ws;

import java.util.Vector;

import br.com.plusoft.csi.adm.helper.generic.GenericHelper;
import br.com.plusoft.csi.bradescoaf.constantes.ConstantesEspec;
import br.com.plusoft.csi.bradescoaf.ws.vo.AtendimentoPadraoWsVo;
import br.com.plusoft.csi.bradescoaf.ws.vo.RetornoAtendimentoPadrao;
import br.com.plusoft.csi.bradescoaf.ws.vo.RetornoInclusaoAtendimentoPadrao;
import br.com.plusoft.csi.crm.helper.AtendimentoPadraoHelper;
import br.com.plusoft.csi.crm.vo.AtendimentoPadraoVo;
import br.com.plusoft.fw.entity.Condition;
import br.com.plusoft.fw.entity.Vo;

public class AtendimentoPadraoWs {
	
	public RetornoAtendimentoPadrao recuperarListaAtendimentoPadrao (long idEmprCdEmpresa) {
		
		RetornoAtendimentoPadrao retorno = new RetornoAtendimentoPadrao();
		GenericHelper gHelper = null;
		
		try {
			
			retorno.setCodigoRetorno(0);
			retorno.setMensagemRetorno("");

			if (idEmprCdEmpresa < 1) {
				retorno.setCodigoRetorno(1);
				retorno.setMensagemRetorno("O código da empresa é obrigatório.");
				return retorno;
			}
			
			gHelper = new GenericHelper(idEmprCdEmpresa);
			
			//Validar Empresa
			Condition condEmpr = new Condition("id_empr_cd_empresa", Condition.EQUAL, idEmprCdEmpresa);
			Vector vecEmpr = gHelper.openQuery(ConstantesEspec.ENTITY_CS_CDTB_EMPRESA_EMPR, "select-by-condition", condEmpr);
			
			if (!(vecEmpr != null && vecEmpr.size() > 0)) {
				retorno.setCodigoRetorno(7);
				retorno.setMensagemRetorno("O código da empresa não é válido.");
				return retorno;
			}
			
			Condition cond = new Condition();
			cond.addCondition("id_empr_cd_empresa", Condition.EQUAL, idEmprCdEmpresa);
			cond.addCondition("atpa_dh_inativo", Condition.IS_NULL, null);
			Vector vecAtend = gHelper.openQuery(ConstantesEspec.ENTITY_CS_CDTB_ATENDPADRAO_ATPA, "select-by-condition", cond);
			
			if (vecAtend != null && vecAtend.size() > 0) {
				Vector<AtendimentoPadraoWsVo> lstAtendRet = new Vector<AtendimentoPadraoWsVo>();
				for (Vo voAtend : (Vector<Vo>) vecAtend) {
					AtendimentoPadraoWsVo atendWsVo = new AtendimentoPadraoWsVo();
					atendWsVo.setCodigoAtendimentoPadrao(voAtend.getFieldAsInteger("id_atpd_cd_atendpadrao"));
					atendWsVo.setDescricaoAtendimentoPadrao(voAtend.getFieldAsString("atpd_ds_atendpadrao"));
					lstAtendRet.add(atendWsVo);
				}
				
				retorno.setAtendimentoPadraoWs(lstAtendRet.toArray(new AtendimentoPadraoWsVo[lstAtendRet.size()]) );
			} else {
				retorno.setCodigoRetorno(2);
				retorno.setMensagemRetorno("Nenhum registro encontrado");
				return retorno;
			}
		} catch (Exception e) {
			retorno.setCodigoRetorno(3);
			retorno.setMensagemRetorno("Ocorreu um erro. Descrição do erro: " + e.getMessage());
			return retorno;
		}
		
		return retorno;
		
	}
	
	
	public RetornoInclusaoAtendimentoPadrao incluirAtendimentoPadrao(
			long codigoAtendimentoPadrao,
			long idEmprCdEmpresa,
			long numeroSinistro,
			String textoManifestacao) {
		
		RetornoInclusaoAtendimentoPadrao retorno = new RetornoInclusaoAtendimentoPadrao();
		GenericHelper gHelper = null;
		
		try {
			
			retorno.setCodigoRetorno(0);
			retorno.setMensagemRetorno("");
		
			if (idEmprCdEmpresa < 1) {
				retorno.setCodigoRetorno(1);
				retorno.setMensagemRetorno("O código da empresa é obrigatório.");
				return retorno;
			}
			
			if (codigoAtendimentoPadrao < 1) {
				retorno.setCodigoRetorno(4);
				retorno.setMensagemRetorno("O código do atendimento padrão é obrigatório.");
				return retorno;
			}
			
			if (numeroSinistro < 1) {
				retorno.setCodigoRetorno(5);
				retorno.setMensagemRetorno("O número do sinistro é obrigatório.");
				return retorno;
			}
			
			if ("".equalsIgnoreCase(textoManifestacao)) {
				textoManifestacao = "NÚMERO DO SINISTRO : " + numeroSinistro;
			} else {
				textoManifestacao += "\nNÚMERO DO SINISTRO : " + numeroSinistro;
			}
			
			gHelper = new GenericHelper(idEmprCdEmpresa);
			
			
			//Validar codigo do atendimento padrão
			Condition condAtpa = new Condition();
			condAtpa.addCondition("id_atpd_cd_atendpadrao", Condition.EQUAL, codigoAtendimentoPadrao);
			condAtpa.addCondition("id_empr_cd_empresa", Condition.EQUAL, idEmprCdEmpresa);
			Vector vecAtpa = gHelper.openQuery(ConstantesEspec.ENTITY_CS_CDTB_ATENDPADRAO_ATPA, "select-by-condition", condAtpa);
			
			if (!(vecAtpa != null && vecAtpa.size() > 0)) {
				retorno.setCodigoRetorno(6);
				retorno.setMensagemRetorno("O código do atendimento padrão não é válido.");
				return retorno;
			}
			
			//Validar Empresa
			Condition condEmpr = new Condition("id_empr_cd_empresa", Condition.EQUAL, idEmprCdEmpresa);
			Vector vecEmpr = gHelper.openQuery(ConstantesEspec.ENTITY_CS_CDTB_EMPRESA_EMPR, "select-by-condition", condEmpr);
			
			if (!(vecEmpr != null && vecEmpr.size() > 0)) {
				retorno.setCodigoRetorno(7);
				retorno.setMensagemRetorno("O código da empresa não é válido.");
				return retorno;
			}
			
			//Buscar pessoa pelo numero do sinistro
			long idPessCdPessoa = 0;
			Condition condSinistro = new Condition("pesr_nr_sinistro", Condition.EQUAL, numeroSinistro);
			Vector vecSini = gHelper.openQuery(ConstantesEspec.ENTITY_ES_CDTB_PESSOASINISTRORE_PESR, "select-by-condition", condSinistro);
			
			if (!(vecSini != null && vecSini.size() > 0)) {
				retorno.setCodigoRetorno(8);
				retorno.setMensagemRetorno("Número de Sinistro não encontrado: " + numeroSinistro);
				return retorno;
			} else {
				idPessCdPessoa = ((Vo) vecSini.get(0)).getFieldAsInteger("id_pess_cd_pessoa"); 
			}
			
			//Criar Atendimento Padrao
			AtendimentoPadraoHelper atpaHelper = new AtendimentoPadraoHelper();
			
			AtendimentoPadraoVo atpaVo = new AtendimentoPadraoVo();
			atpaVo.setIdAtpdCdAtendpadrao(codigoAtendimentoPadrao);
			atpaVo.setIdEmprCdEmpresa(idEmprCdEmpresa);
			atpaVo.setIdPessCdPessoa(idPessCdPessoa);
			atpaVo.setAtpaTxTexto(textoManifestacao);
			
			atpaVo = atpaHelper.createAtendimentoPadrao(atpaVo, 1);
			
			if (!"".equalsIgnoreCase(atpaVo.getAtpaMensagens())) {
				retorno.setCodigoRetorno(9);
				retorno.setMensagemRetorno("O atendimento não foi criado. Mensagem do problema : " + atpaVo.getAtpaMensagens());
				return retorno;
			} else {
				retorno.setCodigoChamado(atpaVo.getIdChamCdChamado());
				retorno.setCodigoManifestacao(atpaVo.getManiNrSequencia());
			}
			
		} catch (Exception e) {
			retorno.setCodigoRetorno(3);
			retorno.setMensagemRetorno("Ocorreu um erro. Descrição do erro: " + e.getMessage());
		}
	
		return retorno;
		
	}
	
}
