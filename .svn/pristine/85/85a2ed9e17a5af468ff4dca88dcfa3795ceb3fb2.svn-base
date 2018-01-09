package br.com.bradseg.bucb.servicos.model.service;

public class ContaCorrenteSOAPImplProxy implements br.com.bradseg.bucb.servicos.model.service.ContaCorrenteSOAPImpl {
  private String _endpoint = null;
  private br.com.bradseg.bucb.servicos.model.service.ContaCorrenteSOAPImpl contaCorrenteSOAPImpl = null;
  
  public ContaCorrenteSOAPImplProxy() {
    _initContaCorrenteSOAPImplProxy();
  }
  
  public ContaCorrenteSOAPImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initContaCorrenteSOAPImplProxy();
  }
  
  private void _initContaCorrenteSOAPImplProxy() {
    try {
      contaCorrenteSOAPImpl = (new br.com.bradseg.bucb.servicos.model.service.ContaCorrenteSOAPImplServiceLocator()).getContaCorrenteSOAPImpl();
      if (contaCorrenteSOAPImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)contaCorrenteSOAPImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)contaCorrenteSOAPImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (contaCorrenteSOAPImpl != null)
      ((javax.xml.rpc.Stub)contaCorrenteSOAPImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.bradseg.bucb.servicos.model.service.ContaCorrenteSOAPImpl getContaCorrenteSOAPImpl() {
    if (contaCorrenteSOAPImpl == null)
      _initContaCorrenteSOAPImplProxy();
    return contaCorrenteSOAPImpl;
  }
  
  public br.com.bradseg.bucb.servicos.model.vo.IdentificarCorrentistaSegmentoEmpresaSaidaVO identificarCorrentistaSegmentoEmpresa(java.lang.String ipCliente, java.lang.String userID, long agencia, long cpfCnpj) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException{
    if (contaCorrenteSOAPImpl == null)
      _initContaCorrenteSOAPImplProxy();
    return contaCorrenteSOAPImpl.identificarCorrentistaSegmentoEmpresa(ipCliente, userID, agencia, cpfCnpj);
  }
  
  public br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteVO consultarCorrentistasPorAgenciaContaCorrente(java.lang.String ipCliente, java.lang.String userID, int codigoAgencia, long numeroContaCorrente) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException{
    if (contaCorrenteSOAPImpl == null)
      _initContaCorrenteSOAPImplProxy();
    return contaCorrenteSOAPImpl.consultarCorrentistasPorAgenciaContaCorrente(ipCliente, userID, codigoAgencia, numeroContaCorrente);
  }
  
  public br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteFuncionarioIdBucVO obterContaCorrentePorIdBuc(java.lang.String ipCliente, java.lang.String userID, long idBuc) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException{
    if (contaCorrenteSOAPImpl == null)
      _initContaCorrenteSOAPImplProxy();
    return contaCorrenteSOAPImpl.obterContaCorrentePorIdBuc(ipCliente, userID, idBuc);
  }
  
  public br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteVO consultarDadosCorrentista(java.lang.String ipCliente, java.lang.String userID, long cpfCnpj, int codigoAgencia, long numeroContaCorrente) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException{
    if (contaCorrenteSOAPImpl == null)
      _initContaCorrenteSOAPImplProxy();
    return contaCorrenteSOAPImpl.consultarDadosCorrentista(ipCliente, userID, cpfCnpj, codigoAgencia, numeroContaCorrente);
  }
  
  public br.com.bradseg.bucb.servicos.model.vo.ValidarDadosFuncionarioSinergiaSaidaVO validarDadosFuncionarioSinergia(br.com.bradseg.bucb.servicos.model.vo.ValidarDadosFuncionarioSinergiaEntradaVO validarDadosFuncionarioSinergiaEntradaVO) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException{
    if (contaCorrenteSOAPImpl == null)
      _initContaCorrenteSOAPImplProxy();
    return contaCorrenteSOAPImpl.validarDadosFuncionarioSinergia(validarDadosFuncionarioSinergiaEntradaVO);
  }
  
  public br.com.bradseg.bucb.servicos.model.vo.ListarSubsegmentoRencRespectivasAgenciasSaidaWsVO listarSubsegmentoRencRespectivasAgencias(long cpfCnpj) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException{
    if (contaCorrenteSOAPImpl == null)
      _initContaCorrenteSOAPImplProxy();
    return contaCorrenteSOAPImpl.listarSubsegmentoRencRespectivasAgencias(cpfCnpj);
  }
  
  public java.lang.String validarDadosContaCorrente(java.lang.String ipCliente, java.lang.String userID, br.com.bradseg.bucb.servicos.model.vo.ValidarDadosContaCorrenteVO validarDadosVO) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException{
    if (contaCorrenteSOAPImpl == null)
      _initContaCorrenteSOAPImplProxy();
    return contaCorrenteSOAPImpl.validarDadosContaCorrente(ipCliente, userID, validarDadosVO);
  }
  
  public br.com.bradseg.bucb.servicos.model.vo.ValidarDadosFuncionarioVO validarDadosFuncionario(java.lang.String ipCliente, java.lang.String userID, long matricula, long agencia, long conta) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException{
    if (contaCorrenteSOAPImpl == null)
      _initContaCorrenteSOAPImplProxy();
    return contaCorrenteSOAPImpl.validarDadosFuncionario(ipCliente, userID, matricula, agencia, conta);
  }
  
  public br.com.bradseg.bucb.servicos.model.vo.ListarSegmentacaoProdutoClienteSaidaVO listarHistoricoSegmentacaoProdutoCliente(long cpfCnpj, long agencia, long data) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException{
    if (contaCorrenteSOAPImpl == null)
      _initContaCorrenteSOAPImplProxy();
    return contaCorrenteSOAPImpl.listarHistoricoSegmentacaoProdutoCliente(cpfCnpj, agencia, data);
  }
  
  public br.com.bradseg.bucb.servicos.model.vo.ContaCorrentePorCPFCNPJVO[] listarCorrentistasPorCpfCnpj(int tpConta, long cpfCnpj) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException{
    if (contaCorrenteSOAPImpl == null)
      _initContaCorrenteSOAPImplProxy();
    return contaCorrenteSOAPImpl.listarCorrentistasPorCpfCnpj(tpConta, cpfCnpj);
  }
  
  public boolean validarDVContaCorrente(java.lang.String ipCliente, java.lang.String userID, long cpfCnpj, int codigoAgencia, long numeroContaCorrente, java.lang.String dvContaCorrente) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException{
    if (contaCorrenteSOAPImpl == null)
      _initContaCorrenteSOAPImplProxy();
    return contaCorrenteSOAPImpl.validarDVContaCorrente(ipCliente, userID, cpfCnpj, codigoAgencia, numeroContaCorrente, dvContaCorrente);
  }
  
  public br.com.bradseg.bucb.servicos.model.vo.ListarAgenciaPorCpfCnpjSaidaVO listarAgenciaPorCpfCnpj(long cpfCnpj) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException{
    if (contaCorrenteSOAPImpl == null)
      _initContaCorrenteSOAPImplProxy();
    return contaCorrenteSOAPImpl.listarAgenciaPorCpfCnpj(cpfCnpj);
  }
  
  public br.com.bradseg.bucb.servicos.model.vo.ListaContaCorrenteFuncionarioWsVO obterContaCorrenteFuncionarioPorIDBuc(java.lang.String ipCliente, java.lang.String userID, long idBuc) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException{
    if (contaCorrenteSOAPImpl == null)
      _initContaCorrenteSOAPImplProxy();
    return contaCorrenteSOAPImpl.obterContaCorrenteFuncionarioPorIDBuc(ipCliente, userID, idBuc);
  }
  
  public br.com.bradseg.bucb.servicos.model.vo.PessoaContaCorrenteVO obterDadosCorrentistaIDCRRTT(long idCrrtt) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException{
    if (contaCorrenteSOAPImpl == null)
      _initContaCorrenteSOAPImplProxy();
    return contaCorrenteSOAPImpl.obterDadosCorrentistaIDCRRTT(idCrrtt);
  }
  
  public br.com.bradseg.bucb.servicos.model.vo.ListarCorrentistasPorAgCcSaidaVO listarCorrentistasPorAgCc(br.com.bradseg.bucb.servicos.model.vo.ListarCorrentistasPorAgCcVO listarCorrentistasPorAgCcVO) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException{
    if (contaCorrenteSOAPImpl == null)
      _initContaCorrenteSOAPImplProxy();
    return contaCorrenteSOAPImpl.listarCorrentistasPorAgCc(listarCorrentistasPorAgCcVO);
  }
  
  public br.com.bradseg.bucb.servicos.model.vo.PessoaContaCorrenteVO[] consultarMeioContatoPessoaContaCorrente(java.lang.String ipCliente, java.lang.String userID, br.com.bradseg.bucb.servicos.model.vo.PessoaContaCorrenteEntradaVO pessoaContaCorrente) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException{
    if (contaCorrenteSOAPImpl == null)
      _initContaCorrenteSOAPImplProxy();
    return contaCorrenteSOAPImpl.consultarMeioContatoPessoaContaCorrente(ipCliente, userID, pessoaContaCorrente);
  }
  
  public br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteCpfVO[] consultarContaCorrentePorCPF(java.lang.String ipCliente, java.lang.String userID, long cpfCnpj) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException{
    if (contaCorrenteSOAPImpl == null)
      _initContaCorrenteSOAPImplProxy();
    return contaCorrenteSOAPImpl.consultarContaCorrentePorCPF(ipCliente, userID, cpfCnpj);
  }
  
  public br.com.bradseg.bucb.servicos.model.vo.ListarSegmentacaoProdutoClienteSaidaVO listarSegmentacaoProdutoCliente(long cpfCnpj, long agencia) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException{
    if (contaCorrenteSOAPImpl == null)
      _initContaCorrenteSOAPImplProxy();
    return contaCorrenteSOAPImpl.listarSegmentacaoProdutoCliente(cpfCnpj, agencia);
  }
  
  public br.com.bradseg.bucb.servicos.model.vo.ValidarDVFuncionarioSaidaVO validarContaCorrente(java.lang.String ipCliente, java.lang.String userID, br.com.bradseg.bucb.servicos.model.vo.ValidarDVFuncionarioEntradaVO entrada) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException{
    if (contaCorrenteSOAPImpl == null)
      _initContaCorrenteSOAPImplProxy();
    return contaCorrenteSOAPImpl.validarContaCorrente(ipCliente, userID, entrada);
  }
  
  public br.com.bradseg.bucb.servicos.model.vo.ListarSegmentacoesPOBJeRENCSaidaVO listarSegmentacoesPOBJeRENC(java.lang.String ipCliente, java.lang.String userID, long cpfCnpj, long agencia) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException{
    if (contaCorrenteSOAPImpl == null)
      _initContaCorrenteSOAPImplProxy();
    return contaCorrenteSOAPImpl.listarSegmentacoesPOBJeRENC(ipCliente, userID, cpfCnpj, agencia);
  }
  
  public br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteCpfVO[] obterDadosBaseContaCorrentePorCPF(long tpConta, long cpf) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException{
    if (contaCorrenteSOAPImpl == null)
      _initContaCorrenteSOAPImplProxy();
    return contaCorrenteSOAPImpl.obterDadosBaseContaCorrentePorCPF(tpConta, cpf);
  }
  
  public br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteVO[] consultarContaCorrentePorCPFCNPJ(java.lang.String ipCliente, java.lang.String userID, long cpfCnpj) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException{
    if (contaCorrenteSOAPImpl == null)
      _initContaCorrenteSOAPImplProxy();
    return contaCorrenteSOAPImpl.consultarContaCorrentePorCPFCNPJ(ipCliente, userID, cpfCnpj);
  }
  
  public br.com.bradseg.bucb.servicos.model.vo.IdentificarPessoaCCSaidaVO identificarPessoa(br.com.bradseg.bucb.servicos.model.vo.IdentificarPessoaCCEntradaVO identificarPessoaCCEntradaVO) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException{
    if (contaCorrenteSOAPImpl == null)
      _initContaCorrenteSOAPImplProxy();
    return contaCorrenteSOAPImpl.identificarPessoa(identificarPessoaCCEntradaVO);
  }
  
  public long obterIDBucPorContaCorrenteCpfCnpj(br.com.bradseg.bucb.servicos.model.vo.IDBucPorContaCorrenteCpfCnpjVO IDBucPorContaCorrenteCpfCnpj) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException{
    if (contaCorrenteSOAPImpl == null)
      _initContaCorrenteSOAPImplProxy();
    return contaCorrenteSOAPImpl.obterIDBucPorContaCorrenteCpfCnpj(IDBucPorContaCorrenteCpfCnpj);
  }
  
  
}