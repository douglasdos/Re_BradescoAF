package br.com.bradseg.sare.listarcausas.canonico.v1;

public class ListarCausasProxy implements br.com.bradseg.sare.listarcausas.canonico.v1.ListarCausas_PortType {
  private String _endpoint = null;
  private br.com.bradseg.sare.listarcausas.canonico.v1.ListarCausas_PortType listarCausas_PortType = null;
  
  public ListarCausasProxy() {
    _initListarCausasProxy();
  }
  
  public ListarCausasProxy(String endpoint) {
    _endpoint = endpoint;
    _initListarCausasProxy();
  }
  
  private void _initListarCausasProxy() {
    try {
      listarCausas_PortType = (new br.com.bradseg.sare.listarcausas.canonico.v1.ListarCausas_ServiceLocator()).getListarCausas();
      if (listarCausas_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)listarCausas_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)listarCausas_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (listarCausas_PortType != null)
      ((javax.xml.rpc.Stub)listarCausas_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.bradseg.sare.listarcausas.canonico.v1.ListarCausas_PortType getListarCausas_PortType() {
    if (listarCausas_PortType == null)
      _initListarCausasProxy();
    return listarCausas_PortType;
  }
  
  public br.com.bradseg.sare.listarcausas.canonico.v1.ListarCausasResponse listarCausas(br.com.bradseg.sare.listarcausas.canonico.v1.ListarCausasRequest listarCausasRequest) throws java.rmi.RemoteException{
    if (listarCausas_PortType == null)
      _initListarCausasProxy();
    return listarCausas_PortType.listarCausas(listarCausasRequest);
  }
  
  
}