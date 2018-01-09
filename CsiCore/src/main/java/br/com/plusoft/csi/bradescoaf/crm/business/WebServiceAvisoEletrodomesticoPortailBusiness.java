package br.com.plusoft.csi.bradescoaf.crm.business;

import java.net.URL;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Vector;

import org.apache.axis.AxisFault;
import org.apache.axis.client.Call;

import br.com.bradseg.sare.avisoeletroportatil.canonico.AvisoEletroPortatil_BindingStub;
import br.com.bradseg.sare.avisoeletroportatil.canonico.AvisoEletroPortatil_PortType;
import br.com.bradseg.sare.avisoeletroportatil.canonico.AvisoEletroPortatil_Service;
import br.com.bradseg.sare.avisoeletroportatil.canonico.AvisoEletroPortatil_ServiceLocator;
import br.com.bradseg.sare.avisoeletroportatil.canonico.v1.Aviso;
import br.com.bradseg.sare.avisoeletroportatil.canonico.v1.DadosIdentificacaoPrograma;
import br.com.bradseg.sare.avisoeletroportatil.canonico.v1.IncluirAvisoRequest;
import br.com.bradseg.sare.avisoeletroportatil.canonico.v1.IncluirAvisoResponse;
import br.com.bradseg.sare.avisoeletroportatil.canonico.v1.RetornoAvisoSinistro;
import br.com.bradseg.sare.listarcausas.canonico.v1.Causa;
import br.com.bradseg.sare.listarcausas.canonico.v1.ListarCausasRequest;
import br.com.bradseg.sare.listarcausas.canonico.v1.ListarCausasResponse;
import br.com.bradseg.sare.listarcausas.canonico.v1.ListarCausas_PortType;
import br.com.bradseg.sare.listarcausas.canonico.v1.ListarCausas_Service;
import br.com.bradseg.sare.listarcausas.canonico.v1.ListarCausas_ServiceLocator;
import br.com.bradseg.sare.servicos.apolice.webservice.WsRetornoListaApoliceVO;
import br.com.plusoft.csi.adm.helper.AdministracaoCsDmtbConfiguracaoConfHelper;
import br.com.plusoft.csi.adm.helper.generic.GenericHelper;
import br.com.plusoft.csi.bradescoaf.constantes.ConfiguracaoEspec;
import br.com.plusoft.fw.entity.Vo;
import br.com.plusoft.fw.log.Log;


public class WebServiceAvisoEletrodomesticoPortailBusiness extends AvisoEletroPortatil_BindingStub {
	
	long idEmprCdEmpresa;
	
	private String xmlEntrada = "";
	private String xmlSaida = "";
	
	public WebServiceAvisoEletrodomesticoPortailBusiness(long idEmprCdEmpresa) throws AxisFault {
		this.idEmprCdEmpresa = idEmprCdEmpresa;
	}
	
	public String getPathWs(long idEmprCdEmpresa) throws Exception {
		GenericHelper gHelper = null;
		String pathWS = new String();
		
		try {
		
			Log.log(this.getClass(), Log.INFOPLUS, "WebServiceAvisoEletroPortatilBusiness - getPathWs - Iniciando busca endereço do WebService de Aviso Eletro Portatil.");
			
			gHelper = new GenericHelper(idEmprCdEmpresa);
			pathWS = (String) new AdministracaoCsDmtbConfiguracaoConfHelper().findConfiguracao(ConfiguracaoEspec.CONF_BRADESCOAF_URL_WS_AVISO_ELETRO_PORTATIL, this.idEmprCdEmpresa);
		
		} catch (Exception e) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro ao executar o método - getPathWs(): " + e.getMessage(), e);
			throw e;
		} finally {
			gHelper = null;
		}
		
		 return pathWS;
	}
	
	private AvisoEletroPortatil_PortType getPlusoft(String path){
		AvisoEletroPortatil_Service service = null;
		AvisoEletroPortatil_PortType soap = null;
	    try{
	    	AvisoEletroPortatil_ServiceLocator locator = new AvisoEletroPortatil_ServiceLocator();
	    	locator.setEndpointAddress("AvisoEletroPortatil", path);
	        service = locator;
	        soap = service.getAvisoEletroPortatil();
	    } catch (Exception e) {
	    	e.printStackTrace();
	    } finally{
	          service = null;
	    }
	    return soap;
	} 
	
	private AvisoEletroPortatil_Service getService(String path){
		AvisoEletroPortatil_Service service = null;
	    try{
	    	AvisoEletroPortatil_ServiceLocator locator = new AvisoEletroPortatil_ServiceLocator();
	    	locator.setEndpointAddress("AvisoEletroPortatil", path);
	        service = locator;
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
	    return service;
	}
	
	@Override
	public IncluirAvisoResponse incluirAviso (
			IncluirAvisoRequest incluirAvisoRequest) throws RemoteException {
		
		IncluirAvisoResponse incluirAvisoRetorno = null;
		Calendar dataInicialConsumo = Calendar.getInstance();
		try {
			incluirAvisoRetorno = super.incluirAviso(incluirAvisoRequest);
		} finally {
			trataLogWebService(super._call, dataInicialConsumo, "incluirAviso");
		}
		return incluirAvisoRetorno;
		
	}
	
	public Vo adicionarAviso(Aviso aviso) {
		Vo voRetorno = new Vo().addField("retorno", false).addField("mensagem", "");
		
		Log.log(this.getClass(), Log.INFOPLUS, "WebServiceAvisoEletroPortatilBusiness - Buscando WebService adicionarAviso");
		
		try {
			
			if (aviso == null) {
				voRetorno.addField("mensagem", "Os campos obrigatórios não foram preenchidos");
				return voRetorno;
			}
			
			String caminhoWebService = getPathWs(idEmprCdEmpresa);
			
			if ((caminhoWebService == "") || (caminhoWebService == null)){
    			Log.log(this.getClass(), Log.INFOPLUS, "WebServiceAvisoEletroPortatilBusiness - Não foi possível encontrar o endereço do WebService de Adicionar Aviso.");
    			throw new Exception("WebServiceAvisoEletroPortatilBusiness - Não foi possível encontrar o endereço do WebService de Adicionar Aviso.");
    		}
    		
			AvisoEletroPortatil_PortType ws = getPlusoft(caminhoWebService);
			
	    	if (ws == null){
	    		voRetorno.addField("mensagem", "Não foi possível instanciar o webservice. Verifique se houve queda de sessão.");
	    		Log.log(this.getClass(), Log.INFOPLUS, "WebServiceAvisoEletroPortatilBusiness - Não foi possível instanciar o webservice. Verifique se houve queda de sessão.");
	    	} else {

	    		this.cachedEndpoint = new URL(caminhoWebService);
	    		this.service = getService(caminhoWebService);
	    		
	    		DadosIdentificacaoPrograma dadosIdentificacao = new DadosIdentificacaoPrograma("0", new Short("1"), new Short("2"));
	    		
	    		IncluirAvisoRequest request = new IncluirAvisoRequest(dadosIdentificacao, aviso);
	    		IncluirAvisoResponse wsResponse = this.incluirAviso(request);
	    		
	    		if (wsResponse != null && wsResponse.getRetorno() != null) {
	    			RetornoAvisoSinistro retorno = wsResponse.getRetorno();
	    			
	    			voRetorno.addField("codigo", retorno.getCodigo());
					voRetorno.addField("codigoSql", retorno.getCodigoSQL());
					voRetorno.addField("mensagem", retorno.getMensagem());
					
    				if (retorno.getCodigo() == 0) {
    					voRetorno.addField("numeroSinistro", retorno.getNumeroSinistro());
    					voRetorno.addField("retorno", true);
    					voRetorno.addField("mensagem", 
    							  "Aviso gravado sem pendência\n" 
    							+ "Aviso de Sinistro Número: " + retorno.getNumeroSinistro() + '\n' 
    							+ "Status: " + "Aviso gravado sem pendência");
    				}
	    		} else {
	    			voRetorno.addField("mensagem", "O comunicado não foi gravado porque o websevice não retornou nenhuma informação.");
	    		}
	    	}
		} catch (Exception ex) {
			Log.log(this.getClass(), Log.ERRORPLUS, "WebServiceAvisoEletroPortatilBusiness - Erro ao executar o metodo adicionarAviso(): " + ex.getMessage(), ex);
			voRetorno.addField("mensagem", "O comunicado não foi gravado." 
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
