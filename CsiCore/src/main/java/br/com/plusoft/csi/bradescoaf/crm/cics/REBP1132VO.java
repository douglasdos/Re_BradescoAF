package br.com.plusoft.csi.bradescoaf.crm.cics;

import java.io.Serializable;

/**
 * VO para transporte de dados de Alerta.
 * @author othon.crelier
 */
public class REBP1132VO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String tipoAlerta;
	private long codItem;
	private long codCobertura;
	private String nomeCobertura;
	private String nomeEquipamento;
	private String nomeMarcaEquipamento;
	private String nomeAlerta;
	private String descricaoClausula;
	
	/**
	 * Retorna o codigo da cobertura.
	 * @return codigo da cobertura.
	 */
	public long getCodCobertura() {
		return codCobertura;
	}

	/**
	 * Retorna o codigo do item.
	 * @return codigo do item.
	 */
	public long getCodItem() {
		return codItem;
	}

	/**
	 * Retorna o nome do alerta.
	 * @return nome do alerta.
	 */
	public String getNomeAlerta() {
		return nomeAlerta;
	}

	/**
	 * Retorna o nome da cobertura.
	 * @return nome da cobertura.
	 */
	public String getNomeCobertura() {
		return nomeCobertura;
	}

	/**
	 * Retorna o nome do equipamento.
	 * @return nome do equipamento.
	 */
	public String getNomeEquipamento() {
		return nomeEquipamento;
	}

	/**
	 * Retorna o nome da marca do equipamento.
	 * @return nome da marca do equipamento.
	 */
	public String getNomeMarcaEquipamento() {
		return nomeMarcaEquipamento;
	}

	/**
	 * Retorna o tipo do alerta.
	 * @return tipo do alerta.
	 */
	public String getTipoAlerta() {
		return tipoAlerta;
	}

	/**
	 * Especifica o codigo da cobertura.
	 * @param l codigo da cobertura.
	 */
	public void setCodCobertura(long l) {
		codCobertura = l;
	}

	/**
	 * Especifica o codigo do item.
	 * @param l codigo do item.
	 */
	public void setCodItem(long l) {
		codItem = l;
	}

	/**
	 * Especifica o nome do alerta.
	 * @param string nome do alerta.
	 */
	public void setNomeAlerta(String string) {
		nomeAlerta = string;
	}

	/**
	 * Especifica o nome da cobertura.
	 * @param string nome da cobertura.
	 */
	public void setNomeCobertura(String string) {
		nomeCobertura = string;
	}

	/**
	 * Especifica o nome do equipamento.
	 * @param string nome do equipamento.
	 */
	public void setNomeEquipamento(String string) {
		nomeEquipamento = string;
	}

	/**
	 * Especifica o nome da marca do equipamento.
	 * @param string nome da marca do equipamento.
	 */
	public void setNomeMarcaEquipamento(String string) {
		nomeMarcaEquipamento = string;
	}

	/**
	 * Especifica o tipo do alerta.
	 * @param string tipo do alerta.
	 */
	public void setTipoAlerta(String string) {
		tipoAlerta = string;
	}

	/**
	 * Retorna a descricao da clausula.
	 * @return descricao da clausula.
	 */
	public String getDescricaoClausula() {
		return descricaoClausula;
	}

	/**
	 * Especifica a descricao da clausula.
	 * @param string descricao da clausula.
	 */
	public void setDescricaoClausula(String string) {
		descricaoClausula = string;
	}

}
