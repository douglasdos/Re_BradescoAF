package br.com.plusoft.csi.bradescoaf.crm.business;

import java.rmi.RemoteException;
import java.util.Vector;
import java.util.regex.Pattern;

import javax.ejb.FinderException;
import javax.servlet.http.HttpServletRequest;

import br.com.bradseg.bucb.central.model.pessoa.vo.PlusoftUseVO;
import br.com.bradseg.sare.servicos.apolice.webservice.ListaApoliceVO;
import br.com.plusoft.csi.adm.helper.AdministracaoCsNgtbNumeradoraNumeHelper;
import br.com.plusoft.csi.adm.helper.generic.GenericHelper;
import br.com.plusoft.csi.adm.helper.generic.Numeradora;
import br.com.plusoft.csi.bradescoaf.constantes.ConstantesEspec;
import br.com.plusoft.csi.crm.form.PessoaForm;
import br.com.plusoft.csi.crm.helper.MCConstantes;
import br.com.plusoft.csi.crm.helper.generic.PessoaHelper;
import br.com.plusoft.csi.crm.util.SystemDate;
import br.com.plusoft.csi.crm.vo.CsCdtbPessoaPessVo;
import br.com.plusoft.fw.entity.Condition;
import br.com.plusoft.fw.entity.Vo;
import br.com.plusoft.fw.json.JSONArray;
import br.com.plusoft.fw.json.JSONException;
import br.com.plusoft.fw.json.JSONObject;
import br.com.plusoft.fw.log.Log;
import br.com.plusoft.fw.util.Datetime;

import com.iberia.helper.Constantes;
import com.plusoft.util.AppException;


public class PessoaEspecBusiness extends PessoaHelper {
	
	private String telaForward;
	private long idEmprCdEmpresa = 0;
	private long idFuncCdFuncionario = 0;
	
	public PessoaEspecBusiness(){
		//...
	}

	public PessoaEspecBusiness(long idEmprCdEmpresa,long idFuncCdFuncionario) {
		this.idEmprCdEmpresa = idEmprCdEmpresa;
		this.idFuncCdFuncionario = idFuncCdFuncionario;
	}
	
	public String getPessoaNaBasePlusoft(GenericHelper gHelper, String codCorp) throws Exception{
		
		String idRetorno = "";
		Condition condition = new Condition();
		
		//Buscando pelo corporativo
		condition = new Condition();
		condition.addCondition("pess_cd_corporativo", Condition.EQUAL, codCorp);
		Vector<Vo> pessRetVector = gHelper.openQuery(ConstantesEspec.ENTITY_CS_CDTB_PESSOA_PESS, "select-by-condition-order-by", condition);
		
		if(pessRetVector != null && pessRetVector.size() > 0) {
			idRetorno = ((Vo)pessRetVector.get(0)).getFieldAsString("id_pess_cd_pessoa");
		}
		
		return idRetorno;
		
	}
	
	private Vo montaVoPessoa(PlusoftUseVO pessoa) throws Exception {

		Vo voPessoa = new Vo();

		if (getString(pessoa.getNomePessoa(), 80).length() > 0) {
			voPessoa.addField("pess_nm_pessoa", getString(pessoa.getNomePessoa().toUpperCase(), 80));
		}

		if (getString(pessoa.getCpfCgc(), 20).length() > 0) {
			
			String cpf = pessoa.getCpfCgc();
			cpf = cpf.replaceAll(Pattern.quote("."), "");
			cpf = cpf.replaceAll(Pattern.quote("-"), "");
			cpf = cpf.replaceAll(Pattern.quote("/"), "");
			
			voPessoa.addField("pess_ds_cgccpf", getString(cpf.toUpperCase(), 20));
			
			if (getString(cpf, 20).length() > 11) {
				voPessoa.addField("pess_in_pfj", "J");
			} else {
				voPessoa.addField("pess_in_pfj", "F");
			}
		}
		
		voPessoa.addField("pess_cd_corporativo", getString(pessoa.getCodigoPessoaVinculada().toUpperCase(), 20));
		
	
		if (getString(pessoa.getDataNascimento(), 20).length() > 0) {
			String data = pessoa.getDataNascimento().substring(0,4) 
					+ '-' + pessoa.getDataNascimento().substring(4,6) 
					+ "-" + pessoa.getDataNascimento().substring(6,8);
			
			Datetime dataFormatada = new Datetime(data, "YYYY-MM-DD");
			if (data != null) {
				voPessoa.addField("pess_dh_nascimento", dataFormatada.toSqlDate());	
			}
		}
		
		return voPessoa;
	}
	
	private void montaVoEndereco(PlusoftUseVO pessoa, long idPessCdPessoa, GenericHelper gHelper) throws Exception {

		
		Vo voInsertEndereco = null;
		
		if (getString(pessoa.getLogradouro(), 255).length() > 0) {
			
			Condition condPrincipal = new Condition();
			condPrincipal.addCondition("id_pess_cd_pessoa", Condition.EQUAL, idPessCdPessoa);
			condPrincipal.addCondition("id_tpen_cd_tpendereco", Condition.EQUAL, MCConstantes.TPENDERECO_Residencial);
			
			Vector vecEnd = gHelper.openQuery(ConstantesEspec.ENTITY_CS_CDTB_PESSOAEND_PEEN, "select-by-condition", condPrincipal);
			
			if (vecEnd != null && vecEnd.size() > 0) {
				
				Vo voUpdatePrincipal = new Vo();
				voUpdatePrincipal.addField("peen_in_principal", "N");
				Condition condUpdatePrincipal = new Condition();
				condUpdatePrincipal.addCondition("id_pess_cd_pessoa", Condition.EQUAL, idPessCdPessoa);
				gHelper.batchInclude("update", ConstantesEspec.ENTITY_CS_CDTB_PESSOAEND_PEEN, condUpdatePrincipal, voUpdatePrincipal);
				
				boolean encontrouEnd = false;
				for (Vo voEnd : (Vector<Vo>) vecEnd) {
					if(voEnd.getFieldAsString("peen_ds_logradouro").trim().toUpperCase().equals(pessoa.getLogradouro().trim().toUpperCase())) {
						encontrouEnd = true;
					}
				}
				
				if (encontrouEnd == true) {
					
					for (Vo voEnd : (Vector<Vo>) vecEnd) {
						if(voEnd.getFieldAsString("peen_ds_logradouro").trim().toUpperCase().equals(pessoa.getLogradouro().trim().toUpperCase())) {
							voInsertEndereco = montaVoEnderecoBasico(pessoa);
							Condition condUpdate = new Condition();
							condUpdate.addCondition("id_peen_cd_endereco", Condition.EQUAL, voEnd.getFieldAsInteger("id_peen_cd_endereco"));
							gHelper.batchInclude("update", ConstantesEspec.ENTITY_CS_CDTB_PESSOAEND_PEEN, condUpdate, voInsertEndereco);
							break;
						}
					}
				} else {
					voInsertEndereco = montaVoEnderecoBasico(pessoa);
					long idPeenCdEndereco = Numeradora.nextValue("CS_CDTB_PESSOAEND_PEEN");	
					voInsertEndereco.addField("id_peen_cd_endereco", idPeenCdEndereco);
					voInsertEndereco.addField("id_pess_cd_pessoa", idPessCdPessoa);
					gHelper.batchInclude("create", ConstantesEspec.ENTITY_CS_CDTB_PESSOAEND_PEEN, null, voInsertEndereco);
				}
			
			} else {
				
				voInsertEndereco = montaVoEnderecoBasico(pessoa);
				
				long idPeenCdEndereco = Numeradora.nextValue("CS_CDTB_PESSOAEND_PEEN");	
				voInsertEndereco.addField("id_peen_cd_endereco", idPeenCdEndereco);
				voInsertEndereco.addField("id_pess_cd_pessoa", idPessCdPessoa);
				gHelper.batchInclude("create", ConstantesEspec.ENTITY_CS_CDTB_PESSOAEND_PEEN, null, voInsertEndereco);
			}
		}
	}
	
	private Vo montaVoEnderecoBasico(PlusoftUseVO pessoa){
		
		Vo voInsertEndereco = new Vo(); 
		
		voInsertEndereco.addField("id_tpen_cd_tpendereco", MCConstantes.TPENDERECO_Residencial); //residencial
		
		voInsertEndereco.addField("peen_ds_logradouro", getString(pessoa.getLogradouro().toUpperCase(), 255));
		
		if (getString(pessoa.getNumero() != null ? pessoa.getNumero().toString() : "" , 10).length() > 0) {
			voInsertEndereco.addField("peen_ds_numero", getString(pessoa.getNumero().toString(), 10));
		}
		
		if (getString(pessoa.getComplemento(), 50).length() > 0) {
			voInsertEndereco.addField("peen_ds_complemento", getString(pessoa.getComplemento().toUpperCase(), 50));
		}
		
		if (getString(pessoa.getBairro(), 60).length() > 0) {
			voInsertEndereco.addField("peen_ds_bairro", getString(pessoa.getBairro().toUpperCase(), 60));
		}
		
		if (getString(pessoa.getCep() != null ? pessoa.getCep().toString() : "" , 8).length() > 0) {
			voInsertEndereco.addField("peen_ds_cep", getString(pessoa.getCep().toString().replace(Pattern.quote("-"), "").toUpperCase(), 8));
		}
		
		if (getString(pessoa.getEstado(), 5).length() > 0) {
			voInsertEndereco.addField("peen_ds_uf", getString(pessoa.getEstado().toUpperCase(), 5));
		}
		
		if (getString(pessoa.getCidade(), 80).length() > 0) {
			voInsertEndereco.addField("peen_ds_municipio", getString(pessoa.getCidade().toUpperCase(), 80));
		}
		
		voInsertEndereco.addField("peen_in_principal", "S");
		
		return voInsertEndereco;
	}
	
	
	private void montaVoTelefone(String ddd, String telefone,int idTpPcom, long idPessCdPessoa, GenericHelper gHelper) throws Exception {

		Vo voInsertTelefone = null;
		
		if (getString(telefone, 255).length() > 0 && !"0".equals(getString(telefone, 255))) {
			
			
			Condition condPrincipal = new Condition();
			condPrincipal.addCondition("id_pess_cd_pessoa", Condition.EQUAL, idPessCdPessoa);
			condPrincipal.addCondition("id_tpco_cd_tpcomunicacao", Condition.EQUAL, idTpPcom);
			
			Vector vecTelefone = gHelper.openQuery(ConstantesEspec.ENTITY_CS_CDTB_PESSOACOMUNIC_PCOM, "select-by-condition", condPrincipal);
			
			if (vecTelefone != null && vecTelefone.size() > 0) {
				
				Vo voUpdatePrincipal = new Vo();
				voUpdatePrincipal.addField("pcom_in_principal", "N");
				Condition condUpdatePrincipal = new Condition();
				condUpdatePrincipal.addCondition("id_pess_cd_pessoa", Condition.EQUAL, idPessCdPessoa);
				condUpdatePrincipal.addCondition("id_tpco_cd_tpcomunicacao", Condition.EQUAL, idTpPcom);
				gHelper.batchInclude("update", ConstantesEspec.ENTITY_CS_CDTB_PESSOACOMUNIC_PCOM, condUpdatePrincipal, voUpdatePrincipal);
				
				boolean encontrouTelefone = false;
				for (Vo voTelefone : (Vector<Vo>) vecTelefone) {
					if(voTelefone.getFieldAsString("pcom_ds_comunicacao").trim().toUpperCase().equals(telefone.trim().toUpperCase()) && 
							voTelefone.getFieldAsString("pcom_ds_ddd").trim().toUpperCase().equals(ddd.trim().toUpperCase())) {
						encontrouTelefone = true;
					}
				}
				
				if (encontrouTelefone == true) {
					for (Vo voTelefone : (Vector<Vo>) vecTelefone) {
						if(voTelefone.getFieldAsString("pcom_ds_comunicacao").trim().toUpperCase().equals(telefone.trim().toUpperCase())) {
							voInsertTelefone = montaVoTelefoneBasico(ddd, telefone,idTpPcom);
							Condition condUpdate = new Condition();
							condUpdate.addCondition("id_pcom_cd_pessoacomunic", Condition.EQUAL, voTelefone.getFieldAsInteger("id_pcom_cd_pessoacomunic"));
							gHelper.batchInclude("update", ConstantesEspec.ENTITY_CS_CDTB_PESSOACOMUNIC_PCOM, condUpdate, voInsertTelefone);
							break;
						}
					}
				} else {
					voInsertTelefone = montaVoTelefoneBasico(ddd, telefone,idTpPcom);
					long idPcomCdPessoacomunic = Numeradora.nextValue("CS_CDTB_PESSOACOMUNIC_PCOM");	
					voInsertTelefone.addField("id_pcom_cd_pessoacomunic", idPcomCdPessoacomunic);
					voInsertTelefone.addField("id_pess_cd_pessoa", idPessCdPessoa);
					gHelper.batchInclude("create", ConstantesEspec.ENTITY_CS_CDTB_PESSOACOMUNIC_PCOM, null, voInsertTelefone);
				}
			
			} else {
				
				voInsertTelefone = montaVoTelefoneBasico(ddd, telefone,idTpPcom);
				
				long idPcomCdPessoacomunic = Numeradora.nextValue("CS_CDTB_PESSOACOMUNIC_PCOM");	
				voInsertTelefone.addField("id_pcom_cd_pessoacomunic", idPcomCdPessoacomunic);
				voInsertTelefone.addField("id_pess_cd_pessoa", idPessCdPessoa);
				gHelper.batchInclude("create", ConstantesEspec.ENTITY_CS_CDTB_PESSOACOMUNIC_PCOM, null, voInsertTelefone);
				
			}
		}
	}
	
	private Vo montaVoTelefoneBasico(String ddd, String telefone, int idTpPcom ){
		
		Vo voInsertTelefone = new Vo(); 
		
		voInsertTelefone.addField("id_tpco_cd_tpcomunicacao", idTpPcom); //outros
		
		voInsertTelefone.addField("pcom_ds_comunicacao", getString(telefone, 80));
		voInsertTelefone.addField("pcom_ds_ddd", getString(ddd, 4));
		voInsertTelefone.addField("pcom_in_principal", "S");
		
		return voInsertTelefone;
	}
	
	
	public CsCdtbPessoaPessVo getPessoaCorp(PessoaForm pForm , HttpServletRequest request) throws RemoteException, FinderException {
		
		Log.log(this.getClass(), Log.INFOPLUS, "INICIANDO BUSCA NA BASE CORPORATIVA");
		
		GenericHelper gHelper = null;
		CsCdtbPessoaPessVo pessVo = null;
		AdministracaoCsNgtbNumeradoraNumeHelper numeHelper = null;
		String cdCorporativo = null;
		long idEmprCdEmpresa = pForm.getIdEmpresa();
		String jsonListaApolice = "";
				
		try {
			
			
			pessVo = new CsCdtbPessoaPessVo(idEmprCdEmpresa, 0);
		    gHelper = new GenericHelper(idEmprCdEmpresa);
			numeHelper = new AdministracaoCsNgtbNumeradoraNumeHelper();
			
			jsonListaApolice = pForm.getCsCdtbPessoaespecPeesVo().getCampoAux1();
			Vector<ListaApoliceVO> lstApolices = converterJsonApoliceParaVectorApolice(pForm.getCsCdtbPessoaespecPeesVo().getCampoAux1());
			Vo voDataOcorrencia = converterJsonApoliceDataOcorrenciaParaVo(pForm.getCsCdtbPessoaespecPeesVo().getCampoAux1());
			PlusoftUseVO pessoa = converterJsonPessoaParaPlusoftUseVO(pForm.getCsCdtbPessoaespecPeesVo().getCampoAux1());
			
			gHelper.batchClear();
						
		    pForm.setAcao(Constantes.ACAO_GRAVAR);
		    
		    /***************************************************
		     * VERIFICANDO SE JÁ EXISTE A PESSOA NA BASE PLUSOFT
		     **************************************************/
		    
		    pForm.setPessCdCorporativo(pessoa.getCodigoPessoaVinculada());
		    
		    cdCorporativo = pForm.getPessCdCorporativo() ;
		    String idPessoaBasePlusoft = getPessoaNaBasePlusoft(gHelper, cdCorporativo);
		    
		    if(!idPessoaBasePlusoft.equals("")){
		    	Log.log(this.getClass(), Log.INFOPLUS, "PESSOA ENCONTRADA NA BASE PLUSOFT: " + idPessoaBasePlusoft);
		    	pessVo.setIdPessCdPessoa(new Long(idPessoaBasePlusoft));
				pForm.setIdPessCdPessoa(new Long(idPessoaBasePlusoft));

		    }else{
		    	Log.log(this.getClass(), Log.INFOPLUS, "PESSOA NÃO ENCONTRADA NA BASE PLUSOFT");
		    }
		    
			/********************************************************
		    * FIM - VERIFICANDO SE JÁ EXISTE A PESSOA NA BASE PLUSOFT
		    *********************************************************/
			
			if(pessoa != null) {
				
				if (idPessoaBasePlusoft.trim().length() > 0 ) { //Existe Pessoa
					
					Vo voInsertPessoa = montaVoPessoa(pessoa);
					Condition condPessoa = new Condition();
					condPessoa.addCondition("id_pess_cd_pessoa", Condition.EQUAL, idPessoaBasePlusoft);
					gHelper.batchInclude("update", ConstantesEspec.ENTITY_CS_CDTB_PESSOA_PESS, condPessoa, voInsertPessoa);
					
					montaVoEndereco(pessoa,Long.parseLong(idPessoaBasePlusoft),gHelper);
					
					montaVoTelefone(pessoa.getDdd() != null ? pessoa.getDdd().toString() : "" , 
							pessoa.getFone() != null ? pessoa.getFone().toString() : "" , 
									MCConstantes.COMUNICACAO_Outros, Long.parseLong(idPessoaBasePlusoft),gHelper);
					
					montaVoTelefone(pessoa.getDddFixo() != null ? pessoa.getDddFixo().toString() : "" , 
							pessoa.getFoneFixo() != null ? pessoa.getFoneFixo().toString() : "" , 
									MCConstantes.COMUNICACAO_Residencial, Long.parseLong(idPessoaBasePlusoft),gHelper);

					gHelper.batchExecute();
					
					
				} else { //Não existe pessoa
					
					Log.log(this.getClass(), Log.INFOPLUS, "getPessoaCorp - Criando pessoa");
					
					
					// Inserindo nova Pessoa
					long idPessCdPessoaInsert = Numeradora.nextValue("CS_CDTB_PESSOA_PESS");
					Vo voInsertPessoa = montaVoPessoa(pessoa);
					voInsertPessoa.addField("id_pess_cd_pessoa", idPessCdPessoaInsert);
					gHelper.batchInclude("create", ConstantesEspec.ENTITY_CS_CDTB_PESSOA_PESS, null, voInsertPessoa);
					
					montaVoEndereco(pessoa,idPessCdPessoaInsert,gHelper);
					
					montaVoTelefone(pessoa.getDdd() != null ? pessoa.getDdd().toString() : "" , 
							pessoa.getFone() != null ? pessoa.getFone().toString() : "" , 
									MCConstantes.COMUNICACAO_Outros, idPessCdPessoaInsert,gHelper);
					
					montaVoTelefone(pessoa.getDddFixo() != null ? pessoa.getDddFixo().toString() : "" , 
							pessoa.getFoneFixo() != null ? pessoa.getFoneFixo().toString() : "" , 
									MCConstantes.COMUNICACAO_Residencial, idPessCdPessoaInsert,gHelper);

					gHelper.batchExecute();
					
					pessVo.setIdPessCdPessoa(new Long(idPessCdPessoaInsert));
					pForm.setIdPessCdPessoa(new Long(idPessCdPessoaInsert));
					
				}
			}
		    
		    //Atualiza o form com os dados da pessoa
		    pessVo = findCsCdtbPessoaPes(pForm);
		    
		    pForm.populateForm(pessVo);
		    //pForm.setIdPessCdPessoa(pessoaForm.getIdPessCdPessoa());
		    
		    if (pessVo.getPessCdCorporativo() == null || pessVo.getPessCdCorporativo().equals("") ){
		    	if (pForm.getPessCdCorporativo() != null && !pForm.getPessCdCorporativo().equals("")){
		    		pessVo.setPessCdCorporativo(pForm.getPessCdCorporativo());
		    	}
		    }
		    
		    //Campo usado para obter os dados de apolice
		    pessVo.getCsCdtbPessoaespecPeesVo().setCampoAux4(voDataOcorrencia.getFieldAsString("dataOcorrencia"));
		    
		    //Campo usado para obter os dados de apolice
		    pessVo.getCsCdtbPessoaespecPeesVo().setCampoAux5(voDataOcorrencia.getFieldAsString("horaOcorrencia"));
		    
		    //Campo usado para posicionar as abas de sinistro ou apolice
		    pessVo.getCsCdtbPessoaespecPeesVo().setCampoAux6(voDataOcorrencia.getFieldAsString("rdoFalorSombreSinistro"));
			
			//Json armazenado para ser usado na tela de lista de apólice 
			pessVo.getCsCdtbPessoaespecPeesVo().setCampoAux7(jsonListaApolice);
		    
		    Log.log(this.getClass(), Log.INFOPLUS, "getPessoaCorp - Pessoa carregada com sucesso.");
		    
		}  catch(Exception e) {
			
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro ao executar o metodo getPessoaCorp(): " + e.getMessage(), e);
	    	throw new AppException(e);
//	    	
	    } finally {
	    	gHelper = null;
	    }
		
	    return pessVo;
	    
	}
	
	private PlusoftUseVO converterJsonPessoaParaPlusoftUseVO(String jsonString) throws JSONException {
		PlusoftUseVO pessoa = new PlusoftUseVO();
		
		JSONObject json = new JSONObject(jsonString);
		String pessoaJsonString = json.getString("pessoa").toString();
		JSONObject pessoaJson = new JSONObject(pessoaJsonString);
		
		
		if (pessoaJson.get("ddd") != JSONObject.NULL) {
			pessoa.setDdd(pessoaJson.getLong("ddd"));
		}	
		
		if (pessoaJson.get("dataFimVigencia") != JSONObject.NULL) {
			pessoa.setDataFimVigencia(pessoaJson.getString("dataFimVigencia"));
		}
		
		if (pessoaJson.get("papel") != JSONObject.NULL) {
			pessoa.setPapel(pessoaJson.getString("papel"));
		}
		
		if (pessoaJson.get("indicativoCorrentista") != JSONObject.NULL) {
			pessoa.setIndicativoCorrentista(pessoaJson.getString("indicativoCorrentista"));
		}
		
		if (pessoaJson.get("tipoPesquisa") != JSONObject.NULL) {
			pessoa.setTipoPesquisa(pessoaJson.getLong("tipoPesquisa"));
		}
		
		if (pessoaJson.get("indicativoFuncionario") != JSONObject.NULL) {
			pessoa.setIndicativoFuncionario(pessoaJson.getString("indicativoFuncionario"));
		}
		
		if (pessoaJson.get("cep") != JSONObject.NULL) {
			pessoa.setCep(pessoaJson.getLong("cep"));
		}
		
		if (pessoaJson.get("nomeCorretor") != JSONObject.NULL) {
			pessoa.setNomeCorretor(pessoaJson.getString("nomeCorretor"));
		}
		
		if (pessoaJson.get("dataNascimento") != JSONObject.NULL) {
			pessoa.setDataNascimento(pessoaJson.getString("dataNascimento"));
		}
		
		if (pessoaJson.get("tipoPessoa") != JSONObject.NULL) {
			pessoa.setTipoPessoa(pessoaJson.getString("tipoPessoa"));
		}
		
		if (pessoaJson.get("numeroContrato") != JSONObject.NULL) {
			pessoa.setNumeroContrato(pessoaJson.getString("numeroContrato"));
		}	
		
		if (pessoaJson.get("nomePessoa") != JSONObject.NULL) {
			pessoa.setNomePessoa(pessoaJson.getString("nomePessoa"));
		}
		
		if (pessoaJson.get("foneFixo") != JSONObject.NULL) {
			pessoa.setFoneFixo(pessoaJson.getLong("foneFixo"));
		}
		
		if (pessoaJson.get("complemento") != JSONObject.NULL) {
			pessoa.setComplemento(pessoaJson.getString("complemento"));
		}
		
		if (pessoaJson.get("codigoPessoaVinculada") != JSONObject.NULL) {
			pessoa.setCodigoPessoaVinculada(pessoaJson.getString("codigoPessoaVinculada"));
		}
		
		if (pessoaJson.get("dataBase") != JSONObject.NULL) {
			pessoa.setDataBase(pessoaJson.getString("dataBase"));
		}
		
		if (pessoaJson.get("codigoPessoa") != JSONObject.NULL) {
			pessoa.setCodigoPessoa(pessoaJson.getString("codigoPessoa"));
		}
		
		if (pessoaJson.get("fone") != JSONObject.NULL) {
			pessoa.setFone(pessoaJson.getLong("fone"));
		}
		
		if (pessoaJson.get("numero") != JSONObject.NULL) {
			pessoa.setNumero(pessoaJson.getLong("numero"));
		}
		
		if (pessoaJson.get("codigoTipoPessoa") != JSONObject.NULL) {
			pessoa.setCodigoTipoPessoa(pessoaJson.getLong("codigoTipoPessoa"));
		}
		
		if (pessoaJson.get("dddFixo") != JSONObject.NULL) {
			pessoa.setDddFixo(pessoaJson.getLong("dddFixo"));
		}	
		
		if (pessoaJson.get("descricaoProduto") != JSONObject.NULL) {
			pessoa.setDescricaoProduto(pessoaJson.getString("descricaoProduto"));
		}
		
		if (pessoaJson.get("bairro") != JSONObject.NULL) {
			pessoa.setBairro(pessoaJson.getString("bairro"));
		}
		
		if (pessoaJson.get("cidade") != JSONObject.NULL) {
			pessoa.setCidade(pessoaJson.getString("cidade"));
		}
		
		if (pessoaJson.get("estado") != JSONObject.NULL) {
			pessoa.setEstado(pessoaJson.getString("estado"));
		}
		
		if (pessoaJson.get("dataInicioVigencia") != JSONObject.NULL) {
			pessoa.setDataInicioVigencia(pessoaJson.getString("dataInicioVigencia"));
		}
		
		if (pessoaJson.get("cpfCgc") != JSONObject.NULL) {
			pessoa.setCpfCgc(pessoaJson.getString("cpfCgc"));
		}
		
		if (pessoaJson.get("situacaoContrato") != JSONObject.NULL) {
			pessoa.setSituacaoContrato(pessoaJson.getLong("situacaoContrato"));
		}
		
		if (pessoaJson.get("logradouro") != JSONObject.NULL) {
			pessoa.setLogradouro(pessoaJson.getString("logradouro"));
		}
		
		if (pessoaJson.get("chaveLegado") != JSONObject.NULL) {
			pessoa.setChaveLegado(pessoaJson.getString("chaveLegado"));
		}

		if (pessoaJson.get("segmentoBanco") != JSONObject.NULL) {
			pessoa.setSegmentoBanco(pessoaJson.getLong("segmentoBanco"));
		}
		
		if (pessoaJson.get("codigoCorretor") != JSONObject.NULL) {
			pessoa.setCodigoCorretor(pessoaJson.getLong("codigoCorretor"));
		}
		
		if (pessoaJson.get("codigoTipoPesquisa") != JSONObject.NULL) {
			pessoa.setCodigoTipoPesquisa(pessoaJson.getLong("codigoTipoPesquisa"));
		}
		
		if (pessoaJson.get("segmento") != JSONObject.NULL) {
			pessoa.setSegmento(pessoaJson.getString("segmento"));
		}
		
		if (pessoaJson.get("cartaoSaude") != JSONObject.NULL) {
			pessoa.setCartaoSaude(pessoaJson.getString("cartaoSaude"));
		}
		
		return pessoa;
	}

	private Vector<ListaApoliceVO> converterJsonApoliceParaVectorApolice(String jsonString) throws JSONException {
		Vector<ListaApoliceVO> lstApolices = new Vector<ListaApoliceVO>();
		
		JSONObject json = new JSONObject(jsonString);
		JSONArray listas = json.getJSONArray("lstApolices");
		
		if (listas != null && listas.length() > 0) {
			for (int i = 0; i < listas.length(); i++) {
				JSONObject apolice = (JSONObject) listas.get(i);
				
				ListaApoliceVO apoliceNew = new ListaApoliceVO();
				
				if (apolice.get("codigoSeguroAfinidade") != JSONObject.NULL) {
					apoliceNew.setCodigoSeguroAfinidade(apolice.getLong("codigoSeguroAfinidade"));	
				}
				
				if (apolice.get("codigoRamo") != JSONObject.NULL) {
					apoliceNew.setCodigoRamo(apolice.getInt("codigoRamo"));	
				}
				
				if (apolice.get("cpfCnpjSegurado") != JSONObject.NULL) {
					apoliceNew.setCpfCnpjSegurado(apolice.getLong("cpfCnpjSegurado"));
				}
				
				if (apolice.get("dataFimVigencia") != JSONObject.NULL) {
					apoliceNew.setDataFimVigencia(apolice.getString("dataFimVigencia"));
				}

				if (apolice.get("unidadeProdutora") != JSONObject.NULL) {
					apoliceNew.setUnidadeProdutora(apolice.getInt("unidadeProdutora"));
				}

				if (apolice.get("descricaoMoeda") != JSONObject.NULL) {
					apoliceNew.setDescricaoMoeda(apolice.getString("descricaoMoeda"));
				}
				
				if (apolice.get("numeroItem") != JSONObject.NULL) {
					apoliceNew.setNumeroItem(apolice.getInt("numeroItem"));
				}
				
				if (apolice.get("codigoMoeda") != JSONObject.NULL) {
					apoliceNew.setCodigoMoeda(apolice.getLong("codigoMoeda"));
				}
				
				if (apolice.get("codigoSucursal") != JSONObject.NULL) {
					apoliceNew.setCodigoSucursal(apolice.getInt("codigoSucursal"));
				}

				if (apolice.get("nomeSegurado") != JSONObject.NULL) {
					apoliceNew.setNomeSegurado(apolice.getString("nomeSegurado"));
				}
				
				if (apolice.get("nomeSucursal") != JSONObject.NULL) {
					apoliceNew.setNomeSucursal(apolice.getString("nomeSucursal"));
				}
				
				if (apolice.get("tipoDocumento") != JSONObject.NULL) {
					apoliceNew.setTipoDocumento(apolice.getInt("tipoDocumento"));
				}

				if (apolice.get("siglaMoeda") != JSONObject.NULL) {
					apoliceNew.setSiglaMoeda(apolice.getString("siglaMoeda"));
				}
				
				if (apolice.get("codigoEstipulante") != JSONObject.NULL) {
					apoliceNew.setCodigoEstipulante(apolice.getLong("codigoEstipulante"));
				}
				
				if (apolice.get("codigoProduto") != JSONObject.NULL) {
					apoliceNew.setCodigoProduto(apolice.getLong("codigoProduto"));
				}
				
				if (apolice.get("descricaoRisco") != JSONObject.NULL) {
					apoliceNew.setDescricaoRisco(apolice.getString("descricaoRisco"));
				}

				if (apolice.get("numeroEndosso") != JSONObject.NULL) {
					apoliceNew.setNumeroEndosso(apolice.getLong("numeroEndosso"));
				}
				
				if (apolice.get("nomeEstipulante") != JSONObject.NULL) {
					apoliceNew.setNomeEstipulante(apolice.getString("nomeEstipulante"));
				}

				if (apolice.get("descricaoProduto") != JSONObject.NULL) {
					apoliceNew.setDescricaoProduto(apolice.getString("descricaoProduto"));
				}

				if (apolice.get("numeroCertificado") != JSONObject.NULL) {
					apoliceNew.setNumeroCertificado(apolice.getLong("numeroCertificado"));
				}
				
				if (apolice.get("numeroApolice") != JSONObject.NULL) {
					apoliceNew.setNumeroApolice(apolice.getLong("numeroApolice"));
				}
				
				if (apolice.get("dataInicioVigencia") != JSONObject.NULL) {
					apoliceNew.setDataInicioVigencia(apolice.getString("dataInicioVigencia"));
				}
				
				if (apolice.get("codigoCorretor") != JSONObject.NULL) {
					apoliceNew.setCodigoCorretor(apolice.getLong("codigoCorretor"));
				}
				
				lstApolices.add(apoliceNew);
			}
		}
		
		return lstApolices;
	}
	
	private Vo converterJsonApoliceDataOcorrenciaParaVo(String jsonString) throws JSONException {
		Vo voRetorno = new Vo();
		
		JSONObject json = new JSONObject(jsonString);
		
		if (json.get("dataOcorrencia") != JSONObject.NULL) {
			voRetorno.addField("dataOcorrencia", json.getString("dataOcorrencia").toString());
		} else {
			voRetorno.addField("dataOcorrencia", "");
		}
		
		if (json.get("horaOcorrencia") != JSONObject.NULL) {
			voRetorno.addField("horaOcorrencia", json.getString("horaOcorrencia").toString());
		} else {
			voRetorno.addField("horaOcorrencia", "");
		}
		
		if (json.get("rdoFalorSombreSinistro") != JSONObject.NULL) {
			voRetorno.addField("rdoFalorSombreSinistro", json.getString("rdoFalorSombreSinistro").toString());
		} else {
			voRetorno.addField("rdoFalorSombreSinistro", "");
		}
		
		return voRetorno;
	}
	
	
	public Vo buscarPessoa(
			String pessNmPessoa,
			String pessDhNascimento,
			String idChamCdChamado,
			String pcomDsDdd,
			String pcomDsTelefone,
			String pessDsCgccpf,
			String dataOcorrencia,
			String horaOcorrencia,
			String pcomDsComplemento,
			String rdoFalorSombreSinistro,
			String acao,
			String apol_Sucurcsal,
			String apol_Cia,
			String apol_Ramo,
			String apol_Apolice,
			String siasNrSinistro,
			String funcDsLoginName) {
		
		Vo voRetorno = new Vo().addField("retorno", false) ;
		
		Log.log(this.getClass(), Log.INFOPLUS, "Carregando do buscarPessoa");
		
		try {
			GenericHelper gHelper = new GenericHelper(idEmprCdEmpresa);
			
			//3.2.4. Ao informar o CPF/CNPJ e a Data/Hora de Ocorrência, o Plusoft acionará serviços da Bradesco 
			//para validar o cliente e recuperar as Apólices, conforme regras abaixo:
			if (chamarWebservice(
					pessNmPessoa, 
					pessDhNascimento, 
					idChamCdChamado, 
					pcomDsDdd, 
					pcomDsTelefone, 
					pessDsCgccpf, 
					dataOcorrencia, 
					horaOcorrencia, 
					pcomDsComplemento, 
					rdoFalorSombreSinistro, 
					acao, 
					apol_Sucurcsal, 
					apol_Cia, 
					apol_Ramo, 
					apol_Apolice, 
					siasNrSinistro)) {
				
//				3.2.5.	Primeiro, o Plusoft deverá acionar o método “listaApolice” passando o CPF/CNPJ e a Data/Hora de Ocorrência, onde será retornado 
				//os dados do cliente e a lista de apólices vigentes. Com os dados retornados do cliente (CPF/CNPJ e Nome), o Plusoft acionará o método 
				//da BUC “identificarPessoaUSE” onde, ao encontrar na BUC, deverá buscar também na base Plusoft e verificar se o cliente retornado 
				//tem um ID BUC vinculado ao seu cadastro na base Plusoft e carregar os dados do cliente na tela de dados de pessoa;
				WebServiceApoliceBusiness wsApolice = new WebServiceApoliceBusiness(idEmprCdEmpresa, funcDsLoginName);
				WebServiceBucBusiness  wsBuc = null;
				
				Vo voApolices = wsApolice.getListaApolice(pessDsCgccpf, dataOcorrencia + " " + horaOcorrencia);
				
//				3.2.5.1.	A Lista de Apólices retornada deverá ser guardada em memória para ser exibida na Aba Apólice (F002 – ATD – Abertura de Sinistro ASR-RE);
//				Ao informar também o Número de Apólice na identificação, este servirá para filtrar a lista de apólices conforme a apólice informada;
				voApolices = filtrarApolices(voApolices , apol_Sucurcsal, apol_Cia, apol_Ramo, apol_Apolice);
				Vector<PlusoftUseVO> listaPessoaBuc = new Vector<PlusoftUseVO>();
				if ("true".equals(voApolices.getFieldAsString("retorno"))) { 
					Vector<ListaApoliceVO> lstApolice = (Vector<ListaApoliceVO>) voApolices.getField("listaApolices");
					if (lstApolice != null && lstApolice.size() > 0) {
						boolean tipoBuscaPlusoft = false;
						Vector vecPlusoft = new Vector();
						for (ListaApoliceVO apolice : lstApolice) {
							wsBuc = new WebServiceBucBusiness(idEmprCdEmpresa);
							Vo voRetornoBuc = wsBuc.getPessoaUse(String.valueOf(apolice.getCpfCnpjSegurado()),apolice.getNomeSegurado());
							if ("true".equals(voRetornoBuc.getFieldAsString("retorno"))) {//arrumar aqui tirando o "!" do true
								listaPessoaBuc = adicionarPessoaSeNaoExistirNaColecao(listaPessoaBuc, (Vector<PlusoftUseVO>) voRetornoBuc.getField("listaPessoaUse"));
							} else {
								//3.2.6.	Caso não encontre o cliente na BUC pelo CPF/CNPJ, deverá ser buscado na base Plusoft, ao encontrar, 
								//este deverá ser posicionado em tela, pois o CPF/CNPJ buscado poderá ser de uma pessoa que não é cliente 
								//Bradesco e por isso não constará na BUC; 
								
								vecPlusoft = pesquisaBasePlusoft(
										pessNmPessoa, 
										pessDhNascimento, 
										idChamCdChamado, 
										pcomDsDdd, 
										pcomDsTelefone, 
										pessDsCgccpf, 
										pcomDsComplemento,
										siasNrSinistro);
								
								tipoBuscaPlusoft = true;
								break;
							}
						}
						
						if (tipoBuscaPlusoft == false) {
							voRetorno.addField("tipoBusca", "buc");
							voRetorno.addField("listaApolices", voApolices.getField("listaApolices"));
							voRetorno.addField("listaPessoa", listaPessoaBuc);
							voRetorno.addField("dataOcorrencia", dataOcorrencia);
							voRetorno.addField("horaOcorrencia", horaOcorrencia);
							voRetorno.addField("rdoFalorSombreSinistro", rdoFalorSombreSinistro);
							voRetorno.addField("retorno", true);
							voRetorno.addField("mensagem", "");
						} else {
							voRetorno.addField("tipoBusca", "plusoft");
							if (vecPlusoft != null && vecPlusoft.size() > 0) {
								voRetorno.addField("listaPessoa", vecPlusoft);
								voRetorno.addField("retorno", true);
								voRetorno.addField("posicionarNaTela", true);
								voRetorno.addField("mensagem", "");
							} else {
								//3.2.7.	Caso não encontre o cliente retornado na BUC nem no Plusoft, deverá ser criado automaticamente 
								//na base Plusoft com as informações disponibilizadas no primeiro serviço ListaApolice 
								//(Nome, CPF/CNPJ) e ser carregado em tela;
								try {
									ListaApoliceVO apolice = lstApolice.get(0);
									Vo voCriarPessoa = new Vo();
									voCriarPessoa.addField("id_pess_cd_pessoa", Numeradora.nextValue("CS_CDTB_PESSOA_PESS"));
									voCriarPessoa.addField("pess_nm_pessoa", apolice.getNomeSegurado());
									voCriarPessoa.addField("pess_ds_cgccpf", apolice.getCpfCnpjSegurado().toString());
									
									if (apolice.getCpfCnpjSegurado().toString().length() == 11) {
										voCriarPessoa.addField("pess_in_pfj", "F");
									} else if (apolice.getCpfCnpjSegurado().toString().length() > 11) {
										voCriarPessoa.addField("pess_in_pfj", "J");
									}
									
									Vo voPessoaRetorno = gHelper.create(ConstantesEspec.ENTITY_CS_CDTB_PESSOA_PESS, "create-row", voCriarPessoa);
									
									if (voPessoaRetorno != null && voPessoaRetorno.getFieldAsString("id_pess_cd_pessoa").length() > 0 ) {
										Vector vecPlusoftNovo = new Vector();
										Vo voPessoaNovo = new Vo();
										voPessoaNovo.addField("id_pess_cd_pessoa", voPessoaRetorno.getFieldAsString("id_pess_cd_pessoa"));
										voPessoaNovo.addField("pess_nm_pessoa", apolice.getNomeSegurado());
										vecPlusoftNovo.add(voPessoaNovo);
										
										voRetorno.addField("listaPessoa", vecPlusoftNovo);
										voRetorno.addField("retorno", true);
										voRetorno.addField("posicionarNaTela", true);
										voRetorno.addField("mensagem", "");
									}
								} catch (Exception e) {
									voRetorno.addField("retorno", false);
									voRetorno.addField("mensagem", "Ocorreu um erro ao tentar criar a pessoa.");
								}
							}
						}
					} else {
						voRetorno.addField("tipoBusca", "buc");
						voRetorno.addField("retorno", false);
						voRetorno.addField("mensagem", "Cliente não encontrado");
					}
					
				} else {
					Log.log(this.getClass(), Log.ERRORPLUS, voRetorno.getFieldAsString("mensagem"));
					voRetorno.addField("tipoBusca", "buc");
					voRetorno.addField("retorno", false);
					voRetorno.addField("mensagem", "Cliente não encontrado");
				}
				
				
			} else {
				//Chamada não no webserice
				voRetorno.addField("tipoBusca", "plusoft");
				Vector vecPlusoft = pesquisaBasePlusoft(
						pessNmPessoa, 
						pessDhNascimento, 
						idChamCdChamado, 
						pcomDsDdd, 
						pcomDsTelefone, 
						pessDsCgccpf, 
						pcomDsComplemento,
						siasNrSinistro);
				
				voRetorno.addField("listaPessoa", vecPlusoft);
				voRetorno.addField("retorno", (vecPlusoft != null && vecPlusoft.size() > 0) ? true : false );
				voRetorno.addField("posicionarNaTela", false);
				voRetorno.addField("mensagem", "");
			}
		} catch (Exception e) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro ao executar o método - buscarPessoa(): " + e.getMessage(), e);
		}
		
		return voRetorno;
	}
	
	
	private Vector<PlusoftUseVO> adicionarPessoaSeNaoExistirNaColecao(Vector<PlusoftUseVO> listaPessoaBuc, Vector<PlusoftUseVO> vecAdicionar) {
		
		Vector<PlusoftUseVO> vecRetorno = new Vector<PlusoftUseVO>(); 
		
		try {
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando adicionarPessoaSeNaoExistirNaColecao");
			
			for (PlusoftUseVO novaPessoa : vecAdicionar) {
				boolean encontrouPessoa = false;
				for (PlusoftUseVO pessoaBuc : listaPessoaBuc) {
					if (pessoaBuc.equals(novaPessoa)) {
						encontrouPessoa = true;
						break;
					}
				}
				
				if (encontrouPessoa == false) {
					listaPessoaBuc.add(novaPessoa);
				}
			}
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando adicionarPessoaSeNaoExistirNaColecao - Sucesso");
			
		} catch (Exception e) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro no metodo - adicionarPessoaSeNaoExistirNaColecao" , e);
			listaPessoaBuc.addAll(vecAdicionar);
		}

		vecRetorno.addAll(listaPessoaBuc);
		
		return vecRetorno;
	}

	public Vector pesquisaBasePlusoft(
			String pessNmPessoa,
			String pessDhNascimento,
			String idChamCdChamado,
			String pcomDsDdd,
			String pcomDsTelefone,
			String pessDsCgccpf,
			String pcomDsComplemento,
			String siasNrSinistro
			) {		
		Vector retornoVector = null;
		GenericHelper gHelper = null;

		try {
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando pesquisaBasePlusoft");
			
			gHelper = new GenericHelper(idEmprCdEmpresa);
			Condition condition = new Condition();
			String bIncondicional = "";
			String cTipoQuery = "";
			String cEntityName = "";
			
			cEntityName = ConstantesEspec.ENTITY_CS_CDTB_PESSOA_PESS;
			cTipoQuery = "select-by-arguments";

			if(pessNmPessoa != null && !pessNmPessoa.equals("")){
				condition.addCondition("pess.pess_nm_pessoa", Condition.LIKE, pessNmPessoa.toUpperCase().replace("#", "%")+"%");
			}
			
			if(pessDhNascimento != null && pessDhNascimento.length() > 0 ) {
				condition.addCondition("pess.pess_dh_nascimento", Condition.EQUAL, new SystemDate(pessDhNascimento).toSqlDate());
			}
			
			if(pcomDsDdd != null && pcomDsDdd.length() > 0 ) {
				condition.addCondition("pcomtel.pcom_ds_ddd", Condition.EQUAL, pcomDsDdd);
			}
			
			if(pcomDsTelefone != null && pcomDsTelefone.length() > 0 ) {
				condition.addCondition("pcomtel.pcom_ds_comunicacao", Condition.EQUAL, pcomDsTelefone);
			}
			
			if(pessDsCgccpf != null && !pessDsCgccpf.equals("")) {
				pessDsCgccpf = pessDsCgccpf.replaceAll(Pattern.quote("."), "");
				pessDsCgccpf = pessDsCgccpf.replaceAll(Pattern.quote("-"), "");
				pessDsCgccpf = pessDsCgccpf.replaceAll(Pattern.quote("/"), "");
				condition.addCondition("pess.pess_ds_cgccpf", Condition.EQUAL, pessDsCgccpf);
			}

			if(pcomDsComplemento != null && pcomDsComplemento.length() > 0 ) {
				condition.addCondition("pcomemail.pcom_ds_complemento", Condition.EQUAL, pcomDsComplemento);
			}
			
			if(siasNrSinistro != null && siasNrSinistro.length() > 0 ) {
				condition.addCondition("pesr.pesr_nr_sinistro", Condition.EQUAL, siasNrSinistro);
			}
			
			if(idChamCdChamado != null && !idChamCdChamado.equals("")) {
				cTipoQuery = "select-by-arguments-chamado";
				condition.addCondition("cham.id_cham_cd_chamado", Condition.EQUAL, idChamCdChamado);
			}
			
			retornoVector = gHelper.openQuery(cEntityName, cTipoQuery, condition);
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando pesquisaBasePlusoft - Sucesso");
			
		} catch (Exception e) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro ao executar o método - pesquisaBasePlusoft(): " + e.getMessage(), e);
		} finally {
			gHelper = null;
		}
		
		return retornoVector;
	}
	
	
	private Vo filtrarApolices(Vo voApolices, 
							  String apol_Sucurcsal,
							  String apol_Cia, 
							  String apol_Ramo, 
							  String apol_Apolice) {
		
		Vo voApoliceRetorno = new Vo();
		Vector<ListaApoliceVO> vecNovaListaApocice = new Vector<ListaApoliceVO>();
		
		Log.log(this.getClass(), Log.INFOPLUS, "Carregando filtrarApolices");
		
		try {
			if ("false".equals(voApolices.getFieldAsString("retorno"))) {
				return voApolices;
			}
			
			if (getString(apol_Sucurcsal, 10).length() == 0 
					&& getString(apol_Cia, 10).length() == 0 
					&& getString(apol_Ramo, 10).length() == 0 
					&& getString(apol_Apolice, 10).length() == 0 ) {
				return voApolices;
			}
			
			Vector<ListaApoliceVO> lstApolice = (Vector<ListaApoliceVO>) voApolices.getField("listaApolices");
			
			//Primeira as apolices filtradas
			for (ListaApoliceVO apolice : lstApolice) {
				
				if (getString(apol_Sucurcsal, 10).length() > 0 ){
					if ( Integer.parseInt(getString(apol_Sucurcsal, 20).trim()) != apolice.getCodigoSucursal()) {
						continue;
					}
				}
				
				if (getString(apol_Cia, 10).length() > 0 ){
					if ( Integer.parseInt(getString(apol_Cia, 20).trim()) != apolice.getCodigoCia()) {
						continue;
					}
				}
				
				if (getString(apol_Ramo, 10).length() > 0 ){
					if ( Integer.parseInt(getString(apol_Ramo, 20).trim()) != apolice.getCodigoRamo()) {
						continue;
					}
				}
				
				if (getString(apol_Apolice, 10).length() > 0 ){
					if ( Long.parseLong(getString(apol_Apolice, 30).trim()) != apolice.getNumeroApolice()) {
						continue;
					}
				}
				
				vecNovaListaApocice.add(apolice);
			}
			
			//Apolices restantes
			for (ListaApoliceVO apolice : lstApolice) {
				boolean apoliceJaAdicionada = false;
				for (ListaApoliceVO apoliceAdicinadas : vecNovaListaApocice) {
					if (apolice.getNumeroApolice() == apoliceAdicinadas.getNumeroApolice()) {
						apoliceJaAdicionada = true;
						break;
					}
				}
				
				if (apoliceJaAdicionada == false) {
					vecNovaListaApocice.add(apolice);		
				}
			}
			
			voApoliceRetorno.addField("retorno", true);
			voApoliceRetorno.addField("listaApolices", vecNovaListaApocice);
			
			Log.log(this.getClass(), Log.INFOPLUS, "Carregando filtrarApolices - Sucesso");
			
		} catch (Exception e) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro no metodo - filtrarApolices" , e);
		}
		
		
		

		return voApoliceRetorno;
}

	private boolean chamarWebservice(String pessNmPessoa,
			String pessDhNascimento,
			String idChamCdChamado,
			String pcomDsDdd,
			String pcomDsTelefone,
			String pessDsCgccpf,
			String dataOcorrencia,
			String horaOcorrencia,
			String pcomDsComplemento,
			String rdoFalorSombreSinistro,
			String acao,
			String apol_Sucurcsal,
			String apol_Cia,
			String apol_Ramo,
			String apol_Apolice,
			String siasNrSinistro) {
		
		if (getString(pessNmPessoa, 20).length() > 0 ) {
			return false;
		}
		
		if ((getString(pessDsCgccpf, 20).length() > 0)) {
			if ((getString(dataOcorrencia, 20).length() == 0) || (getString(horaOcorrencia, 20).length() == 0)) {
				return false;	
			}
		}
		
		if (getString(pessDhNascimento, 20).length() > 0 ) {
			return false;
		}
		
		if (getString(idChamCdChamado, 20).length() > 0 ) {
			return false;
		}
		
		if (getString(pcomDsDdd, 20).length() > 0 ) {
			return false;
		}
		
		if (getString(pcomDsTelefone, 20).length() > 0 ) {
			return false;
		}
		
		if (getString(pcomDsComplemento, 20).length() > 0 ) {
			return false;
		}
		
//		if (getString(apol_Sucurcsal, 20).length() > 0 ) {
//			return false;
//		}
//		
//		if (getString(apol_Cia, 20).length() > 0 ) {
//			return false;
//		}
//		
//		if (getString(apol_Ramo, 20).length() > 0 ) {
//			return false;
//		}
//		
//		if (getString(apol_Apolice, 20).length() > 0 ) {
//			return false;
//		}
		
		if (getString(siasNrSinistro, 20).length() > 0 ) {
			return false;
		}
		
		return true;
	}
	
	private String getString(String valor, int tamanho) {
		if (valor != null) {
			if (valor.length() > tamanho) {
				valor = valor.substring(0, tamanho);
			}
		} else {
			valor = "";
		}
		return valor.trim();
	}
	
}