package br.com.plusoft.csi.bradescoaf.crm.business;

import java.util.Vector;

import br.com.plusoft.csi.crm.helper.PlusCepHelper;
import br.com.plusoft.fw.entity.Vo;
import br.com.plusoft.fw.log.Log;

public class PesquisaSucursalBusiness {

	long idEmprCdEmpresa;
	
	public PesquisaSucursalBusiness(long idEmprCdEmpresa) {
		this.idEmprCdEmpresa = idEmprCdEmpresa;
	}
	
	
	public Vector<?> getUf() throws Exception{
		PlusCepHelper plusCepHelper = new PlusCepHelper();
		Vector<?> vecUF = null;
		vecUF = plusCepHelper.findAllEstado();
		return vecUF;
	}
	
	
	public Vector<?> carregarMunicipio(String estado, String municipio) throws Exception{
		PlusCepHelper plusCepHelper = new PlusCepHelper();
		Vector<?> vecCidade = null;
		
		if ( (!"".equals(estado)) && (!"".equals(municipio))) {
			vecCidade = plusCepHelper.findMunicipioByEstadoMunicipioDesc(estado, "%" + municipio.toUpperCase() + "%");
		} else if ("".equals(municipio)) {
			vecCidade = plusCepHelper.findMunicipioByEstado(estado);
		}
		
		return vecCidade;
	}
	
	public Vo carregarSucursal(String estado, String municipio) throws Exception {
		Vo voRetorno = null;
		WebServiceListarSucursalBusiness business = new WebServiceListarSucursalBusiness(this.idEmprCdEmpresa);
		try {
			voRetorno =  business.getSucursais(estado, municipio);
		} catch (Exception e) {
			Log.log(this.getClass(), Log.ERRORPLUS, 
					"Ocorreu um erro ao tentar recuperar a sucursal. Erro: " + e.getMessage() , e);
		}
		
		return voRetorno;
	}
	
	public Vector<Vo> recuperarSucursal (String estado, String municipio) {
		Vector<Vo> vecRetorno = new Vector<Vo>();

		Vo vo1 = new Vo();
		vo1.addField("nome", "RIO DE JANEIRO");
		vo1.addField("codigo", "00122214");
		vo1.addField("endereco", "RUA NEBRASKA");
		vo1.addField("numero", "443");
		vo1.addField("complemento", "6º ANDAR");
		vo1.addField("cep", "04515000");
		vo1.addField("bairro", "BROKLIN NOVO");
		vo1.addField("cidade", "SÃO PAULO");
		vo1.addField("telefone", "11-5091-2777");
		vecRetorno.add(vo1);
		
		Vo vo2 = new Vo();
		vo2.addField("nome", "SÃO PAULO");
		vo2.addField("codigo", "114114455");
		vo2.addField("endereco", "RUA BERRINI");
		vo2.addField("numero", "204");
		vo2.addField("complemento", "10º Andar");
		vo2.addField("cep", "04841256");
		vo2.addField("bairro", "ITAIM BIBI");
		vo2.addField("cidade", "São Paulo");
		vo2.addField("telefone", "11-3048-5763");
		vecRetorno.add(vo2);
		
		return vecRetorno;
	}
	
	
}
