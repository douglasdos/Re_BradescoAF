/* Exemplo
 *
 *   <input type="text" name="data" size=10 maxlength=10
 *      onKeyPress="javascript:validaDigito(this);"
 *      onBlur="javascript:verificaData(this);"
 *      value="" >
 */

function isEmpty(s) {
   return((s == null) ||(s.length == 0));
}

function validaDigito(obj, evnt) {
	var tk;
	// Recebe a tela pressionada
	tk = (navigator.appName == "Microsoft Internet Explorer") ? event.keyCode : evnt.which;

	if(tk == 8 || tk == 9 || tk == 46 || tk == 0){
		return true;
	}
    else if(!((tk >= 96 && tk <= 105) || (tk >= 48 && tk <= 57))){
       (navigator.appName == "Microsoft Internet Explorer") ? event.returnValue = null : evnt.returnValue = null;
        return false;
    }
    else if(obj.value.length == 2 || obj.value.length == 5)
        obj.value += "/"
}

function validaDigitoHora(obj, evnt) {

	var tk;
	// Recebe a tela pressionada
	tk = (navigator.appName == "Microsoft Internet Explorer") ? event.keyCode : evnt.which;

   if((tk < 48) ||(tk > 57)) {
   		(navigator.appName == "Microsoft Internet Explorer") ? event.returnValue = null : evnt.returnValue = null;
   		return false;
   }
   else if(obj.value.length == 2){
   		obj.value += ":";
   }
}

function novaDataENG(data) {
   return new Date(data.substring(3, 5) + "/" + data.substring(0, 2) + "/" + data.substring(6, data.length));
}

function isDate(texto) {
   // Se esta em branco ou tamanho menor que 10(dd/mm/aaaa)
   if((texto == "") ||(texto.length < 10))
   return false;
   // Se n�o � num�rico
   if(!validaFormatacaoData(texto))
   return false;
   dia = texto.substring(0, 2);
   mes = texto.substring(3, 5);
   ano = texto.substring(6, 10);
   if(dia.substring(0, 1) == 0) dia = dia.substring(1, 2);
   if(mes.substring(0, 1) == 0) mes = mes.substring(1, 2);
   dia = parseInt(dia);
   mes = parseInt(mes);
   ano = parseInt(ano);
   if(ano < 1800) {
      alert("A�o inferior a la 1800");
      return false;
   }
   switch(mes) {
      case 1 : diafim = 31;
         break;
      case 2 : diafim =((ano % 4 == 0) ? 29 : 28);
         break;
      case 3 : diafim = 31;
         break;
      case 4 : diafim = 30;
         break;
      case 5 : diafim = 31;
         break;
      case 6 : diafim = 30;
         break;
      case 7 : diafim = 31;
         break;
      case 8 : diafim = 31;
         break;
      case 9 : diafim = 30;
         break;
      case 10 : diafim = 31;
         break;
      case 11 : diafim = 30;
         break;
      case 12 : diafim = 31;
         break;
      default :
         return false;
         break;
   }
   return(dia > diafim || dia < 1) ? false : true;
}

function validaFormatacaoData(inputVal) {
   inputStr = inputVal.toString();
   for(var i = 0; i < inputStr.length; i++) {
      var oneChar = inputStr.charAt(i);
      // Se existem as barras (/) nos lugare certos
      if((i == 2 || i == 5) &&(oneChar == "/"))
      continue;
      //N�o num�rico retorna false
      if(oneChar < "0" || oneChar > "9")
      return false;
   }
   return true;
}

function validaPeriodo(ini, fim) {
   var dataIni;
   var dataFim;
   dataIni = novaDataENG(ini);
   dataFim = novaDataENG(fim);
   if(dataFim < dataIni) {
      return false;
   }
   return true;
}

function validaPeriodoHora(iniData, fimData, iniHora, fimHora) {
   var dataIni;
   var dataFim;
   dataIni = novaDataENG(iniData);
   dataFim = novaDataENG(fimData);
   if(dataFim < dataIni) {
      return false;
   } else if (iniData == fimData) {
			   if (iniHora.substring(0, 2) > fimHora.substring(0, 2)) {
			   	  return false;
			   } else if (iniHora.substring(0, 2) == fimHora.substring(0, 2)) {
			   			if (iniHora.substring(3, 5) > fimHora.substring(3, 5)) {
			   						return false;
			   			}
			   }
   }
   return true;
}

function verificaDataAntigo(inputObj) {
   if(!isEmpty(inputObj.value)) {
      if(!isDate(inputObj.value)) {
         alert("Fecha inv�lida");
         inputObj.focus();
         inputObj.value="";
         return false;
      }
   }
   return true;
}

function verificaData(inputObj) {
   if(isEmpty(inputObj.value)) {
      return false;
   }
   else if(!isDate(inputObj.value)) {
      alert("Fecha inv�lida");
      inputObj.focus();
      inputObj.value="";
      return false;
   }
   return true;
}

function verificaHora(inputObj) {
   if(inputObj.value.length < 5) {
      alert("Hora inv�lida");
      inputObj.focus();
      return false;
   }
   else if(inputObj.value.substring(0, 2) < 0 || inputObj.value.substring(0, 2) > 23) {
      alert("Hora inv�lida");
      inputObj.focus();
      return false;
   }
   else if(inputObj.value.substring(3, 5) < 0 || inputObj.value.substring(3, 5) > 59 || inputObj.value.substring(2, 3) != ":") {
      alert("Hora inv�lida");
      inputObj.focus();
      return false;
   }
   return true;
}
/**
 * Retorna a diferen�a em dias entre duas datas.
 */

function dateDiff(sDate1, sDate2) {
   var diff = new Date();
   var date1, date2;
   matchArray1 = sDate1.split(/\/|-/);
   Day1 = matchArray1[0];
   Month1 = matchArray1[1] - 1;
   Year1 = matchArray1[2];
   matchArray2 = sDate2.split(/\/|-/);
   Day2 = matchArray2[0];
   Month2 = matchArray2[1] - 1;
   Year2 = matchArray2[2];
   date1 = new Date(Year1, Month1, Day1);
   date2 = new Date(Year2, Month2, Day2);
   diff.setTime(Math.abs(date1.getTime() - date2.getTime()));
   timediff = diff.getTime();
   days = Math.floor(timediff/(1000 * 60 * 60 * 24));
   return days;
}
