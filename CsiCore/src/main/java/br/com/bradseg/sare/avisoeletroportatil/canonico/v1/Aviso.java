/**
 * Aviso.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.sare.avisoeletroportatil.canonico.v1;

public class Aviso  implements java.io.Serializable {
    private java.lang.Long numeroComunicado;

    private java.lang.Short codigoCia;

    private java.lang.Short codigoSucursal;

    private java.lang.Short codigoRamo;

    private java.lang.Integer codigoCausa;

    private java.lang.Integer naturezaSinistro;

    private java.lang.Short tipoUsuario;

    private java.lang.Short canalComunicacao;

    private java.lang.Integer moeda;

    private java.util.Date dataComunicado;

    private java.lang.Integer numeroApolice;

    private java.util.Date dataOcorrencia;

    private java.lang.String horaOcorrencia;

    private java.lang.String flagAlteracaoLocal;

    private java.lang.Short relacaoContato;

    private java.lang.String nomeContato;

    private java.lang.Integer dddContato;

    private java.lang.Long telefoneContato;

    private java.lang.Integer dddCelular;

    private java.lang.Long celularContato;

    private java.lang.Integer dddComercial;

    private java.lang.Long comercialContato;

    private java.lang.String logradouroContato;

    private java.lang.String numeroContato;

    private java.lang.String complementoContato;

    private java.lang.String bairroContato;

    private java.lang.String cidadeContato;

    private java.lang.String ufContato;

    private java.lang.Integer cepContato;

    private java.math.BigDecimal valorPrevisto;

    private java.lang.String descricaoSinistro;

    private java.lang.String participanteBombeiro;

    private java.lang.String boletoOcorrencia;

    private java.lang.String flagAlteracao;

    private java.lang.Long cpfCnpj;

    private java.lang.String nomeSegurado;

    private java.lang.String logradouro;

    private java.lang.String numero;

    private java.lang.String complemento;

    private java.lang.String bairro;

    private java.lang.String cidade;

    private java.lang.String uf;

    private java.lang.Integer cep;

    private java.lang.String causaSinistro;

    private java.lang.String emailContato;

    private java.lang.String canalSms;

    private java.lang.String canalEmail;

    private java.lang.String flagAcompanhamento;

    private java.lang.String nomeResponsavel;

    private java.lang.Integer dddResidenciaResponsavel;

    private java.lang.Long telefoneResidenciaResponsavel;

    private java.lang.Integer dddCelularResponsavel;

    private java.lang.Long celularResponsavel;

    private java.lang.String emailResponsavel;

    private java.lang.String codigoPessoa;

    private java.lang.String nomePessoa;

    private java.lang.Short vinculoBeneficiario;

    private java.lang.Short codigoBeneficiario;

    private java.lang.String nomeBeneficiario;

    private java.lang.String cpfCnpjBeneficiario;

    private java.lang.String flagContaBanco;

    private java.lang.Short codigoBanco;

    private java.lang.Integer codigoAgencia;

    private java.lang.Long numeroConta;

    private java.lang.String digitoVerificadorConta;

    private br.com.bradseg.sare.avisoeletroportatil.canonico.v1.ComunicadoEquipamentoValorEquipamentoValor[] comunicadoEquipamentoValor;

    private java.lang.String simNao;

    private short[] ocorrencia;

    private br.com.bradseg.sare.avisoeletroportatil.canonico.v1.Certificado certificado;

    private br.com.bradseg.sare.avisoeletroportatil.canonico.v1.DadosEquipamentos dadosEquipamentos;

    private br.com.bradseg.sare.avisoeletroportatil.canonico.v1.DetalheSinistroExtensaoSinistro[] detalheSinistro;

    private java.lang.Short tipoSinistro;

    private br.com.bradseg.sare.avisoeletroportatil.canonico.v1.ComunicadoResidencial comunicadoResidencial;

    private br.com.bradseg.sare.avisoeletroportatil.canonico.v1.ComunicadoEquipamentoComunicado[] comunicadoEquipamento;

    private br.com.bradseg.sare.avisoeletroportatil.canonico.v1.ComunicadoEmpresa comunicadoEmpresa;

    private br.com.bradseg.sare.avisoeletroportatil.canonico.v1.ComunicadoTerceirosTerceiro[] comunicadoTerceiros;

    public Aviso() {
    }

    public Aviso(
           java.lang.Long numeroComunicado,
           java.lang.Short codigoCia,
           java.lang.Short codigoSucursal,
           java.lang.Short codigoRamo,
           java.lang.Integer codigoCausa,
           java.lang.Integer naturezaSinistro,
           java.lang.Short tipoUsuario,
           java.lang.Short canalComunicacao,
           java.lang.Integer moeda,
           java.util.Date dataComunicado,
           java.lang.Integer numeroApolice,
           java.util.Date dataOcorrencia,
           java.lang.String horaOcorrencia,
           java.lang.String flagAlteracaoLocal,
           java.lang.Short relacaoContato,
           java.lang.String nomeContato,
           java.lang.Integer dddContato,
           java.lang.Long telefoneContato,
           java.lang.Integer dddCelular,
           java.lang.Long celularContato,
           java.lang.Integer dddComercial,
           java.lang.Long comercialContato,
           java.lang.String logradouroContato,
           java.lang.String numeroContato,
           java.lang.String complementoContato,
           java.lang.String bairroContato,
           java.lang.String cidadeContato,
           java.lang.String ufContato,
           java.lang.Integer cepContato,
           java.math.BigDecimal valorPrevisto,
           java.lang.String descricaoSinistro,
           java.lang.String participanteBombeiro,
           java.lang.String boletoOcorrencia,
           java.lang.String flagAlteracao,
           java.lang.Long cpfCnpj,
           java.lang.String nomeSegurado,
           java.lang.String logradouro,
           java.lang.String numero,
           java.lang.String complemento,
           java.lang.String bairro,
           java.lang.String cidade,
           java.lang.String uf,
           java.lang.Integer cep,
           java.lang.String causaSinistro,
           java.lang.String emailContato,
           java.lang.String canalSms,
           java.lang.String canalEmail,
           java.lang.String flagAcompanhamento,
           java.lang.String nomeResponsavel,
           java.lang.Integer dddResidenciaResponsavel,
           java.lang.Long telefoneResidenciaResponsavel,
           java.lang.Integer dddCelularResponsavel,
           java.lang.Long celularResponsavel,
           java.lang.String emailResponsavel,
           java.lang.String codigoPessoa,
           java.lang.String nomePessoa,
           java.lang.Short vinculoBeneficiario,
           java.lang.Short codigoBeneficiario,
           java.lang.String nomeBeneficiario,
           java.lang.String cpfCnpjBeneficiario,
           java.lang.String flagContaBanco,
           java.lang.Short codigoBanco,
           java.lang.Integer codigoAgencia,
           java.lang.Long numeroConta,
           java.lang.String digitoVerificadorConta,
           br.com.bradseg.sare.avisoeletroportatil.canonico.v1.ComunicadoEquipamentoValorEquipamentoValor[] comunicadoEquipamentoValor,
           java.lang.String simNao,
           short[] ocorrencia,
           br.com.bradseg.sare.avisoeletroportatil.canonico.v1.Certificado certificado,
           br.com.bradseg.sare.avisoeletroportatil.canonico.v1.DadosEquipamentos dadosEquipamentos,
           br.com.bradseg.sare.avisoeletroportatil.canonico.v1.DetalheSinistroExtensaoSinistro[] detalheSinistro,
           java.lang.Short tipoSinistro,
           br.com.bradseg.sare.avisoeletroportatil.canonico.v1.ComunicadoResidencial comunicadoResidencial,
           br.com.bradseg.sare.avisoeletroportatil.canonico.v1.ComunicadoEquipamentoComunicado[] comunicadoEquipamento,
           br.com.bradseg.sare.avisoeletroportatil.canonico.v1.ComunicadoEmpresa comunicadoEmpresa,
           br.com.bradseg.sare.avisoeletroportatil.canonico.v1.ComunicadoTerceirosTerceiro[] comunicadoTerceiros) {
           this.numeroComunicado = numeroComunicado;
           this.codigoCia = codigoCia;
           this.codigoSucursal = codigoSucursal;
           this.codigoRamo = codigoRamo;
           this.codigoCausa = codigoCausa;
           this.naturezaSinistro = naturezaSinistro;
           this.tipoUsuario = tipoUsuario;
           this.canalComunicacao = canalComunicacao;
           this.moeda = moeda;
           this.dataComunicado = dataComunicado;
           this.numeroApolice = numeroApolice;
           this.dataOcorrencia = dataOcorrencia;
           this.horaOcorrencia = horaOcorrencia;
           this.flagAlteracaoLocal = flagAlteracaoLocal;
           this.relacaoContato = relacaoContato;
           this.nomeContato = nomeContato;
           this.dddContato = dddContato;
           this.telefoneContato = telefoneContato;
           this.dddCelular = dddCelular;
           this.celularContato = celularContato;
           this.dddComercial = dddComercial;
           this.comercialContato = comercialContato;
           this.logradouroContato = logradouroContato;
           this.numeroContato = numeroContato;
           this.complementoContato = complementoContato;
           this.bairroContato = bairroContato;
           this.cidadeContato = cidadeContato;
           this.ufContato = ufContato;
           this.cepContato = cepContato;
           this.valorPrevisto = valorPrevisto;
           this.descricaoSinistro = descricaoSinistro;
           this.participanteBombeiro = participanteBombeiro;
           this.boletoOcorrencia = boletoOcorrencia;
           this.flagAlteracao = flagAlteracao;
           this.cpfCnpj = cpfCnpj;
           this.nomeSegurado = nomeSegurado;
           this.logradouro = logradouro;
           this.numero = numero;
           this.complemento = complemento;
           this.bairro = bairro;
           this.cidade = cidade;
           this.uf = uf;
           this.cep = cep;
           this.causaSinistro = causaSinistro;
           this.emailContato = emailContato;
           this.canalSms = canalSms;
           this.canalEmail = canalEmail;
           this.flagAcompanhamento = flagAcompanhamento;
           this.nomeResponsavel = nomeResponsavel;
           this.dddResidenciaResponsavel = dddResidenciaResponsavel;
           this.telefoneResidenciaResponsavel = telefoneResidenciaResponsavel;
           this.dddCelularResponsavel = dddCelularResponsavel;
           this.celularResponsavel = celularResponsavel;
           this.emailResponsavel = emailResponsavel;
           this.codigoPessoa = codigoPessoa;
           this.nomePessoa = nomePessoa;
           this.vinculoBeneficiario = vinculoBeneficiario;
           this.codigoBeneficiario = codigoBeneficiario;
           this.nomeBeneficiario = nomeBeneficiario;
           this.cpfCnpjBeneficiario = cpfCnpjBeneficiario;
           this.flagContaBanco = flagContaBanco;
           this.codigoBanco = codigoBanco;
           this.codigoAgencia = codigoAgencia;
           this.numeroConta = numeroConta;
           this.digitoVerificadorConta = digitoVerificadorConta;
           this.comunicadoEquipamentoValor = comunicadoEquipamentoValor;
           this.simNao = simNao;
           this.ocorrencia = ocorrencia;
           this.certificado = certificado;
           this.dadosEquipamentos = dadosEquipamentos;
           this.detalheSinistro = detalheSinistro;
           this.tipoSinistro = tipoSinistro;
           this.comunicadoResidencial = comunicadoResidencial;
           this.comunicadoEquipamento = comunicadoEquipamento;
           this.comunicadoEmpresa = comunicadoEmpresa;
           this.comunicadoTerceiros = comunicadoTerceiros;
    }


    /**
     * Gets the numeroComunicado value for this Aviso.
     * 
     * @return numeroComunicado
     */
    public java.lang.Long getNumeroComunicado() {
        return numeroComunicado;
    }


    /**
     * Sets the numeroComunicado value for this Aviso.
     * 
     * @param numeroComunicado
     */
    public void setNumeroComunicado(java.lang.Long numeroComunicado) {
        this.numeroComunicado = numeroComunicado;
    }


    /**
     * Gets the codigoCia value for this Aviso.
     * 
     * @return codigoCia
     */
    public java.lang.Short getCodigoCia() {
        return codigoCia;
    }


    /**
     * Sets the codigoCia value for this Aviso.
     * 
     * @param codigoCia
     */
    public void setCodigoCia(java.lang.Short codigoCia) {
        this.codigoCia = codigoCia;
    }


    /**
     * Gets the codigoSucursal value for this Aviso.
     * 
     * @return codigoSucursal
     */
    public java.lang.Short getCodigoSucursal() {
        return codigoSucursal;
    }


    /**
     * Sets the codigoSucursal value for this Aviso.
     * 
     * @param codigoSucursal
     */
    public void setCodigoSucursal(java.lang.Short codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }


    /**
     * Gets the codigoRamo value for this Aviso.
     * 
     * @return codigoRamo
     */
    public java.lang.Short getCodigoRamo() {
        return codigoRamo;
    }


    /**
     * Sets the codigoRamo value for this Aviso.
     * 
     * @param codigoRamo
     */
    public void setCodigoRamo(java.lang.Short codigoRamo) {
        this.codigoRamo = codigoRamo;
    }


    /**
     * Gets the codigoCausa value for this Aviso.
     * 
     * @return codigoCausa
     */
    public java.lang.Integer getCodigoCausa() {
        return codigoCausa;
    }


    /**
     * Sets the codigoCausa value for this Aviso.
     * 
     * @param codigoCausa
     */
    public void setCodigoCausa(java.lang.Integer codigoCausa) {
        this.codigoCausa = codigoCausa;
    }


    /**
     * Gets the naturezaSinistro value for this Aviso.
     * 
     * @return naturezaSinistro
     */
    public java.lang.Integer getNaturezaSinistro() {
        return naturezaSinistro;
    }


    /**
     * Sets the naturezaSinistro value for this Aviso.
     * 
     * @param naturezaSinistro
     */
    public void setNaturezaSinistro(java.lang.Integer naturezaSinistro) {
        this.naturezaSinistro = naturezaSinistro;
    }


    /**
     * Gets the tipoUsuario value for this Aviso.
     * 
     * @return tipoUsuario
     */
    public java.lang.Short getTipoUsuario() {
        return tipoUsuario;
    }


    /**
     * Sets the tipoUsuario value for this Aviso.
     * 
     * @param tipoUsuario
     */
    public void setTipoUsuario(java.lang.Short tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }


    /**
     * Gets the canalComunicacao value for this Aviso.
     * 
     * @return canalComunicacao
     */
    public java.lang.Short getCanalComunicacao() {
        return canalComunicacao;
    }


    /**
     * Sets the canalComunicacao value for this Aviso.
     * 
     * @param canalComunicacao
     */
    public void setCanalComunicacao(java.lang.Short canalComunicacao) {
        this.canalComunicacao = canalComunicacao;
    }


    /**
     * Gets the moeda value for this Aviso.
     * 
     * @return moeda
     */
    public java.lang.Integer getMoeda() {
        return moeda;
    }


    /**
     * Sets the moeda value for this Aviso.
     * 
     * @param moeda
     */
    public void setMoeda(java.lang.Integer moeda) {
        this.moeda = moeda;
    }


    /**
     * Gets the dataComunicado value for this Aviso.
     * 
     * @return dataComunicado
     */
    public java.util.Date getDataComunicado() {
        return dataComunicado;
    }


    /**
     * Sets the dataComunicado value for this Aviso.
     * 
     * @param dataComunicado
     */
    public void setDataComunicado(java.util.Date dataComunicado) {
        this.dataComunicado = dataComunicado;
    }


    /**
     * Gets the numeroApolice value for this Aviso.
     * 
     * @return numeroApolice
     */
    public java.lang.Integer getNumeroApolice() {
        return numeroApolice;
    }


    /**
     * Sets the numeroApolice value for this Aviso.
     * 
     * @param numeroApolice
     */
    public void setNumeroApolice(java.lang.Integer numeroApolice) {
        this.numeroApolice = numeroApolice;
    }


    /**
     * Gets the dataOcorrencia value for this Aviso.
     * 
     * @return dataOcorrencia
     */
    public java.util.Date getDataOcorrencia() {
        return dataOcorrencia;
    }


    /**
     * Sets the dataOcorrencia value for this Aviso.
     * 
     * @param dataOcorrencia
     */
    public void setDataOcorrencia(java.util.Date dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }


    /**
     * Gets the horaOcorrencia value for this Aviso.
     * 
     * @return horaOcorrencia
     */
    public java.lang.String getHoraOcorrencia() {
        return horaOcorrencia;
    }


    /**
     * Sets the horaOcorrencia value for this Aviso.
     * 
     * @param horaOcorrencia
     */
    public void setHoraOcorrencia(java.lang.String horaOcorrencia) {
        this.horaOcorrencia = horaOcorrencia;
    }


    /**
     * Gets the flagAlteracaoLocal value for this Aviso.
     * 
     * @return flagAlteracaoLocal
     */
    public java.lang.String getFlagAlteracaoLocal() {
        return flagAlteracaoLocal;
    }


    /**
     * Sets the flagAlteracaoLocal value for this Aviso.
     * 
     * @param flagAlteracaoLocal
     */
    public void setFlagAlteracaoLocal(java.lang.String flagAlteracaoLocal) {
        this.flagAlteracaoLocal = flagAlteracaoLocal;
    }


    /**
     * Gets the relacaoContato value for this Aviso.
     * 
     * @return relacaoContato
     */
    public java.lang.Short getRelacaoContato() {
        return relacaoContato;
    }


    /**
     * Sets the relacaoContato value for this Aviso.
     * 
     * @param relacaoContato
     */
    public void setRelacaoContato(java.lang.Short relacaoContato) {
        this.relacaoContato = relacaoContato;
    }


    /**
     * Gets the nomeContato value for this Aviso.
     * 
     * @return nomeContato
     */
    public java.lang.String getNomeContato() {
        return nomeContato;
    }


    /**
     * Sets the nomeContato value for this Aviso.
     * 
     * @param nomeContato
     */
    public void setNomeContato(java.lang.String nomeContato) {
        this.nomeContato = nomeContato;
    }


    /**
     * Gets the dddContato value for this Aviso.
     * 
     * @return dddContato
     */
    public java.lang.Integer getDddContato() {
        return dddContato;
    }


    /**
     * Sets the dddContato value for this Aviso.
     * 
     * @param dddContato
     */
    public void setDddContato(java.lang.Integer dddContato) {
        this.dddContato = dddContato;
    }


    /**
     * Gets the telefoneContato value for this Aviso.
     * 
     * @return telefoneContato
     */
    public java.lang.Long getTelefoneContato() {
        return telefoneContato;
    }


    /**
     * Sets the telefoneContato value for this Aviso.
     * 
     * @param telefoneContato
     */
    public void setTelefoneContato(java.lang.Long telefoneContato) {
        this.telefoneContato = telefoneContato;
    }


    /**
     * Gets the dddCelular value for this Aviso.
     * 
     * @return dddCelular
     */
    public java.lang.Integer getDddCelular() {
        return dddCelular;
    }


    /**
     * Sets the dddCelular value for this Aviso.
     * 
     * @param dddCelular
     */
    public void setDddCelular(java.lang.Integer dddCelular) {
        this.dddCelular = dddCelular;
    }


    /**
     * Gets the celularContato value for this Aviso.
     * 
     * @return celularContato
     */
    public java.lang.Long getCelularContato() {
        return celularContato;
    }


    /**
     * Sets the celularContato value for this Aviso.
     * 
     * @param celularContato
     */
    public void setCelularContato(java.lang.Long celularContato) {
        this.celularContato = celularContato;
    }


    /**
     * Gets the dddComercial value for this Aviso.
     * 
     * @return dddComercial
     */
    public java.lang.Integer getDddComercial() {
        return dddComercial;
    }


    /**
     * Sets the dddComercial value for this Aviso.
     * 
     * @param dddComercial
     */
    public void setDddComercial(java.lang.Integer dddComercial) {
        this.dddComercial = dddComercial;
    }


    /**
     * Gets the comercialContato value for this Aviso.
     * 
     * @return comercialContato
     */
    public java.lang.Long getComercialContato() {
        return comercialContato;
    }


    /**
     * Sets the comercialContato value for this Aviso.
     * 
     * @param comercialContato
     */
    public void setComercialContato(java.lang.Long comercialContato) {
        this.comercialContato = comercialContato;
    }


    /**
     * Gets the logradouroContato value for this Aviso.
     * 
     * @return logradouroContato
     */
    public java.lang.String getLogradouroContato() {
        return logradouroContato;
    }


    /**
     * Sets the logradouroContato value for this Aviso.
     * 
     * @param logradouroContato
     */
    public void setLogradouroContato(java.lang.String logradouroContato) {
        this.logradouroContato = logradouroContato;
    }


    /**
     * Gets the numeroContato value for this Aviso.
     * 
     * @return numeroContato
     */
    public java.lang.String getNumeroContato() {
        return numeroContato;
    }


    /**
     * Sets the numeroContato value for this Aviso.
     * 
     * @param numeroContato
     */
    public void setNumeroContato(java.lang.String numeroContato) {
        this.numeroContato = numeroContato;
    }


    /**
     * Gets the complementoContato value for this Aviso.
     * 
     * @return complementoContato
     */
    public java.lang.String getComplementoContato() {
        return complementoContato;
    }


    /**
     * Sets the complementoContato value for this Aviso.
     * 
     * @param complementoContato
     */
    public void setComplementoContato(java.lang.String complementoContato) {
        this.complementoContato = complementoContato;
    }


    /**
     * Gets the bairroContato value for this Aviso.
     * 
     * @return bairroContato
     */
    public java.lang.String getBairroContato() {
        return bairroContato;
    }


    /**
     * Sets the bairroContato value for this Aviso.
     * 
     * @param bairroContato
     */
    public void setBairroContato(java.lang.String bairroContato) {
        this.bairroContato = bairroContato;
    }


    /**
     * Gets the cidadeContato value for this Aviso.
     * 
     * @return cidadeContato
     */
    public java.lang.String getCidadeContato() {
        return cidadeContato;
    }


    /**
     * Sets the cidadeContato value for this Aviso.
     * 
     * @param cidadeContato
     */
    public void setCidadeContato(java.lang.String cidadeContato) {
        this.cidadeContato = cidadeContato;
    }


    /**
     * Gets the ufContato value for this Aviso.
     * 
     * @return ufContato
     */
    public java.lang.String getUfContato() {
        return ufContato;
    }


    /**
     * Sets the ufContato value for this Aviso.
     * 
     * @param ufContato
     */
    public void setUfContato(java.lang.String ufContato) {
        this.ufContato = ufContato;
    }


    /**
     * Gets the cepContato value for this Aviso.
     * 
     * @return cepContato
     */
    public java.lang.Integer getCepContato() {
        return cepContato;
    }


    /**
     * Sets the cepContato value for this Aviso.
     * 
     * @param cepContato
     */
    public void setCepContato(java.lang.Integer cepContato) {
        this.cepContato = cepContato;
    }


    /**
     * Gets the valorPrevisto value for this Aviso.
     * 
     * @return valorPrevisto
     */
    public java.math.BigDecimal getValorPrevisto() {
        return valorPrevisto;
    }


    /**
     * Sets the valorPrevisto value for this Aviso.
     * 
     * @param valorPrevisto
     */
    public void setValorPrevisto(java.math.BigDecimal valorPrevisto) {
        this.valorPrevisto = valorPrevisto;
    }


    /**
     * Gets the descricaoSinistro value for this Aviso.
     * 
     * @return descricaoSinistro
     */
    public java.lang.String getDescricaoSinistro() {
        return descricaoSinistro;
    }


    /**
     * Sets the descricaoSinistro value for this Aviso.
     * 
     * @param descricaoSinistro
     */
    public void setDescricaoSinistro(java.lang.String descricaoSinistro) {
        this.descricaoSinistro = descricaoSinistro;
    }


    /**
     * Gets the participanteBombeiro value for this Aviso.
     * 
     * @return participanteBombeiro
     */
    public java.lang.String getParticipanteBombeiro() {
        return participanteBombeiro;
    }


    /**
     * Sets the participanteBombeiro value for this Aviso.
     * 
     * @param participanteBombeiro
     */
    public void setParticipanteBombeiro(java.lang.String participanteBombeiro) {
        this.participanteBombeiro = participanteBombeiro;
    }


    /**
     * Gets the boletoOcorrencia value for this Aviso.
     * 
     * @return boletoOcorrencia
     */
    public java.lang.String getBoletoOcorrencia() {
        return boletoOcorrencia;
    }


    /**
     * Sets the boletoOcorrencia value for this Aviso.
     * 
     * @param boletoOcorrencia
     */
    public void setBoletoOcorrencia(java.lang.String boletoOcorrencia) {
        this.boletoOcorrencia = boletoOcorrencia;
    }


    /**
     * Gets the flagAlteracao value for this Aviso.
     * 
     * @return flagAlteracao
     */
    public java.lang.String getFlagAlteracao() {
        return flagAlteracao;
    }


    /**
     * Sets the flagAlteracao value for this Aviso.
     * 
     * @param flagAlteracao
     */
    public void setFlagAlteracao(java.lang.String flagAlteracao) {
        this.flagAlteracao = flagAlteracao;
    }


    /**
     * Gets the cpfCnpj value for this Aviso.
     * 
     * @return cpfCnpj
     */
    public java.lang.Long getCpfCnpj() {
        return cpfCnpj;
    }


    /**
     * Sets the cpfCnpj value for this Aviso.
     * 
     * @param cpfCnpj
     */
    public void setCpfCnpj(java.lang.Long cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }


    /**
     * Gets the nomeSegurado value for this Aviso.
     * 
     * @return nomeSegurado
     */
    public java.lang.String getNomeSegurado() {
        return nomeSegurado;
    }


    /**
     * Sets the nomeSegurado value for this Aviso.
     * 
     * @param nomeSegurado
     */
    public void setNomeSegurado(java.lang.String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }


    /**
     * Gets the logradouro value for this Aviso.
     * 
     * @return logradouro
     */
    public java.lang.String getLogradouro() {
        return logradouro;
    }


    /**
     * Sets the logradouro value for this Aviso.
     * 
     * @param logradouro
     */
    public void setLogradouro(java.lang.String logradouro) {
        this.logradouro = logradouro;
    }


    /**
     * Gets the numero value for this Aviso.
     * 
     * @return numero
     */
    public java.lang.String getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this Aviso.
     * 
     * @param numero
     */
    public void setNumero(java.lang.String numero) {
        this.numero = numero;
    }


    /**
     * Gets the complemento value for this Aviso.
     * 
     * @return complemento
     */
    public java.lang.String getComplemento() {
        return complemento;
    }


    /**
     * Sets the complemento value for this Aviso.
     * 
     * @param complemento
     */
    public void setComplemento(java.lang.String complemento) {
        this.complemento = complemento;
    }


    /**
     * Gets the bairro value for this Aviso.
     * 
     * @return bairro
     */
    public java.lang.String getBairro() {
        return bairro;
    }


    /**
     * Sets the bairro value for this Aviso.
     * 
     * @param bairro
     */
    public void setBairro(java.lang.String bairro) {
        this.bairro = bairro;
    }


    /**
     * Gets the cidade value for this Aviso.
     * 
     * @return cidade
     */
    public java.lang.String getCidade() {
        return cidade;
    }


    /**
     * Sets the cidade value for this Aviso.
     * 
     * @param cidade
     */
    public void setCidade(java.lang.String cidade) {
        this.cidade = cidade;
    }


    /**
     * Gets the uf value for this Aviso.
     * 
     * @return uf
     */
    public java.lang.String getUf() {
        return uf;
    }


    /**
     * Sets the uf value for this Aviso.
     * 
     * @param uf
     */
    public void setUf(java.lang.String uf) {
        this.uf = uf;
    }


    /**
     * Gets the cep value for this Aviso.
     * 
     * @return cep
     */
    public java.lang.Integer getCep() {
        return cep;
    }


    /**
     * Sets the cep value for this Aviso.
     * 
     * @param cep
     */
    public void setCep(java.lang.Integer cep) {
        this.cep = cep;
    }


    /**
     * Gets the causaSinistro value for this Aviso.
     * 
     * @return causaSinistro
     */
    public java.lang.String getCausaSinistro() {
        return causaSinistro;
    }


    /**
     * Sets the causaSinistro value for this Aviso.
     * 
     * @param causaSinistro
     */
    public void setCausaSinistro(java.lang.String causaSinistro) {
        this.causaSinistro = causaSinistro;
    }


    /**
     * Gets the emailContato value for this Aviso.
     * 
     * @return emailContato
     */
    public java.lang.String getEmailContato() {
        return emailContato;
    }


    /**
     * Sets the emailContato value for this Aviso.
     * 
     * @param emailContato
     */
    public void setEmailContato(java.lang.String emailContato) {
        this.emailContato = emailContato;
    }


    /**
     * Gets the canalSms value for this Aviso.
     * 
     * @return canalSms
     */
    public java.lang.String getCanalSms() {
        return canalSms;
    }


    /**
     * Sets the canalSms value for this Aviso.
     * 
     * @param canalSms
     */
    public void setCanalSms(java.lang.String canalSms) {
        this.canalSms = canalSms;
    }


    /**
     * Gets the canalEmail value for this Aviso.
     * 
     * @return canalEmail
     */
    public java.lang.String getCanalEmail() {
        return canalEmail;
    }


    /**
     * Sets the canalEmail value for this Aviso.
     * 
     * @param canalEmail
     */
    public void setCanalEmail(java.lang.String canalEmail) {
        this.canalEmail = canalEmail;
    }


    /**
     * Gets the flagAcompanhamento value for this Aviso.
     * 
     * @return flagAcompanhamento
     */
    public java.lang.String getFlagAcompanhamento() {
        return flagAcompanhamento;
    }


    /**
     * Sets the flagAcompanhamento value for this Aviso.
     * 
     * @param flagAcompanhamento
     */
    public void setFlagAcompanhamento(java.lang.String flagAcompanhamento) {
        this.flagAcompanhamento = flagAcompanhamento;
    }


    /**
     * Gets the nomeResponsavel value for this Aviso.
     * 
     * @return nomeResponsavel
     */
    public java.lang.String getNomeResponsavel() {
        return nomeResponsavel;
    }


    /**
     * Sets the nomeResponsavel value for this Aviso.
     * 
     * @param nomeResponsavel
     */
    public void setNomeResponsavel(java.lang.String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }


    /**
     * Gets the dddResidenciaResponsavel value for this Aviso.
     * 
     * @return dddResidenciaResponsavel
     */
    public java.lang.Integer getDddResidenciaResponsavel() {
        return dddResidenciaResponsavel;
    }


    /**
     * Sets the dddResidenciaResponsavel value for this Aviso.
     * 
     * @param dddResidenciaResponsavel
     */
    public void setDddResidenciaResponsavel(java.lang.Integer dddResidenciaResponsavel) {
        this.dddResidenciaResponsavel = dddResidenciaResponsavel;
    }


    /**
     * Gets the telefoneResidenciaResponsavel value for this Aviso.
     * 
     * @return telefoneResidenciaResponsavel
     */
    public java.lang.Long getTelefoneResidenciaResponsavel() {
        return telefoneResidenciaResponsavel;
    }


    /**
     * Sets the telefoneResidenciaResponsavel value for this Aviso.
     * 
     * @param telefoneResidenciaResponsavel
     */
    public void setTelefoneResidenciaResponsavel(java.lang.Long telefoneResidenciaResponsavel) {
        this.telefoneResidenciaResponsavel = telefoneResidenciaResponsavel;
    }


    /**
     * Gets the dddCelularResponsavel value for this Aviso.
     * 
     * @return dddCelularResponsavel
     */
    public java.lang.Integer getDddCelularResponsavel() {
        return dddCelularResponsavel;
    }


    /**
     * Sets the dddCelularResponsavel value for this Aviso.
     * 
     * @param dddCelularResponsavel
     */
    public void setDddCelularResponsavel(java.lang.Integer dddCelularResponsavel) {
        this.dddCelularResponsavel = dddCelularResponsavel;
    }


    /**
     * Gets the celularResponsavel value for this Aviso.
     * 
     * @return celularResponsavel
     */
    public java.lang.Long getCelularResponsavel() {
        return celularResponsavel;
    }


    /**
     * Sets the celularResponsavel value for this Aviso.
     * 
     * @param celularResponsavel
     */
    public void setCelularResponsavel(java.lang.Long celularResponsavel) {
        this.celularResponsavel = celularResponsavel;
    }


    /**
     * Gets the emailResponsavel value for this Aviso.
     * 
     * @return emailResponsavel
     */
    public java.lang.String getEmailResponsavel() {
        return emailResponsavel;
    }


    /**
     * Sets the emailResponsavel value for this Aviso.
     * 
     * @param emailResponsavel
     */
    public void setEmailResponsavel(java.lang.String emailResponsavel) {
        this.emailResponsavel = emailResponsavel;
    }


    /**
     * Gets the codigoPessoa value for this Aviso.
     * 
     * @return codigoPessoa
     */
    public java.lang.String getCodigoPessoa() {
        return codigoPessoa;
    }


    /**
     * Sets the codigoPessoa value for this Aviso.
     * 
     * @param codigoPessoa
     */
    public void setCodigoPessoa(java.lang.String codigoPessoa) {
        this.codigoPessoa = codigoPessoa;
    }


    /**
     * Gets the nomePessoa value for this Aviso.
     * 
     * @return nomePessoa
     */
    public java.lang.String getNomePessoa() {
        return nomePessoa;
    }


    /**
     * Sets the nomePessoa value for this Aviso.
     * 
     * @param nomePessoa
     */
    public void setNomePessoa(java.lang.String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }


    /**
     * Gets the vinculoBeneficiario value for this Aviso.
     * 
     * @return vinculoBeneficiario
     */
    public java.lang.Short getVinculoBeneficiario() {
        return vinculoBeneficiario;
    }


    /**
     * Sets the vinculoBeneficiario value for this Aviso.
     * 
     * @param vinculoBeneficiario
     */
    public void setVinculoBeneficiario(java.lang.Short vinculoBeneficiario) {
        this.vinculoBeneficiario = vinculoBeneficiario;
    }


    /**
     * Gets the codigoBeneficiario value for this Aviso.
     * 
     * @return codigoBeneficiario
     */
    public java.lang.Short getCodigoBeneficiario() {
        return codigoBeneficiario;
    }


    /**
     * Sets the codigoBeneficiario value for this Aviso.
     * 
     * @param codigoBeneficiario
     */
    public void setCodigoBeneficiario(java.lang.Short codigoBeneficiario) {
        this.codigoBeneficiario = codigoBeneficiario;
    }


    /**
     * Gets the nomeBeneficiario value for this Aviso.
     * 
     * @return nomeBeneficiario
     */
    public java.lang.String getNomeBeneficiario() {
        return nomeBeneficiario;
    }


    /**
     * Sets the nomeBeneficiario value for this Aviso.
     * 
     * @param nomeBeneficiario
     */
    public void setNomeBeneficiario(java.lang.String nomeBeneficiario) {
        this.nomeBeneficiario = nomeBeneficiario;
    }


    /**
     * Gets the cpfCnpjBeneficiario value for this Aviso.
     * 
     * @return cpfCnpjBeneficiario
     */
    public java.lang.String getCpfCnpjBeneficiario() {
        return cpfCnpjBeneficiario;
    }


    /**
     * Sets the cpfCnpjBeneficiario value for this Aviso.
     * 
     * @param cpfCnpjBeneficiario
     */
    public void setCpfCnpjBeneficiario(java.lang.String cpfCnpjBeneficiario) {
        this.cpfCnpjBeneficiario = cpfCnpjBeneficiario;
    }


    /**
     * Gets the flagContaBanco value for this Aviso.
     * 
     * @return flagContaBanco
     */
    public java.lang.String getFlagContaBanco() {
        return flagContaBanco;
    }


    /**
     * Sets the flagContaBanco value for this Aviso.
     * 
     * @param flagContaBanco
     */
    public void setFlagContaBanco(java.lang.String flagContaBanco) {
        this.flagContaBanco = flagContaBanco;
    }


    /**
     * Gets the codigoBanco value for this Aviso.
     * 
     * @return codigoBanco
     */
    public java.lang.Short getCodigoBanco() {
        return codigoBanco;
    }


    /**
     * Sets the codigoBanco value for this Aviso.
     * 
     * @param codigoBanco
     */
    public void setCodigoBanco(java.lang.Short codigoBanco) {
        this.codigoBanco = codigoBanco;
    }


    /**
     * Gets the codigoAgencia value for this Aviso.
     * 
     * @return codigoAgencia
     */
    public java.lang.Integer getCodigoAgencia() {
        return codigoAgencia;
    }


    /**
     * Sets the codigoAgencia value for this Aviso.
     * 
     * @param codigoAgencia
     */
    public void setCodigoAgencia(java.lang.Integer codigoAgencia) {
        this.codigoAgencia = codigoAgencia;
    }


    /**
     * Gets the numeroConta value for this Aviso.
     * 
     * @return numeroConta
     */
    public java.lang.Long getNumeroConta() {
        return numeroConta;
    }


    /**
     * Sets the numeroConta value for this Aviso.
     * 
     * @param numeroConta
     */
    public void setNumeroConta(java.lang.Long numeroConta) {
        this.numeroConta = numeroConta;
    }


    /**
     * Gets the digitoVerificadorConta value for this Aviso.
     * 
     * @return digitoVerificadorConta
     */
    public java.lang.String getDigitoVerificadorConta() {
        return digitoVerificadorConta;
    }


    /**
     * Sets the digitoVerificadorConta value for this Aviso.
     * 
     * @param digitoVerificadorConta
     */
    public void setDigitoVerificadorConta(java.lang.String digitoVerificadorConta) {
        this.digitoVerificadorConta = digitoVerificadorConta;
    }


    /**
     * Gets the comunicadoEquipamentoValor value for this Aviso.
     * 
     * @return comunicadoEquipamentoValor
     */
    public br.com.bradseg.sare.avisoeletroportatil.canonico.v1.ComunicadoEquipamentoValorEquipamentoValor[] getComunicadoEquipamentoValor() {
        return comunicadoEquipamentoValor;
    }


    /**
     * Sets the comunicadoEquipamentoValor value for this Aviso.
     * 
     * @param comunicadoEquipamentoValor
     */
    public void setComunicadoEquipamentoValor(br.com.bradseg.sare.avisoeletroportatil.canonico.v1.ComunicadoEquipamentoValorEquipamentoValor[] comunicadoEquipamentoValor) {
        this.comunicadoEquipamentoValor = comunicadoEquipamentoValor;
    }


    /**
     * Gets the simNao value for this Aviso.
     * 
     * @return simNao
     */
    public java.lang.String getSimNao() {
        return simNao;
    }


    /**
     * Sets the simNao value for this Aviso.
     * 
     * @param simNao
     */
    public void setSimNao(java.lang.String simNao) {
        this.simNao = simNao;
    }


    /**
     * Gets the ocorrencia value for this Aviso.
     * 
     * @return ocorrencia
     */
    public short[] getOcorrencia() {
        return ocorrencia;
    }


    /**
     * Sets the ocorrencia value for this Aviso.
     * 
     * @param ocorrencia
     */
    public void setOcorrencia(short[] ocorrencia) {
        this.ocorrencia = ocorrencia;
    }


    /**
     * Gets the certificado value for this Aviso.
     * 
     * @return certificado
     */
    public br.com.bradseg.sare.avisoeletroportatil.canonico.v1.Certificado getCertificado() {
        return certificado;
    }


    /**
     * Sets the certificado value for this Aviso.
     * 
     * @param certificado
     */
    public void setCertificado(br.com.bradseg.sare.avisoeletroportatil.canonico.v1.Certificado certificado) {
        this.certificado = certificado;
    }


    /**
     * Gets the dadosEquipamentos value for this Aviso.
     * 
     * @return dadosEquipamentos
     */
    public br.com.bradseg.sare.avisoeletroportatil.canonico.v1.DadosEquipamentos getDadosEquipamentos() {
        return dadosEquipamentos;
    }


    /**
     * Sets the dadosEquipamentos value for this Aviso.
     * 
     * @param dadosEquipamentos
     */
    public void setDadosEquipamentos(br.com.bradseg.sare.avisoeletroportatil.canonico.v1.DadosEquipamentos dadosEquipamentos) {
        this.dadosEquipamentos = dadosEquipamentos;
    }


    /**
     * Gets the detalheSinistro value for this Aviso.
     * 
     * @return detalheSinistro
     */
    public br.com.bradseg.sare.avisoeletroportatil.canonico.v1.DetalheSinistroExtensaoSinistro[] getDetalheSinistro() {
        return detalheSinistro;
    }


    /**
     * Sets the detalheSinistro value for this Aviso.
     * 
     * @param detalheSinistro
     */
    public void setDetalheSinistro(br.com.bradseg.sare.avisoeletroportatil.canonico.v1.DetalheSinistroExtensaoSinistro[] detalheSinistro) {
        this.detalheSinistro = detalheSinistro;
    }


    /**
     * Gets the tipoSinistro value for this Aviso.
     * 
     * @return tipoSinistro
     */
    public java.lang.Short getTipoSinistro() {
        return tipoSinistro;
    }


    /**
     * Sets the tipoSinistro value for this Aviso.
     * 
     * @param tipoSinistro
     */
    public void setTipoSinistro(java.lang.Short tipoSinistro) {
        this.tipoSinistro = tipoSinistro;
    }


    /**
     * Gets the comunicadoResidencial value for this Aviso.
     * 
     * @return comunicadoResidencial
     */
    public br.com.bradseg.sare.avisoeletroportatil.canonico.v1.ComunicadoResidencial getComunicadoResidencial() {
        return comunicadoResidencial;
    }


    /**
     * Sets the comunicadoResidencial value for this Aviso.
     * 
     * @param comunicadoResidencial
     */
    public void setComunicadoResidencial(br.com.bradseg.sare.avisoeletroportatil.canonico.v1.ComunicadoResidencial comunicadoResidencial) {
        this.comunicadoResidencial = comunicadoResidencial;
    }


    /**
     * Gets the comunicadoEquipamento value for this Aviso.
     * 
     * @return comunicadoEquipamento
     */
    public br.com.bradseg.sare.avisoeletroportatil.canonico.v1.ComunicadoEquipamentoComunicado[] getComunicadoEquipamento() {
        return comunicadoEquipamento;
    }


    /**
     * Sets the comunicadoEquipamento value for this Aviso.
     * 
     * @param comunicadoEquipamento
     */
    public void setComunicadoEquipamento(br.com.bradseg.sare.avisoeletroportatil.canonico.v1.ComunicadoEquipamentoComunicado[] comunicadoEquipamento) {
        this.comunicadoEquipamento = comunicadoEquipamento;
    }


    /**
     * Gets the comunicadoEmpresa value for this Aviso.
     * 
     * @return comunicadoEmpresa
     */
    public br.com.bradseg.sare.avisoeletroportatil.canonico.v1.ComunicadoEmpresa getComunicadoEmpresa() {
        return comunicadoEmpresa;
    }


    /**
     * Sets the comunicadoEmpresa value for this Aviso.
     * 
     * @param comunicadoEmpresa
     */
    public void setComunicadoEmpresa(br.com.bradseg.sare.avisoeletroportatil.canonico.v1.ComunicadoEmpresa comunicadoEmpresa) {
        this.comunicadoEmpresa = comunicadoEmpresa;
    }


    /**
     * Gets the comunicadoTerceiros value for this Aviso.
     * 
     * @return comunicadoTerceiros
     */
    public br.com.bradseg.sare.avisoeletroportatil.canonico.v1.ComunicadoTerceirosTerceiro[] getComunicadoTerceiros() {
        return comunicadoTerceiros;
    }


    /**
     * Sets the comunicadoTerceiros value for this Aviso.
     * 
     * @param comunicadoTerceiros
     */
    public void setComunicadoTerceiros(br.com.bradseg.sare.avisoeletroportatil.canonico.v1.ComunicadoTerceirosTerceiro[] comunicadoTerceiros) {
        this.comunicadoTerceiros = comunicadoTerceiros;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Aviso)) return false;
        Aviso other = (Aviso) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numeroComunicado==null && other.getNumeroComunicado()==null) || 
             (this.numeroComunicado!=null &&
              this.numeroComunicado.equals(other.getNumeroComunicado()))) &&
            ((this.codigoCia==null && other.getCodigoCia()==null) || 
             (this.codigoCia!=null &&
              this.codigoCia.equals(other.getCodigoCia()))) &&
            ((this.codigoSucursal==null && other.getCodigoSucursal()==null) || 
             (this.codigoSucursal!=null &&
              this.codigoSucursal.equals(other.getCodigoSucursal()))) &&
            ((this.codigoRamo==null && other.getCodigoRamo()==null) || 
             (this.codigoRamo!=null &&
              this.codigoRamo.equals(other.getCodigoRamo()))) &&
            ((this.codigoCausa==null && other.getCodigoCausa()==null) || 
             (this.codigoCausa!=null &&
              this.codigoCausa.equals(other.getCodigoCausa()))) &&
            ((this.naturezaSinistro==null && other.getNaturezaSinistro()==null) || 
             (this.naturezaSinistro!=null &&
              this.naturezaSinistro.equals(other.getNaturezaSinistro()))) &&
            ((this.tipoUsuario==null && other.getTipoUsuario()==null) || 
             (this.tipoUsuario!=null &&
              this.tipoUsuario.equals(other.getTipoUsuario()))) &&
            ((this.canalComunicacao==null && other.getCanalComunicacao()==null) || 
             (this.canalComunicacao!=null &&
              this.canalComunicacao.equals(other.getCanalComunicacao()))) &&
            ((this.moeda==null && other.getMoeda()==null) || 
             (this.moeda!=null &&
              this.moeda.equals(other.getMoeda()))) &&
            ((this.dataComunicado==null && other.getDataComunicado()==null) || 
             (this.dataComunicado!=null &&
              this.dataComunicado.equals(other.getDataComunicado()))) &&
            ((this.numeroApolice==null && other.getNumeroApolice()==null) || 
             (this.numeroApolice!=null &&
              this.numeroApolice.equals(other.getNumeroApolice()))) &&
            ((this.dataOcorrencia==null && other.getDataOcorrencia()==null) || 
             (this.dataOcorrencia!=null &&
              this.dataOcorrencia.equals(other.getDataOcorrencia()))) &&
            ((this.horaOcorrencia==null && other.getHoraOcorrencia()==null) || 
             (this.horaOcorrencia!=null &&
              this.horaOcorrencia.equals(other.getHoraOcorrencia()))) &&
            ((this.flagAlteracaoLocal==null && other.getFlagAlteracaoLocal()==null) || 
             (this.flagAlteracaoLocal!=null &&
              this.flagAlteracaoLocal.equals(other.getFlagAlteracaoLocal()))) &&
            ((this.relacaoContato==null && other.getRelacaoContato()==null) || 
             (this.relacaoContato!=null &&
              this.relacaoContato.equals(other.getRelacaoContato()))) &&
            ((this.nomeContato==null && other.getNomeContato()==null) || 
             (this.nomeContato!=null &&
              this.nomeContato.equals(other.getNomeContato()))) &&
            ((this.dddContato==null && other.getDddContato()==null) || 
             (this.dddContato!=null &&
              this.dddContato.equals(other.getDddContato()))) &&
            ((this.telefoneContato==null && other.getTelefoneContato()==null) || 
             (this.telefoneContato!=null &&
              this.telefoneContato.equals(other.getTelefoneContato()))) &&
            ((this.dddCelular==null && other.getDddCelular()==null) || 
             (this.dddCelular!=null &&
              this.dddCelular.equals(other.getDddCelular()))) &&
            ((this.celularContato==null && other.getCelularContato()==null) || 
             (this.celularContato!=null &&
              this.celularContato.equals(other.getCelularContato()))) &&
            ((this.dddComercial==null && other.getDddComercial()==null) || 
             (this.dddComercial!=null &&
              this.dddComercial.equals(other.getDddComercial()))) &&
            ((this.comercialContato==null && other.getComercialContato()==null) || 
             (this.comercialContato!=null &&
              this.comercialContato.equals(other.getComercialContato()))) &&
            ((this.logradouroContato==null && other.getLogradouroContato()==null) || 
             (this.logradouroContato!=null &&
              this.logradouroContato.equals(other.getLogradouroContato()))) &&
            ((this.numeroContato==null && other.getNumeroContato()==null) || 
             (this.numeroContato!=null &&
              this.numeroContato.equals(other.getNumeroContato()))) &&
            ((this.complementoContato==null && other.getComplementoContato()==null) || 
             (this.complementoContato!=null &&
              this.complementoContato.equals(other.getComplementoContato()))) &&
            ((this.bairroContato==null && other.getBairroContato()==null) || 
             (this.bairroContato!=null &&
              this.bairroContato.equals(other.getBairroContato()))) &&
            ((this.cidadeContato==null && other.getCidadeContato()==null) || 
             (this.cidadeContato!=null &&
              this.cidadeContato.equals(other.getCidadeContato()))) &&
            ((this.ufContato==null && other.getUfContato()==null) || 
             (this.ufContato!=null &&
              this.ufContato.equals(other.getUfContato()))) &&
            ((this.cepContato==null && other.getCepContato()==null) || 
             (this.cepContato!=null &&
              this.cepContato.equals(other.getCepContato()))) &&
            ((this.valorPrevisto==null && other.getValorPrevisto()==null) || 
             (this.valorPrevisto!=null &&
              this.valorPrevisto.equals(other.getValorPrevisto()))) &&
            ((this.descricaoSinistro==null && other.getDescricaoSinistro()==null) || 
             (this.descricaoSinistro!=null &&
              this.descricaoSinistro.equals(other.getDescricaoSinistro()))) &&
            ((this.participanteBombeiro==null && other.getParticipanteBombeiro()==null) || 
             (this.participanteBombeiro!=null &&
              this.participanteBombeiro.equals(other.getParticipanteBombeiro()))) &&
            ((this.boletoOcorrencia==null && other.getBoletoOcorrencia()==null) || 
             (this.boletoOcorrencia!=null &&
              this.boletoOcorrencia.equals(other.getBoletoOcorrencia()))) &&
            ((this.flagAlteracao==null && other.getFlagAlteracao()==null) || 
             (this.flagAlteracao!=null &&
              this.flagAlteracao.equals(other.getFlagAlteracao()))) &&
            ((this.cpfCnpj==null && other.getCpfCnpj()==null) || 
             (this.cpfCnpj!=null &&
              this.cpfCnpj.equals(other.getCpfCnpj()))) &&
            ((this.nomeSegurado==null && other.getNomeSegurado()==null) || 
             (this.nomeSegurado!=null &&
              this.nomeSegurado.equals(other.getNomeSegurado()))) &&
            ((this.logradouro==null && other.getLogradouro()==null) || 
             (this.logradouro!=null &&
              this.logradouro.equals(other.getLogradouro()))) &&
            ((this.numero==null && other.getNumero()==null) || 
             (this.numero!=null &&
              this.numero.equals(other.getNumero()))) &&
            ((this.complemento==null && other.getComplemento()==null) || 
             (this.complemento!=null &&
              this.complemento.equals(other.getComplemento()))) &&
            ((this.bairro==null && other.getBairro()==null) || 
             (this.bairro!=null &&
              this.bairro.equals(other.getBairro()))) &&
            ((this.cidade==null && other.getCidade()==null) || 
             (this.cidade!=null &&
              this.cidade.equals(other.getCidade()))) &&
            ((this.uf==null && other.getUf()==null) || 
             (this.uf!=null &&
              this.uf.equals(other.getUf()))) &&
            ((this.cep==null && other.getCep()==null) || 
             (this.cep!=null &&
              this.cep.equals(other.getCep()))) &&
            ((this.causaSinistro==null && other.getCausaSinistro()==null) || 
             (this.causaSinistro!=null &&
              this.causaSinistro.equals(other.getCausaSinistro()))) &&
            ((this.emailContato==null && other.getEmailContato()==null) || 
             (this.emailContato!=null &&
              this.emailContato.equals(other.getEmailContato()))) &&
            ((this.canalSms==null && other.getCanalSms()==null) || 
             (this.canalSms!=null &&
              this.canalSms.equals(other.getCanalSms()))) &&
            ((this.canalEmail==null && other.getCanalEmail()==null) || 
             (this.canalEmail!=null &&
              this.canalEmail.equals(other.getCanalEmail()))) &&
            ((this.flagAcompanhamento==null && other.getFlagAcompanhamento()==null) || 
             (this.flagAcompanhamento!=null &&
              this.flagAcompanhamento.equals(other.getFlagAcompanhamento()))) &&
            ((this.nomeResponsavel==null && other.getNomeResponsavel()==null) || 
             (this.nomeResponsavel!=null &&
              this.nomeResponsavel.equals(other.getNomeResponsavel()))) &&
            ((this.dddResidenciaResponsavel==null && other.getDddResidenciaResponsavel()==null) || 
             (this.dddResidenciaResponsavel!=null &&
              this.dddResidenciaResponsavel.equals(other.getDddResidenciaResponsavel()))) &&
            ((this.telefoneResidenciaResponsavel==null && other.getTelefoneResidenciaResponsavel()==null) || 
             (this.telefoneResidenciaResponsavel!=null &&
              this.telefoneResidenciaResponsavel.equals(other.getTelefoneResidenciaResponsavel()))) &&
            ((this.dddCelularResponsavel==null && other.getDddCelularResponsavel()==null) || 
             (this.dddCelularResponsavel!=null &&
              this.dddCelularResponsavel.equals(other.getDddCelularResponsavel()))) &&
            ((this.celularResponsavel==null && other.getCelularResponsavel()==null) || 
             (this.celularResponsavel!=null &&
              this.celularResponsavel.equals(other.getCelularResponsavel()))) &&
            ((this.emailResponsavel==null && other.getEmailResponsavel()==null) || 
             (this.emailResponsavel!=null &&
              this.emailResponsavel.equals(other.getEmailResponsavel()))) &&
            ((this.codigoPessoa==null && other.getCodigoPessoa()==null) || 
             (this.codigoPessoa!=null &&
              this.codigoPessoa.equals(other.getCodigoPessoa()))) &&
            ((this.nomePessoa==null && other.getNomePessoa()==null) || 
             (this.nomePessoa!=null &&
              this.nomePessoa.equals(other.getNomePessoa()))) &&
            ((this.vinculoBeneficiario==null && other.getVinculoBeneficiario()==null) || 
             (this.vinculoBeneficiario!=null &&
              this.vinculoBeneficiario.equals(other.getVinculoBeneficiario()))) &&
            ((this.codigoBeneficiario==null && other.getCodigoBeneficiario()==null) || 
             (this.codigoBeneficiario!=null &&
              this.codigoBeneficiario.equals(other.getCodigoBeneficiario()))) &&
            ((this.nomeBeneficiario==null && other.getNomeBeneficiario()==null) || 
             (this.nomeBeneficiario!=null &&
              this.nomeBeneficiario.equals(other.getNomeBeneficiario()))) &&
            ((this.cpfCnpjBeneficiario==null && other.getCpfCnpjBeneficiario()==null) || 
             (this.cpfCnpjBeneficiario!=null &&
              this.cpfCnpjBeneficiario.equals(other.getCpfCnpjBeneficiario()))) &&
            ((this.flagContaBanco==null && other.getFlagContaBanco()==null) || 
             (this.flagContaBanco!=null &&
              this.flagContaBanco.equals(other.getFlagContaBanco()))) &&
            ((this.codigoBanco==null && other.getCodigoBanco()==null) || 
             (this.codigoBanco!=null &&
              this.codigoBanco.equals(other.getCodigoBanco()))) &&
            ((this.codigoAgencia==null && other.getCodigoAgencia()==null) || 
             (this.codigoAgencia!=null &&
              this.codigoAgencia.equals(other.getCodigoAgencia()))) &&
            ((this.numeroConta==null && other.getNumeroConta()==null) || 
             (this.numeroConta!=null &&
              this.numeroConta.equals(other.getNumeroConta()))) &&
            ((this.digitoVerificadorConta==null && other.getDigitoVerificadorConta()==null) || 
             (this.digitoVerificadorConta!=null &&
              this.digitoVerificadorConta.equals(other.getDigitoVerificadorConta()))) &&
            ((this.comunicadoEquipamentoValor==null && other.getComunicadoEquipamentoValor()==null) || 
             (this.comunicadoEquipamentoValor!=null &&
              java.util.Arrays.equals(this.comunicadoEquipamentoValor, other.getComunicadoEquipamentoValor()))) &&
            ((this.simNao==null && other.getSimNao()==null) || 
             (this.simNao!=null &&
              this.simNao.equals(other.getSimNao()))) &&
            ((this.ocorrencia==null && other.getOcorrencia()==null) || 
             (this.ocorrencia!=null &&
              java.util.Arrays.equals(this.ocorrencia, other.getOcorrencia()))) &&
            ((this.certificado==null && other.getCertificado()==null) || 
             (this.certificado!=null &&
              this.certificado.equals(other.getCertificado()))) &&
            ((this.dadosEquipamentos==null && other.getDadosEquipamentos()==null) || 
             (this.dadosEquipamentos!=null &&
              this.dadosEquipamentos.equals(other.getDadosEquipamentos()))) &&
            ((this.detalheSinistro==null && other.getDetalheSinistro()==null) || 
             (this.detalheSinistro!=null &&
              java.util.Arrays.equals(this.detalheSinistro, other.getDetalheSinistro()))) &&
            ((this.tipoSinistro==null && other.getTipoSinistro()==null) || 
             (this.tipoSinistro!=null &&
              this.tipoSinistro.equals(other.getTipoSinistro()))) &&
            ((this.comunicadoResidencial==null && other.getComunicadoResidencial()==null) || 
             (this.comunicadoResidencial!=null &&
              this.comunicadoResidencial.equals(other.getComunicadoResidencial()))) &&
            ((this.comunicadoEquipamento==null && other.getComunicadoEquipamento()==null) || 
             (this.comunicadoEquipamento!=null &&
              java.util.Arrays.equals(this.comunicadoEquipamento, other.getComunicadoEquipamento()))) &&
            ((this.comunicadoEmpresa==null && other.getComunicadoEmpresa()==null) || 
             (this.comunicadoEmpresa!=null &&
              this.comunicadoEmpresa.equals(other.getComunicadoEmpresa()))) &&
            ((this.comunicadoTerceiros==null && other.getComunicadoTerceiros()==null) || 
             (this.comunicadoTerceiros!=null &&
              java.util.Arrays.equals(this.comunicadoTerceiros, other.getComunicadoTerceiros())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getNumeroComunicado() != null) {
            _hashCode += getNumeroComunicado().hashCode();
        }
        if (getCodigoCia() != null) {
            _hashCode += getCodigoCia().hashCode();
        }
        if (getCodigoSucursal() != null) {
            _hashCode += getCodigoSucursal().hashCode();
        }
        if (getCodigoRamo() != null) {
            _hashCode += getCodigoRamo().hashCode();
        }
        if (getCodigoCausa() != null) {
            _hashCode += getCodigoCausa().hashCode();
        }
        if (getNaturezaSinistro() != null) {
            _hashCode += getNaturezaSinistro().hashCode();
        }
        if (getTipoUsuario() != null) {
            _hashCode += getTipoUsuario().hashCode();
        }
        if (getCanalComunicacao() != null) {
            _hashCode += getCanalComunicacao().hashCode();
        }
        if (getMoeda() != null) {
            _hashCode += getMoeda().hashCode();
        }
        if (getDataComunicado() != null) {
            _hashCode += getDataComunicado().hashCode();
        }
        if (getNumeroApolice() != null) {
            _hashCode += getNumeroApolice().hashCode();
        }
        if (getDataOcorrencia() != null) {
            _hashCode += getDataOcorrencia().hashCode();
        }
        if (getHoraOcorrencia() != null) {
            _hashCode += getHoraOcorrencia().hashCode();
        }
        if (getFlagAlteracaoLocal() != null) {
            _hashCode += getFlagAlteracaoLocal().hashCode();
        }
        if (getRelacaoContato() != null) {
            _hashCode += getRelacaoContato().hashCode();
        }
        if (getNomeContato() != null) {
            _hashCode += getNomeContato().hashCode();
        }
        if (getDddContato() != null) {
            _hashCode += getDddContato().hashCode();
        }
        if (getTelefoneContato() != null) {
            _hashCode += getTelefoneContato().hashCode();
        }
        if (getDddCelular() != null) {
            _hashCode += getDddCelular().hashCode();
        }
        if (getCelularContato() != null) {
            _hashCode += getCelularContato().hashCode();
        }
        if (getDddComercial() != null) {
            _hashCode += getDddComercial().hashCode();
        }
        if (getComercialContato() != null) {
            _hashCode += getComercialContato().hashCode();
        }
        if (getLogradouroContato() != null) {
            _hashCode += getLogradouroContato().hashCode();
        }
        if (getNumeroContato() != null) {
            _hashCode += getNumeroContato().hashCode();
        }
        if (getComplementoContato() != null) {
            _hashCode += getComplementoContato().hashCode();
        }
        if (getBairroContato() != null) {
            _hashCode += getBairroContato().hashCode();
        }
        if (getCidadeContato() != null) {
            _hashCode += getCidadeContato().hashCode();
        }
        if (getUfContato() != null) {
            _hashCode += getUfContato().hashCode();
        }
        if (getCepContato() != null) {
            _hashCode += getCepContato().hashCode();
        }
        if (getValorPrevisto() != null) {
            _hashCode += getValorPrevisto().hashCode();
        }
        if (getDescricaoSinistro() != null) {
            _hashCode += getDescricaoSinistro().hashCode();
        }
        if (getParticipanteBombeiro() != null) {
            _hashCode += getParticipanteBombeiro().hashCode();
        }
        if (getBoletoOcorrencia() != null) {
            _hashCode += getBoletoOcorrencia().hashCode();
        }
        if (getFlagAlteracao() != null) {
            _hashCode += getFlagAlteracao().hashCode();
        }
        if (getCpfCnpj() != null) {
            _hashCode += getCpfCnpj().hashCode();
        }
        if (getNomeSegurado() != null) {
            _hashCode += getNomeSegurado().hashCode();
        }
        if (getLogradouro() != null) {
            _hashCode += getLogradouro().hashCode();
        }
        if (getNumero() != null) {
            _hashCode += getNumero().hashCode();
        }
        if (getComplemento() != null) {
            _hashCode += getComplemento().hashCode();
        }
        if (getBairro() != null) {
            _hashCode += getBairro().hashCode();
        }
        if (getCidade() != null) {
            _hashCode += getCidade().hashCode();
        }
        if (getUf() != null) {
            _hashCode += getUf().hashCode();
        }
        if (getCep() != null) {
            _hashCode += getCep().hashCode();
        }
        if (getCausaSinistro() != null) {
            _hashCode += getCausaSinistro().hashCode();
        }
        if (getEmailContato() != null) {
            _hashCode += getEmailContato().hashCode();
        }
        if (getCanalSms() != null) {
            _hashCode += getCanalSms().hashCode();
        }
        if (getCanalEmail() != null) {
            _hashCode += getCanalEmail().hashCode();
        }
        if (getFlagAcompanhamento() != null) {
            _hashCode += getFlagAcompanhamento().hashCode();
        }
        if (getNomeResponsavel() != null) {
            _hashCode += getNomeResponsavel().hashCode();
        }
        if (getDddResidenciaResponsavel() != null) {
            _hashCode += getDddResidenciaResponsavel().hashCode();
        }
        if (getTelefoneResidenciaResponsavel() != null) {
            _hashCode += getTelefoneResidenciaResponsavel().hashCode();
        }
        if (getDddCelularResponsavel() != null) {
            _hashCode += getDddCelularResponsavel().hashCode();
        }
        if (getCelularResponsavel() != null) {
            _hashCode += getCelularResponsavel().hashCode();
        }
        if (getEmailResponsavel() != null) {
            _hashCode += getEmailResponsavel().hashCode();
        }
        if (getCodigoPessoa() != null) {
            _hashCode += getCodigoPessoa().hashCode();
        }
        if (getNomePessoa() != null) {
            _hashCode += getNomePessoa().hashCode();
        }
        if (getVinculoBeneficiario() != null) {
            _hashCode += getVinculoBeneficiario().hashCode();
        }
        if (getCodigoBeneficiario() != null) {
            _hashCode += getCodigoBeneficiario().hashCode();
        }
        if (getNomeBeneficiario() != null) {
            _hashCode += getNomeBeneficiario().hashCode();
        }
        if (getCpfCnpjBeneficiario() != null) {
            _hashCode += getCpfCnpjBeneficiario().hashCode();
        }
        if (getFlagContaBanco() != null) {
            _hashCode += getFlagContaBanco().hashCode();
        }
        if (getCodigoBanco() != null) {
            _hashCode += getCodigoBanco().hashCode();
        }
        if (getCodigoAgencia() != null) {
            _hashCode += getCodigoAgencia().hashCode();
        }
        if (getNumeroConta() != null) {
            _hashCode += getNumeroConta().hashCode();
        }
        if (getDigitoVerificadorConta() != null) {
            _hashCode += getDigitoVerificadorConta().hashCode();
        }
        if (getComunicadoEquipamentoValor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComunicadoEquipamentoValor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComunicadoEquipamentoValor(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSimNao() != null) {
            _hashCode += getSimNao().hashCode();
        }
        if (getOcorrencia() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOcorrencia());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOcorrencia(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCertificado() != null) {
            _hashCode += getCertificado().hashCode();
        }
        if (getDadosEquipamentos() != null) {
            _hashCode += getDadosEquipamentos().hashCode();
        }
        if (getDetalheSinistro() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetalheSinistro());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetalheSinistro(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTipoSinistro() != null) {
            _hashCode += getTipoSinistro().hashCode();
        }
        if (getComunicadoResidencial() != null) {
            _hashCode += getComunicadoResidencial().hashCode();
        }
        if (getComunicadoEquipamento() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComunicadoEquipamento());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComunicadoEquipamento(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComunicadoEmpresa() != null) {
            _hashCode += getComunicadoEmpresa().hashCode();
        }
        if (getComunicadoTerceiros() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComunicadoTerceiros());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComunicadoTerceiros(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Aviso.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "Aviso"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroComunicado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "numeroComunicado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoCia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "codigoCia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoSucursal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "codigoSucursal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoRamo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "codigoRamo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoCausa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "codigoCausa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("naturezaSinistro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "naturezaSinistro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoUsuario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "tipoUsuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canalComunicacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "canalComunicacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moeda");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "moeda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataComunicado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "dataComunicado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroApolice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "numeroApolice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataOcorrencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "dataOcorrencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horaOcorrencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "horaOcorrencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagAlteracaoLocal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "flagAlteracaoLocal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relacaoContato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "relacaoContato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeContato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "nomeContato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dddContato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "dddContato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefoneContato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "telefoneContato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dddCelular");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "dddCelular"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("celularContato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "celularContato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dddComercial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "dddComercial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comercialContato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "comercialContato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logradouroContato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "logradouroContato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroContato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "numeroContato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complementoContato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "complementoContato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bairroContato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "bairroContato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cidadeContato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "cidadeContato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ufContato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "ufContato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cepContato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "cepContato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorPrevisto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "valorPrevisto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoSinistro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "descricaoSinistro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("participanteBombeiro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "participanteBombeiro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boletoOcorrencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "boletoOcorrencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagAlteracao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "flagAlteracao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpfCnpj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "cpfCnpj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeSegurado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "nomeSegurado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logradouro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "logradouro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "numero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complemento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "complemento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bairro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "bairro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "cidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "uf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cep");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "cep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("causaSinistro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "causaSinistro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailContato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "emailContato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canalSms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "canalSms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canalEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "canalEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagAcompanhamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "flagAcompanhamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeResponsavel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "nomeResponsavel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dddResidenciaResponsavel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "dddResidenciaResponsavel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefoneResidenciaResponsavel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "telefoneResidenciaResponsavel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dddCelularResponsavel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "dddCelularResponsavel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("celularResponsavel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "celularResponsavel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailResponsavel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "emailResponsavel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoPessoa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "codigoPessoa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomePessoa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "nomePessoa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vinculoBeneficiario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "vinculoBeneficiario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoBeneficiario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "codigoBeneficiario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeBeneficiario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "nomeBeneficiario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpfCnpjBeneficiario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "cpfCnpjBeneficiario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagContaBanco");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "flagContaBanco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoBanco");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "codigoBanco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoAgencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "codigoAgencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroConta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "numeroConta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("digitoVerificadorConta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "digitoVerificadorConta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comunicadoEquipamentoValor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "comunicadoEquipamentoValor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", ">ComunicadoEquipamentoValor>equipamentoValor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "equipamentoValor"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simNao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "simNao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ocorrencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "ocorrencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "codigoCia"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "certificado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "Certificado"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dadosEquipamentos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "dadosEquipamentos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "DadosEquipamentos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detalheSinistro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "detalheSinistro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", ">DetalheSinistro>extensaoSinistro"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "extensaoSinistro"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoSinistro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "tipoSinistro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comunicadoResidencial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "comunicadoResidencial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "ComunicadoResidencial"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comunicadoEquipamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "comunicadoEquipamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", ">ComunicadoEquipamento>comunicado"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "comunicado"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comunicadoEmpresa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "comunicadoEmpresa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "ComunicadoEmpresa"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comunicadoTerceiros");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "comunicadoTerceiros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", ">ComunicadoTerceiros>terceiro"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "terceiro"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
