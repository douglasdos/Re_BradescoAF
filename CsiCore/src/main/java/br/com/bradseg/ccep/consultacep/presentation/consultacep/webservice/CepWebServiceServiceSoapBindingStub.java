/**
 * CepWebServiceServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice;

public class CepWebServiceServiceSoapBindingStub extends org.apache.axis.client.Stub implements br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[6];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obterListaPorLogradouro");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "uf"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cidade"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "logradouro"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "cepWebServiceResponse"));
        oper.setReturnClass(br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "IntegrationException"),
                      "br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.IntegrationException",
                      new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "IntegrationException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obterListaLogradouroCompletoPorCep");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cepCompleto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "cepCompletoWebServiceResponse"));
        oper.setReturnClass(br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepCompletoWebServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "IntegrationException"),
                      "br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.IntegrationException",
                      new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "IntegrationException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obterTipoLogradouro");
        oper.setReturnType(new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "tipoLogradouroVO"));
        oper.setReturnClass(br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.TipoLogradouroVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "IntegrationException"),
                      "br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.IntegrationException",
                      new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "IntegrationException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obterListaPorCepCompleto");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cepCompleto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "cepWebServiceResponse"));
        oper.setReturnClass(br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "IntegrationException"),
                      "br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.IntegrationException",
                      new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "IntegrationException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obterListaLogradouroPorCep");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cepCompleto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "cepWebServiceResponse"));
        oper.setReturnClass(br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "IntegrationException"),
                      "br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.IntegrationException",
                      new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "IntegrationException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obterListaPorRaizCep");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "raizCep"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "cepWebServiceResponse"));
        oper.setReturnClass(br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "IntegrationException"),
                      "br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.IntegrationException",
                      new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "IntegrationException"), 
                      true
                     ));
        _operations[5] = oper;

    }

    public CepWebServiceServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public CepWebServiceServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public CepWebServiceServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "cepCompletoVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepCompletoVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "cepCompletoWebServiceResponse");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepCompletoWebServiceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "cepVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "cepWebServiceResponse");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebServiceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "IntegrationException");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.IntegrationException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "message");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.Message.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "obterListaLogradouroCompletoPorCep");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.ObterListaLogradouroCompletoPorCep.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "obterListaLogradouroCompletoPorCepResponse");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.ObterListaLogradouroCompletoPorCepResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "obterListaLogradouroPorCep");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.ObterListaLogradouroPorCep.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "obterListaLogradouroPorCepResponse");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.ObterListaLogradouroPorCepResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "obterListaPorCepCompleto");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.ObterListaPorCepCompleto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "obterListaPorCepCompletoResponse");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.ObterListaPorCepCompletoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "obterListaPorLogradouro");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.ObterListaPorLogradouro.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "obterListaPorLogradouroResponse");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.ObterListaPorLogradouroResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "obterListaPorRaizCep");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.ObterListaPorRaizCep.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "obterListaPorRaizCepResponse");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.ObterListaPorRaizCepResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "obterTipoLogradouro");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.ObterTipoLogradouro.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "obterTipoLogradouroResponse");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.TipoLogradouroVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "tipoLogradouroVO");
            qName2 = new javax.xml.namespace.QName("", "return");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "tipoLogradouroVO");
            cachedSerQNames.add(qName);
            cls = br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.TipoLogradouroVO.class;
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

    public br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebServiceResponse obterListaPorLogradouro(java.lang.String uf, java.lang.String cidade, java.lang.String logradouro) throws java.rmi.RemoteException, br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.IntegrationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "obterListaPorLogradouro"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uf, cidade, logradouro});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.IntegrationException) {
              throw (br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.IntegrationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepCompletoWebServiceResponse obterListaLogradouroCompletoPorCep(java.lang.String cepCompleto) throws java.rmi.RemoteException, br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.IntegrationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "obterListaLogradouroCompletoPorCep"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cepCompleto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepCompletoWebServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepCompletoWebServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepCompletoWebServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.IntegrationException) {
              throw (br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.IntegrationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.TipoLogradouroVO[] obterTipoLogradouro() throws java.rmi.RemoteException, br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.IntegrationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "obterTipoLogradouro"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.TipoLogradouroVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.TipoLogradouroVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.TipoLogradouroVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.IntegrationException) {
              throw (br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.IntegrationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebServiceResponse obterListaPorCepCompleto(java.lang.String cepCompleto) throws java.rmi.RemoteException, br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.IntegrationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "obterListaPorCepCompleto"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cepCompleto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.IntegrationException) {
              throw (br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.IntegrationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebServiceResponse obterListaLogradouroPorCep(java.lang.String cepCompleto) throws java.rmi.RemoteException, br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.IntegrationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "obterListaLogradouroPorCep"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cepCompleto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.IntegrationException) {
              throw (br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.IntegrationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebServiceResponse obterListaPorRaizCep(java.lang.String raizCep) throws java.rmi.RemoteException, br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.IntegrationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "obterListaPorRaizCep"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {raizCep});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.IntegrationException) {
              throw (br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.IntegrationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
