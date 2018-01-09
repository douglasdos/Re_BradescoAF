
package br.com.plusoft.csi.bradescoaf.crm.vo.sinistro;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Comunicado {

    private String contato;
    private String ddd;
    private String telefone;
    private TipoRelacao tipoRelacao;
    private String apolice;
    private String codCorretor;
    private String numAvisoSinistro;
    private String status;
    private String nomeCorretor;
    private String nomeSegurado;
    
    private String codigoSucursal;
	private String codigoCia;
	private String codigoRamo;
	private String codigoApolice;
	
	private String codigoProduto;
	private String descricaoProduto;
	
	private String dataOcorrenciaIdentificacao;
	private String horaOcorrenciaIdentificacao;
	
  
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Comunicado() {
    }

    /**
     * 
     * @param codCorretor
     * @param contato
     * @param nomeCorretor
     * @param ddd
     * @param nomeSegurado
     * @param status
     * @param telefone
     * @param numAvisoSinistro
     * @param apolice
     * @param tipoRelacao
     */
    public Comunicado(String contato, String ddd, String telefone, TipoRelacao tipoRelacao, String apolice, String codCorretor, String numAvisoSinistro, String status, String nomeCorretor, String nomeSegurado , String codigoSucursal,String codigoCia, String codigoRamo, String codigoApolice) {
        super();
        this.contato = contato;
        this.ddd = ddd;
        this.telefone = telefone;
        this.tipoRelacao = tipoRelacao;
        this.apolice = apolice;
        this.codCorretor = codCorretor;
        this.numAvisoSinistro = numAvisoSinistro;
        this.status = status;
        this.nomeCorretor = nomeCorretor;
        this.nomeSegurado = nomeSegurado;
        this.codigoSucursal = codigoSucursal;
    	this.codigoCia = codigoCia;
    	this.codigoRamo = codigoRamo;
    	this.codigoApolice = codigoApolice; 
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public TipoRelacao getTipoRelacao() {
        return tipoRelacao;
    }

    public void setTipoRelacao(TipoRelacao tipoRelacao) {
        this.tipoRelacao = tipoRelacao;
    }

    public String getApolice() {
        return apolice;
    }

    public void setApolice(String apolice) {
        this.apolice = apolice;
    }

    public String getCodCorretor() {
        return codCorretor;
    }

    public void setCodCorretor(String codCorretor) {
        this.codCorretor = codCorretor;
    }

    public String getNumAvisoSinistro() {
        return numAvisoSinistro;
    }

    public void setNumAvisoSinistro(String numAvisoSinistro) {
        this.numAvisoSinistro = numAvisoSinistro;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNomeCorretor() {
        return nomeCorretor;
    }

    public void setNomeCorretor(String nomeCorretor) {
        this.nomeCorretor = nomeCorretor;
    }

    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
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

    public String getCodigoSucursal() {
		return codigoSucursal;
	}

	public void setCodigoSucursal(String codigoSucursal) {
		this.codigoSucursal = codigoSucursal;
	}

	public String getCodigoCia() {
		return codigoCia;
	}

	public void setCodigoCia(String codigoCia) {
		this.codigoCia = codigoCia;
	}

	public String getCodigoRamo() {
		return codigoRamo;
	}

	public void setCodigoRamo(String codigoRamo) {
		this.codigoRamo = codigoRamo;
	}

	public String getCodigoApolice() {
		return codigoApolice;
	}

	public void setCodigoApolice(String codigoApolice) {
		this.codigoApolice = codigoApolice;
	}

	public void setAdditionalProperties(Map<String, Object> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apolice == null) ? 0 : apolice.hashCode());
		result = prime * result
				+ ((codCorretor == null) ? 0 : codCorretor.hashCode());
		result = prime * result
				+ ((codigoApolice == null) ? 0 : codigoApolice.hashCode());
		result = prime * result
				+ ((codigoCia == null) ? 0 : codigoCia.hashCode());
		result = prime * result
				+ ((codigoProduto == null) ? 0 : codigoProduto.hashCode());
		result = prime * result
				+ ((codigoRamo == null) ? 0 : codigoRamo.hashCode());
		result = prime * result
				+ ((codigoSucursal == null) ? 0 : codigoSucursal.hashCode());
		result = prime * result + ((contato == null) ? 0 : contato.hashCode());
		result = prime
				* result
				+ ((dataOcorrenciaIdentificacao == null) ? 0
						: dataOcorrenciaIdentificacao.hashCode());
		result = prime * result + ((ddd == null) ? 0 : ddd.hashCode());
		result = prime
				* result
				+ ((descricaoProduto == null) ? 0 : descricaoProduto.hashCode());
		result = prime
				* result
				+ ((horaOcorrenciaIdentificacao == null) ? 0
						: horaOcorrenciaIdentificacao.hashCode());
		result = prime * result
				+ ((nomeCorretor == null) ? 0 : nomeCorretor.hashCode());
		result = prime * result
				+ ((nomeSegurado == null) ? 0 : nomeSegurado.hashCode());
		result = prime
				* result
				+ ((numAvisoSinistro == null) ? 0 : numAvisoSinistro.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result
				+ ((telefone == null) ? 0 : telefone.hashCode());
		result = prime * result
				+ ((tipoRelacao == null) ? 0 : tipoRelacao.hashCode());
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
		Comunicado other = (Comunicado) obj;
		if (apolice == null) {
			if (other.apolice != null)
				return false;
		} else if (!apolice.equals(other.apolice))
			return false;
		if (codCorretor == null) {
			if (other.codCorretor != null)
				return false;
		} else if (!codCorretor.equals(other.codCorretor))
			return false;
		if (codigoApolice == null) {
			if (other.codigoApolice != null)
				return false;
		} else if (!codigoApolice.equals(other.codigoApolice))
			return false;
		if (codigoCia == null) {
			if (other.codigoCia != null)
				return false;
		} else if (!codigoCia.equals(other.codigoCia))
			return false;
		if (codigoProduto == null) {
			if (other.codigoProduto != null)
				return false;
		} else if (!codigoProduto.equals(other.codigoProduto))
			return false;
		if (codigoRamo == null) {
			if (other.codigoRamo != null)
				return false;
		} else if (!codigoRamo.equals(other.codigoRamo))
			return false;
		if (codigoSucursal == null) {
			if (other.codigoSucursal != null)
				return false;
		} else if (!codigoSucursal.equals(other.codigoSucursal))
			return false;
		if (contato == null) {
			if (other.contato != null)
				return false;
		} else if (!contato.equals(other.contato))
			return false;
		if (dataOcorrenciaIdentificacao == null) {
			if (other.dataOcorrenciaIdentificacao != null)
				return false;
		} else if (!dataOcorrenciaIdentificacao
				.equals(other.dataOcorrenciaIdentificacao))
			return false;
		if (ddd == null) {
			if (other.ddd != null)
				return false;
		} else if (!ddd.equals(other.ddd))
			return false;
		if (descricaoProduto == null) {
			if (other.descricaoProduto != null)
				return false;
		} else if (!descricaoProduto.equals(other.descricaoProduto))
			return false;
		if (horaOcorrenciaIdentificacao == null) {
			if (other.horaOcorrenciaIdentificacao != null)
				return false;
		} else if (!horaOcorrenciaIdentificacao
				.equals(other.horaOcorrenciaIdentificacao))
			return false;
		if (nomeCorretor == null) {
			if (other.nomeCorretor != null)
				return false;
		} else if (!nomeCorretor.equals(other.nomeCorretor))
			return false;
		if (nomeSegurado == null) {
			if (other.nomeSegurado != null)
				return false;
		} else if (!nomeSegurado.equals(other.nomeSegurado))
			return false;
		if (numAvisoSinistro == null) {
			if (other.numAvisoSinistro != null)
				return false;
		} else if (!numAvisoSinistro.equals(other.numAvisoSinistro))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		if (tipoRelacao == null) {
			if (other.tipoRelacao != null)
				return false;
		} else if (!tipoRelacao.equals(other.tipoRelacao))
			return false;
		return true;
	}

	public String getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public String getDataOcorrenciaIdentificacao() {
		return dataOcorrenciaIdentificacao;
	}

	public void setDataOcorrenciaIdentificacao(String dataOcorrenciaIdentificacao) {
		this.dataOcorrenciaIdentificacao = dataOcorrenciaIdentificacao;
	}

	public String getHoraOcorrenciaIdentificacao() {
		return horaOcorrenciaIdentificacao;
	}

	public void setHoraOcorrenciaIdentificacao(String horaOcorrenciaIdentificacao) {
		this.horaOcorrenciaIdentificacao = horaOcorrenciaIdentificacao;
	}
	
	
        
}
