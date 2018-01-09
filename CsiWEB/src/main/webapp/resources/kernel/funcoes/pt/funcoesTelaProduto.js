//Arquivo para funcao javaScript especificas do cliente

function desabiliaCampos_TelaProduto(){
	//funcao implementada no arquivo especifico do cliente
}

function validaObrigatorio_incluirProduto(){

	if (document.forms[0].reloInAnalise.checked){
		if (document.forms[0].cmbLaboratorio.produtoLoteForm.cmbIdFabrCdLaboratorio.value == ""){
			alert('Selecione o laboratorio para analise.');
			return false;
		}
	}

	return true;
	
}

function executaValidacaoPadrao(){
	return true;
}

function preencheDestinoProduto(){
	var idDeprCdDestinoproduto = infoLote.ifrmCmbDestino.produtoLoteForm['csCdtbDestinoprodutoDeprVo.idDeprCdDestinoproduto'].value;
	return idDeprCdDestinoproduto;
}

function habilitaLaboratorio(){

	if (infoLote.cmbLaboratorio.document.readyState != 'complete')
		setTimeout("habilitaLaboratorio()",100);
	else{	
		if (infoLote.produtoLoteForm.reloInAnalise.checked){
			infoLote.cmbLaboratorio.produtoLoteForm.cmbIdFabrCdLaboratorio.disabled = false;
			if (infoLote.cmbLaboratorio.produtoLoteForm.cmbIdFabrCdLaboratorio.length == 2){
				infoLote.cmbLaboratorio.produtoLoteForm.cmbIdFabrCdLaboratorio[1].selected = true;
			}
		}else{
			infoLote.cmbLaboratorio.produtoLoteForm.cmbIdFabrCdLaboratorio.value = "";	
			infoLote.cmbLaboratorio.produtoLoteForm.cmbIdFabrCdLaboratorio.disabled = true;
		}
	}		
}

function onclick_reloInNaoRessarcir(){
	//funcao implementada no arquivo especifico do cliente
}

function onclick_TipoRessarcimento(tipo){
	//funcao implementada no arquivo especifico do cliente
}

function validaLote(){
	//funcao implementada no arquivo especifico do cliente
}

function trataDataValidade(prodVencido){
	//fun??o implementada no arquivo espec
}

