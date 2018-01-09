
package br.com.plusoft.csi.bradescoaf.crm.vo.sinistro;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class OutrosEnvolvido {

    private String nome;
    private String cpf;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public OutrosEnvolvido() {
    }

    /**
     * 
     * @param cpf
     * @param nome
     */
    public OutrosEnvolvido(String nome, String cpf) {
        super();
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
        return new HashCodeBuilder().append(nome).append(cpf).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OutrosEnvolvido) == false) {
            return false;
        }
        OutrosEnvolvido rhs = ((OutrosEnvolvido) other);
        return new EqualsBuilder().append(nome, rhs.nome).append(cpf, rhs.cpf).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
