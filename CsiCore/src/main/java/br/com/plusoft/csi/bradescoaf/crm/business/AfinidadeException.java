package br.com.plusoft.csi.bradescoaf.crm.business;

public class AfinidadeException extends Exception{
	
	private String codErro;
	private String msgErro;
	
	public String getCodErro() {
		return codErro;
	}
	public void setCodErro(String codErro) {
		this.codErro = codErro;
	}
	public String getMsgErro() {
		return msgErro;
	}
	public void setMsgErro(String msgErro) {
		this.msgErro = msgErro;
	}

}
