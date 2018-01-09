/**
 * CepWebServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice;

public interface CepWebServiceService extends javax.xml.rpc.Service {
    public java.lang.String getCepWebServicePortAddress();

    public br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebService getCepWebServicePort() throws javax.xml.rpc.ServiceException;

    public br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebService getCepWebServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
