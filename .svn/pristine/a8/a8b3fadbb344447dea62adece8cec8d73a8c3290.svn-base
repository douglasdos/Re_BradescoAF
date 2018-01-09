package br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice;

public class CepWebServiceProxy implements br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebService {
  private String _endpoint = null;
  private br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebService cepWebService = null;
  
  public CepWebServiceProxy() {
    _initCepWebServiceProxy();
  }
  
  public CepWebServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCepWebServiceProxy();
  }
  
  private void _initCepWebServiceProxy() {
    try {
      cepWebService = (new br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebServiceServiceLocator()).getCepWebServicePort();
      if (cepWebService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)cepWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)cepWebService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (cepWebService != null)
      ((javax.xml.rpc.Stub)cepWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebService getCepWebService() {
    if (cepWebService == null)
      _initCepWebServiceProxy();
    return cepWebService;
  }
  
  public br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebServiceResponse obterListaPorLogradouro(java.lang.String uf, java.lang.String cidade, java.lang.String logradouro) throws java.rmi.RemoteException, br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.IntegrationException{
    if (cepWebService == null)
      _initCepWebServiceProxy();
    return cepWebService.obterListaPorLogradouro(uf, cidade, logradouro);
  }
  
  public br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepCompletoWebServiceResponse obterListaLogradouroCompletoPorCep(java.lang.String cepCompleto) throws java.rmi.RemoteException, br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.IntegrationException{
    if (cepWebService == null)
      _initCepWebServiceProxy();
    return cepWebService.obterListaLogradouroCompletoPorCep(cepCompleto);
  }
  
  public br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.TipoLogradouroVO[] obterTipoLogradouro() throws java.rmi.RemoteException, br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.IntegrationException{
    if (cepWebService == null)
      _initCepWebServiceProxy();
    return cepWebService.obterTipoLogradouro();
  }
  
  public br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebServiceResponse obterListaPorCepCompleto(java.lang.String cepCompleto) throws java.rmi.RemoteException, br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.IntegrationException{
    if (cepWebService == null)
      _initCepWebServiceProxy();
    return cepWebService.obterListaPorCepCompleto(cepCompleto);
  }
  
  public br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebServiceResponse obterListaLogradouroPorCep(java.lang.String cepCompleto) throws java.rmi.RemoteException, br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.IntegrationException{
    if (cepWebService == null)
      _initCepWebServiceProxy();
    return cepWebService.obterListaLogradouroPorCep(cepCompleto);
  }
  
  public br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebServiceResponse obterListaPorRaizCep(java.lang.String raizCep) throws java.rmi.RemoteException, br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.IntegrationException{
    if (cepWebService == null)
      _initCepWebServiceProxy();
    return cepWebService.obterListaPorRaizCep(raizCep);
  }
  
  
}