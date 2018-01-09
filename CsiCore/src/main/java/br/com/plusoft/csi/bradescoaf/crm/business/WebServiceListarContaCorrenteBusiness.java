package br.com.plusoft.csi.bradescoaf.crm.business;

import java.net.URL;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Vector;
import java.util.regex.Pattern;

import org.apache.axis.AxisFault;
import org.apache.axis.client.Call;

import br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException;
import br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException;
import br.com.bradseg.bucb.servicos.model.service.ContaCorrenteSOAPImpl;
import br.com.bradseg.bucb.servicos.model.service.ContaCorrenteSOAPImplService;
import br.com.bradseg.bucb.servicos.model.service.ContaCorrenteSOAPImplServiceLocator;
import br.com.bradseg.bucb.servicos.model.service.ContaCorrenteSOAPImplSoapBindingStub;
import br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteCpfVO;
import br.com.plusoft.csi.adm.helper.AdministracaoCsDmtbConfiguracaoConfHelper;
import br.com.plusoft.csi.adm.helper.generic.GenericHelper;
import br.com.plusoft.csi.bradescoaf.constantes.ConfiguracaoEspec;
import br.com.plusoft.fw.entity.Vo;
import br.com.plusoft.fw.log.Log;


public class WebServiceListarContaCorrenteBusiness extends ContaCorrenteSOAPImplSoapBindingStub{
	
	long idEmprCdEmpresa;
	
	private String xmlEntrada = "";
	private String xmlSaida = "";
	
	public WebServiceListarContaCorrenteBusiness(long idEmprCdEmpresa) throws AxisFault {
		this.idEmprCdEmpresa = idEmprCdEmpresa;
	}
	
	public String getPathWs(long idEmprCdEmpresa) throws Exception {
		GenericHelper gHelper = null;
		String pathWS = new String();
		
		try {
		
			Log.log(this.getClass(), Log.INFOPLUS, "WebServiceListarContaCorrenteBusiness - getPathWs - Iniciando busca endereço do WebService Conta Corrente.");
			
			gHelper = new GenericHelper(idEmprCdEmpresa);
			pathWS = (String) new AdministracaoCsDmtbConfiguracaoConfHelper().findConfiguracao(ConfiguracaoEspec.CONF_BRADESCOAF_URL_WS_LISTAR_CONTA_CORRENTE, this.idEmprCdEmpresa);
		
		} catch (Exception e) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro ao executar o método - getPathWs(): " + e.getMessage(), e);
			throw e;
		} finally {
			gHelper = null;
		}
		
		 return pathWS;
	}
	
	private ContaCorrenteSOAPImpl getPlusoft(String path){
		ContaCorrenteSOAPImplService service = null;
		ContaCorrenteSOAPImpl soap = null;
	    try{
	    	ContaCorrenteSOAPImplServiceLocator locator = new ContaCorrenteSOAPImplServiceLocator();
	    	locator.setEndpointAddress("ContaCorrenteSOAPImpl", path);
	        service = locator;
	        soap = service.getContaCorrenteSOAPImpl();
	    } catch (Exception e) {
	    	e.printStackTrace();
	    } finally{
	          service = null;
	    }
	    return soap;
	} 
	
	private ContaCorrenteSOAPImplService getService(String path){
		ContaCorrenteSOAPImplService service = null;
	    try{
	    	ContaCorrenteSOAPImplServiceLocator locator = new ContaCorrenteSOAPImplServiceLocator();
	    	locator.setEndpointAddress("ContaCorrenteSOAPImpl", path);
	        service = locator;
	    } catch (Exception e) {
	    	e.printStackTrace();
	    } 
	    return service;
	}
	
	@Override
	public ContaCorrenteCpfVO[] consultarContaCorrentePorCPF(String ipCliente,
			String userID, long cpfCnpj) throws RemoteException,
			WebServiceBusinessException, WebServiceIntegrationException {
		
		ContaCorrenteCpfVO[] consultarContaCorrentePorCPFRetorno = null;
		Calendar dataInicialConsumo = Calendar.getInstance();
		try {
			consultarContaCorrentePorCPFRetorno = super.consultarContaCorrentePorCPF(ipCliente, userID, cpfCnpj);
		} finally {
			trataLogWebService(super._call, dataInicialConsumo, "consultarContaCorrentePorCPF");
		}
		
		return consultarContaCorrentePorCPFRetorno;
	}
	
	public Vo getConsultarContaCorrentePorCPF(String cpfCnpj) {
		Vo voRetorno = new Vo().addField("retorno", false).addField("mensagem", "");
		
		Log.log(this.getClass(), Log.INFOPLUS, "WebServiceListarContaCorrenteBusiness - Buscando WebService getConsultarContaCorrentePorCPF");
		
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
    			Log.log(this.getClass(), Log.INFOPLUS, "WebServiceListarContaCorrenteBusiness - Não foi possível encontrar o endereço do WebService de Consulta de CPF.");
    			throw new Exception("WebServiceListarContaCorrenteBusiness - Não foi possível encontrar o endereço do WebService de Consulta de CPF.");
    		}
    		
			ContaCorrenteSOAPImpl ws = getPlusoft(caminhoWebService);
			
	    	if (ws == null){
	    		Log.log(this.getClass(), Log.INFOPLUS, "WebServiceListarContaCorrenteBusiness - Não foi possível instanciar o ws.");
	    	} else {

	    		this.cachedEndpoint = new URL(caminhoWebService);
	    		this.service = getService(caminhoWebService);
	    		
	    		ContaCorrenteCpfVO[] lstWsContaCorrente = this.consultarContaCorrentePorCPF("", "", Long.parseLong(cpfCnpj));
	    		
	    		if (lstWsContaCorrente != null && lstWsContaCorrente.length > 0) {
	    			
    				Vector<ContaCorrenteCpfVO> vecContaCorrenteCpfVO = new Vector<ContaCorrenteCpfVO>(); 
    				
					for (ContaCorrenteCpfVO conta : lstWsContaCorrente) {
						vecContaCorrenteCpfVO.add(conta);
					}	
    				
    				voRetorno.addField("contaCorrente", vecContaCorrenteCpfVO);
    				voRetorno.addField("retorno", true);
	    			
	    		} else {
	    			voRetorno.addField("mensagem", "Nehnum registro encontrado");
	    		}
	    	}
		} catch (Exception ex) {
			Log.log(this.getClass(), Log.ERRORPLUS, "WebServiceListarContaCorrenteBusiness - Erro ao executar o metodo getConsultarContaCorrentePorCPF(): " + ((WebServiceBusinessException)ex).getMessage1(), ex);
			voRetorno.addField("mensagem", (!"".equals(((WebServiceBusinessException)ex).getMessage1()) ? ((WebServiceBusinessException)ex).getMessage1() : "" ));
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
