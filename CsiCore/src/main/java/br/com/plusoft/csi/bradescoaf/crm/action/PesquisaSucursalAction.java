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
import br.com.plusoft.csi.bradescoaf.crm.business.PesquisaSucursalBusiness;
import br.com.plusoft.csi.bradescoaf.crm.business.ValidaConfiguacaoBusiness;
import br.com.plusoft.fw.entity.Vo;
import br.com.plusoft.fw.json.JSONSerializer;
import br.com.plusoft.fw.log.Log;
import br.com.plusoft.fw.webapp.AjaxPlusoftHelper;

public class PesquisaSucursalAction extends GenericAction {
	
	public ActionForward abrirPesquisaSucursalRE(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		DynaValidatorForm dynaForm = (DynaValidatorForm) form;
		try {
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando abrirPesquisaSucursalRE");	
			
			long idEmprCdEmpresa = SessionHelper.getEmpresa(request).getIdEmprCdEmpresa();
			
			ValidaConfiguacaoBusiness validaBusinnes = new ValidaConfiguacaoBusiness(idEmprCdEmpresa);
			
			validaBusinnes.criarValidacao(dynaForm.getString("validarConfig"));
			if (validaBusinnes.getValidacao().abreTelaValidacao() == true) {
				dynaForm.set("validacao", JSONSerializer.writeJsonObject(validaBusinnes.getValidacao())); 
				return mapping.findForward("ifrmValidacao");
			}
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando abrirPesquisaSucursalRE - Sucesso");
			
		} catch (Exception e) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Carregando abrirPesquisaSucursalRE - Erro: " + e.getMessage(),e);
		}
		
		return mapping.findForward("ifrmPesquisadesucursal");
	}
	
	public ActionForward carregarUf(ActionMapping mapping, ActionForm actionForm,HttpServletRequest request, HttpServletResponse response) throws Exception {
		DynaValidatorForm dynaForm = (DynaValidatorForm) actionForm;
		
		Vector retorno = new Vector();
		
		PesquisaSucursalBusiness pesquisaSucursalBusiness; 
		
		try {
			
			long idEmprCdEmpresa = SessionHelper.getEmpresa(request).getIdEmprCdEmpresa();
			pesquisaSucursalBusiness = new PesquisaSucursalBusiness(idEmprCdEmpresa);
			
			retorno = pesquisaSucursalBusiness.getUf();
			writeJson(retorno, response);
			
		} catch (Exception e) {
			setException(e, request);
			if(response!=null)
				AjaxPlusoftAction.writeToResponse(AjaxPlusoftAction.generateXml(new Vector(), request, null), response);
		}
		return null;
	}
	
	public ActionForward carregarMunicipio(ActionMapping mapping, ActionForm actionForm,HttpServletRequest request, HttpServletResponse response) throws Exception {
		DynaValidatorForm dynaForm = (DynaValidatorForm) actionForm;
		
		Vector retorno = new Vector();
		
		PesquisaSucursalBusiness pesquisaSucursalBusiness; 
		
		try {
			long idEmprCdEmpresa = SessionHelper.getEmpresa(request).getIdEmprCdEmpresa();
			pesquisaSucursalBusiness = new PesquisaSucursalBusiness(idEmprCdEmpresa);
			
			String aure_ds_uf = dynaForm.getString("aure_ds_uf");
			String aure_ds_cidade = dynaForm.getString("aure_ds_cidade");
			
			if (!"".equals(aure_ds_uf) || !"".equals(aure_ds_cidade) ) {
				retorno = pesquisaSucursalBusiness.carregarMunicipio(aure_ds_uf,aure_ds_cidade);	
			}
			
			writeJson(retorno, response);
			
		} catch (Exception e) {
			setException(e, request);
			if(response!=null)
				AjaxPlusoftAction.writeToResponse(AjaxPlusoftAction.generateXml(new Vector(), request, null), response);
		}
		return null;
	}
	
	
	
	public ActionForward carregarSucursal(ActionMapping mapping, ActionForm actionForm,HttpServletRequest request, HttpServletResponse response) throws Exception {
		DynaValidatorForm dynaForm = (DynaValidatorForm) actionForm;
		
		Vector<Vo> retorno = new Vector<Vo>();
		PesquisaSucursalBusiness pesquisaSucursalBusiness = null;
		 
		try {

			String aure_ds_uf = dynaForm.getString("aure_ds_uf");
			String aure_ds_cidade = dynaForm.getString("aure_ds_cidade");
			
			long idEmprCdEmpresa = SessionHelper.getEmpresa(request).getIdEmprCdEmpresa();
			pesquisaSucursalBusiness = new PesquisaSucursalBusiness(idEmprCdEmpresa);
			
			Vo voRetorno = pesquisaSucursalBusiness.carregarSucursal(aure_ds_uf, aure_ds_cidade);
			retorno.add(voRetorno);
			
			writeJson(retorno, response);
			
		} catch (Exception e) {
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
}