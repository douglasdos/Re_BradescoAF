package br.com.bradseg.sare.listartipodanos.canonico.v1;

public class ListarTipoDanosProxy implements br.com.bradseg.sare.listartipodanos.canonico.v1.ListarTipoDanos_PortType {
  private String _endpoint = null;
  private br.com.bradseg.sare.listartipodanos.canonico.v1.ListarTipoDanos_PortType listarTipoDanos_PortType = null;
  
  public ListarTipoDanosProxy() {
    _initListarTipoDanosProxy();
  }
  
  public ListarTipoDanosProxy(String endpoint) {
    _endpoint = endpoint;
    _initListarTipoDanosProxy();
  }
  
  private void _initListarTipoDanosProxy() {
    try {
      listarTipoDanos_PortType = (new br.com.bradseg.sare.listartipodanos.canonico.v1.ListarTipoDanos_ServiceLocator()).getListarTipoDanos();
      if (listarTipoDanos_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)listarTipoDanos_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)listarTipoDanos_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (listarTipoDanos_PortType != null)
      ((javax.xml.rpc.Stub)listarTipoDanos_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.bradseg.sare.listartipodanos.canonico.v1.ListarTipoDanos_PortType getListarTipoDanos_PortType() {
    if (listarTipoDanos_PortType == null)
      _initListarTipoDanosProxy();
    return listarTipoDanos_PortType;
  }
  
  public br.com.bradseg.sare.listartipodanos.canonico.v1.ListarTipoDanosResponse listarTipoDanos(br.com.bradseg.sare.listartipodanos.canonico.v1.ListarTipoDanosRequest listarTipoDanosRequest) throws java.rmi.RemoteException{
    if (listarTipoDanos_PortType == null)
      _initListarTipoDanosProxy();
    return listarTipoDanos_PortType.listarTipoDanos(listarTipoDanosRequest);
  }
  
  
}