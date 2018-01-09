package br.com.plusoft.csi.bradescoaf.crm.business;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.xml.rpc.ServiceException;

import br.com.bradseg.afnd.afinidade.controller.services.AfndWebserviceRE;
import br.com.bradseg.afnd.afinidade.controller.services.AfndWebserviceRELocator;
import br.com.bradseg.afnd.afinidade.controller.services.AfndWebserviceREPortType;
import br.com.bradseg.afnd.afinidade.model.vo.CertificadosServiceOut;
import br.com.bradseg.afnd.afinidade.model.vo.DocumentoSeguroServiceVo;
import br.com.bradseg.afnd.afinidade.model.vo.FiltroServiceVo;
import br.com.plusoft.csi.adm.form.AdministracaoCsCdtbResptabuladaRetaForm;
import br.com.plusoft.csi.adm.helper.AdministracaoCsCdtbResptabuladaRetaHelper;
import br.com.plusoft.csi.adm.helper.Configuracoes;
import br.com.plusoft.csi.adm.helper.generic.GenericHelper;
import br.com.plusoft.csi.adm.vo.CsCdtbFuncionarioFuncVo;
import br.com.plusoft.csi.adm.vo.CsCdtbResptabuladaRetaVo;
import br.com.plusoft.csi.bradescoaf.constantes.ConfiguracaoEspec;
import br.com.plusoft.csi.bradescoaf.constantes.ConstantesEspec;
import br.com.plusoft.csi.crm.helper.AtendimentoPadraoHelper;
import br.com.plusoft.csi.crm.util.SystemDate;
import br.com.plusoft.csi.crm.vo.AtendimentoPadraoVo;
import br.com.plusoft.csi.crm.vo.CsNgtbManifestacaoManiVo;
import br.com.plusoft.fw.entity.Condition;
import br.com.plusoft.fw.entity.Vo;
import br.com.plusoft.fw.log.Log;

public class AfinidadeBusiness {
	
	private long idEmpresa;
	
	public AfinidadeBusiness(long idEmpresa){
		this.idEmpresa = idEmpresa;
	}
	
	AfndWebserviceRE service2 = null;
	AfndWebserviceREPortType soap = null;
	
	private AfndWebserviceREPortType getWebServicesReference(){
		
		try{
						
			if (service2 == null){
				
				AfndWebserviceRELocator locator = new AfndWebserviceRELocator();

				try {
					locator.setAfndWebserviceREHttpPortEndpointAddress(Configuracoes.obterConfiguracao(ConfiguracaoEspec.CONF_BRADESCOAF_URL_WS_AFINIDADE_RE, idEmpresa));
		    	} catch (Exception e) {
					Log.log(this.getClass(), Log.ERRORPLUS, e.getMessage(), e);
				}
				
				service2 = locator;
				
				soap = service2.getAfndWebserviceREHttpPort();
			}
			
		} catch (ServiceException e) {
			throw new RuntimeException(e);
			
		} catch (Exception e) {
			e.printStackTrace();
			Log.log(this.getClass(), Log.ERRORPLUS, "ERRO WebServicesHelper: " + e.toString());
			
		}finally{
			//service2 = null;
		}
		
		return soap;
	}
	
	/**
	 * find all certificados de acordo com os parametros informados..
	 */
	
	public Vector<Vo> findAllCertificados(String cpfCnpj, String codigoProduto, String dataInicioVigencia, String dataFimVigencia, String login) throws Exception{
		
		Vector<Vo> retorno = new Vector<Vo>();
		
		FiltroServiceVo fServiceVo = new FiltroServiceVo();
		
		cpfCnpj = cpfCnpj.replaceAll("\\.|-|/", "");
		
		if(cpfCnpj.length() > 11){
			fServiceVo.setTipoDocumento(new Integer(2));
		}else{
			fServiceVo.setTipoDocumento(new Integer(1));
		}
		
		
		if(codigoProduto != null && !codigoProduto.equals("") && Long.parseLong(codigoProduto) > 0){
			
			AdministracaoCsCdtbResptabuladaRetaForm retaForm = new AdministracaoCsCdtbResptabuladaRetaForm();
			retaForm.setIdRetaCdResptabulada( Long.parseLong(codigoProduto));
			retaForm.setIdEmpresa(idEmpresa);
			retaForm.setIdIdioma(1);
			
			AdministracaoCsCdtbResptabuladaRetaHelper retaHelper = new AdministracaoCsCdtbResptabuladaRetaHelper();
			CsCdtbResptabuladaRetaVo retaVo = retaHelper.findCsCdtbResptabuladaReta(retaForm);
			
			if(retaVo != null && retaVo.getRetaCdCorporativo() != null && !retaVo.getRetaCdCorporativo().equals("")){
				codigoProduto = retaVo.getRetaCdCorporativo();
			}

		}
		
		fServiceVo.setNumeroDocumento(cpfCnpj);
		fServiceVo.setCodigoProduto(new Integer(codigoProduto));
		fServiceVo.setDataInicioVigencia(dataInicioVigencia);
		fServiceVo.setDataFimVigencia(dataFimVigencia);
		
		CertificadosServiceOut sOut = getWebServicesReference().buscarEndossoCertificados(fServiceVo, login);
		
		if(sOut != null && sOut.getHouveErro().booleanValue()){
			
			AfinidadeException afdException = new AfinidadeException();
			afdException.setCodErro(sOut.getCodigoErro());
			afdException.setMsgErro(sOut.getMensagemErro());
			throw afdException;
			
		}else{
			DocumentoSeguroServiceVo[] docsVo = sOut.getDocumentosSeguroServiceVo();
			for(int i=0; i<docsVo.length; i++){
				Vo vo = new Vo();
				vo.addField("descricaoProduto", docsVo[i].getDescricaoProduto());
				vo.addField("nomeEstipulante", docsVo[i].getNomeEstipulante());
				vo.addField("codigoUnidadeProdutora", docsVo[i].getCodigoUnidadeProdutora());
				vo.addField("numeroCertificado", docsVo[i].getNumeroCertificado());
				vo.addField("dataInicioVigencia", docsVo[i].getDataInicioVigencia());
				vo.addField("nomeSegurado", docsVo[i].getNomeSegurado());
				vo.addField("situacaoCertificado", docsVo[i].getSituacaoCertificado());
				vo.addField("endossoDetalheUrl", docsVo[i].getEndossoDetalheUrl());
				vo.addField("codigoSituacaoCert", docsVo[i].getCodigoSituacaoCert());
				retorno.add(vo);
			}
		}
		
		return retorno;
		
		
	}
	
	public Vector<?> findCmbProduto() throws Exception{
		
		Vector retorno = null;
		
		String idTabelaProduto = Configuracoes.obterConfiguracao(ConfiguracaoEspec.CONF_BRADESCOAF_COD_TABELA_PRODUTO, idEmpresa);
		
		if(idTabelaProduto != null && !idTabelaProduto.equals("")){
			
			AdministracaoCsCdtbResptabuladaRetaHelper retaHelper = new AdministracaoCsCdtbResptabuladaRetaHelper();
			
			retorno = retaHelper.findAllRespByTabela(Long.parseLong(idTabelaProduto), 1);
		}
		
		return retorno;
		
	}
	
	private boolean isSituacaoEndossoCancelamento(String codSituacao){
		
		String endossoCancelamento = Configuracoes.obterConfiguracao(ConfiguracaoEspec.CONF_BRADESCOAF_COD_SITUACAO_ENDOSSO_CANCELAMENTO, idEmpresa);
		
		String[] arrEndossoCancelamento = endossoCancelamento.split(";");
		for(int i=0; i < arrEndossoCancelamento.length; i++){
			if(arrEndossoCancelamento[i].equals(codSituacao)){
				return true;	
			}
		}
		
		return false;
	}
	
	private boolean isSituacaoCancelamentoEndosso(String codSituacao){
		
		String cancelamentoEndosso = Configuracoes.obterConfiguracao(ConfiguracaoEspec.CONF_BRADESCOAF_COD_SITUACAO_CANCEL_ENDOSSO, idEmpresa);
		
		String[] arrCancelamentoEndosso = cancelamentoEndosso.split(";");
		for(int i=0; i < arrCancelamentoEndosso.length; i++){
			if(arrCancelamentoEndosso[i].equals(codSituacao)){
				return true;
			}
		}
		
		return false;
	}
	
	private String montaTextoAtendPadrao(String semRegistros, String codSituacaoAnterior, String codSituacaoAtual, String descricaoProduto, String nomeEstipulante, String codigoUnidadeProdutora, String numeroCertificado, String cpfCnpj, String idFuncCdFuncionario) throws Exception{
		
		StringBuffer sb = new StringBuffer();
		
		GenericHelper gHelper = new GenericHelper(idEmpresa);
		Condition cond = new Condition();
		cond.addCondition("id_func_cd_funcionario", Condition.EQUAL, idFuncCdFuncionario);
		Vector<Vo> v = gHelper.openQuery(ConstantesEspec.ENTITY_CS_CDTB_FUNCIONARIO_FUNC, "select-by-condition", cond);
		
		sb.append("Data: ").append( new SystemDate().toStringHoraMinuto()).append("\n");
		if(v != null && v.size() > 0){
			sb.append("Login: ").append(((Vo)v.get(0)).getFieldAsString("FUNC_NM_FUNCIONARIO")).append("\n");
		}
		sb.append("CPF / CNPJ: ").append(cpfCnpj).append("\n");
		
		if(semRegistros.equals("N")){
			sb.append("Produto: ").append(descricaoProduto).append("\n");
			sb.append("Estipulante: ").append(nomeEstipulante).append("\n");
			sb.append("Unidade Produtora: ").append(codigoUnidadeProdutora).append("\n");
			sb.append("Nº Ceritificado: ").append(numeroCertificado).append("\n");
			sb.append("Situação Anterior do Certificado: ").append(codSituacaoAnterior).append("\n"); 
			sb.append("Situação Atual do Certificado: ").append(codSituacaoAtual).append("\n");
		}
		
		return sb.toString();
		
	}
	
	public Vo getCodigoAtendimentoPadrao(String codSituacaoAnterior, String codSituacaoAtual, String atpdSemRegistros ){
		
		Vo voRetorno = new Vo();
		
		if(atpdSemRegistros.equals("S")){
			String cod = Configuracoes.obterConfiguracao(ConfiguracaoEspec.CONF_BRADESCOAF_ATD_PADRAO_SEM_REGISTROS, idEmpresa);
			voRetorno.addField("tipo", "Sem Registros");
			voRetorno.addField("cod_atend_padrao", cod);
		}else{
			if(isSituacaoEndossoCancelamento(codSituacaoAtual) && isSituacaoCancelamentoEndosso(codSituacaoAtual)){
				voRetorno.addField("tipo", "X");
				voRetorno.addField("cod_atend_padrao", "X");
			}else if(isSituacaoEndossoCancelamento(codSituacaoAtual)){
				String cod = Configuracoes.obterConfiguracao(ConfiguracaoEspec.CONF_BRADESCOAF_ATD_PADRAO_ENDOSSO_CANCELAMENTO, idEmpresa);
				voRetorno.addField("tipo", "Endosso de Cancelamento");
				voRetorno.addField("cod_atend_padrao", cod);
			}else if(isSituacaoCancelamentoEndosso(codSituacaoAtual)){
				String cod = Configuracoes.obterConfiguracao(ConfiguracaoEspec.CONF_BRADESCOAF_ATD_PADRAO_CANCEL_ENDOSSO, idEmpresa);
				voRetorno.addField("tipo", "Cancelamento de Endosso");
				voRetorno.addField("cod_atend_padrao", cod);
			}else{
				if(!codSituacaoAnterior.equals(codSituacaoAtual)){ 
					String cod = Configuracoes.obterConfiguracao(ConfiguracaoEspec.CONF_BRADESCOAF_ATD_PADRAO_ENDOSSO_ALTERACAO, idEmpresa);
					voRetorno.addField("tipo", "Endosso de Alteração");
					voRetorno.addField("cod_atend_padrao", cod);
				}else{
					String cod = Configuracoes.obterConfiguracao(ConfiguracaoEspec.CONF_BRADESCOAF_ATD_PADRAO_CONSULTA, idEmpresa);
					voRetorno.addField("tipo", "Consulta");
					voRetorno.addField("cod_atend_padrao", cod);
				}
			}
		}
		
		return voRetorno;
		
	}
	
	
	public CsNgtbManifestacaoManiVo gravarAtendPadrao(Vo voAtend, String semRegistros, String idChamCdChamado, String idPessCdPessoa,  String descSituacaoAnterior, String descSituacaoAtual, String descricaoProduto, String nomeEstipulante, String codigoUnidadeProdutora, String numeroCertificado, String cpfCnpj, String idFuncCdFuncionario, HttpServletRequest request) throws Exception {
		
		CsNgtbManifestacaoManiVo maniVo = null;
		
		if(!voAtend.getFieldAsString("cod_atend_padrao").equals("") && !voAtend.getFieldAsString("cod_atend_padrao").equals("X")){
			
			AtendimentoPadraoHelper atpaHelper = new AtendimentoPadraoHelper();
	
			long idCham = 0;
			if(!"".equals(idChamCdChamado) && !"Novo".equals(idChamCdChamado)){
				try{
					idCham = Long.parseLong(idChamCdChamado);
				}catch(Exception e){
					idCham = 0;
				}
			}
			
			GenericHelper gHelper = new GenericHelper(idEmpresa);
			String idPessContato = "";
			
			if(idCham > 0){
				Condition cond = new Condition();
				cond.addCondition("id_cham_cd_chamado", Condition.EQUAL, String.valueOf(idCham));
				Vector<Vo> v = gHelper.openQuery(ConstantesEspec.ENTITY_CS_NGTB_CHAMADO_CHAM, "select-by-condition", cond);
				if(v != null && v.size() > 0){
					idPessContato = ((Vo)v.get(0)).getFieldAsString("ID_PESS_CD_CONTATO");
				}
			}
			
			String texto = montaTextoAtendPadrao(semRegistros, descSituacaoAnterior, descSituacaoAtual, descricaoProduto, nomeEstipulante, codigoUnidadeProdutora, numeroCertificado, cpfCnpj, String.valueOf(idFuncCdFuncionario));
			
			AtendimentoPadraoVo vo = atpaHelper.createAtendimentoPadrao(Long.parseLong(voAtend.getFieldAsString("cod_atend_padrao")), idCham , Long.parseLong(idPessCdPessoa), request, null, texto, 1, 0);
			if(vo != null){
				if(vo.getIdChamCdChamado() > 0){
					maniVo = new CsNgtbManifestacaoManiVo(idEmpresa);
					maniVo.getCsNgtbChamadoChamVo().setIdChamCdChamado(vo.getIdChamCdChamado());
				}
			}
			
			if(idCham > 0 ){
				if(!"".equals(idPessContato) && !"0".equals(idPessContato)){
					Vo voUpd = new Vo();
					voUpd.addField("id_pess_cd_contato", idPessContato);
					Condition cond = new Condition();
					cond.addCondition("id_cham_cd_chamado", Condition.EQUAL, String.valueOf(idCham));
					gHelper.update(ConstantesEspec.ENTITY_CS_NGTB_CHAMADO_CHAM, "update-row", voUpd, cond);
				}
			}
		}
		
		return maniVo;
		
	}
	
	public Vector<Vo> montaVectorRetornoGravacaoAtendPadrao(Vo voAtpd, CsNgtbManifestacaoManiVo maniSinistroVo){
		
		Vector<Vo> result = new Vector<Vo>();
		
		if("X".equals(voAtpd.getFieldAsString("tipo"))){
			Vo vo = new Vo();
			vo.addField("sucesso", "N");
			vo.addField("mensagem", "O Código de Situação do Certificado está cadastrado como Endosso de Cancelamento e Cancelamento de Endosso e o Atendimento Padrão não foi gravado. \nA Manifestação deverá ser gravada manualmente.");
			vo.addField("id_cham", "");
			result.add(vo);
		}else{
			if(maniSinistroVo != null){
				if(maniSinistroVo.getCsNgtbChamadoChamVo().getIdChamCdChamado() > 0){
					Vo vo = new Vo();
					vo.addField("sucesso", "S");
					vo.addField("mensagem", "Atendimento Padrão de " + voAtpd.getFieldAsString("tipo") + " foi gravado com Sucesso!");
					vo.addField("id_cham", String.valueOf(maniSinistroVo.getCsNgtbChamadoChamVo().getIdChamCdChamado()));
					result.add(vo);
				}
			}else{
				if(voAtpd.getFieldAsString("cod_atend_padrao").equals("")){
					Vo vo = new Vo();
					vo.addField("sucesso", "N");
					vo.addField("mensagem", "A Manifestação de " + voAtpd.getFieldAsString("tipo") + " deverá ser gravada manualmente.");
					vo.addField("id_cham", "");
					result.add(vo);
				}
			}
		}
		
		return result;
		
	}
	
	public String getDataMenosUmAno(SystemDate sd){
		
		Calendar gc = GregorianCalendar.getInstance();
		
		gc.setTime(sd.toDate());
		
		gc.add(Calendar.YEAR, -1);
		
		return new SystemDate(gc.getTime()).toString();
		
	}

	public String tratarTipoDoc(String cpfCnpj){
		
		cpfCnpj = cpfCnpj.replaceAll("\\.|-|/", "");
		
		if(cpfCnpj.length() > 11){
			return "CNPJ";
		}else{
			return "CPF";
		}
		
	}
	
	public String getComplementoUrl(CsCdtbFuncionarioFuncVo funcVo){
		
		String complemento = Configuracoes.obterConfiguracao(ConfiguracaoEspec.CONF_BRADESCOAF_PARAMETRO_FORMATO_URL, idEmpresa);
		
		if(complemento.indexOf("#LOGIN#") > -1){
			complemento = complemento.replaceAll("#LOGIN#", funcVo.getFuncDsLoginname());
		}
		
		return complemento;
		
	}
	
	public String formatarCpfCnpj(String cpfCnpj){
		
		String ret = cpfCnpj.replaceAll("\\.|-|/", "");
		
		if(ret.length() == 11){
			return ret.substring(0, 3) + "." + ret.substring(3, 6) + "." + ret.substring(6, 9) + "-" + ret.substring(9, 11);
		}else if(ret.length() == 14){
			return ret.substring(0, 2) + "." + ret.substring(2, 5) + "." + ret.substring(5, 8) + "/" + ret.substring(8, 12) + "-" + ret.substring(12, 14);
		}
		
		return ret;
		
	}
	
	public Vector<Vo> getVectorErroBuscaCertificado(AfinidadeException e ){
		
		Vector<Vo> v = new Vector<Vo>();
		Vo vo = new Vo();
		vo.addField("coderro", e.getCodErro());
		vo.addField("msgerro", e.getMsgErro());
		v.add(vo);
		
		return v;
		
	}
	
	public Vector<Vo> getVectorValidaPeriodo(String dataInicial, String dataFinal ){
		
		Vector<Vo> result = new Vector<Vo>();
		
		if(!dataInicial.equals("") && dataFinal.equals("")){
			Vo vo = new Vo();
			vo.addField("campo", "data_final");
			vo.addField("data", new SystemDate().toString());
			result.add(vo);
		}
		
		if(dataInicial.equals("") && !dataFinal.equals("")){
			Vo vo = new Vo();
			vo.addField("campo", "data_inicial");
			Calendar gc = GregorianCalendar.getInstance();
			gc.setTime(new SystemDate(dataFinal).toDate());
			gc.add(Calendar.YEAR, -1);
			vo.addField("data", new SystemDate(gc.getTime()).toString());
			result.add(vo);
		}
		
		return result;
		
	}
	
}
