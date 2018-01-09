package br.com.plusoft.csi.bradescoaf.crm.business;

import java.net.URL;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Vector;

import org.apache.axis.AxisFault;
import org.apache.axis.client.Call;

import br.com.bradseg.sare.listarnaturezas.canonico.v1.ListarNaturezas;
import br.com.bradseg.sare.listarnaturezas.canonico.v1.ListarNaturezasLocator;
import br.com.bradseg.sare.listarnaturezas.canonico.v1.ListarNaturezasRequest;
import br.com.bradseg.sare.listarnaturezas.canonico.v1.ListarNaturezasResponse;
import br.com.bradseg.sare.listarnaturezas.canonico.v1.ListarNaturezasStub;
import br.com.bradseg.sare.listarnaturezas.canonico.v1.ListarNaturezas_PortType;
import br.com.bradseg.sare.listarnaturezas.canonico.v1.Natureza;
import br.com.plusoft.csi.adm.helper.AdministracaoCsDmtbConfiguracaoConfHelper;
import br.com.plusoft.csi.adm.helper.generic.GenericHelper;
import br.com.plusoft.csi.bradescoaf.constantes.ConfiguracaoEspec;
import br.com.plusoft.fw.entity.Vo;
import br.com.plusoft.fw.log.Log;


public class WebServiceListarNaturezaBusiness extends ListarNaturezasStub{
	
	long idEmprCdEmpresa;
	
	private String xmlEntrada = "";
	private String xmlSaida = "";
	
	public WebServiceListarNaturezaBusiness(long idEmprCdEmpresa) throws AxisFault {
		this.idEmprCdEmpresa = idEmprCdEmpresa;
	}
	
	public String getPathWs(long idEmprCdEmpresa) throws Exception {
		GenericHelper gHelper = null;
		String pathWS = new String();
		
		try {
		
			Log.log(this.getClass(), Log.INFOPLUS, "WebServiceListarNaturezaBusiness - getPathWs - Iniciando busca endereço do WebService de Natureza.");
			
			gHelper = new GenericHelper(idEmprCdEmpresa);
			pathWS = (String) new AdministracaoCsDmtbConfiguracaoConfHelper().findConfiguracao(ConfiguracaoEspec.CONF_BRADESCOAF_URL_WS_LISTAR_NATUREZA, this.idEmprCdEmpresa);
		
		} catch (Exception e) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro ao executar o método - getPathWs(): " + e.getMessage(), e);
			throw e;
		} finally {
			gHelper = null;
		}
		
		 return pathWS;
	}
	
	private ListarNaturezas_PortType getPlusoft(String path){
		ListarNaturezas service = null;
		ListarNaturezas_PortType soap = null;
	    try{
	    	ListarNaturezasLocator locator = new ListarNaturezasLocator();
	    	locator.setEndpointAddress("ListarNaturezas", path);
	        service = locator;
	        soap = service.getListarNaturezas();
	    } catch (Exception e) {
	    	e.printStackTrace();
	    } finally{
	          service = null;
	    }
	    return soap;
	} 
	
	private ListarNaturezas getService(String path){
		ListarNaturezas service = null;
	    try{
	    	ListarNaturezasLocator locator = new ListarNaturezasLocator();
	    	locator.setEndpointAddress("ListarNaturezas", path);
	        service = locator;
	    } catch (Exception e) {
	    	e.printStackTrace();
	    } 
	    return service;
	} 
	
	@Override
	public ListarNaturezasResponse listarNaturezas(
			ListarNaturezasRequest listarNaturezasRequest)
			throws RemoteException {
		
		Calendar dataInicialConsumo = Calendar.getInstance();
		ListarNaturezasResponse listarNaturezasRetorno = null;
		
		try {
			listarNaturezasRetorno = super.listarNaturezas(listarNaturezasRequest);
		} finally {
			trataLogWebService(super._call, dataInicialConsumo, "listarNaturezas");
		}
		
		return listarNaturezasRetorno;
	}
	
	public Vo getListarNatureza(Short ramo, Integer causa) {
		Vo voRetorno = new Vo().addField("retorno", false).addField("mensagem", "");
		
		Log.log(this.getClass(), Log.INFOPLUS, "WebServiceListarNaturezaBusiness - Buscando WebService getListarNatureza");
		
		try {
			
			if (ramo < 1) {
				voRetorno.addField("mensagem", "O campo 'Ramo' é obrigatório");
				return voRetorno;
			}
			
			if (ramo < 1) {
				voRetorno.addField("mensagem", "O campo 'Causa' é obrigatório");
				return voRetorno;
			}
			
			String caminhoWebService = getPathWs(idEmprCdEmpresa);
			
			if ((caminhoWebService == "") || (caminhoWebService == null)){
    			Log.log(this.getClass(), Log.INFOPLUS, "WebServiceListarNaturezaBusiness - Não foi possível encontrar o endereço do WebService de Listar Natureza.");
    			throw new Exception("WebServiceListarNaturezaBusiness - Não foi possível encontrar o endereço do WebService de Lista Natureza.");
    		}
    		
			ListarNaturezas_PortType ws = getPlusoft(caminhoWebService);
			
	    	if (ws == null){
	    		Log.log(this.getClass(), Log.INFOPLUS, "WebServiceListarNaturezaBusiness - Não foi possível instanciar o ws.");
	    	} else {

	    		this.cachedEndpoint = new URL(caminhoWebService);
	    		this.service = getService(caminhoWebService);
	    		
	    		ListarNaturezasRequest request = new ListarNaturezasRequest();
	    		request.setRamo(ramo);
	    		request.setCausa(causa);
	    		ListarNaturezasResponse wsResponse = this.listarNaturezas(request);
	    		
	    		if (wsResponse != null && wsResponse.getNatureza() != null && wsResponse.getNatureza().length > 0) {
	    			Vector<Vo> vecNatureza = new Vector<Vo>();
	    			for (Natureza Natureza : wsResponse.getNatureza()) {
	    				Vo voAdd = new Vo();
	    				voAdd.addField("codigo", Natureza.getCodigo());
	    				voAdd.addField("descricao", Natureza.getDescricao());
	    				vecNatureza.add(voAdd);
					}
	    			
    				voRetorno.addField("listarNatureza", vecNatureza);
    				voRetorno.addField("retorno", true);
	    			
	    		} else {
	    			voRetorno.addField("mensagem", "Nenhum registro encontrado");
	    		}
	    	}
		} catch (Exception ex) {
			Log.log(this.getClass(), Log.ERRORPLUS, "WebServiceListarNaturezaBusiness - Erro ao executar o metodo getListarNatureza(): " + ex.getMessage(), ex);
			voRetorno.addField("mensagem", "Ocorreu um erro na busca das naturezas." 
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
