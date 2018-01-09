package br.com.plusoft.csi.bradescoaf.crm.business;

import java.net.URL;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Vector;
import java.util.regex.Pattern;

import org.apache.axis.AxisFault;
import org.apache.axis.client.Call;

import br.com.bradseg.bucb.central.controller.servicos.BUCBCentral;
import br.com.bradseg.bucb.central.controller.servicos.BUCBCentralHttpBindingStub;
import br.com.bradseg.bucb.central.controller.servicos.BUCBCentralLocator;
import br.com.bradseg.bucb.central.controller.servicos.BUCBCentralPortType;
import br.com.bradseg.bucb.central.exception.CentralBusinessException;
import br.com.bradseg.bucb.central.exception.CentralIntegrationException;
import br.com.bradseg.bucb.central.model.pessoa.vo.PlusoftUseVO;
import br.com.bradseg.bucb.central.model.pessoa.vo.PlusoftUseVOSaida;
import br.com.bradseg.sare.avisoeletroportatil.canonico.v1.IncluirAvisoResponse;
import br.com.bradseg.sare.servicos.apolice.webservice.ApoliceWebService;
import br.com.bradseg.sare.servicos.apolice.webservice.EntradaListaApoliceVO;
import br.com.bradseg.sare.servicos.apolice.webservice.ListaApoliceVO;
import br.com.bradseg.sare.servicos.apolice.webservice.WsRetornoListaApoliceVO;
import br.com.plusoft.csi.adm.helper.AdministracaoCsDmtbConfiguracaoConfHelper;
import br.com.plusoft.csi.adm.helper.generic.GenericHelper;
import br.com.plusoft.csi.bradescoaf.constantes.ConfiguracaoEspec;
import br.com.plusoft.fw.entity.Vo;
import br.com.plusoft.fw.log.Log;
import br.com.plusoft.fw.util.Datetime;


public class WebServiceBucBusiness extends BUCBCentralHttpBindingStub {
	
	long idEmprCdEmpresa;
	
	private String xmlEntrada = "";
	private String xmlSaida = "";
	
	public WebServiceBucBusiness(long idEmprCdEmpresa) throws AxisFault {
		this.idEmprCdEmpresa = idEmprCdEmpresa;
	}
	
	public String getPathWs(long idEmprCdEmpresa) throws Exception {
		GenericHelper gHelper = null;
		String pathWS = new String();
		
		try {
		
			Log.log(this.getClass(), Log.INFOPLUS, "WebServiceApoliceBusiness - getPathWs - Iniciando busca endereço do WebService de Pessoa BUC.");
			
			gHelper = new GenericHelper(idEmprCdEmpresa);
			pathWS = (String) new AdministracaoCsDmtbConfiguracaoConfHelper().findConfiguracao(ConfiguracaoEspec.CONF_BRADESCOAF_URL_WS_PESSOA_BUC_RE, this.idEmprCdEmpresa);
		
		} catch (Exception e) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro ao executar o método - getPathWs(): " + e.getMessage(), e);
			throw e;
		} finally {
			gHelper = null;
		}
		
		 return pathWS;
	}
	
	private BUCBCentralPortType getPlusoft(String path){
		BUCBCentral service = null;
		BUCBCentralPortType soap = null;
	    try{
	    	BUCBCentralLocator locator = new BUCBCentralLocator();
	    	  locator.setBUCBCentralHttpPortEndpointAddress(path);
	          service = locator;
	          soap = service.getBUCBCentralHttpPort();
	    } catch (Exception e) {
	    	e.printStackTrace();
	    } finally{
	          service = null;
	    }
	    return soap;
	} 
	
	private BUCBCentral getService(String path){
		BUCBCentral service = null;
	    try{
	    	BUCBCentralLocator locator = new BUCBCentralLocator();
	    	  locator.setBUCBCentralHttpPortEndpointAddress(path);
	          service = locator;
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
	    
	    return service;
	} 
	
	@Override
	public PlusoftUseVOSaida identificarPessoaUSE(PlusoftUseVO in0, String in1,
			String in2) throws RemoteException, CentralBusinessException,
			CentralIntegrationException {
		
		PlusoftUseVOSaida identificarPessoaUSERetorno = null;
		Calendar dataInicialConsumo = Calendar.getInstance();
		
		try {
			identificarPessoaUSERetorno = super.identificarPessoaUSE(in0, in1, in2); 
		} finally {
			trataLogWebService(super._call, dataInicialConsumo, "identificarPessoaUSE");
		}
		return identificarPessoaUSERetorno;
	}
	
	public Vo getPessoaUse(String cpfCnpj,String nomePessoa) {
		Vo voRetorno = new Vo().addField("retorno", false).addField("mensagem", "");
		
		Log.log(this.getClass(), Log.INFOPLUS, "WebServiceBucBusiness - Buscando WebService getPessoaUse");
		
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
    			Log.log(this.getClass(), Log.INFOPLUS, "WebServiceBucBusiness - Não foi possível encontrar o endereço do WebService de Identificação.");
    			throw new Exception("WebServiceBucBusiness - Não foi possível encontrar o endereço do WebService de Identificação.");
    		}
    		
			BUCBCentralPortType ws = getPlusoft(caminhoWebService);
			
	    	if (ws == null){
	    		Log.log(this.getClass(), Log.INFOPLUS, "WebServiceBucBusiness - Não foi possível instanciar o ws.");
	    	} else {
	    		try {
	    			
	    			this.cachedEndpoint = new URL(caminhoWebService);
		    		this.service = getService(caminhoWebService);
	    			
	    			PlusoftUseVO entrada = new PlusoftUseVO();
		    		entrada.setCodigoTipoPesquisa(new Long(1));
		    		entrada.setCodigoTipoPessoa(cpfCnpj.length() > 11 ? new Long(4) : new Long(3));
		    		
//		    		cpfCnpj="04751039717";
//		    		nomePessoa= "";
		    		
		    		entrada.setCpfCgc(cpfCnpj);
		    		
		    		
		    		if (!"".equals(nomePessoa)) {
		    			entrada.setNomePessoa(nomePessoa);	
		    		}
		    		
		    		PlusoftUseVOSaida pessoaUse = this.identificarPessoaUSE(entrada, "", "");
		    		
		    		if (pessoaUse != null) {

	    				Vector<PlusoftUseVO> vecListaPessoaBuc = new Vector<PlusoftUseVO>(); 
	    				
	    				if (pessoaUse.getListaPlusoftUseVO() != null && pessoaUse.getListaPlusoftUseVO().length > 0) {
	    					for (PlusoftUseVO pessoa : pessoaUse.getListaPlusoftUseVO()) {
	    						vecListaPessoaBuc.add(pessoa);
							}	
	    				}
	    				
	    				if (vecListaPessoaBuc != null && vecListaPessoaBuc.size() > 0) {
	    					voRetorno.addField("listaPessoaUse", vecListaPessoaBuc);
		    				voRetorno.addField("retorno", true);	
	    				} else {
	    					voRetorno.addField("mensagem", "Nenhum registro encontrado");
	    				}
	    			}

				} catch (Exception e) {
					voRetorno.addField("mensagem", "Ocorreu um erro no retorno do webservice." 
    						+ (!"".equals(e.getMessage()) ? "Descrição do Erro: " + e.getMessage() : "" ));
				}
	    		
	    		
	    	}
		} catch (Exception e) {
			Log.log(this.getClass(), Log.ERRORPLUS, "WebServiceBucBusiness - Erro ao executar o metodo getPessoaUse(): " + e.getMessage(), e);
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
