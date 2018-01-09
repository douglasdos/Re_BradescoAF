

var alterouEndereco = false;
var alterouTelefone = false;
var alterouEmail = false;

//Guarda o numero de abas dinâmicas
var numAbasDinamicas = new Number(0);

function MM_reloadPage(init) {  //reloads the window if Nav4 resized
  if (init==true) with (navigator) {if ((appName=="Netscape")&&(parseInt(appVersion)==4)) {
    document.MM_pgW=innerWidth; document.MM_pgH=innerHeight; onresize=MM_reloadPage; }}
  else if (innerWidth!=document.MM_pgW || innerHeight!=document.MM_pgH) location.reload();
}
MM_reloadPage(true);
// 

try {
	parent.parent.parent.document.all.item('Layer1').style.visibility = 'visible';
} catch(e) { }



var bEnvia = true;
bSemPermissao=false;


function MM_goToURL() { //v3.0
  var i, args=MM_goToURL.arguments;
  for (i=0; i<(args.length-1); i+=2) eval(args[i]+".location='"+args[i+1]+"'");
}

function Link(click1,click2){
	window.parent.document.all.item("dadoPessoa").src = click1
	window.parent.all.item("complemento").src = click2

}

function  Reset(){
	document.formulario.reset();
	return false;
}

function SetClassFolder(pasta, estilo) {
 stracao = "document.all.item(\"" + pasta + "\").className = '" + estilo + "'";
 eval(stracao);
  } 
  
  function ativarAbasDinamicas(pasta) {
	var numAba = pasta.substring(3);	
	try {
		for (i = 0; i < numAbasDinamicas; i++) {
			if (i == eval(numAba)) {
				objIfrm = document.getElementById("ifrm" + i);
				
				link = objIfrm.src;

				var pos = link.indexOf('idPessCdPessoa=');
				if (pos >= 0) {
					link = link.replace("idPessCdPessoa=", "idPessCdPessoa=" + pessoaForm.idPessCdPessoa.value);
				}
				
				var pos2 = link.indexOf('pessCdCorporativo=');
				if (pos2 >= 0) {
					link = link.replace("pessCdCorporativo=", "pessCdCorporativo=" + pessoaForm.pessCdCorporativo.value);
				}
				objIfrm.location = link;
				
				MM_showHideLayers('div' + i,''); 
			}
			else {
				MM_showHideLayers('div' + i,'none');
				if(eval("document.all.item(\"aba" + i + "\").className") != '')
				SetClassFolder('aba' + i , 'principalPstQuadroLinkNormalMAIOR');
			}
		}
	} catch(e) {
		for (i = 0; i < numAbasDinamicas; i++) {
			MM_showHideLayers('div' + i,'none');
			if(eval("document.all.item(\"aba" + i + "\").className") != '')
			SetClassFolder('aba' + i , 'principalPstQuadroLinkNormalMAIOR');
		}
	}
	
	try{
		var iframeEspec = eval("ifrm" + numAba);
		iframeEspec.funcaoAbaEspec();
	}catch(e){}
	
}



function getDadosAdicionais() {

	especialidadeHidden.innerHTML = '';
	
	

}


function getCamposEspecificos(){

	var retorno = true;
	
	for (var i = 0; i < numAbasDinamicas; i++){
		var iframeEspec = eval("ifrm" + i);	
		var isFormEspec = false;
		try{
			isFormEspec = iframeEspec.isFormEspec();			
		}catch(e){}
		
		if (isFormEspec){
			var validaCamposEspec = false;			
			validaCamposEspec = iframeEspec.validaCamposEspec();
			if (!validaCamposEspec){
				retorno = false;
				break;
			}else{
				//Adicionado try catch para n�o dar erro em prototipos
				try{
					iframeEspec.setValoresToForm(document);
				}
				catch(x){}
			}
		}			
	}
	
	return retorno;
}

function truncaCampos() {
  wnd.textCounter(pessoaForm.consDsConsRegional, 10);
  wnd.textCounter(pessoaForm.consDsUfConsRegional, 2);
  wnd.textCounter(pessoaForm.pessCdInternetId, 10);
  wnd.textCounter(pessoaForm.pessCdInternetPwd, 10);
  wnd.textCounter(pessoaForm.pessDsBanco, 50);
  wnd.textCounter(pessoaForm.pessCdBanco, 10);
  wnd.textCounter(pessoaForm.pessCdAgencia, 10);
  wnd.textCounter(pessoaForm.pessDsAgencia, 50);
  wnd.textCounter(pessoaForm.pessDsCodigoEPharma, 30);
  wnd.textCounter(pessoaForm.pessDsCartaoEPharma, 40);
  wnd.textCounter(pessoaForm.pessCdInternetAlt, 40);
  wnd.textCounter(pessoaForm.pessInColecionador, 1);
  wnd.textCounter(pessoaForm.consDsCodigoMedico, 15);
  wnd.textCounter(pessoaForm.pessNmPessoa, 80);
  wnd.textCounter(pessoaForm.pessNmApelido, 60);
}

function Fechar(){
	novo();
}

function abrirNI(id){
	parent.parent.parent.document.all.item('Layer1').style.visibility = 'visible';
	pessoaForm.action = pessoaForm.action;
	parent.abrirNI = true;
	abrir(id);
}

function abrirNICont(id, cont){
	parent.parent.parent.document.all.item('Layer1').style.visibility = 'visible';
	pessoaForm.action = pessoaForm.action;
	abrirCont(id, cont);
}

var controleHabilitaComboCampanha = 0;
function habilitaComboCampanha(){
	try{
		//Habilita o combo de campanha se tiver alguma pessoa selecionada
		top.superiorBarra.barraCamp.ifrmCsCdtbPublicoPubl.habilitaComboCampanha();
	}catch(e){ 
		if(controleHabilitaComboCampanha == 10){
			alert("Erro na funcao habilitaComboCampanha():\n"+ e.message);
		}
		else if(controleHabilitaComboCampanha < 10){
			setTimeout("habilitaComboCampanha();", 500);
		}
		
		controleHabilitaComboCampanha++;
	}
}

var nCountMostrarDetalhe = 0;
function mostrarDetalhe(){
	try{
		//Caso tenha detalhe da pessoa a mesma deve ser aparesentada no canto superior 
		window.top.superiorBarra.barraNome.document.getElementById("detPessoa").style.visibility = 'hidden';	
		if (pessoaForm.detPessoa.value != "" && pessoaForm.detPessoa.value != "null"){
			window.top.superiorBarra.barraNome.document.getElementById("imgDetPessoa").title = pessoaForm.detPessoa.value;
			window.top.superiorBarra.barraNome.document.getElementById("detPessoa").style.visibility = 'visible';
		}
	}catch(e){
		if(nCountMostrarDetalhe < 9){
			setTimeout('mostrarDetalhe()',500);
			nCountMostrarDetalhe++;
		}else{
			alert('erro mostrarDetalhe() ' + e.message);
		}
	}
}

function disabledCorporativo(){
	bSemPermissao=true;
	pessoaForm.idTpPublico.disabled=true;
	pessoaForm.optPessoaFisica.disabled=true;
	pessoaForm.optPessoaJuridica.disabled=true;
	pessoaForm.pessNmPessoa.disabled=true;
	pessoaForm.pessNmApelido.disabled=true;
	pessoaForm.Sexo[0].disabled=true;
	pessoaForm.Sexo[1].disabled=true;
	pessoaForm.pessDsCpf.disabled=true;
	pessoaForm.pessDsRg.disabled=true;
	pessoaForm.pessDsOrgemissrg.disabled=true;
	pessoaForm.pessDhNascimento.disabled=true;
	pessoaForm.txtIdade.disabled=true;
	pessoaForm.pessDsCgc.disabled = true;
	pessoaForm.pessDsIe.disabled = true;
	pessoaForm.idEsciCdEstadocil.disabled=true;

	pessoaForm.pessCdBanco.disabled = true;
	cmbAgencia.document.dadosAdicionaisPessForm.pessCdAgencia.disabled = true;
	pessoaForm.pessCdBanco.disabled = true;
	pessoaForm.pessCdAgencia.disabled = true;
	pessoaForm.pessDsConta.disabled = true;
	pessoaForm.pessDsTitularidade.disabled = true;
	pessoaForm.pessDsCpfTitular.disabled = true;
	pessoaForm.pessDsRgTitular.disabled = true;
	pessoaForm.pessNmFiliacao.disabled = true;
	
	pessoaForm.cmbTipoDocumentoPF.disabled = true;
	pessoaForm.txtDocumentoPF.disabled = true;
	pessoaForm.txtDataEmissaoPF.disabled = true;
	pessoaForm.cmbTipoDocumentoPJ.disabled = true;
	pessoaForm.txtDocumentoPJ.disabled = true;
	pessoaForm.txtDataEmissaoPJ.disabled = true;

	pessoaForm.idTratCdTipotratamento.disabled = true;
}

function enableCorporativo(){
	bSemPermissao=true;
	pessoaForm.idTpPublico.disabled=false;
	pessoaForm.optPessoaFisica.disabled=false;
	pessoaForm.optPessoaJuridica.disabled=false;
	pessoaForm.pessNmPessoa.disabled=false;
	pessoaForm.pessNmApelido.disabled=false;
	pessoaForm.Sexo[0].disabled=false;
	pessoaForm.Sexo[1].disabled=false;
	pessoaForm.pessDsCpf.disabled=false;
	pessoaForm.pessDsRg.disabled=false;
	pessoaForm.pessDsOrgemissrg.disabled=false;
	pessoaForm.pessDhNascimento.disabled=false;
	pessoaForm.txtIdade.disabled=false;
	pessoaForm.pessDsCgc.disabled = false;
	pessoaForm.pessDsIe.disabled = false;
	pessoaForm.idEsciCdEstadocil.disabled=false;

	pessoaForm.pessCdBanco.disabled = false;
	cmbAgencia.document.dadosAdicionaisPessForm.pessCdAgencia.disabled = false;
	pessoaForm.pessCdBanco.disabled = false;
	pessoaForm.pessCdAgencia.disabled = false;
	pessoaForm.pessDsConta.disabled = false;
	pessoaForm.pessDsTitularidade.disabled = false;
	pessoaForm.pessDsCpfTitular.disabled = false;
	pessoaForm.pessDsRgTitular.disabled = false;
	pessoaForm.pessNmFiliacao.disabled = false;
	
	pessoaForm.cmbTipoDocumentoPF.disabled = false;
	pessoaForm.txtDocumentoPF.disabled = false;
	pessoaForm.txtDataEmissaoPF.disabled = false;
	pessoaForm.cmbTipoDocumentoPJ.disabled = false;
	pessoaForm.txtDocumentoPJ.disabled = false;
	pessoaForm.txtDataEmissaoPJ.disabled = false;
	
	pessoaForm.idTratCdTipotratamento.disabled = false;
}

function disabledAll(){
	bSemPermissao=true;
	pessoaForm.idTpPublico.disabled=true;
	pessoaForm.idTratCdTipotratamento.disabled=true;
	pessoaForm.imgTipoPublico.style.display="none";
	pessoaForm.optPessoaFisica.disabled=true;
	pessoaForm.optPessoaJuridica.disabled=true;
	pessoaForm.pessNmPessoa.disabled=true;
	pessoaForm.pessNmApelido.disabled=true;
	pessoaForm.Sexo[0].disabled=true;
	pessoaForm.Sexo[1].disabled=true;
	pessoaForm.pessDsCpf.disabled=true;
	pessoaForm.pessDsRg.disabled=true;
	pessoaForm.pessDsOrgemissrg.disabled=true;
	pessoaForm.pessDhNascimento.disabled=true;
	pessoaForm.txtIdade.disabled=true;
	pessoaForm.pessDsCgc.disabled = true;
	pessoaForm.pessDsIe.disabled = true;
	pessoaForm.idEsciCdEstadocil.disabled=true;
	
	pessoaForm.pessInTelefone.disabled=true;
	pessoaForm.pessInEmail.disabled=true;
	pessoaForm.pessInCarta.disabled=true;
	
	document.getElementById("btsalvar").disabled = true;
	document.getElementById("btsalvar").className = 'geralImgDisable';
	
	pessoaForm.pessCdBanco.disabled = true;
	cmbAgencia.document.getElementById("dadosAdicionaisForm").pessCdAgencia.disabled = true;
	pessoaForm.pessCdBanco.disabled = true;
	pessoaForm.pessCdAgencia.disabled = true;
	pessoaForm.pessDsConta.disabled = true;
	pessoaForm.pessDsTitularidade.disabled = true;
	pessoaForm.pessDsCpfTitular.disabled = true;
	pessoaForm.pessDsRgTitular.disabled = true;

	setTimeout('disableEndereco()',100);
	setTimeout('disableEmail()',100);
	setTimeout('disableTelefone()',500);
}

function disableEndereco(){
	ifrmEndereco.ifrmEndereco.document.getElementById("bt_adicionar").disabled=true;
	ifrmEndereco.ifrmEndereco.document.getElementById("bt_adicionar").className = 'geralImgDisable';
}

function disableEmail(){
	Email.document.getElementById("mailForm").pessEmail.disabled=true;
	Email.document.getElementById("mailForm").pessEmailPrincipal.disabled=true;
	Email.document.getElementById("bt_adicionar").disabled=true;
	Email.document.getElementById("bt_adicionar").className = 'geralImgDisable';

	if (Email.document.LstEMail.document.getElementById("bt_lixeira")!=undefined) {
		Email.document.LstEMail.document.getElementById("bt_lixeira").disabled=true;
		Email.document.LstEMail.document.getElementById("bt_lixeira").className = 'geralImgDisable';
	}
}

function disableTelefone(){
	ifrmEndereco.ifrmFormaContato.telForm.telDDI.disabled=true;
	ifrmEndereco.ifrmFormaContato.telForm.telDDD.disabled=true;
	ifrmEndereco.ifrmFormaContato.telForm.telTelefone.disabled=true;
	ifrmEndereco.ifrmFormaContato.telForm.telRamal.disabled=true;
	ifrmEndereco.ifrmFormaContato.telForm.telInPrincipal.disabled=true;
	ifrmEndereco.ifrmFormaContato.telForm.telefoneEndereco.disabled=true;
	ifrmEndereco.ifrmFormaContato.telForm.telTipo.disabled=true;
	ifrmEndereco.ifrmFormaContato.document.getElementById("bt_adicionar").disabled=true;
	ifrmEndereco.ifrmFormaContato.document.getElementById("bt_adicionar").className = 'geralImgDisable';

	if (ifrmEndereco.ifrmFormaContato.LstFormaContato.document.getElementById("bt_horaContato")!=undefined) {
		ifrmEndereco.ifrmFormaContato.LstFormaContato.document.getElementById("bt_horaContato").disabled=true;
		ifrmEndereco.ifrmFormaContato.LstFormaContato.document.getElementById("bt_horaContato").className = 'geralImgDisable';
	}
	if (ifrmEndereco.ifrmFormaContato.LstFormaContato.document.getElementById("bt_lixeira")!=undefined) {
		ifrmEndereco.ifrmFormaContato.LstFormaContato.document.getElementById("bt_lixeira").disabled=true;
		ifrmEndereco.ifrmFormaContato.LstFormaContato.document.getElementById("bt_lixeira").className = 'geralImgDisable';
	}
}

function disab(){
	for (x = 0;  x < pessoaForm.elements.length;  x++)
	{
		Campo = pessoaForm.elements[x];
		if  (Campo.type == "text" || Campo.type == "radio" || Campo.type == "checkbox" || Campo.type == "select-one"  ){
			Campo.disabled = true;
		}
	}	 
}

function verificaFisicaJuridica(){

	if(!bSemPermissao){
		if (pessoaForm.pessInPfj[0].checked == true){
			pessoaForm.Sexo[0].disabled = false;
			pessoaForm.Sexo[1].disabled = false;
		}else if (pessoaForm.pessInPfj[1].checked == true){
			pessoaForm.Sexo[0].checked = false;
			pessoaForm.Sexo[1].checked = false; //valdeci, se for pessoa juridica, limpa os options de sexo
			pessoaForm.Sexo[0].disabled = true;
			pessoaForm.Sexo[1].disabled = true;
		}
	}
	
	if (Complemento.style.display != 'none') {
		//Pessoa Fisica ?
		if (pessoaForm.pessInPfj[0].checked == true){
			Fisica.style.display = '';
			Juridica.style.display = 'none';
			if(!bSemPermissao){
				pessoaForm.pessDsCpf.disabled = false;
				pessoaForm.pessDsRg.disabled = false;
				pessoaForm.pessDsOrgemissrg.disabled = false;
				pessoaForm.pessDhNascimento.disabled = false;
				pessoaForm.txtIdade.disabled = false;
				pessoaForm.pessDsCgc.disabled = true;
				pessoaForm.pessDsIe.disabled = true;
			}
		}else if (pessoaForm.pessInPfj[1].checked == true){
			Fisica.style.display = 'none';
			Juridica.style.display = '';
			if(!bSemPermissao){
				pessoaForm.pessDsCgc.disabled = false;
				pessoaForm.pessDsIe.disabled = false;
				pessoaForm.pessDsCpf.disabled = true;
				pessoaForm.pessDsRg.disabled = true;
				pessoaForm.pessDsOrgemissrg.disabled = true;
				pessoaForm.pessDhNascimento.disabled = true;
				pessoaForm.txtIdade.disabled = true;
			}
		}
	}
	
}

function preencheSexo(){
	if (pessoaForm.pessInSexo.value == "true"){
		pessoaForm.Sexo[0].checked = true;
	}else{
		pessoaForm.Sexo[1].checked = true;	
	}
	if (pessoaForm.pessInSexo.value == ""){
		pessoaForm.Sexo[0].checked = false;	
		pessoaForm.Sexo[1].checked = false;	
	}
}

function preencheHiddenSexo(){
	if (pessoaForm.Sexo[0].checked == true){
		//pessoaForm.pessInSexo.value = true;
		return true;
	}
	if (pessoaForm.Sexo[1].checked == true){
		//pessoaForm.pessInSexo.value = false;
		return true;
	}
	pessoaForm.pessInSexo.value = "";
	return false;
}

function calcage(data){
	if (data==""){
		return false;
	}
	 dd = data.substring(0, 2);
	 mm = data.substring(3, 5);
	 yy = data.substring(6, 10);

	thedate = new Date() 
	mm2 = thedate.getMonth() + 1 
	dd2 = thedate.getDate() 
	yy2 = thedate.getYear() 
	
	if (yy2 < 1000) { 
		yy2 = yy2 + 1900 
	} 
	
	yourage = yy2 - yy;
	if (mm2 < mm) { 
		yourage = yourage - 1; 
	} 

	if (mm2 == mm) { 
		if (dd2 < dd) { 
			yourage = yourage - 1; 
		} 
	} 
	agestring = yourage;
	if (agestring >0 && agestring <120){
		pessoaForm.txtIdade.value = agestring;
	}else{
		pessoaForm.txtIdade.value = "";	
	}
}

function pressEnter(evnt) {
	var tk;
	// Recebe a tela pressionada
	tk = (navigator.appName == "Microsoft Internet Explorer") ? event.keyCode : evnt.which;
	
    if (tk == 13) {
    	identificaPessoa();
    }
}


function abrePopupEmpresas() {
	showModalDialog('AbrePopupEmpresas.do?tela=cliente' + '&idPessCdPessoa=' + pessoaForm.idPessCdPessoa.value,window,'help:no;scroll:no;Status:NO;dialogWidth:800px;dialogHeight:310px,dialogTop:0px,dialogLeft:650px');
}


function DigitoCPFCNPJ(numCIC) {
var numDois = numCIC.substring(numCIC.length-2, numCIC.length);
var novoCIC = numCIC.substring(0, numCIC.length-2);
switch (numCIC.length){
 case 11 :
  numLim = 11;
  break;
 case 14 :
  numLim = 9;
  break;
 default : return false;
}
var numSoma = 0;
var Fator = 1;
for (var i=novoCIC.length-1; i>=0 ; i--) {
 Fator = Fator + 1;
 if (Fator > numLim) {
  Fator = 2;
 }
 numSoma = numSoma + (Fator * Number(novoCIC.substring(i, i+1)));
}
numSoma = numSoma/11;
var numResto = Math.round( 11 * (numSoma - Math.floor(numSoma)));
   if (numResto > 1) {
 numResto = 11 - numResto;
   }
   else {
 numResto = 0;
   }
   //-- Primeiro digito calculado.  Fara parte do novo calculo.
   
   var numDigito = String(numResto);
   novoCIC = novoCIC.concat(numResto);
   //--
numSoma = 0;
Fator = 1;
for (var i=novoCIC.length-1; i>=0 ; i--) {
 Fator = Fator + 1;
 if (Fator > numLim) {
  Fator = 2;
 }
 numSoma = numSoma + (Fator * Number(novoCIC.substring(i, i+1)));
}
numSoma = numSoma/11;
numResto = numResto = Math.round( 11 * (numSoma - Math.floor(numSoma)));
   if (numResto > 1) {
 numResto = 11 - numResto;
   }
   else {
 numResto = 0;
   }
//-- Segundo digito calculado.
numDigito = numDigito.concat(numResto);
if (numDigito == numDois) {
 return true;
}
else {
 return false;
}
}
//--< Fim da Funcao >--

//-- Retorna uma string apenas com os numeros da string enviada
function ApenasNum(strParm) {
strParm = String(strParm);
var chrPrt = "0";
var strRet = "";
var j=0;
for (var i=0; i < strParm.length; i++) {
 chrPrt = strParm.substring(i, i+1);
 if ( chrPrt.match(/\d/) ) {
  if (j==0) {
   strRet = chrPrt;
   j=1;
  }
  else {
   strRet = strRet.concat(chrPrt);
  }
 }
}
return strRet;
}
//--< Fim da Funcao >--

//-- Somente aceita os caracteres validos para CPF e CNPJ.
function PreencheCIC(objCIC) {
var chrP = objCIC.value.substring(objCIC.value.length-1, objCIC.value.length);

if ( !chrP.match(/[0-9]/) && !chrP.match(/[\/.-]/) ) {
 objCIC.value = objCIC.value.substring(0, objCIC.value.length-1);
 return false;
}
return true;
}

function posicionaRegistro(idTppu, descTppu){
	//Verifica se o item existe no combo de tipo de publico, acontece no caso em que um tipo de publico foi associado a alguma pessoa e depois foi inativado no cadastro
	var achouTpPublico = false;
	for(var i = 0; i < pessoaForm.idTpPublico.length; i++) {
		if(pessoaForm.idTpPublico[i].value == idTppu) {
			achouTpPublico = true;
			break;
		}
	}
	
	if(!achouTpPublico) {
		if(idTppu != '' && descTppu != '') {
			var option = new Option();
			option.text = descTppu;
			option.value = idTppu;		
			addOptionCombo(pessoaForm.idTpPublico, option, null);
		}
	}
	
	pessoaForm.idTpPublico.value = idTppu;
	pessoaForm.idTpPublico.onchange();
}

var abasDinamicas = new Array();

/*****************************************************************************************************
 Adiciona parametros no Array abasDinamicas para ser exibida na tela ao chamar o método mostrarAbas()
 Recebe descrição da aba e caminho para carregar o iframe (com os parametros já resolvidos)
******************************************************************************************************/
function criarAbaDinamica(dsAba, linkAba, HTMLAba){
	abasDinamicas[numAbasDinamicas] = new Array();
	abasDinamicas[numAbasDinamicas][0] = dsAba;
	abasDinamicas[numAbasDinamicas][1] = linkAba;
	abasDinamicas[numAbasDinamicas][2] = HTMLAba;
	numAbasDinamicas++;
}

/************************************************************************************************************
 Mostra abas dinâmicas na tela - Cada vez que for chamado, criará na tela as abas e os iframes. Se já houver 
 alguma aba criada e este método for chamado, o que estiver no iframe será perdido se não tiver sido salvo.
************************************************************************************************************/
var larguraAbas = 0;
function mostrarAbas(links){
	var HTMLAbaDinamica = "";
	var HTMLIframesDinamicos = "";

	for(i = 0; i < numAbasDinamicas; i++){
		if (!window.top.getPermissao(links[i][0])){
			HTMLAbaDinamica += "<td class=\"principalPstQuadroLinkNormalMAIOR\" id=\"aba"+ i + "\" name=\"aba"+ i +"\" style=\"display:none\"" + " onclick=\"AtivarPasta('aba"+ i +"')\">"+ abasDinamicas[i][0] +"</td>";
		}else{
			larguraAbas += 150;
			HTMLAbaDinamica += "<td class=\"principalPstQuadroLinkNormalMAIOR\" id=\"aba"+ i + "\" name=\"aba"+ i +"\" onclick=\"AtivarPasta('aba"+ i +"')\">"+ abasDinamicas[i][0] +"</td>";
		}
		
		HTMLIframesDinamicos += "<div id='div"+ i +"' style='width:99%; height: 100%; display: none'>"+
								"<iframe name='ifrm"+ i +"'"+
								"	id='ifrm"+ i +"'"+
                    			"	src='"+ abasDinamicas[i][1] +"'"+
                      			"	width='100%' height='100%' scrolling='Yes' frameborder='0' marginwidth='0' marginheight='0' >"+
								"</iframe></div>";
		
	}
	
	HTMLAbaDinamica = "<table cellpadding=0 cellspacing=0 border=0 width='"+ larguraAbas +"'><tr>" + HTMLAbaDinamica +"</tr></table>";
	
	if(larguraAbas == 0) larguraAbas = 1;
	
	document.getElementById("tdAbasDinamicas").width = larguraAbas;
	document.getElementById("tdAbasDinamicas").innerHTML = HTMLAbaDinamica;
	document.getElementById("iframes").innerHTML = HTMLIframesDinamicos;
	
	for(i = 0; i < numAbasDinamicas; i++){
		if(abasDinamicas[i][2].indexOf("<") > -1){
			eval("document.ifrm"+ i +".document.location = 'about:blank'");
			eval("document.ifrm"+ i +".document.write(abasDinamicas[i][2])");
		}
	}
	
}

var nCountAbas = 0;

function removerAbas(){
	try{
		
		larguraAbas = 0;
		document.getElementById("tdAbasDinamicas").innerHTML = "";
		try{document.getElementById("tdAbasDinamicas").width = "1";}catch(x){}
		
		document.getElementById("iframes").innerHTML = "";
		abasDinamicas = new Array();
		numAbasDinamicas = 0;
	}
	catch(e){
		if(nCountAbas<5){
			setTimeout('removerAbas()',200);
			nCountAbas++;
		}
	}
}

function scrollAbasMais(){
	document.getElementById("abas").scrollLeft += 100;
}

function scrollAbasMenos(){
	document.getElementById("abas").scrollLeft -= 100;
}

function abrirContato(){
	url = 'DadosContato.do?idPessCdPessoaPrinc=' + pessoaForm.idPessCdPessoa.value + '&idEmprCdEmpresa=' + window.top.superior.ifrmCmbEmpresa.empresaForm.csCdtbEmpresaEmpr.value;
	showModalDialog(url, window, 'help:no;scroll:no;Status:NO;dialogWidth:860px;dialogHeight:690px,dialogTop:0px,dialogLeft:10px');
}

function desabilitaFelicitacao() {
	var ajax = new wnd.ConsultaBanco("", "../../DadosPess.do");

	ajax.addField("tela", "ifrmFelizAniversario");
	ajax.addField("acao", "gravar");
	ajax.addField("idPessCdPessoa", pessoaForm.idPessCdPessoa.value);
	
	ajax.executarConsulta(callbackDesabilitaFelicitacao, false, true);
}

function callbackDesabilitaFelicitacao(ajax) {
	if(ajax.getMessage() != ''){
		alert(ajax.getMessage());
		return false; 
	}
	
	pessoaForm.aniversarioMes.value = "";
	pessoaForm.aniversario.value = "";
	parent.document.getElementById("aniversarioImg").src="";
	parent.document.getElementById("aniversarioMsg").innerText="";
	parent.document.getElementById("aniversario").style.visibility="hidden";
}


function desabilitaRetorno() {
	var ajax = new wnd.ConsultaBanco("", "../../RetornoCorresp.do");

	ajax.addField("tela", "ifrmCorrespRetorno");
	ajax.addField("acao", "gravar");
	ajax.addField("idPessCdPessoa", pessoaForm.idPessCdPessoa.value);
	ajax.addField("csNgtbRetornocorrespRecoVo.idPessCdPessoa", pessoaForm.idPessCdPessoa.value);
	ajax.addField("csNgtbRetornocorrespRecoVo.idRecoCdRetornocorresp", pessoaForm.idRecoCdRetornocorresp.value);
	
	ajax.executarConsulta(callbackDesabilitaRetorno, false, true);
}

function callbackDesabilitaRetorno(ajax) {
	if(ajax.getMessage() != ''){
		alert(ajax.getMessage());
		return false; 
	}
	
	parent.document.getElementById("retornoCorresp").style.visibility="hidden";
}

function atualizaCmbTipoPub() {
	var idTpPublico = pessoaForm['idTpPublico'].value;
	var ajax = new wnd.ConsultaBanco("", "../../ShowPessCombo.do");
	
	ajax.addField("ajaxRequest", "true");
	ajax.addField("tela", "CmbTpPublico");
	pessoaForm['idTpPublico'].lastRequestId = ajax.requestId;

	ajax.executarConsulta(function() {
		if(ajax.requestId < pessoaForm['idTpPublico'].lastRequestId) return;
		
		if(ajax.getMessage() != ''){
			alert("Erro em atualizaCmbTipoPub:\n\n"+ajax.getMessage());
			return false; 
		}
		
		ajax.strBrancoComboPopular = " ";
		ajax.popularCombo(pessoaForm['idTpPublico'], "idTppuCdTipoPublico", "tppuDsTipoPublico", idTpPublico, true, "");
	}, false, true);
}
