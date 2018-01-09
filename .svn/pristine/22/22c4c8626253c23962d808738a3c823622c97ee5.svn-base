package br.com.bradseg.bucb.central.controller.servicos;

public class BUCBCentralPortTypeProxy implements br.com.bradseg.bucb.central.controller.servicos.BUCBCentralPortType {
  private String _endpoint = null;
  private br.com.bradseg.bucb.central.controller.servicos.BUCBCentralPortType bUCBCentralPortType = null;
  
  public BUCBCentralPortTypeProxy() {
    _initBUCBCentralPortTypeProxy();
  }
  
  public BUCBCentralPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initBUCBCentralPortTypeProxy();
  }
  
  private void _initBUCBCentralPortTypeProxy() {
    try {
      bUCBCentralPortType = (new br.com.bradseg.bucb.central.controller.servicos.BUCBCentralLocator()).getBUCBCentralHttpPort();
      if (bUCBCentralPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bUCBCentralPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bUCBCentralPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bUCBCentralPortType != null)
      ((javax.xml.rpc.Stub)bUCBCentralPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.bradseg.bucb.central.controller.servicos.BUCBCentralPortType getBUCBCentralPortType() {
    if (bUCBCentralPortType == null)
      _initBUCBCentralPortTypeProxy();
    return bUCBCentralPortType;
  }
  
  public br.com.bradseg.bucb.central.model.pessoa.vo.PlusoftUseVOSaida obterDadosVinculoPlusoft(java.lang.String in0, java.lang.String in1, br.com.bradseg.bucb.central.model.pessoa.vo.PlusoftUseVO in2) throws java.rmi.RemoteException, br.com.bradseg.bucb.central.exception.CentralBusinessException, br.com.bradseg.bucb.central.exception.CentralIntegrationException{
    if (bUCBCentralPortType == null)
      _initBUCBCentralPortTypeProxy();
    return bUCBCentralPortType.obterDadosVinculoPlusoft(in0, in1, in2);
  }
  
  public br.com.bradseg.bucb.central.model.pessoa.vo.PlusoftUseVOSaida identificarPessoaUSE(br.com.bradseg.bucb.central.model.pessoa.vo.PlusoftUseVO in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, br.com.bradseg.bucb.central.exception.CentralBusinessException, br.com.bradseg.bucb.central.exception.CentralIntegrationException{
    if (bUCBCentralPortType == null)
      _initBUCBCentralPortTypeProxy();
    return bUCBCentralPortType.identificarPessoaUSE(in0, in1, in2);
  }
  
  public br.com.bradseg.bucb.central.model.pessoa.vo.PlusoftUseVO obterDadosCadastraisPlusoft(br.com.bradseg.bucb.central.model.pessoa.vo.PlusoftUseVO in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, br.com.bradseg.bucb.central.exception.CentralBusinessException, br.com.bradseg.bucb.central.exception.CentralIntegrationException{
    if (bUCBCentralPortType == null)
      _initBUCBCentralPortTypeProxy();
    return bUCBCentralPortType.obterDadosCadastraisPlusoft(in0, in1, in2);
  }
  
  public br.com.bradseg.bucb.central.model.pessoa.vo.PlusoftUseVOSaida identificarPessoaPlusoft(br.com.bradseg.bucb.central.model.pessoa.vo.PlusoftUseVO in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, br.com.bradseg.bucb.central.exception.CentralBusinessException, br.com.bradseg.bucb.central.exception.CentralIntegrationException{
    if (bUCBCentralPortType == null)
      _initBUCBCentralPortTypeProxy();
    return bUCBCentralPortType.identificarPessoaPlusoft(in0, in1, in2);
  }
  
  
}