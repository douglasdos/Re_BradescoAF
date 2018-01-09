package br.com.plusoft.csi.bradescoaf.ws.vo;
import java.io.Serializable;

public class AtendimentoPadraoWsVo implements Serializable{
	
	private long codigoAtendimentoPadrao;
	private String descricaoAtendimentoPadrao;

	public long getCodigoAtendimentoPadrao() {
		return codigoAtendimentoPadrao;
	}
	public void setCodigoAtendimentoPadrao(long codigoAtendimentoPadrao) {
		this.codigoAtendimentoPadrao = codigoAtendimentoPadrao;
	}
	public String getDescricaoAtendimentoPadrao() {
		return descricaoAtendimentoPadrao;
	}
	public void setDescricaoAtendimentoPadrao(String descricaoAtendimentoPadrao) {
		this.descricaoAtendimentoPadrao = descricaoAtendimentoPadrao;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ (int) (codigoAtendimentoPadrao ^ (codigoAtendimentoPadrao >>> 32));
		result = prime
				* result
				+ ((descricaoAtendimentoPadrao == null) ? 0
						: descricaoAtendimentoPadrao.hashCode());
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
		AtendimentoPadraoWsVo other = (AtendimentoPadraoWsVo) obj;
		if (codigoAtendimentoPadrao != other.codigoAtendimentoPadrao)
			return false;
		if (descricaoAtendimentoPadrao == null) {
			if (other.descricaoAtendimentoPadrao != null)
				return false;
		} else if (!descricaoAtendimentoPadrao
				.equals(other.descricaoAtendimentoPadrao))
			return false;
		return true;
	}
	
	
	
	
	
}
