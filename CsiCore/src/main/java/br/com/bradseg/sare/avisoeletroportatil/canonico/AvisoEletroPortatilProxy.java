package br.com.bradseg.sare.avisoeletroportatil.canonico;

public class AvisoEletroPortatilProxy implements br.com.bradseg.sare.avisoeletroportatil.canonico.AvisoEletroPortatil_PortType {
  private String _endpoint = null;
  private br.com.bradseg.sare.avisoeletroportatil.canonico.AvisoEletroPortatil_PortType avisoEletroPortatil_PortType = null;
  
  public AvisoEletroPortatilProxy() {
    _initAvisoEletroPortatilProxy();
  }
  
  public AvisoEletroPortatilProxy(String endpoint) {
    _endpoint = endpoint;
    _initAvisoEletroPortatilProxy();
  }
  
  private void _initAvisoEletroPortatilProxy() {
    try {
      avisoEletroPortatil_PortType = (new br.com.bradseg.sare.avisoeletroportatil.canonico.AvisoEletroPortatil_ServiceLocator()).getAvisoEletroPortatil();
      if (avisoEletroPortatil_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)avisoEletroPortatil_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)avisoEletroPortatil_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (avisoEletroPortatil_PortType != null)
      ((javax.xml.rpc.Stub)avisoEletroPortatil_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.bradseg.sare.avisoeletroportatil.canonico.AvisoEletroPortatil_PortType getAvisoEletroPortatil_PortType() {
    if (avisoEletroPortatil_PortType == null)
      _initAvisoEletroPortatilProxy();
    return avisoEletroPortatil_PortType;
  }
  
  public br.com.bradseg.sare.avisoeletroportatil.canonico.v1.IncluirAvisoResponse incluirAviso(br.com.bradseg.sare.avisoeletroportatil.canonico.v1.IncluirAvisoRequest incluirAvisoRequest) throws java.rmi.RemoteException{
    if (avisoEletroPortatil_PortType == null)
      _initAvisoEletroPortatilProxy();
    return avisoEletroPortatil_PortType.incluirAviso(incluirAvisoRequest);
  }
  
  
}