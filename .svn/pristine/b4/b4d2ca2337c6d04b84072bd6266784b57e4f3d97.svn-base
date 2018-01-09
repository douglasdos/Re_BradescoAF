package br.com.bradseg.sare.listarnaturezas.canonico.v1;

public class ListarNaturezas_PortTypeProxy implements br.com.bradseg.sare.listarnaturezas.canonico.v1.ListarNaturezas_PortType {
  private String _endpoint = null;
  private br.com.bradseg.sare.listarnaturezas.canonico.v1.ListarNaturezas_PortType listarNaturezas_PortType = null;
  
  public ListarNaturezas_PortTypeProxy() {
    _initListarNaturezas_PortTypeProxy();
  }
  
  public ListarNaturezas_PortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initListarNaturezas_PortTypeProxy();
  }
  
  private void _initListarNaturezas_PortTypeProxy() {
    try {
      listarNaturezas_PortType = (new br.com.bradseg.sare.listarnaturezas.canonico.v1.ListarNaturezasLocator()).getListarNaturezas();
      if (listarNaturezas_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)listarNaturezas_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)listarNaturezas_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (listarNaturezas_PortType != null)
      ((javax.xml.rpc.Stub)listarNaturezas_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.bradseg.sare.listarnaturezas.canonico.v1.ListarNaturezas_PortType getListarNaturezas_PortType() {
    if (listarNaturezas_PortType == null)
      _initListarNaturezas_PortTypeProxy();
    return listarNaturezas_PortType;
  }
  
  public br.com.bradseg.sare.listarnaturezas.canonico.v1.ListarNaturezasResponse listarNaturezas(br.com.bradseg.sare.listarnaturezas.canonico.v1.ListarNaturezasRequest listarNaturezasRequest) throws java.rmi.RemoteException{
    if (listarNaturezas_PortType == null)
      _initListarNaturezas_PortTypeProxy();
    return listarNaturezas_PortType.listarNaturezas(listarNaturezasRequest);
  }
  
  
}