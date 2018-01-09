package br.com.plusoft.csi.bradescoaf.crm.business;

import java.net.URL;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import java.util.regex.Pattern;

import org.apache.axis.AxisFault;
import org.apache.axis.client.Call;

import br.com.bradseg.sare.avisoeletroportatil.canonico.AvisoEletroPortatil_Service;
import br.com.bradseg.sare.avisoeletroportatil.canonico.AvisoEletroPortatil_ServiceLocator;
import br.com.bradseg.sare.servicos.apolice.webservice.ApoliceWebService;
import br.com.bradseg.sare.servicos.apolice.webservice.ApoliceWebServiceService;
import br.com.bradseg.sare.servicos.apolice.webservice.ApoliceWebServiceServiceLocator;
import br.com.bradseg.sare.servicos.apolice.webservice.ApoliceWebServiceServiceSoapBindingStub;
import br.com.bradseg.sare.servicos.apolice.webservice.BusinessException;
import br.com.bradseg.sare.servicos.apolice.webservice.EntradaListaApoliceVO;
import br.com.bradseg.sare.servicos.apolice.webservice.EntradaObterDadosApoliceVO;
import br.com.bradseg.sare.servicos.apolice.webservice.ListaApoliceVO;
import br.com.bradseg.sare.servicos.apolice.webservice.WsRetornoListaApoliceVO;
import br.com.bradseg.sare.servicos.apolice.webservice.WsRetornoObterApoliceVO;
import br.com.plusoft.csi.adm.helper.AdministracaoCsDmtbConfiguracaoConfHelper;
import br.com.plusoft.csi.adm.helper.generic.GenericHelper;
import br.com.plusoft.csi.bradescoaf.constantes.ConfiguracaoEspec;
import br.com.plusoft.fw.entity.Vo;
import br.com.plusoft.fw.log.Log;
import br.com.plusoft.fw.util.Datetime;


public class WebServiceApoliceBusiness extends ApoliceWebServiceServiceSoapBindingStub {
	
	long idEmprCdEmpresa;
	String funcDsLoginName = "";
	
	private String xmlEntrada = "";
	private String xmlSaida = "";
	
	
	public WebServiceApoliceBusiness(long idEmprCdEmpresa) throws AxisFault {
		this.idEmprCdEmpresa = idEmprCdEmpresa;
	}
	
	public WebServiceApoliceBusiness(long idEmprCdEmpresa,String funcDsLoginName) throws AxisFault {
		this.idEmprCdEmpresa = idEmprCdEmpresa;
		this.funcDsLoginName = funcDsLoginName;
	}
	
	public String getPathWs(long idEmprCdEmpresa) throws Exception {
		GenericHelper gHelper = null;
		String pathWS = new String();
		
		try {
		
			Log.log(this.getClass(), Log.INFOPLUS, "WebServiceApoliceBusiness - getPathWs - Iniciando busca endereço do WebService de Apolice.");
			
			gHelper = new GenericHelper(idEmprCdEmpresa);
			pathWS = (String) new AdministracaoCsDmtbConfiguracaoConfHelper().findConfiguracao(ConfiguracaoEspec.CONF_BRADESCOAF_URL_WS_APOLICE_RE, this.idEmprCdEmpresa);
		
		} catch (Exception e) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro ao executar o método - getPathWs(): " + e.getMessage(), e);
			throw e;
		} finally {
			gHelper = null;
		}
		
		 return pathWS;
	}
	
	private ApoliceWebService getPlusoft(String path){
		ApoliceWebServiceService service = null;
		ApoliceWebService soap = null;
	    try{
	    	  ApoliceWebServiceServiceLocator locator = new ApoliceWebServiceServiceLocator();
	    	  locator.setApoliceWebServicePortEndpointAddress(path);
	          service = locator;
	          soap = service.getApoliceWebServicePort();
	    } catch (Exception e) {
	    	e.printStackTrace();
	    } finally{
	          service = null;
	    }
	    return soap;
	} 
	
	private ApoliceWebServiceService getService(String path){
		ApoliceWebServiceService service = null;
		
	    try{
	    	  ApoliceWebServiceServiceLocator locator = new ApoliceWebServiceServiceLocator();
	    	  locator.setApoliceWebServicePortEndpointAddress(path);
	          service = locator;
	    } catch (Exception e) {
	    	e.printStackTrace();
	    } 
	    return service;
	} 
	
	@Override
	public WsRetornoListaApoliceVO listaApolice(EntradaListaApoliceVO arg0)
			throws RemoteException, BusinessException {
		
		WsRetornoListaApoliceVO listaApoliceRetorno = null;
		Calendar dataInicialConsumo = Calendar.getInstance();
		try {
			listaApoliceRetorno = super.listaApolice(arg0);
		} finally {
			trataLogWebService(super._call, dataInicialConsumo, "listaApolice");
		}
		
		return listaApoliceRetorno;
	}
	
	@Override
	public WsRetornoObterApoliceVO obterDadosApolice(
			EntradaObterDadosApoliceVO arg0) throws RemoteException {
		
		WsRetornoObterApoliceVO obterDadosApoliceRetorno = null;
		Calendar dataInicialConsumo = Calendar.getInstance();
		try {
			obterDadosApoliceRetorno = super.obterDadosApolice(arg0);
		} finally {
			trataLogWebService(super._call, dataInicialConsumo, "obterDadosApolice");
		}
		
		return obterDadosApoliceRetorno;
		
	}
	
	
	public Vo getListaApolice(String cpfCnpj, String dataOcorrenciaSinistro) {
		Vo voRetorno = new Vo().addField("retorno", false).addField("mensagem", "");
		
		Log.log(this.getClass(), Log.INFOPLUS, "WebServiceApoliceBusiness - Buscando WebService getListaApolice");
		
		try {
			
			if (cpfCnpj.length() == 0) {
				voRetorno.addField("mensagem", "O campo 'CPF / CNPJ' é obrigatório");
				return voRetorno;
			}
			
			cpfCnpj = cpfCnpj.replaceAll(Pattern.quote("."), "");
			cpfCnpj = cpfCnpj.replaceAll(Pattern.quote("-"), "");
			cpfCnpj = cpfCnpj.replaceAll(Pattern.quote("/"), "");
			
			String caminhoWebService = getPathWs(idEmprCdEmpresa);
			
			if ((caminhoWebService == "") || (caminhoWebService == null)){
    			Log.log(this.getClass(), Log.INFOPLUS, "WebServiceApoliceBusiness - Não foi possível encontrar o endereço do WebService de Apolice.");
    			throw new Exception("WebServiceApoliceBusiness - Não foi possível encontrar o endereço do WebService de Apolice.");
    		}
    		
			ApoliceWebService ws = getPlusoft(caminhoWebService);
			
	    	if (ws == null){
	    		Log.log(this.getClass(), Log.INFOPLUS, "WebServiceApoliceBusiness - Não foi possível instanciar o ws.");
	    	} else {

	    		this.cachedEndpoint = new URL(caminhoWebService);
	    		this.service = getService(caminhoWebService);
	    		
	    		EntradaListaApoliceVO entrada = new EntradaListaApoliceVO(this.funcDsLoginName, Long.parseLong(cpfCnpj), getDataOcorrencia(dataOcorrenciaSinistro), 3);
	    		
	    		WsRetornoListaApoliceVO wsApolice = this.listaApolice(entrada);
	    		
	    		if (wsApolice != null) {
	    			if (wsApolice.getCodigoErro() != 0) {
	    				voRetorno.addField("mensagem", "Ocorreu um erro no retorno do webservice." 
	    						+ (!"".equals(wsApolice.getDescricaoErro()) ? "Descrição do Erro: " + wsApolice.getDescricaoErro() : "" ));
	    			} else {
	    				Vector<ListaApoliceVO> vecListaApolice = new Vector<ListaApoliceVO>(); 
	    				
	    				if (wsApolice.getApolices() != null && wsApolice.getApolices().length > 0) {
	    					for (ListaApoliceVO apolice : wsApolice.getApolices()) {
		    					vecListaApolice.add(apolice);
							}	
	    				}
	    				voRetorno.addField("listaApolices", vecListaApolice);
	    				voRetorno.addField("retorno", true);
	    			}
	    		} else {
	    			voRetorno.addField("mensagem", "Nehnum registro encontrado");
	    		}
	    	}
		} catch (Exception ex) {
			Log.log(this.getClass(), Log.ERRORPLUS, "WebServiceApoliceBusiness - Erro ao executar o metodo getListaApolice(): " + ex.getMessage(), ex);
			voRetorno.addField("mensagem", "Ocorreu um erro na busca das apólices." 
					+ (!"".equals(ex.getMessage()) ? "Descrição do Erro: " + ex.getMessage() : "" ));
		}
		
		return voRetorno;
	}

	
	public Vo getObterApolice(EntradaObterDadosApoliceVO entrada) {
		Vo voRetorno = new Vo().addField("retorno", false).addField("mensagem", "");
		
		Log.log(this.getClass(), Log.INFOPLUS, "WebServiceApoliceBusiness - Buscando WebService getObterApolice");
		
		try {
			
			String caminhoWebService = getPathWs(idEmprCdEmpresa);
			
			if ((caminhoWebService == "") || (caminhoWebService == null)){
    			Log.log(this.getClass(), Log.INFOPLUS, "WebServiceApoliceBusiness - Não foi possível encontrar o endereço do WebService de Apolice.");
    			throw new Exception("WebServiceApoliceBusiness - Não foi possível encontrar o endereço do WebService de Apolice.");
    		}
    		
			ApoliceWebService ws = getPlusoft(caminhoWebService);
			
	    	if (ws == null){
	    		Log.log(this.getClass(), Log.INFOPLUS, "WebServiceApoliceBusiness - Não foi possível instanciar o ws.");
	    	} else {

	    		this.cachedEndpoint = new URL(caminhoWebService);
	    		this.service = getService(caminhoWebService);
	    		
	    		WsRetornoObterApoliceVO wsApolice = this.obterDadosApolice(entrada);
	    		
	    		if (wsApolice != null) {
	    			if (wsApolice.getCodigoErro() != 0) {
	    				voRetorno.addField("mensagem", "Ocorreu um erro no retorno do webservice." 
	    						+ (!"".equals(wsApolice.getDescricaoErro()) ? "Descrição do Erro: " + wsApolice.getDescricaoErro() : "" ));
	    			} else {
	    				
	    				if (wsApolice.getApolice() != null) {
//	    					wsApolice.getApolice().getEquipamentos(1).get
	    					voRetorno.addField("apolice", wsApolice.getApolice());
		    				voRetorno.addField("retorno", true);		
	    				} else {
	    					voRetorno.addField("mensagem", "Nehnum registro encontrado");
	    				}
	    			}
	    		} else {
	    			voRetorno.addField("mensagem", "Nehnum registro encontrado");
	    		}
	    	}
		} catch (Exception ex) {
			Log.log(this.getClass(), Log.ERRORPLUS, "WebServiceApoliceBusiness - Erro ao executar o metodo getObterApolice(): " + ex.getMessage(), ex);
			voRetorno.addField("mensagem", "Ocorreu um erro na busca das apólices." 
					+ (!"".equals(ex.getMessage()) ? "Descrição do Erro: " + ex.getMessage() : "" ));
		}
		
		return voRetorno;
	}
	
	private Calendar getDataOcorrencia(String dataOcorrenciaSinistro) {
		
		if (dataOcorrenciaSinistro.length() == 0 ) {
			return null;
		}
		
		Datetime data = new Datetime(dataOcorrenciaSinistro, "DD/MM/YYYY HH:MI:SS");
		Calendar dataOcorrenciaCalendar = Calendar.getInstance();
		dataOcorrenciaCalendar.setTimeInMillis(data.getTime());

		return dataOcorrenciaCalendar;
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
