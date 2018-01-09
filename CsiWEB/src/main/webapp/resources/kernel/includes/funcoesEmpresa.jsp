<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<script language="JavaScript">
	
	var idLinha = '';
	var idAsn1CdAssuntoNivel1 = '';
	var idAsn2CdAssuntoNivel2 = '';
	
	function atualizarCombosTelaEspec() {
		//implementado no arquivo especifico
		//atualizaCmbLinha();
		
		var campoAux = window.top.principal.pessoa.dadosPessoa.pessoaForm['csCdtbPessoaespecPeesVo.campoAux4'].value.split(";");

		if(campoAux != null) {
			if(campoAux.length > 1) {
				idLinha = campoAux[0];
				idAsn1CdAssuntoNivel1 = campoAux[1];
				idAsn2CdAssuntoNivel2 = campoAux[2];
				
				//Posiciona os combos de produto e plano da tela de manifestação c/ o produto da pessoa identificada
				carregaProdAssuntoManif();
				//Posiciona os combos de produto e plano da tela de informação c/ o produto da pessoa identificada
				carregaProdAssuntoInfo();
				
				//Posiciona os combos de produto e plano da tela de manifestação c/ o produto da pessoa identificada
				//Combo Produto Assunto - Manifestação
				//window.top.principal.manifestacao.cmbLinha.manifestacaoForm["csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.csCdtbProdutoAssuntoPrasVo.csCdtbLinhaLinhVo.idLinhCdLinha"].value = idLinha;
				//Combo Plano - Manifestação
				//window.top.principal.manifestacao.cmbProdAssunto.location.href="Manifestacao.do?acao=showAll&tela=cmbProdAssunto&csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.csCdtbProdutoAssuntoPrasVo.idAsnCdAssuntoNivel="+idAsn1CdAssuntoNivel1+"@"+idAsn2CdAssuntoNivel2 +"&csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.csCdtbProdutoAssuntoPrasVo.csCdtbLinhaLinhVo.idLinhCdLinha="+idLinha+'&idEmprCdEmpresa='+window.top.superior.ifrmCmbEmpresa.empresaForm.csCdtbEmpresaEmpr.value;

				//Posiciona os combos de produto e plano da tela de informação c/ o produto da pessoa identificada
				//Combo Produto Assunto - Informação
				//window.top.principal.informacao.buscaInformacao.CmbLinhaInformacao.showInfoComboForm.idLinhCdLinha.value = idLinha;
				//Combo Plano - Informação	
				//window.top.principal.informacao.buscaInformacao.CmbAssuntoInformacao.location.href="ShowInfoCombo.do?acao=showAll&tela=assuntoInformacao&idLinhCdLinha="+idLinha+"&idAsnCdAssuntonivel="+idAsn1CdAssuntoNivel1+"@"+idAsn2CdAssuntoNivel2+"&idEmprCdEmpresa="+window.top.superior.ifrmCmbEmpresa.empresaForm.csCdtbEmpresaEmpr.value;
			}
		}
	}
	
	
	function carregaProdAssuntoManif() {
		if(window.top.principal.manifestacao.cmbLinha.document.readyState == 'complete') {
			window.top.principal.manifestacao.cmbLinha.manifestacaoForm["csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.csCdtbProdutoAssuntoPrasVo.csCdtbLinhaLinhVo.idLinhCdLinha"].value = idLinha;
			carregaPlanoManif();
		} else {
			setTimeout("carregaProdAssuntoManif();", 500);
		}
	}
	
	function carregaPlanoManif() {
		if(window.top.principal.manifestacao.cmbProdAssunto.document.readyState == 'complete') {
			window.top.principal.manifestacao.cmbProdAssunto.location.href="Manifestacao.do?acao=showAll&tela=cmbProdAssunto&csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.csCdtbProdutoAssuntoPrasVo.idAsnCdAssuntoNivel="+idAsn1CdAssuntoNivel1+"@"+idAsn2CdAssuntoNivel2 +"&csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.csCdtbProdutoAssuntoPrasVo.csCdtbLinhaLinhVo.idLinhCdLinha="+idLinha+'&idEmprCdEmpresa='+window.top.superior.ifrmCmbEmpresa.empresaForm.csCdtbEmpresaEmpr.value;
		} else {
			setTimeout("carregaPlanoManif();", 500);
		}
	}
	
	function carregaProdAssuntoInfo() {
		if(window.top.principal.informacao.buscaInformacao.CmbLinhaInformacao.document.readyState == 'complete') {
			window.top.principal.informacao.buscaInformacao.CmbLinhaInformacao.showInfoComboForm.idLinhCdLinha.value = idLinha;
			carregaPlanoInfo();
		} else {
			setTimeout("carregaProdAssuntoInfo();", 500);
		}
	}
	
	function carregaPlanoInfo() {
		if(window.top.principal.informacao.buscaInformacao.CmbAssuntoInformacao.document.readyState == 'complete') {
			window.top.principal.informacao.buscaInformacao.CmbAssuntoInformacao.location.href="ShowInfoCombo.do?acao=showAll&tela=assuntoInformacao&idLinhCdLinha="+idLinha+"&idAsnCdAssuntonivel="+idAsn1CdAssuntoNivel1+"@"+idAsn2CdAssuntoNivel2+"&idEmprCdEmpresa="+window.top.superior.ifrmCmbEmpresa.empresaForm.csCdtbEmpresaEmpr.value;
		} else {
			setTimeout("carregaPlanoInfo();", 500);
		}
		
	}
</script>