
package br.com.plusoft.csi.bradescoaf.crm.vo.sinistro;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Sinistro {

    private Boolean endNaoCorreto;
    private Causa causa;
    private String data;
    private Natureza natureza;
    private String hora;
    private String cep;
    private String endereco;
    private String numero;
    private String complemento;
    private Uf uf;
    private Cidade cidade;
    private String bairro;
    private String descricao;
    private Boolean houveCorpoBombeiro;
    private Boolean moradiaHabitavel;
    private Boolean providenciouBo;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Sinistro() {
    }

    /**
     * 
     * @param houveCorpoBombeiro
     * @param complemento
     * @param providenciouBo
     * @param endNaoCorreto
     * @param uf
     * @param data
     * @param descricao
     * @param causa
     * @param numero
     * @param moradiaHabitavel
     * @param hora
     * @param cidade
     * @param bairro
     * @param cep
     * @param natureza
     * @param endereco
     */
    public Sinistro(Boolean endNaoCorreto, Causa causa, String data, Natureza natureza, String hora, String cep, String endereco, String numero, String complemento, Uf uf, Cidade cidade, String bairro, String descricao, Boolean houveCorpoBombeiro, Boolean moradiaHabitavel, Boolean providenciouBo) {
        super();
        this.endNaoCorreto = endNaoCorreto;
        this.causa = causa;
        this.data = data;
        this.natureza = natureza;
        this.hora = hora;
        this.cep = cep;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.uf = uf;
        this.cidade = cidade;
        this.bairro = bairro;
        this.descricao = descricao;
        this.houveCorpoBombeiro = houveCorpoBombeiro;
        this.moradiaHabitavel = moradiaHabitavel;
        this.providenciouBo = providenciouBo;
    }

    public Boolean getEndNaoCorreto() {
        return endNaoCorreto;
    }

    public void setEndNaoCorreto(Boolean endNaoCorreto) {
        this.endNaoCorreto = endNaoCorreto;
    }

    public Causa getCausa() {
        return causa;
    }

    public void setCausa(Causa causa) {
        this.causa = causa;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Natureza getNatureza() {
        return natureza;
    }

    public void setNatureza(Natureza natureza) {
        this.natureza = natureza;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Uf getUf() {
        return uf;
    }

    public void setUf(Uf uf) {
        this.uf = uf;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getHouveCorpoBombeiro() {
        return houveCorpoBombeiro;
    }

    public void setHouveCorpoBombeiro(Boolean houveCorpoBombeiro) {
        this.houveCorpoBombeiro = houveCorpoBombeiro;
    }

    public Boolean getMoradiaHabitavel() {
        return moradiaHabitavel;
    }

    public void setMoradiaHabitavel(Boolean moradiaHabitavel) {
        this.moradiaHabitavel = moradiaHabitavel;
    }

    public Boolean getProvidenciouBo() {
        return providenciouBo;
    }

    public void setProvidenciouBo(Boolean providenciouBo) {
        this.providenciouBo = providenciouBo;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(endNaoCorreto).append(causa).append(data).append(natureza).append(hora).append(cep).append(endereco).append(numero).append(complemento).append(uf).append(cidade).append(bairro).append(descricao).append(houveCorpoBombeiro).append(moradiaHabitavel).append(providenciouBo).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sinistro) == false) {
            return false;
        }
        Sinistro rhs = ((Sinistro) other);
        return new EqualsBuilder().append(endNaoCorreto, rhs.endNaoCorreto).append(causa, rhs.causa).append(data, rhs.data).append(natureza, rhs.natureza).append(hora, rhs.hora).append(cep, rhs.cep).append(endereco, rhs.endereco).append(numero, rhs.numero).append(complemento, rhs.complemento).append(uf, rhs.uf).append(cidade, rhs.cidade).append(bairro, rhs.bairro).append(descricao, rhs.descricao).append(houveCorpoBombeiro, rhs.houveCorpoBombeiro).append(moradiaHabitavel, rhs.moradiaHabitavel).append(providenciouBo, rhs.providenciouBo).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
