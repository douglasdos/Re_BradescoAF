package br.com.plusoft.csi.bradescoaf.crm.cics;

import java.util.ArrayList;
import java.util.List;

import br.com.bradseg.bsad.component.ctggateway.CTGProgramImpl;
import br.com.bradseg.bsad.component.ctggateway.ResultSet;
import br.com.bradseg.bsad.exception.IntegrationException;

public class CicsTeste {

	private static final String TIPO_ACESSO_START = "S";
	private static final String OPERACAO_CONSULTA = "C";
	
	private static final String ST_OCORRENCIAS_CONTINUACAO = "C";
	private static final String ST_OCORRENCIAS_ULTIMO = "U";

	private static final long RETCODE_INVALIDO = 9999;
	
	/**
	 * Define os campos obrigatorios do cabecalho.
	 * @param pgmCICS programa cics
	 * @param tran nome da transacao
	 * @param pgm  nome do programa
	 * @throws IntegrationException Qualquer exceção (erro) de integração que possa ocorrer na chamado do método.
	 */
	private void configurarCabecalhoEntrada(CTGProgramImpl pgmCICS, String tran, String pgm)
		throws IntegrationException {
		pgmCICS.getInputSet().setString(REBP0757CICS.NOME_REBP1000_TRANSACAO, tran);
		pgmCICS.getInputSet().setString(REBP0757CICS.NOME_REBP1000_APLICACAO, pgm);
		pgmCICS.getInputSet().setString(REBP0757CICS.NOME_REBP1000_TIPO_ACESSO, TIPO_ACESSO_START);
		pgmCICS.getInputSet().setString(REBP0757CICS.NOME_REBP1000_OPERACAO, OPERACAO_CONSULTA);
	}
	
	/**
	 * Verifica se a common area retornou erro, e propaga o erro via IntegrationException.
	 * @param rs result set contendo o retorno da chamada do programa
	 * @throws IntegrationException erro do cics encapsulado em exceção
	 */
	private void tratarErro(ResultSet rs) throws IntegrationException {
		long retCode = rs.getLong(REBP0757CICS.NOME_REBP1001_RETCODE);
		//por enquanto vamos aceitar retcode == 1 considerando que significa sempre "nao encontrado", mas precisamos confirmar!
		if ((retCode > RETCODE_INVALIDO) && (retCode != 1)) {
			String msg = rs.getString(REBP0757CICS.NOME_REBP1001_MENSAGEM_TELA);
			throw new IntegrationException(msg);
		}
	}
	
	/**
	 * Verifica se a consulta retornou algum registro.
	 * @param rs result set da consulta
	 * @return true ou false
	 * @throws IntegrationException Qualquer exceção (erro) de integração que possa ocorrer na chamado do método.
	 */
	private boolean retornouRegistros(ResultSet rs) throws IntegrationException {
		long qtdOcorrencias = rs.getLong(REBP0757CICS.NOME_REBP1001_QT_OCORRENCIAS);
		long retCode = rs.getLong(REBP0757CICS.NOME_REBP1001_RETCODE);
		return ((qtdOcorrencias > 0) || (retCode == 0));
	}
	
	public List obterAlertas(long numProposta, long produto) throws IntegrationException {
		try {
			
			ResultSet rs;
			List listaAlertas = new ArrayList();
			
			String continua = "";
			String ultimoSequencial = "0";
			
			REBP0757CICS pgmCICS = new REBP0757CICS();
			configurarCabecalhoEntrada(pgmCICS, REBP0757CICS.TRANNAME, REBP0757CICS.PGMNAME);
			
			pgmCICS.getInputSet().setLong(REBP0757CICS.NOME_REBP132_PROPOSTA, numProposta);
			pgmCICS.getInputSet().setLong(REBP0757CICS.NOME_REBP132_CD_PRODUTO, produto);
			
			do {
				pgmCICS.getInputSet().setString(REBP0757CICS.NOME_REBP1001_ARGUMENTO, ultimoSequencial);
				rs = pgmCICS.execute();
				
				tratarErro(rs);
				if (!retornouRegistros(rs)) {
					return listaAlertas;
				}
				
				long qtdOcorr = rs.getLong(REBP0757CICS.NOME_REBP1001_QT_OCORRENCIAS);
				
				if (qtdOcorr == 0) {
					return listaAlertas;
				}
				
				ResultSet rsIndexed = rs.getIndexed(REBP0757CICS.NOME_REBP757_LISTA);
				for (int i = 0; i < qtdOcorr; i++) {
					rsIndexed.next();
				
					REBP1132VO vo = new REBP1132VO();
					vo.setCodCobertura(rsIndexed.getLong(REBP0757CICS.NOME_REBP757_CD_COBERTURA));
					vo.setCodItem(rsIndexed.getLong(REBP0757CICS.NOME_REBP757_CD_ITEM));
					vo.setNomeAlerta(rsIndexed.getString(REBP0757CICS.NOME_REBP757_NM_ALERTA));
					vo.setNomeCobertura(rsIndexed.getString(REBP0757CICS.NOME_REBP757_NM_COBERTURA));
					vo.setNomeEquipamento(rsIndexed.getString(REBP0757CICS.NOME_REBP757_NM_EQUIPAMENTO));
					vo.setNomeMarcaEquipamento(rsIndexed.getString(REBP0757CICS.NOME_REBP757_NM_MARCA_EQPMT));
					vo.setTipoAlerta(rsIndexed.getString(REBP0757CICS.NOME_REBP757_TPO_ALERTA));
					
					listaAlertas.add(vo);
				}
				
				ultimoSequencial = rs.getString(REBP0757CICS.NOME_REBP1001_ARGUMENTO);
				continua = rs.getString(REBP0757CICS.NOME_REBP1001_ST_OCORRENCIAS);
				
			} while(ST_OCORRENCIAS_CONTINUACAO.equals(continua));
			return listaAlertas;
		} finally {
			
			
		}
	}
	
}
