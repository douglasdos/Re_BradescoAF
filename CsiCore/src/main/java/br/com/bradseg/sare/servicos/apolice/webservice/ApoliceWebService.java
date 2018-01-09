/**
 * ApoliceWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.sare.servicos.apolice.webservice;

public interface ApoliceWebService extends java.rmi.Remote {
    public br.com.bradseg.sare.servicos.apolice.webservice.WsRetornoObterApoliceVO obterDadosApolice(br.com.bradseg.sare.servicos.apolice.webservice.EntradaObterDadosApoliceVO arg0) throws java.rmi.RemoteException;
    public br.com.bradseg.sare.servicos.apolice.webservice.WsRetornoListaApoliceVO listaApolice(br.com.bradseg.sare.servicos.apolice.webservice.EntradaListaApoliceVO arg0) throws java.rmi.RemoteException, br.com.bradseg.sare.servicos.apolice.webservice.BusinessException;
}
