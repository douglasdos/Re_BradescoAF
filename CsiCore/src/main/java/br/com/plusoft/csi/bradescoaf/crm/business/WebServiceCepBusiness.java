package br.com.plusoft.csi.bradescoaf.crm.business;

import java.net.URL;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Vector;

import org.apache.axis.AxisFault;
import org.apache.axis.client.Call;

import br.com.bradseg.bucb.central.model.pessoa.vo.PlusoftUseVOSaida;
import br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepCompletoVO;
import br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepCompletoWebServiceResponse;
import br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebService;
import br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebServiceService;
import br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebServiceServiceLocator;
import br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebServiceServiceSoapBindingStub;
import br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.IntegrationException;
import br.com.plusoft.csi.adm.helper.AdministracaoCsDmtbConfiguracaoConfHelper;
import br.com.plusoft.csi.adm.helper.generic.GenericHelper;
import br.com.plusoft.csi.bradescoaf.constantes.ConfiguracaoEspec;
import br.com.plusoft.fw.entity.Vo;
import br.com.plusoft.fw.log.Log;


public class WebServiceCepBusiness extends CepWebServiceServiceSoapBindingStub{
	
	long idEmprCdEmpresa;
	
	private String xmlEntrada = "";
	private String xmlSaida = "";
	
	public WebServiceCepBusiness(long idEmprCdEmpresa) throws AxisFault {
		this.idEmprCdEmpresa = idEmprCdEmpresa;
	}
	
	public String getPathWs(long idEmprCdEmpresa) throws Exception {
		GenericHelper gHelper = null;
		String pathWS = new String();
		
		try {
		
			Log.log(this.getClass(), Log.INFOPLUS, "WebServiceCepBusiness - getPathWs - Iniciando busca endereço do WebService de Cep.");
			
			gHelper = new GenericHelper(idEmprCdEmpresa);
			pathWS = (String) new AdministracaoCsDmtbConfiguracaoConfHelper().findConfiguracao(ConfiguracaoEspec.CONF_BRADESCOAF_URL_WS_CEP, this.idEmprCdEmpresa);
		
		} catch (Exception e) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro ao executar o método - getPathWs(): " + e.getMessage(), e);
			throw e;
		} finally {
			gHelper = null;
		}
		
		 return pathWS;
	}
	
	private CepWebService getPlusoft(String path){
		CepWebServiceService service = null;
		CepWebService soap = null;
	    try{
	    	CepWebServiceServiceLocator locator = new CepWebServiceServiceLocator();
	    	locator.setEndpointAddress("CepWebServicePort", path);
	        service = locator;
	        soap = service.getCepWebServicePort();
	    } catch (Exception e) {
	    	e.printStackTrace();
	    } finally{
	          service = null;
	    }
	    return soap;
	} 
	
	private CepWebServiceService getService(String path){
		CepWebServiceService service = null;
	    try{
	    	CepWebServiceServiceLocator locator = new CepWebServiceServiceLocator();
	    	locator.setEndpointAddress("CepWebServicePort", path);
	        service = locator;
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
	    return service;
	} 
	
	@Override
	public CepCompletoWebServiceResponse obterListaLogradouroCompletoPorCep(
			String cepCompleto) throws RemoteException, IntegrationException {

		Calendar dataInicialConsumo = Calendar.getInstance();
		CepCompletoWebServiceResponse obterListaLogradouroCompletoPorCepRetorno = null;
		
		try {
			obterListaLogradouroCompletoPorCepRetorno = super.obterListaLogradouroCompletoPorCep(cepCompleto);
		} finally {
			trataLogWebService(super._call, dataInicialConsumo, "obterListaLogradouroCompletoPorCep");
		}
		
		return obterListaLogradouroCompletoPorCepRetorno;
	}
	
	public Vo getLogradouroCompletoPorCep(String cepCompleto) {
		Vo voRetorno = new Vo().addField("retorno", false).addField("mensagem", "");
		
		Log.log(this.getClass(), Log.INFOPLUS, "WebServiceCepBusiness - Buscando WebService getLogradouroCompletoPorCep");
		
		try {
			
			if ("".equalsIgnoreCase(cepCompleto)) {
				voRetorno.addField("mensagem", "O campo 'Cep' é obrigatório");
				return voRetorno;
			}
			
			cepCompleto = cepCompleto.replace("-", "");
			
			String caminhoWebService = getPathWs(idEmprCdEmpresa);
			
			if ((caminhoWebService == "") || (caminhoWebService == null)){
    			Log.log(this.getClass(), Log.INFOPLUS, "WebServiceCepBusiness - Não foi possível encontrar o endereço do WebService de Cep.");
    			throw new Exception("WebServiceCepBusiness - Não foi possível encontrar o endereço do WebService de Cep.");
    		}
    		
			CepWebService ws = getPlusoft(caminhoWebService);
			
	    	if (ws == null){
	    		Log.log(this.getClass(), Log.INFOPLUS, "WebServiceCepBusiness - Não foi possível instanciar o ws.");
	    	} else {

	    		this.cachedEndpoint = new URL(caminhoWebService);
	    		this.service = getService(caminhoWebService);
	    		
	    		CepCompletoWebServiceResponse wsResponse = this.obterListaLogradouroCompletoPorCep(cepCompleto);
	    		
	    		if (wsResponse != null && wsResponse.getLista() != null && wsResponse.getLista().length > 0) {
	    			Vector<CepCompletoVO> vecCeps = new Vector<CepCompletoVO>();
	    			for (CepCompletoVO cep : wsResponse.getLista()) {
	    				vecCeps.add(cep);
					}
	    			
    				voRetorno.addField("listaCep", vecCeps);
    				voRetorno.addField("retorno", true);
	    			
	    		} else {
	    			voRetorno.addField("mensagem", "Nenhum registro encontrado");
	    		}
	    	}
		} catch (Exception ex) {
			Log.log(this.getClass(), Log.ERRORPLUS, "WebServiceCepBusiness - Erro ao executar o metodo getLogradouroCompletoPorCep(): " + ex.getMessage(), ex);
			voRetorno.addField("mensagem", "Ocorreu um erro na busca dos Ceps." 
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
