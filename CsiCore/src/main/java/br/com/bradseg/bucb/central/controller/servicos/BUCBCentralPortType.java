/**
 * BUCBCentralPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.bucb.central.controller.servicos;

public interface BUCBCentralPortType extends java.rmi.Remote {
    public br.com.bradseg.bucb.central.model.pessoa.vo.PlusoftUseVOSaida obterDadosVinculoPlusoft(java.lang.String in0, java.lang.String in1, br.com.bradseg.bucb.central.model.pessoa.vo.PlusoftUseVO in2) throws java.rmi.RemoteException, br.com.bradseg.bucb.central.exception.CentralBusinessException, br.com.bradseg.bucb.central.exception.CentralIntegrationException;
    public br.com.bradseg.bucb.central.model.pessoa.vo.PlusoftUseVOSaida identificarPessoaUSE(br.com.bradseg.bucb.central.model.pessoa.vo.PlusoftUseVO in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, br.com.bradseg.bucb.central.exception.CentralBusinessException, br.com.bradseg.bucb.central.exception.CentralIntegrationException;
    public br.com.bradseg.bucb.central.model.pessoa.vo.PlusoftUseVO obterDadosCadastraisPlusoft(br.com.bradseg.bucb.central.model.pessoa.vo.PlusoftUseVO in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, br.com.bradseg.bucb.central.exception.CentralBusinessException, br.com.bradseg.bucb.central.exception.CentralIntegrationException;
    public br.com.bradseg.bucb.central.model.pessoa.vo.PlusoftUseVOSaida identificarPessoaPlusoft(br.com.bradseg.bucb.central.model.pessoa.vo.PlusoftUseVO in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, br.com.bradseg.bucb.central.exception.CentralBusinessException, br.com.bradseg.bucb.central.exception.CentralIntegrationException;
}
