package br.com.plusoft.csi.bradescoaf.crm.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.DynaValidatorForm;

import br.com.plusoft.csi.adm.action.generic.AjaxPlusoftAction;
import br.com.plusoft.csi.adm.action.generic.GenericAction;
import br.com.plusoft.csi.adm.helper.generic.SessionHelper;
import br.com.plusoft.csi.bradescoaf.crm.business.AfinidadeBusiness;
import br.com.plusoft.csi.bradescoaf.crm.business.AfinidadeException;
import br.com.plusoft.csi.crm.util.SystemDate;
import br.com.plusoft.csi.crm.vo.CsNgtbManifestacaoManiVo;
import br.com.plusoft.fw.entity.Vo;
import br.com.plusoft.fw.log.Log;

public class AfinidadeAction extends GenericAction{
	
	public ActionForward abreTelaAfinidade(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		DynaValidatorForm dynaForm = (DynaValidatorForm)form;
		
		try {
			
			AfinidadeBusiness afBusiness = new AfinidadeBusiness(SessionHelper.getEmpresa(request).getIdEmprCdEmpresa());
			
			String cpfCnpj = dynaForm.getString("pessDsCpf");
			
			dynaForm.set("tipo_doc", afBusiness.tratarTipoDoc(cpfCnpj));
			
			dynaForm.set("pessDsCpf", afBusiness.formatarCpfCnpj(cpfCnpj));
			
			dynaForm.set("data_final", new SystemDate().toString());
			
			dynaForm.set("data_inicial", afBusiness.getDataMenosUmAno(new SystemDate()));
			
			dynaForm.set("parametro_formato_url", afBusiness.getComplementoUrl(SessionHelper.getUsuarioLogado(request)));
			
			request.setAttribute("produtoVector", afBusiness.findCmbProduto());
			
			//Declara e Inicializa a List
			//List assistencias = null;

			// Instancia e inicializa o programa
			//CTGProgram pgm = new AFND0510.ConsultarDadosAssistencia(1, 1, new Date());

			// Executa o programa
			//ResultSet rs = pgm.execute();

			// Verifica se ocorreu erro na execução do programa (abend)
			//ObjetoRetornoVO objetoRetornoVO = AFND0510.validaOperacao(rs);

			//assistencias = AFND0510.ConsultarDadosAssistencia.retrieveDocumentoSeguro(rs);

			//objetoRetornoVO.setAssistencias(assistencias);
			
			//AFND0510.ConsultarDadosAssistencia consulta= new AFND0510.ConsultarDadosAssistencia(1,1, new Date());
			//ResultSet rs = consulta.execute();
			//List l = consulta.retrieveDocumentoSeguro(rs);
			
			//CicsTeste cics = new CicsTeste();
			
			//List assistencias = cics.obterAlertas(1, 1);
			
			//System.out.println("oi = " + assistencias);
			
			/*if(assistencias != null){
				System.out.println("assistencias.size = " + assistencias.size());
			}*/
			
			
			
		} catch (Exception e) {
			
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro ao executar o método abreTelaAfinidade(): " + e.getMessage(), e);
			setException(e, request);
			
		} finally {
			
		}
		
		return mapping.findForward("ifrmAfinidade2");
	}
	
	public ActionForward buscarCertificados(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		DynaValidatorForm dynaForm = (DynaValidatorForm)form;
		
		try {
			
			AfinidadeBusiness afBusiness = new AfinidadeBusiness(SessionHelper.getEmpresa(request).getIdEmprCdEmpresa());
			
			Vector<Vo> v = afBusiness.findAllCertificados(dynaForm.getString("pessDsCpf"), dynaForm.getString("produto"), dynaForm.getString("data_inicial"), dynaForm.getString("data_final"), SessionHelper.getUsuarioLogado(request).getFuncDsLoginname());
			
			if(response!=null)
				AjaxPlusoftAction.writeToResponse(AjaxPlusoftAction.generateXml(v, request, new ArrayList<Vo>()),response);
		
		} catch (AfinidadeException e) {
			
			AfinidadeBusiness afBusiness = new AfinidadeBusiness(SessionHelper.getEmpresa(request).getIdEmprCdEmpresa());
			Vector<Vo> v = afBusiness.getVectorErroBuscaCertificado(e);
			
			if(response!=null)
				AjaxPlusoftAction.writeToResponse(AjaxPlusoftAction.generateXml(v, request, null),response);

		} catch (Exception e) {
			
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro ao executar o método buscarCertificados(): " + e.getMessage(), e);

			setException(e, request);
			if(response!=null)
				AjaxPlusoftAction.writeToResponse(AjaxPlusoftAction.generateXml(new Vector<Vo>(), request, null),response);
			
		}
		
		return null;
	}
	
	public ActionForward validaSubmitAfinidade(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		DynaValidatorForm dynaForm = (DynaValidatorForm)form;
		Vector<Vo> vResult = new Vector<Vo>();
		
		try {
			
			AfinidadeBusiness afdBusiness = new AfinidadeBusiness(SessionHelper.getEmpresa(request).getIdEmprCdEmpresa());
			
			vResult = afdBusiness.getVectorValidaPeriodo(dynaForm.getString("data_inicial"), dynaForm.getString("data_final"));
			
			if(response!=null)
				AjaxPlusoftAction.writeToResponse(AjaxPlusoftAction.generateXml(vResult, request, new ArrayList<Vo>()),response);
			
		} catch (Exception e) {
			
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro ao executar o método validaSubmitAfinidade(): " + e.getMessage(), e);

			setException(e, request);
			if(response!=null)
				AjaxPlusoftAction.writeToResponse(AjaxPlusoftAction.generateXml(new Vector<Vo>(), request, null),response);
			
		}
		
		return null;
	}
	
	public ActionForward gravarAtendPadraoAfinidade(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		DynaValidatorForm dynaForm = (DynaValidatorForm)form;
		Vector<Vo> vResult = new Vector<Vo>();
		
		try {
			
			AfinidadeBusiness afdBusiness = new AfinidadeBusiness(SessionHelper.getEmpresa(request).getIdEmprCdEmpresa());
			
			Vo voAtend = afdBusiness.getCodigoAtendimentoPadrao(dynaForm.getString("situacao_anterior"), dynaForm.getString("situacao_atual"), dynaForm.getString("atend_padrao_semregistros"));
			
			CsNgtbManifestacaoManiVo maniSinistroVo = afdBusiness.gravarAtendPadrao(
				voAtend, 
				dynaForm.getString("atend_padrao_semregistros"),
				dynaForm.getString("idChamCdChamado"), 
				dynaForm.getString("idPessCdPessoa"), 
				dynaForm.getString("desc_situacao_anterior"),
				dynaForm.getString("desc_situacao_atual"),
				dynaForm.getString("descricao_produto"),
				dynaForm.getString("nome_estipulante"),
				dynaForm.getString("codigo_unidade_produtora"),
				dynaForm.getString("numero_certificado"),
				dynaForm.getString("pessDsCpf"),
				String.valueOf(getCodigoFuncionario(request)),
				request
			);
			
			vResult = afdBusiness.montaVectorRetornoGravacaoAtendPadrao(voAtend, maniSinistroVo);
			
			if(response!=null)
				AjaxPlusoftAction.writeToResponse(AjaxPlusoftAction.generateXml(vResult, request, new ArrayList<Vo>()),response);
			
		} catch (Exception e) {
			
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro ao executar o método gravarAtendPadraoAfinidade(): " + e.getMessage(), e);

			setException(e, request);
			if(response!=null)
				AjaxPlusoftAction.writeToResponse(AjaxPlusoftAction.generateXml(new Vector<Vo>(), request, null),response);
			
		}
		
		return null;
	}
	
	
}
