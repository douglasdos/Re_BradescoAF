package br.com.plusoft.csi.bradescoaf.ws.vo;


import java.io.Serializable;
import java.util.Vector;

public class RetornoAtendimentoPadrao implements Serializable {
	private long codigoRetorno;
	private String mensagemRetorno;
	private AtendimentoPadraoWsVo[] atendimentoPadraoWs;
	
	public long getCodigoRetorno() {
		return codigoRetorno;
	}
	public void setCodigoRetorno(long codigoRetorno) {
		this.codigoRetorno = codigoRetorno;
	}
	public String getMensagemRetorno() {
		return mensagemRetorno;
	}
	public void setMensagemRetorno(String mensagemRetorno) {
		this.mensagemRetorno = mensagemRetorno;
	}
	public AtendimentoPadraoWsVo[] getAtendimentoPadraoWs() {
		return atendimentoPadraoWs;
	}
	public void setAtendimentoPadraoWs(AtendimentoPadraoWsVo[] atendimentoPadraoWs) {
		this.atendimentoPadraoWs = atendimentoPadraoWs;
	}
	
	

}
