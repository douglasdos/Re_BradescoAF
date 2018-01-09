
package br.com.plusoft.csi.bradescoaf.crm.vo.sinistro;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Equipamento {

	private Long item;
    private String descricao;
    private String serieEquipamento;
    private String marca;
    private Long anoFrabicacaoEquipamento;
    private String modelo;
    private String qtde;
    private String valorEstimado;
    private String valor;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Equipamento() {
    }

    /**
     * 
     * @param qtde
     * @param valorEstimado
     * @param valor
     * @param serieEquipamento
     * @param anoFrabicacaoEquipamento
     * @param item
     * @param marca
     * @param modelo
     * @param descricao
     */
    public Equipamento(Boolean alterado, Long item, String descricao, String serieEquipamento, String marca, Long anoFrabicacaoEquipamento, String modelo, String qtde, String valorEstimado, String valor) {
        super();
        this.item = item;
        this.descricao = descricao;
        this.serieEquipamento = serieEquipamento;
        this.marca = marca;
        this.anoFrabicacaoEquipamento = anoFrabicacaoEquipamento;
        this.modelo = modelo;
        this.qtde = qtde;
        this.valorEstimado = valorEstimado;
        this.valor = valor;
    }

    public Long getItem() {
        return item;
    }

    public void setItem(Long item) {
        this.item = item;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSerieEquipamento() {
        return serieEquipamento;
    }

    public void setSerieEquipamento(String serieEquipamento) {
        this.serieEquipamento = serieEquipamento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Long getAnoFrabicacaoEquipamento() {
        return anoFrabicacaoEquipamento;
    }

    public void setAnoFrabicacaoEquipamento(Long anoFrabicacaoEquipamento) {
        this.anoFrabicacaoEquipamento = anoFrabicacaoEquipamento;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getQtde() {
        return qtde;
    }

    public void setQtde(String qtde) {
        this.qtde = qtde;
    }

    public String getValorEstimado() {
        return valorEstimado;
    }

    public void setValorEstimado(String valorEstimado) {
        this.valorEstimado = valorEstimado;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
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
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((anoFrabicacaoEquipamento == null) ? 0
						: anoFrabicacaoEquipamento.hashCode());
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + ((qtde == null) ? 0 : qtde.hashCode());
		result = prime
				* result
				+ ((serieEquipamento == null) ? 0 : serieEquipamento.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		result = prime * result
				+ ((valorEstimado == null) ? 0 : valorEstimado.hashCode());
		return result;
	}

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipamento other = (Equipamento) obj;
		if (anoFrabicacaoEquipamento == null) {
			if (other.anoFrabicacaoEquipamento != null)
				return false;
		} else if (!anoFrabicacaoEquipamento
				.equals(other.anoFrabicacaoEquipamento))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (qtde == null) {
			if (other.qtde != null)
				return false;
		} else if (!qtde.equals(other.qtde))
			return false;
		if (serieEquipamento == null) {
			if (other.serieEquipamento != null)
				return false;
		} else if (!serieEquipamento.equals(other.serieEquipamento))
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		if (valorEstimado == null) {
			if (other.valorEstimado != null)
				return false;
		} else if (!valorEstimado.equals(other.valorEstimado))
			return false;
		return true;
	}

	
    
    

}
