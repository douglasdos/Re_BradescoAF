package br.com.bradseg.sare.listarsusursais.canonico.v1;

public class ListarSucursaisProxy implements br.com.bradseg.sare.listarsusursais.canonico.v1.ListarSucursais_PortType {
  private String _endpoint = null;
  private br.com.bradseg.sare.listarsusursais.canonico.v1.ListarSucursais_PortType listarSucursais_PortType = null;
  
  public ListarSucursaisProxy() {
    _initListarSucursaisProxy();
  }
  
  public ListarSucursaisProxy(String endpoint) {
    _endpoint = endpoint;
    _initListarSucursaisProxy();
  }
  
  private void _initListarSucursaisProxy() {
    try {
      listarSucursais_PortType = (new br.com.bradseg.sare.listarsusursais.canonico.v1.ListarSucursais_ServiceLocator()).getListarSucursais();
      if (listarSucursais_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)listarSucursais_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)listarSucursais_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (listarSucursais_PortType != null)
      ((javax.xml.rpc.Stub)listarSucursais_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.bradseg.sare.listarsusursais.canonico.v1.ListarSucursais_PortType getListarSucursais_PortType() {
    if (listarSucursais_PortType == null)
      _initListarSucursaisProxy();
    return listarSucursais_PortType;
  }
  
  public br.com.bradseg.sare.listarsusursais.canonico.v1.ListarSucursaisResponse listarSucursais(br.com.bradseg.sare.listarsusursais.canonico.v1.ListarSucursaisRequest listarSucursaisRequest) throws java.rmi.RemoteException{
    if (listarSucursais_PortType == null)
      _initListarSucursaisProxy();
    return listarSucursais_PortType.listarSucursais(listarSucursaisRequest);
  }
  
  
}