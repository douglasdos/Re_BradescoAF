package br.com.plusoft.csi.bradescoaf.crm.business;

import java.net.URL;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Vector;

import org.apache.axis.AxisFault;
import org.apache.axis.client.Call;

import br.com.bradseg.sare.listarcausas.canonico.v1.Causa;
import br.com.bradseg.sare.listarcausas.canonico.v1.ListarCausasRequest;
import br.com.bradseg.sare.listarcausas.canonico.v1.ListarCausasResponse;
import br.com.bradseg.sare.listarcausas.canonico.v1.ListarCausas_BindingStub;
import br.com.bradseg.sare.listarcausas.canonico.v1.ListarCausas_PortType;
import br.com.bradseg.sare.listarcausas.canonico.v1.ListarCausas_Service;
import br.com.bradseg.sare.listarcausas.canonico.v1.ListarCausas_ServiceLocator;
import br.com.plusoft.csi.adm.helper.AdministracaoCsDmtbConfiguracaoConfHelper;
import br.com.plusoft.csi.adm.helper.generic.GenericHelper;
import br.com.plusoft.csi.bradescoaf.constantes.ConfiguracaoEspec;
import br.com.plusoft.fw.entity.Vo;
import br.com.plusoft.fw.log.Log;


public class WebServiceListarCausaBusiness extends ListarCausas_BindingStub{
	
	long idEmprCdEmpresa;
	
	private String xmlEntrada = "";
	private String xmlSaida = "";
	
	public WebServiceListarCausaBusiness(long idEmprCdEmpresa) throws AxisFault {
		this.idEmprCdEmpresa = idEmprCdEmpresa;
	}
	
	public String getPathWs(long idEmprCdEmpresa) throws Exception {
		GenericHelper gHelper = null;
		String pathWS = new String();
		
		try {
		
			Log.log(this.getClass(), Log.INFOPLUS, "WebServiceListarCausaBusiness - getPathWs - Iniciando busca endereço do WebService de Causa.");
			
			gHelper = new GenericHelper(idEmprCdEmpresa);
			pathWS = (String) new AdministracaoCsDmtbConfiguracaoConfHelper().findConfiguracao(ConfiguracaoEspec.CONF_BRADESCOAF_URL_WS_LISTAR_CAUSA, this.idEmprCdEmpresa);
		
		} catch (Exception e) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro ao executar o método - getPathWs(): " + e.getMessage(), e);
			throw e;
		} finally {
			gHelper = null;
		}
		
		 return pathWS;
	}
	
	private ListarCausas_PortType getPlusoft(String path){
		ListarCausas_Service service = null;
		ListarCausas_PortType soap = null;
	    try{
	    	ListarCausas_ServiceLocator locator = new ListarCausas_ServiceLocator();
	    	locator.setEndpointAddress("ListarCausas", path);
	        service = locator;
	        soap = service.getListarCausas();
	    } catch (Exception e) {
	    	e.printStackTrace();
	    } finally{
	          service = null;
	    }
	    return soap;
	} 
	
	private ListarCausas_Service getService(String path){
		ListarCausas_Service service = null;
		ListarCausas_PortType soap = null;
	    try{
	    	ListarCausas_ServiceLocator locator = new ListarCausas_ServiceLocator();
	    	locator.setEndpointAddress("ListarCausas", path);
	        service = locator;
	    } catch (Exception e) {
	    	e.printStackTrace();
	    } 
	    return service;
	} 
	
	@Override
	public ListarCausasResponse listarCausas(
			ListarCausasRequest listarCausasRequest) throws RemoteException {
		
		Calendar dataInicialConsumo = Calendar.getInstance();
		ListarCausasResponse listarCausasRetorno = null;
		
		try {
			listarCausasRetorno = super.listarCausas(listarCausasRequest);
		} finally {
			trataLogWebService(super._call, dataInicialConsumo, "listarCausas");
		}
		
		return listarCausasRetorno;
	}
	
	public Vo getListarCausa(String ramo) {
		Vo voRetorno = new Vo().addField("retorno", false).addField("mensagem", "");
		
		Log.log(this.getClass(), Log.INFOPLUS, "WebServiceListarCausaBusiness - Buscando WebService getListarCausa");
		
		try {
			
			if (ramo.length() == 0) {
				voRetorno.addField("mensagem", "O campo 'Ramo' é obrigatório");
				return voRetorno;
			}
			
			String caminhoWebService = getPathWs(idEmprCdEmpresa);
			
			if ((caminhoWebService == "") || (caminhoWebService == null)){
    			Log.log(this.getClass(), Log.INFOPLUS, "WebServiceListarCausaBusiness - Não foi possível encontrar o endereço do WebService de Listar de Causa.");
    			throw new Exception("WebServiceListarCausaBusiness - Não foi possível encontrar o endereço do WebService de Lista de Causa.");
    		}
    		
			ListarCausas_PortType ws = getPlusoft(caminhoWebService);
			
	    	if (ws == null){
	    		Log.log(this.getClass(), Log.INFOPLUS, "WebServiceListarCausaBusiness - Não foi possível instanciar o ws.");
	    	} else {

	    		this.cachedEndpoint = new URL(caminhoWebService);
	    		this.service = getService(caminhoWebService);
	    		
	    		ListarCausasRequest request = new ListarCausasRequest();
	    		request.setRamo(ramo);
	    		ListarCausasResponse wsResponse = this.listarCausas(request);
	    		
	    		if (wsResponse != null && wsResponse.getCausa() != null && wsResponse.getCausa().length > 0) {
	    			Vector<Vo> vecCausa = new Vector<Vo>();
	    			for (Causa causa : wsResponse.getCausa()) {
	    				Vo voAdd = new Vo();
	    				voAdd.addField("codigo", causa.getCodigo());
	    				voAdd.addField("descricao", causa.getDescricao());
	    				vecCausa.add(voAdd);
					}
	    			
    				voRetorno.addField("listarCausa", vecCausa);
    				voRetorno.addField("retorno", true);
	    			
	    		} else {
	    			voRetorno.addField("mensagem", "Nenhum registro encontrado");
	    		}
	    	}
		} catch (Exception ex) {
			Log.log(this.getClass(), Log.ERRORPLUS, "WebServiceListarCausaBusiness - Erro ao executar o metodo getListarCausa(): " + ex.getMessage(), ex);
			voRetorno.addField("mensagem", "Ocorreu um erro na busca das causas." 
					+ (!"".equals(ex.getMessage()) ? "Descrição do Erro: " + ex.getMessage() : "" ));
		}
		
		return voRetorno;
	}
	
	public void trataLogWebService(Call _callFora, Calendar dataInicialConsumo, String nomeDoMetodo ){
		
		try{
			long diferenca = System.currentTimeMillis() - dataInicialConsumo.getTimeInMillis();
			long diferencaSeg = diferenca / 1000;    //DIFERENCA EM SEGUNDOS
			
			System.out.println("IMPRIMINDO XML *****************************");
		  
		 	xmlEntrada = _callFora.getMessageContext().getRequestMessage().getSOAPEnvelope().toString();
		 	System.out.println(xmlEntrada);
		 	
			xmlSaida = _callFora.getMessageContext().getResponseMessage().getSOAPEnvelope().toString();
			System.out.println(xmlSaida);
			
			System.out.println("*****Consumo no WebService - Metodo: " + nomeDoMetodo + " Tempo de consumo: " + diferencaSeg + "\n");
			
	  	}catch(Exception e){
	  		e.printStackTrace();
	  	}
	}
	
}
