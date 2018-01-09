package br.com.plusoft.csi.bradescoaf.crm.business;

import java.net.URL;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Vector;

import org.apache.axis.AxisFault;
import org.apache.axis.client.Call;

import br.com.bradseg.sare.listarsusursais.canonico.v1.ListarSucursaisRequest;
import br.com.bradseg.sare.listarsusursais.canonico.v1.ListarSucursaisResponse;
import br.com.bradseg.sare.listarsusursais.canonico.v1.ListarSucursais_BindingStub;
import br.com.bradseg.sare.listarsusursais.canonico.v1.ListarSucursais_PortType;
import br.com.bradseg.sare.listarsusursais.canonico.v1.ListarSucursais_Service;
import br.com.bradseg.sare.listarsusursais.canonico.v1.ListarSucursais_ServiceLocator;
import br.com.bradseg.sare.listarsusursais.canonico.v1.SucursaisSucursal;
import br.com.plusoft.csi.adm.helper.AdministracaoCsDmtbConfiguracaoConfHelper;
import br.com.plusoft.csi.adm.helper.generic.GenericHelper;
import br.com.plusoft.csi.bradescoaf.constantes.ConfiguracaoEspec;
import br.com.plusoft.fw.entity.Vo;
import br.com.plusoft.fw.log.Log;


public class WebServiceListarSucursalBusiness extends ListarSucursais_BindingStub{
	
	long idEmprCdEmpresa;
	
	private String xmlEntrada = "";
	private String xmlSaida = "";
	
	public WebServiceListarSucursalBusiness(long idEmprCdEmpresa) throws AxisFault {
		this.idEmprCdEmpresa = idEmprCdEmpresa;
	}
	
	public String getPathWs(long idEmprCdEmpresa) throws Exception {
		GenericHelper gHelper = null;
		String pathWS = new String();
		
		try {
		
			Log.log(this.getClass(), Log.INFOPLUS, "WebServiceSucursalBusiness - getPathWs - Iniciando busca endereço do WebService de Sucursal.");
			
			gHelper = new GenericHelper(idEmprCdEmpresa);
			pathWS = (String) new AdministracaoCsDmtbConfiguracaoConfHelper().findConfiguracao(ConfiguracaoEspec.CONF_BRADESCOAF_URL_WS_LISTA_SUCURSAL, this.idEmprCdEmpresa);
		
		} catch (Exception e) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro ao executar o método - getPathWs(): " + e.getMessage(), e);
			throw e;
		} finally {
			gHelper = null;
		}
		
		 return pathWS;
	}
	
	private ListarSucursais_PortType getPlusoft(String path){
		ListarSucursais_Service service = null;
		ListarSucursais_PortType soap = null;
	    try{
	    	ListarSucursais_ServiceLocator locator = new ListarSucursais_ServiceLocator();
	    	  locator.setEndpointAddress("ListarSucursais", path);
	          service = locator;
	          soap = service.getListarSucursais();
	    } catch (Exception e) {
	    	e.printStackTrace();
	    } finally{
	          service = null;
	    }
	    return soap;
	} 
	
	private ListarSucursais_Service getService(String path){
		ListarSucursais_Service service = null;
	    try{
	    	ListarSucursais_ServiceLocator locator = new ListarSucursais_ServiceLocator();
	    	  locator.setEndpointAddress("ListarSucursais", path);
	          service = locator;
	    } catch (Exception e) {
	    	e.printStackTrace();
	    } 
	    return service;
	} 
	
	@Override
	public ListarSucursaisResponse listarSucursais(
			ListarSucursaisRequest listarSucursaisRequest)
			throws RemoteException {
		
		ListarSucursaisResponse listarSucursaisRetorno = null;
		Calendar dataInicialConsumo = Calendar.getInstance();
		
		try {
			listarSucursaisRetorno = super.listarSucursais(listarSucursaisRequest);
		} finally {
			trataLogWebService(super._call, dataInicialConsumo, "listarSucursais");
		}
		
		return listarSucursaisRetorno;
	}
	
	
	public Vo getSucursais(String estado, String municipio) {
		Vo voRetorno = new Vo().addField("retorno", false).addField("mensagem", "");
		
		Log.log(this.getClass(), Log.INFOPLUS, "WebServiceSucursalBusiness - Buscando WebService getSucursais");
		
		try {
			
			if (estado.length() == 0) {
				voRetorno.addField("mensagem", "O campo 'Estado' é obrigatório");
				return voRetorno;
			}
			
			if (municipio.length() == 0) {
				voRetorno.addField("mensagem", "O campo 'Cidade' é obrigatório");
				return voRetorno;
			}
			
			String caminhoWebService = getPathWs(idEmprCdEmpresa);
			
			if ((caminhoWebService == "") || (caminhoWebService == null)){
    			Log.log(this.getClass(), Log.INFOPLUS, "WebServiceSucursalBusiness - Não foi possível encontrar o endereço do WebService de Lista de Sucursal.");
    			throw new Exception("WebServiceSucursalBusiness - Não foi possível encontrar o endereço do WebService de Lista de Sucursal.");
    		}
    		
			ListarSucursais_PortType ws = getPlusoft(caminhoWebService);
			
	    	if (ws == null){
	    		Log.log(this.getClass(), Log.INFOPLUS, "WebServiceSucursalBusiness - Não foi possível instanciar o ws.");
	    	} else {

	    		this.cachedEndpoint = new URL(caminhoWebService);
	    		this.service = getService(caminhoWebService);
	    		
	    		ListarSucursaisRequest request = new ListarSucursaisRequest(null, estado, municipio);
	    		ListarSucursaisResponse wsResponse = this.listarSucursais(request);
	    		
	    		if (wsResponse != null && wsResponse.getSucursais() != null && wsResponse.getSucursais().length > 0) {
	    			Vector<Vo> vecSucursal = new Vector<Vo>();
	    			for (SucursaisSucursal sucursal : wsResponse.getSucursais()) {
	    				Vo voAdd = new Vo();
	    				voAdd.addField("nome", sucursal.getNome());
	    				voAdd.addField("codigo", sucursal.getCodigo());
	    				voAdd.addField("endereco", sucursal.getEndereco());
	    				voAdd.addField("numero", sucursal.getNumero());
	    				voAdd.addField("complemento", sucursal.getComplemento());
	    				voAdd.addField("cep", sucursal.getCep());
	    				voAdd.addField("bairro", sucursal.getBairro());
	    				voAdd.addField("cidade", municipio);
	    				voAdd.addField("estado", estado);
	    				voAdd.addField("telefone", sucursal.getDdd() > 0 ? sucursal.getDdd().toString() + "-" + sucursal.getTelefone() : sucursal.getTelefone());
	    				vecSucursal.add(voAdd);
					}
	    			
    				voRetorno.addField("listaSucursal", vecSucursal);
    				voRetorno.addField("retorno", true);
	    			
	    		} else {
	    			voRetorno.addField("mensagem", "Nenhum registro encontrado");
	    		}
	    	}
		} catch (Exception ex) {
			Log.log(this.getClass(), Log.ERRORPLUS, "WebServiceSucursalBusiness - Erro ao executar o metodo getSucursais(): " + ex.getMessage(), ex);
			voRetorno.addField("mensagem", "Ocorreu um erro na busca das sucursais." 
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
