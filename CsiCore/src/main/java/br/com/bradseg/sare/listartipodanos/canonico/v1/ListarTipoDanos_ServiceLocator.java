/**
 * ListarTipoDanos_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.sare.listartipodanos.canonico.v1;

public class ListarTipoDanos_ServiceLocator extends org.apache.axis.client.Service implements br.com.bradseg.sare.listartipodanos.canonico.v1.ListarTipoDanos_Service {

    public ListarTipoDanos_ServiceLocator() {
    }


    public ListarTipoDanos_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ListarTipoDanos_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ListarTipoDanos
    private java.lang.String ListarTipoDanos_address = "http://ws-mb.dsv.bradseg.com.br:7801/SARE-ListarTipoDanos";

    public java.lang.String getListarTipoDanosAddress() {
        return ListarTipoDanos_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ListarTipoDanosWSDDServiceName = "ListarTipoDanos";

    public java.lang.String getListarTipoDanosWSDDServiceName() {
        return ListarTipoDanosWSDDServiceName;
    }

    public void setListarTipoDanosWSDDServiceName(java.lang.String name) {
        ListarTipoDanosWSDDServiceName = name;
    }

    public br.com.bradseg.sare.listartipodanos.canonico.v1.ListarTipoDanos_PortType getListarTipoDanos() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ListarTipoDanos_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getListarTipoDanos(endpoint);
    }

    public br.com.bradseg.sare.listartipodanos.canonico.v1.ListarTipoDanos_PortType getListarTipoDanos(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.bradseg.sare.listartipodanos.canonico.v1.ListarTipoDanos_BindingStub _stub = new br.com.bradseg.sare.listartipodanos.canonico.v1.ListarTipoDanos_BindingStub(portAddress, this);
            _stub.setPortName(getListarTipoDanosWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setListarTipoDanosEndpointAddress(java.lang.String address) {
        ListarTipoDanos_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.bradseg.sare.listartipodanos.canonico.v1.ListarTipoDanos_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.bradseg.sare.listartipodanos.canonico.v1.ListarTipoDanos_BindingStub _stub = new br.com.bradseg.sare.listartipodanos.canonico.v1.ListarTipoDanos_BindingStub(new java.net.URL(ListarTipoDanos_address), this);
                _stub.setPortName(getListarTipoDanosWSDDServiceName());
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
        if ("ListarTipoDanos".equals(inputPortName)) {
            return getListarTipoDanos();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://canonico.listartipodanos.sare.bradseg.com.br/v1", "ListarTipoDanos");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://canonico.listartipodanos.sare.bradseg.com.br/v1", "ListarTipoDanos"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ListarTipoDanos".equals(portName)) {
            setListarTipoDanosEndpointAddress(address);
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
