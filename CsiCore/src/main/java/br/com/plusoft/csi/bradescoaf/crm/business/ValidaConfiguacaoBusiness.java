package br.com.plusoft.csi.bradescoaf.crm.business;

import java.util.Arrays;
import java.util.Vector;

import br.com.plusoft.csi.adm.helper.AdministracaoCsDmtbConfiguracaoConfHelper;
import br.com.plusoft.csi.bradescoaf.constantes.ConfiguracaoEspec;
import br.com.plusoft.csi.espec.validate.vo.Bloco;
import br.com.plusoft.csi.espec.validate.vo.ValidaTela;
import br.com.plusoft.fw.log.Log;

public class ValidaConfiguacaoBusiness {

	long idEmprCdEmpresa;
	ValidaTela _validaTela = null;
	
	public ValidaConfiguacaoBusiness(long idEmprCdEmpresa) {
		this.idEmprCdEmpresa = idEmprCdEmpresa;
	}
	
	public void adicionaBloco(String configuracao , String cabecalho, String mensagem, String... imagens) {
		try {
			try {
				String codStatus = (String) AdministracaoCsDmtbConfiguracaoConfHelper.findConfiguracao(configuracao, idEmprCdEmpresa);
				if (codStatus.length() == 0) {
					throw new Exception("Sem par�metro");
				}
			} catch (Exception e) {
				Bloco bloco = new Bloco();
				bloco.setCabecalho(cabecalho);
				bloco.setMensagem(mensagem);
				
				
				if (imagens != null && imagens.length > 0) {
					Vector<String> listaMensagem = new Vector(Arrays.asList(imagens));
					bloco.setImagens(listaMensagem);	
				}
				
				if (_validaTela == null) _validaTela = new ValidaTela(); 
				
				_validaTela.adicionarBloco(bloco);
			}
			
		} catch (Exception e) {
			Log.log(this.getClass(), Log.ERRORPLUS, "adicionaBloco - Erro : " + e.getMessage() , e);
		}
	}
	
	public ValidaTela getValidacao() {
		if (_validaTela == null) _validaTela = new ValidaTela();
		return _validaTela;
	}
	
	public void criarValidacao(String validarConfig) {
		
		try {
			
			if (!validarConfig.equalsIgnoreCase("S")) {
				if (_validaTela == null) _validaTela = new ValidaTela();
				return;
			}
			
			adicionaBloco(
					ConfiguracaoEspec.CONF_BRADESCOAF_CODIGO_TABELA_TIPO_RELACAO, 
					"Par�metro necess�rio ou queda de sess�o. Para queda de sess�o, reinicie a aplica��o", 
					"� necess�rio configurar o par�metro de 'C�digo da Tabela de Tipo de Rela��o'. \n"
							+ "M�dulo de Cadastro -> Util -> Configura��o -> BRADESCO RAMOS ELEMENTARES -> C�digo da Tabela de Tipo de Rela��o", 
					"../crm/validacao/imagens/01.jpg","../crm/validacao/imagens/02.jpg");
			
			
			adicionaBloco(
					ConfiguracaoEspec.CONF_BRADESCOAF_CODIGO_TABELA_RAMOS_GRUPO_1 ,
					"Par�metro necess�rio ou queda de sess�o. Para queda de sess�o, reinicie a aplica��o", 
					"� necess�rio configurar o par�metro de 'C�digo da Tabela de Grupo de Ramos(1)'. \n"
							+ "M�dulo de Cadastro -> Util -> Configura��o -> BRADESCO RAMOS ELEMENTARES -> C�digo da Tabela de Grupo de Ramos(1)", 
					"../crm/validacao/imagens/03.jpg","../crm/validacao/imagens/04.jpg","../crm/validacao/imagens/05.jpg");
			
			adicionaBloco(
					ConfiguracaoEspec.CONF_BRADESCOAF_CODIGO_TABELA_RAMOS_GRUPO_2 ,
					"Par�metro necess�rio ou queda de sess�o. Para queda de sess�o, reinicie a aplica��o", 
					"� necess�rio configurar o par�metro de 'C�digo da Tabela de Grupo de Ramos(2)'. \n"
							+ "M�dulo de Cadastro -> Util -> Configura��o -> BRADESCO RAMOS ELEMENTARES -> C�digo da Tabela de Grupo de Ramos(2)", 
					"../crm/validacao/imagens/03.jpg","../crm/validacao/imagens/04.jpg","../crm/validacao/imagens/06.jpg");
			
			adicionaBloco(
					ConfiguracaoEspec.CONF_BRADESCOAF_CODIGO_TABELA_RAMOS_GRUPO_3 ,
					"Par�metro necess�rio ou queda de sess�o. Para queda de sess�o, reinicie a aplica��o", 
					"� necess�rio configurar o par�metro de 'C�digo da Tabela de Grupo de Ramos(3)'. \n"
							+ "M�dulo de Cadastro -> Util -> Configura��o -> BRADESCO RAMOS ELEMENTARES -> C�digo da Tabela de Grupo de Ramos(3)", 
					"../crm/validacao/imagens/03.jpg","../crm/validacao/imagens/04.jpg","../crm/validacao/imagens/07.jpg");
			
			
			adicionaBloco(
					ConfiguracaoEspec.CONF_BRADESCOAF_CODIGO_TABELA_RAMOS_GRUPO_4 ,
					"Par�metro necess�rio ou queda de sess�o. Para queda de sess�o, reinicie a aplica��o", 
					"� necess�rio configurar o par�metro de 'C�digo da Tabela de Grupo de Ramos(4)'. \n"
							+ "M�dulo de Cadastro -> Util -> Configura��o -> BRADESCO RAMOS ELEMENTARES -> C�digo da Tabela de Grupo de Ramos(4)", 
					"../crm/validacao/imagens/03.jpg","../crm/validacao/imagens/04.jpg","../crm/validacao/imagens/08.jpg");
			
			
			adicionaBloco(
					ConfiguracaoEspec.CONF_BRADESCOAF_URL_WS_LISTAR_CAUSA ,
					"Par�metro necess�rio ou queda de sess�o. Para queda de sess�o, reinicie a aplica��o", 
					"� necess�rio configurar o par�metro de 'URL WebService Causa ASR'. \n"
							+ "M�dulo de Cadastro -> Util -> Configura��o -> BRADESCO RAMOS ELEMENTARES -> URL WebService Causa ASR", 
					"../crm/validacao/imagens/09.jpg","../crm/validacao/imagens/10.jpg");
			
			adicionaBloco(
					ConfiguracaoEspec.CONF_BRADESCOAF_URL_WS_LISTAR_NATUREZA ,
					"Par�metro necess�rio ou queda de sess�o. Para queda de sess�o, reinicie a aplica��o", 
					"� necess�rio configurar o par�metro de 'URL WebService Natureza ASR'. \n"
							+ "M�dulo de Cadastro -> Util -> Configura��o -> BRADESCO RAMOS ELEMENTARES -> URL WebService Natureza ASR", 
					"../crm/validacao/imagens/11.jpg","../crm/validacao/imagens/12.jpg");
			
			
			adicionaBloco(
					ConfiguracaoEspec.CONF_BRADESCOAF_CODIGO_TABELA_PRODUTO_EQUIPAMENTO ,
					"Par�metro necess�rio ou queda de sess�o. Para queda de sess�o, reinicie a aplica��o", 
					"� necess�rio configurar o par�metro de 'C�digo da Tabela de Produtos que Habilitam Aba Equipamento'. \n"
							+ "M�dulo de Cadastro -> Util -> Configura��o -> BRADESCO RAMOS ELEMENTARES -> C�digo da Tabela de Produtos que Habilitam Aba Equipamento ", 
					"../crm/validacao/imagens/13.jpg","../crm/validacao/imagens/14.jpg","../crm/validacao/imagens/15.jpg");
			
			
			adicionaBloco(
					ConfiguracaoEspec.CONF_BRADESCOAF_CODIGO_TABELA_CLASSIFICACAO ,
					"Par�metro necess�rio ou queda de sess�o. Para queda de sess�o, reinicie a aplica��o", 
					"� necess�rio configurar o par�metro de 'C�digo da Tabela de Classifica��o Aba Detalhe Bem Sinistrado'. \n"
							+ "M�dulo de Cadastro -> Util -> Configura��o -> BRADESCO RAMOS ELEMENTARES -> C�digo da Tabela de Classifica��o Aba Detalhe Bem Sinistrado", 
					"../crm/validacao/imagens/16.jpg","../crm/validacao/imagens/17.jpg","../crm/validacao/imagens/18.jpg","../crm/validacao/imagens/19.jpg");
			
			
			adicionaBloco(
					ConfiguracaoEspec.CONF_BRADESCOAF_CODIGO_TABELA_QUAL_CIA ,
					"Par�metro necess�rio ou queda de sess�o. Para queda de sess�o, reinicie a aplica��o", 
					"� necess�rio configurar o par�metro de 'C�digo da Tabela de Qual CIA Aba Respons�vel'. \n"
							+ "M�dulo de Cadastro -> Util -> Configura��o -> BRADESCO RAMOS ELEMENTARES -> C�digo da Tabela de Qual CIA Aba Respons�vel", 
					"../crm/validacao/imagens/20.jpg","../crm/validacao/imagens/21.jpg","../crm/validacao/imagens/22.jpg","../crm/validacao/imagens/23.jpg");
			
			adicionaBloco(
					ConfiguracaoEspec.CONF_BRADESCOAF_URL_WS_LISTAR_CONTA_CORRENTE ,
					"Par�metro necess�rio ou queda de sess�o. Para queda de sess�o, reinicie a aplica��o", 
					"� necess�rio configurar o par�metro de 'URL WebService Conta Corrente ASR'. \n"
							+ "M�dulo de Cadastro -> Util -> Configura��o -> BRADESCO RAMOS ELEMENTARES -> URL WebService Conta Corrente ASR", 
					"../crm/validacao/imagens/24.jpg","../crm/validacao/imagens/25.jpg");
			
			adicionaBloco(
					ConfiguracaoEspec.CONF_BRADESCOAF_COD_ATEND_PADRAO_AVISO_SINISTRO ,
					"Par�metro necess�rio ou queda de sess�o. Para queda de sess�o, reinicie a aplica��o", 
					"� necess�rio configurar o par�metro de 'C�d. Atend. Padr�o Aviso de Sinistro '. \n"
							+ "M�dulo de Cadastro -> Util -> Configura��o -> BRADESCO RAMOS ELEMENTARES -> C�d. Atend. Padr�o Aviso de Sinistro ", 
					"../crm/validacao/imagens/26.jpg","../crm/validacao/imagens/27.jpg","../crm/validacao/imagens/28.jpg");
			
			adicionaBloco(
					ConfiguracaoEspec.CONF_BRADESCOAF_URL_WS_CEP ,
					"Par�metro necess�rio ou queda de sess�o. Para queda de sess�o, reinicie a aplica��o", 
					"� necess�rio configurar o par�metro de 'URL WebService Cep ASR'. \n"
							+ "M�dulo de Cadastro -> Util -> Configura��o -> BRADESCO RAMOS ELEMENTARES -> URL WebService Cep ASR", 
					"../crm/validacao/imagens/29.jpg","../crm/validacao/imagens/30.jpg");
			
			adicionaBloco(
					ConfiguracaoEspec.CONF_BRADESCOAF_URL_WS_AVISO_ELETRO_PORTATIL ,
					"Par�metro necess�rio ou queda de sess�o. Para queda de sess�o, reinicie a aplica��o", 
					"� necess�rio configurar o par�metro de 'URL WebService Incluir Aviso Eletroportatil ASR'. \n"
							+ "M�dulo de Cadastro -> Util -> Configura��o -> BRADESCO RAMOS ELEMENTARES -> URL WebService Incluir Aviso Eletroportatil ASR", 
					"../crm/validacao/imagens/31.jpg","../crm/validacao/imagens/32.jpg");
			
			
			adicionaBloco(
					ConfiguracaoEspec.CONF_BRADESCOAF_URL_WS_PESSOA_BUC_RE ,
					"Par�metro necess�rio ou queda de sess�o. Para queda de sess�o, reinicie a aplica��o", 
					"� necess�rio configurar o par�metro de 'URL WebService PESSOA BUC ASR'. \n"
							+ "M�dulo de Cadastro -> Util -> Configura��o -> BRADESCO RAMOS ELEMENTARES -> URL WebService PESSOA BUC ASR", 
					"../crm/validacao/imagens/33.jpg");
			
			
			adicionaBloco(
					ConfiguracaoEspec.CONF_BRADESCOAF_URL_WS_APOLICE_RE ,
					"Par�metro necess�rio ou queda de sess�o. Para queda de sess�o, reinicie a aplica��o", 
					"� necess�rio configurar o par�metro de 'URL WebService Ap�lice ASR'. \n"
							+ "M�dulo de Cadastro -> Util -> Configura��o -> BRADESCO RAMOS ELEMENTARES -> URL WebService Ap�lice ASR", 
					"../crm/validacao/imagens/34.jpg");
			
			adicionaBloco(
					ConfiguracaoEspec.CONF_BRADESCOAF_URL_WS_LISTA_SUCURSAL ,
					"Par�metro necess�rio ou queda de sess�o. Para queda de sess�o, reinicie a aplica��o", 
					"� necess�rio configurar o par�metro de 'URL WebService Sucursal'. \n"
							+ "M�dulo de Cadastro -> Util -> Configura��o -> BRADESCO RAMOS ELEMENTARES -> URL WebService Sucursal", 
					"../crm/validacao/imagens/35.jpg","../crm/validacao/imagens/36.jpg");
			
			
		} catch (Exception e) {
			Log.log(this.getClass(), Log.ERRORPLUS, "criarValidacao - Erro : " + e.getMessage() , e);
		}
	}
	
}
