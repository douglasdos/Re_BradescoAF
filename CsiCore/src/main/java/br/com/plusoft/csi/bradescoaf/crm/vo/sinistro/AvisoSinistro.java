
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
		aviso.setValorPrevisto(new BigDecimal("0"));
		
		DadosEquipamentos dadosEquipamentos = new DadosEquipamentos();
		dadosEquipamentos.setValorNotaFiscal(new BigDecimal("0"));
		aviso.setDadosEquipamentos(dadosEquipamentos);
		
		if ( aviso.getComunicadoResidencial() != null) {
			aviso.getComunicadoResidencial().setValorDanos(new BigDecimal("0"));
		}
		
		ComunicadoEmpresa comunicadoEmpresa = new ComunicadoEmpresa();
		comunicadoEmpresa.setValorLucroCesante(new BigDecimal("0"));
		comunicadoEmpresa.setValorRiscoDano(new BigDecimal("0"));
		aviso.setComunicadoEmpresa(comunicadoEmpresa);
		
		try {
			aviso.setDataComunicado(new SystemDataBancoHelper().getDataBanco());
		} catch (Exception e) {}
		
		aviso.setCanalComunicacao(new Short("1"));
		aviso.setTipoUsuario(new Short("1"));
		aviso.setTipoSinistro(new Short("2"));
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
    			
    			lstDeltahe.add(detalheNew);
			}
    	
    		aviso.setDetalheSinistro(lstDeltahe.toArray(new DetalheSinistroExtensaoSinistro[lstDeltahe.size()]));
    	}
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
        		}
    			
    			lstTerceiro.add(terceiroNew);
    			
			}
    	
    		aviso.setComunicadoTerceiros(lstTerceiro.toArray(new ComunicadoTerceirosTerceiro[lstTerceiro.size()]));
    	}
	}

	private void converterResponsavel(Aviso aviso) {
		if (this.getResponsavel() != null ) {
    		Responsavel responsavel = this.getResponsavel();
    		
    		if (!isNull(responsavel.getNomeResponsavel())) {
    			aviso.setNomeResponsavel(responsavel.getNomeResponsavel());		
    		}
    		
    		if (!isNull(responsavel.getEndereco())) {
    			aviso.setLogradouro(responsavel.getEndereco());		
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
    			aviso.setCidade(responsavel.getUf().getId());		
    		}
    		
    		if (!isNull(responsavel.getReceberSms())) {
    			aviso.setCanalSms(responsavel.getReceberSms() == true ? "S" : "N");		
    		}
    		
    		if (!isNull(responsavel.getReceberEmail())) {
    			aviso.setCanalEmail(responsavel.getReceberEmail() == true ? "S" : "N");		
    		}
    		
    		//BENEFICIARIO
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
    			aviso.setParticipanteBombeiro(sinistro.getProvidenciouBo() == true ? "S" : "N");		
    		}
    		
    		if (!isNull(sinistro.getProvidenciouBo())) {
    			ComunicadoResidencial comResidencial = new ComunicadoResidencial();
    			comResidencial.setMoradiaHabitacao(sinistro.getProvidenciouBo() == true ? "S" : "N");
    			aviso.setComunicadoResidencial(comResidencial);		
    		}
    	}
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
    		
    		if (!isNull(comunicado.getApolice())) {
    			aviso.setNumeroApolice(Integer.parseInt(comunicado.getApolice()));
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
 
    	public String somenteNumeros(String valor) {
		String retorno = "";
		try {
			// Apenas N�mero
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
    
}
