package br.com.plusoft.csi.bradescoaf.crm.action;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.DynaValidatorForm;

import br.com.plusoft.csi.adm.action.generic.AjaxPlusoftAction;
import br.com.plusoft.csi.adm.action.generic.GenericAction;
import br.com.plusoft.csi.adm.helper.generic.SessionHelper;
import br.com.plusoft.csi.bradescoaf.crm.business.AberturaSinistroBusiness;
import br.com.plusoft.csi.bradescoaf.crm.business.PessoaEspecBusiness;
import br.com.plusoft.csi.bradescoaf.crm.business.ValidaConfiguacaoBusiness;
import br.com.plusoft.fw.entity.Vo;
import br.com.plusoft.fw.json.JSONSerializer;
import br.com.plusoft.fw.log.Log;
import br.com.plusoft.fw.webapp.AjaxPlusoftHelper;

public class IdentificacaoEspecAction extends GenericAction {
	
	public ActionForward abrirTelaIdentificacao(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		DynaValidatorForm dynaForm = (DynaValidatorForm) form;
		try {
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando abrirTelaIdentificacao");	
			
			long idEmprCdEmpresa = SessionHelper.getEmpresa(request).getIdEmprCdEmpresa();
			
			ValidaConfiguacaoBusiness validaBusinnes = new ValidaConfiguacaoBusiness(idEmprCdEmpresa);
			
			validaBusinnes.criarValidacao(dynaForm.getString("validarConfig"));
			if (validaBusinnes.getValidacao().abreTelaValidacao() == true) {
				dynaForm.set("validacao", JSONSerializer.writeJsonObject(validaBusinnes.getValidacao())); 
				return mapping.findForward("ifrmValidacao");
			}
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando abrirTelaIdentificacao - Sucesso");
			
		} catch (Exception e) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Carregando abrirTelaIdentificacao - Erro: " + e.getMessage(),e);
		}
		
		return mapping.findForward("telaIdentificacao");
	}
	
	public ActionForward buscarPessoaEspec(ActionMapping mapping, ActionForm actionForm,HttpServletRequest request, HttpServletResponse response) throws Exception {
		DynaValidatorForm dynaForm = (DynaValidatorForm) actionForm;
		
		Vector<Vo> retorno = new Vector<Vo>();
		PessoaEspecBusiness pessoaBusinnes = null;
		AberturaSinistroBusiness businnes;
		
		try {
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando do webservice buscarPessoaEspec");

			long idEmprCdEmpresa = SessionHelper.getEmpresa(request).getIdEmprCdEmpresa();
			long idIdioCdIdioma = SessionHelper.getUsuarioLogado(request).getIdIdioCdIdioma();
			long idFuncCdFuncionario = SessionHelper.getUsuarioLogado(request).getIdFuncCdFuncionario();
			
			pessoaBusinnes = new PessoaEspecBusiness(idEmprCdEmpresa,idFuncCdFuncionario);

			String funcDsLoginName = SessionHelper.getUsuarioLogado(request).getFuncDsLoginname();
			
			String pessNmPessoa = dynaForm.getString("pessNmPessoa");
			String pessDhNascimento = dynaForm.getString("pessDhNascimento");
			String idChamCdChamado = dynaForm.getString("idChamCdChamado");
			String pcomDsDdd = dynaForm.getString("pcomDsDdd");
			String pcomDsTelefone = dynaForm.getString("pcomDsTelefone");
			String pessDsCgccpf = dynaForm.getString("pessDsCgccpf");
			String dataOcorrencia = dynaForm.getString("dataOcorrencia");
			String horaOcorrencia = dynaForm.getString("horaOcorrencia");
			String pcomDsComplemento = dynaForm.getString("pcomDsComplemento");
			String rdoFalorSombreSinistro = dynaForm.getString("rdoFalorSombreSinistro");
			String acao = dynaForm.getString("acao");
			String apol_Sucurcsal = dynaForm.getString("apol_Sucurcsal");
			String apol_Cia = dynaForm.getString("apol_Cia");
			String apol_Ramo = dynaForm.getString("apol_Ramo");
			String apol_Apolice = dynaForm.getString("apol_Apolice");
			String siasNrSinistro = dynaForm.getString("siasNrSinistro");
			
			businnes = new AberturaSinistroBusiness(idEmprCdEmpresa, idIdioCdIdioma, idFuncCdFuncionario);
			businnes.excluirListaApoliceTemporaria();
			
			Vo voRetorno = pessoaBusinnes.buscarPessoa(
					pessNmPessoa, 
					pessDhNascimento, 
					idChamCdChamado, 
					pcomDsDdd, 
					pcomDsTelefone, 
					pessDsCgccpf, 
					dataOcorrencia, 
					horaOcorrencia, 
					pcomDsComplemento, 
					rdoFalorSombreSinistro, 
					acao, 
					apol_Sucurcsal, 
					apol_Cia, 
					apol_Ramo, 
					apol_Apolice, 
					siasNrSinistro,
					funcDsLoginName,
					request);
			
			retorno.add(voRetorno);
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando webservice buscarPessoaEspec - Sucesso");
			
			writeJson(retorno, response);
			
		} catch (Exception e) {
			
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro no metodo - buscarPessoaEspec" , e);
			
			setException(e, request);
			if(response!=null)
				AjaxPlusoftAction.writeToResponse(AjaxPlusoftAction.generateXml(new Vector(), request, null), response);
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
	
	public ActionForward setarDataAtual(ActionMapping mapping, ActionForm actionForm,HttpServletRequest request, HttpServletResponse response) throws Exception {
		DynaValidatorForm dynaForm = (DynaValidatorForm) actionForm;
		
		Vector<Vo> retorno = new Vector<Vo>();
		PessoaEspecBusiness pessoaBusinnes = null;
		AberturaSinistroBusiness businnes;
		
		try {
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando metodo setarDataAtual");

			long idEmprCdEmpresa = SessionHelper.getEmpresa(request).getIdEmprCdEmpresa();
			long idFuncCdFuncionario = SessionHelper.getUsuarioLogado(request).getIdFuncCdFuncionario();
			
			pessoaBusinnes = new PessoaEspecBusiness(idEmprCdEmpresa,idFuncCdFuncionario);

			retorno.add(pessoaBusinnes.getDataAtual());
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando metodo setarDataAtual - Sucesso");
			
			writeJson(retorno, response);
			
		} catch (Exception e) {
			
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro no metodo - setarDataAtual" , e);
			
			setException(e, request);
			if(response!=null)
				AjaxPlusoftAction.writeToResponse(AjaxPlusoftAction.generateXml(new Vector(), request, null), response);
		}
		return null;
	}
	
}