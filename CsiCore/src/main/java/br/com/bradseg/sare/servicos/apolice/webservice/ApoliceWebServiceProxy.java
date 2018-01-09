package br.com.bradseg.sare.servicos.apolice.webservice;

public class ApoliceWebServiceProxy implements br.com.bradseg.sare.servicos.apolice.webservice.ApoliceWebService {
  private String _endpoint = null;
  private br.com.bradseg.sare.servicos.apolice.webservice.ApoliceWebService apoliceWebService = null;
  
  public ApoliceWebServiceProxy() {
    _initApoliceWebServiceProxy();
  }
  
  public ApoliceWebServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initApoliceWebServiceProxy();
  }
  
  private void _initApoliceWebServiceProxy() {
    try {
      apoliceWebService = (new br.com.bradseg.sare.servicos.apolice.webservice.ApoliceWebServiceServiceLocator()).getApoliceWebServicePort();
      if (apoliceWebService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)apoliceWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)apoliceWebService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (apoliceWebService != null)
      ((javax.xml.rpc.Stub)apoliceWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.bradseg.sare.servicos.apolice.webservice.ApoliceWebService getApoliceWebService() {
    if (apoliceWebService == null)
      _initApoliceWebServiceProxy();
    return apoliceWebService;
  }
  
  public br.com.bradseg.sare.servicos.apolice.webservice.WsRetornoObterApoliceVO obterDadosApolice(br.com.bradseg.sare.servicos.apolice.webservice.EntradaObterDadosApoliceVO arg0) throws java.rmi.RemoteException{
    if (apoliceWebService == null)
      _initApoliceWebServiceProxy();
    return apoliceWebService.obterDadosApolice(arg0);
  }
  
  public br.com.bradseg.sare.servicos.apolice.webservice.WsRetornoListaApoliceVO listaApolice(br.com.bradseg.sare.servicos.apolice.webservice.EntradaListaApoliceVO arg0) throws java.rmi.RemoteException, br.com.bradseg.sare.servicos.apolice.webservice.BusinessException{
    if (apoliceWebService == null)
      _initApoliceWebServiceProxy();
    return apoliceWebService.listaApolice(arg0);
  }
  
  
}