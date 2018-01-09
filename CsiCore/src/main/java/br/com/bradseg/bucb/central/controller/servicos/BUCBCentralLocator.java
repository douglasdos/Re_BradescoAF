/**
 * BUCBCentralLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.bucb.central.controller.servicos;

public class BUCBCentralLocator extends org.apache.axis.client.Service implements br.com.bradseg.bucb.central.controller.servicos.BUCBCentral {

    public BUCBCentralLocator() {
    }


    public BUCBCentralLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BUCBCentralLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BUCBCentralHttpPort
    private java.lang.String BUCBCentralHttpPort_address = "http://wsp6-rest.dsv.bradseg.com.br/BUCB-Central-ws/services/BUCB-Central";

    public java.lang.String getBUCBCentralHttpPortAddress() {
        return BUCBCentralHttpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BUCBCentralHttpPortWSDDServiceName = "BUCB-CentralHttpPort";

    public java.lang.String getBUCBCentralHttpPortWSDDServiceName() {
        return BUCBCentralHttpPortWSDDServiceName;
    }

    public void setBUCBCentralHttpPortWSDDServiceName(java.lang.String name) {
        BUCBCentralHttpPortWSDDServiceName = name;
    }

    public br.com.bradseg.bucb.central.controller.servicos.BUCBCentralPortType getBUCBCentralHttpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BUCBCentralHttpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBUCBCentralHttpPort(endpoint);
    }

    public br.com.bradseg.bucb.central.controller.servicos.BUCBCentralPortType getBUCBCentralHttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.bradseg.bucb.central.controller.servicos.BUCBCentralHttpBindingStub _stub = new br.com.bradseg.bucb.central.controller.servicos.BUCBCentralHttpBindingStub(portAddress, this);
            _stub.setPortName(getBUCBCentralHttpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBUCBCentralHttpPortEndpointAddress(java.lang.String address) {
        BUCBCentralHttpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.bradseg.bucb.central.controller.servicos.BUCBCentralPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.bradseg.bucb.central.controller.servicos.BUCBCentralHttpBindingStub _stub = new br.com.bradseg.bucb.central.controller.servicos.BUCBCentralHttpBindingStub(new java.net.URL(BUCBCentralHttpPort_address), this);
                _stub.setPortName(getBUCBCentralHttpPortWSDDServiceName());
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
        if ("BUCB-CentralHttpPort".equals(inputPortName)) {
            return getBUCBCentralHttpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://servicos.controller.central.bucb.bradseg.com.br", "BUCB-Central");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://servicos.controller.central.bucb.bradseg.com.br", "BUCB-CentralHttpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BUCBCentralHttpPort".equals(portName)) {
            setBUCBCentralHttpPortEndpointAddress(address);
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
