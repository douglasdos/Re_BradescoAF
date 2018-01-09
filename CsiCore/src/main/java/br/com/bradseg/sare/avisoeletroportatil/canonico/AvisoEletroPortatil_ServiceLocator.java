/**
 * AvisoEletroPortatil_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.sare.avisoeletroportatil.canonico;

public class AvisoEletroPortatil_ServiceLocator extends org.apache.axis.client.Service implements br.com.bradseg.sare.avisoeletroportatil.canonico.AvisoEletroPortatil_Service {

    public AvisoEletroPortatil_ServiceLocator() {
    }


    public AvisoEletroPortatil_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AvisoEletroPortatil_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AvisoEletroPortatil
    private java.lang.String AvisoEletroPortatil_address = "http://ws-mb.dsv.bradseg.com.br:7801/SARE-AvisoEletroportatil";

    public java.lang.String getAvisoEletroPortatilAddress() {
        return AvisoEletroPortatil_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AvisoEletroPortatilWSDDServiceName = "AvisoEletroPortatil";

    public java.lang.String getAvisoEletroPortatilWSDDServiceName() {
        return AvisoEletroPortatilWSDDServiceName;
    }

    public void setAvisoEletroPortatilWSDDServiceName(java.lang.String name) {
        AvisoEletroPortatilWSDDServiceName = name;
    }

    public br.com.bradseg.sare.avisoeletroportatil.canonico.AvisoEletroPortatil_PortType getAvisoEletroPortatil() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AvisoEletroPortatil_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAvisoEletroPortatil(endpoint);
    }

    public br.com.bradseg.sare.avisoeletroportatil.canonico.AvisoEletroPortatil_PortType getAvisoEletroPortatil(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.bradseg.sare.avisoeletroportatil.canonico.AvisoEletroPortatil_BindingStub _stub = new br.com.bradseg.sare.avisoeletroportatil.canonico.AvisoEletroPortatil_BindingStub(portAddress, this);
            _stub.setPortName(getAvisoEletroPortatilWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAvisoEletroPortatilEndpointAddress(java.lang.String address) {
        AvisoEletroPortatil_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.bradseg.sare.avisoeletroportatil.canonico.AvisoEletroPortatil_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.bradseg.sare.avisoeletroportatil.canonico.AvisoEletroPortatil_BindingStub _stub = new br.com.bradseg.sare.avisoeletroportatil.canonico.AvisoEletroPortatil_BindingStub(new java.net.URL(AvisoEletroPortatil_address), this);
                _stub.setPortName(getAvisoEletroPortatilWSDDServiceName());
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
        if ("AvisoEletroPortatil".equals(inputPortName)) {
            return getAvisoEletroPortatil();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br", "AvisoEletroPortatil");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br", "AvisoEletroPortatil"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AvisoEletroPortatil".equals(portName)) {
            setAvisoEletroPortatilEndpointAddress(address);
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
