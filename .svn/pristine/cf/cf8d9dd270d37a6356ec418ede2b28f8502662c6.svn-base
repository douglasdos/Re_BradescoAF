/**
 * ContaCorrenteSOAPImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.bucb.servicos.model.service;

public class ContaCorrenteSOAPImplServiceLocator extends org.apache.axis.client.Service implements br.com.bradseg.bucb.servicos.model.service.ContaCorrenteSOAPImplService {

    public ContaCorrenteSOAPImplServiceLocator() {
    }


    public ContaCorrenteSOAPImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ContaCorrenteSOAPImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ContaCorrenteSOAPImpl
    private java.lang.String ContaCorrenteSOAPImpl_address = "http://wsp6-rest.dsv.bradseg.com.br:80/BUCB-Servicos-ws/services/ContaCorrenteSOAPImpl";

    public java.lang.String getContaCorrenteSOAPImplAddress() {
        return ContaCorrenteSOAPImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ContaCorrenteSOAPImplWSDDServiceName = "ContaCorrenteSOAPImpl";

    public java.lang.String getContaCorrenteSOAPImplWSDDServiceName() {
        return ContaCorrenteSOAPImplWSDDServiceName;
    }

    public void setContaCorrenteSOAPImplWSDDServiceName(java.lang.String name) {
        ContaCorrenteSOAPImplWSDDServiceName = name;
    }

    public br.com.bradseg.bucb.servicos.model.service.ContaCorrenteSOAPImpl getContaCorrenteSOAPImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ContaCorrenteSOAPImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getContaCorrenteSOAPImpl(endpoint);
    }

    public br.com.bradseg.bucb.servicos.model.service.ContaCorrenteSOAPImpl getContaCorrenteSOAPImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.bradseg.bucb.servicos.model.service.ContaCorrenteSOAPImplSoapBindingStub _stub = new br.com.bradseg.bucb.servicos.model.service.ContaCorrenteSOAPImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getContaCorrenteSOAPImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setContaCorrenteSOAPImplEndpointAddress(java.lang.String address) {
        ContaCorrenteSOAPImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.bradseg.bucb.servicos.model.service.ContaCorrenteSOAPImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.bradseg.bucb.servicos.model.service.ContaCorrenteSOAPImplSoapBindingStub _stub = new br.com.bradseg.bucb.servicos.model.service.ContaCorrenteSOAPImplSoapBindingStub(new java.net.URL(ContaCorrenteSOAPImpl_address), this);
                _stub.setPortName(getContaCorrenteSOAPImplWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ContaCorrenteSOAPImpl".equals(inputPortName)) {
            return getContaCorrenteSOAPImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.model.servicos.bucb.bradseg.com.br", "ContaCorrenteSOAPImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.model.servicos.bucb.bradseg.com.br", "ContaCorrenteSOAPImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ContaCorrenteSOAPImpl".equals(portName)) {
            setContaCorrenteSOAPImplEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
