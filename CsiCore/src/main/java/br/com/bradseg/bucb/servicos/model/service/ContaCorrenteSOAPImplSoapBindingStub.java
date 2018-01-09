/**
 * ContaCorrenteSOAPImplSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.bucb.servicos.model.service;

public class ContaCorrenteSOAPImplSoapBindingStub extends org.apache.axis.client.Stub implements br.com.bradseg.bucb.servicos.model.service.ContaCorrenteSOAPImpl {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[24];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("identificarCorrentistaSegmentoEmpresa");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ipCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "agencia"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cpfCnpj"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "IdentificarCorrentistaSegmentoEmpresaSaidaVO"));
        oper.setReturnClass(br.com.bradseg.bucb.servicos.model.vo.IdentificarCorrentistaSegmentoEmpresaSaidaVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "identificarCorrentistaSegmentoEmpresaReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarCorrentistasPorAgenciaContaCorrente");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ipCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoAgencia"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "numeroContaCorrente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ContaCorrenteVO"));
        oper.setReturnClass(br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "consultarCorrentistasPorAgenciaContaCorrenteReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obterContaCorrentePorIdBuc");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ipCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idBuc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ContaCorrenteFuncionarioIdBucVO"));
        oper.setReturnClass(br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteFuncionarioIdBucVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "obterContaCorrentePorIdBucReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarDadosCorrentista");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ipCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cpfCnpj"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoAgencia"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "numeroContaCorrente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ContaCorrenteVO"));
        oper.setReturnClass(br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "consultarDadosCorrentistaReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validarDadosFuncionarioSinergia");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "validarDadosFuncionarioSinergiaEntradaVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ValidarDadosFuncionarioSinergiaEntradaVO"), br.com.bradseg.bucb.servicos.model.vo.ValidarDadosFuncionarioSinergiaEntradaVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ValidarDadosFuncionarioSinergiaSaidaVO"));
        oper.setReturnClass(br.com.bradseg.bucb.servicos.model.vo.ValidarDadosFuncionarioSinergiaSaidaVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "validarDadosFuncionarioSinergiaReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listarSubsegmentoRencRespectivasAgencias");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cpfCnpj"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ListarSubsegmentoRencRespectivasAgenciasSaidaWsVO"));
        oper.setReturnClass(br.com.bradseg.bucb.servicos.model.vo.ListarSubsegmentoRencRespectivasAgenciasSaidaWsVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "listarSubsegmentoRencRespectivasAgenciasReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validarDadosContaCorrente");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ipCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "validarDadosVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ValidarDadosContaCorrenteVO"), br.com.bradseg.bucb.servicos.model.vo.ValidarDadosContaCorrenteVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "validarDadosContaCorrenteReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validarDadosFuncionario");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ipCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "matricula"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "agencia"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "conta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ValidarDadosFuncionarioVO"));
        oper.setReturnClass(br.com.bradseg.bucb.servicos.model.vo.ValidarDadosFuncionarioVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "validarDadosFuncionarioReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listarHistoricoSegmentacaoProdutoCliente");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cpfCnpj"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "agencia"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "data"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ListarSegmentacaoProdutoClienteSaidaVO"));
        oper.setReturnClass(br.com.bradseg.bucb.servicos.model.vo.ListarSegmentacaoProdutoClienteSaidaVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "listarHistoricoSegmentacaoProdutoClienteReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listarCorrentistasPorCpfCnpj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tpConta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cpfCnpj"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.model.servicos.bucb.bradseg.com.br", "ArrayOf_1799424901_nillable_ContaCorrentePorCPFCNPJVO"));
        oper.setReturnClass(br.com.bradseg.bucb.servicos.model.vo.ContaCorrentePorCPFCNPJVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "listarCorrentistasPorCpfCnpjReturn"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "ContaCorrentePorCPFCNPJVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validarDVContaCorrente");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ipCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cpfCnpj"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoAgencia"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "numeroContaCorrente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dvContaCorrente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "validarDVContaCorrenteReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listarAgenciaPorCpfCnpj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cpfCnpj"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ListarAgenciaPorCpfCnpjSaidaVO"));
        oper.setReturnClass(br.com.bradseg.bucb.servicos.model.vo.ListarAgenciaPorCpfCnpjSaidaVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "listarAgenciaPorCpfCnpjReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obterContaCorrenteFuncionarioPorIDBuc");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ipCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idBuc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ListaContaCorrenteFuncionarioWsVO"));
        oper.setReturnClass(br.com.bradseg.bucb.servicos.model.vo.ListaContaCorrenteFuncionarioWsVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "obterContaCorrenteFuncionarioPorIDBucReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obterDadosCorrentistaIDCRRTT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idCrrtt"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "PessoaContaCorrenteVO"));
        oper.setReturnClass(br.com.bradseg.bucb.servicos.model.vo.PessoaContaCorrenteVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "obterDadosCorrentistaIDCRRTTReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listarCorrentistasPorAgCc");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "listarCorrentistasPorAgCcVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ListarCorrentistasPorAgCcVO"), br.com.bradseg.bucb.servicos.model.vo.ListarCorrentistasPorAgCcVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ListarCorrentistasPorAgCcSaidaVO"));
        oper.setReturnClass(br.com.bradseg.bucb.servicos.model.vo.ListarCorrentistasPorAgCcSaidaVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "listarCorrentistasPorAgCcReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarMeioContatoPessoaContaCorrente");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ipCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pessoaContaCorrente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "PessoaContaCorrenteEntradaVO"), br.com.bradseg.bucb.servicos.model.vo.PessoaContaCorrenteEntradaVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.model.servicos.bucb.bradseg.com.br", "ArrayOf_1799424901_nillable_PessoaContaCorrenteVO"));
        oper.setReturnClass(br.com.bradseg.bucb.servicos.model.vo.PessoaContaCorrenteVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "consultarMeioContatoPessoaContaCorrenteReturn"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "PessoaContaCorrenteVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarContaCorrentePorCPF");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ipCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cpfCnpj"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.model.servicos.bucb.bradseg.com.br", "ArrayOf_1799424901_nillable_ContaCorrenteCpfVO"));
        oper.setReturnClass(br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteCpfVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "consultarContaCorrentePorCPFReturn"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "ContaCorrenteCpfVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listarSegmentacaoProdutoCliente");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cpfCnpj"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "agencia"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ListarSegmentacaoProdutoClienteSaidaVO"));
        oper.setReturnClass(br.com.bradseg.bucb.servicos.model.vo.ListarSegmentacaoProdutoClienteSaidaVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "listarSegmentacaoProdutoClienteReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validarContaCorrente");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ipCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "entrada"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ValidarDVFuncionarioEntradaVO"), br.com.bradseg.bucb.servicos.model.vo.ValidarDVFuncionarioEntradaVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ValidarDVFuncionarioSaidaVO"));
        oper.setReturnClass(br.com.bradseg.bucb.servicos.model.vo.ValidarDVFuncionarioSaidaVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "validarContaCorrenteReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listarSegmentacoesPOBJeRENC");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ipCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cpfCnpj"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "agencia"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ListarSegmentacoesPOBJeRENCSaidaVO"));
        oper.setReturnClass(br.com.bradseg.bucb.servicos.model.vo.ListarSegmentacoesPOBJeRENCSaidaVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "listarSegmentacoesPOBJeRENCReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obterDadosBaseContaCorrentePorCPF");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tpConta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cpf"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.model.servicos.bucb.bradseg.com.br", "ArrayOf_1799424901_nillable_ContaCorrenteCpfVO"));
        oper.setReturnClass(br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteCpfVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "obterDadosBaseContaCorrentePorCPFReturn"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "ContaCorrenteCpfVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarContaCorrentePorCPFCNPJ");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ipCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cpfCnpj"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.model.servicos.bucb.bradseg.com.br", "ArrayOf_1799424901_nillable_ContaCorrenteVO"));
        oper.setReturnClass(br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "consultarContaCorrentePorCPFCNPJReturn"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "ContaCorrenteVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("identificarPessoa");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "identificarPessoaCCEntradaVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "IdentificarPessoaCCEntradaVO"), br.com.bradseg.bucb.servicos.model.vo.IdentificarPessoaCCEntradaVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "IdentificarPessoaCCSaidaVO"));
        oper.setReturnClass(br.com.bradseg.bucb.servicos.model.vo.IdentificarPessoaCCSaidaVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "identificarPessoaReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obterIDBucPorContaCorrenteCpfCnpj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "IDBucPorContaCorrenteCpfCnpj"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "IDBucPorContaCorrenteCpfCnpjVO"), br.com.bradseg.bucb.servicos.model.vo.IDBucPorContaCorrenteCpfCnpjVO.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "obterIDBucPorContaCorrenteCpfCnpjReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"),
                      "br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException",
                      new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException"), 
                      true
                     ));
        _operations[23] = oper;

    }

    public ContaCorrenteSOAPImplSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ContaCorrenteSOAPImplSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ContaCorrenteSOAPImplSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "ArrayOf_143104033_nillable_string");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "string");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceBusinessException");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://exception.model.servicos.bucb.bradseg.com.br", "WebServiceIntegrationException");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.model.servicos.bucb.bradseg.com.br", "ArrayOf_1799424901_nillable_ContaCorrenteCpfVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteCpfVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ContaCorrenteCpfVO");
            qName2 = new javax.xml.namespace.QName("", "ContaCorrenteCpfVO");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.model.servicos.bucb.bradseg.com.br", "ArrayOf_1799424901_nillable_ContaCorrentePorCPFCNPJVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.vo.ContaCorrentePorCPFCNPJVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ContaCorrentePorCPFCNPJVO");
            qName2 = new javax.xml.namespace.QName("", "ContaCorrentePorCPFCNPJVO");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.model.servicos.bucb.bradseg.com.br", "ArrayOf_1799424901_nillable_ContaCorrenteVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ContaCorrenteVO");
            qName2 = new javax.xml.namespace.QName("", "ContaCorrenteVO");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://service.model.servicos.bucb.bradseg.com.br", "ArrayOf_1799424901_nillable_PessoaContaCorrenteVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.vo.PessoaContaCorrenteVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "PessoaContaCorrenteVO");
            qName2 = new javax.xml.namespace.QName("", "PessoaContaCorrenteVO");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "AgenciaSegmentosVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.vo.AgenciaSegmentosVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ArrayOf_1780141165_nillable_long");
            cachedSerQNames.add(qName);
            cls = long[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
            qName2 = new javax.xml.namespace.QName("", "long");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ArrayOfAgenciaSegmentosVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.vo.AgenciaSegmentosVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "AgenciaSegmentosVO");
            qName2 = new javax.xml.namespace.QName("", "AgenciaSegmentosVO");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ArrayOfContaCorrenteFuncionarioVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteFuncionarioVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ContaCorrenteFuncionarioVO");
            qName2 = new javax.xml.namespace.QName("", "ContaCorrenteFuncionarioVO");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ArrayOfContaCorrenteIdBucVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteIdBucVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ContaCorrenteIdBucVO");
            qName2 = new javax.xml.namespace.QName("", "ContaCorrenteIdBucVO");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ArrayOfCorrentistasPorFiltrosVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.vo.CorrentistasPorFiltrosVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "CorrentistasPorFiltrosVO");
            qName2 = new javax.xml.namespace.QName("", "CorrentistasPorFiltrosVO");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ArrayOfCorrentistaVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.vo.CorrentistaVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "CorrentistaVO");
            qName2 = new javax.xml.namespace.QName("", "CorrentistaVO");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ContaCorrenteCpfVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteCpfVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ContaCorrenteFuncionarioIdBucVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteFuncionarioIdBucVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ContaCorrenteFuncionarioVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteFuncionarioVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ContaCorrenteIdBucVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteIdBucVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ContaCorrentePorCPFCNPJVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.vo.ContaCorrentePorCPFCNPJVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ContaCorrenteVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "CorrentistasPorFiltrosVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.vo.CorrentistasPorFiltrosVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "CorrentistaVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.vo.CorrentistaVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "IDBucPorContaCorrenteCpfCnpjVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.vo.IDBucPorContaCorrenteCpfCnpjVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "IdentificarCorrentistaSegmentoEmpresaSaidaVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.vo.IdentificarCorrentistaSegmentoEmpresaSaidaVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "IdentificarPessoaCCEntradaVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.vo.IdentificarPessoaCCEntradaVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "IdentificarPessoaCCSaidaVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.vo.IdentificarPessoaCCSaidaVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ListaContaCorrenteFuncionarioWsVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.vo.ListaContaCorrenteFuncionarioWsVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ListarAgenciaPorCpfCnpjSaidaVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.vo.ListarAgenciaPorCpfCnpjSaidaVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ListarCorrentistasPorAgCcSaidaVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.vo.ListarCorrentistasPorAgCcSaidaVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ListarCorrentistasPorAgCcVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.vo.ListarCorrentistasPorAgCcVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ListarSegmentacaoProdutoClienteSaidaVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.vo.ListarSegmentacaoProdutoClienteSaidaVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ListarSegmentacoesPOBJeRENCSaidaVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.vo.ListarSegmentacoesPOBJeRENCSaidaVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ListarSubsegmentoRencRespectivasAgenciasSaidaWsVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.vo.ListarSubsegmentoRencRespectivasAgenciasSaidaWsVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "PessoaContaCorrenteEntradaVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.vo.PessoaContaCorrenteEntradaVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "PessoaContaCorrenteVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.vo.PessoaContaCorrenteVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ValidarDadosContaCorrenteVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.vo.ValidarDadosContaCorrenteVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ValidarDadosFuncionarioSinergiaEntradaVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.vo.ValidarDadosFuncionarioSinergiaEntradaVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ValidarDadosFuncionarioSinergiaSaidaVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.vo.ValidarDadosFuncionarioSinergiaSaidaVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ValidarDadosFuncionarioVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.vo.ValidarDadosFuncionarioVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ValidarDVFuncionarioEntradaVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.vo.ValidarDVFuncionarioEntradaVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ValidarDVFuncionarioSaidaVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.bucb.servicos.model.vo.ValidarDVFuncionarioSaidaVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public br.com.bradseg.bucb.servicos.model.vo.IdentificarCorrentistaSegmentoEmpresaSaidaVO identificarCorrentistaSegmentoEmpresa(java.lang.String ipCliente, java.lang.String userID, long agencia, long cpfCnpj) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("identificarCorrentistaSegmentoEmpresa");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.model.servicos.bucb.bradseg.com.br", "identificarCorrentistaSegmentoEmpresa"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ipCliente, userID, new java.lang.Long(agencia), new java.lang.Long(cpfCnpj)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.bradseg.bucb.servicos.model.vo.IdentificarCorrentistaSegmentoEmpresaSaidaVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.bradseg.bucb.servicos.model.vo.IdentificarCorrentistaSegmentoEmpresaSaidaVO) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.bradseg.bucb.servicos.model.vo.IdentificarCorrentistaSegmentoEmpresaSaidaVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteVO consultarCorrentistasPorAgenciaContaCorrente(java.lang.String ipCliente, java.lang.String userID, int codigoAgencia, long numeroContaCorrente) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("consultarCorrentistasPorAgenciaContaCorrente");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.model.servicos.bucb.bradseg.com.br", "consultarCorrentistasPorAgenciaContaCorrente"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ipCliente, userID, new java.lang.Integer(codigoAgencia), new java.lang.Long(numeroContaCorrente)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteVO) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteFuncionarioIdBucVO obterContaCorrentePorIdBuc(java.lang.String ipCliente, java.lang.String userID, long idBuc) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("obterContaCorrentePorIdBuc");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.model.servicos.bucb.bradseg.com.br", "obterContaCorrentePorIdBuc"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ipCliente, userID, new java.lang.Long(idBuc)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteFuncionarioIdBucVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteFuncionarioIdBucVO) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteFuncionarioIdBucVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteVO consultarDadosCorrentista(java.lang.String ipCliente, java.lang.String userID, long cpfCnpj, int codigoAgencia, long numeroContaCorrente) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("consultarDadosCorrentista");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.model.servicos.bucb.bradseg.com.br", "consultarDadosCorrentista"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ipCliente, userID, new java.lang.Long(cpfCnpj), new java.lang.Integer(codigoAgencia), new java.lang.Long(numeroContaCorrente)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteVO) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.com.bradseg.bucb.servicos.model.vo.ValidarDadosFuncionarioSinergiaSaidaVO validarDadosFuncionarioSinergia(br.com.bradseg.bucb.servicos.model.vo.ValidarDadosFuncionarioSinergiaEntradaVO validarDadosFuncionarioSinergiaEntradaVO) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("validarDadosFuncionarioSinergia");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.model.servicos.bucb.bradseg.com.br", "validarDadosFuncionarioSinergia"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {validarDadosFuncionarioSinergiaEntradaVO});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.bradseg.bucb.servicos.model.vo.ValidarDadosFuncionarioSinergiaSaidaVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.bradseg.bucb.servicos.model.vo.ValidarDadosFuncionarioSinergiaSaidaVO) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.bradseg.bucb.servicos.model.vo.ValidarDadosFuncionarioSinergiaSaidaVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.com.bradseg.bucb.servicos.model.vo.ListarSubsegmentoRencRespectivasAgenciasSaidaWsVO listarSubsegmentoRencRespectivasAgencias(long cpfCnpj) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("listarSubsegmentoRencRespectivasAgencias");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.model.servicos.bucb.bradseg.com.br", "listarSubsegmentoRencRespectivasAgencias"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(cpfCnpj)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.bradseg.bucb.servicos.model.vo.ListarSubsegmentoRencRespectivasAgenciasSaidaWsVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.bradseg.bucb.servicos.model.vo.ListarSubsegmentoRencRespectivasAgenciasSaidaWsVO) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.bradseg.bucb.servicos.model.vo.ListarSubsegmentoRencRespectivasAgenciasSaidaWsVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String validarDadosContaCorrente(java.lang.String ipCliente, java.lang.String userID, br.com.bradseg.bucb.servicos.model.vo.ValidarDadosContaCorrenteVO validarDadosVO) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("validarDadosContaCorrente");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.model.servicos.bucb.bradseg.com.br", "validarDadosContaCorrente"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ipCliente, userID, validarDadosVO});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.com.bradseg.bucb.servicos.model.vo.ValidarDadosFuncionarioVO validarDadosFuncionario(java.lang.String ipCliente, java.lang.String userID, long matricula, long agencia, long conta) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("validarDadosFuncionario");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.model.servicos.bucb.bradseg.com.br", "validarDadosFuncionario"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ipCliente, userID, new java.lang.Long(matricula), new java.lang.Long(agencia), new java.lang.Long(conta)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.bradseg.bucb.servicos.model.vo.ValidarDadosFuncionarioVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.bradseg.bucb.servicos.model.vo.ValidarDadosFuncionarioVO) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.bradseg.bucb.servicos.model.vo.ValidarDadosFuncionarioVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.com.bradseg.bucb.servicos.model.vo.ListarSegmentacaoProdutoClienteSaidaVO listarHistoricoSegmentacaoProdutoCliente(long cpfCnpj, long agencia, long data) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("listarHistoricoSegmentacaoProdutoCliente");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.model.servicos.bucb.bradseg.com.br", "listarHistoricoSegmentacaoProdutoCliente"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(cpfCnpj), new java.lang.Long(agencia), new java.lang.Long(data)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.bradseg.bucb.servicos.model.vo.ListarSegmentacaoProdutoClienteSaidaVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.bradseg.bucb.servicos.model.vo.ListarSegmentacaoProdutoClienteSaidaVO) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.bradseg.bucb.servicos.model.vo.ListarSegmentacaoProdutoClienteSaidaVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.com.bradseg.bucb.servicos.model.vo.ContaCorrentePorCPFCNPJVO[] listarCorrentistasPorCpfCnpj(int tpConta, long cpfCnpj) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("listarCorrentistasPorCpfCnpj");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.model.servicos.bucb.bradseg.com.br", "listarCorrentistasPorCpfCnpj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(tpConta), new java.lang.Long(cpfCnpj)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.bradseg.bucb.servicos.model.vo.ContaCorrentePorCPFCNPJVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.bradseg.bucb.servicos.model.vo.ContaCorrentePorCPFCNPJVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.bradseg.bucb.servicos.model.vo.ContaCorrentePorCPFCNPJVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean validarDVContaCorrente(java.lang.String ipCliente, java.lang.String userID, long cpfCnpj, int codigoAgencia, long numeroContaCorrente, java.lang.String dvContaCorrente) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("validarDVContaCorrente");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.model.servicos.bucb.bradseg.com.br", "validarDVContaCorrente"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ipCliente, userID, new java.lang.Long(cpfCnpj), new java.lang.Integer(codigoAgencia), new java.lang.Long(numeroContaCorrente), dvContaCorrente});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.com.bradseg.bucb.servicos.model.vo.ListarAgenciaPorCpfCnpjSaidaVO listarAgenciaPorCpfCnpj(long cpfCnpj) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("listarAgenciaPorCpfCnpj");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.model.servicos.bucb.bradseg.com.br", "listarAgenciaPorCpfCnpj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(cpfCnpj)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.bradseg.bucb.servicos.model.vo.ListarAgenciaPorCpfCnpjSaidaVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.bradseg.bucb.servicos.model.vo.ListarAgenciaPorCpfCnpjSaidaVO) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.bradseg.bucb.servicos.model.vo.ListarAgenciaPorCpfCnpjSaidaVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.com.bradseg.bucb.servicos.model.vo.ListaContaCorrenteFuncionarioWsVO obterContaCorrenteFuncionarioPorIDBuc(java.lang.String ipCliente, java.lang.String userID, long idBuc) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("obterContaCorrenteFuncionarioPorIDBuc");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.model.servicos.bucb.bradseg.com.br", "obterContaCorrenteFuncionarioPorIDBuc"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ipCliente, userID, new java.lang.Long(idBuc)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.bradseg.bucb.servicos.model.vo.ListaContaCorrenteFuncionarioWsVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.bradseg.bucb.servicos.model.vo.ListaContaCorrenteFuncionarioWsVO) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.bradseg.bucb.servicos.model.vo.ListaContaCorrenteFuncionarioWsVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.com.bradseg.bucb.servicos.model.vo.PessoaContaCorrenteVO obterDadosCorrentistaIDCRRTT(long idCrrtt) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("obterDadosCorrentistaIDCRRTT");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.model.servicos.bucb.bradseg.com.br", "obterDadosCorrentistaIDCRRTT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(idCrrtt)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.bradseg.bucb.servicos.model.vo.PessoaContaCorrenteVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.bradseg.bucb.servicos.model.vo.PessoaContaCorrenteVO) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.bradseg.bucb.servicos.model.vo.PessoaContaCorrenteVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.com.bradseg.bucb.servicos.model.vo.ListarCorrentistasPorAgCcSaidaVO listarCorrentistasPorAgCc(br.com.bradseg.bucb.servicos.model.vo.ListarCorrentistasPorAgCcVO listarCorrentistasPorAgCcVO) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("listarCorrentistasPorAgCc");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.model.servicos.bucb.bradseg.com.br", "listarCorrentistasPorAgCc"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {listarCorrentistasPorAgCcVO});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.bradseg.bucb.servicos.model.vo.ListarCorrentistasPorAgCcSaidaVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.bradseg.bucb.servicos.model.vo.ListarCorrentistasPorAgCcSaidaVO) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.bradseg.bucb.servicos.model.vo.ListarCorrentistasPorAgCcSaidaVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.com.bradseg.bucb.servicos.model.vo.PessoaContaCorrenteVO[] consultarMeioContatoPessoaContaCorrente(java.lang.String ipCliente, java.lang.String userID, br.com.bradseg.bucb.servicos.model.vo.PessoaContaCorrenteEntradaVO pessoaContaCorrente) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("consultarMeioContatoPessoaContaCorrente");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.model.servicos.bucb.bradseg.com.br", "consultarMeioContatoPessoaContaCorrente"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ipCliente, userID, pessoaContaCorrente});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.bradseg.bucb.servicos.model.vo.PessoaContaCorrenteVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.bradseg.bucb.servicos.model.vo.PessoaContaCorrenteVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.bradseg.bucb.servicos.model.vo.PessoaContaCorrenteVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteCpfVO[] consultarContaCorrentePorCPF(java.lang.String ipCliente, java.lang.String userID, long cpfCnpj) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("consultarContaCorrentePorCPF");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.model.servicos.bucb.bradseg.com.br", "consultarContaCorrentePorCPF"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ipCliente, userID, new java.lang.Long(cpfCnpj)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteCpfVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteCpfVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteCpfVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.com.bradseg.bucb.servicos.model.vo.ListarSegmentacaoProdutoClienteSaidaVO listarSegmentacaoProdutoCliente(long cpfCnpj, long agencia) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("listarSegmentacaoProdutoCliente");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.model.servicos.bucb.bradseg.com.br", "listarSegmentacaoProdutoCliente"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(cpfCnpj), new java.lang.Long(agencia)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.bradseg.bucb.servicos.model.vo.ListarSegmentacaoProdutoClienteSaidaVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.bradseg.bucb.servicos.model.vo.ListarSegmentacaoProdutoClienteSaidaVO) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.bradseg.bucb.servicos.model.vo.ListarSegmentacaoProdutoClienteSaidaVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.com.bradseg.bucb.servicos.model.vo.ValidarDVFuncionarioSaidaVO validarContaCorrente(java.lang.String ipCliente, java.lang.String userID, br.com.bradseg.bucb.servicos.model.vo.ValidarDVFuncionarioEntradaVO entrada) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("validarContaCorrente");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.model.servicos.bucb.bradseg.com.br", "validarContaCorrente"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ipCliente, userID, entrada});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.bradseg.bucb.servicos.model.vo.ValidarDVFuncionarioSaidaVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.bradseg.bucb.servicos.model.vo.ValidarDVFuncionarioSaidaVO) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.bradseg.bucb.servicos.model.vo.ValidarDVFuncionarioSaidaVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.com.bradseg.bucb.servicos.model.vo.ListarSegmentacoesPOBJeRENCSaidaVO listarSegmentacoesPOBJeRENC(java.lang.String ipCliente, java.lang.String userID, long cpfCnpj, long agencia) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("listarSegmentacoesPOBJeRENC");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.model.servicos.bucb.bradseg.com.br", "listarSegmentacoesPOBJeRENC"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ipCliente, userID, new java.lang.Long(cpfCnpj), new java.lang.Long(agencia)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.bradseg.bucb.servicos.model.vo.ListarSegmentacoesPOBJeRENCSaidaVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.bradseg.bucb.servicos.model.vo.ListarSegmentacoesPOBJeRENCSaidaVO) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.bradseg.bucb.servicos.model.vo.ListarSegmentacoesPOBJeRENCSaidaVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteCpfVO[] obterDadosBaseContaCorrentePorCPF(long tpConta, long cpf) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("obterDadosBaseContaCorrentePorCPF");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.model.servicos.bucb.bradseg.com.br", "obterDadosBaseContaCorrentePorCPF"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(tpConta), new java.lang.Long(cpf)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteCpfVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteCpfVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteCpfVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteVO[] consultarContaCorrentePorCPFCNPJ(java.lang.String ipCliente, java.lang.String userID, long cpfCnpj) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("consultarContaCorrentePorCPFCNPJ");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.model.servicos.bucb.bradseg.com.br", "consultarContaCorrentePorCPFCNPJ"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ipCliente, userID, new java.lang.Long(cpfCnpj)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.com.bradseg.bucb.servicos.model.vo.IdentificarPessoaCCSaidaVO identificarPessoa(br.com.bradseg.bucb.servicos.model.vo.IdentificarPessoaCCEntradaVO identificarPessoaCCEntradaVO) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("identificarPessoa");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.model.servicos.bucb.bradseg.com.br", "identificarPessoa"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {identificarPessoaCCEntradaVO});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.bradseg.bucb.servicos.model.vo.IdentificarPessoaCCSaidaVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.bradseg.bucb.servicos.model.vo.IdentificarPessoaCCSaidaVO) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.bradseg.bucb.servicos.model.vo.IdentificarPessoaCCSaidaVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long obterIDBucPorContaCorrenteCpfCnpj(br.com.bradseg.bucb.servicos.model.vo.IDBucPorContaCorrenteCpfCnpjVO IDBucPorContaCorrenteCpfCnpj) throws java.rmi.RemoteException, br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException, br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("obterIDBucPorContaCorrenteCpfCnpj");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.model.servicos.bucb.bradseg.com.br", "obterIDBucPorContaCorrenteCpfCnpj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {IDBucPorContaCorrenteCpfCnpj});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceBusinessException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) {
              throw (br.com.bradseg.bucb.servicos.model.exception.WebServiceIntegrationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
