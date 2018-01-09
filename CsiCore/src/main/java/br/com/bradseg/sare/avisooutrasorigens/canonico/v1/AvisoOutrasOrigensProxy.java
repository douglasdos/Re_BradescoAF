package br.com.bradseg.sare.avisooutrasorigens.canonico.v1;

public class AvisoOutrasOrigensProxy implements br.com.bradseg.sare.avisooutrasorigens.canonico.v1.AvisoOutrasOrigens_PortType {
  private String _endpoint = null;
  private br.com.bradseg.sare.avisooutrasorigens.canonico.v1.AvisoOutrasOrigens_PortType avisoOutrasOrigens_PortType = null;
  
  public AvisoOutrasOrigensProxy() {
    _initAvisoOutrasOrigensProxy();
  }
  
  public AvisoOutrasOrigensProxy(String endpoint) {
    _endpoint = endpoint;
    _initAvisoOutrasOrigensProxy();
  }
  
  private void _initAvisoOutrasOrigensProxy() {
    try {
      avisoOutrasOrigens_PortType = (new br.com.bradseg.sare.avisooutrasorigens.canonico.v1.AvisoOutrasOrigens_ServiceLocator()).getAvisoOutrasOrigens();
      if (avisoOutrasOrigens_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)avisoOutrasOrigens_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)avisoOutrasOrigens_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (avisoOutrasOrigens_PortType != null)
      ((javax.xml.rpc.Stub)avisoOutrasOrigens_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.bradseg.sare.avisooutrasorigens.canonico.v1.AvisoOutrasOrigens_PortType getAvisoOutrasOrigens_PortType() {
    if (avisoOutrasOrigens_PortType == null)
      _initAvisoOutrasOrigensProxy();
    return avisoOutrasOrigens_PortType;
  }
  
  public br.com.bradseg.sare.avisooutrasorigens.canonico.v1.IncluirAvisoResponse incluirAviso(br.com.bradseg.sare.avisooutrasorigens.canonico.v1.IncluirAvisoRequest incluirAvisoRequest) throws java.rmi.RemoteException{
    if (avisoOutrasOrigens_PortType == null)
      _initAvisoOutrasOrigensProxy();
    return avisoOutrasOrigens_PortType.incluirAviso(incluirAvisoRequest);
  }
  
  
}