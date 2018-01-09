//Arquivo para funcao javaScript especificas do cliente

function desabiliaCampos_TelaProduto(){
	//funcao implementada no arquivo especifico do cliente
}

function validaObrigatorio_incluirProduto(){

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


function carregarProdutoAssuntoRess(){	
	ajax = new ConsultaBanco("","/csicrm/CarregarProdutoAssunto.do");	
	ajax.addField("idLinhCdLinha", document.forms[1].idLinhCdLinhaRess.value);
	ajax.addField("idAsn1CdAssuntoNivel1", document.forms[1].idAsnCdAssuntoNivelRess.value);
	
	if(document.forms[1].idAsn2CdAssuntoNivel2Ress != undefined){
		ajax.addField("idAsn2CdAssuntoNivel2", document.forms[1].idAsn2CdAssuntoNivel2Ress.value);
	}

	ajax.addField("prasInDescontinuado", "N");		
	
	ajax.executarConsulta(carregamentoProdutoRessOK, false, true);
}

function carregamentoProdutoRessOK(ajax){
	ajax.popularCombo(document.getElementById("produtoAssuntoRess"), "csCdtbAssuntoNivel1Asn1Vo.idAsn1CdAssuntoNivel1", "prasDsProdutoAssunto", idAsn1, true, "");
	idAsn1 = '';
	carregarVariedadeRess();
	//alert(ajax.getXmlNodeRetorno());
	//alert(xmlMicoxArvore(ajax.getXmlNodeRetorno(), '       '));
}

function carregaComboDadosReembolso(){
	ajax = new ConsultaBanco("br/com/plusoft/csi/adm/dao/xml/espec/X.xml","/csicrm/CarregarComboDadosReembolso.do");
	ajax.addField('idChamCdChamado', document.forms[0].idChamCdChamado.value);
	ajax.addField('maniNrSequencia', document.forms[0].maniNrSequencia.value);
	ajax.addField('idAsn1CdAssuntoNivel1Mani', document.forms[0].idAsn1CdAssuntoNivel1Mani.value);
	ajax.addField('idAsn2CdAssuntoNivel2Mani', document.forms[0].idAsn2CdAssuntoNivel2Mani.value);
	ajax.addField('reemNrSequencia', document.forms[1].reemNrSequencia.value==''?'0':document.forms[1].reemNrSequencia.value);


	if(document.forms[1].idForeCdFormareemb.value != ''){
		formaRess = document.getElementById('foreInTipoInfComplemento' + (document.forms[1].idForeCdFormareemb.selectedIndex - 1)).value;
		ajax.addField('idForeCdFormareemb', formaRess);
	}else{
		ajax.addField('idForeCdFormareemb', '');
	}
	
	ajax.addField('remaDsLogradouro', document.forms[1].remaDsLogradouro.value);
	ajax.addField('remaDsNumero', document.forms[1].remaDsNumero.value);
	ajax.addField('remaDsComplemento', document.forms[1].remaDsComplemento.value);
	ajax.addField('remaDsReferencia', document.forms[1].remaDsReferencia.value);
	ajax.addField('remaDsBairro', document.forms[1].remaDsBairro.value);
	ajax.addField('remaDsCep', document.forms[1].remaDsCep.value);
	ajax.addField('remaDsMunicipio', document.forms[1].remaDsMunicipio.value);
	ajax.addField('remaDsUf', document.forms[1].remaDsUf.value);
	ajax.addField('idBancCdBanco', document.forms[1].idBancCdBanco.value);
	ajax.addField('remaDsAgencia', document.forms[1].remaDsAgencia.value);
	ajax.addField('remaDsContacorrente', document.forms[1].remaDsContacorrente.value);
	ajax.addField('remaNmTitular', document.forms[1].remaNmTitular.value);
	ajax.addField('remaDsRg', document.forms[1].remaDsRg.value);
	ajax.addField('remaDsCpf', document.forms[1].remaDsCpf.value);
	ajax.addField('bancDsBanco', document.forms[1].bancDsBanco.value);	
	ajax.executarConsulta(carregamentoComboDadosOK, false, true);
	
}

function salvarReembolso(){
	
	if(!validaReembolso()){
		return false;
	}
		
	ajax = new ConsultaBanco("br/com/plusoft/csi/adm/dao/xml/espec/X.xml","/csicrm/SalvarReembolso.do");

	ajax.addField('idChamCdChamado', document.forms[0].idChamCdChamado.value);
	ajax.addField('maniNrSequencia', document.forms[0].maniNrSequencia.value);
	ajax.addField('idAsn1CdAssuntoNivel1Mani', document.forms[0].idAsn1CdAssuntoNivel1Mani.value);
	ajax.addField('idAsn2CdAssuntoNivel2Mani', document.forms[0].idAsn2CdAssuntoNivel2Mani.value);
	ajax.addField('reemNrSequencia', document.forms[1].reemNrSequencia.value==''?'0':document.forms[1].reemNrSequencia.value);
	ajax.addField('idForeCdFormareemb', document.forms[1].idForeCdFormareemb.value);
	ajax.addField('remaInRepor', document.forms[1].remaInRepor.checked?"S":"N");
	ajax.addField('remaInTroca', document.forms[1].remaInTroca.checked?"S":"N");
	ajax.addField('remaInReembolso', document.forms[1].remaInReembolso.checked?"S":"N");	

	
	ajax.addField('remaDsLogradouro', document.forms[1].remaDsLogradouro.value);
	ajax.addField('remaDsNumero', document.forms[1].remaDsNumero.value);
	ajax.addField('remaDsComplemento', document.forms[1].remaDsComplemento.value);
	ajax.addField('remaDsReferencia', document.forms[1].remaDsReferencia.value);
	ajax.addField('remaDsBairro', document.forms[1].remaDsBairro.value);
	ajax.addField('remaDsCep', document.forms[1].remaDsCep.value);
	ajax.addField('remaDsMunicipio', document.forms[1].remaDsMunicipio.value);
	ajax.addField('remaDsUf', document.forms[1].remaDsUf.value);
	ajax.addField('idBancCdBanco', document.forms[1].idBancCdBanco.value);
	ajax.addField('remaDsAgencia', document.forms[1].remaDsAgencia.value);
	ajax.addField('remaDsContacorrente', document.forms[1].remaDsContacorrente.value);
	ajax.addField('remaNmTitular', document.forms[1].remaNmTitular.value);
	ajax.addField('remaDsRg', document.forms[1].remaDsRg.value);
	ajax.addField('remaDsCpf', document.forms[1].remaDsCpf.value);
	ajax.addField('bancDsBanco', document.forms[1].bancDsBanco.value);
	ajax.addField('reemVlReembolso', document.forms[1].reemVlReembolso.value);
	
	ajax.executarConsulta(gravacaoReembolsoOK, false, true);
}

function gravacaoReembolsoOK(ajax){

	rs = ajax.getRecordset();

	while(rs.next()){
		document.forms[1].reemNrSequencia.value = rs.get('reemNrSequencia');		
	}

	if(ajax.getMessage() != ''){
		alert(ajax.getMessage());
	}
	
	atualizarValoresReembolso();
	
}

function atualizarValoresReembolso(){
	ajax = new ConsultaBanco("br/com/plusoft/csi/adm/dao/xml/espec/X.xml","/csicrm/AtualizarValoresReembolso.do");

	ajax.addField('idChamCdChamado', document.forms[0].idChamCdChamado.value);
	ajax.addField('maniNrSequencia', document.forms[0].maniNrSequencia.value);
	ajax.addField('idAsn1CdAssuntoNivel1Mani', document.forms[0].idAsn1CdAssuntoNivel1Mani.value);
	ajax.addField('idAsn2CdAssuntoNivel2Mani', document.forms[0].idAsn2CdAssuntoNivel2Mani.value);
	ajax.addField('reemNrSequencia', document.forms[1].reemNrSequencia.value==''?'0':document.forms[1].reemNrSequencia.value);
	
	
	ajax.executarConsulta(atualizacaoValoresOk, false, true);
}

function atualizacaoValoresOk(ajax){

	rs = ajax.getRecordset();

	while(rs.next()){
		document.forms[1].txtVlARessarcir.value = rs.get('vlaressarcir');
		document.forms[1].txtVlEmProduto.value = rs.get('vlemproduto');
		document.forms[1].txtVlEmDinheiro.value = rs.get('vlemdinheiro');
		document.forms[1].txtVlSaldo.value = rs.get('saldo');
		
		if(rs.get('negativo') == 'S')
			document.forms[1].txtVlSaldo.style.color = "#FF0000";
		else
			document.forms[1].txtVlSaldo.style.color = "#000000";
	}

	if(ajax.getMessage() != ''){
		alert(ajax.getMessage());
	}
	
}

function carregarLotesReincidentes(){	
	ajax = new ConsultaBanco("br/com/plusoft/csi/adm/dao/xml/espec/X.xml","/csicrm/ObterListaReincidencias.do");


	ajax.addField('idChamCdChamado', document.forms[0].idChamCdChamado.value);
	ajax.addField('maniNrSequencia', document.forms[0].maniNrSequencia.value);
	ajax.addField('idAsn1CdAssuntoNivel1Mani', document.forms[0].idAsn1CdAssuntoNivel1Mani.value);
	ajax.addField('idAsn2CdAssuntoNivel2Mani', document.forms[0].idAsn2CdAssuntoNivel2Mani.value);	
	
	ajax.executarConsulta(carregamentoLotesReincidentesOK, false, true);
}

function carregamentoLotesReincidentesOK(ajax){
	rs = ajax.getRecordset();

	var lotes = '';
	
	while(rs.next()){
		
		if(lotes.length > 0)
			lotes += "\n";
		
		lotes += rs.get('reloDsLote');
		lotes += "\t" + rs.get('reloNrSequencia');
		
	}
	
	document.forms[0].lotesReincidentes.value = lotes;

	if(ajax.getMessage() != ''){
		alert(ajax.getMessage());
	}
	
}

function removerReembolso(){
	
	if (document.forms[1].reemNrSequencia.value == "" || document.forms[1].reemNrSequencia.value == "0")
		return false;

	if (!confirm("Deseja excluir esse Reembolso?"))
		return false;

	ajax = new ConsultaBanco("br/com/plusoft/csi/adm/dao/xml/espec/X.xml","/csicrm/RemoverReembolso.do");

	ajax.addField('idChamCdChamado', document.forms[0].idChamCdChamado.value);
	ajax.addField('maniNrSequencia', document.forms[0].maniNrSequencia.value);
	ajax.addField('idAsn1CdAssuntoNivel1Mani', document.forms[0].idAsn1CdAssuntoNivel1Mani.value);
	ajax.addField('idAsn2CdAssuntoNivel2Mani', document.forms[0].idAsn2CdAssuntoNivel2Mani.value);
	ajax.addField('reemNrSequencia', document.forms[1].reemNrSequencia.value);
	ajax.addField('remaInRepor', document.forms[1].remaInRepor.checked?"S":"N");
	ajax.addField('remaInTroca', document.forms[1].remaInTroca.checked?"S":"N");
	ajax.addField('remaInReembolso', document.forms[1].remaInReembolso.checked?"S":"N");	

	
	ajax.executarConsulta(remocaoReembolsoOK, false, true);
}

function remocaoReembolsoOK(ajax){
	
	if(ajax.getMessage() != ''){
		alert(ajax.getMessage());
	}else{
		document.forms[1].reemNrSequencia.value = '0';
		document.forms[1].idForeCdFormareemb.value = '';
		document.forms[1].remaInReembolso.checked = false;
		
		document.forms[1].remaDsLogradouro.value = '';
		document.forms[1].remaDsNumero.value = '';
		document.forms[1].remaDsComplemento.value = '';
		document.forms[1].remaDsReferencia.value = '';
		document.forms[1].remaDsBairro.value = '';
		document.forms[1].remaDsCep.value = '';
		document.forms[1].remaDsMunicipio.value = '';
		document.forms[1].remaDsUf.value = '';
		document.forms[1].idBancCdBanco.value = '';
		document.forms[1].remaDsAgencia.value = '';
		document.forms[1].remaDsContacorrente.value = '';
		document.forms[1].remaNmTitular.value = '';
		document.forms[1].remaDsRg.value = '';
		document.forms[1].remaDsCpf.value = '';
		document.forms[1].bancDsBanco.value = '';
		document.forms[1].reemVlReembolso.value = '';
		trataCheck('D');	
		atualizarValoresReembolso();
	}
	
	
}

var janela;
function adicionarNovosDados(){
	var url="";
	var parametrosUrl = "";


	if (document.getElementById('idForeCdFormareemb').value == ""){
		alert ("Selecione o tipo de Ressarcimento");
		return false;
	}	
	formaRess = '';
	if(document.forms[1].idForeCdFormareemb.selectedIndex > 0){
		formaRess = document.getElementById('foreInTipoInfComplemento' + (document.forms[1].idForeCdFormareemb.selectedIndex - 1)).value;
	}	
	try{
		//Capturando os valores dos dados bancários para carregar na tela para edição de dados bancários
		var indice = document.forms[1].comboDadosReembolso.selectedIndex - 1;
		if(indice >= 0){

			if(formaRess == 'B'){
				parametrosUrl += "&idBancCdBanco=" + document.getElementById('idBanco' + indice).value;
				parametrosUrl += "&remaDsAgencia=" + document.getElementById('dsAgencia' + indice).value;
				parametrosUrl += "&bancDsBanco=" + document.getElementById('dsBanco' + indice).value;
				parametrosUrl += "&remaDsContacorrente=" + document.getElementById('dsConta' + indice).value;
				parametrosUrl += "&remaNmTitular=" + document.getElementById('nmTitular' + indice).value;
				parametrosUrl += "&remaDsRg=" + document.getElementById('dsRg' + indice).value;
				parametrosUrl += "&remaDsCpf=" + document.getElementById('dsCpf' + indice).value;
			}else{
				parametrosUrl += "&remaDsLogradouro=" + document.getElementById('dsLogradouro' + indice).value;
				parametrosUrl += "&remaDsNumero=" + document.getElementById('dsNumero' + indice).value;
				parametrosUrl += "&remaDsComplemento=" + document.getElementById('dsComplemento' + indice).value;
				parametrosUrl += "&remaDsReferencia=" + document.getElementById('dsReferencia' + indice).value;
				parametrosUrl += "&remaDsBairro=" + document.getElementById('dsBairro' + indice).value;
				parametrosUrl += "&remaDsCep=" + document.getElementById('dsCep' + indice).value;
				parametrosUrl += "&remaDsMunicipio=" + document.getElementById('dsMunicipio' + indice).value;				
				parametrosUrl += "&remaDsUf=" + document.getElementById('dsUf' + indice).value;
				parametrosUrl += "&remaDsRg=" + document.getElementById('dsRg' + indice).value;
						
			}			
		}
	}catch(x){}

	if (formaRess == "B"){
		url = 'AbrirTelaInserirDadosBancarios.do';
	}else{
		url = 'AbrirTelaInserirDadosEndereco.do';
	}
	
	url += "?idForeCdFormareemb=" + formaRess;
	url += "&idChamCdChamado=" + document.getElementById('idChamCdChamado').value;
	url += "&maniNrSequencia=" + document.getElementById('maniNrSequencia').value;
	url += "&idAsn1CdAssuntoNivel1Mani=" + document.getElementById('idAsn1CdAssuntoNivel1Mani').value;
	url += "&idAsn2CdAssuntoNivel2Mani=" + document.getElementById('idAsn2CdAssuntoNivel2Mani').value;

	nrSeq = '';
	if(document.getElementById('reemNrSequencia').value == ''){
		nrSeq = '0';
	}else{
		nrSeq = document.getElementById('reemNrSequencia').value;
	}

	
	url += "&reemNrSequencia=" + nrSeq;
	
	url += parametrosUrl;
	janela = showModalDialog(url,window,'help:no;scroll:no;Status:NO;dialogWidth:600px;dialogHeight:360px;dialogTop:250px;dialogLeft:250px');

}

function carregamentoComboDadosOK(ajax){
	rs = ajax.getRecordset();

	formaRess = '';
	if(document.forms[1].idForeCdFormareemb.selectedIndex > 0){
		formaRess = document.getElementById('foreInTipoInfComplemento' + (document.forms[1].idForeCdFormareemb.selectedIndex - 1)).value;
	}
		
	removeAllNonPrototipeRows("rowDadosComboBanco", "dadosBanco");
	removeAllNonPrototipeRows("rowDadosComboEndereco", "dadosEndereco");
	
	while(rs.next()){	
		if(formaRess == 'B'){
			cloneNode("rowDadosComboBanco", { idSuffix:"" + (rs.getCurr()) });
			setValue("idBanco" + (rs.getCurr()), rs.get('csCdtbBancoBancVo.idBancCdBanco'));
			setValue("dsBanco" + (rs.getCurr()), rs.get('csCdtbBancoBancVo.bancDsBanco'));
			setValue("dsAgencia" + (rs.getCurr()), rs.get('remaDsAgencia'));
			setValue("dsConta" + (rs.getCurr()), rs.get('remaDsContacorrente'));
			setValue("nmTitular" + (rs.getCurr()), rs.get('remaNmTitular'));
			setValue("dsRg" + (rs.getCurr()), rs.get('remaDsRg'));
			setValue("dsCpf" + (rs.getCurr()), rs.get('remaDsCpf'));

			
					
		}else{
			cloneNode("rowDadosComboEndereco", { idSuffix:"" + (rs.getCurr()) });
			setValue("tipoEndereco" + (rs.getCurr()), rs.get('csDmtbTpenderecoTpenVo.idTpenCdTpendereco'));
			setValue("dsTipoEndereco" + (rs.getCurr()), rs.get('csDmtbTpenderecoTpenVo.tpenDsTpendereco'));
			setValue("dsLogradouro" + (rs.getCurr()), rs.get('remaDsLogradouro'));
			setValue("dsNumero" + (rs.getCurr()), rs.get('remaDsNumero'));
			setValue("dsComplemento" + (rs.getCurr()), rs.get('remaDsComplemento'));
			setValue("dsReferencia" + (rs.getCurr()), rs.get('remaDsMunicipio'));
			setValue("dsBairro" + (rs.getCurr()), rs.get('remaDsBairro'));
			setValue("dsCep" + (rs.getCurr()), rs.get('remaDsCep'));
			setValue("dsUf" + (rs.getCurr()), rs.get('remaDsUf'));
			setValue("dsRg" + (rs.getCurr()), rs.get('remaDsReferencia'));
			setValue("dsMunicipio" + (rs.getCurr()), rs.get('remaDsRg'));

		}
		
	}

	if(formaRess == 'B'){
		ajax.popularCombo(document.getElementById("comboDadosReembolso"), "infoBancario", "infoBancario", "", true, "");
	}else{
		ajax.popularCombo(document.getElementById("comboDadosReembolso"), "infoEndereco", "infoEndereco", "", true, "");
	}

	if(document.forms[1].comboDadosReembolso.options.length > 1){
		document.forms[1].comboDadosReembolso.selectedIndex = 1;
	}
	
	
	setarValoresComboDados();
	
	if(ajax.getMessage() != ''){
		alert(ajax.getMessage());
	}
}



function setarValoresComboDados(){

	formaRess = '';
	if(document.forms[1].idForeCdFormareemb.selectedIndex > 0){
		formaRess = document.getElementById('foreInTipoInfComplemento' + (document.forms[1].idForeCdFormareemb.selectedIndex - 1)).value;
	}
	
	var indice = document.forms[1].comboDadosReembolso.selectedIndex - 1;
	if(indice >= 0){

		if(formaRess == 'B'){
			document.forms[1].idBancCdBanco.value  = document.getElementById('idBanco' + indice).value;
			document.forms[1].bancDsBanco.value  = document.getElementById('dsBanco' + indice).value;
			document.forms[1].remaDsAgencia.value  = document.getElementById('dsAgencia' + indice).value;
			document.forms[1].remaDsContacorrente.value  = document.getElementById('dsConta' + indice).value;
			document.forms[1].remaNmTitular.value  = document.getElementById('nmTitular' + indice).value;
			document.forms[1].remaDsRg.value  = document.getElementById('dsRg' + indice).value;
			document.forms[1].remaDsCpf.value  = document.getElementById('dsCpf' + indice).value;
		}else{
			document.forms[1].remaDsLogradouro.value  = document.getElementById('dsLogradouro' + indice).value;
			document.forms[1].remaDsNumero.value  = document.getElementById('dsNumero' + indice).value;
			document.forms[1].remaDsComplemento.value  = document.getElementById('dsComplemento' + indice).value;
			document.forms[1].remaDsReferencia.value  = document.getElementById('dsReferencia' + indice).value;
			document.forms[1].remaDsBairro.value  = document.getElementById('dsBairro' + indice).value;
			document.forms[1].remaDsCep.value  = document.getElementById('dsCep' + indice).value;
			document.forms[1].remaDsMunicipio.value  = document.getElementById('dsMunicipio' + indice).value;
			document.forms[1].remaDsUf.value  = document.getElementById('dsUf' + indice).value;
			document.forms[1].remaDsRg.value  = document.getElementById('dsRg' + indice).value;		
		}
		
	}
}

function carregarVariedadeRess(){	
	ajax = new ConsultaBanco("br/com/plusoft/csi/adm/dao/xml/espec/X.xml","/csicrm/CarregarVariedade.do");	
	ajax.addField("idLinhCdLinha", document.forms[1].idLinhCdLinhaRess.value);
	ajax.addField("idAsnCdAssuntoNivel", document.forms[1].idAsnCdAssuntoNivelRess.value);
	ajax.addField("prasInDescontinuado", "N");
			
	ajax.executarConsulta(carregamentoVariedadeRessOK, false, true);
}

function carregamentoVariedadeRessOK(ajax){
	ajax.popularCombo(document.getElementById("variedadeRess"), "csCdtbAssuntoNivel2Asn2Vo.idAsn2CdAssuntoNivel2", "csCdtbAssuntoNivel2Asn2Vo.asn2DsAssuntoNivel2", idAsn2, true, "");
	calcularValor();	
}

function carregarProdutoAssuntoAcess(){	
	ajax = new ConsultaBanco("","/csicrm/CarregarProdutoAssunto.do");	
	ajax.addField("idLinhCdLinha", document.forms[1].idLinhCdLinhaAcess.value);	
	ajax.addField("prasInDescontinuado", "N");		
	
	ajax.executarConsulta(carregamentoProdutoAcessOK, false, true);
}

function carregamentoProdutoAcessOK(ajax){
	ajax.popularCombo(document.getElementById("produtoAssuntoAcess"), "csCdtbAssuntoNivel1Asn1Vo.idAsn1CdAssuntoNivel1", "prasDsProdutoAssunto", idAsn1, true, "");
	idAsn1 = '';
	carregarVariedadeAcess();
	//alert(ajax.getXmlNodeRetorno());
	//alert(xmlMicoxArvore(ajax.getXmlNodeRetorno(), '       '));
}

function carregarVariedadeAcess(){	
	ajax = new ConsultaBanco("br/com/plusoft/csi/adm/dao/xml/espec/X.xml","/csicrm/CarregarVariedade.do");	
	ajax.addField("idLinhCdLinha", document.forms[1].idLinhCdLinhaAcess.value);
	ajax.addField("idAsnCdAssuntoNivel", document.forms[1].idAsnCdAssuntoNivelAcess.value);
	ajax.addField("prasInDescontinuado", "N");
			
	ajax.executarConsulta(carregamentoVariedadeAcessOK, false, true);
}

function carregamentoVariedadeAcessOK(ajax){
	ajax.popularCombo(document.getElementById("variedadeAcess"), "csCdtbAssuntoNivel2Asn2Vo.idAsn2CdAssuntoNivel2", "csCdtbAssuntoNivel2Asn2Vo.asn2DsAssuntoNivel2", idAsn2, true, "");
	idAsn2 = '';	
}


function habilitaCamposRessarcimento(){
	
	if(document.forms[1].remaInRepor.checked){
		document.forms[1].idAsnCdAssuntoNivelRess.disabled = true;
		document.forms[1].idAsn2CdAssuntoNivel2Ress.disabled = true;
		document.forms[1].idLinhCdLinhaRess.disabled = true;
		document.forms[1].idAsnCdAssuntoNivelAcess.disabled = true;
		document.forms[1].idAsn2CdAssuntoNivel2Acess.disabled = true;
		document.forms[1].idLinhCdLinhaAcess.disabled = true;
		window.document.all.item('LayerTravaProduto').style.visibility = "visible";
		window.document.all.item('LayerTravaAcessorio').style.visibility = "visible";
	}else{
		document.forms[1].idAsnCdAssuntoNivelRess.disabled = true;
		document.forms[1].idAsn2CdAssuntoNivel2Ress.disabled = true;
		document.forms[1].idLinhCdLinhaRess.disabled = true;
		document.forms[1].idAsnCdAssuntoNivelAcess.disabled = true;
		document.forms[1].idAsn2CdAssuntoNivel2Acess.disabled = true;
		document.forms[1].idLinhCdLinhaAcess.disabled = true;
		window.document.all.item('LayerTravaProduto').style.visibility = "visible";
		window.document.all.item('LayerTravaAcessorio').style.visibility = "visible";
	}

	if(document.forms[1].remaInTroca.checked){
		document.forms[1].idAsnCdAssuntoNivelRess.disabled = false;
		document.forms[1].idAsn2CdAssuntoNivel2Ress.disabled = false;
		document.forms[1].idLinhCdLinhaRess.disabled = false;
		document.forms[1].idAsnCdAssuntoNivelAcess.disabled = false;
		document.forms[1].idAsn2CdAssuntoNivel2Acess.disabled = false;
		document.forms[1].idLinhCdLinhaAcess.disabled = false;
		window.document.all.item('LayerTravaProduto').style.visibility = "hidden";
		window.document.all.item('LayerTravaAcessorio').style.visibility = "hidden";
	}else{
		document.forms[1].idAsnCdAssuntoNivelRess.disabled = true;
		document.forms[1].idAsn2CdAssuntoNivel2Ress.disabled = true;
		document.forms[1].idLinhCdLinhaRess.disabled = true;
		document.forms[1].idAsnCdAssuntoNivelAcess.disabled = true;
		document.forms[1].idAsn2CdAssuntoNivel2Acess.disabled = true;
		document.forms[1].idLinhCdLinhaAcess.disabled = true;
		document.forms[1].txtQuantidadeProduto.value = '';
		document.forms[1].prtrVlUnitario.value = '';
		document.forms[1].txtVlTotal.value = '';
		document.forms[1].txtQuantidadeAcessorio.value = '';
		window.document.all.item('LayerTravaProduto').style.visibility = "visible";
		window.document.all.item('LayerTravaAcessorio').style.visibility = "visible";
	}

	if(document.forms[1].remaInReembolso.checked){
		document.forms[1].idForeCdFormareemb.disabled = false;
		document.forms[1].comboDadosReembolso.disabled = false;		
		window.document.all.item('LayerTravaReembolso').style.visibility = "hidden";		
	}else{
		document.forms[1].idForeCdFormareemb.disabled = true;	
		document.forms[1].comboDadosReembolso.disabled = true;
		window.document.all.item('LayerTravaReembolso').style.visibility = "visible";
	}
	
	
}


function habilitaTiposReembolso(ajax){

	document.forms[1].remaInRepor.disabled = !ajax;
	document.forms[1].remaInTroca.disabled = !ajax;
	document.forms[1].remaInReembolso.disabled = !ajax;
	
}


function trataCheck(tipo){

	window.top.onclick_TipoRessarcimento(tipo);

	if (tipo == "R"){
		if (document.forms[1].remaInRepor.checked == true){
			document.forms[1].remaInTroca.checked = false;
			removerTodos();	
			adicionarTodos();
		}else{
			excluirProdutosAcessorios();	
		}
	}
	if (tipo == "T"){
		if (document.forms[1].remaInTroca.checked == true){
			var inRepor = document.forms[1].remaInRepor.checked;
			document.forms[1].remaInRepor.checked = false;

			removerTodos();	
			if(inRepor){
				adicionarTodos();
			}
			
		}
		else
		{
			excluirProdutosAcessorios();
		}
	}

	if (tipo == "D"){
		if (!document.forms[1].remaInReembolso.checked){
			document.forms[1].idForeCdFormareemb.selectedIndex = 0;
			document.forms[1].comboDadosReembolso.selectedIndex = 0;			
		}
		
	}
	
	habilitaCamposRessarcimento();
}


function calcularValor(){

	ajax = new ConsultaBanco("","/csicrm/ObterValorProduto.do");	
	ajax.addField('idChamCdChamado', document.forms[0].idChamCdChamado.value);
	ajax.addField('maniNrSequencia', document.forms[0].maniNrSequencia.value);
	ajax.addField('idAsn1CdAssuntoNivel1Mani', document.forms[0].idAsn1CdAssuntoNivel1Mani.value);
	ajax.addField('idAsn2CdAssuntoNivel2Mani', document.forms[0].idAsn2CdAssuntoNivel2Mani.value);
	ajax.addField('idAsnCdAssuntoNivel', document.forms[1].idAsnCdAssuntoNivelRess.value);
	ajax.addField('idAsn2CdAssuntoNivel2Ress', document.forms[1].idAsn2CdAssuntoNivel2Ress.value);

	if(document.forms[1].txtQuantidadeProduto.value != ''){
		ajax.addField('txtQuantidadeProduto', document.forms[1].txtQuantidadeProduto.value);
	}else{
		ajax.addField('txtQuantidadeProduto', "0");
	}

	if(document.forms[1].prtrVlUnitario.value != ''){
		//ajax.addField('prtrVlUnitario', document.forms[1].prtrVlUnitario.value);
	}
	
	ajax.executarConsulta(valorCalculado, false, true);

}

function valorCalculado(ajax){
	rs = ajax.getRecordset();

	if(rs.next()){
		document.forms[1].prtrVlUnitario.value = rs.get('valorunitario');
		document.forms[1].txtVlTotal.value = rs.get('total');		
	}
}

function adicionarTodos(){
	ajax = new ConsultaBanco("","/csicrm/AdicionarTodosProdutosTroca.do");	
	ajax.addField('idChamCdChamado', document.forms[0].idChamCdChamado.value);
	ajax.addField('maniNrSequencia', document.forms[0].maniNrSequencia.value);
	ajax.addField('idAsn1CdAssuntoNivel1Mani', document.forms[0].idAsn1CdAssuntoNivel1Mani.value);
	ajax.addField('idAsn2CdAssuntoNivel2Mani', document.forms[0].idAsn2CdAssuntoNivel2Mani.value);
	ajax.addField('remaInRepor', document.forms[1].remaInRepor.checked?"S":"N");
	ajax.addField('remaInTroca', document.forms[1].remaInTroca.checked?"S":"N");
	ajax.addField('remaInReembolso', document.forms[1].remaInReembolso.checked?"S":"N");
	ajax.addField('reemNrSequencia', document.forms[1].reemNrSequencia.value==''?'0':document.forms[1].reemNrSequencia.value);
	
	for(i = 0 ; i < abasRess.length ; i++){
		var iframeEspec = eval("ifrmRess" + i);	
		try{			
			retorno = iframeEspec.validar(ajax);
			if(retorno == false){
				return false;
			}	
		}catch(e){alert(e.message)}	
		try{
			ajax = iframeEspec.insereCampos(ajax);				
		}catch(e){e.message}		
	}	
	
	ajax.executarConsulta(produtoAdicionado, false, true);
}

function removerTodos(){
	ajax = new ConsultaBanco("","/csicrm/RemoverTodosProdutosTroca.do");	
	ajax.addField('idChamCdChamado', document.forms[0].idChamCdChamado.value);
	ajax.addField('maniNrSequencia', document.forms[0].maniNrSequencia.value);
	ajax.addField('idAsn1CdAssuntoNivel1Mani', document.forms[0].idAsn1CdAssuntoNivel1Mani.value);
	ajax.addField('idAsn2CdAssuntoNivel2Mani', document.forms[0].idAsn2CdAssuntoNivel2Mani.value);
	ajax.addField('remaInRepor', document.forms[1].remaInRepor.checked?"S":"N");
	ajax.addField('remaInTroca', document.forms[1].remaInTroca.checked?"S":"N");
	ajax.addField('remaInReembolso', document.forms[1].remaInReembolso.checked?"S":"N");

	for(i = 0 ; i < abasRess.length ; i++){
		var iframeEspec = eval("ifrmRess" + i);	
		try{			
			retorno = iframeEspec.validar(ajax);
			if(retorno == false){
				return false;
			}	
		}catch(e){alert(e.message)}	
		try{
			ajax = iframeEspec.insereCampos(ajax);				
		}catch(e){e.message}		
	}	
	
	ajax.executarConsulta(produtoAdicionado, false, true);
}

function editarProdutoRess(prtrSeq,quantidade,asn1,asn2,linha, vlUnitario){
	setValue("idLinhCdLinhaRess", linha);
	setValue("txtQuantidadeProduto", quantidade);
	setValue("idAsnCdAssuntoNivelRess", asn1);
	setValue("idAsn2CdAssuntoNivel2Ress", asn2);
	setValue("prtrNrSequencia", prtrSeq);
	setValue("prtrVlUnitario", vlUnitario);
	
	
	idAsn1 = asn1;
	idAsn2 = asn2;
	
	carregarProdutoAssuntoRess();
}

function editarProdutoAcess(prtrSeq,quantidade,asn1,asn2,linha){
	setValue("idLinhCdLinhaAcess", linha);
	setValue("txtQuantidadeAcessorio", quantidade);
	setValue("idAsnCdAssuntoNivelAcess", asn1);
	setValue("idAsn2CdAssuntoNivel2Acess", asn2);
	setValue("prtrNrSequencia", prtrSeq);

	idAsn1 = asn1;
	idAsn2 = asn2;
	
	carregarProdutoAssuntoAcess();
}

function salvarProdutoTroca(ehAcessorio){
	ajax = new ConsultaBanco("","/csicrm/SalvarProdutoTroca.do");
	ajax.addField('idChamCdChamado', document.forms[0].idChamCdChamado.value);
	ajax.addField('maniNrSequencia', document.forms[0].maniNrSequencia.value);
	ajax.addField('idAsn1CdAssuntoNivel1Mani', document.forms[0].idAsn1CdAssuntoNivel1Mani.value);
	ajax.addField('idAsn2CdAssuntoNivel2Mani', document.forms[0].idAsn2CdAssuntoNivel2Mani.value);	
	ajax.addField('reloInAcessorio', ehAcessorio);
	ajax.addField('remaInRepor', document.forms[1].remaInRepor.checked?"S":"N");
	ajax.addField('remaInTroca', document.forms[1].remaInTroca.checked?"S":"N");
	ajax.addField('remaInReembolso', document.forms[1].remaInReembolso.checked?"S":"N");	
	ajax.addField('prtrNrSequencia', document.forms[1].prtrNrSequencia.value==''?'0':document.forms[1].prtrNrSequencia.value);
	ajax.addField('reemNrSequencia', document.forms[1].reemNrSequencia.value==''?'0':document.forms[1].reemNrSequencia.value);
	
	if(ehAcessorio == 'N'){
		ajax.addField('txtQuantidadeProduto', document.forms[1].txtQuantidadeProduto.value);
		ajax.addField('idAsnCdAssuntoNivel', document.forms[1].idAsnCdAssuntoNivelRess.value);
		ajax.addField('idAsn2CdAssuntoNivel2Ress', document.forms[1].idAsn2CdAssuntoNivel2Ress.value);
	}else{	
		ajax.addField('idAsnCdAssuntoNivel', document.forms[1].idAsnCdAssuntoNivelAcess.value);
		ajax.addField('idAsn2CdAssuntoNivel2Ress', document.forms[1].idAsn2CdAssuntoNivel2Acess.value);	
		ajax.addField('txtQuantidadeProduto', document.forms[1].txtQuantidadeAcessorio.value);
	}
	if(document.forms[1].prtrVlUnitario.value != ''){
		ajax.addField('prtrVlUnitario', document.forms[1].prtrVlUnitario.value);
	}
		
	if(document.forms[1].remaInRepor.checked != true)
	{	

		if(ehAcessorio == 'N'){
			if (!validaProdutoTroca())
				return false;
		}
		else{
			if (!validaProdutoAcessorio())
				return false;
		}

		for(i = 0 ; i < abasRess.length ; i++){
			var iframeEspec = eval("ifrmRess" + i);	
			try{			
				retorno = iframeEspec.validar(ajax);
				if(retorno == false){
					return false;
				}	
			}catch(e){alert(e.message)}	
			try{
				ajax = iframeEspec.insereCampos(ajax);				
			}catch(e){alert(e.message)}		
		}	
				
		ajax.executarConsulta(produtoAdicionado, false, true);
		
		if(ehAcessorio == 'N'){
			document.forms[1].idLinhCdLinhaRess.value = '';
			carregarComboProdutoAjax('linharess');
			document.forms[1].txtQuantidadeProduto.value = '';
			document.forms[1].prtrVlUnitario.value = '';
		}
		
	}else{
		alert('Para adicionar um novo produto a opção de repor não pode estar marcada.');
	}
}


function produtoRemovido(ajax){
	removeAllNonPrototipeRows("rowReembolso", "reembolsos");	
	rs = ajax.getRecordset();

	
	rs.next();
	
	while(rs.next()){
		if (rs.get('ptrInAcessorio') == 'S'){
			cloneNode("rowReembolso", { idSuffix:"" + (rs.getCurr() -1) });
			$("rowReembolso" + (rs.getCurr() -1)).indice=(rs.getCurr() -1);
			$("rowReembolso" + (rs.getCurr() -1)).prtrSeq=rs.get('prtrNrSequencia');	
			$("rowReembolso" + (rs.getCurr() -1)).quantidade=rs.get('prtrNrQuantidade');
			$("rowReembolso" + (rs.getCurr() -1)).asn1=rs.get('csCdtbProdutoAssuntoPrasVo.csCdtbAssuntoNivel1Asn1Vo.idAsn1CdAssuntoNivel1');
			$("rowReembolso" + (rs.getCurr() -1)).asn2=rs.get('csCdtbProdutoAssuntoPrasVo.csCdtbAssuntoNivel2Asn2Vo.idAsn2CdAssuntoNivel2');
			$("rowReembolso" + (rs.getCurr() -1)).linha=rs.get('csCdtbProdutoAssuntoPrasVo.csCdtbLinhaLinhVo.idLinhCdLinha');
			
			setValue("descLinha" + (rs.getCurr() -1), rs.get('csCdtbProdutoAssuntoPrasVo.csCdtbLinhaLinhVo.linhDsLinha'));
			setValue("descAcessorio" + (rs.getCurr() -1), rs.get('csCdtbProdutoAssuntoPrasVo.prasDsProdutoAssunto'));
			setValue("descQuantidadeAcess" + (rs.getCurr() -1), rs.get('prtrNrQuantidade'));
			$("rowReembolso" + (rs.getCurr() -1)).style.display = "";		
		}
	}	
		
}


function produtoAdicionado(ajax){

	document.forms[1].prtrNrSequencia.value = '';
	
	rs = ajax.getRecordset();

	if(rs == null){
		atualizarValoresReembolso();
		return;
	}
	
	rs.next();

	if(rs.get('prtrInAcessorio') == 'N'){
		removeAllNonPrototipeRows("rowReembolsoProd", "reembolsosProd");
	}else if(rs.get('prtrInAcessorio') == 'S'){		
		removeAllNonPrototipeRows("rowReembolso", "reembolsos");		
	}else{
		removeAllNonPrototipeRows("rowReembolsoProd", "reembolsosProd");
		removeAllNonPrototipeRows("rowReembolso", "reembolsos");
	}

	while(rs.next()){
		if(rs.get('prtrInAcessorio') == 'S'){
			cloneNode("rowReembolso", { idSuffix:"" + (rs.getCurr() -1) });
			$("rowReembolso" + (rs.getCurr() -1)).indice=(rs.getCurr() -1);
			$("rowReembolso" + (rs.getCurr() -1)).prtrSeq=rs.get('prtrNrSequencia');	
			$("rowReembolso" + (rs.getCurr() -1)).quantidade=rs.get('prtrNrQuantidade');
			$("rowReembolso" + (rs.getCurr() -1)).asn1=rs.get('csCdtbProdutoAssuntoPrasVo.csCdtbAssuntoNivel1Asn1Vo.idAsn1CdAssuntoNivel1');
			$("rowReembolso" + (rs.getCurr() -1)).asn2=rs.get('csCdtbProdutoAssuntoPrasVo.csCdtbAssuntoNivel2Asn2Vo.idAsn2CdAssuntoNivel2');
			$("rowReembolso" + (rs.getCurr() -1)).linha=rs.get('csCdtbProdutoAssuntoPrasVo.csCdtbLinhaLinhVo.idLinhCdLinha');
			
			setValue("descLinha" + (rs.getCurr() -1), rs.get('csCdtbProdutoAssuntoPrasVo.csCdtbLinhaLinhVo.linhDsLinha'));
			setValue("descAcessorio" + (rs.getCurr() -1), rs.get('csCdtbProdutoAssuntoPrasVo.prasDsProdutoAssunto'));
			setValue("descQuantidadeAcess" + (rs.getCurr() -1), rs.get('prtrNrQuantidade'));
			$("rowReembolso" + (rs.getCurr() -1)).style.display = "";		
		}else{
			cloneNode("rowReembolsoProd", { idSuffix:"" + (rs.getCurr() -1) });
			$("rowReembolsoProd" + (rs.getCurr() -1)).indice=(rs.getCurr() -1);
			$("rowReembolsoProd" + (rs.getCurr() -1)).prtrSeq=rs.get('prtrNrSequencia');
			$("rowReembolsoProd" + (rs.getCurr() -1)).quantidade=rs.get('prtrNrQuantidade');
			$("rowReembolsoProd" + (rs.getCurr() -1)).asn1=rs.get('csCdtbProdutoAssuntoPrasVo.csCdtbAssuntoNivel1Asn1Vo.idAsn1CdAssuntoNivel1');
			$("rowReembolsoProd" + (rs.getCurr() -1)).asn2=rs.get('csCdtbProdutoAssuntoPrasVo.csCdtbAssuntoNivel2Asn2Vo.idAsn2CdAssuntoNivel2');
			$("rowReembolsoProd" + (rs.getCurr() -1)).linha=rs.get('csCdtbProdutoAssuntoPrasVo.csCdtbLinhaLinhVo.idLinhCdLinha');	
			$("rowReembolsoProd" + (rs.getCurr() -1)).valorUnit=rs.get('prtrVlUnitario');
			setValue("descProdutoReem" + (rs.getCurr() -1), rs.get('csCdtbProdutoAssuntoPrasVo.prasDsProdutoAssunto'));
			setValue("valorUnitario" + (rs.getCurr() -1), rs.get('prtrVlUnitario'));
			setValue("descQuantidade" + (rs.getCurr() -1), rs.get('prtrNrQuantidade'));
			setValue("valorTotal" + (rs.getCurr() -1), rs.get('prtrVlTotal'));
			$("rowReembolsoProd" + (rs.getCurr() -1)).style.display = "";	
		}
		
	}

	if(ajax.getMessage() != ''){
		alert(ajax.getMessage());
	}
	
	atualizarValoresReembolso();
}

function removerProduto(prtrSeq, ehAcessorio){
	ajax = new ConsultaBanco("br/com/plusoft/csi/adm/dao/xml/espec/X.xml","/csicrm/RemoverProdutoTroca.do");

	ajax.addField('idChamCdChamado', document.forms[0].idChamCdChamado.value);
	ajax.addField('maniNrSequencia', document.forms[0].maniNrSequencia.value);
	ajax.addField('idAsn1CdAssuntoNivel1Mani', document.forms[0].idAsn1CdAssuntoNivel1Mani.value);
	ajax.addField('idAsn2CdAssuntoNivel2Mani', document.forms[0].idAsn2CdAssuntoNivel2Mani.value);
	ajax.addField('prtrNrSequencia', prtrSeq);
	ajax.addField('reloInAcessorio', ehAcessorio);

	for(i = 0 ; i < abasRess.length ; i++){
		var iframeEspec = eval("ifrmRess" + i);	
		try{			
			retorno = iframeEspec.validar(ajax);
			if(retorno == false){
				return false;
			}	
		}catch(e){alert(e.message)}	
		try{
			ajax = iframeEspec.insereCampos(ajax);				
		}catch(e){e.message}		
	}	
		
	ajax.executarConsulta(produtoAdicionado, false, true);	
}


function executaValidacaoPadrao(){
	return true;
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




//Lotes


function carregaLocalCompra(reloNrSequencial){
	var url;
	url = "ProdutoLote.do?tela=localCompra";
	url = url + "&acao=showAll";
	url = url + "&csNgtbReclamacaoManiRemaVo.csNgtbManifestacaoManiVo.csNgtbChamadoChamVo.idChamCdChamado=" + document.forms[0].idChamCdChamado.value;
	url = url + "&csNgtbReclamacaoManiRemaVo.csNgtbManifestacaoManiVo.maniNrSequencia=" + document.forms[0].maniNrSequencia.value;
	url = url + "&csNgtbReclamacaoManiRemaVo.csNgtbManifestacaoManiVo.csCdtbProdutoAssuntoPrasVo.csCdtbAssuntoNivel1Asn1Vo.idAsn1CdAssuntoNivel1=" + document.forms[0].idAsn1CdAssuntoNivel1Mani.value;
	url = url + "&csNgtbReclamacaoManiRemaVo.csNgtbManifestacaoManiVo.csCdtbProdutoAssuntoPrasVo.csCdtbAssuntoNivel2Asn2Vo.idAsn2CdAssuntoNivel2=" + document.forms[0].idAsn2CdAssuntoNivel2Mani.value;
	url = url + "&reloNrSequencia=" + reloNrSequencial;
	
	
	showModalDialog(url,window,'help:no;scroll:no;Status:NO;dialogWidth:780px;dialogHeight:300px,dialogTop:200px,dialogLeft:200px');

}

var visualizaLotesReincidentes;
function visualizarLotes(){
	var valor = document.getElementsByName('lotesReincidentes')[0].value;
	valor = replaceAll(valor, "\n", "<br>");
	valor = replaceAll(valor, " ", "&nbsp;");
	
	visualizaLotesReincidentes = new Object();
	visualizaLotesReincidentes.value = valor;

	showModalDialog('webFiles/operadorapresenta/ifrmDetalhe.jsp', visualizaLotesReincidentes, 'help:no;scroll:no;Status:NO;dialogWidth:850px;dialogHeight:500px,dialogTop:0px,dialogLeft:200px')
}

function acaoJanelaCalendario(){
	vWinCal.document.body.onunload = function(){
		corData();
	}
}

function corData(){
	//Colocando cor da fonte vermelha caso seja menor que hoje
	sData = new String(document.forms[0].reloDhDtValidade.value);
	dia = sData.substring(0, 2);
	mes = sData.substring(3, 5);
	ano = sData.substring(6, sData.length);
	data = new Date(ano, mes-1, dia);
	hoje = new Date();
	hoje.setHours(0, 0, 0, 0);
	
	if(data < hoje){
		document.forms[0].reloDhDtValidade.style.color = "#FF0000";
	}
	else{
		document.forms[0].reloDhDtValidade.style.color = "#000000";
	}
}

function mostraCampoBusca(){
	document.getElementById('comboProduto').style.display = 'none';
	document.getElementById('campoBusca').style.display = '';
}

function carregarProdutoAssunto(){	
	ajax = new ConsultaBanco("","/csicrm/CarregarProdutoAssunto.do");	
	ajax.addField("idLinhCdLinha", document.forms[0].idLinhCdLinha.value);	
	ajax.addField("idAsn1CdAssuntoNivel1", idAsn1);
	
	//adiciona o if do undefined, pois quando consumidor = N nao existe o objeto chkDescontinuado
	if(document.forms[0].chkDecontinuado != undefined){
		if (document.forms[0].chkDecontinuado.checked == true){
			ajax.addField("prasInDescontinuado", "S");		
		}else{
			ajax.addField("prasInDescontinuado", "N");
		}
	}else{
		ajax.addField("prasInDescontinuado", "N");
	}
	
	ajax.executarConsulta(carregamentoProdutoOK, false, true);
}

function carregamentoProdutoOK(ajax){
	ajax.popularCombo(document.getElementById("produtoAssunto"), "csCdtbAssuntoNivel1Asn1Vo.idAsn1CdAssuntoNivel1", "prasDsProdutoAssunto", idAsn1, true, "");
	idAsn1 = '';

	if(isPosicionarCamposEdicao) return;
	carregarVariedade();
	//alert(ajax.getXmlNodeRetorno());
	//alert(xmlMicoxArvore(ajax.getXmlNodeRetorno(), '       '));
}

function carregarVariedade(){	
	ajax = new ConsultaBanco("br/com/plusoft/csi/adm/dao/xml/espec/X.xml","/csicrm/CarregarVariedade.do");	
	ajax.addField("idLinhCdLinha", document.forms[0].idLinhCdLinha.value);
	ajax.addField("idAsnCdAssuntoNivel", document.forms[0].idAsnCdAssuntoNivel.value);

	//adiciona o if do undefined, pois quando consumidor = N nao existe o objeto chkDescontinuado
	if(document.forms[0].chkDecontinuado != undefined){
		if (document.forms[0].chkDecontinuado.checked == true){
			ajax.addField("prasInDescontinuado", "S");		
		}else{
			ajax.addField("prasInDescontinuado", "N");
		}
	}else{
		ajax.addField("prasInDescontinuado", "N");
	}
	
	ajax.executarConsulta(carregamentoVariedadeOK, false, true);
}

function carregamentoVariedadeOK(ajax){
	ajax.popularCombo(document.getElementById("variedade"), "csCdtbAssuntoNivel2Asn2Vo.idAsn2CdAssuntoNivel2", "csCdtbAssuntoNivel2Asn2Vo.asn2DsAssuntoNivel2", idAsn2, true, "");
	idAsn2 = '';

	if(isPosicionarCamposEdicao) return;
	carregarGrma();	
}

function carregarGrma(){	
	ajax = new ConsultaBanco("br/com/plusoft/csi/adm/dao/xml/espec/X.xml","/csicrm/CarregarGrma.do");	
	ajax.addField("idAsnCdAssuntoNivel", document.forms[0].idAsnCdAssuntoNivel.value);	
	ajax.addField("idAsn2CdAssuntoNivel2", document.forms[0].idAsn2CdAssuntoNivel2.value);	
	ajax.addField("idMatpCdManifTipo", document.forms[0].idMatpCdManifTipo.value);
	ajax.executarConsulta(carregamentoGrmaOK, false, true);
}

function carregamentoGrmaOK(ajax){
	ajax.popularCombo(document.getElementById("grma"), "idGrmaCdGrupoManifestacao", "grmaDsGrupoManifestacao", idGrma, true, "");
	idGrma = '';

	if(isPosicionarCamposEdicao) return;
	carregarTpma();
}

function carregarTpma(){	
	ajax = new ConsultaBanco("br/com/plusoft/csi/adm/dao/xml/espec/X.xml","/csicrm/CarregarTpma.do");	
	ajax.addField("idAsnCdAssuntoNivel", document.forms[0].idAsnCdAssuntoNivel.value);	
	ajax.addField("idAsn2CdAssuntoNivel2", document.forms[0].idAsn2CdAssuntoNivel2.value);
	ajax.addField("idGrmaCdGrupoManifestacao", document.forms[0].idGrmaCdGrupoManifestacao.value);		
	ajax.executarConsulta(carregamentoTpmaOK, false, true);
}

function carregamentoTpmaOK(ajax){
	ajax.popularCombo(document.getElementById("tpma"), "idTpmaCdTpManifestacao", "tpmaDsTpManifestacao", idTpma, true, "");
	idTpma = '';

	if(isPosicionarCamposEdicao) return;
	carregarDestinoProduto();		
}

function carregarDestinoProduto(){	
	ajax = new ConsultaBanco("br/com/plusoft/csi/adm/dao/xml/espec/X.xml","/csicrm/CarregarDestinoProduto.do");	
	ajax.addField("idAsnCdAssuntoNivel", document.forms[0].idAsnCdAssuntoNivel.value);	
	ajax.addField("idAsn2CdAssuntoNivel2", document.forms[0].idAsn2CdAssuntoNivel2.value);
	ajax.addField("idTpmaCdTpManifestacao", document.forms[0].idTpmaCdTpManifestacao.value);
	ajax.addField("idDeprCdDestinoproduto", document.forms[0].idDeprCdDestinoproduto.value);		
	ajax.executarConsulta(carregamentoDestinoProdutoOK, false, true);
}

function carregamentoDestinoProdutoOK(ajax){
	dest = document.forms[0].idDeprCdDestinoproduto.value;
	ajax.popularCombo(document.getElementById("depr"), "idDeprCdDestinoproduto", "deprDsDestinoproduto", "", true, "");
	document.forms[0].idDeprCdDestinoproduto.value = dest;
	habilitarLaboratorio(document.forms[0].idDeprCdDestinoproduto.selectedIndex);
}

function buscarProduto(){
	ajax = new ConsultaBanco("br/com/plusoft/csi/adm/dao/xml/X.xml");
	ajax.addField("loja_ds_codloja", '%' + document.forms[0].filtro.value.toUpperCase() + '%');
	ajax.popularCombo(document.getElementById("loja"), "id_loja_cd_loja", "loja_ds_codloja", "", true, "");

	document.getElementById('comboProduto').style.display = '';
	document.getElementById('campoBusca').style.display = 'none';
}

function buscaPorLojaOk(ajax){
	ajax.popularCombo(comboSelecionado, "csCdtbAssuntoNivel1Asn1Vo.idAsn1CdAssuntoNivel1", "prasDsProdutoAssunto", idAsn1, true, "");
}

function buscarProdutoPorLoja(imagem, imagemAntiga, campoBusca, comboProduto){
	ajax = new ConsultaBanco("","/csicrm/CarregarProdutoAssunto.do");	
	ajax.addField("idLinhCdLinha", document.forms[0].idLinhCdLinha.value);	
	ajax.addField("idAsn1CdAssuntoNivel1", '0');
	
	if(document.forms[0].chkDecontinuado != undefined){
		if (document.forms[0].chkDecontinuado.checked == true){
			ajax.addField("prasInDescontinuado", "S");		
		}else{
			ajax.addField("prasInDescontinuado", "N");
		}
	}else{
		ajax.addField("prasInDescontinuado", "N");
	}	
	
	//ajax = new ConsultaBanco("br/com/plusoft/csi/adm/dao/xml/X.xml");
	ajax.addField("prasDsProdutoAssunto", '%' + campoBusca.value.toUpperCase() + '%');
	ajax.addField("tipoRequisicao", 'ajax');
	comboSelecionado = comboProduto;
	ajax.executarConsulta(buscaPorLojaOk, false, true);
	comboProduto.style.display = '';
	imagem.style.display='';
	campoBusca.style.display = 'none';
	imagemAntiga.style.display = 'none';
}


function pressEnter(event) {
    if (event.keyCode == 13) {
    	buscarProduto();
    }
}

function pEnter(tipoCampo) {
    if (event.keyCode == 13) {
    	buscarProdutoPorTipoCampo(tipoCampo);
    }
}



function adicionarLote(){
	if(!validaCamposLote()){
		return false;
	}

	ajax = new ConsultaBanco("br/com/plusoft/csi/adm/dao/xml/espec/X.xml","/csicrm/SalvarProdutoLote.do");

	var e=document.getElementsByTagName("input");

	for(var i=0;i<e.length;i++){
		if(e[i].name == 'reloInNaoRessarcir'){
			valor = 'S';
			if(document.forms[0].reloInNaoRessarcir[0].checked)
				valor = 'N';
			ajax.addField(e[i].name, valor);
		}else if(e[i].name == 'reloInAcessorio'){
			valor = 'N';
			if(document.forms[0].reloInAcessorio.checked)
				valor = 'S';
			ajax.addField(e[i].name, valor);
		}else{
			ajax.addField(e[i].name, e[i].value);
		}
	}	

	var e=document.getElementsByTagName("select");	
	for(var i=0;i<e.length;i++){
		ajax.addField(e[i].name, e[i].value);
	}	

	for(i = 0 ; i < abas.length ; i++){
		var iframeEspec = eval("ifrm" + i);	
		try{			
			retorno = iframeEspec.validar(ajax);
			if(retorno == false){
				return false;
			}	
		}catch(e){alert(e.message)}	
		try{
			ajax = iframeEspec.insereCampos(ajax);				
		}catch(e){e.message}		
	}	

	ajax.executarConsulta(loteAdicionado, false, true);
}

function removerLote(reloNrSequencia){
	
	ajax = new ConsultaBanco("br/com/plusoft/csi/adm/dao/xml/espec/X.xml","/csicrm/RemoverProdutoLote.do");

	ajax.addField('idChamCdChamado', document.forms[0].idChamCdChamado.value);
	ajax.addField('maniNrSequencia', document.forms[0].maniNrSequencia.value);
	ajax.addField('idAsn1CdAssuntoNivel1Mani', document.forms[0].idAsn1CdAssuntoNivel1Mani.value);
	ajax.addField('idAsn2CdAssuntoNivel2Mani', document.forms[0].idAsn2CdAssuntoNivel2Mani.value);
	ajax.addField('reloNrSequencia', reloNrSequencia);


	for(i = 0 ; i < abas.length ; i++){
		var iframeEspec = eval("ifrm" + i);	
		try{			
			retorno = iframeEspec.validar(ajax);
			if(retorno == false){
				return false;
			}	
		}catch(e){alert(e.message)}	
		try{
			ajax = iframeEspec.insereCampos(ajax);				
		}catch(e){e.message}		
	}	
	
	ajax.executarConsulta(loteAdicionado, false, true);
}

function editarLote(reloNrSequencia){
	
	ajax = new ConsultaBanco("br/com/plusoft/csi/adm/dao/xml/espec/X.xml","/csicrm/EditarProdutoLote.do");

	ajax.addField('idChamCdChamado', document.forms[0].idChamCdChamado.value);
	ajax.addField('maniNrSequencia', document.forms[0].maniNrSequencia.value);
	ajax.addField('idAsn1CdAssuntoNivel1Mani', document.forms[0].idAsn1CdAssuntoNivel1Mani.value);
	ajax.addField('idAsn2CdAssuntoNivel2Mani', document.forms[0].idAsn2CdAssuntoNivel2Mani.value);
	ajax.addField('reloNrSequencia', reloNrSequencia);
	
	for(i = 0 ; i < abas.length ; i++){
		var iframeEspec = eval("ifrm" + i);
		try{
			ajax = iframeEspec.editarLote(ajax);				
		}catch(e){e.message}		
	}	
	
	ajax.executarConsulta(posicionarCamposEdicao, false, true);
}

var isPosicionarCamposEdicao=false;
function posicionarCamposEdicao(ajax){

	rs = ajax.getRecordset();

	
	while(rs.next()){
		setValue("reloDsLote", rs.get('reloDsLote'));
		setValue("reloDhDtFabricacao", rs.get('reloDhDtFabricacao'));
		setValue("reloDhDtValidade", rs.get('reloDhDtValidade'));
		setValue("idFabrCdFabrica", rs.get('csCdtbFabricaFabrVo.idFabrCdFabrica'));
		setValue("reloNrComprada", rs.get('reloNrComprada'));
		setValue("reloNrReclamada", rs.get('reloNrReclamada'));
		setValue("reloNrDisponivel", rs.get('reloNrDisponivel'));
		setValue("reloNrAberta", rs.get('reloNrAberta'));
		setValue("reloNrTroca", rs.get('reloNrTroca'));
		setValue("idFabrCdLaboratorio", rs.get('csCdtbLaboratorioFabrVo.idFabrCdFabrica'));
		setValue("reloInAnalise", rs.get('reloInAnalise'));
		setValue("reloNrSequencia", rs.get('reloNrSequencia'));
		setValue("idLinhCdLinha", rs.get('produtoReclamadoVo.csCdtbLinhaLinhVo.idLinhCdLinha'));
		setValue("idClotCdCondicaolote", rs.get('csCdtbCondicaoloteClotVo.idClotCdCondicaolote'));
		setValue("idSiloCdSituacaolote", rs.get('csCdtbSituacaoloteSiloVo.idSiloCdSituacaolote'));
		setValue("idMoloCdMotivolote", rs.get('csCdtbMotivoloteMoloVo.idMoloCdMotivolote'));
		setValue("reloInNaoRessarcir", rs.get('reloInNaoRessarcir'));
		setValue("idMotrCdMotivotroca", rs.get('csCdtbMotivotrocaMotrVo.idMotrCdMotivotroca'));				
		setValue("reloVlProduto", rs.get('reloVlProduto'));		
		setValue("reloInAcessorio", rs.get('reloInAcessorio'));
		setValue("idDeprCdDestinoproduto", rs.get('csCdtbDestinoprodutoDeprVo.idDeprCdDestinoproduto'));

		idAsn1 = rs.get('produtoReclamadoVo.csCdtbAssuntoNivel1Asn1Vo.idAsn1CdAssuntoNivel1');
		idAsn2 = rs.get('produtoReclamadoVo.csCdtbAssuntoNivel2Asn2Vo.idAsn2CdAssuntoNivel2');
		idGrma = rs.get('csCdtbTpManifestacaoTpmaVo.csCdtbGrupoManifestacaoGrmaVo.idGrmaCdGrupoManifestacao');
		idTpma = rs.get('csCdtbTpManifestacaoTpmaVo.idTpmaCdTpManifestacao');
				
		isPosicionarCamposEdicao=true;
		carregarProdutoAssunto();

		// Dá 2 segundos para as combos se recarregarem e depois reabilitar as funções de cascata
		setTimeout('isPosicionarCamposEdicao=false;', 2000);

		habilitaMotLoteBranco();
		habilitaMotivoRessarci();

	}
	//alert(xmlMicoxArvore(ajax.getXmlNodeRetorno(), '       '));
}


function loteAdicionado(ajax){
	if(ajax.getMessage() != ''){
		alert(ajax.getMessage());
		return false; 
	}

	var comp = 0;
	var recl = 0;
	var fech = 0;
	var aber = 0;
	var troc = 0;
	
	rs = ajax.getRecordset();

	for(i = 0 ; i < abas.length ; i++){
		try{
			document.getElementById("div" + i).loteInserido(rs);				
		}catch(e){}		
	}	
	
	removeAllNonPrototipeRows("rowLote", "lotes");
	habilitaTiposReembolso(false);

	while(rs.next()){
		cloneNode("rowLote", { idSuffix:"" + rs.getCurr() });
		$("rowLote" + rs.getCurr()).indice=rs.getCurr();
		$("rowLote" + rs.getCurr()).reloSeq=rs.get('reloNrSequencia');		
		setValue("descProduto" + rs.getCurr(), rs.get('produtoReclamadoVo.prasDsProdutoAssunto'));

		if(rs.get('idPesqCdPesquisa') == '0'){
			if(rs.get('pesquisaRespondida') == 'S'){
				$("imgPesquisa" + rs.getCurr()).title = "Pesquisa Respondida";
			}else
				$("imgPesquisa" + rs.getCurr()).style.display = "none";
		}else{
			$("imgPesquisa" + rs.getCurr()).onclick = function(){habilitaPesquisaLote(''+ rs.get('idPesqCdPesquisa'),''+ rs.get('reloNrSequencia'));};
		}

		var nrSeq = rs.get('reloNrSequencia');
		$("imgResposta" + rs.getCurr()).onclick = function(){
													carregaLocalCompraComNrSequencia(''+ nrSeq);
												  };		
		if(rs.get('reloInNaoRessarcir')=='N')
			$("imgRessarcir" + rs.getCurr()).style.display = "";
		else
			$("imgRessarcir" + rs.getCurr()).style.display = "none";

		if(rs.get('reloInAcessorio')=='S') {
			$("imgAcessorio" + rs.getCurr()).style.visibility = "";
		} else {
			$("imgAcessorio" + rs.getCurr()).style.visibility = "hidden";
		}
		
		var reloDsLote = rs.get('reloDsLote');
		if(reloDsLote=='') reloDsLote = ' ';
		
		setValue("descLote" + rs.getCurr(), reloDsLote);
		setValue("dataValidade" + rs.getCurr(), rs.get('reloDhDtValidade'));

		$("rowLote" + rs.getCurr()).style.display = "";

		 comp += new Number(rs.get('reloNrComprada'));
		 recl += new Number(rs.get('reloNrReclamada'));
		 fech += new Number(rs.get('reloNrDisponivel'));
		 aber += new Number(rs.get('reloNrAberta'));
		 troc += new Number(rs.get('reloNrTroca'));

		 habilitaTiposReembolso(true);
		 
         try{
			wi = parent.parent.dialogArguments;
			wi.parent.top.principal.manifestacao.manifestacaoForm.inPossuiProdutoReclamado.value="true";
		 }catch(x){}
		 
	}

	setValue("txtComprada", comp);
	setValue("txtReclamada", recl);
	setValue("txtFechada", fech);
	setValue("txtAberta", aber);
	setValue("txtTroca", troc);
	
	limpaCampos();
	atualizarValoresReembolso();
	carregarLotesReincidentes();
	//alert(xmlMicoxArvore(ajax.getXmlNodeRetorno(), '       '));
}


function limpaCampos(){
	document.forms[0].reloDhDtFabricacao.value = "";
	document.forms[0].reloDhDtValidade.value = "";
	document.forms[0].reloDhDtValidade.value = "";
	document.forms[0].reloDsLote.value = "";
	document.forms[0].idFabrCdFabrica.value = "";
	document.forms[0].reloNrComprada.value = "";
	document.forms[0].reloNrReclamada.value = "";
	document.forms[0].reloNrDisponivel.value = "";
	document.forms[0].reloNrAberta.value = "";
	document.forms[0].reloNrTroca.value = "";
	document.forms[0].reloNrSequencia.value = "";
	
	document.forms[0].reloInAnalise.checked = true;
	
	document.forms[0].idLinhCdLinha.value = "";
	carregarProdutoAssunto();
	
	document.forms[0].idClotCdCondicaolote.value = "";
	document.forms[0].idSiloCdSituacaolote.value = "";
	document.forms[0].idMoloCdMotivolote.value = "";
	document.forms[0].reloInNaoRessarcir[1].checked = true;
	document.forms[0].idMotrCdMotivotroca.value = "";
	document.forms[0].reloInAcessorio.checked = false;
	
	document.forms[0].idDeprCdDestinoproduto.value = "";
	
	document.forms[0].idFabrCdLaboratorio.value = "";
	document.forms[0].idFabrCdLaboratorio.disabled = true;
	
	
	habilitaMotLoteBranco();
	habilitaMotivoRessarci();

}


function habilitaMotLoteBranco(){
	if (trim(document.forms[0].reloDsLote.value).length == 0){
		lblMotivoLoteBranco.disabled = false;
		document.forms[0].idMoloCdMotivolote.disabled = false;
	}else{
		lblMotivoLoteBranco.disabled = true;
		document.forms[0].idMoloCdMotivolote.value = "";
		document.forms[0].idMoloCdMotivolote.disabled = true;
	}
}


function validaSaldo(vlProduto){

	var vlProd = new Number(0);
	var vlSaldo = new Number(0);
	var vlDsSaldo = document.forms[1].txtVlSaldo.value;
	var vlDsSaldo = new Number(0);
	if (vlProduto != ''){
		vlProd = new Number(vlProduto.replace(",","."));
	}
	if (vlDsSaldo != ''){
		vlSaldo = new Number(vlDsSaldo.replace(",","."));
	}	
	//if (vlProd <= vlSaldo)
	//	return true;
	//else
	//	return false;

	return true;

}

function validaFlagAcessorio(){
	if (document.forms[0].reloNrSequencia.value != ""){
		if (document.forms[0].reloInAcessorio.checked == false){
			
		}
	}	
}	



function habilitarLaboratorio(indiceDestino){
	
	if(indiceDestino == 0){
		document.forms[0].idFabrCdLaboratorio.disabled = true;
	}else{
	
		if(document.forms[0].txtInEnviarAnalise.length != undefined){
			if(document.forms[0].txtInEnviarAnalise[indiceDestino].value == 'S'){
				document.forms[0].reloInAnalise.value = 'S';
				document.forms[0].idFabrCdLaboratorio.disabled = false;
				lblLaboratorio.disabled = false;
			}else{
				document.forms[0].reloInAnalise.value = 'N';
				document.forms[0].idFabrCdLaboratorio.disabled = true;
				document.forms[0].idFabrCdLaboratorio.selectedIndex = 0;
				lblLaboratorio.disabled = true;
			}
		}else{
			if(document.forms[0].txtInEnviarAnalise.value == 'S'){
				document.forms[0].reloInAnalise.value = 'S';
				document.forms[0].idFabrCdLaboratorio.disabled = false;
				lblLaboratorio.disabled = false;
			}else{
				document.forms[0].reloInAnalise.value = 'N';
				document.forms[0].idFabrCdLaboratorio.disabled = true;
				document.forms[0].idFabrCdLaboratorio.selectedIndex = 0;
				lblLaboratorio.disabled = true;
			}
				
		}
	
	}
	
}

function abreEndTroca() {
	var chamado = document.forms[0].idChamCdChamado.value;
	var manifestacao = document.forms[0].maniNrSequencia.value;
	var asn1 = document.forms[0].idAsn1CdAssuntoNivel1Mani.value;
	var asn2 = document.forms[0].idAsn2CdAssuntoNivel2Mani.value;

	url = 'ReclamacaoMani.do?acao=showAll&tela=endTroca&csNgtbReclamacaoManiRemaVo.csNgtbManifestacaoManiVo.csNgtbChamadoChamVo.idChamCdChamado=' + chamado + '&csNgtbReclamacaoManiRemaVo.csNgtbManifestacaoManiVo.maniNrSequencia=' + manifestacao + '&csNgtbReclamacaoManiRemaVo.csNgtbManifestacaoManiVo.csCdtbProdutoAssuntoPrasVo.csCdtbAssuntoNivel1Asn1Vo.idAsn1CdAssuntoNivel1=' + asn1 + '&csNgtbReclamacaoManiRemaVo.csNgtbManifestacaoManiVo.csCdtbProdutoAssuntoPrasVo.csCdtbAssuntoNivel2Asn2Vo.idAsn2CdAssuntoNivel2=' + asn2;
	return url;
}

function habilitaPesquisaLote(idPesquisa,reloNrSequencia){
	
	try{
		
		ajax = new ConsultaBanco("br/com/plusoft/csi/adm/dao/xml/espec/X.xml","/csicrm/SetarPesquisaProduto.do");

		ajax.addField('idChamCdChamado', document.forms[0].idChamCdChamado.value);
		ajax.addField('maniNrSequencia', document.forms[0].maniNrSequencia.value);
		ajax.addField('idAsn1CdAssuntoNivel1Mani', document.forms[0].idAsn1CdAssuntoNivel1Mani.value);
		ajax.addField('idAsn2CdAssuntoNivel2Mani', document.forms[0].idAsn2CdAssuntoNivel2Mani.value);
		ajax.addField('reloNrSequencia', reloNrSequencia);
		ajax.addField('idPesqCdPesquisa', idPesquisa);
			
		ajax.executarConsulta(preparaPesquisa, false, true);
		
	}catch(e){
	}
}

function preparaPesquisa(ajax){
	try{
		
		idQuest = 0;
		rs = ajax.getRecordset();
	
		if(rs.next()){
			idQuest = rs.get('idPesqCdPesquisa');		
		}
		
		var wi;
		wi = parent.window.dialogArguments;
	
		wi.top.superior.AtivarPasta('SCRIPT');
		wi.top.principal.pesquisa.script.ifrmCmbPesquisa.location.href = "../../csicrm/ShowPesqCombo.do?usuario=location&acao=showAll&idPesqCdPesquisa=" + idQuest;
		carregaPesquisa();
	}catch(e){
	}
}

function carregaPesquisa() {
	var wi;
	wi = parent.window.dialogArguments;
	
	try{
		if (wi.top.principal.pesquisa.script.ifrmCmbPesquisa.pesquisaForm.idPesqCdPesquisa.value == ""){
			setTimeout('carregaPesquisa()', 200);
		}else{	
			wi.top.principal.pesquisa.script.ifrmCmbPesquisa.primeiroValor = "";
			wi.top.principal.pesquisa.script.ifrmCmbPesquisa.alertClear();
			window.close();
		}	
	}catch(e){
		setTimeout('carregaPesquisa()', 200);
	}

}


function fecharTelaProduto(action){	
	
	ajax = new ConsultaBanco("",action);	
	ajax.addField('idChamCdChamado', document.forms[0].idChamCdChamado.value);
	ajax.addField('maniNrSequencia', document.forms[0].maniNrSequencia.value);
	ajax.addField('idAsn1CdAssuntoNivel1Mani', document.forms[0].idAsn1CdAssuntoNivel1Mani.value);
	ajax.addField('idAsn2CdAssuntoNivel2Mani', document.forms[0].idAsn2CdAssuntoNivel2Mani.value);
	ajax.executarConsulta(fecharTelaProdutoOK, false, true);
	
}

function fecharTelaProdutoOK(ajax){	
	
	rs = ajax.getRecordset();
	
	var sucesso = "N";
	var mensagem = "";
	
	if(rs.next()){
		sucesso = rs.get('sucesso');
		mensagem = rs.get('mensagem');
	}
	
	if(sucesso == "S"){
		window.close();
	}else{
		alert(mensagem);
	}
}

