var sBrowser = navigator.userAgent.toLowerCase() ;

function isIE(){
	return (sBrowser.indexOf("msie") > -1);
}

function isFirefox(){
	return !isIE();
}

function showError(msgErro) {

	//showModalDialog('webFiles/erro.jsp?msgerro=' + msgErro,0,'help:no;scroll:no;Status:NO;dialogWidth:850px;dialogHeight:300px,dialogTop:0px,dialogLeft:200px');

	if (msgErro != 'null')
		showModalDialog('webFiles/erro.jsp?msgerro=' + msgErro,0,'help:no;scroll:no;Status:NO;dialogWidth:400px;dialogHeight:250px,dialogTop:0px,dialogLeft:200px');

}

function preencheData(campoCheck, campoTexto) {

	if (campoCheck.checked) {
		Hr = new Date(); 

		// converte retornto para string
		dd = "" + Hr.getDate(); 
		mm = "" + (Hr.getMonth() + 1); 
		aa = "" + Hr.getYear(); 
		
		if(aa < 1000)
			aa = Number(aa) + 1900;
		
		if (dd.length == 1) {dd = '0' + dd;}
		if (mm.length == 1) {mm = '0' + mm;}
		dAtual = dd + '/' + mm + '/'+ aa;

			campoTexto.value = dAtual;
	} else {
		campoTexto.value = "";
	}
}

function preencheDataHora(campoCheck, campoTextoData, campoTextoHora) {
	
	if (campoCheck.checked) {
		Hr = new Date(); 
		
		// converte retornto para string
		dd = "" + Hr.getDate(); 
		mm = "" + (Hr.getMonth() + 1); 
		aa = "" + Hr.getYear(); 

		if(aa < 1000)
			aa = Number(aa) + 1900;
		
		hh = "" + Hr.getHours();
		mi = "" + Hr.getMinutes();
		
		if (dd.length == 1) {dd = '0' + dd;}
		if (mm.length == 1) {mm = '0' + mm;}
		dAtual = dd + '/' + mm + '/'+ aa;
		
		if (hh.length == 1) {hh = '0' + hh;}
		if (mi.length == 1) {mi = '0' + mi;}
		
		campoTextoData.value = dAtual;
		campoTextoHora.value = hh + ":" + mi;
	} else {
		campoTextoData.value = "";
		campoTextoHora.value = "";
	}
}

function preencheDataCompleta() {

	Hr = new Date(); 
	
	// converte retornto para string
	dd = "" + Hr.getDate(); 
	mm = "" + (Hr.getMonth() + 1); 
	aa = "" + Hr.getFullYear(); 
	
	hh = "" + Hr.getHours();
	mi = "" + Hr.getMinutes();
	ss = "" + Hr.getSeconds();
		
	if (dd.length == 1) dd = '0' + dd;
	if (mm.length == 1) mm = '0' + mm;

	if (hh.length == 1) hh = '0' + hh;
	if (mi.length == 1) mi = '0' + mi;
	if (ss.length == 1) ss = '0' + ss;
	
	dAtual = dd + "/" + mm + "/" + aa + " " + hh + ":" + mi + ":" + ss;
	
	return dAtual;
}

function preencheDataSimples() {

	Hr = new Date(); 
	
	// converte retornto para string
	dd = "" + Hr.getDate(); 
	mm = "" + (Hr.getMonth() + 1); 
	aa = "" + Hr.getFullYear(); 
		
	if (dd.length == 1) dd = '0' + dd;
	if (mm.length == 1) mm = '0' + mm;

	
	dAtual = dd + "/" + mm + "/" + aa;
	
	return dAtual;
}


function textCounter(field, maxlimit) {
	if (field.value.length > maxlimit) 
		field.value = field.value.substring(0, maxlimit);
}

function acronym(texto, nr) {
	if (texto.length > nr) {
		document.write("<ACRONYM title=\"" + texto + "\" style=\"border: 0\">");
		document.write(texto.substring(0, nr) + "...");
		document.write("</ACRONYM>");
	} else {
		document.write(texto);
	}
}

function acronymLeftLst(texto, nr) {
	acro = "";
	if (texto.length > nr) {
		acro += "<ACRONYM title=\"" + texto + "\" style=\"border: 0\">";
		acro += "..."+ texto.substring(texto.length - nr, texto.length);
		acro += "</ACRONYM>";
	} else {
		acro = texto;
	}
	return acro;
}

function acronymLst(texto, nr) {
	acro = "";
	if (texto.length > nr) {
		acro += "<ACRONYM title=\"" + texto + "\" style=\"border: 0\">";
		acro += texto.substring(0, nr) + "...";
		acro += "</ACRONYM>";
	} else {
		acro = texto;
	}
	return acro;
}

function isDigito(evnt) {
	var tk;
	// Recebe a tela pressionada
	tk = (navigator.appName == "Microsoft Internet Explorer") ? evnt.keyCode : evnt.which;
		
	if(tk == 9 || tk == 8 || tk == 0){
		return true;
	}

	if((!((tk >= 96 && tk <= 105) || (tk >= 48 && tk <= 57))) || tk == 13){
		(navigator.appName == "Microsoft Internet Explorer") ? evnt.returnValue = null : evnt.returnValue = null;
		return false;
	}
}

function isDigitoPonto(obj, evnt) {
    if (((evnt.keyCode < 48 && evnt.keyCode != 46) ||(evnt.keyCode > 57)) && evnt.keyCode != 8)
    	evnt.returnValue = false;
}

function isDigitoString(obj, evnt){
	if (((evnt.keyCode < 65) ||(evnt.keyCode > 90)) && evnt.keyCode != 8)
		evnt.returnValue = false;
}

function trataQuebraLinha(valor) {
	var val = valor;
	for (var i = 0; i < valor.length; i++)
		val = val.replace('\r\n', 'QBRLNH');
	return val;
}

function trataQuebraLinha2(valor) {
	var val = valor;
	for (var i = 0; i < valor.length; i++)
  	val = val.replace('QBRLNH', '\n');
	return val;
}

function trataQuebraLinha3(valor) {
	var val = valor;
	for (var i = 0; i < valor.length; i++)
  	val = val.replace('QBRLNH', '<BR>');
	return val;
}

function getData() {
		Hr = new Date(); 
		
		// converte retornto para string
		dd = "" + Hr.getDate(); 
		mm = "" + (Hr.getMonth() + 1); 
		aa = "" + Hr.getYear(); 
		
		if(aa < 1000)
			aa = Number(aa) + 1900;
		
		if (dd.length == 1) {dd = '0' + dd;}
		if (mm.length == 1) {mm = '0' + mm;}
		dAtual = dd + '/' + mm + '/'+ aa;
		
		return dAtual;
}

function getHora() {
		Hr = new Date(); 
		
		hh = "" + Hr.getHours();
		mi = "" + Hr.getMinutes();
		
		if (hh.length == 1) {hh = '0' + hh;}
		if (mi.length == 1) {mi = '0' + mi;}
		
		return (hh + ":" + mi);
}

function sysSomaDiasUteis(data, nDias){
	var nI;
	
	ano = data.substr(6,4);
	mes = data.substr(3,2) - 1 ;
	dia = data.substr(0,2);
	
	var dRetorno = new Date(ano,mes,dia);
	//alert (dRetorno.getDate() + "/" + dRetorno.getMonth() + "/" + dRetorno.getYear());
	
	
	for (nI=0 ; nI < nDias ; nI++){
	    if (dRetorno.getDay() == 0){ //domingo
	        dia = (new Number(dia) + 1);
	    }else{
	    	if (dRetorno.getDay() == 6){ //sabado
	        	dia = (new Number(dia) + 2);
	        }	
		}
	    dia = (new Number(dia) + 1);
	    dRetorno = new Date(ano,mes,dia);
	    
	    //alert (dRetorno.getDate() + "/" + dRetorno.getMonth() + "/" + dRetorno.getYear());
	    //alert(dRetorno.getDay());
	}

	dd = "" + dRetorno.getDate(); 
	mm = "" + (dRetorno.getMonth() + 1); 
	aa = "" + dRetorno.getYear(); 
	
	if (dd.length == 1) {dd = '0' + dd;}
	if (mm.length == 1) {mm = '0' + mm;}
	dAtual = dd + '/' + mm + '/'+ aa;

	//alert (dAtual);
	
	return dAtual;
}

//Substitui os caracteres especias de strings.
function codificaStringHtml(objetoStr){
	
	var retorno = "";
	
	for (var i = 0; i < objetoStr.value.length; i++){
	
		var val1 = objetoStr.value.substr(i,1);
		
		if(val1.indexOf("\n")>-1){
			retorno += val1.replace('\n', 'QBRLNH');
			
		}else if(val1.indexOf("\r")>-1){
			//N?o atribui esse caracter.
			
		}else if(val1.indexOf('"')>-1){
			retorno += val1.replace('"', '&quot;');
			
		}else if(val1.indexOf("'")>-1){
			retorno += val1.replace("'", "ASPASIMPLES");
			
		}else if(val1.indexOf("\\")>-1){
			retorno += val1.replace("\\", "\\\\");
			
		}else{
			retorno=retorno+val1;
		}
		
	}
	
	return retorno;
	
}


//Substitui os caracteres especias de strings.
function descodificaStringHtml(objetoStr){
	
	var retorno = objetoStr;
	
	while(retorno.indexOf("QBRLNH")>-1){
		retorno = retorno.replace('QBRLNH', '\r\n');
	}
	
	while(retorno.indexOf('&quot;')>-1){
		retorno = retorno.replace('&quot;', '"');
	}
	
	while(retorno.indexOf('&amp;quot;')>-1){
		retorno = retorno.replace('&amp;quot;', '"');
	}
	
	while(retorno.indexOf("ASPASIMPLES")>-1){
		retorno = retorno.replace('ASPASIMPLES', "'");
	}			
	
	while(retorno.indexOf("\\\\")>-1){
		retorno = retorno.replace('\\\\', "\\");
	}	
	
	return retorno;
	
}	


function formataCPFCNPJ2(valor) {
	var texto = "";
	for (var i = 0; i < valor.length; i++) {
		texto += valor.substring(i, i + 1).match(/[0-9]/);
	}
	num = String(texto);
	switch(num.length) {
		case 11 :
		 valor = num.substring(0,3) + "." + num.substring(3,6) + "." + num.substring(6,9) + "-" + num.substring(9,11);
		 return valor;
		case 14 :
		 valor = num.substring(0,2) + "." + num.substring(2,5) + "." + num.substring(5,8) + "/" + num.substring(8,12) + "-" + num.substring(12,14);
		 return valor;
		default : 
		 return valor;
	}
}

function fecharJanelaPai(){
	try{
		parent.fecharJanelaPai();
	}catch(x){}
	try{
		window.dialogArguments.fecharJanelaPai();
	}catch(x){}
	window.close();
}

function teclaAcionada(evnt) {

	var tk;
	tk = (navigator.appName == "Microsoft Internet Explorer") ? evnt.keyCode : evnt.which;

	if (tk==27) {
		(navigator.appName == "Microsoft Internet Explorer") ? evnt.returnValue = null : evnt.returnValue = null;
		return false;
	}

}
