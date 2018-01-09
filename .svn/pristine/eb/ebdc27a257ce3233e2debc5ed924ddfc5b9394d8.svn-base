
package br.com.plusoft.csi.bradescoaf.crm.vo.sinistro;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class DetalheBemSinistrado {

    private String detClassificacao;
    private String detClassificacaoDescricao;
    private String qtde;
    private String detValor;
    private String detValorTotalDanos;
    private String descricao;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public DetalheBemSinistrado() {
    }

    /**
     * 
     * @param qtde
     * @param detClassificacaoDescricao
     * @param detValorTotalDanos
     * @param descricao
     * @param detClassificacao
     * @param detValor
     */
    public DetalheBemSinistrado(String detClassificacao, String detClassificacaoDescricao, String qtde, String detValor, String detValorTotalDanos, String descricao) {
        super();
        this.detClassificacao = detClassificacao;
        this.detClassificacaoDescricao = detClassificacaoDescricao;
        this.qtde = qtde;
        this.detValor = detValor;
        this.detValorTotalDanos = detValorTotalDanos;
        this.descricao = descricao;
    }

    public String getDetClassificacao() {
        return detClassificacao;
    }

    public void setDetClassificacao(String detClassificacao) {
        this.detClassificacao = detClassificacao;
    }

    public String getDetClassificacaoDescricao() {
        return detClassificacaoDescricao;
    }

    public void setDetClassificacaoDescricao(String detClassificacaoDescricao) {
        this.detClassificacaoDescricao = detClassificacaoDescricao;
    }

    public String getQtde() {
        return qtde;
    }

    public void setQtde(String qtde) {
        this.qtde = qtde;
    }

    public String getDetValor() {
        return detValor;
    }

    public void setDetValor(String detValor) {
        this.detValor = detValor;
    }

    public String getDetValorTotalDanos() {
        return detValorTotalDanos;
    }

    public void setDetValorTotalDanos(String detValorTotalDanos) {
        this.detValorTotalDanos = detValorTotalDanos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
        return new HashCodeBuilder().append(detClassificacao).append(detClassificacaoDescricao).append(qtde).append(detValor).append(detValorTotalDanos).append(descricao).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DetalheBemSinistrado) == false) {
            return false;
        }
        DetalheBemSinistrado rhs = ((DetalheBemSinistrado) other);
        return new EqualsBuilder().append(detClassificacao, rhs.detClassificacao).append(detClassificacaoDescricao, rhs.detClassificacaoDescricao).append(qtde, rhs.qtde).append(detValor, rhs.detValor).append(detValorTotalDanos, rhs.detValorTotalDanos).append(descricao, rhs.descricao).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
