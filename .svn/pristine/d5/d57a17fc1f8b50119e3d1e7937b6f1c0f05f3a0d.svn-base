package br.com.plusoft.csi.bradescoaf.crm.action;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.DynaValidatorForm;

import br.com.bradseg.sare.servicos.apolice.webservice.EntradaObterDadosApoliceVO;
import br.com.bradseg.sare.servicos.apolice.webservice.ListaApoliceVO;
import br.com.plusoft.csi.adm.action.generic.AjaxPlusoftAction;
import br.com.plusoft.csi.adm.action.generic.GenericAction;
import br.com.plusoft.csi.adm.helper.generic.SessionHelper;
import br.com.plusoft.csi.bradescoaf.crm.business.AberturaSinistroBusiness;
import br.com.plusoft.csi.bradescoaf.crm.business.ValidaConfiguacaoBusiness;
import br.com.plusoft.csi.bradescoaf.crm.vo.sinistro.AvisoSinistro;
import br.com.plusoft.csi.espec.validate.vo.ValidaTela;
import br.com.plusoft.fw.entity.Vo;
import br.com.plusoft.fw.json.JSONSerializer;
import br.com.plusoft.fw.log.Log;
import br.com.plusoft.fw.webapp.AjaxPlusoftHelper;

public class AberturaSinistroAction extends GenericAction {
	
	public ActionForward abrirApolice(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		DynaValidatorForm dynaForm = (DynaValidatorForm) form;
		try {
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando abrirApolice");	
			
			long idEmprCdEmpresa = SessionHelper.getEmpresa(request).getIdEmprCdEmpresa();
			
			ValidaConfiguacaoBusiness validaBusinnes = new ValidaConfiguacaoBusiness(idEmprCdEmpresa);
			
			validaBusinnes.criarValidacao(dynaForm.getString("validarConfig"));
			if (validaBusinnes.getValidacao().abreTelaValidacao() == true) {
				dynaForm.set("validacao", JSONSerializer.writeJsonObject(validaBusinnes.getValidacao())); 
				return mapping.findForward("ifrmValidacao");
			}
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando abrirApolice - Sucesso");
			
		} catch (Exception e) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Carregando abrirApolice - Erro: " + e.getMessage(),e);
		}
		
		
		return mapping.findForward("ifrmApolice");
	}
	
	public ActionForward abrirIncluirSinistro(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		DynaValidatorForm dynaForm = (DynaValidatorForm) form;
		try {
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando abrirIncluirSinistro");	
			
			long idEmprCdEmpresa = SessionHelper.getEmpresa(request).getIdEmprCdEmpresa();
			
			ValidaConfiguacaoBusiness validaBusinnes = new ValidaConfiguacaoBusiness(idEmprCdEmpresa);
			
			validaBusinnes.criarValidacao(dynaForm.getString("validarConfig"));
			if (validaBusinnes.getValidacao().abreTelaValidacao() == true) {
				dynaForm.set("validacao", JSONSerializer.writeJsonObject(validaBusinnes.getValidacao())); 
				return mapping.findForward("ifrmValidacao");
			}
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando abrirIncluirSinistro - Sucesso");
			
		} catch (Exception e) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Carregando abrirIncluirSinistro - Erro: " + e.getMessage(),e);
		}
		
		return mapping.findForward("ifrmPopupAberturaSinistro");
	}
	
	public ActionForward abrirListaEnderecoSinistro(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		return mapping.findForward("ifrmPopupListaDeEndereco");
	}
	
	public ActionForward abrirListaEquipamentoSinistro(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		return mapping.findForward("ifrmPopupListaDeEquipamentos");
	}
	
	public ActionForward abrirListaContaCorrenteSinistro(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		return mapping.findForward("ifrmPopupContasDisponiveis");
	}
	
	public ActionForward abrirSinistro(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		DynaValidatorForm dynaForm = (DynaValidatorForm) form;
		try {
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando abrirSinistro");	
			
			long idEmprCdEmpresa = SessionHelper.getEmpresa(request).getIdEmprCdEmpresa();
			
			ValidaConfiguacaoBusiness validaBusinnes = new ValidaConfiguacaoBusiness(idEmprCdEmpresa);
			
			validaBusinnes.criarValidacao(dynaForm.getString("validarConfig"));
			if (validaBusinnes.getValidacao().abreTelaValidacao() == true) {
				dynaForm.set("validacao", JSONSerializer.writeJsonObject(validaBusinnes.getValidacao())); 
				return mapping.findForward("ifrmValidacao");
			}
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando abrirSinistro - Sucesso");
			
		} catch (Exception e) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Carregando abrirSinistro - Erro: " + e.getMessage(),e);
		}
		
		return mapping.findForward("ifrmConsultaSinistro");
	}
	
	public ActionForward carregarComboTipoRelacaoIncluirSinistro(ActionMapping mapping, ActionForm actionForm,HttpServletRequest request, HttpServletResponse response) throws Exception {

		Vector<Vo> retorno = new Vector<Vo>();
		AberturaSinistroBusiness businnes;
		
		try {
			 
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando combo carregarComboTipoRelacaoIncluirSinistro");
			
			long idEmprCdEmpresa = SessionHelper.getEmpresa(request).getIdEmprCdEmpresa();
			long idIdioCdIdioma = SessionHelper.getUsuarioLogado(request).getIdIdioCdIdioma();
			long idFuncCdFuncionario = SessionHelper.getUsuarioLogado(request).getIdFuncCdFuncionario();
			
//			long idEmprCdEmpresa = 200020;
//			long idIdioCdIdioma = 1;
//			long idFuncCdFuncionario = 1;
			
			businnes = new AberturaSinistroBusiness(idEmprCdEmpresa, idIdioCdIdioma, idFuncCdFuncionario);
			
			retorno = businnes.carregarComboTipoRelacaoIncluirSinistro();
			
			writeJson(retorno, response);
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando combo carregarComboTipoRelacaoIncluirSinistro - Sucesso");
			
		} catch (Exception e) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Carregando combo carregarComboTipoRelacaoIncluirSinistro - Erro: " + e.getMessage(),e);
			setException(e, request);
			if(response!=null) {
				Vo voRetorno = new Vo();
				retorno.add(voRetorno);
				AjaxPlusoftAction.writeToResponse(AjaxPlusoftAction.generateXml(retorno, request, null), response);
			};
		}
		return null;
	}
	
	public ActionForward carregarComboCausaIncluirSinistro(ActionMapping mapping, ActionForm actionForm,HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		DynaValidatorForm dynaForm = (DynaValidatorForm) actionForm;
		Vector<Vo> retorno = new Vector<Vo>();
		AberturaSinistroBusiness businnes;
		
		try {
			 
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando combo carregarComboCausaIncluirSinistro");
			
			long idEmprCdEmpresa = SessionHelper.getEmpresa(request).getIdEmprCdEmpresa();
			long idIdioCdIdioma = SessionHelper.getUsuarioLogado(request).getIdIdioCdIdioma();
			long idFuncCdFuncionario = SessionHelper.getUsuarioLogado(request).getIdFuncCdFuncionario();
			
//			long idEmprCdEmpresa = 200020;
//			long idIdioCdIdioma = 1;
//			long idFuncCdFuncionario = 1;
			
			String ramo = dynaForm.getString("ramo");
			
			businnes = new AberturaSinistroBusiness(idEmprCdEmpresa, idIdioCdIdioma, idFuncCdFuncionario);
			
			retorno = businnes.carregarComboCausaIncluirSinistro(ramo);
			
			writeJson(retorno, response);
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando combo carregarComboCausaIncluirSinistro - Sucesso");
			
		} catch (Exception e) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Carregando combo carregarComboCausaIncluirSinistro - Erro: " + e.getMessage(),e);
			setException(e, request);
			if(response!=null) {
				Vo voRetorno = new Vo();
				retorno.add(voRetorno);
				AjaxPlusoftAction.writeToResponse(AjaxPlusoftAction.generateXml(retorno, request, null), response);
			}
		}
		return null;
	}
	
	public ActionForward carregarComboNaturezaIncluirSinistro(ActionMapping mapping, ActionForm actionForm,HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		DynaValidatorForm dynaForm = (DynaValidatorForm) actionForm;
		Vector<Vo> retorno = new Vector<Vo>();
		AberturaSinistroBusiness businnes;
		
		try {
			 
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando combo carregarComboNaturezaIncluirSinistro");
			
			long idEmprCdEmpresa = SessionHelper.getEmpresa(request).getIdEmprCdEmpresa();
			long idIdioCdIdioma = SessionHelper.getUsuarioLogado(request).getIdIdioCdIdioma();
			long idFuncCdFuncionario = SessionHelper.getUsuarioLogado(request).getIdFuncCdFuncionario();
			
//			long idEmprCdEmpresa = 200020;
//			long idIdioCdIdioma = 1;
//			long idFuncCdFuncionario = 1;
			
			String ramo = dynaForm.getString("ramo");
			String causa = dynaForm.getString("causa");

			if ("".equals(ramo) || "".equals(causa)) {
				Vo voRetorno = new Vo();
				retorno.add(voRetorno);
			}else {
				businnes = new AberturaSinistroBusiness(idEmprCdEmpresa, idIdioCdIdioma, idFuncCdFuncionario);
				retorno = businnes.carregarComboNaturezaIncluirSinistro(Short.parseShort(ramo),Integer.parseInt(causa));	
			}
			
			writeJson(retorno, response);
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando combo carregarComboNaturezaIncluirSinistro - Sucesso");
			
		} catch (Exception e) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Carregando combo carregarComboNaturezaIncluirSinistro - Erro: " + e.getMessage(),e);
			setException(e, request);
			if(response!=null) {
				Vo voRetorno = new Vo();
				retorno.add(voRetorno);
				AjaxPlusoftAction.writeToResponse(AjaxPlusoftAction.generateXml(retorno, request, null), response);
			}
		}
		return null;
	}
	
	
	public ActionForward obterDadosApolice(ActionMapping mapping, ActionForm actionForm,HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		DynaValidatorForm dynaForm = (DynaValidatorForm) actionForm;
		Vector<Vo> retorno = new Vector<Vo>();
		AberturaSinistroBusiness businnes;
		
		try {
			 
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando obterDadosApolice");
			
			long idEmprCdEmpresa = SessionHelper.getEmpresa(request).getIdEmprCdEmpresa();
			long idIdioCdIdioma = SessionHelper.getUsuarioLogado(request).getIdIdioCdIdioma();
			long idFuncCdFuncionario = SessionHelper.getUsuarioLogado(request).getIdFuncCdFuncionario();
			
//			long idEmprCdEmpresa = 200020;
//			long idIdioCdIdioma = 1;
//			long idFuncCdFuncionario = 1;
			
			if (SessionHelper.isSessionValid(request) == false) {
				Vo voRetorno = new Vo();
				voRetorno
					.addField("retorno", false)
					.addField("mensagem", "Sessão finalizada.");
				retorno.add(voRetorno);
			} else {
				businnes = new AberturaSinistroBusiness(idEmprCdEmpresa, idIdioCdIdioma, idFuncCdFuncionario);
				String jsonEntrada = dynaForm.getString("jsonEntrada");
				String dataOcorrencia = dynaForm.getString("dataOcorrencia");
				String horaOcorrencia = dynaForm.getString("horaOcorrencia");
				
				EntradaObterDadosApoliceVO entrada = businnes.parseJsonToEntradaObterDadosApoliceVo(jsonEntrada,dataOcorrencia, horaOcorrencia);
				
				if (entrada == null) {
					Vo voRetorno = new Vo()
						.addField("retorno", false).
						addField("mensagem", "Não foi possível converter o objeto de apólice para lista de apólice");
					retorno.add(voRetorno);
				} else {
					retorno = businnes.obterApolice(entrada);	
				}
			}

			writeJson(retorno, response);
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando Carregando obterDadosApolice - Sucesso");
			
		} catch (Exception e) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Carregando Carregando obterDadosApolice - Erro: " + e.getMessage(),e);
			setException(e, request);
			if(response!=null) {
				Vo voRetorno = new Vo();
				retorno.add(voRetorno);
				AjaxPlusoftAction.writeToResponse(AjaxPlusoftAction.generateXml(retorno, request, null), response);
			};
		}
		return null;
	}
	
	
	public ActionForward carregarGrupoRamos(ActionMapping mapping, ActionForm actionForm,HttpServletRequest request, HttpServletResponse response) throws Exception {

		Vector<Vo> retorno = new Vector<Vo>();
		AberturaSinistroBusiness businnes;
		
		try {
			 
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando carregarGrupoRamos");
			
			long idEmprCdEmpresa = SessionHelper.getEmpresa(request).getIdEmprCdEmpresa();
			long idIdioCdIdioma = SessionHelper.getUsuarioLogado(request).getIdIdioCdIdioma();
			long idFuncCdFuncionario = SessionHelper.getUsuarioLogado(request).getIdFuncCdFuncionario();
			
//			long idEmprCdEmpresa = 200020;
//			long idIdioCdIdioma = 1;
//			long idFuncCdFuncionario = 1;
			
			businnes = new AberturaSinistroBusiness(idEmprCdEmpresa, idIdioCdIdioma, idFuncCdFuncionario);
			
			Vo retornoGrupo = businnes.carregarGrupoRamos();
			retorno.add(retornoGrupo);
			writeJson(retorno, response);
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando combo carregarGrupoRamos - Sucesso");
			
		} catch (Exception e) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Carregando combo carregarGrupoRamos - Erro: " + e.getMessage(),e);
			setException(e, request);
			if(response!=null) {
				Vo voRetorno = new Vo();
				retorno.add(voRetorno);
				AjaxPlusoftAction.writeToResponse(AjaxPlusoftAction.generateXml(retorno, request, null), response);
			};
		}
		return null;
	}
	
	public ActionForward carregarContaCorrente(ActionMapping mapping, ActionForm actionForm,HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		DynaValidatorForm dynaForm = (DynaValidatorForm) actionForm;
		Vector<Vo> retorno = new Vector<Vo>();
		AberturaSinistroBusiness businnes;
		
		try {
			 
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando carregarContaCorrente");
			
			long idEmprCdEmpresa = SessionHelper.getEmpresa(request).getIdEmprCdEmpresa();
			long idIdioCdIdioma = SessionHelper.getUsuarioLogado(request).getIdIdioCdIdioma();
			long idFuncCdFuncionario = SessionHelper.getUsuarioLogado(request).getIdFuncCdFuncionario();
			
//			long idEmprCdEmpresa = 200020;
//			long idIdioCdIdioma = 1;
//			long idFuncCdFuncionario = 1;
			
			businnes = new AberturaSinistroBusiness(idEmprCdEmpresa, idIdioCdIdioma, idFuncCdFuncionario);
			String pessDsCgccpf = dynaForm.getString("pessDsCgccpf");
//			pessDsCgccpf = "4751039717";
			
			retorno = businnes.carregarContaCorrente(pessDsCgccpf);
			
			writeJson(retorno, response);
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando Carregando carregarContaCorrente - Sucesso");
			
		} catch (Exception e) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Carregando Carregando carregarContaCorrente - Erro: " + e.getMessage(),e);
			setException(e, request);
			if(response!=null) {
				Vo voRetorno = new Vo();
				retorno.add(voRetorno);
				AjaxPlusoftAction.writeToResponse(AjaxPlusoftAction.generateXml(retorno, request, null), response);
			};
		}
		return null;
	}
	
	public ActionForward gravarSinistro(ActionMapping mapping, ActionForm actionForm,HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		DynaValidatorForm dynaForm = (DynaValidatorForm) actionForm;
		Vector<Vo> retorno = new Vector<Vo>();
		AberturaSinistroBusiness businnes;
		
		try {
			 
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando gravarSinistro");
			
			long idEmprCdEmpresa = SessionHelper.getEmpresa(request).getIdEmprCdEmpresa();
			long idIdioCdIdioma = SessionHelper.getUsuarioLogado(request).getIdIdioCdIdioma();
			long idFuncCdFuncionario = SessionHelper.getUsuarioLogado(request).getIdFuncCdFuncionario();
			
			if (SessionHelper.isSessionValid(request) == false) {
				Vo voRetorno = new Vo();
				voRetorno
					.addField("retorno", false)
					.addField("mensagem", "Sessão finalizada.");
				retorno.add(voRetorno);
			} else {
			
//				long idEmprCdEmpresa = 399; //salgado apagar
//				long idIdioCdIdioma = 1;
//				long idFuncCdFuncionario = 1;
				
				businnes = new AberturaSinistroBusiness(idEmprCdEmpresa, idIdioCdIdioma, idFuncCdFuncionario);
				
				String jsonEntrada = dynaForm.getString("jsonEntrada");
				String tipoGravacao = dynaForm.getString("tipoGravacao");   
				String idPessCdPessoa = dynaForm.getString("idPessCdPessoa");
				String tipoTela = dynaForm.getString("tipoTela");
				String pesrNrSequencia = dynaForm.getString("pesrNrSequencia");
	//			tipoGravacao = "P";
				
	//			jsonEntrada = "{\"comunicado\":{\"codigoSucursal\":1,\"codigoCia\":531,\"codigoRamo\":927,\"codigoApolice\":10446,\"codigoProduto\":null,\"descricaoProduto\":\"AUTO + RESIDENCIAL\",\"contato\":\"ANDERSON SALGADO\",\"ddd\":\"11\",\"telefone\":\"50912777\",\"tipoRelacao\":{\"id\":\"30072\",\"value\":\"FILHO\"},\"apolice\":\"10446\",\"codCorretor\":\"827311\",\"numAvisoSinistro\":\"\",\"status\":\"\",\"nomeCorretor\":\"NOVO ELLO CONSULT E CORRET DE SE\",\"nomeSegurado\":\"SERGIO FONTOURA\"},\"sinistro\":{\"endNaoCorreto\":true,\"causa\":{\"id\":\"11\",\"value\":\"AMEACA DE DESMORONAMENTO\"},\"data\":\"13/02/2017\",\"natureza\":{\"id\":\"18\",\"value\":\"DANOS MATERIAIS\"},\"hora\":\"18:18\",\"cep\":\"04560-011\",\"endereco\":\"R NEBRASKA\",\"numero\":\"443\",\"complemento\":\"6º ANDAR\",\"uf\":{\"id\":\"SP\",\"value\":\"SP\"},\"cidade\":{\"id\":\"SAO PAULO\",\"value\":\"SAO PAULO\"},\"bairro\":\"BROOKLIN NOVO\",\"descricao\":\"DESCRIÇÃO DO SINISTRO.\",\"houveCorpoBombeiro\":false,\"moradiaHabitavel\":false,\"providenciouBo\":false},\"equipamentos\":[{\"item\":\"1\",\"descricao\":\"Monitor\",\"serieEquipamento\":\"br114125\",\"marca\":\"lg\",\"anoFrabicacaoEquipamento\":\"2016\",\"modelo\":\"19'' ultra wide\",\"qtde\":\"1\",\"valorEstimado\":\"1.350,00\",\"valor\":\"1.350,00\"}],\"detalheBemSinistrado\":[{\"detClassificacao\":\"1\",\"detClassificacaoDescricao\":\"CLASSIFICAÇÃO 1\",\"qtde\":\"1\",\"detValor\":\"1.350,00\",\"detValorTotalDanos\":\"1.350,00\",\"descricao\":\"descrição do bem sinistrado do monitor.\"}],\"responsavel\":{\"mesmoEnderecoApolice\":true,\"nomeResponsavel\":\"SERGIO FONTOURA\",\"endereco\":\"RUA BENTO LISBOA\",\"dddTelefone\":\"21\",\"numeroTelefone\":\"24556060\",\"bairro\":\"CATETE\",\"dddCelular\":\"21\",\"numeroCelular\":\"24556060\",\"cep\":\"22221-010\",\"email\":\"SERGIOFONTURA@GMAIL.COM\",\"uf\":{\"id\":\"RJ\",\"value\":\"RJ\"},\"cidade\":{\"id\":\"RIO DE JANEIRO\",\"value\":\"RIO DE JANEIRO\"},\"receberSms\":true,\"receberEmail\":true,\"proprioSegurado\":true,\"nomeBeneficiario\":\"SERGIO FONTOURA\",\"cpfBeneficiario\":\"4751039717\",\"naoTemContaBanco\":false,\"codBanco\":\"237\",\"descricaoBanco\":\"BANCO BRADESCO S.A.\",\"agencia\":\"27316\",\"conta\":\"33701\",\"contaDv\":\"3\",\"existeOutroSeguro\":false},\"outrosEnvolvidos\":[{\"nome\":\"pedro maria\",\"cpf\":\"191.278.803-97\"}],\"apolice\":{\"codigoSeguroAfinidade\":null,\"codigoRamo\":927,\"dataFimVigencia\":\"06/01/2015\",\"cpfCnpjSegurado\":4751039717,\"unidadeProdutora\":null,\"descricaoMoeda\":\"REAL\",\"numeroItem\":1,\"codigoMoeda\":1,\"codigoSucursal\":1,\"nomeSegurado\":\"SERGIO FONTOURA\",\"nomeSucursal\":null,\"tipoDocumento\":null,\"siglaMoeda\":\"R$\",\"codigoEstipulante\":null,\"codigoProduto\":null,\"descricaoRisco\":null,\"numeroEndosso\":null,\"nomeEstipulante\":null,\"typeDesc\":{},\"descricaoProduto\":\"AUTO + RESIDENCIAL\",\"numeroApolice\":10446,\"numeroCertificado\":null,\"dataInicioVigencia\":\"06/01/2014\",\"codigoCorretor\":827311,\"codigoCia\":531,\"anyDesc\":{},\"propertyDescriptors\":{},\"fields\":{}}}"; 
				
				AvisoSinistro avisoSinistro = businnes.parseJsonToEntradaAvisoSinistroVo(jsonEntrada);
				
				if (avisoSinistro == null) {
					Vo voRetorno = new Vo();
					voRetorno
						.addField("retorno", false)
						.addField("mensagem", "Não foi possível converter o objeto de Aviso de Sinistro");
					retorno.add(voRetorno);
				} else {
					if (businnes.apoliceJaGravada(idPessCdPessoa, avisoSinistro)) {
						Vo voRetorno = new Vo();
						voRetorno
							.addField("retorno", false)
							.addField("mensagem", "Existe Comunicado de Sinistro completo já cadastrado na mesma data de ocorrência informada");
						retorno.add(voRetorno);	
						
					} else {
						Vo voRetorno = businnes.gravarSinistro(avisoSinistro, Long.parseLong(idPessCdPessoa), jsonEntrada, tipoGravacao,tipoTela,pesrNrSequencia);
						retorno.add(voRetorno);	
					}	
				}
			}
			
			writeJson(retorno, response);
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando Carregando gravarSinistro - Sucesso");
			
		} catch (Exception e) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Carregando Carregando gravarSinistro - Erro: " + e.getMessage(),e);
			setException(e, request);
			if(response!=null) {
				Vo voRetorno = new Vo();
				retorno.add(voRetorno);
				AjaxPlusoftAction.writeToResponse(AjaxPlusoftAction.generateXml(retorno, request, null), response);
			};
		}
		return null;
	}
	
	public ActionForward carregarCepSinistro(ActionMapping mapping, ActionForm actionForm,HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		DynaValidatorForm dynaForm = (DynaValidatorForm) actionForm;
		Vector<Vo> retorno = new Vector<Vo>();
		AberturaSinistroBusiness businnes;
		
		try {
			 
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando combo carregarCepSinistro");
			
			long idEmprCdEmpresa = SessionHelper.getEmpresa(request).getIdEmprCdEmpresa();
			long idIdioCdIdioma = SessionHelper.getUsuarioLogado(request).getIdIdioCdIdioma();
			long idFuncCdFuncionario = SessionHelper.getUsuarioLogado(request).getIdFuncCdFuncionario();
			
//			long idEmprCdEmpresa = 200020;
//			long idIdioCdIdioma = 1;
//			long idFuncCdFuncionario = 1;
			
			String cep = dynaForm.getString("cep");
			
			businnes = new AberturaSinistroBusiness(idEmprCdEmpresa, idIdioCdIdioma, idFuncCdFuncionario);
			
			retorno = businnes.carregarCepIncluirSinistro(cep);
			
			writeJson(retorno, response);
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando combo carregarCepSinistro - Sucesso");
			
		} catch (Exception e) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Carregando combo carregarCepSinistro - Erro: " + e.getMessage(),e);
			setException(e, request);
			if(response!=null) {
				Vo voRetorno = new Vo();
				retorno.add(voRetorno);
				AjaxPlusoftAction.writeToResponse(AjaxPlusoftAction.generateXml(retorno, request, null), response);
			}
		}
		return null;
	}
	
	
	public ActionForward carregarSinistros(ActionMapping mapping, ActionForm actionForm,HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		DynaValidatorForm dynaForm = (DynaValidatorForm) actionForm;
		Vector<Vo> retorno = new Vector<Vo>();
		AberturaSinistroBusiness businnes;
		
		try {
			 
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando carregarSinistros");
			
			long idEmprCdEmpresa = SessionHelper.getEmpresa(request).getIdEmprCdEmpresa();
			long idIdioCdIdioma = SessionHelper.getUsuarioLogado(request).getIdIdioCdIdioma();
			long idFuncCdFuncionario = SessionHelper.getUsuarioLogado(request).getIdFuncCdFuncionario();
			
//			long idEmprCdEmpresa = 200020;
//			long idIdioCdIdioma = 1;
//			long idFuncCdFuncionario = 1;
			
			businnes = new AberturaSinistroBusiness(idEmprCdEmpresa, idIdioCdIdioma, idFuncCdFuncionario);
			
			String idPessCdPessoa = dynaForm.getString("idPessCdPessoa");
			
			retorno = businnes.carregarSinistroPlusoft(idPessCdPessoa);
			
			writeJson(retorno, response);
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando Carregando carregarSinistros - Sucesso");
			
		} catch (Exception e) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Carregando Carregando carregarSinistros - Erro: " + e.getMessage(),e);
			setException(e, request);
			if(response!=null) {
				Vo voRetorno = new Vo();
				retorno.add(voRetorno);
				AjaxPlusoftAction.writeToResponse(AjaxPlusoftAction.generateXml(retorno, request, null), response);
			};
		}
		return null;
	}
	
	public ActionForward excluirListaApoliceTemporaria(ActionMapping mapping, ActionForm actionForm,HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		DynaValidatorForm dynaForm = (DynaValidatorForm) actionForm;
		Vector<Vo> retorno = new Vector<Vo>();
		AberturaSinistroBusiness businnes;
		
		try {
			 
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando excluirListaApoliceTemporaria");
			
			long idEmprCdEmpresa = SessionHelper.getEmpresa(request).getIdEmprCdEmpresa();
			long idIdioCdIdioma = SessionHelper.getUsuarioLogado(request).getIdIdioCdIdioma();
			long idFuncCdFuncionario = SessionHelper.getUsuarioLogado(request).getIdFuncCdFuncionario();
			
//			long idEmprCdEmpresa = 200020;
//			long idIdioCdIdioma = 1;
//			long idFuncCdFuncionario = 1;
			
			businnes = new AberturaSinistroBusiness(idEmprCdEmpresa, idIdioCdIdioma, idFuncCdFuncionario);
			businnes.excluirListaApoliceTemporaria();
			
			writeJson(retorno, response);
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando Carregando excluirListaApoliceTemporaria - Sucesso");
			
		} catch (Exception e) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Carregando Carregando excluirListaApoliceTemporaria - Erro: " + e.getMessage(),e);
			setException(e, request);
			if(response!=null) {
				Vo voRetorno = new Vo();
				retorno.add(voRetorno);
				AjaxPlusoftAction.writeToResponse(AjaxPlusoftAction.generateXml(retorno, request, null), response);
			};
		}
		return null;
	}
	
	
	public ActionForward carregarListaApoliceTemporaria(ActionMapping mapping, ActionForm actionForm,HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		DynaValidatorForm dynaForm = (DynaValidatorForm) actionForm;
		Vector<Vo> retorno = new Vector<Vo>();
		AberturaSinistroBusiness businnes;
		
		try {
			 
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando carregarListaApoliceTemporaria");
			
			long idEmprCdEmpresa = SessionHelper.getEmpresa(request).getIdEmprCdEmpresa();
			long idIdioCdIdioma = SessionHelper.getUsuarioLogado(request).getIdIdioCdIdioma();
			long idFuncCdFuncionario = SessionHelper.getUsuarioLogado(request).getIdFuncCdFuncionario();
			
//			long idEmprCdEmpresa = 200020;
//			long idIdioCdIdioma = 1;
//			long idFuncCdFuncionario = 1;
			
			businnes = new AberturaSinistroBusiness(idEmprCdEmpresa, idIdioCdIdioma, idFuncCdFuncionario);
			
			retorno = businnes.carregarListaApoliceTemporaria(request);
			
			writeJson(retorno, response);
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando Carregando carregarListaApoliceTemporaria - Sucesso");
			
		} catch (Exception e) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Carregando Carregando carregarListaApoliceTemporaria - Erro: " + e.getMessage(),e);
			setException(e, request);
			if(response!=null) {
				Vo voRetorno = new Vo();
				retorno.add(voRetorno);
				AjaxPlusoftAction.writeToResponse(AjaxPlusoftAction.generateXml(retorno, request, null), response);
			};
		}
		return null;
	}
	
	public void writeJson(Vector<Vo> v, HttpServletResponse response) throws IOException{
		
		String json = "{}";
		try {
			json = JSONSerializer.writeJsonObject(v);
		} catch (Exception e2) {}
		
		/** A Response Type deve ser text/html para que o browser não exiba a tela de download do browser **/
		AjaxPlusoftHelper.writeToResponse(json, "text/html", AjaxPlusoftHelper.CHARSET_UTF, response);
	}
}