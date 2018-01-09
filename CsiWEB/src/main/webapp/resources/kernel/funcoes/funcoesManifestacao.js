function  Reset(){
	document.formulario.reset();
	return false;
}

/**
 * Array que contera todas as abas da tela para facilitar para exibir ou esconder as abas
 */
var abasTela = new Array();

/**
 * Ativa a aba clicada e exibe o seu conteï¿½do
 */
function AtivarPasta(pasta) {
	for(i = 0; i < abasTela.length; i++){
		if(abasTela[i] == pasta){
			document.getElementById("div"+ abasTela[i]).style.display = "block";
			document.getElementById("aba"+ abasTela[i]).className = "principalPstQuadroLinkSelecionado";
		}
		else{
			document.getElementById("div"+ abasTela[i]).style.display = "none";
			document.getElementById("aba"+ abasTela[i]).className = "principalPstQuadroLinkNormal";
		}
	}
}

/**
 * Grava as informações das abas especificas
 */
function gravarAbasEspec(){
	document.getElementById("camposManifEspec").innerHTML="";
	for(i = 0; i <= abasTela.length; i++){
		if(document.getElementById("ifrmEspec"+ i) != undefined){
			//Adicionado try catch para não dar erro em prototipos
			try{
				eval("ifrmEspec"+ i +".setValoresToForm(document);");
			}catch(x){}
		}	
	}
}

function Salva_CamposManif() {
	
	if(window.top.principal.idMatmCdManifTemp > 0) {
		manifestacaoForm.idMatmCdManifTemp.value = window.top.principal.idMatmCdManifTemp;
	}

	manifestacaoForm["csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.csCdtbClassifmaniClmaVo.idClmaCdClassifmanif"].value = manifestacaoManifestacao.manifestacaoDetalhe.manifestacaoForm["csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.csCdtbClassifmaniClmaVo.idClmaCdClassifmanif"].value;
	manifestacaoForm["csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.csCdtbStatusManifStmaVo.idStmaCdStatusmanif"].value = manifestacaoManifestacao.manifestacaoDetalhe.manifestacaoForm["csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.csCdtbStatusManifStmaVo.idStmaCdStatusmanif"].value;
	manifestacaoForm["csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.idComaCdConclusaoManif"].value = manifestacaoConclusao.manifestacaoForm.idComaCdConclusaoManif.value;
}

function Salva_CamposManifEspec() {
	//Adicionado try catch para não dar erro em prototipos
	try{
		manifestacaoManifestacao.manifestacaoDetalhe.ManifestacaoEspec.setValoresToForm(document);
	}catch(x){}
}

function Salva_ManifEspec() {
//	retencao.manifestacaoRetencao.lstRetencao.setValoresToForm(document);
}

function validaAbasEspec(){
	var especOk = true;
	document.getElementById("camposManifEspec").innerHTML="";
	for(i = 0; i <= abasTela.length; i++){
		if(document.getElementById("ifrmEspec"+ i) != undefined){
		try{
			especOk = eval("ifrmEspec"+ i +".validaEspec();");
		}catch(e){}
	}

	if(!especOk) 
		return false;
	}
	
	return true;
} 

function validaCamposFollowup() {
  
  var encerrado = true;
  if (manifestacaoFollowup.lstFollowup.document.all["codigo"] != null) {
		if (manifestacaoFollowup.lstFollowup.document.all["codigo"].length == undefined) {
			manifestacaoForm.foupNrSequencia.value = manifestacaoFollowup.lstFollowup.document.all["codigo"].value + ";";
			manifestacaoForm.idFuncCdFuncResponsavel.value = manifestacaoFollowup.lstFollowup.document.all["responsavel"].value + ";";
			manifestacaoForm.idEvfuCdEventoFollowup.value = manifestacaoFollowup.lstFollowup.document.all["evento"].value + ";";
			if (manifestacaoFollowup.lstFollowup.document.all["registro"].value != "")
				manifestacaoForm.foupDhRegistro.value = manifestacaoFollowup.lstFollowup.document.all["registro"].value + "|";
			else
				manifestacaoForm.foupDhRegistro.value = " " + "|";
			manifestacaoForm.foupDhPrevista.value = manifestacaoFollowup.lstFollowup.document.all["previsao"].value + "|";
			if (manifestacaoFollowup.lstFollowup.document.all["efetivo"].value != "")
				manifestacaoForm.foupDhEfetiva.value = manifestacaoFollowup.lstFollowup.document.all["efetivo"].value + "|";
			else
				manifestacaoForm.foupDhEfetiva.value = " " + "|";
				
			var val = wnd.descodificaStringHtml(manifestacaoFollowup.lstFollowup.document.all["historico"].value);
			//Gargamel (Chamado: 64669)
			//manifestacaoForm.foupTxHistorico.value = val + "|";
			
			while(val.indexOf("|") > -1) {
				val = val.replace(/\|/gim, "#PIPE#");
			}

			manifestacaoForm.foupTxHistorico.value = val+"|";
			//manifestacaoForm.foupTxHistorico.value = val.replace(/\|/gim,"#PIPE#") + "|";
			
			manifestacaoForm.idFuncCdFuncGerador.value = manifestacaoFollowup.lstFollowup.document.all["gerador"].value + ";";
			manifestacaoForm.inEncerramento.value = manifestacaoFollowup.lstFollowup.document.all["encerramento"].value + ";";
			if (manifestacaoFollowup.lstFollowup.document.all["encerramento"].value == "false")
				encerrado = false;
				
			manifestacaoForm.foupInEnvio.value = manifestacaoFollowup.lstFollowup.document.all["foupInEnvio"].checked?"S|":"N|";

			manifestacaoForm.idFuncCdEncerramento.value = manifestacaoFollowup.lstFollowup.document.all["idFuncCdEncerramento"].value + ";";
			
			manifestacaoForm.foupCdManiftemp.value =  manifestacaoFollowup.lstFollowup.document.all["matm"].value + ";";
		} else {
			for (var i = 0; i < manifestacaoFollowup.lstFollowup.document.all["codigo"].length; i++) {
				manifestacaoForm.foupNrSequencia.value += manifestacaoFollowup.lstFollowup.document.all["codigo"][i].value + ";";
				manifestacaoForm.idFuncCdFuncResponsavel.value += manifestacaoFollowup.lstFollowup.document.all["responsavel"][i].value + ";";
				manifestacaoForm.idEvfuCdEventoFollowup.value += manifestacaoFollowup.lstFollowup.document.all["evento"][i].value + ";";
				if (manifestacaoFollowup.lstFollowup.document.all["registro"][i].value != "")
					manifestacaoForm.foupDhRegistro.value += manifestacaoFollowup.lstFollowup.document.all["registro"][i].value + "|";
				else
					manifestacaoForm.foupDhRegistro.value += " " + "|";
				manifestacaoForm.foupDhPrevista.value += manifestacaoFollowup.lstFollowup.document.all["previsao"][i].value + "|";
				if (manifestacaoFollowup.lstFollowup.document.all["efetivo"][i].value != "")
					manifestacaoForm.foupDhEfetiva.value += manifestacaoFollowup.lstFollowup.document.all["efetivo"][i].value + "|";
				else
					manifestacaoForm.foupDhEfetiva.value += " " + "|";
					
				var val = wnd.descodificaStringHtml(manifestacaoFollowup.lstFollowup.document.all["historico"][i].value);	
				//Gargamel (Chamado: 64669)
				//manifestacaoForm.foupTxHistorico.value += val + "|";
				while(val.indexOf("|") > -1) {
					val = val.replace(/\|/gim, "#PIPE#");
				}
				manifestacaoForm.foupTxHistorico.value += val+"|";
				
				manifestacaoForm.idFuncCdFuncGerador.value += manifestacaoFollowup.lstFollowup.document.all["gerador"][i].value + ";";
				manifestacaoForm.inEncerramento.value += manifestacaoFollowup.lstFollowup.document.all["encerramento"][i].value + ";";
				if (manifestacaoFollowup.lstFollowup.document.all["encerramento"][i].value == "false")
					encerrado = false;
					
				manifestacaoForm.foupInEnvio.value += manifestacaoFollowup.lstFollowup.document.all["foupInEnvio"][i].checked?"S|":"N|";

				manifestacaoForm.idFuncCdEncerramento.value += manifestacaoFollowup.lstFollowup.document.all["idFuncCdEncerramento"][i].value + ";";
				manifestacaoForm.foupCdManiftemp.value +=  manifestacaoFollowup.lstFollowup.document.all["matm"][i].value + ";";
			}
		}
	}
	manifestacaoForm.followupExcluidos.value = manifestacaoFollowup.lstFollowup.document.all["followupExcluidos"].value;
	return encerrado;
}

function limpaCampos() {
  manifestacaoForm["csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.maniTxManifestacao"].value = "";
  manifestacaoForm["csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.maniDhPrevisao"].value = "";
  manifestacaoForm["csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.maniInGrave"].value = "";
  manifestacaoForm["csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.maniDhPendente"].value = "";
  manifestacaoForm["csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.maniDhRecebida"].value = "";

  manifestacaoForm.idFuncCdFuncionario.value = "";
  manifestacaoForm.idMadsNrSequencial.value = "";
  manifestacaoForm.madsInParaCc.value = "";
  manifestacaoForm.madsInMail.value = "";
  manifestacaoForm.madsInPapel.value = "";
  manifestacaoForm.madsDhEnvio.value = "";
  manifestacaoForm.destinatariosExcluidos.value = "";
  
  manifestacaoForm.foupNrSequencia.value = "";
  manifestacaoForm.idFuncCdFuncResponsavel.value = "";
  manifestacaoForm.idEvfuCdEventoFollowup.value = "";
  manifestacaoForm.foupDhRegistro.value = "";
  manifestacaoForm.foupDhPrevista.value = "";
  manifestacaoForm.foupDhEfetiva.value = "";
  manifestacaoForm.foupTxHistorico.value = "";
  manifestacaoForm.idFuncCdFuncGerador.value = "";
  manifestacaoForm.inEncerramento.value = "";
  manifestacaoForm.followupExcluidos.value = "";

  manifestacaoForm.idFuncCdEncerramento.value = "";

  dvResponder.style.visibility = "hidden";
  
  manifestacaoForm["csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.maniTxResposta"].value = "";
  manifestacaoForm["csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.idGrsaCdGrauSatisfacao"].value = "";
  manifestacaoForm["csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.maniDhEncerramento"].value = "";

  manifestacaoForm["csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.maniInAtendido"].value = "";
  manifestacaoForm["csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.maniDhFatura"].value = "";
  manifestacaoForm["csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.maniNrFatura"].value = "";
  
}

function getChkAssunto(){
	
	try{
		if (manifestacaoForm.chkAssunto.checked == true)
			return "N";
		else{
			return "S";
		}
	}
	catch(x){
		return "S";
	}
	
}

function preparaPesquisa(){
	var idPesq;
	idPesq = manifestacaoForm['csAstbProdutoManifPrmaVo.csCdtbPesquisaPesqVo.idPesqCdPesquisa'].value;

	if (idPesq > 0){
		bCarregaPesquisa = true;
		window.top.superior.AtivarPasta('SCRIPT');
	//	carregaPesquisa();
		//window.top.principal.pesquisa.script.ifrmCmbPesquisa.pesquisaForm.idPesqCdPesquisa.value = idPesq;
		//window.top.principal.pesquisa.script.ifrmCmbPesquisa.alertClear();
	}

	setTimeout("window.top.principal.pesquisa.script.ifrmCmbPesquisa.location.href = 'ShowPesqCombo.do?usuario=location&acao=showAll&idPesqCdPesquisa="+ idPesq +"&idEmprCdEmpresa="+ window.top.superior.ifrmCmbEmpresa.empresaForm.csCdtbEmpresaEmpr.value +"'", 1000);
}


function getIdPesq(){
	return manifestacaoForm['csAstbProdutoManifPrmaVo.csCdtbPesquisaPesqVo.idPesqCdPesquisa'].value;
}

/*****************************************************************************************************************
 Para carregar a pesquisa na tela ao termino de carregar o combo de pesquisas quando clicar no icone interrogação
*****************************************************************************************************************/
var bCarregaPesquisa = false;
function carregarPesquisa(){
	return bCarregaPesquisa;
}

function setCarregarPesquisa(b){
	bCarregaPesquisa = b;
}

function ConvJS2HTML(cSource) {
	var cRet = '';
	cRet = cSource;
	cRet = cRet.replace(/\n/gim,'<br />');
	cRet = cRet.replace(/\b/gim,'');
	cRet = cRet.replace(/\f/gim,'');
	cRet = cRet.replace(/\r/gim,'');
	cRet = cRet.replace(/\t/gim,'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;');
	return cRet;
}

function responderClassificador(frm) {
	
	if(manifestacaoForm['csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.csCdtbProdutoAssuntoPrasVo.idAsnCdAssuntoNivel'].value != "" && manifestacaoForm['csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.csCdtbProdutoAssuntoPrasVo.idAsnCdAssuntoNivel'].value != "0"){
		var cProduto = manifestacaoForm['csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.csCdtbProdutoAssuntoPrasVo.idAsnCdAssuntoNivel'].value;	
		var vProduto = new Array();
		vProduto = cProduto.split("@");
		
		correspondenciaForm["csNgtbCorrespondenciCorrVo.maniNrSequencia"].value = manifestacaoForm['csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.maniNrSequencia'].value;
		correspondenciaForm["csNgtbCorrespondenciCorrVo.idAsn1CdAssuntonivel1"].value = vProduto[0];
		correspondenciaForm["csNgtbCorrespondenciCorrVo.idAsn2CdAssuntonivel2"].value = vProduto[1];
	}
	
	correspondenciaForm["csNgtbCorrespondenciCorrVo.idPessCdPessoa"].value = window.top.principal.pessoa.dadosPessoa.pessoaForm.idPessCdPessoa.value;
	correspondenciaForm["idEmprCdEmpresa"].value = window.top.superior.ifrmCmbEmpresa.empresaForm.csCdtbEmpresaEmpr.value;
	correspondenciaForm["idMatmCdManiftemp"].value = frm.matm.value;
	correspondenciaForm["csNgtbCorrespondenciCorrVo.corrDsEmailDe"].value = "";
	correspondenciaForm["csNgtbCorrespondenciCorrVo.corrDsEmailPara"].value = frm.matmDsEmail.value;
	correspondenciaForm["csNgtbCorrespondenciCorrVo.corrDsEmailCC"].value = frm.matmDsCc.value;
	correspondenciaForm["csNgtbCorrespondenciCorrVo.corrDsTitulo"].value = frm.matmDsSubject.value;
	correspondenciaForm["csNgtbCorrespondenciCorrVo.corrTxCorrespondencia"].value = ConvJS2HTML(frm.text.value);
	
	window.open("", "Documento", "width=950,height=600,top=50,left=50");
	correspondenciaForm.target = "Documento";
	correspondenciaForm.submit();
}

function chamaCarta() {

	if(manifestacaoForm['csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.csNgtbChamadoChamVo.idChamCdChamado'].value > 0){

		if(manifestacaoForm.idMatmCdManifTemp.value != "" && manifestacaoForm.idMatmCdManifTemp.value != "0"){
			
			//Chamado 75653 - Vinicius - Não estava gravando os maniNrSequencia / idAsn1CdAssuntonivel1 e idAsn2CdAssuntonivel2
			if(manifestacaoForm['csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.csCdtbProdutoAssuntoPrasVo.idAsnCdAssuntoNivel'].value != "" && manifestacaoForm['csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.csCdtbProdutoAssuntoPrasVo.idAsnCdAssuntoNivel'].value != "0"){
				var cProduto = manifestacaoForm['csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.csCdtbProdutoAssuntoPrasVo.idAsnCdAssuntoNivel'].value;	
				var vProduto = new Array();
				vProduto = cProduto.split("@");
				
				correspondenciaForm["csNgtbCorrespondenciCorrVo.maniNrSequencia"].value = manifestacaoForm['csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.maniNrSequencia'].value;
				correspondenciaForm["csNgtbCorrespondenciCorrVo.idAsn1CdAssuntonivel1"].value = vProduto[0];
				correspondenciaForm["csNgtbCorrespondenciCorrVo.idAsn2CdAssuntonivel2"].value = vProduto[1];
			}
			
			correspondenciaForm["csNgtbCorrespondenciCorrVo.idPessCdPessoa"].value = window.top.principal.pessoa.dadosPessoa.pessoaForm.idPessCdPessoa.value;
			correspondenciaForm["idEmprCdEmpresa"].value = window.top.superior.ifrmCmbEmpresa.empresaForm.csCdtbEmpresaEmpr.value;
			correspondenciaForm["idMatmCdManiftemp"].value = manifestacaoForm.idMatmCdManifTemp.value;
			correspondenciaForm["csNgtbCorrespondenciCorrVo.corrDsEmailDe"].value = "";
			correspondenciaForm["csNgtbCorrespondenciCorrVo.corrDsEmailPara"].value = manifestacaoForm.matmDsEmail.value;
			correspondenciaForm["csNgtbCorrespondenciCorrVo.corrDsEmailCC"].value = manifestacaoForm.matmDsCc.value;
			correspondenciaForm["csNgtbCorrespondenciCorrVo.corrDsTitulo"].value = manifestacaoForm.matmDsSubject.value;
			correspondenciaForm["csNgtbCorrespondenciCorrVo.corrTxCorrespondencia"].value = ConvJS2HTML(manifestacaoManifestacao.manifestacaoDetalhe.manifestacaoForm.txtDescricao.value);

			window.open("", "Documento", "width=950,height=600,top=50,left=50");
			correspondenciaForm.target = "Documento";
			correspondenciaForm.submit();
		}
		else{
			var cProduto = manifestacaoForm['csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.csCdtbProdutoAssuntoPrasVo.idAsnCdAssuntoNivel'].value;	
			var vProduto = new Array();
			vProduto = cProduto.split("@");
						
			var idDocumento = 0;
			if(lstManifestacao.manifestacaoForm['csAstbDetManifestacaoDtmaVo.csCdtbTpManifestacaoTpmaVo.csCdtbDocumentoDocuVo.idDocuCdDocumento'].value > 0){
				idDocumento = lstManifestacao.manifestacaoForm['csAstbDetManifestacaoDtmaVo.csCdtbTpManifestacaoTpmaVo.csCdtbDocumentoDocuVo.idDocuCdDocumento'].value;
			}else if(manifestacaoForm['csAstbDetManifestacaoDtmaVo.csCdtbTpManifestacaoTpmaVo.csCdtbDocumentoDocuVo.idDocuCdDocumento'].value > 0){
				idDocumento = manifestacaoForm['csAstbDetManifestacaoDtmaVo.csCdtbTpManifestacaoTpmaVo.csCdtbDocumentoDocuVo.idDocuCdDocumento'].value;
			}
			
			if(idDocumento > 0){
				window.open('Correspondencia.do?fcksource=true&acao=showAll&csNgtbCorrespondenciCorrVo.corrInEnviaEmail=S&tela=compose&csNgtbCorrespondenciCorrVo.idPessCdPessoa=' + window.top.principal.pessoa.dadosPessoa.pessoaForm.idPessCdPessoa.value + "&csNgtbCorrespondenciCorrVo.idChamCdChamado=" + manifestacaoForm['csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.csNgtbChamadoChamVo.idChamCdChamado'].value + "&csNgtbCorrespondenciCorrVo.maniNrSequencia=" + manifestacaoForm['csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.maniNrSequencia'].value + "&csNgtbCorrespondenciCorrVo.idAsn1CdAssuntonivel1=" + vProduto[0] + "&csNgtbCorrespondenciCorrVo.idAsn2CdAssuntonivel2=" + vProduto[1] + "&csNgtbCorrespondenciCorrVo.csCdtbDocumentoDocuVo.idDocuCdDocumento=" + idDocumento + '&idEmprCdEmpresa=' + window.top.superior.ifrmCmbEmpresa.empresaForm.csCdtbEmpresaEmpr.value + "&limparSessaoAnexos=S",'Documento','width=950,height=600,top=150,left=85');
			}else{
				//window.open('Correspondencia.do?tela=compose&csNgtbCorrespondenciCorrVo.corrInEnviaEmail=S&csNgtbCorrespondenciCorrVo.idPessCdPessoa=' + window.top.principal.pessoa.dadosPessoa.pessoaForm.idPessCdPessoa.value + "&csNgtbCorrespondenciCorrVo.idChamCdChamado=" + manifestacaoForm['csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.csNgtbChamadoChamVo.idChamCdChamado'].value + "&csNgtbCorrespondenciCorrVo.maniNrSequencia=" + manifestacaoForm['csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.maniNrSequencia'].value + "&csNgtbCorrespondenciCorrVo.idAsn1CdAssuntonivel1=" + vProduto[0] + "&csNgtbCorrespondenciCorrVo.idAsn2CdAssuntonivel2=" + vProduto[1] + "&csNgtbCorrespondenciCorrVo.corrTxCorrespondencia=" + lstManifestacao.manifestacaoForm['csAstbDetManifestacaoDtmaVo.csCdtbTpManifestacaoTpmaVo.tpmaTxOrientacao'].value,'Documento','width=850,height=494,top=150,left=85');
				//passando a acao showall para nao limpar a tela ao carregar.
				window.open('Correspondencia.do?fcksource=true&acao=showAll&tela=compose&csNgtbCorrespondenciCorrVo.corrInEnviaEmail=S&csNgtbCorrespondenciCorrVo.idPessCdPessoa=' + window.top.principal.pessoa.dadosPessoa.pessoaForm.idPessCdPessoa.value + "&csNgtbCorrespondenciCorrVo.idChamCdChamado=" + manifestacaoForm['csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.csNgtbChamadoChamVo.idChamCdChamado'].value + "&csNgtbCorrespondenciCorrVo.maniNrSequencia=" + manifestacaoForm['csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.maniNrSequencia'].value + "&csNgtbCorrespondenciCorrVo.idAsn1CdAssuntonivel1=" + vProduto[0] + "&csNgtbCorrespondenciCorrVo.idAsn2CdAssuntonivel2=" + vProduto[1] + "&campo=lstManifestacao.manifestacaoForm['csAstbDetManifestacaoDtmaVo.csCdtbTpManifestacaoTpmaVo.tpmaTxOrientacao']" + '&idEmprCdEmpresa=' + window.top.superior.ifrmCmbEmpresa.empresaForm.csCdtbEmpresaEmpr.value + "&limparSessaoAnexos=S",'Documento','width=950,height=600,top=150,left=85');
			}
		}
	}
}



/**
 * Cria aba de acordo com os botões nao modal cadastrados vinculados a tipo de manifestacao
 * e o iframe para carregar o seu conteudo (link)
 */
var conteudoAbas = "";
var larguraAbas = 0;

var abasHtml = "";

function criarAba(descricao, link){
	
	abasTela[abasTela.length] = descricao;
		
	conteudoAbas += "<td class=\"principalPstQuadroLinkNormal\" id=\"aba"+ descricao +"\" onClick=\"try{ifrmEspec"+ abasTela.length + ".funcaoAbaEspec()}catch(e){};AtivarPasta('"+ descricao +"')\">"+ descricao +"</td>";
	
	larguraAbas += 100;
		
	tdBotoes.innerHTML = "<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">"+ conteudoAbas +"</table>";
	
	//Os iframes nunca sÃ£o apagados para nao perder o conteudo preenchido
	if(document.getElementById("div"+ descricao) == null){
		abasHtml += "<div id=\"div"+ descricao +"\" style=\"width:99%; height:225px; display: none\">" + 
			   "<iframe name=\"ifrmEspec"+ abasTela.length +"\" id=\"ifrmEspec"+ abasTela.length +"\" src=\""+link+"\" width=100% height=100% scrolling=\"no\" frameborder=\"0\" marginwidth=\"0\" marginheight=\"0\" ></iframe></div>";
		
	
	}
	
	divBotoes.style.display = "block";
	tdBotoes.width = larguraAbas;
}

function carregarAbas() {
	divBotoes.innerHTML = abasHtml;
	
	abasHtml = "";
}


/**
 * Reseta as abas removendo as abas especÃ­ficas que podem ter sido adicionadas
 */
function resetAbas(){
	AtivarPasta("MANIFESTACAO");
	abasTela = new Array();
	abasTela[0] = "MANIFESTACAO";
	abasTela[1] = "DESTINATARIO";
	abasTela[2] = "FOLLOWUP";
	abasTela[3] = "CONCLUSAO";
	conteudoAbas = "";
	larguraAbas = 0;
	
	tdBotoes.innerHTML = "";
	try{tdBotoes.width = "1";}catch(x){}
}


/**
* Atualiza o combo de linha de acordo com a empresa selecionada
*/
var nAtualizaCmbLinha = 0;
function atualizaCmbLinha(){
	try{
		document.getElementById("cmbLinha").src = "Manifestacao.do"+
			"?acao=showAll&tela=cmbLinha"+
			"&csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.csCdtbProdutoAssuntoPrasVo.prasInProdutoAssunto=" + getChkAssunto() +
			"&idEmprCdEmpresa="+ window.top.superior.ifrmCmbEmpresa.empresaForm.csCdtbEmpresaEmpr.value +
			"&csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.csCdtbProdutoAssuntoPrasVo.csCdtbLinhaLinhVo.idLinhCdLinha="+ manifestacaoForm["csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.csCdtbProdutoAssuntoPrasVo.csCdtbLinhaLinhVo.idLinhCdLinha"].value;
	}
	catch(x){
		if(nAtualizaCmbLinha < 30){
			nAtualizaCmbLinha++;
			setTimeout("atualizaCmbLinha();", 500);
		}
		else{
			alert("Erro em atualizaCmbLinha()\n"+ x +" - "+ x.description);
		}
	}
}


/**
* Atualiza o combo de linha de acordo com a empresa selecionada
*/
var nAtualizaCmbManifestacao = 0;
function atualizaCmbManifestacao(){
	try{
		document.getElementById("cmbManifestacao").src = "Manifestacao.do?acao=showAll&tela=cmbManifestacao&idEmprCdEmpresa="+ window.top.superior.ifrmCmbEmpresa.empresaForm.csCdtbEmpresaEmpr.value;
	}
	catch(x){
		if(nAtualizaCmbManifestacao < 30){
			nAtualizaCmbManifestacao++;
			setTimeout("atualizaCmbManifestacao();", 500);
		}
		else{
			alert("Erro em atualizaCmbManifestacao()\n"+ x +" - "+ x.description);
		}
	}
}


function setValoresProduto(idLinh,idAsn1,idAsn2, asn2){
	cmbLinha.manifestacaoForm["csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.csCdtbProdutoAssuntoPrasVo.csCdtbLinhaLinhVo.idLinhCdLinha"].value = idLinh;
	cmbLinha.manifestacaoForm["csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.csCdtbProdutoAssuntoPrasVo.csCdtbAssuntoNivel1Asn1Vo.idAsn1CdAssuntoNivel1"].value = idAsn1;
	manifestacaoForm["csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.csCdtbProdutoAssuntoPrasVo.csCdtbAssuntoNivel2Asn2Vo.idAsn2CdAssuntoNivel2"].value = idAsn2;
	manifestacaoForm["csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.csCdtbProdutoAssuntoPrasVo.idAsnCdAssuntoNivel"].value = idAsn1 + "@" + idAsn2;
	edicaoComposicao = true;
	cmbLinha.submeteForm();
}


function abreManifRecorrente(){	
	var asn1;
	var asn2;
	var asnArry;
	var idChamCdChamado;
	var maniNrSequencia;
	idChamCdChamado = manifestacaoForm["csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.csNgtbChamadoChamVo.idChamCdChamado"].value;
	maniNrSequencia = manifestacaoForm["csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.maniNrSequencia"].value;
	asnArry = manifestacaoForm["csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.csCdtbProdutoAssuntoPrasVo.idAsnCdAssuntoNivel"].value.split("@");
	asn1 = asnArry[0];
	asn2 = asnArry[1];
	showModalDialog('ManifestacaoRecorrente.do?acao=consultar&tela=ifrmDetalheManifestacaoRecorrente&csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.csNgtbChamadoChamVo.idChamCdChamado='+idChamCdChamado+'&csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.maniNrSequencia='+maniNrSequencia+'&csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.csCdtbProdutoAssuntoPrasVo.csCdtbAssuntoNivel1Asn1Vo.idAsn1CdAssuntoNivel1='+asn1+'&csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.csCdtbProdutoAssuntoPrasVo.csCdtbAssuntoNivel2Asn2Vo.idAsn2CdAssuntoNivel2='+asn2, window,'help:no;scroll:no;Status:NO;dialogWidth:850px;dialogHeight:365px,dialogTop:0px,dialogLeft:650px');
}


function abreManifReincidente(){
	var asn1;
	var asn2;
	var asnArry;
	var idTpmaCdTpManifestacao;
	var idChamCdChamado;
	idTpmaCdTpManifestacao = cmbTipoManifestacao.manifestacaoForm["csAstbDetManifestacaoDtmaVo.csCdtbTpManifestacaoTpmaVo.idTpmaCdTpManifestacao"].value;
	asnArry = manifestacaoForm["csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.csCdtbProdutoAssuntoPrasVo.idAsnCdAssuntoNivel"].value.split("@");
	idChamCdChamado = manifestacaoForm["csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.csNgtbChamadoChamVo.idChamCdChamado"].value;
	asn1 = asnArry[0];
	asn2 = asnArry[1];
	showModalDialog('ManifestacaoReincidente.do?acao=consultar&tela=ifrmDetalheManifestacaoReincidente&csAstbDetManifestacaoDtmaVo.csCdtbTpManifestacaoTpmaVo.idTpmaCdTpManifestacao='+idTpmaCdTpManifestacao+'&csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.csCdtbProdutoAssuntoPrasVo.csCdtbAssuntoNivel1Asn1Vo.idAsn1CdAssuntoNivel1='+asn1+'&csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.csCdtbProdutoAssuntoPrasVo.csCdtbAssuntoNivel2Asn2Vo.idAsn2CdAssuntoNivel2='+asn2+'&csAstbDetManifestacaoDtmaVo.csNgtbManifestacaoManiVo.csNgtbChamadoChamVo.idChamCdChamado='+idChamCdChamado,window,'help:no;scroll:no;Status:NO;dialogWidth:850px;dialogHeight:365px,dialogTop:0px,dialogLeft:650px');
}


function scrollAbasMais(){
	document.getElementById("dvAbasManif").scrollLeft += 100;
}

function scrollAbasMenos(){
	document.getElementById("dvAbasManif").scrollLeft -= 100;
}
	