package br.com.bradseg.afnd.afinidade.controller.services;

public class AfndWebserviceREPortTypeProxy implements br.com.bradseg.afnd.afinidade.controller.services.AfndWebserviceREPortType {
  private String _endpoint = null;
  private br.com.bradseg.afnd.afinidade.controller.services.AfndWebserviceREPortType afndWebserviceREPortType = null;
  
  public AfndWebserviceREPortTypeProxy() {
    _initAfndWebserviceREPortTypeProxy();
  }
  
  public AfndWebserviceREPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initAfndWebserviceREPortTypeProxy();
  }
  
  private void _initAfndWebserviceREPortTypeProxy() {
    try {
      afndWebserviceREPortType = (new br.com.bradseg.afnd.afinidade.controller.services.AfndWebserviceRELocator()).getAfndWebserviceREHttpPort();
      if (afndWebserviceREPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)afndWebserviceREPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)afndWebserviceREPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (afndWebserviceREPortType != null)
      ((javax.xml.rpc.Stub)afndWebserviceREPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.bradseg.afnd.afinidade.controller.services.AfndWebserviceREPortType getAfndWebserviceREPortType() {
    if (afndWebserviceREPortType == null)
      _initAfndWebserviceREPortTypeProxy();
    return afndWebserviceREPortType;
  }
  
  public br.com.bradseg.afnd.afinidade.model.vo.CertificadosServiceOut buscarEndossoCertificados(br.com.bradseg.afnd.afinidade.model.vo.FiltroServiceVo filtroServiceVo, java.lang.String login) throws java.rmi.RemoteException{
    if (afndWebserviceREPortType == null)
      _initAfndWebserviceREPortTypeProxy();
    return afndWebserviceREPortType.buscarEndossoCertificados(filtroServiceVo, login);
  }
  
  public br.com.bradseg.afnd.afinidade.model.vo.CertificadoServiceOut buscarEndossoCertificado(br.com.bradseg.afnd.afinidade.model.vo.FiltroServiceAfndVo codigoAfinidade, java.lang.String login) throws java.rmi.RemoteException{
    if (afndWebserviceREPortType == null)
      _initAfndWebserviceREPortTypeProxy();
    return afndWebserviceREPortType.buscarEndossoCertificado(codigoAfinidade, login);
  }
  
  
}