package br.com.plusoft.csi.espec.validate.vo;

import java.util.Vector;

public class ValidaTela {
	Vector<Bloco> _bloco = new Vector<Bloco>();

	public ValidaTela() {
	}
	
	public ValidaTela(Vector<Bloco> bloco) {
		_bloco = bloco;
	}

	public Vector<Bloco> getBloco() {
		return _bloco;
	}

	public void setBloco(Vector<Bloco> bloco) {
		this._bloco = bloco;
	}
	
	public void adicionarBloco(Bloco bloco) {
		_bloco.add(bloco);
	}
	
	public boolean abreTelaValidacao() {
		boolean retorno = false;
		
		if (_bloco != null && _bloco.size() > 0) {
			retorno = true;
		}
		return retorno;
	}
	
}
