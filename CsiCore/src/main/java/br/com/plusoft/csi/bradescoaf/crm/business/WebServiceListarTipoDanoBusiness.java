package br.com.plusoft.csi.bradescoaf.crm.business;

import java.net.URL;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Vector;

import org.apache.axis.AxisFault;
import org.apache.axis.client.Call;

import br.com.bradseg.sare.listartipodanos.canonico.v1.IdentificadorPrograma;
import br.com.bradseg.sare.listartipodanos.canonico.v1.ListarTipoDanosRequest;
import br.com.bradseg.sare.listartipodanos.canonico.v1.ListarTipoDanosResponse;
import br.com.bradseg.sare.listartipodanos.canonico.v1.ListarTipoDanos_BindingStub;
import br.com.bradseg.sare.listartipodanos.canonico.v1.ListarTipoDanos_PortType;
import br.com.bradseg.sare.listartipodanos.canonico.v1.ListarTipoDanos_Service;
import br.com.bradseg.sare.listartipodanos.canonico.v1.ListarTipoDanos_ServiceLocator;
import br.com.bradseg.sare.listartipodanos.canonico.v1.TipoDanosTipoDano;
import br.com.plusoft.csi.adm.helper.AdministracaoCsDmtbConfiguracaoConfHelper;
import br.com.plusoft.csi.adm.helper.generic.GenericHelper;
import br.com.plusoft.csi.bradescoaf.constantes.ConfiguracaoEspec;
import br.com.plusoft.fw.entity.Vo;
import br.com.plusoft.fw.log.Log;


public class WebServiceListarTipoDanoBusiness extends ListarTipoDanos_BindingStub{
	
	long idEmprCdEmpresa;
	
	private String xmlEntrada = "";
	private String xmlSaida = "";
	
	public WebServiceListarTipoDanoBusiness(long idEmprCdEmpresa) throws AxisFault {
		this.idEmprCdEmpresa = idEmprCdEmpresa;
	}
	
	public String getPathWs(long idEmprCdEmpresa) throws Exception {
		GenericHelper gHelper = null;
		String pathWS = new String();
		
		try {
		
			Log.log(this.getClass(), Log.INFOPLUS, "WebServiceListarTipoDanosBusiness - getPathWs - Iniciando busca endereço do WebService de Tipo de Dano.");
			
			gHelper = new GenericHelper(idEmprCdEmpresa);
			pathWS = (String) new AdministracaoCsDmtbConfiguracaoConfHelper().findConfiguracao(ConfiguracaoEspec.CONF_BRADESCOAF_URL_WS_LISTAR_TIPO_DANOS, this.idEmprCdEmpresa);
		
		} catch (Exception e) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro ao executar o método - getPathWs(): " + e.getMessage(), e);
			throw e;
		} finally {
			gHelper = null;
		}
		
		 return pathWS;
	}
	
	private ListarTipoDanos_PortType getPlusoft(String path){
		ListarTipoDanos_Service service = null;
		ListarTipoDanos_PortType soap = null;
	    try{
	    	ListarTipoDanos_ServiceLocator locator = new ListarTipoDanos_ServiceLocator();
	    	locator.setEndpointAddress("ListarTipoDanos", path);
	        service = locator;
	        soap = service.getListarTipoDanos();
	    } catch (Exception e) {
	    	e.printStackTrace();
	    } finally{
	          service = null;
	    }
	    return soap;
	} 
	
	private ListarTipoDanos_Service getService(String path){
		ListarTipoDanos_Service service = null;
	    try{
	    	ListarTipoDanos_ServiceLocator locator = new ListarTipoDanos_ServiceLocator();
	    	locator.setEndpointAddress("ListarTipoDanos", path);
	        service = locator;
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
	    return service;
	}
	
	@Override
	public ListarTipoDanosResponse listarTipoDanos(
			ListarTipoDanosRequest listarTipoDanosRequest)
			throws RemoteException {
		
		ListarTipoDanosResponse listarTipoDanosRetorno = null;
		Calendar dataInicialConsumo = Calendar.getInstance();
		
		try {
			listarTipoDanosRetorno = super.listarTipoDanos(listarTipoDanosRequest);
		} finally {
			trataLogWebService(super._call, dataInicialConsumo, "listarTipoDanos");
		}
		
		return listarTipoDanosRetorno;
	}
	
	public Vo getListarTipoDanos(Integer categoria) {
		Vo voRetorno = new Vo().addField("retorno", false).addField("mensagem", "");
		
		Log.log(this.getClass(), Log.INFOPLUS, "WebServiceListarTipoDanosBusiness - Buscando WebService getListarTipoDanos");
		
		try {
			
			if (categoria < 1) {
				voRetorno.addField("mensagem", "O campo 'Categoria' é obrigatório");
				return voRetorno;
			}
			
			String caminhoWebService = getPathWs(idEmprCdEmpresa);
			
			if ((caminhoWebService == "") || (caminhoWebService == null)){
    			Log.log(this.getClass(), Log.INFOPLUS, "WebServiceListarTipoDanosBusiness - Não foi possível encontrar o endereço do WebService de Listar Tipo de Dados.");
    			throw new Exception("WebServiceListarTipoDanosBusiness - Não foi possível encontrar o endereço do WebService de Listar Tipo de Dados.");
    		}
    		
			ListarTipoDanos_PortType ws = getPlusoft(caminhoWebService);
			
	    	if (ws == null){
	    		Log.log(this.getClass(), Log.INFOPLUS, "WebServiceListarTipoDanosBusiness - Não foi possível instanciar o ws.");
	    	} else {

	    		this.cachedEndpoint = new URL(caminhoWebService);
	    		this.service = getService(caminhoWebService);
	    		
	    		ListarTipoDanosRequest request = new ListarTipoDanosRequest(new IdentificadorPrograma(), categoria);
	    		ListarTipoDanosResponse wsResponse = this.listarTipoDanos(request);
	    		
	    		if (wsResponse != null && wsResponse.getTipoDanos() != null && wsResponse.getTipoDanos().length > 0) {
	    			Vector<Vo> vecTipoDanos = new Vector<Vo>();
	    			for (TipoDanosTipoDano tipoDanos : wsResponse.getTipoDanos()) {
	    				Vo voAdd = new Vo();
	    				voAdd.addField("codigo", tipoDanos.getCodigo());
	    				voAdd.addField("descricao", tipoDanos.getDescricao());
	    				vecTipoDanos.add(voAdd);
					}
	    			
    				voRetorno.addField("listarTipoDanos", vecTipoDanos);
    				voRetorno.addField("retorno", true);
	    			
	    		} else {
	    			voRetorno.addField("mensagem", "Nenhum registro encontrado");
	    		}
	    	}
		} catch (Exception ex) {
			Log.log(this.getClass(), Log.ERRORPLUS, "WebServiceListarTipoDanosBusiness - Erro ao executar o metodo getListarTipoDanos(): " + ex.getMessage(), ex);
			voRetorno.addField("mensagem", "Ocorreu um erro na busca dos Tipos de Danos." 
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
