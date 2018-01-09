package br.com.plusoft.csi.espec.validate.vo;

import java.util.Vector;

public class Bloco {
	private String cabecalho;
	private String mensagem;
	private Vector<String> imagens = new Vector<String>();
	
	public Bloco() {
		// TODO Auto-generated constructor stub
	}
	
	public Bloco(String cabecalho,String mensagem, Vector<String> imagens) {
		this.cabecalho = cabecalho;
		this.mensagem = mensagem;
		this.imagens = imagens;
	}
	
	public String getCabecalho() {
		return cabecalho;
	}
	public void setCabecalho(String cabecalho) {
		this.cabecalho = cabecalho;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public Vector<String> getImagens() {
		return imagens;
	}
	public void setImagens(Vector<String> imagens) {
		this.imagens = imagens;
	}
}
