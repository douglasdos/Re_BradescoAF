/**
 * AfndWebserviceRELocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.afnd.afinidade.controller.services;

import br.com.plusoft.csi.adm.helper.AdministracaoCsDmtbConfiguracaoConfHelper;
import br.com.plusoft.csi.bradescoaf.constantes.ConfiguracaoEspec;

public class AfndWebserviceRELocator extends org.apache.axis.client.Service implements br.com.bradseg.afnd.afinidade.controller.services.AfndWebserviceRE {

    public AfndWebserviceRELocator() {
    	
    }


    public AfndWebserviceRELocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AfndWebserviceRELocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AfndWebserviceREHttpPort
    private java.lang.String AfndWebserviceREHttpPort_address = "http://10.205.104.14/AFND-Afinidade-ws/services/AfndWebserviceRE";

    public java.lang.String getAfndWebserviceREHttpPortAddress() {
        return AfndWebserviceREHttpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AfndWebserviceREHttpPortWSDDServiceName = "AfndWebserviceREHttpPort";

    public java.lang.String getAfndWebserviceREHttpPortWSDDServiceName() {
        return AfndWebserviceREHttpPortWSDDServiceName;
    }

    public void setAfndWebserviceREHttpPortWSDDServiceName(java.lang.String name) {
        AfndWebserviceREHttpPortWSDDServiceName = name;
    }

    public br.com.bradseg.afnd.afinidade.controller.services.AfndWebserviceREPortType getAfndWebserviceREHttpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AfndWebserviceREHttpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAfndWebserviceREHttpPort(endpoint);
    }

    public br.com.bradseg.afnd.afinidade.controller.services.AfndWebserviceREPortType getAfndWebserviceREHttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.bradseg.afnd.afinidade.controller.services.AfndWebserviceREHttpBindingStub _stub = new br.com.bradseg.afnd.afinidade.controller.services.AfndWebserviceREHttpBindingStub(portAddress, this);
            _stub.setPortName(getAfndWebserviceREHttpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAfndWebserviceREHttpPortEndpointAddress(java.lang.String address) {
        AfndWebserviceREHttpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.bradseg.afnd.afinidade.controller.services.AfndWebserviceREPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.bradseg.afnd.afinidade.controller.services.AfndWebserviceREHttpBindingStub _stub = new br.com.bradseg.afnd.afinidade.controller.services.AfndWebserviceREHttpBindingStub(new java.net.URL(AfndWebserviceREHttpPort_address), this);
                _stub.setPortName(getAfndWebserviceREHttpPortWSDDServiceName());
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
        if ("AfndWebserviceREHttpPort".equals(inputPortName)) {
            return getAfndWebserviceREHttpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.controller.afinidade.afnd.bradseg.com.br", "AfndWebserviceRE");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.controller.afinidade.afnd.bradseg.com.br", "AfndWebserviceREHttpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AfndWebserviceREHttpPort".equals(portName)) {
            setAfndWebserviceREHttpPortEndpointAddress(address);
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
