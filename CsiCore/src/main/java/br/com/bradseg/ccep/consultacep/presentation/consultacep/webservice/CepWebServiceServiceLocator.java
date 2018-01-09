/**
 * CepWebServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice;

public class CepWebServiceServiceLocator extends org.apache.axis.client.Service implements br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebServiceService {

    public CepWebServiceServiceLocator() {
    }


    public CepWebServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CepWebServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CepWebServicePort
    private java.lang.String CepWebServicePort_address = "http://wsphttp.dsv.bradseg.com.br/CCEP-ConsultaCEPWebService/service/CepWebService";

    public java.lang.String getCepWebServicePortAddress() {
        return CepWebServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CepWebServicePortWSDDServiceName = "CepWebServicePort";

    public java.lang.String getCepWebServicePortWSDDServiceName() {
        return CepWebServicePortWSDDServiceName;
    }

    public void setCepWebServicePortWSDDServiceName(java.lang.String name) {
        CepWebServicePortWSDDServiceName = name;
    }

    public br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebService getCepWebServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CepWebServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCepWebServicePort(endpoint);
    }

    public br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebService getCepWebServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebServiceServiceSoapBindingStub _stub = new br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebServiceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getCepWebServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCepWebServicePortEndpointAddress(java.lang.String address) {
        CepWebServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebService.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebServiceServiceSoapBindingStub _stub = new br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebServiceServiceSoapBindingStub(new java.net.URL(CepWebServicePort_address), this);
                _stub.setPortName(getCepWebServicePortWSDDServiceName());
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
        if ("CepWebServicePort".equals(inputPortName)) {
            return getCepWebServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "CepWebServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "CepWebServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CepWebServicePort".equals(portName)) {
            setCepWebServicePortEndpointAddress(address);
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
