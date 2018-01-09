
package br.com.plusoft.csi.bradescoaf.crm.vo.sinistro;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.ejb.CreateException;
import javax.ejb.FinderException;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import br.com.bradseg.sare.avisoeletroportatil.canonico.v1.Aviso;
import br.com.bradseg.sare.avisoeletroportatil.canonico.v1.ComunicadoEmpresa;
import br.com.bradseg.sare.avisoeletroportatil.canonico.v1.ComunicadoEquipamentoComunicado;
import br.com.bradseg.sare.avisoeletroportatil.canonico.v1.ComunicadoEquipamentoValorEquipamentoValor;
import br.com.bradseg.sare.avisoeletroportatil.canonico.v1.ComunicadoResidencial;
import br.com.bradseg.sare.avisoeletroportatil.canonico.v1.ComunicadoTerceirosTerceiro;
import br.com.bradseg.sare.avisoeletroportatil.canonico.v1.DadosEquipamentos;
import br.com.bradseg.sare.avisoeletroportatil.canonico.v1.DetalheSinistroExtensaoSinistro;
import br.com.plusoft.csi.adm.helper.SystemDataBancoHelper;
import br.com.plusoft.csi.adm.helper.generic.GenericHelper;
import br.com.plusoft.fw.entity.Vo;
import br.com.plusoft.fw.log.Log;
import br.com.plusoft.fw.util.Datetime;

public class AvisoSinistro {

    private Comunicado comunicado;
    private Sinistro sinistro;
    private List<Equipamento> equipamentos = null;
    private List<DetalheBemSinistrado> detalheBemSinistrado = null;
    private Responsavel responsavel;
    private List<OutrosEnvolvido> outrosEnvolvidos = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public AvisoSinistro() {
    }

    /**
     * 
     * @param comunicado
     * @param outrosEnvolvidos
     * @param responsavel
     * @param detalheBemSinistrado
     * @param equipamentos
     * @param sinistro
     */
    public AvisoSinistro(Comunicado comunicado, Sinistro sinistro, List<Equipamento> equipamentos, List<DetalheBemSinistrado> detalheBemSinistrado, Responsavel responsavel, List<OutrosEnvolvido> outrosEnvolvidos) {
        super();
        this.comunicado = comunicado;
        this.sinistro = sinistro;
        this.equipamentos = equipamentos;
        this.detalheBemSinistrado = detalheBemSinistrado;
        this.responsavel = responsavel;
        this.outrosEnvolvidos = outrosEnvolvidos;
    }

    public Comunicado getComunicado() {
        return comunicado;
    }

    public void setComunicado(Comunicado comunicado) {
        this.comunicado = comunicado;
    }

    public Sinistro getSinistro() {
        return sinistro;
    }

    public void setSinistro(Sinistro sinistro) {
        this.sinistro = sinistro;
    }

    public List<Equipamento> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<Equipamento> equipamentos) {
        this.equipamentos = equipamentos;
    }

    public List<DetalheBemSinistrado> getDetalheBemSinistrado() {
        return detalheBemSinistrado;
    }

    public void setDetalheBemSinistrado(List<DetalheBemSinistrado> detalheBemSinistrado) {
        this.detalheBemSinistrado = detalheBemSinistrado;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    public List<OutrosEnvolvido> getOutrosEnvolvidos() {
        return outrosEnvolvidos;
    }

    public void setOutrosEnvolvidos(List<OutrosEnvolvido> outrosEnvolvidos) {
        this.outrosEnvolvidos = outrosEnvolvidos;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(comunicado).append(sinistro).append(equipamentos).append(detalheBemSinistrado).append(responsavel).append(outrosEnvolvidos).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AvisoSinistro) == false) {
            return false;
        }
        AvisoSinistro rhs = ((AvisoSinistro) other);
        return new EqualsBuilder().append(comunicado, rhs.comunicado).append(sinistro, rhs.sinistro).append(equipamentos, rhs.equipamentos).append(detalheBemSinistrado, rhs.detalheBemSinistrado).append(responsavel, rhs.responsavel).append(outrosEnvolvidos, rhs.outrosEnvolvidos).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    private boolean isNull(Object valor) {
    	
    	try {
    		if (valor == null ) {
        		return true;
        	} else {
        		if (String.valueOf(valor).trim().length() == 0) {
        			return true;
        		} else {
        			return false;
        		}
        	}	
		} catch (Exception e) {
			return true;
		}
    }
    
    public Aviso toAvisoWs() throws Exception{
    	Aviso aviso = new Aviso();
    	
    	converterComunicado(aviso);
    	
    	converterSinistro(aviso);
    	
    	converterEquipamento(aviso);

    	converterDetalhe(aviso);
    	
    	converterResponsavel(aviso);
    	
    	converterOutrosEnvolvidos(aviso);
    	
    	conveterOutrosCamposNaoPreenchidosEmtelaEObrigatorios(aviso);
    	
    	return aviso;
    }

	private void conveterOutrosCamposNaoPreenchidosEmtelaEObrigatorios(Aviso aviso) {
		
		try {
			aviso.setDataComunicado(new SystemDataBancoHelper().getDataBanco());
		} catch (Exception e) {}
		
		aviso.setCanalComunicacao(new Short("10"));
		aviso.setTipoUsuario(new Short("1"));
		aviso.setTipoSinistro(new Short("1"));
		aviso.setMoeda(1);
		
		
	}

	private void converterDetalhe(Aviso aviso) {
		if (this.getDetalheBemSinistrado() != null && this.getDetalheBemSinistrado().size() > 0) {
    		List<DetalheSinistroExtensaoSinistro> lstDeltahe = new ArrayList<DetalheSinistroExtensaoSinistro>();
    		
    		
    		for (DetalheBemSinistrado detalhe : this.getDetalheBemSinistrado()) {
    			DetalheSinistroExtensaoSinistro detalheNew = new DetalheSinistroExtensaoSinistro();
    			
    			if (!isNull(detalhe.getDetClassificacao() )) {
    				detalheNew.setCategoria(Short.parseShort(detalhe.getDetClassificacao()));		
        		}
    			
    			if (!isNull(detalhe.getQtde() )) {
    				detalheNew.setQuantidade(Integer.parseInt(detalhe.getQtde()));		
        		}
    			
    			if (!isNull(detalhe.getDetValor())) {
    				detalheNew.setValorUnitario(parseStringToBigInt(detalhe.getDetValor()));		
        		}
    			
    			if (!isNull(detalhe.getDetValorTotalDanos())) {
    				detalheNew.setValorEstimado(parseStringToBigInt(detalhe.getDetValorTotalDanos()));		
        		}
    			
    			if (!isNull(detalhe.getDescricao())) {
    				detalheNew.setDescricaoOutros(detalhe.getDescricao());		
        		}
    			
    			detalheNew.setTipo(999999999);
    			detalheNew.setMarca(999999999);
    			
    			
    			lstDeltahe.add(detalheNew);
			}
    	
    		aviso.setDetalheSinistro(lstDeltahe.toArray(new DetalheSinistroExtensaoSinistro[lstDeltahe.size()]));
    	}
	}
	
	
	public Vector<Vo> converterDetalheToVector(long pesr_nr_sequencia, long id_pess_cd_pessoa) {
		
		Vector<Vo> vecRetorno = new Vector<Vo>();
		
		if (this.getDetalheBemSinistrado() != null && this.getDetalheBemSinistrado().size() > 0) {
    		List<DetalheSinistroExtensaoSinistro> lstDeltahe = new ArrayList<DetalheSinistroExtensaoSinistro>();
    		
    		
    		for (DetalheBemSinistrado detalhe : this.getDetalheBemSinistrado()) {
    			
    			Vo voRetorno = null;
    			
    			DetalheSinistroExtensaoSinistro detalheNew = new DetalheSinistroExtensaoSinistro();
    			
    			if (!isNull(detalhe.getDetClassificacao() )) {
    				if (voRetorno == null) voRetorno = new Vo();
    				voRetorno.addField("depe_cd_classificacao", getString(detalhe.getDetClassificacao(), 10));
        		}
    			
    			if (!isNull(detalhe.getDetClassificacaoDescricao() )) {
    				if (voRetorno == null) voRetorno = new Vo();
    				voRetorno.addField("depe_ds_classificacao", getString(detalhe.getDetClassificacaoDescricao(), 255));
        		}
    			
    			if (!isNull(detalhe.getQtde() )) {
    				if (voRetorno == null) voRetorno = new Vo();
    				voRetorno.addField("depe_nr_quantidade", getString(detalhe.getQtde(), 9));
        		}
    			
    			if (!isNull(detalhe.getDetValor())) {
    				if (voRetorno == null) voRetorno = new Vo();
    				detalheNew.setValorUnitario(parseStringToBigInt(detalhe.getDetValor()));
    				voRetorno.addField("depe_vl_valor", getString(detalhe.getDetValor(), 17));
        		}
				 
    			if (!isNull(detalhe.getDetValorTotalDanos())) {
    				if (voRetorno == null) voRetorno = new Vo();
    				detalheNew.setValorEstimado(parseStringToBigInt(detalhe.getDetValorTotalDanos()));
    				voRetorno.addField("depe_vl_valortotal", getString(detalhe.getDetValorTotalDanos(), 40));
        		}
    			
    			if (!isNull(detalhe.getDescricao())) {
    				if (voRetorno == null) voRetorno = new Vo();
    				detalheNew.setDescricaoOutros(detalhe.getDescricao());
    				voRetorno.addField("depe_ds_descricao", getString(detalhe.getDescricao(), 50));
        		}
    			
    			if (voRetorno != null ) {
        			voRetorno.addField("pesr_nr_sequencia", pesr_nr_sequencia);
        			voRetorno.addField("id_pess_cd_pessoa", id_pess_cd_pessoa);
    				vecRetorno.add(voRetorno);	
    			}
			}
    	}
		
		return vecRetorno;
	}
	

	
	
	private void converterOutrosEnvolvidos(Aviso aviso) {
		if (this.getOutrosEnvolvidos() != null && this.getOutrosEnvolvidos().size() > 0) {
    		List<ComunicadoTerceirosTerceiro> lstTerceiro = new ArrayList<ComunicadoTerceirosTerceiro>();
    		
    		
    		for (OutrosEnvolvido terceiro : this.getOutrosEnvolvidos()) {
    			ComunicadoTerceirosTerceiro terceiroNew = new ComunicadoTerceirosTerceiro();
    			
    			if (!isNull(terceiro.getNome() )) {
    				terceiroNew.setNome(terceiro.getNome());		
        		}
    			
    			if (!isNull(terceiro.getCpf())) {
    				terceiroNew.setCpfCnpj(Long.parseLong(somenteNumeros(terceiro.getCpf())));
    				terceiroNew.setTipoPessoa(somenteNumeros(terceiro.getCpf()).length() > 11 ? new Short("4") : new Short("3"));
        		} else {
        			terceiroNew.setTipoPessoa(new Short("1"));
        		}
    			
    			
    			
    			lstTerceiro.add(terceiroNew);
    			
			}
    	
    		aviso.setComunicadoTerceiros(lstTerceiro.toArray(new ComunicadoTerceirosTerceiro[lstTerceiro.size()]));
    	}
	}
	
	public Vector<Vo> converterOutrosEnvolvidosToVector(long pesr_nr_sequencia, long id_pess_cd_pessoa) {
		
		Vector<Vo> vecRetorno = new Vector<Vo>();
		
		if (this.getOutrosEnvolvidos() != null && this.getOutrosEnvolvidos().size() > 0) {
    		
    		for (OutrosEnvolvido terceiro : this.getOutrosEnvolvidos()) {
    			
    			Vo voRetorno = null;
    			
    			if (!isNull(terceiro.getNome() )) {
    				if (voRetorno == null) voRetorno = new Vo();
    				voRetorno.addField("oupe_nm_nome", getString(terceiro.getNome(), 80));		
        		}
    			
    			if (!isNull(terceiro.getCpf())) {
    				if (voRetorno == null) voRetorno = new Vo();
    				voRetorno.addField("oupe_nr_cpf", getString(somenteNumeros(terceiro.getCpf()), 20));
        		} 
    			
    			if (voRetorno != null ) {
        			voRetorno.addField("pesr_nr_sequencia", pesr_nr_sequencia);
        			voRetorno.addField("id_pess_cd_pessoa", id_pess_cd_pessoa);
    				vecRetorno.add(voRetorno);	
    			}
			}
    	}
		
		return vecRetorno;
		
	}
	

	private void converterResponsavel(Aviso aviso) {
		if (this.getResponsavel() != null ) {
    		Responsavel responsavel = this.getResponsavel();
    		
    		if (!isNull(responsavel.getMesmoEnderecoApolice())) {
    			aviso.setFlagAlteracao(responsavel.getMesmoEnderecoApolice() == true ? "S" : "N");		
    		}
    		
    		if (!isNull(responsavel.getNomeResponsavel())) {
    			aviso.setNomeResponsavel(responsavel.getNomeResponsavel());		
    		}
    		
    		if (!isNull(responsavel.getEndereco())) {
    			aviso.setLogradouro(responsavel.getEndereco());		
    		}
    		
    		if (!isNull(responsavel.getNumeroEnderecoSegurado())) {
    			aviso.setNumero(responsavel.getNumeroEnderecoSegurado());
    		}
    		
    		if (!isNull(responsavel.getDddTelefone())) {
    			aviso.setDddResidenciaResponsavel(Integer.parseInt(responsavel.getDddTelefone()));		
    		}
    		
    		if (!isNull(responsavel.getNumeroTelefone())) {
    			aviso.setTelefoneResidenciaResponsavel(Long.parseLong(responsavel.getNumeroTelefone()));		
    		}
    		
    		if (!isNull(responsavel.getBairro())) {
    			aviso.setBairro(responsavel.getBairro());		
    		}
    		
    		if (!isNull(responsavel.getDddCelular())) {
    			aviso.setDddCelularResponsavel(Integer.parseInt(responsavel.getDddCelular()));		
    		}
    		
    		if (!isNull(responsavel.getNumeroCelular())) {
    			aviso.setCelularResponsavel(Long.parseLong(responsavel.getNumeroCelular()));		
    		}
    		
    		if (!isNull(responsavel.getCep())) {
    			aviso.setCep(Integer.parseInt(somenteNumeros(responsavel.getCep())));		
    		}
    		
    		if (!isNull(responsavel.getEmail())) {
    			aviso.setEmailResponsavel(responsavel.getEmail());		
    		}
    		
    		if (responsavel.getUf() != null && !isNull(responsavel.getUf().getId())) {
    			aviso.setUf(responsavel.getUf().getId());		
    		}
    		
    		if (responsavel.getCidade() != null && !isNull(responsavel.getCidade().getId())) {
    			aviso.setCidade(responsavel.getCidade().getId());		
    		}
    		
    		if (!isNull(responsavel.getReceberSms())) {
    			aviso.setCanalSms(responsavel.getReceberSms() == true ? "S" : "N");		
    		}
    		
    		if (!isNull(responsavel.getReceberEmail())) {
    			aviso.setCanalEmail(responsavel.getReceberEmail() == true ? "S" : "N");		
    		}
    		
    		aviso.setFlagAcompanhamento("N");
    		
    		if ("S".equalsIgnoreCase(aviso.getCanalEmail()) && "S".equalsIgnoreCase(aviso.getCanalSms())) {
    			aviso.setFlagAcompanhamento("S");
    		}
    		
    		
    		//BENEFICIARIO
    		
    		if (!isNull(responsavel.getProprioSegurado())) {
    			if (responsavel.getProprioSegurado() == true ){
    				aviso.setCodigoBeneficiario(new Short("1"));
    				aviso.setVinculoBeneficiario(new Short("1"));
    			} else {
    				aviso.setCodigoBeneficiario(new Short("0"));
    				
    				if (responsavel.getOutros() != null && !isNull(responsavel.getOutros().getId())) {
    					aviso.setVinculoBeneficiario(Short.parseShort(responsavel.getOutros().getId()));
    	    		}
    			}
    		}

    		if (!isNull(responsavel.getNomeBeneficiario())) {
    			aviso.setNomeBeneficiario(responsavel.getNomeBeneficiario());		
    		}
    		
    		if (!isNull(responsavel.getCpfBeneficiario())) {
    			aviso.setCpfCnpjBeneficiario(somenteNumeros(responsavel.getCpfBeneficiario()));		
    		}
    		
    		if (!isNull(responsavel.getNaoTemContaBanco())) {
    			aviso.setFlagContaBanco(responsavel.getNaoTemContaBanco() == true ? "S" : "N");		
    		}
    		
    		if (!isNull(responsavel.getCodBanco())) {
    			aviso.setCodigoBanco(Short.parseShort(responsavel.getCodBanco()));		
    		}
    		
    		if (!isNull(responsavel.getAgencia())) {
    			aviso.setCodigoAgencia(Integer.parseInt(responsavel.getAgencia()));		
    		}
    		
    		if (!isNull(responsavel.getAgenciaDv())) {
    			aviso.setDigitoVerificadorAgencia(Integer.parseInt(responsavel.getAgenciaDv()));		
    		}
    		
    		if (!isNull(responsavel.getConta())) {
    			aviso.setNumeroConta(Long.parseLong(responsavel.getConta()));		
    		}
    		
    		if (!isNull(responsavel.getContaDv())) {
    			aviso.setDigitoVerificadorConta(responsavel.getContaDv());		
    		}
    		
    		//OUTRA CIA
    		Vector<Short> vecCia = new Vector<Short>();
    		if (responsavel.getQualCia() != null && !isNull(responsavel.getQualCia().getId())) {
    			vecCia.add(Short.parseShort(responsavel.getQualCia().getId()));
    		}
    		
    		if (vecCia != null && vecCia.size() > 0) {
    			short[] ocorrenciaOutrosSeguros = new short[vecCia.size()];
    			for (int i = 0; i < vecCia.size(); i++) {
    				ocorrenciaOutrosSeguros[i] = vecCia.get(i); 
				}
    			
    			aviso.setOcorrencia(ocorrenciaOutrosSeguros);
    		}
    		
    	}
	}
	
	public Vo converterResponsavelToVo(long pesr_nr_sequencia, long id_pess_cd_pessoa) {
		
		Vo voRetorno = null;
		
		if (this.getResponsavel() != null ) {
    		Responsavel responsavel = this.getResponsavel();
    		
    		if (!isNull(responsavel.getMesmoEnderecoApolice())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("repe_in_mesmoendapoli", getString(responsavel.getMesmoEnderecoApolice() == true ? "S" : "N", 1));
    		}
    		
    		if (!isNull(responsavel.getNomeResponsavel())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("repe_nm_responsavel", getString(responsavel.getNomeResponsavel(), 80));
    		}
    		
    		if (!isNull(responsavel.getEndereco())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("repe_ds_endereco", getString(responsavel.getEndereco(), 80));
    		}
    		
    		if (!isNull(responsavel.getNumeroEnderecoSegurado())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("repe_nr_numero", getString(responsavel.getNumeroEnderecoSegurado(), 10));
    		}
    		
    		if (!isNull(responsavel.getDddTelefone())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("repe_nr_ddd", getString(responsavel.getDddTelefone(), 6));
    		}
    		
    		if (!isNull(responsavel.getNumeroTelefone())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("repe_nr_telefone", getString(responsavel.getNumeroTelefone(), 11));
    		}
    		
    		if (!isNull(responsavel.getBairro())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("repe_ds_bairro", getString(responsavel.getBairro(), 100));
    		}
    		
    		if (!isNull(responsavel.getDddCelular())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("repe_nr_dddcelular", getString(responsavel.getDddCelular(), 6));
    		}
    		
    		if (!isNull(responsavel.getNumeroCelular())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("repe_nr_celular", getString(responsavel.getNumeroCelular(), 11));
    		}
    		
    		if (!isNull(responsavel.getCep())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("repe_nr_cep", getString(responsavel.getCep(), 9));
    		}
    		
    		if (!isNull(responsavel.getEmail())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("repe_ds_email", getString(responsavel.getEmail(), 100));
    		}
    		
    		if (responsavel.getUf() != null && !isNull(responsavel.getUf().getId())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("repe_cd_uf", getString(responsavel.getUf().getId(), 10));
    		}
    		
    		if (responsavel.getUf() != null && !isNull(responsavel.getUf().getValue())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("repe_ds_uf", getString(responsavel.getUf().getValue(), 80));
    			
    		}
    		
    		if (responsavel.getCidade() != null && !isNull(responsavel.getCidade().getId())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("repe_cd_cidade", getString(responsavel.getCidade().getId(), 10));
    		}
    		
    		if (responsavel.getCidade() != null && !isNull(responsavel.getCidade().getValue())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("repe_ds_cidade", getString(responsavel.getCidade().getValue(), 80));
    		}
    		
    		if (!isNull(responsavel.getReceberSms())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("repe_in_recebersms", getString(responsavel.getReceberSms() == true ? "S" : "N", 1));
    		}
    		
    		if (!isNull(responsavel.getReceberEmail())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("repe_in_receberemail", getString(responsavel.getReceberEmail() == true ? "S" : "N", 1));
    		}
    		
    		//BENEFICIARIO
    		
    		if (!isNull(responsavel.getProprioSegurado())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			
    			if (responsavel.getProprioSegurado() == true ){
    				voRetorno.addField("repe_in_propriosegurado", "1");
    			} else {
    				voRetorno.addField("repe_in_propriosegurado", "0");
    			}
    			
    			if (responsavel.getOutros() != null && !isNull(responsavel.getOutros().getId())) {
					voRetorno.addField("repe_cd_outros", getString(responsavel.getOutros().getId(), 10));
	    		}
				
				if (responsavel.getOutros() != null && !isNull(responsavel.getOutros().getValue())) {
					voRetorno.addField("repe_ds_outros", getString(responsavel.getOutros().getValue(), 80));
	    		}
    			
    		}

    		if (!isNull(responsavel.getNomeBeneficiario())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("repe_nm_beneficiario", getString(responsavel.getNomeBeneficiario(), 80));
    		}
    		
    		if (!isNull(responsavel.getCpfBeneficiario())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("repe_nr_cpf", getString(responsavel.getCpfBeneficiario(), 20));
    		}
    		
    		if (!isNull(responsavel.getNaoTemContaBanco())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("repe_in_naotemconta", getString(responsavel.getNaoTemContaBanco() == true ? "S" : "N", 1));
    		}
    		
    		if (!isNull(responsavel.getCodBanco())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("repe_cd_banco", getString(responsavel.getCodBanco(), 4));
    		}
    		
    		if (!isNull(responsavel.getDescricaoBanco())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("repe_ds_banco", getString(responsavel.getDescricaoBanco(), 100));
    			
    		}
    		
    		if (!isNull(responsavel.getAgencia())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("repe_nr_agencia", getString(responsavel.getAgencia(), 5));
    		}
    		
    		if (!isNull(responsavel.getAgenciaDv())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("repe_nr_agenciadv", getString(responsavel.getAgenciaDv(), 2));
    		}
    		
    		if (!isNull(responsavel.getConta())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("repe_nr_conta", getString(responsavel.getConta(), 13));
    		}
    		
    		if (!isNull(responsavel.getContaDv())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("repe_nr_contadv", getString(responsavel.getContaDv(), 2));
    		}
    		
    		
    		if (!isNull(responsavel.getExisteOutroSeguro())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("repe_in_existeoutroseg", getString(responsavel.getExisteOutroSeguro() == true ? "S" : "N", 1));
    		}
    		
    		//OUTRA CIA
    		Vector<Short> vecCia = new Vector<Short>();
    		if (responsavel.getQualCia() != null && !isNull(responsavel.getQualCia().getId())) {
    			
    			if (voRetorno == null) voRetorno = new Vo();
    			vecCia.add(Short.parseShort(responsavel.getQualCia().getId()));
    			
    			if (responsavel.getQualCia() != null && !isNull(responsavel.getQualCia().getId())) {
					voRetorno.addField("repe_cd_qualcia", getString(responsavel.getQualCia().getId(), 10));
	    		}
				
				if (responsavel.getQualCia() != null && !isNull(responsavel.getQualCia().getValue())) {
					voRetorno.addField("repe_ds_qualcia", getString(responsavel.getQualCia().getValue(), 80));
	    		}
    		}
    		
    		if (voRetorno != null) {
    			voRetorno.addField("pesr_nr_sequencia", pesr_nr_sequencia);
    			voRetorno.addField("id_pess_cd_pessoa", id_pess_cd_pessoa);
    		}
    		
    	}
		
		return voRetorno;
	}
	

	private void converterEquipamento(Aviso aviso) {
		if (this.getEquipamentos() != null && this.getEquipamentos().size() > 0) {
    		List<ComunicadoEquipamentoComunicado> lstEquipamento = new ArrayList<ComunicadoEquipamentoComunicado>();
    		List<ComunicadoEquipamentoValorEquipamentoValor> lstEquipamentoValor = new ArrayList<ComunicadoEquipamentoValorEquipamentoValor>();
    		
    		
    		for (Equipamento equipamento : this.getEquipamentos()) {
    			ComunicadoEquipamentoComunicado equipamentoNew = new ComunicadoEquipamentoComunicado();
    			ComunicadoEquipamentoValorEquipamentoValor equipamentoValorNew = new ComunicadoEquipamentoValorEquipamentoValor();
    			
    			//Equipamentos
    			equipamentoNew.setFlagAlterado("S");		
    			
    			if (!isNull(equipamento.getItem())) {
    				equipamentoNew.setItem(Integer.parseInt(String.valueOf(equipamento.getItem())));		
        		}
    			
    			if (!isNull(equipamento.getDescricao())) {
    				equipamentoNew.setNome(equipamento.getDescricao());
        		}
    			
    			if (!isNull(equipamento.getSerieEquipamento())) {
    				equipamentoNew.setSerie(equipamento.getSerieEquipamento());
        		}
    			
    			if (!isNull(equipamento.getMarca())) {
    				equipamentoNew.setMarca(equipamento.getMarca());
        		}
    			
    			if (!isNull(equipamento.getAnoFrabicacaoEquipamento())) {
    				equipamentoNew.setAnoFabricacao(Short.parseShort(String.valueOf(equipamento.getAnoFrabicacaoEquipamento())));
        		}
    			
    			if (!isNull(equipamento.getModelo())) {
    				equipamentoNew.setModelo(equipamento.getModelo());
        		}
    			
    			//Equipamentos Valores
    			if (!isNull(equipamento.getQtde())) {
    				equipamentoValorNew.setQuantidade(Integer.parseInt(equipamento.getQtde()));
        		}
    			
    			if (!isNull(equipamento.getValor())) {
    				equipamentoValorNew.setUnitario(parseStringToBigInt(equipamento.getValor()));
        		}
    			
    			if (!isNull(equipamento.getValorEstimado())) {
    				equipamentoValorNew.setEstimado(parseStringToBigInt(equipamento.getValorEstimado()));
        		}
    			
    			
    			lstEquipamento.add(equipamentoNew);
    			lstEquipamentoValor.add(equipamentoValorNew);
    			
			}
    	
    		aviso.setComunicadoEquipamento(lstEquipamento.toArray(new ComunicadoEquipamentoComunicado[lstEquipamento.size()]));
    		aviso.setComunicadoEquipamentoValor(lstEquipamentoValor.toArray(new ComunicadoEquipamentoValorEquipamentoValor[lstEquipamentoValor.size()]));
    		
    	}
	}

	public Vector<Vo> converterEquipamentoToVector(long pesr_nr_sequencia, long id_pess_cd_pessoa) {
		
		Vector<Vo> vecRetorno = new Vector<Vo>();
		
		if (this.getEquipamentos() != null && this.getEquipamentos().size() > 0) {
    		List<ComunicadoEquipamentoComunicado> lstEquipamento = new ArrayList<ComunicadoEquipamentoComunicado>();
    		List<ComunicadoEquipamentoValorEquipamentoValor> lstEquipamentoValor = new ArrayList<ComunicadoEquipamentoValorEquipamentoValor>();
    		
    		
    		for (Equipamento equipamento : this.getEquipamentos()) {
    			
    			Vo voRetorno = null; 
    			
    			ComunicadoEquipamentoComunicado equipamentoNew = new ComunicadoEquipamentoComunicado();
    			ComunicadoEquipamentoValorEquipamentoValor equipamentoValorNew = new ComunicadoEquipamentoValorEquipamentoValor();
    			
    			//Equipamentos
    			equipamentoNew.setFlagAlterado("S");		
    			
    			if (!isNull(equipamento.getItem())) {
    				if (voRetorno == null) voRetorno = new Vo();
    				voRetorno.addField("eqpe_ds_item",getString(String.valueOf(equipamento.getItem()), 20));
        		}
    			
    			if (!isNull(equipamento.getDescricao())) {
    				if (voRetorno == null) voRetorno = new Vo();
    				voRetorno.addField("eqpe_ds_descricao",getString(equipamento.getDescricao(), 80));
        		}
    			
    			if (!isNull(equipamento.getSerieEquipamento())) {
    				if (voRetorno == null) voRetorno = new Vo();
    				voRetorno.addField("eqpe_ds_serieequipamento",getString(equipamento.getSerieEquipamento(), 80));
        		}
    			
    			if (!isNull(equipamento.getMarca())) {
    				if (voRetorno == null) voRetorno = new Vo();
    				equipamentoNew.setMarca(equipamento.getMarca());
    				voRetorno.addField("eqpe_ds_marca",getString(equipamento.getMarca(), 80));
        		}
    			
    			if (!isNull(equipamento.getAnoFrabicacaoEquipamento())) {
    				if (voRetorno == null) voRetorno = new Vo();
    				voRetorno.addField("eqpe_nr_anofrabquip",getString(String.valueOf(equipamento.getAnoFrabicacaoEquipamento()), 4));
        		}
    			
    			if (!isNull(equipamento.getModelo())) {
    				if (voRetorno == null) voRetorno = new Vo();
    				voRetorno.addField("eqpe_ds_modelo",getString(equipamento.getModelo(), 80));
        		}
    			
    			//Equipamentos Valores
    			if (!isNull(equipamento.getQtde())) {
    				if (voRetorno == null) voRetorno = new Vo();
    				voRetorno.addField("eqpe_nr_qtde",getString(equipamento.getQtde(), 9));
        		}
    			
    			if (!isNull(equipamento.getValor())) {
    				if (voRetorno == null) voRetorno = new Vo();
    				voRetorno.addField("eqpe_vl_valor",getString(equipamento.getValor(), 17));
        		}
    			
    			if (!isNull(equipamento.getValorEstimado())) {
    				if (voRetorno == null) voRetorno = new Vo();
    				voRetorno.addField("eqpe_vl_valorestimado",getString(equipamento.getValorEstimado(), 40));
        		}
    			
    			if (voRetorno != null ) {
        			voRetorno.addField("pesr_nr_sequencia", pesr_nr_sequencia);
        			voRetorno.addField("id_pess_cd_pessoa", id_pess_cd_pessoa);
    				vecRetorno.add(voRetorno);	
    			}
    			
			}
    	}
		return vecRetorno;
	}
	
	
	private BigDecimal parseStringToBigInt(Object valor) {
    	try {
    		if (valor == null ) {
        		return new BigDecimal("0");
        	} else {
        		if (String.valueOf(valor).length() == 0) {
        			return new BigDecimal("0");
        		} else {
        			String novoValor = String.valueOf(valor);
        			novoValor = novoValor.replaceAll(Pattern.quote("."), "");
        			novoValor = novoValor.replaceAll(Pattern.quote(","), ".");
        			return new BigDecimal(novoValor); 
        		}
        	}	
		} catch (Exception e) {
			return new BigDecimal("0");
		}
    }

	private void converterSinistro(Aviso aviso) {
		if (this.getSinistro() != null ) {
    		Sinistro sinistro = this.getSinistro();
    		
    		if (!isNull(sinistro.getEndNaoCorreto())) {
    			aviso.setFlagAlteracaoLocal(sinistro.getEndNaoCorreto() == true ? "S" : "N");		
    		}
    		
    		if (!isNull(sinistro.getData())) {
    			aviso.setDataOcorrencia(new Datetime(sinistro.getData(), "DD/MM/YYYY").toSqlDate());		
    		}
    		
    		if (!isNull(sinistro.getHora())) {
    			aviso.setHoraOcorrencia(sinistro.getHora());		
    		}

    		if (!isNull(sinistro.getCep())) {
    			aviso.setCepContato(Integer.parseInt(somenteNumeros(sinistro.getCep())));		
    		}
    		
    		if (!isNull(sinistro.getEndereco())) {
    			aviso.setLogradouroContato(sinistro.getEndereco());		
    		}
    		
    		if (!isNull(sinistro.getNumero())) {
    			aviso.setNumeroContato(sinistro.getNumero());		
    		}
    		
    		if (!isNull(sinistro.getComplemento())) {
    			aviso.setComplementoContato(sinistro.getComplemento());		
    		}
    		
    		if (sinistro.getUf() != null && !isNull(sinistro.getUf().getId())) {
    			aviso.setUfContato(sinistro.getUf().getId());		
    		}
    		
    		if (sinistro.getCidade() != null && !isNull(sinistro.getCidade().getId())) {
    			aviso.setCidadeContato(sinistro.getUf().getId());		
    		}
    		
    		if (!isNull(sinistro.getBairro())) {
    			aviso.setBairroContato(sinistro.getBairro());		
    		}
    		
    		if (sinistro.getCausa() != null && !isNull(sinistro.getCausa().getId())) {
    			aviso.setCausaSinistro(sinistro.getCausa().getValue());		
    			aviso.setCodigoCausa(Integer.parseInt(sinistro.getCausa().getId()));
    		}
    		
    		if (sinistro.getNatureza() != null && !isNull(sinistro.getNatureza().getId())) {
    			aviso.setNaturezaSinistro(Integer.parseInt(sinistro.getNatureza().getId()));		
    		}
    		
    		if (!isNull(sinistro.getDescricao())) {
    			aviso.setDescricaoSinistro(sinistro.getDescricao());		
    		}
    		
    		if (!isNull(sinistro.getHouveCorpoBombeiro())) {
    			aviso.setParticipanteBombeiro(sinistro.getHouveCorpoBombeiro() == true ? "S" : "N");		
    		}
    		
    		if (!isNull(sinistro.getProvidenciouBo())) {
    			aviso.setBoletoOcorrencia(sinistro.getProvidenciouBo() == true ? "S" : "N");		
    		}
    		
    		if (!isNull(sinistro.getMoradiaHabitavel())) {
    			ComunicadoResidencial comResidencial = new ComunicadoResidencial();
    			comResidencial.setItem(1);
    			comResidencial.setMoradiaHabitacao(sinistro.getMoradiaHabitavel() == true ? "S" : "N");
    			aviso.setComunicadoResidencial(comResidencial);
    		}
    	}
	}

	public Vo converterSinistroToVo(long pesr_nr_sequencia, long id_pess_cd_pessoa) {
		
		Vo voRetorno = null;
		
		if (this.getSinistro() != null ) {
    		Sinistro sinistro = this.getSinistro();
    		
    		if (!isNull(sinistro.getEndNaoCorreto())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("sipe_in_endnaocorretor", getString(sinistro.getEndNaoCorreto() == true ? "S" : "N", 1));
    		}
    		
    		if (!isNull(sinistro.getData())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("sipe_ds_data", getString(new Datetime(sinistro.getData(), "DD/MM/YYYY").toString(), 10));
    		}
    		
    		if (!isNull(sinistro.getHora())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("sipe_ds_hora", getString(sinistro.getHora(), 5));
    		}

    		if (!isNull(sinistro.getCep())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("sipe_nr_cep", getString(sinistro.getCep(), 9));
    		}
    		
    		if (!isNull(sinistro.getEndereco())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("sipe_ds_endereco", getString(sinistro.getEndereco(), 80));
    		}
    		
    		if (!isNull(sinistro.getNumero())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("sipe_nr_numero", getString(sinistro.getNumero(), 10));
    		}
    		
    		if (!isNull(sinistro.getComplemento())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("sipe_ds_complemento", getString(sinistro.getComplemento(), 80));
    		}
    		
    		if (sinistro.getUf() != null && !isNull(sinistro.getUf().getId())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("sipe_cd_uf", getString(sinistro.getUf().getId(), 10));
    		}
    		
    		if (sinistro.getUf() != null && !isNull(sinistro.getUf().getValue())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("sipe_ds_uf", getString(sinistro.getUf().getValue(), 50));
    		}
    		
    		if (sinistro.getCidade() != null && !isNull(sinistro.getCidade().getId())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("sipe_cd_cidade", getString(sinistro.getCidade().getId(), 10));
    		}
    		
    		if (sinistro.getCidade() != null && !isNull(sinistro.getCidade().getValue())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("sipe_ds_cidade", getString(sinistro.getCidade().getValue(), 80));
    		}
    		
    		if (!isNull(sinistro.getBairro())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("sipe_ds_bairro", getString(sinistro.getBairro(), 80));
    		}
    		
    		if (sinistro.getCausa() != null && !isNull(sinistro.getCausa().getId())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("sipe_cd_causa", getString(sinistro.getCausa().getId(), 10));
    		}
    		
    		if (sinistro.getCausa() != null && !isNull(sinistro.getCausa().getValue())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("sipe_ds_causa", getString(sinistro.getCausa().getValue(), 80));
    		}
    		
    		if (sinistro.getNatureza() != null && !isNull(sinistro.getNatureza().getId())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("sipe_cd_natureza", getString(sinistro.getNatureza().getId(), 10));
    		}
    		
    		if (sinistro.getNatureza() != null && !isNull(sinistro.getNatureza().getValue())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("sipe_ds_natureza", getString(sinistro.getNatureza().getValue(), 80));
    		}
    		
    		if (!isNull(sinistro.getDescricao())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("sipe_ds_descricao", getString(sinistro.getDescricao(), 400));
    		}
    		
    		if (!isNull(sinistro.getHouveCorpoBombeiro())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("sipe_in_houvecorpbomb", getString(sinistro.getHouveCorpoBombeiro() == true ? "S" : "N", 1));
    		}
    		
    		if (!isNull(sinistro.getProvidenciouBo())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("sipe_in_providencioubo", getString(sinistro.getProvidenciouBo() == true ? "S" : "N", 1));
    		}
    		
    		if (!isNull(sinistro.getMoradiaHabitavel())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("sipe_in_moradiahab", getString(sinistro.getMoradiaHabitavel() == true ? "S" : "N", 1));
    		}
    		
    		if (voRetorno != null) {
    			voRetorno.addField("pesr_nr_sequencia", pesr_nr_sequencia);
    			voRetorno.addField("id_pess_cd_pessoa", id_pess_cd_pessoa);	
    		}
    		
    	}
		
		return voRetorno;
		
	}
	
	
	private void converterComunicado(Aviso aviso) {
		if (this.getComunicado() != null ) {
    		Comunicado comunicado = this.getComunicado();
    		
    		if (!isNull(comunicado.getContato())) {
    			aviso.setNomeContato(comunicado.getContato());		
    		}
    		
    		if (!isNull(comunicado.getDdd())) {
    			aviso.setDddContato(Integer.parseInt(comunicado.getDdd()));		
    		}
    		
    		if (!isNull(comunicado.getTelefone())) {
    			aviso.setTelefoneContato(Long.parseLong(comunicado.getTelefone()));		
    		}
    		
    		if (comunicado.getTipoRelacao() != null && !isNull(comunicado.getTipoRelacao().getId())) {
    			aviso.setRelacaoContato(new Short(comunicado.getTipoRelacao().getId()));		
    		}
    		
    		if (!isNull(comunicado.getCodigoApolice())) {
    			aviso.setNumeroApolice(Integer.parseInt(comunicado.getCodigoApolice()));
    		}
    		
    		if (!isNull(comunicado.getNomeSegurado())) {
    			aviso.setNomeSegurado(comunicado.getNomeSegurado());		
    		}
    		
    		if (!isNull(comunicado.getCodigoCia())) {
    			aviso.setCodigoCia(new Short(comunicado.getCodigoCia()));		
    		}
    		
    		if (!isNull(comunicado.getCodigoSucursal())) {
    			aviso.setCodigoSucursal(new Short(comunicado.getCodigoSucursal()));		
    		}
    		
    		if (!isNull(comunicado.getCodigoRamo())) {
    			aviso.setCodigoRamo(new Short(comunicado.getCodigoRamo()));		
    		}
    	}
	}
	
	public Vo converterComunicadoToVo(long pesr_nr_sequencia, long id_pess_cd_pessoa) {
		Vo voRetorno = null;
		if (this.getComunicado() != null ) {
    		Comunicado comunicado = this.getComunicado();
    		
			if (!isNull(comunicado.getCodigoProduto())) {
				if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("cosi_cd_produto", getString(comunicado.getCodigoProduto(), 10));
    		}
			
			if (!isNull(comunicado.getDescricaoProduto())) {
				if (voRetorno == null) voRetorno = new Vo();
				voRetorno.addField("cosi_ds_produto",  getString(comunicado.getDescricaoProduto(), 80));
    		}
			
			if (!isNull(comunicado.getDataOcorrenciaIdentificacao())) {
				if (voRetorno == null) voRetorno = new Vo();
				voRetorno.addField("cosi_ds_dataocorrencia",  getString(comunicado.getDataOcorrenciaIdentificacao(), 10)); 
    		}
			
			if (!isNull(comunicado.getHoraOcorrenciaIdentificacao())) {
				if (voRetorno == null) voRetorno = new Vo();
				voRetorno.addField("cosi_ds_horaocorrencia",  getString(comunicado.getHoraOcorrenciaIdentificacao(), 5)); 
    		}
			
    		if (!isNull(comunicado.getContato())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("cosi_ds_contato",  getString(comunicado.getContato(), 50));
    		}
    		
    		if (!isNull(comunicado.getDdd())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("cosi_nr_ddd",  getString(comunicado.getDdd(), 2));
    		}
    		
    		if (!isNull(comunicado.getTelefone())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("cosi_nr_telefone",  getString(comunicado.getTelefone(), 8));
    		}
    		
    		if (comunicado.getTipoRelacao() != null && !isNull(comunicado.getTipoRelacao().getId())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("cosi_cd_tiporelacao",  getString(comunicado.getTipoRelacao().getId(), 10));
    		}
    		
    		if (comunicado.getTipoRelacao() != null && !isNull(comunicado.getTipoRelacao().getValue())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("cosi_ds_tiporelacao",  getString(comunicado.getTipoRelacao().getValue(), 255));
    		}
    		
    		if (!isNull(comunicado.getApolice())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("cosi_nr_apolice",  getString(comunicado.getApolice(), 13));
    		}
    		
    		if (!isNull(comunicado.getCodCorretor())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("cosi_cd_corretor",  getString(comunicado.getCodCorretor(), 10));
    		}
    		
    		if (!isNull(comunicado.getNomeCorretor())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("cosi_nm_corretor",  getString(comunicado.getNomeCorretor(), 80));
    		}
    		
    		if (!isNull(comunicado.getCodigoApolice())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("cosi_cd_apolice",  getString(comunicado.getCodigoApolice(), 10));
    		}
    		
    		if (!isNull(comunicado.getNomeSegurado())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("cosi_nm_segurado",  getString(comunicado.getNomeSegurado(), 80));
    		}
    		
    		if (!isNull(comunicado.getCodigoCia())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("cosi_cd_cia",  getString(comunicado.getCodigoCia(), 10));
    		}
    		
    		if (!isNull(comunicado.getCodigoSucursal())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("cosi_cd_sucursal", getString(comunicado.getCodigoSucursal(), 10));
    		}
    		
    		if (!isNull(comunicado.getCodigoRamo())) {
    			if (voRetorno == null) voRetorno = new Vo();
    			voRetorno.addField("cosi_cd_ramo",  getString(comunicado.getCodigoRamo(), 10));
    		}
    		
    		if (voRetorno != null) {
    			voRetorno.addField("pesr_nr_sequencia", pesr_nr_sequencia);
    			voRetorno.addField("id_pess_cd_pessoa", id_pess_cd_pessoa);	
    		}
    	}
		
		return voRetorno;
	}
	
 
	public String somenteNumeros(String valor) {
		String retorno = "";
		try {
			// Apenas Número
			Pattern pattern = Pattern.compile("[0-9]");
			// buscar na variavel valor
			Matcher matcher = pattern.matcher(valor);
			// Procurando por todos caracteres
			while (matcher.find()) {
				retorno += matcher.group();
			}
		} catch (Exception e) {
			Log.log(this.getClass(), Log.ERRORPLUS, "Erro no metodo somenteNumeros()", e);
		}

		return retorno;
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
