package br.com.plusoft.csi.bradescoaf.crm.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;

import br.com.bradseg.sare.avisoeletroportatil.canonico.v1.Aviso;
import br.com.bradseg.sare.servicos.apolice.webservice.EntradaObterDadosApoliceVO;
import br.com.bradseg.sare.servicos.apolice.webservice.ListaApoliceVO;
import br.com.plusoft.csi.adm.helper.AdministracaoCsCdtbResptabuladaRetaHelper;
import br.com.plusoft.csi.adm.helper.AdministracaoCsDmtbConfiguracaoConfHelper;
import br.com.plusoft.csi.adm.helper.SystemDataBancoHelper;
import br.com.plusoft.csi.adm.helper.generic.GenericHelper;
import br.com.plusoft.csi.adm.helper.generic.Numeradora;
import br.com.plusoft.csi.adm.helper.generic.SessionHelper;
import br.com.plusoft.csi.bradescoaf.constantes.ConfiguracaoEspec;
import br.com.plusoft.csi.bradescoaf.constantes.ConstantesEspec;
import br.com.plusoft.csi.bradescoaf.crm.vo.sinistro.AvisoSinistro;
import br.com.plusoft.csi.bradescoaf.crm.vo.sinistro.Causa;
import br.com.plusoft.csi.bradescoaf.crm.vo.sinistro.Cidade;
import br.com.plusoft.csi.bradescoaf.crm.vo.sinistro.Comunicado;
import br.com.plusoft.csi.bradescoaf.crm.vo.sinistro.DetalheBemSinistrado;
import br.com.plusoft.csi.bradescoaf.crm.vo.sinistro.Equipamento;
import br.com.plusoft.csi.bradescoaf.crm.vo.sinistro.Natureza;
import br.com.plusoft.csi.bradescoaf.crm.vo.sinistro.Outros;
import br.com.plusoft.csi.bradescoaf.crm.vo.sinistro.OutrosEnvolvido;
import br.com.plusoft.csi.bradescoaf.crm.vo.sinistro.QualCia;
import br.com.plusoft.csi.bradescoaf.crm.vo.sinistro.Responsavel;
import br.com.plusoft.csi.bradescoaf.crm.vo.sinistro.Sinistro;
import br.com.plusoft.csi.bradescoaf.crm.vo.sinistro.TipoRelacao;
import br.com.plusoft.csi.bradescoaf.crm.vo.sinistro.Uf;
import br.com.plusoft.csi.crm.helper.AtendimentoPadraoHelper;
import br.com.plusoft.csi.crm.util.SystemDate;
import br.com.plusoft.csi.crm.vo.AtendimentoPadraoVo;
import br.com.plusoft.fw.entity.Condition;
import br.com.plusoft.fw.entity.Vo;
import br.com.plusoft.fw.json.JSONArray;
import br.com.plusoft.fw.json.JSONException;
import br.com.plusoft.fw.json.JSONObject;
import br.com.plusoft.fw.log.Log;
import br.com.plusoft.fw.util.Datetime;

public class AberturaSinistroBusiness {

	long idEmprCdEmpresa;
	long idIdioCdIdioma;
	long idFuncCdFuncionario;
	
	public AberturaSinistroBusiness(long idEmprCdEmpresa,long idIdioCdIdioma,long idFuncCdFuncionario) {
		this.idEmprCdEmpresa = idEmprCdEmpresa;
		this.idIdioCdIdioma = idIdioCdIdioma;
		this.idFuncCdFuncionario = idFuncCdFuncionario;
	}
	
	public Vector<Vo> carregarComboTipoRelacaoIncluirSinistro(){
		
		Vector retorno = new Vector();
		
		try {
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando do banco carregarComboTipoRelacaoIncluirSinistro");
			
			String codigoTabelaTipoRelacao = (String) AdministracaoCsDmtbConfiguracaoConfHelper.findConfiguracao(
					ConfiguracaoEspec.CONF_BRADESCOAF_CODIGO_TABELA_TIPO_RELACAO, this.idEmprCdEmpresa);
			
			
			AdministracaoCsCdtbResptabuladaRetaHelper helper = new AdministracaoCsCdtbResptabuladaRetaHelper();
			
			retorno = helper.findAllRespAtivoByTabela(Long.parseLong(codigoTabelaTipoRelacao), this.idIdioCdIdioma, 0);
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando do banco carregarComboTipoRelacaoIncluirSinistro - Sucesso");
			
		} catch (Exception ex) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro no metodo - carregarComboTipoRelacaoIncluirSinistro" , ex);
		}
		
		return retorno;
	}
	
	public Vector<Vo> carregarComboCausaIncluirSinistro(String ramo){
		
		Vector<Vo> retorno = new Vector<Vo>();
		WebServiceListarCausaBusiness wsCausa;
		try {
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando do webservice carregarComboCausaIncluirSinistro");
			
			wsCausa = new WebServiceListarCausaBusiness(idEmprCdEmpresa);
			Vo voRetorno = wsCausa.getListarCausa(ramo);
			retorno.add(voRetorno);
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando webservice carregarComboCausaIncluirSinistro - Sucesso");
		} catch (Exception ex) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro no metodo - carregarComboCausaIncluirSinistro" , ex);
		}
		
		return retorno;
	}
	
	public Vector<Vo> carregarComboNaturezaIncluirSinistro(Short ramo,Integer causa){
		
		Vector<Vo> retorno = new Vector<Vo>();
		WebServiceListarNaturezaBusiness wsNatureza;
		try {
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando do webservice carregarComboNaturezaIncluirSinistro");
			
			wsNatureza = new WebServiceListarNaturezaBusiness(idEmprCdEmpresa);
			Vo voRetorno = wsNatureza.getListarNatureza(ramo, causa);
			retorno.add(voRetorno);
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando webservice carregarComboNaturezaIncluirSinistro - Sucesso");
		} catch (Exception ex) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro no metodo - carregarComboNaturezaIncluirSinistro" , ex);
		}
		
		return retorno;
	}
	
	
	
	public Vector<Vo> obterApolice(EntradaObterDadosApoliceVO entrada){
		
		Vector<Vo> retorno = new Vector<Vo>();
		WebServiceApoliceBusiness wsApolice;
		try {
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando do webservice obterApolice");
			
			wsApolice = new WebServiceApoliceBusiness(idEmprCdEmpresa);
			Vo voRetorno = wsApolice.getObterApolice(entrada);
			retorno.add(voRetorno);
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando webservice obterApolice - Sucesso");
		} catch (Exception ex) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro no metodo - obterApolice" , ex);
		}
		
		return retorno;
	}
	
	public EntradaObterDadosApoliceVO parseJsonToEntradaObterDadosApoliceVo(String json,String dataOcorrencia, String horaOcorrencia){
		
		EntradaObterDadosApoliceVO entrada = null;
		
		try {
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando parseJsonToEntradaObterDadosApoliceVo");
			
			ListaApoliceVO apolice = converterJsonApoliceParaVectorApolice(json);
			
			if (apolice != null) {
				entrada = new EntradaObterDadosApoliceVO();
				entrada.setCdMatricula("0");
			    entrada.setCodigoCia(apolice.getCodigoCia());
			    entrada.setCodigoEstipulante((long) 0);
			    entrada.setCodigoProduto((long) 0);
			    entrada.setCodigoRamo(apolice.getCodigoRamo());
			    entrada.setCodigoSucursal(apolice.getCodigoSucursal());
			    entrada.setCpfCnpjSegurado(apolice.getCpfCnpjSegurado());
			    
			    SystemDate dataSinistro = null; 
			    if (dataOcorrencia.length() > 0) {
			    	dataSinistro = new SystemDate(new Datetime(dataOcorrencia, "DD/MM/YYYY").toSqlDate());
			    }
			    
			    entrada.setDataSinistro(dataSinistro.toSqlDate().toString());
			    
			    entrada.setHoraSinistro(horaOcorrencia);
			    entrada.setNumeroApolice(apolice.getNumeroApolice());
			    entrada.setNumeroCertificado((long) 0);
			    entrada.setOrigemAvisoSinistro((int) 3);
			    entrada.setUnidadeProdutora((int) 0);
			}
		
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando parseJsonToEntradaObterDadosApoliceVo - Sucesso");
		} catch (Exception ex) {
			entrada = null;
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro no metodo - parseJsonToEntradaObterDadosApoliceVo" , ex);
		}
		
		return entrada;
	}
	
	public ListaApoliceVO converterJsonApoliceParaVectorApolice(String jsonApolice) throws JSONException {
			
		Log.log(this.getClass(), Log.INFOPLUS, "Carregando do webservice converterJsonApoliceParaVectorApolice");
		
		ListaApoliceVO apoliceNew = null;
		
		try {
			
			JSONObject apolice = new JSONObject(jsonApolice);	
			
			if (apolice.get("codigoSeguroAfinidade") != JSONObject.NULL) {
				if (apoliceNew == null) apoliceNew = new ListaApoliceVO();
				apoliceNew.setCodigoSeguroAfinidade(apolice.getLong("codigoSeguroAfinidade"));	
			}
			
			if (apolice.get("codigoRamo") != JSONObject.NULL) {
				if (apoliceNew == null) apoliceNew = new ListaApoliceVO();
				apoliceNew.setCodigoRamo(apolice.getInt("codigoRamo"));	
			}
			
			if (apolice.get("cpfCnpjSegurado") != JSONObject.NULL) {
				if (apoliceNew == null) apoliceNew = new ListaApoliceVO();
				apoliceNew.setCpfCnpjSegurado(apolice.getLong("cpfCnpjSegurado"));
			}
			
			if (apolice.get("dataFimVigencia") != JSONObject.NULL) {
				if (apoliceNew == null) apoliceNew = new ListaApoliceVO();
				apoliceNew.setDataFimVigencia(apolice.getString("dataFimVigencia"));
			}

			if (apolice.get("unidadeProdutora") != JSONObject.NULL) {
				if (apoliceNew == null) apoliceNew = new ListaApoliceVO();
				apoliceNew.setUnidadeProdutora(apolice.getInt("unidadeProdutora"));
			}

			if (apolice.get("descricaoMoeda") != JSONObject.NULL) {
				if (apoliceNew == null) apoliceNew = new ListaApoliceVO();
				apoliceNew.setDescricaoMoeda(apolice.getString("descricaoMoeda"));
			}
			
			if (apolice.get("numeroItem") != JSONObject.NULL) {
				if (apoliceNew == null) apoliceNew = new ListaApoliceVO();
				apoliceNew.setNumeroItem(apolice.getInt("numeroItem"));
			}
			
			if (apolice.get("codigoMoeda") != JSONObject.NULL) {
				if (apoliceNew == null) apoliceNew = new ListaApoliceVO();
				apoliceNew.setCodigoMoeda(apolice.getLong("codigoMoeda"));
			}
			
			if (apolice.get("codigoSucursal") != JSONObject.NULL) {
				if (apoliceNew == null) apoliceNew = new ListaApoliceVO();
				apoliceNew.setCodigoSucursal(apolice.getInt("codigoSucursal"));
			}

			if (apolice.get("nomeSegurado") != JSONObject.NULL) {
				if (apoliceNew == null) apoliceNew = new ListaApoliceVO();
				apoliceNew.setNomeSegurado(apolice.getString("nomeSegurado"));
			}
			
			if (apolice.get("nomeSucursal") != JSONObject.NULL) {
				if (apoliceNew == null) apoliceNew = new ListaApoliceVO();
				apoliceNew.setNomeSucursal(apolice.getString("nomeSucursal"));
			}
			
			if (apolice.get("tipoDocumento") != JSONObject.NULL) {
				if (apoliceNew == null) apoliceNew = new ListaApoliceVO();
				apoliceNew.setTipoDocumento(apolice.getInt("tipoDocumento"));
			}

			if (apolice.get("siglaMoeda") != JSONObject.NULL) {
				if (apoliceNew == null) apoliceNew = new ListaApoliceVO();
				apoliceNew.setSiglaMoeda(apolice.getString("siglaMoeda"));
			}
			
			if (apolice.get("codigoEstipulante") != JSONObject.NULL) {
				if (apoliceNew == null) apoliceNew = new ListaApoliceVO();
				apoliceNew.setCodigoEstipulante(apolice.getLong("codigoEstipulante"));
			}
			
			if (apolice.get("codigoProduto") != JSONObject.NULL) {
				if (apoliceNew == null) apoliceNew = new ListaApoliceVO();
				apoliceNew.setCodigoProduto(apolice.getLong("codigoProduto"));
			}
			
			if (apolice.get("descricaoRisco") != JSONObject.NULL) {
				if (apoliceNew == null) apoliceNew = new ListaApoliceVO();
				apoliceNew.setDescricaoRisco(apolice.getString("descricaoRisco"));
			}

			if (apolice.get("numeroEndosso") != JSONObject.NULL) {
				if (apoliceNew == null) apoliceNew = new ListaApoliceVO();
				apoliceNew.setNumeroEndosso(apolice.getLong("numeroEndosso"));
			}
			
			if (apolice.get("nomeEstipulante") != JSONObject.NULL) {
				if (apoliceNew == null) apoliceNew = new ListaApoliceVO();
				apoliceNew.setNomeEstipulante(apolice.getString("nomeEstipulante"));
			}

			if (apolice.get("descricaoProduto") != JSONObject.NULL) {
				if (apoliceNew == null) apoliceNew = new ListaApoliceVO();
				apoliceNew.setDescricaoProduto(apolice.getString("descricaoProduto"));
			}

			if (apolice.get("numeroCertificado") != JSONObject.NULL) {
				if (apoliceNew == null) apoliceNew = new ListaApoliceVO();
				apoliceNew.setNumeroCertificado(apolice.getLong("numeroCertificado"));
			}
			
			if (apolice.get("numeroApolice") != JSONObject.NULL) {
				if (apoliceNew == null) apoliceNew = new ListaApoliceVO();
				apoliceNew.setNumeroApolice(apolice.getLong("numeroApolice"));
			}
			
			if (apolice.get("dataInicioVigencia") != JSONObject.NULL) {
				if (apoliceNew == null) apoliceNew = new ListaApoliceVO();
				apoliceNew.setDataInicioVigencia(apolice.getString("dataInicioVigencia"));
			}
			
			if (apolice.get("codigoCorretor") != JSONObject.NULL) {
				if (apoliceNew == null) apoliceNew = new ListaApoliceVO();
				apoliceNew.setCodigoCorretor(apolice.getLong("codigoCorretor"));
			}
			
			if (apolice.get("codigoCia") != JSONObject.NULL) {
				if (apoliceNew == null) apoliceNew = new ListaApoliceVO();
				apoliceNew.setCodigoCia(apolice.getInt("codigoCia"));
			}
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando webservice converterJsonApoliceParaVectorApolice - Sucesso");
			
		} catch (Exception e) {
			apoliceNew = null;
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro no metodo - converterJsonApoliceParaVectorApolice" , e);
		}
		
		return apoliceNew;
	}
	
	public Vo carregarGrupoRamos(){
		
		Vo retorno = new Vo().addField("retorno", false).addField("mensagem", "Nenhum registro encontrado");
		
		Log.log(this.getClass(), Log.INFOPLUS, "Carregando do webservice carregarGrupoRamos");
		
		try {
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando do banco carregarGrupoRamos");
			
			String codigoTabelaGrupo1 = (String) AdministracaoCsDmtbConfiguracaoConfHelper.findConfiguracao(
					ConfiguracaoEspec.CONF_BRADESCOAF_CODIGO_TABELA_RAMOS_GRUPO_1, this.idEmprCdEmpresa);
			
			String codigoTabelaGrupo2 = (String) AdministracaoCsDmtbConfiguracaoConfHelper.findConfiguracao(
					ConfiguracaoEspec.CONF_BRADESCOAF_CODIGO_TABELA_RAMOS_GRUPO_2, this.idEmprCdEmpresa);
			
			String codigoTabelaGrupo3 = (String) AdministracaoCsDmtbConfiguracaoConfHelper.findConfiguracao(
					ConfiguracaoEspec.CONF_BRADESCOAF_CODIGO_TABELA_RAMOS_GRUPO_3, this.idEmprCdEmpresa);
			
			String codigoTabelaGrupo4 = (String) AdministracaoCsDmtbConfiguracaoConfHelper.findConfiguracao(
					ConfiguracaoEspec.CONF_BRADESCOAF_CODIGO_TABELA_RAMOS_GRUPO_4, this.idEmprCdEmpresa);
			
			String codigoTabelaProdutosHabilitam = (String) AdministracaoCsDmtbConfiguracaoConfHelper.findConfiguracao(
					ConfiguracaoEspec.CONF_BRADESCOAF_CODIGO_TABELA_PRODUTO_EQUIPAMENTO, this.idEmprCdEmpresa);
			
			String codigoTabelaClassificacao = (String) AdministracaoCsDmtbConfiguracaoConfHelper.findConfiguracao(
					ConfiguracaoEspec.CONF_BRADESCOAF_CODIGO_TABELA_CLASSIFICACAO, this.idEmprCdEmpresa);
			
			String codigoTabelaQualCia = (String) AdministracaoCsDmtbConfiguracaoConfHelper.findConfiguracao(
					ConfiguracaoEspec.CONF_BRADESCOAF_CODIGO_TABELA_QUAL_CIA, this.idEmprCdEmpresa);
			
			
			AdministracaoCsCdtbResptabuladaRetaHelper helper = new AdministracaoCsCdtbResptabuladaRetaHelper();
			
			Vector resp = helper.findAllRespAtivoByTabela(Long.parseLong(codigoTabelaGrupo1), this.idIdioCdIdioma, 0);
			if (resp != null && resp.size() > 0 ) {
				retorno.addField("grupo1", resp);
			} else {
				retorno.addField("grupo1", new Vo());
			}
			
			resp = helper.findAllRespAtivoByTabela(Long.parseLong(codigoTabelaGrupo2), this.idIdioCdIdioma, 0);
			if (resp != null && resp.size() > 0 ) {
				retorno.addField("grupo2", resp);
			} else {
				retorno.addField("grupo2", new Vo());
			}
			
			resp = helper.findAllRespAtivoByTabela(Long.parseLong(codigoTabelaGrupo3), this.idIdioCdIdioma, 0);
			if (resp != null && resp.size() > 0 ) {
				retorno.addField("grupo3", resp);
			} else {
				retorno.addField("grupo3", new Vo());
			}

			resp = helper.findAllRespAtivoByTabela(Long.parseLong(codigoTabelaGrupo4), this.idIdioCdIdioma, 0);
			if (resp != null && resp.size() > 0 ) {
				retorno.addField("grupo4", resp);
			} else {
				retorno.addField("grupo4", new Vo());
			}
			
			resp = helper.findAllRespAtivoByTabela(Long.parseLong(codigoTabelaProdutosHabilitam), this.idIdioCdIdioma, 0);
			if (resp != null && resp.size() > 0 ) {
				retorno.addField("produtoHabilitamEquipamento", resp);
			} else {
				retorno.addField("produtoHabilitamEquipamento", new Vo());
			}
			
			resp = helper.findAllRespAtivoByTabela(Long.parseLong(codigoTabelaClassificacao), this.idIdioCdIdioma, 0);
			if (resp != null && resp.size() > 0 ) {
				retorno.addField("classificacao", resp);
			} else {
				retorno.addField("classificacao", new Vo());
			}
			
			resp = helper.findAllRespAtivoByTabela(Long.parseLong(codigoTabelaQualCia), this.idIdioCdIdioma, 0);
			if (resp != null && resp.size() > 0 ) {
				retorno.addField("qualCia", resp);
			} else {
				retorno.addField("qualCia", new Vo());
			}
			
			retorno.addField("retorno", true).addField("mensagem", "");
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando do banco carregarGrupoRamos - Sucesso");
			
		} catch (Exception ex) {
			retorno.addField("mensagem", "Erro ao carregar as tabelas de resposta tabulada. Descrição: " + ex.getMessage());
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro no metodo - carregarGrupoRamos" , ex);
		}
		
		return retorno;
	}
	
	public Vector<Vo> carregarContaCorrente(String cpfCnpj){
		
		Vector<Vo> retorno = new Vector<Vo>();
		WebServiceListarContaCorrenteBusiness wsContaCorrente;
		try {
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando do webservice carregarContaCorrente");
			
			wsContaCorrente = new WebServiceListarContaCorrenteBusiness(idEmprCdEmpresa);
			Vo voRetorno = wsContaCorrente.getConsultarContaCorrentePorCPF(cpfCnpj);
			retorno.add(voRetorno);
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando webservice carregarContaCorrente - Sucesso");
		} catch (Exception ex) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro no metodo - carregarContaCorrente" , ex);
		}
		
		return retorno;
	}
	
	private String getJsonToString(JSONObject objObjeto, String nomeCampoJson) {
		try {
			if (objObjeto.get(nomeCampoJson) != JSONObject.NULL) {
				if ( String.valueOf(objObjeto.get(nomeCampoJson)).length() > 0 ) {
					return String.valueOf(objObjeto.get(nomeCampoJson));
				}
			}
		} catch (JSONException e) {
//			Log.log(this.getClass(), Log.ERRORPLUS, "Erro no metodo - getJsonToString" , e);
			return "";
		}
		
		return "";
	}
	
	private Long getJsonToInteger(JSONObject objObjeto, String nomeCampoJson) {
		try {
			if (objObjeto.get(nomeCampoJson) != JSONObject.NULL) {
				if ( String.valueOf(objObjeto.get(nomeCampoJson)).length() > 0 ) {
					return Long.parseLong(String.valueOf(objObjeto.get(nomeCampoJson)));
				}
			}
		} catch (JSONException e) {
//			Log.log(this.getClass(), Log.ERRORPLUS, "Erro no metodo - getJsonToInteger" , e);
			return new Long(0);
		}
		
		return new Long(0);
	}
	
	private Boolean getJsonCkeckBoxToString(JSONObject objObjeto, String nomeCampoJson) {
		try {
			if (objObjeto.get(nomeCampoJson) != JSONObject.NULL) {
				if ( String.valueOf(objObjeto.get(nomeCampoJson)).length() > 0 ) {
					return Boolean.parseBoolean(String.valueOf(objObjeto.get(nomeCampoJson)));
				}
			}
		} catch (JSONException e) {
//			Log.log(this.getClass(), Log.ERRORPLUS, "Erro no metodo - getJsonCkeckBoxToString" , e);
			return false;
		}
		
		return false;
	}
	
	private Vo getJsonComboToString(JSONObject objObjeto, String nomeCampoJson) {
		try {
			if (objObjeto.get(nomeCampoJson) != JSONObject.NULL) {
				JSONObject objetoJson = (JSONObject)objObjeto.get(nomeCampoJson); 
				
				Vo voAdd = null;
				
				if (objetoJson.get("id") != JSONObject.NULL) {
					if (voAdd == null) voAdd = new Vo();
					voAdd.addField("id", String.valueOf(objetoJson.get("id")));
				}
				
				if (objetoJson.get("value") != JSONObject.NULL) {
					if (voAdd == null) voAdd = new Vo();
					voAdd.addField("descricao", String.valueOf(objetoJson.get("value")));
				}
				
				if (voAdd != null) {
					return voAdd;
				} else {
					return null;
				}
				
			}
		} catch (JSONException e) {
//			Log.log(this.getClass(), Log.ERRORPLUS, "Erro no metodo - getJsonComboToString" , e);
			return null;
		}
		
		return null;
	}
	
	
	public AvisoSinistro parseJsonToEntradaAvisoSinistroVo(String json){
		
		AvisoSinistro entrada = new AvisoSinistro();
		
		try {
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando parseJsonToEntradaAvisoSinistroVo");
			
			JSONObject jsonSinistro = new JSONObject(json);
			
			//PARSE DE INFORMAÇÕES DE COMUNICADO
			parseComunicado(entrada, jsonSinistro);

			//PARSE DE INFORMAÇÕES DE SINISTRO
			parseSinistro(entrada, jsonSinistro);
			
			//PARSE DE INFORMAÇÕES DE EQUIPAMENTOS
			parseEquipamentos(entrada, jsonSinistro);
			
			//PARSE DE INFORMAÇÕES DE DETALHE DO BEM
			parseDetalheDoBem(entrada, jsonSinistro);
			
			//PARSE DE INFORMAÇÕES DE RESPONSAVEL
			parseResponsavel(entrada, jsonSinistro);
			
			//PARSE DE INFORMAÇÕES DE OUTROS ENVOLVIDOS
			parseOutrosEnvolvidos(entrada, jsonSinistro);
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando parseJsonToEntradaAvisoSinistroVo - Sucesso");
		} catch (Exception ex) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro no metodo - parseJsonToEntradaAvisoSinistroVo" , ex);
			entrada = null;
		}
		
		return entrada;
	}

	private void parseOutrosEnvolvidos(AvisoSinistro entrada,
			JSONObject jsonSinistro) throws JSONException {
		if (jsonSinistro.get("outrosEnvolvidos") != JSONObject.NULL) {
			List<OutrosEnvolvido> outrosNew = new ArrayList<OutrosEnvolvido>();
			JSONArray outros = (JSONArray) jsonSinistro.get("outrosEnvolvidos");
			for (int i = 0; i < outros.length(); i++) {
				JSONObject outro = (JSONObject)outros.get(i);
				OutrosEnvolvido outroNew = new OutrosEnvolvido();
				outroNew.setNome(getJsonToString(outro, "nome"));
				outroNew.setCpf(getJsonToString(outro, "cpf"));
				outrosNew.add(outroNew);
			}
			entrada.setOutrosEnvolvidos(outrosNew);;
		}
	}

	private void parseResponsavel(AvisoSinistro entrada, JSONObject jsonSinistro)
			throws JSONException {
		if (jsonSinistro.get("responsavel") != JSONObject.NULL) {
			
			Responsavel responsavelNew = new Responsavel();
			JSONObject responsavel = (JSONObject) jsonSinistro.get("responsavel"); 
			
			responsavelNew.setMesmoEnderecoApolice(getJsonCkeckBoxToString(responsavel, "mesmoEnderecoApolice"));
		    responsavelNew.setNomeResponsavel(getJsonToString(responsavel, "nomeResponsavel"));
		    
		    responsavelNew.setDddTelefone(getJsonToString(responsavel, "dddTelefone"));
		    responsavelNew.setNumeroTelefone(getJsonToString(responsavel, "numeroTelefone"));
		    responsavelNew.setEndereco(getJsonToString(responsavel, "endereco"));
		    responsavelNew.setNumeroEnderecoSegurado(getJsonToString(responsavel, "numeroEnderecoSegurado"));
		    responsavelNew.setDddCelular(getJsonToString(responsavel, "dddCelular"));
		    responsavelNew.setNumeroCelular(getJsonToString(responsavel, "numeroCelular"));
		    responsavelNew.setBairro(getJsonToString(responsavel, "bairro"));
		    responsavelNew.setCep(getJsonToString(responsavel, "cep"));
		    responsavelNew.setEmail(getJsonToString(responsavel, "email"));
		    
		    Vo voUf = getJsonComboToString(responsavel, "uf");
		    if (voUf != null) {
		    	Uf uf = new Uf(voUf.getFieldAsString("id"),voUf.getFieldAsString("descricao"));
		    	responsavelNew.setUf(uf);	
		    }

		    Vo voCidade = getJsonComboToString(responsavel, "cidade");
		    if (voCidade != null) {
		    	Cidade cidade = new Cidade(voCidade.getFieldAsString("id"),voCidade.getFieldAsString("descricao"));
		    	responsavelNew.setCidade(cidade);	
		    }
		    
		    responsavelNew.setReceberSms(getJsonCkeckBoxToString(responsavel, "receberSms"));
		    responsavelNew.setReceberEmail(getJsonCkeckBoxToString(responsavel, "receberEmail"));
		    responsavelNew.setProprioSegurado(getJsonCkeckBoxToString(responsavel, "proprioSegurado"));
		    
		    Vo voOutros = getJsonComboToString(responsavel, "outros");
		    if (voOutros != null) {
		    	Outros outros = new Outros(voOutros.getFieldAsString("id"),voOutros.getFieldAsString("descricao"));
		    	responsavelNew.setOutros(outros);	
		    }
		    
		    responsavelNew.setNomeBeneficiario(getJsonToString(responsavel, "nomeBeneficiario"));
		    responsavelNew.setCpfBeneficiario(getJsonToString(responsavel, "cpfBeneficiario"));
		    responsavelNew.setNaoTemContaBanco(getJsonCkeckBoxToString(responsavel, "naoTemContaBanco"));
		    responsavelNew.setCodBanco(getJsonToString(responsavel, "codBanco"));
		    responsavelNew.setDescricaoBanco(getJsonToString(responsavel, "descricaoBanco"));
		    responsavelNew.setAgencia(getJsonToString(responsavel, "agencia"));
		    responsavelNew.setAgenciaDv(getJsonToString(responsavel, "agenciaDv"));
		    responsavelNew.setConta(getJsonToString(responsavel, "conta"));
		    responsavelNew.setContaDv(getJsonToString(responsavel, "contaDv"));
		    responsavelNew.setExisteOutroSeguro(getJsonCkeckBoxToString(responsavel, "existeOutroSeguro"));

		    Vo voQualCia = getJsonComboToString(responsavel, "qualCia");
		    if (voQualCia != null) {
		    	QualCia qualCia = new QualCia(voQualCia.getFieldAsString("id"),voQualCia.getFieldAsString("descricao"));
		    	responsavelNew.setQualCia(qualCia);	
		    }
		    
		    entrada.setResponsavel(responsavelNew);
		}
	}

	private void parseDetalheDoBem(AvisoSinistro entrada,
			JSONObject jsonSinistro) throws JSONException {
		if (jsonSinistro.get("detalheBemSinistrado") != JSONObject.NULL) {
			List<DetalheBemSinistrado> detalhesNew = new ArrayList<DetalheBemSinistrado>();
			JSONArray detalhes = (JSONArray) jsonSinistro.get("detalheBemSinistrado");
			for (int i = 0; i < detalhes.length(); i++) {
				JSONObject detalhe = (JSONObject)detalhes.get(i);
				DetalheBemSinistrado detalheNew = new DetalheBemSinistrado();
				detalheNew.setDetClassificacao(getJsonToString(detalhe, "detClassificacao"));
				detalheNew.setDetClassificacaoDescricao(getJsonToString(detalhe, "detClassificacaoDescricao"));
				detalheNew.setQtde(getJsonToString(detalhe, "qtde"));
				detalheNew.setDetValor(getJsonToString(detalhe, "detValor"));
				detalheNew.setDetValorTotalDanos(getJsonToString(detalhe, "detValorTotalDanos"));
				detalheNew.setDescricao(getJsonToString(detalhe, "descricao"));
				detalhesNew.add(detalheNew);

			}
			entrada.setDetalheBemSinistrado(detalhesNew);
		}
	}

	private void parseEquipamentos(AvisoSinistro entrada,
			JSONObject jsonSinistro) throws JSONException {
		if (jsonSinistro.get("equipamentos") != JSONObject.NULL) {
			List<Equipamento> esquipamentosNew = new ArrayList<Equipamento>();
			JSONArray equipamentos = (JSONArray) jsonSinistro.get("equipamentos");
			for (int i = 0; i < equipamentos.length(); i++) {
				JSONObject equipamento = (JSONObject)equipamentos.get(i);
				Equipamento equipamentoNew = new Equipamento();
				equipamentoNew.setItem(getJsonToInteger(equipamento, "item"));
			    equipamentoNew.setDescricao(getJsonToString(equipamento, "descricao"));
			    equipamentoNew.setSerieEquipamento(getJsonToString(equipamento, "serieEquipamento"));
			    equipamentoNew.setMarca(getJsonToString(equipamento, "marca"));
			    equipamentoNew.setAnoFrabicacaoEquipamento(getJsonToInteger(equipamento, "anoFrabicacaoEquipamento"));
			    equipamentoNew.setModelo(getJsonToString(equipamento, "modelo"));
			    equipamentoNew.setQtde(getJsonToString(equipamento, "qtde"));
			    equipamentoNew.setValor(getJsonToString(equipamento, "valor"));
			    equipamentoNew.setValorEstimado(getJsonToString(equipamento, "valorEstimado"));
			    esquipamentosNew.add(equipamentoNew);
			}
			entrada.setEquipamentos(esquipamentosNew);;
		}
	}

	private void parseSinistro(AvisoSinistro entrada, JSONObject jsonSinistro)
			throws JSONException {
		if (jsonSinistro.get("sinistro") != JSONObject.NULL) {
			JSONObject sinistro = (JSONObject) jsonSinistro.get("sinistro");
			Sinistro sinistroNew = new Sinistro();
			sinistroNew.setEndNaoCorreto(getJsonCkeckBoxToString(sinistro, "endNaoCorreto"));
			
			Vo voCausa = getJsonComboToString(sinistro, "causa");
		    if (voCausa != null) {
		    	Causa  causa = new Causa(voCausa.getFieldAsString("id"),voCausa.getFieldAsString("descricao"));
		    	sinistroNew.setCausa(causa);	
		    }

		    sinistroNew.setData(getJsonToString(sinistro, "data"));
		    
		    Vo voNatureza = getJsonComboToString(sinistro, "natureza");
		    if (voNatureza != null) {
		    	Natureza natureza = new Natureza(voNatureza.getFieldAsString("id"),voNatureza.getFieldAsString("descricao"));
		    	sinistroNew.setNatureza(natureza);	
		    }
		    
		    sinistroNew.setHora(getJsonToString(sinistro, "hora"));
		    sinistroNew.setCep(getJsonToString(sinistro, "cep"));
		    sinistroNew.setEndereco(getJsonToString(sinistro, "endereco"));
		    sinistroNew.setNumero(getJsonToString(sinistro, "numero"));
		    sinistroNew.setComplemento(getJsonToString(sinistro, "complemento"));

		    Vo voUf = getJsonComboToString(sinistro, "uf");
		    if (voUf != null) {
		    	Uf uf = new Uf(voUf.getFieldAsString("id"),voUf.getFieldAsString("descricao"));
		    	sinistroNew.setUf(uf);	
		    }
		    
		    Vo voCidade = getJsonComboToString(sinistro, "cidade");
		    if (voCidade != null) {
		    	Cidade cidade = new Cidade(voCidade.getFieldAsString("id"),voCidade.getFieldAsString("descricao"));
		    	sinistroNew.setCidade(cidade);	
		    }
		    
			sinistroNew.setBairro(getJsonToString(sinistro, "bairro"));
		    sinistroNew.setDescricao(getJsonToString(sinistro, "descricao"));
		    sinistroNew.setHouveCorpoBombeiro(getJsonCkeckBoxToString(sinistro, "houveCorpoBombeiro"));
		    sinistroNew.setMoradiaHabitavel(getJsonCkeckBoxToString(sinistro, "moradiaHabitavel"));
		    sinistroNew.setProvidenciouBo(getJsonCkeckBoxToString(sinistro, "providenciouBo"));
		    entrada.setSinistro(sinistroNew);
		}
	}

	private void parseComunicado(AvisoSinistro entrada, JSONObject jsonSinistro)
			throws JSONException {
		if (jsonSinistro.get("comunicado") != JSONObject.NULL) {
			
			Comunicado comunicadoNew = new Comunicado();
			JSONObject comunicado = (JSONObject) jsonSinistro.get("comunicado"); 
			
			comunicadoNew.setContato(getJsonToString(comunicado, "contato"));
		    comunicadoNew.setDdd(getJsonToString(comunicado, "ddd"));
		    comunicadoNew.setTelefone(getJsonToString(comunicado, "telefone"));
		    
		    Vo voRelacao = getJsonComboToString(comunicado, "tipoRelacao");
		    if (voRelacao != null) {
		    	TipoRelacao tipoRelacao = new TipoRelacao(voRelacao.getFieldAsString("id"),voRelacao.getFieldAsString("descricao"));
		        comunicadoNew.setTipoRelacao(tipoRelacao);	
		    }
		    
		    comunicadoNew.setApolice(getJsonToString(comunicado, "apolice"));
		    comunicadoNew.setCodCorretor(getJsonToString(comunicado, "codCorretor"));
		    comunicadoNew.setNumAvisoSinistro(getJsonToString(comunicado, "numAvisoSinistro"));
		    comunicadoNew.setStatus(getJsonToString(comunicado, "status"));
		    comunicadoNew.setNomeCorretor(getJsonToString(comunicado, "nomeCorretor"));
		    comunicadoNew.setNomeSegurado(getJsonToString(comunicado, "nomeSegurado"));

		    comunicadoNew.setCodigoSucursal(getJsonToString(comunicado, "codigoSucursal"));
		    comunicadoNew.setCodigoCia(getJsonToString(comunicado, "codigoCia"));
		    comunicadoNew.setCodigoRamo(getJsonToString(comunicado, "codigoRamo"));
		    comunicadoNew.setCodigoApolice(getJsonToString(comunicado, "codigoApolice"));
		    
		    comunicadoNew.setCodigoProduto(getJsonToString(comunicado, "codigoProduto"));
		    comunicadoNew.setDescricaoProduto(getJsonToString(comunicado, "descricaoProduto"));
		    
		    comunicadoNew.setDataOcorrenciaIdentificacao(getJsonToString(comunicado, "dataOcorrenciaIdentificacao"));
		    comunicadoNew.setHoraOcorrenciaIdentificacao(getJsonToString(comunicado, "horaOcorrenciaIdentificacao"));
		    
		    entrada.setComunicado(comunicadoNew);
		}
	}
	
	public Vo gravarSinistroPlusoft(AvisoSinistro avisoSinistro,long idPessCdPessoa, String jsonEntrada,String numeroComunicado){
		
		GenericHelper gHelper = null;
		
		Vo voRetorno = null; 
		
		try {
			
			Log.log(this.getClass(), Log.INFOPLUS, "Iniciando gravarSinistroPlusoft");
			
			gHelper = new GenericHelper(this.idEmprCdEmpresa);
			
			gHelper.batchClear();
			
			Vo voSave = new Vo();
			
			long pesr_nr_sequencia = Numeradora.nextValue("ES_CDTB_PESSOASINISTRORE_PESR");
			
			voSave.addField("pesr_nr_sequencia", pesr_nr_sequencia);
			voSave.addField("id_pess_cd_pessoa", idPessCdPessoa);
			voSave.addField("pesr_ds_sucursal", avisoSinistro.getComunicado().getCodigoSucursal());
			voSave.addField("pesr_ds_ramo", avisoSinistro.getComunicado().getCodigoRamo());
			voSave.addField("pesr_ds_cia", avisoSinistro.getComunicado().getCodigoCia());
			voSave.addField("pesr_ds_apolice", avisoSinistro.getComunicado().getCodigoApolice());
			
			Datetime dataSinistro = null;
			
			if (!isNull(avisoSinistro.getSinistro())) {
			
				if ((!isNull(avisoSinistro.getSinistro().getData())) && avisoSinistro.getSinistro().getData().length() > 0) {
					dataSinistro = new Datetime(avisoSinistro.getSinistro().getData(), "DD/MM/YYYY");
				}
				voSave.addField("pesr_dh_sinistro", dataSinistro != null ? dataSinistro.toSqlDate() : null);	
				
				voSave.addField("pesr_ds_hora", getString(avisoSinistro.getSinistro().getHora(),200));
				
				if (!isNull(avisoSinistro.getSinistro().getNatureza())) {
					voSave.addField("pesr_ds_natureza", getString(avisoSinistro.getSinistro().getNatureza().getValue(),200));	
				}
			}
			
			if (!isNull(avisoSinistro.getComunicado())) {
				voSave.addField("pesr_ds_produto", getString(avisoSinistro.getComunicado().getDescricaoProduto(),200));	
			}
			
			voSave.addField("pesr_ds_status", "PENDENTE");
			voSave.addField("pesr_cd_comunicado", numeroComunicado);
			voSave.addField("pesr_tx_json", jsonEntrada);
			
			Vo voInclude = gHelper.batchIncludeCreate(ConstantesEspec.ENTITY_ES_CDTB_PESSOASINISTRORE_PESR, voSave);
			
			//Gravar campo para o PlusInfo
			gravarPlusInfo(avisoSinistro, pesr_nr_sequencia , idPessCdPessoa, gHelper);

			
			voRetorno = voInclude;
			
			Log.log(this.getClass(), Log.INFOPLUS, "Executado gravarSinistroPlusoft - Sucesso");
		} catch (Exception ex) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro no metodo - gravarSinistroPlusoft" , ex);
		}
		
		return voRetorno;
	}
	
	public boolean gravarPlusInfo(AvisoSinistro avisoSinistro, long pesr_nr_sequencia, long id_pess_cd_pessoa, GenericHelper gHelper) throws Exception {
		
		Log.log(this.getClass(), Log.INFOPLUS, "Iniciando gravarPlusInfo");
		
		try {
			Condition cond = new Condition();
			cond.addCondition("pesr_nr_sequencia", Condition.EQUAL, pesr_nr_sequencia);
			
			//Limpar tabelas
			gHelper.batchIncludeDelete(ConstantesEspec.ENTITY_ES_ASTB_COMUNICADOSPESR_COPE, cond);
			gHelper.batchIncludeDelete(ConstantesEspec.ENTITY_ES_ASTB_SINISTROPESR_SIPE, cond);
			gHelper.batchIncludeDelete(ConstantesEspec.ENTITY_ES_ASTB_EQUIPAMENTOPESR_EQPE, cond);
			gHelper.batchIncludeDelete(ConstantesEspec.ENTITY_ES_ASTB_DETALHEPESR_DEPE, cond);
			gHelper.batchIncludeDelete(ConstantesEspec.ENTITY_ES_ASTB_RESPONSAVELPESR_REPE, cond);
			gHelper.batchIncludeDelete(ConstantesEspec.ENTITY_ES_ASTB_OUTROSRESPPESR_OUPE, cond);
			
			if (avisoSinistro.getComunicado() != null) {
				Vo voComunicado = avisoSinistro.converterComunicadoToVo(pesr_nr_sequencia, id_pess_cd_pessoa);
				if (voComunicado != null) {
					gHelper.batchIncludeCreate(ConstantesEspec.ENTITY_ES_ASTB_COMUNICADOSPESR_COPE, voComunicado);
				}
			}
			
			if (avisoSinistro.getSinistro() != null) {
				Vo voSinistro = avisoSinistro.converterSinistroToVo(pesr_nr_sequencia, id_pess_cd_pessoa);
				if (voSinistro != null) {
					gHelper.batchIncludeCreate(ConstantesEspec.ENTITY_ES_ASTB_SINISTROPESR_SIPE, voSinistro);
				}
			}
			
			if (avisoSinistro.getEquipamentos() != null && avisoSinistro.getEquipamentos().size() > 0) {
				Vector<Vo> vecEquip = avisoSinistro.converterEquipamentoToVector(pesr_nr_sequencia, id_pess_cd_pessoa);
				if (vecEquip != null && vecEquip.size() > 0) {
					for (Vo voEquip : vecEquip) {
						gHelper.batchIncludeCreate(ConstantesEspec.ENTITY_ES_ASTB_EQUIPAMENTOPESR_EQPE, voEquip);	
					}
				}
			}
			
			if (avisoSinistro.getDetalheBemSinistrado() != null && avisoSinistro.getDetalheBemSinistrado().size() > 0) {
				Vector<Vo> vecDet = avisoSinistro.converterDetalheToVector(pesr_nr_sequencia, id_pess_cd_pessoa);
				if (vecDet != null && vecDet.size() > 0) {
					for (Vo voDet : vecDet) {
						gHelper.batchIncludeCreate(ConstantesEspec.ENTITY_ES_ASTB_DETALHEPESR_DEPE, voDet);	
					}
				}
			}
			
			if (avisoSinistro.getResponsavel() != null) {
				Vo voResp = avisoSinistro.converterResponsavelToVo(pesr_nr_sequencia, id_pess_cd_pessoa);
				if (voResp != null) {
					gHelper.batchIncludeCreate(ConstantesEspec.ENTITY_ES_ASTB_RESPONSAVELPESR_REPE, voResp);
				}
			}
			
			if (avisoSinistro.getOutrosEnvolvidos() != null && avisoSinistro.getOutrosEnvolvidos().size() > 0) {
				Vector<Vo> vecOut = avisoSinistro.converterOutrosEnvolvidosToVector(pesr_nr_sequencia, id_pess_cd_pessoa);
				if (vecOut != null && vecOut.size() > 0) {
					for (Vo voOut : vecOut) {
						gHelper.batchIncludeCreate(ConstantesEspec.ENTITY_ES_ASTB_OUTROSRESPPESR_OUPE, voOut);	
					}
				}
			}
			
			gHelper.batchExecute();
			
			Log.log(this.getClass(), Log.INFOPLUS, "Executado gravarPlusInfo - Sucesso");
			
			return true;
			
		} catch (Exception ex) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro no metodo - gravarPlusInfo" , ex);
			gHelper.batchClear();
			throw ex;
		}
	}
	
	public Vo atualizarSinistroPlusoft(AvisoSinistro avisoSinistro,long idPessCdPessoa, String jsonEntrada,String numeroComunicado,String pesrNrSequencia){
		
		GenericHelper gHelper = null;
		
		Vo voRetorno = null; 
		
		try {
			
			Log.log(this.getClass(), Log.INFOPLUS, "Iniciando atualizarSinistroPlusoft");
			
			gHelper = new GenericHelper(this.idEmprCdEmpresa);
			
			gHelper.batchClear();
			
			Vo voSave = new Vo();
			
			Datetime dataSinistro = null;
			
			if (!isNull(avisoSinistro.getSinistro())) {
			
				if ((!isNull(avisoSinistro.getSinistro().getData())) && avisoSinistro.getSinistro().getData().length() > 0) {
					dataSinistro = new Datetime(avisoSinistro.getSinistro().getData(), "DD/MM/YYYY");
				}
				voSave.addField("pesr_dh_sinistro", dataSinistro != null ? dataSinistro.toSqlDate() : null);	
				
				voSave.addField("pesr_ds_hora", getString(avisoSinistro.getSinistro().getHora(),200));
				
				if (!isNull(avisoSinistro.getSinistro().getNatureza())) {
					voSave.addField("pesr_ds_natureza", getString(avisoSinistro.getSinistro().getNatureza().getValue(),200));	
				}
			}
			
			if (!isNull(avisoSinistro.getComunicado())) {
				voSave.addField("pesr_ds_produto", getString(avisoSinistro.getComunicado().getDescricaoProduto(),200));	
			}
			
			voSave.addField("pesr_tx_json", jsonEntrada);
			
			Condition condUpdate = new Condition();
			condUpdate.addCondition("pesr_nr_sequencia", Condition.EQUAL, pesrNrSequencia);
			
			Vo update = gHelper.batchIncludeUpdate(ConstantesEspec.ENTITY_ES_CDTB_PESSOASINISTRORE_PESR, condUpdate, voSave);
			
			//Gravar campo para o PlusInfo
			gravarPlusInfo(avisoSinistro, Long.parseLong(pesrNrSequencia), idPessCdPessoa,gHelper);

			Vector vecPesr = gHelper.openQuery(ConstantesEspec.ENTITY_ES_CDTB_PESSOASINISTRORE_PESR, "select-by-condition", condUpdate);
			
			if (vecPesr != null && vecPesr.size() > 0) {
				voRetorno = (Vo) vecPesr.get(0);
			}
			
			Log.log(this.getClass(), Log.INFOPLUS, "Executado atualizarSinistroPlusoft - Sucesso");
		} catch (Exception ex) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro no metodo - atualizarSinistroPlusoft" , ex);
		}
		
		return voRetorno;
	}
	
	
	private boolean isNull(Object valor) {
    	
    	try {
    		if (valor == null ) {
        		return true;
        	} else {
        		if (String.valueOf(valor).trim().length() == 0) {
        			return true;
        		} else {
        			return false;
        		}
        	}	
		} catch (Exception e) {
			return true;
		}
    }
	
	private String getString(String valor, int tamanho) {
		if (valor != null) {
			if (valor.length() > tamanho) {
				valor = valor.substring(0, tamanho);
			}
		} else {
			valor = "";
		}

		return valor.trim();
	}
	
	public long atualizarSinistroPlusoftPlusoft(Vo voTabelaPlusoft, Vo retornoWs,AtendimentoPadraoVo atendVo){
		
		GenericHelper gHelper = null;
		
		long longUpdate = 0; 
		
		try {
			
			Log.log(this.getClass(), Log.INFOPLUS, "Iniciando atualizarSinistroPlusoftPlusoft");
			
			gHelper = new GenericHelper(this.idEmprCdEmpresa);
			
			Vo voSave = new Vo();
			
			Condition condUpdate = new Condition();
			condUpdate.addCondition("pesr_nr_sequencia", Condition.EQUAL, voTabelaPlusoft.getFieldAsString("pesr_nr_sequencia"));
			condUpdate.addCondition("id_pess_cd_pessoa", Condition.EQUAL, voTabelaPlusoft.getFieldAsString("id_pess_cd_pessoa"));
			
			voSave.addField("pesr_nr_sinistro", retornoWs.getFieldAsString("numerosinistro"));
			voSave.addField("codigo", retornoWs.getFieldAsString("codigo"));
			voSave.addField("codigosql", retornoWs.getFieldAsString("codigosql"));
			voSave.addField("mensagem", retornoWs.getFieldAsString("mensagem"));
			voSave.addField("mani_nr_sequencia", atendVo.getManiNrSequencia());
			voSave.addField("pesr_ds_status", "COMPLETO");
			
			longUpdate = gHelper.update(ConstantesEspec.ENTITY_ES_CDTB_PESSOASINISTRORE_PESR, "update-row", voSave, condUpdate );
			
			Log.log(this.getClass(), Log.INFOPLUS, "Executado atualizarSinistroPlusoftPlusoft - Sucesso");
		} catch (Exception ex) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro no metodo - atualizarSinistroPlusoftPlusoft" , ex);
		}
		
		return longUpdate;
	}
	
	public long removerSinistroPlusoftPlusoft(Vo voTabelaPlusoft){
		
		GenericHelper gHelper = null;
		
		long longRemover = 0; 
		
		try {
			
			Log.log(this.getClass(), Log.INFOPLUS, "Iniciando removerSinistroPlusoftPlusoft");
			
			gHelper = new GenericHelper(this.idEmprCdEmpresa);
			
			Vo voSave = new Vo();
			
			Condition condRemover = new Condition();
			condRemover.addCondition("pesr_nr_sequencia", Condition.EQUAL, voTabelaPlusoft.getFieldAsString("pesr_nr_sequencia"));
			condRemover.addCondition("id_pess_cd_pessoa", Condition.EQUAL, voTabelaPlusoft.getFieldAsString("id_pess_cd_pessoa"));
			
			longRemover = gHelper.remove(ConstantesEspec.ENTITY_ES_CDTB_PESSOASINISTRORE_PESR, "remove-row", condRemover );
			
			Log.log(this.getClass(), Log.INFOPLUS, "Executado removerSinistroPlusoftPlusoft - Sucesso");
		} catch (Exception ex) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro no metodo - removerSinistroPlusoftPlusoft" , ex);
		}
		
		return longRemover;
	}
	
	
	
	public Vo gravarSinistro(AvisoSinistro avisoSinistro, Long idPessCdPessoa, String jsonEntrada, String tipoGravacao,String tipoTela,String pesrNrSequencia){
		
		Vo voRetorno = new Vo().addField("retorno", false).addField("mensagem", "Não foi possível gravar");
		
		Log.log(this.getClass(), Log.INFOPLUS, "Iniciando gravarSinistro");
		
		try {
			
			//Chamada importante. Há diversas regras aqui.
			
			String numeroComunicado = gerarNumeroComunicado();
			Vo voGravar = null;
			
			if ("A".equalsIgnoreCase(tipoTela)) { //Abertura de Comunicado / Sinistro
				if ("".equals(pesrNrSequencia)) {
					voGravar = gravarSinistroPlusoft(avisoSinistro,idPessCdPessoa, jsonEntrada,numeroComunicado);
					pesrNrSequencia = voGravar.getFieldAsString("pesr_nr_sequencia");
				} else {
					voGravar = atualizarSinistroPlusoft(avisoSinistro, idPessCdPessoa, jsonEntrada, numeroComunicado, pesrNrSequencia);
				}
			} else if ("C".equalsIgnoreCase(tipoTela)) { // Consulta de Sinistro
				voGravar = atualizarSinistroPlusoft(avisoSinistro, idPessCdPessoa, jsonEntrada, numeroComunicado, pesrNrSequencia);
			}
			
			if (voGravar == null) {
				Log.log(this.getClass(), Log.INFOPLUS, "O comunicado não foi gravado porque não foi possível gravar o sinistro na base da Plusoft");
				voRetorno.addField("mensagem", "O comunicado não foi gravado porque não foi possível gravar o sinistro na base da Plusoft");
				return voRetorno;
			}
			
			//Modo de Gravação Completo. Deverá criar atendimento padrão e gravar no webservice
			if ("C".equalsIgnoreCase(tipoGravacao)) {

				WebServiceAvisoEletrodomesticoPortailBusiness wsAvisoBusiness = 
						new WebServiceAvisoEletrodomesticoPortailBusiness(this.idEmprCdEmpresa);
				
				Aviso avisoWs = avisoSinistro.toAvisoWs();
				avisoWs.setNumeroComunicado(Long.parseLong(numeroComunicado));
				
				voRetorno = wsAvisoBusiness.adicionarAviso(avisoWs);
				
				if ("true".equalsIgnoreCase(voRetorno.getFieldAsString("retorno"))) {
					
					Log.log(this.getClass(), Log.INFOPLUS, "Comunicado gravado no webservice Bradesco");
					
					String codigoAtendimentoPadraoSinistro = (String) AdministracaoCsDmtbConfiguracaoConfHelper.findConfiguracao(
							ConfiguracaoEspec.CONF_BRADESCOAF_COD_ATEND_PADRAO_AVISO_SINISTRO, this.idEmprCdEmpresa);
					
					AtendimentoPadraoHelper atpaHelper = new AtendimentoPadraoHelper();
					AtendimentoPadraoVo atendVo = new AtendimentoPadraoVo();
					atendVo.setIdAtpdCdAtendpadrao(Long.parseLong(codigoAtendimentoPadraoSinistro));
					atendVo.setIdPessCdPessoa(idPessCdPessoa);
					atendVo.setIdEmprCdEmpresa(this.idEmprCdEmpresa);
					
					atendVo.setAtpaTxTexto(getDescricaoManifestacao(avisoSinistro,numeroComunicado));
					atendVo = atpaHelper.createAtendimentoPadrao(atendVo, this.idIdioCdIdioma);
					
					//ATUALIZAR OS STATUS
					long retorno = atualizarSinistroPlusoftPlusoft(voGravar, voRetorno, atendVo);
					
					
					if (!"".equals(atendVo.getAtpaMensagens())) {
						voRetorno.addField("mensagem", voRetorno.getFieldAsString("mensagem") +  "\n Obs:O comunicado foi gravado com sucesso, porém, não foi possível gravar o atendimento padrão.");
						return voRetorno;
					}
					
					Log.log(this.getClass(), Log.INFOPLUS, "Atendimento Padrão Gravado");
					
				} else {
					//Removendo registro de sinistro da tabela de controla da Plusoft.
					
					
//					if ("A".equalsIgnoreCase(tipoTela)) { //Abertura de Comunicado / Sinistro
//						long qtdeRemover = removerSinistroPlusoftPlusoft(voGravar);
//					} 
					
					Log.log(this.getClass(), Log.INFOPLUS, "O comunicado não foi gravado. Mensagem: " + voRetorno.getFieldAsString("mensagem"));
				}
				Log.log(this.getClass(), Log.INFOPLUS, "Executado gravarSinistro - Sucesso Completo");
			} else {
				voRetorno = new Vo().addField("retorno", true).addField("mensagem", 
						  "Aviso gravado com pendência.\n"
						+ "Comunicado Número: " + numeroComunicado + "\n"
						+ "Status: Comunicado gravado com pendências.\n"
						+ "Para manutenção do Comunicado, acesse a aba Sinistro.");
				Log.log(this.getClass(), Log.INFOPLUS, "Executado gravarSinistro - Sucesso Pendente");
			}
			
			//Usado para quando gravar um novo registro na Plusoft e houver problema no webservice de inclusão,
			//ao tentar gravar novamente não duplicar a base adicionando um mesmo item.
			if (!"".equals(pesrNrSequencia)){
				voRetorno.addField("pesrNrSequencia", pesrNrSequencia);
			}
			
			
		} catch (Exception ex) {
			Log.log(this.getClass(), Log.ERRORPLUS, "O comunicado não foi gravado porque ocorreu erro ao tentar gravar o sinistro.\n Mensagem:" + ex.getMessage() , ex);
			voRetorno
				.addField("retorno", false)
				.addField("mensagem", "O comunicado não foi gravado porque ocorreu erro ao tentar gravar o sinistro.\n Mensagem:" + ex.getMessage());
		}
		
		return voRetorno;
	}

	private String getDescricaoManifestacao(AvisoSinistro avisoSinistro ,String numeroSinistro) {
		StringBuilder desc = new StringBuilder();
		
		Log.log(this.getClass(), Log.INFOPLUS, "Carregando do webservice getDescricaoManifestacao");
		
		try {
			String causa = "";
			String natureza = "";
			
			if (avisoSinistro.getSinistro() != null && avisoSinistro.getSinistro().getCausa() != null) {
				if (avisoSinistro.getSinistro().getCausa().getValue().length() > 0) {
					causa = avisoSinistro.getSinistro().getCausa().getValue();
				}
			}
			
			if (avisoSinistro.getSinistro() != null && avisoSinistro.getSinistro().getNatureza() != null) {
				if (avisoSinistro.getSinistro().getNatureza().getValue().length() > 0) {
					natureza = avisoSinistro.getSinistro().getNatureza().getValue();
				}
			}
			
			String chaveApolice = "";
			chaveApolice += avisoSinistro.getComunicado().getCodigoSucursal();
			chaveApolice += avisoSinistro.getComunicado().getCodigoCia();
			chaveApolice += avisoSinistro.getComunicado().getCodigoRamo();
			chaveApolice += avisoSinistro.getComunicado().getCodigoApolice();
			
			desc.append("Número do Sinistro: " + numeroSinistro);
			desc.append("\nCausa: " + causa);
			desc.append("\nNatureza: " + natureza);
			desc.append("\nChave da Apólice: " + chaveApolice);
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando webservice getDescricaoManifestacao - Sucesso");
			
		} catch (Exception e) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro no metodo - getDescricaoManifestacao" , e);
		}
		
		return desc.toString();
		
	}
	
	private void gerarSequencialComunicado() {
		GenericHelper gHelper;
		
		try {
			Log.log(this.getClass(), Log.INFOPLUS, "INICIO gerarSequencialComunicado");
			gHelper = new GenericHelper(this.idEmprCdEmpresa);
			
			SystemDate dataSinistro = new SystemDate(getDataSinistro());
			
			Vector vecRet = gHelper.openQuery(ConstantesEspec.ENTITY_ES_NGTB_NUMEROSINISTROASR_NSAS, "select-by-max-sequencial", new Condition());
			
			if (vecRet != null && vecRet.size() > 0) {
				
				Vo voInsert = new Vo();
				
				String sequencialBanco = ((Vo)vecRet.get(0)).getFieldAsString("nsas_nr_sequencial"); 
				if ("".equals(sequencialBanco)) {
					sequencialBanco = "0";
				}
				
				
				voInsert.addField("nsas_nr_sequencial", Integer.parseInt(sequencialBanco) + 1);
				voInsert.addField("nsas_dh_geradorsinistro", dataSinistro.toSqlDate());
				voInsert.addField("id_func_cd_funcionario", this.idFuncCdFuncionario);
				
				gHelper.create(ConstantesEspec.ENTITY_ES_NGTB_NUMEROSINISTROASR_NSAS, "create-row", voInsert);
			}
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando gerarSequencialComunicado - Sucesso");
		} catch (Exception ex) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro no metodo - gerarSequencialComunicado" , ex);
		}
	}
	
	private String gerarNumeroComunicado(){
		
		String retorno = "";
		GenericHelper gHelper;
		try {
		
			Log.log(this.getClass(), Log.INFOPLUS, "INICIO gerarNumeroComunicado");
			
			gHelper = new GenericHelper(this.idEmprCdEmpresa);

			gerarSequencialComunicado();
			
			Condition condBusca = new Condition();
			condBusca.addCondition("id_func_cd_funcionario", Condition.EQUAL, this.idFuncCdFuncionario);
			Vector vecSinistro = 
					gHelper.openQuery(ConstantesEspec.ENTITY_ES_NGTB_NUMEROSINISTROASR_NSAS, "select-by-ultimo-registro-funcionario", condBusca);
			
			//Gerando o Número do sinistro
			if (vecSinistro != null && vecSinistro.size() > 0) {
				Vo voSequencial = (Vo)vecSinistro.get(0);
				String sequencial = "000" + voSequencial.getFieldAsString("nsas_nr_sequencial"); 
				sequencial = sequencial.substring(sequencial.length() - 3);
				retorno = "110" + voSequencial.getFieldAsDate("nsas_dh_geradorsinistro").toString("YYYYMMDD") + sequencial;
				retorno += gerarDigitoVerificador(retorno);
			}
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando gerarNumeroComunicado - Sucesso");
			
		} catch (Exception ex) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro no metodo - gerarNumeroComunicado" , ex);
		}
		
		return retorno;
	}

	
		
	/**
	 * Função responsável por criar a data do sinistro. A data será gerada
	 * de acordo com o dia. E após o novo dia deverá recriar o sequencial
	 * Para isso existe a tabela ES_NGTB_NUMEROSINISTROASR_NSAS que é uma controladora
	 * que sempre pega o código do sequencial + 1 por funcionário.
	 * Quando o dia é alterado os registros dessa tabela são removidos iniciando os novos
	 * sequenciais. 
	 */
	private Date getDataSinistro() {
		//Verificar se a data é diferente do ultimo registro. 
		//Se for limpar a data e limpar os registros para criar novamente os sequenciais
		
		GenericHelper gHelper;
		Date retorno = null;
		Date retornoException = null;
		try {
			Log.log(this.getClass(), Log.INFOPLUS, "INICIO getDataSinistro");
			gHelper = new GenericHelper(this.idEmprCdEmpresa);
			
			retornoException = new SystemDataBancoHelper().getDataBanco();
			
			Vector vecData = gHelper.openQuery(ConstantesEspec.ENTITY_ES_NGTB_NUMEROSINISTROASR_NSAS, "select-by-ultimo-registro", new Condition());
			
			if (!(vecData != null && vecData.size() > 0)) {
				retorno = new SystemDataBancoHelper().getDataBanco();
			} else {
				
				Vo voReg = (Vo)vecData.get(0);
				
				if (voReg.getFieldAsString("nsas_dh_geradorsinistro").length() > 0) {
					if (voReg.getFieldAsDate("nsas_dh_geradorsinistro").toString("DD/MM/YYYY").equalsIgnoreCase(
							new SystemDataBancoHelper().getDataBanco("DD/MM/YYYY"))) {
						retorno = new SystemDataBancoHelper().getDataBanco();
					} else {
						//Se a data for diferente do ultimo registro, deverá limpar a tabela dos sequenciais
						//para iniciar os registros novamente para o próximo dia.
						Condition condRemove = new Condition();
						condRemove.addCondition("nsas_nr_sequencial", Condition.MORE_THAN, 0);
						long remove = gHelper.remove(ConstantesEspec.ENTITY_ES_NGTB_NUMEROSINISTROASR_NSAS, "delete-row", condRemove);
						retorno = new SystemDataBancoHelper().getDataBanco();
					}
				} else {
					Log.log(this.getClass(), Log.INFOPLUS, "Não há data de sinistro para o ultimo registro. Será gerada nova data");
				}
			}
			
		} catch (Exception ex) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro no metodo - getDataSinistro" , ex);
			retorno = retornoException;
		}
		
		return retorno;
	} 
	
	public Vector<Vo> carregarCepIncluirSinistro(String cep){
		
		Vector<Vo> retorno = new Vector<Vo>();
		WebServiceCepBusiness wsCep;
		try {
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando do webservice carregarCepIncluirSinistro");
			
			wsCep = new WebServiceCepBusiness(idEmprCdEmpresa);
			Vo voRetorno = wsCep.getLogradouroCompletoPorCep(cep);
			retorno.add(voRetorno);
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando webservice carregarCepIncluirSinistro - Sucesso");
		} catch (Exception ex) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro no metodo - carregarCepIncluirSinistro" , ex);
		}
		
		return retorno;
	}
	
	public boolean apoliceJaGravada(String id_pess_cd_pessoa, AvisoSinistro avisoSinistro){
		
		boolean retorno = false;
		GenericHelper gHelper = null;
		try {
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando apoliceJaGravada");
			
			gHelper = new GenericHelper(this.idEmprCdEmpresa);
			
			if (avisoSinistro != null) {
				Condition cond = new Condition();
				
				cond.addCondition("id_pess_cd_pessoa",Condition.EQUAL,id_pess_cd_pessoa);
				cond.addCondition("pesr_ds_sucursal",Condition.EQUAL,avisoSinistro.getComunicado().getCodigoSucursal());
				cond.addCondition("pesr_ds_ramo",Condition.EQUAL,avisoSinistro.getComunicado().getCodigoRamo());
				cond.addCondition("pesr_ds_cia",Condition.EQUAL,avisoSinistro.getComunicado().getCodigoCia());
				cond.addCondition("pesr_ds_apolice",Condition.EQUAL,avisoSinistro.getComunicado().getCodigoApolice());
				
				Datetime dataSinistro = new Datetime(avisoSinistro.getSinistro().getData(), "DD/MM/YYYY");
				cond.addCondition("pesr_dh_sinistro",Condition.EQUAL, dataSinistro.toSqlDate());
				cond.addCondition("pesr_ds_hora",Condition.EQUAL, avisoSinistro.getSinistro().getHora());
				
				cond.addCondition("pesr_ds_status",Condition.EQUAL, "COMPLETO");
			    
				Vector vecRetorno = gHelper.openQuery(ConstantesEspec.ENTITY_ES_CDTB_PESSOASINISTRORE_PESR, "select-by-condition", cond);
				if (vecRetorno != null && vecRetorno.size() > 0) {
					retorno = true;
				}
			}
		
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando apoliceJaGravada - Sucesso");
		} catch (Exception ex) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro no metodo - apoliceJaGravada" , ex);
		}
		
		return retorno;
	}
	
	public Vector<Vo> carregarSinistroPlusoft(String idPessCdPessoa){
		
		Vector<Vo> vecRetorno = new Vector<Vo>();
		
		GenericHelper gHelper = null;
		
		try {
			
			Log.log(this.getClass(), Log.INFOPLUS, "Iniciando carregarSinistroPlusoft");
			
			gHelper = new GenericHelper(this.idEmprCdEmpresa);
			
			Condition cond = new Condition();
			cond.addCondition("id_pess_cd_pessoa", Condition.EQUAL, idPessCdPessoa);
			
			vecRetorno = gHelper.openQuery(ConstantesEspec.ENTITY_ES_CDTB_PESSOASINISTRORE_PESR, "select-by-condition-order-by", cond );
			
			if (vecRetorno != null && vecRetorno.size() > 0) {
				for (Vo vo : vecRetorno) {
//					PESR_DH_SINISTRO, 
//					PESR_DS_HORA,
					if (!"".equals(vo.getFieldAsString("pesr_dh_sinistro")) && !"".equals(vo.getFieldAsString("pesr_ds_hora"))) {
						String gerarData = vo.getFieldAsDate("pesr_dh_sinistro").toString("DD/MM/YYYY") 
								+ " " + vo.getFieldAsString("pesr_ds_hora");
						vo.addField("dataSinistroCompleto", gerarData);
					} else if (!"".equals(vo.getFieldAsString("pesr_dh_sinistro"))) {
						String gerarData = vo.getFieldAsDate("pesr_dh_sinistro").toString("DD/MM/YYYY");								
						vo.addField("dataSinistroCompleto", gerarData);
					} else {
						vo.addField("dataSinistroCompleto", "");
					}
				}
			}
			
			Log.log(this.getClass(), Log.INFOPLUS, "Executado carregarSinistroPlusoft - Sucesso");
		} catch (Exception ex) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro no metodo - carregarSinistroPlusoft" , ex);
		}
		
		return vecRetorno;
	}
	

	public void excluirListaApoliceTemporaria(){
		
		GenericHelper gHelper = null;
		
		try {
			
			Log.log(this.getClass(), Log.INFOPLUS, "Iniciando excluirListaApoliceTemporaria");
			
			gHelper = new GenericHelper(this.idEmprCdEmpresa);
			
			Condition cond = new Condition();
			cond.addCondition("id_func_cd_funcionario", Condition.EQUAL, this.idFuncCdFuncionario);
			
			long retornoRemover = gHelper.remove(ConstantesEspec.ENTITY_ES_TMTB_LISTAAPOLICEASR_LTAA, "remove-row", cond );
			
			Log.log(this.getClass(), Log.INFOPLUS, "Executado excluirListaApoliceTemporaria - Sucesso");
		} catch (Exception ex) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro no metodo - excluirListaApoliceTemporaria" , ex);
		}
		
	}
	
	
	public Vector<Vo> carregarListaApoliceTemporaria(HttpServletRequest request){
		
		Vector<Vo> vecRetorno = new Vector<Vo>();
		
		GenericHelper gHelper = null;
		
		try {
			
			Log.log(this.getClass(), Log.INFOPLUS, "Iniciando carregarListaApoliceTemporaria");
			
			gHelper = new GenericHelper(this.idEmprCdEmpresa);
			
			Condition cond = new Condition();
			cond.addCondition("id_func_cd_funcionario", Condition.EQUAL, this.idFuncCdFuncionario);
			
			vecRetorno = gHelper.openQuery(ConstantesEspec.ENTITY_ES_TMTB_LISTAAPOLICEASR_LTAA, "select-by-condition", cond );
			
			try {
				boolean removerListaApolice = false;
				if (vecRetorno != null && vecRetorno.size() > 0) {
					for (Vo voRetorno : vecRetorno) {
						JSONObject json = new JSONObject(voRetorno.getFieldAsString("ltaa_tx_jsonapolices"));
						if (!json.get("validaSessao").equals(SessionHelper.getSessionId(request))) {
							removerListaApolice = true;
							break;
						}
					}
				}
				
				if (removerListaApolice == true) {
					vecRetorno = new Vector<Vo>();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			
			Log.log(this.getClass(), Log.INFOPLUS, "Executado carregarListaApoliceTemporaria - Sucesso");
		} catch (Exception ex) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro no metodo - carregarListaApoliceTemporaria" , ex);
		}
		
		return vecRetorno;
	}
	
	public static void main(String[] args) {
		AberturaSinistroBusiness t = new AberturaSinistroBusiness(1, 1, 1);
		t.gerarDigitoVerificador("11320170309008");
	}
	
	private int gerarDigitoVerificador(String numeroComunicado) {
		int retorno = 0 ;

		int posicao = 1;
		int fator = 15;
		int resultado = 0;

		while (fator > 1) {
			int digitoPosicao =  Integer.parseInt(numeroComunicado.substring(posicao-1,posicao));
			resultado += digitoPosicao * fator;
			posicao++;
			fator--;
		}

		int resto = resultado % 11;
		if (resto >= 2 && resto <= 10) {
			retorno = 11 - resto;
		} else {
			retorno = 0;
		}

		return retorno;
	}
	
}
