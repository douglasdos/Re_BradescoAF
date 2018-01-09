/**
 * CepWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice;

public interface CepWebService extends java.rmi.Remote {
    public br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebServiceResponse obterListaPorLogradouro(java.lang.String uf, java.lang.String cidade, java.lang.String logradouro) throws java.rmi.RemoteException, br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.IntegrationException;
    public br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepCompletoWebServiceResponse obterListaLogradouroCompletoPorCep(java.lang.String cepCompleto) throws java.rmi.RemoteException, br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.IntegrationException;
    public br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.TipoLogradouroVO[] obterTipoLogradouro() throws java.rmi.RemoteException, br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.IntegrationException;
    public br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebServiceResponse obterListaPorCepCompleto(java.lang.String cepCompleto) throws java.rmi.RemoteException, br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.IntegrationException;
    public br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebServiceResponse obterListaLogradouroPorCep(java.lang.String cepCompleto) throws java.rmi.RemoteException, br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.IntegrationException;
    public br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepWebServiceResponse obterListaPorRaizCep(java.lang.String raizCep) throws java.rmi.RemoteException, br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.IntegrationException;
}
