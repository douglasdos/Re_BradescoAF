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
					throw new Exception("Sem parâmetro");
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
					"Parâmetro necessário ou queda de sessão. Para queda de sessão, reinicie a aplicação", 
					"É necessário configurar o parâmetro de 'Código da Tabela de Tipo de Relação'. \n"
							+ "Módulo de Cadastro -> Util -> Configuração -> BRADESCO RAMOS ELEMENTARES -> Código da Tabela de Tipo de Relação", 
					"../crm/validacao/imagens/01.jpg","../crm/validacao/imagens/02.jpg");
			
			
			adicionaBloco(
					ConfiguracaoEspec.CONF_BRADESCOAF_CODIGO_TABELA_RAMOS_GRUPO_1 ,
					"Parâmetro necessário ou queda de sessão. Para queda de sessão, reinicie a aplicação", 
					"É necessário configurar o parâmetro de 'Código da Tabela de Grupo de Ramos(1)'. \n"
							+ "Módulo de Cadastro -> Util -> Configuração -> BRADESCO RAMOS ELEMENTARES -> Código da Tabela de Grupo de Ramos(1)", 
					"../crm/validacao/imagens/03.jpg","../crm/validacao/imagens/04.jpg","../crm/validacao/imagens/05.jpg");
			
			adicionaBloco(
					ConfiguracaoEspec.CONF_BRADESCOAF_CODIGO_TABELA_RAMOS_GRUPO_2 ,
					"Parâmetro necessário ou queda de sessão. Para queda de sessão, reinicie a aplicação", 
					"É necessário configurar o parâmetro de 'Código da Tabela de Grupo de Ramos(2)'. \n"
							+ "Módulo de Cadastro -> Util -> Configuração -> BRADESCO RAMOS ELEMENTARES -> Código da Tabela de Grupo de Ramos(2)", 
					"../crm/validacao/imagens/03.jpg","../crm/validacao/imagens/04.jpg","../crm/validacao/imagens/06.jpg");
			
			adicionaBloco(
					ConfiguracaoEspec.CONF_BRADESCOAF_CODIGO_TABELA_RAMOS_GRUPO_3 ,
					"Parâmetro necessário ou queda de sessão. Para queda de sessão, reinicie a aplicação", 
					"É necessário configurar o parâmetro de 'Código da Tabela de Grupo de Ramos(3)'. \n"
							+ "Módulo de Cadastro -> Util -> Configuração -> BRADESCO RAMOS ELEMENTARES -> Código da Tabela de Grupo de Ramos(3)", 
					"../crm/validacao/imagens/03.jpg","../crm/validacao/imagens/04.jpg","../crm/validacao/imagens/07.jpg");
			
			
			adicionaBloco(
					ConfiguracaoEspec.CONF_BRADESCOAF_CODIGO_TABELA_RAMOS_GRUPO_4 ,
					"Parâmetro necessário ou queda de sessão. Para queda de sessão, reinicie a aplicação", 
					"É necessário configurar o parâmetro de 'Código da Tabela de Grupo de Ramos(4)'. \n"
							+ "Módulo de Cadastro -> Util -> Configuração -> BRADESCO RAMOS ELEMENTARES -> Código da Tabela de Grupo de Ramos(4)", 
					"../crm/validacao/imagens/03.jpg","../crm/validacao/imagens/04.jpg","../crm/validacao/imagens/08.jpg");
			
			
			adicionaBloco(
					ConfiguracaoEspec.CONF_BRADESCOAF_URL_WS_LISTAR_CAUSA ,
					"Parâmetro necessário ou queda de sessão. Para queda de sessão, reinicie a aplicação", 
					"É necessário configurar o parâmetro de 'URL WebService Causa ASR'. \n"
							+ "Módulo de Cadastro -> Util -> Configuração -> BRADESCO RAMOS ELEMENTARES -> URL WebService Causa ASR", 
					"../crm/validacao/imagens/09.jpg","../crm/validacao/imagens/10.jpg");
			
			adicionaBloco(
					ConfiguracaoEspec.CONF_BRADESCOAF_URL_WS_LISTAR_NATUREZA ,
					"Parâmetro necessário ou queda de sessão. Para queda de sessão, reinicie a aplicação", 
					"É necessário configurar o parâmetro de 'URL WebService Natureza ASR'. \n"
							+ "Módulo de Cadastro -> Util -> Configuração -> BRADESCO RAMOS ELEMENTARES -> URL WebService Natureza ASR", 
					"../crm/validacao/imagens/11.jpg","../crm/validacao/imagens/12.jpg");
			
			
			adicionaBloco(
					ConfiguracaoEspec.CONF_BRADESCOAF_CODIGO_TABELA_PRODUTO_EQUIPAMENTO ,
					"Parâmetro necessário ou queda de sessão. Para queda de sessão, reinicie a aplicação", 
					"É necessário configurar o parâmetro de 'Código da Tabela de Produtos que Habilitam Aba Equipamento'. \n"
							+ "Módulo de Cadastro -> Util -> Configuração -> BRADESCO RAMOS ELEMENTARES -> Código da Tabela de Produtos que Habilitam Aba Equipamento ", 
					"../crm/validacao/imagens/13.jpg","../crm/validacao/imagens/14.jpg","../crm/validacao/imagens/15.jpg");
			
			
			adicionaBloco(
					ConfiguracaoEspec.CONF_BRADESCOAF_CODIGO_TABELA_CLASSIFICACAO ,
					"Parâmetro necessário ou queda de sessão. Para queda de sessão, reinicie a aplicação", 
					"É necessário configurar o parâmetro de 'Código da Tabela de Classificação Aba Detalhe Bem Sinistrado'. \n"
							+ "Módulo de Cadastro -> Util -> Configuração -> BRADESCO RAMOS ELEMENTARES -> Código da Tabela de Classificação Aba Detalhe Bem Sinistrado", 
					"../crm/validacao/imagens/16.jpg","../crm/validacao/imagens/17.jpg","../crm/validacao/imagens/18.jpg","../crm/validacao/imagens/19.jpg");
			
			
			adicionaBloco(
					ConfiguracaoEspec.CONF_BRADESCOAF_CODIGO_TABELA_QUAL_CIA ,
					"Parâmetro necessário ou queda de sessão. Para queda de sessão, reinicie a aplicação", 
					"É necessário configurar o parâmetro de 'Código da Tabela de Qual CIA Aba Responsável'. \n"
							+ "Módulo de Cadastro -> Util -> Configuração -> BRADESCO RAMOS ELEMENTARES -> Código da Tabela de Qual CIA Aba Responsável", 
					"../crm/validacao/imagens/20.jpg","../crm/validacao/imagens/21.jpg","../crm/validacao/imagens/22.jpg","../crm/validacao/imagens/23.jpg");
			
			adicionaBloco(
					ConfiguracaoEspec.CONF_BRADESCOAF_URL_WS_LISTAR_CONTA_CORRENTE ,
					"Parâmetro necessário ou queda de sessão. Para queda de sessão, reinicie a aplicação", 
					"É necessário configurar o parâmetro de 'URL WebService Conta Corrente ASR'. \n"
							+ "Módulo de Cadastro -> Util -> Configuração -> BRADESCO RAMOS ELEMENTARES -> URL WebService Conta Corrente ASR", 
					"../crm/validacao/imagens/24.jpg","../crm/validacao/imagens/25.jpg");
			
			adicionaBloco(
					ConfiguracaoEspec.CONF_BRADESCOAF_COD_ATEND_PADRAO_AVISO_SINISTRO ,
					"Parâmetro necessário ou queda de sessão. Para queda de sessão, reinicie a aplicação", 
					"É necessário configurar o parâmetro de 'Cód. Atend. Padrão Aviso de Sinistro '. \n"
							+ "Módulo de Cadastro -> Util -> Configuração -> BRADESCO RAMOS ELEMENTARES -> Cód. Atend. Padrão Aviso de Sinistro ", 
					"../crm/validacao/imagens/26.jpg","../crm/validacao/imagens/27.jpg","../crm/validacao/imagens/28.jpg");
			
			adicionaBloco(
					ConfiguracaoEspec.CONF_BRADESCOAF_URL_WS_CEP ,
					"Parâmetro necessário ou queda de sessão. Para queda de sessão, reinicie a aplicação", 
					"É necessário configurar o parâmetro de 'URL WebService Cep ASR'. \n"
							+ "Módulo de Cadastro -> Util -> Configuração -> BRADESCO RAMOS ELEMENTARES -> URL WebService Cep ASR", 
					"../crm/validacao/imagens/29.jpg","../crm/validacao/imagens/30.jpg");
			
			adicionaBloco(
					ConfiguracaoEspec.CONF_BRADESCOAF_URL_WS_AVISO_ELETRO_PORTATIL ,
					"Parâmetro necessário ou queda de sessão. Para queda de sessão, reinicie a aplicação", 
					"É necessário configurar o parâmetro de 'URL WebService Incluir Aviso Eletroportatil ASR'. \n"
							+ "Módulo de Cadastro -> Util -> Configuração -> BRADESCO RAMOS ELEMENTARES -> URL WebService Incluir Aviso Eletroportatil ASR", 
					"../crm/validacao/imagens/31.jpg","../crm/validacao/imagens/32.jpg");
			
			
			adicionaBloco(
					ConfiguracaoEspec.CONF_BRADESCOAF_URL_WS_PESSOA_BUC_RE ,
					"Parâmetro necessário ou queda de sessão. Para queda de sessão, reinicie a aplicação", 
					"É necessário configurar o parâmetro de 'URL WebService PESSOA BUC ASR'. \n"
							+ "Módulo de Cadastro -> Util -> Configuração -> BRADESCO RAMOS ELEMENTARES -> URL WebService PESSOA BUC ASR", 
					"../crm/validacao/imagens/33.jpg");
			
			
			adicionaBloco(
					ConfiguracaoEspec.CONF_BRADESCOAF_URL_WS_APOLICE_RE ,
					"Parâmetro necessário ou queda de sessão. Para queda de sessão, reinicie a aplicação", 
					"É necessário configurar o parâmetro de 'URL WebService Apólice ASR'. \n"
							+ "Módulo de Cadastro -> Util -> Configuração -> BRADESCO RAMOS ELEMENTARES -> URL WebService Apólice ASR", 
					"../crm/validacao/imagens/34.jpg");
			
			adicionaBloco(
					ConfiguracaoEspec.CONF_BRADESCOAF_URL_WS_LISTA_SUCURSAL ,
					"Parâmetro necessário ou queda de sessão. Para queda de sessão, reinicie a aplicação", 
					"É necessário configurar o parâmetro de 'URL WebService Sucursal'. \n"
							+ "Módulo de Cadastro -> Util -> Configuração -> BRADESCO RAMOS ELEMENTARES -> URL WebService Sucursal", 
					"../crm/validacao/imagens/35.jpg","../crm/validacao/imagens/36.jpg");
			
			
		} catch (Exception e) {
			Log.log(this.getClass(), Log.ERRORPLUS, "criarValidacao - Erro : " + e.getMessage() , e);
		}
	}
	
}
