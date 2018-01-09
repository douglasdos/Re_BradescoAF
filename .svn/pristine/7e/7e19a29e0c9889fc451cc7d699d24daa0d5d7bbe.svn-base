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

function validaDigitoDataHora(obj, evnt){

	var tk;
	// Recebe a tela pressionada
	tk = (navigator.appName == "Microsoft Internet Explorer") ? evnt.keyCode : evnt.which;
	
	if(tk == 8 || tk == 9 || tk == 46 || tk == 0){
		return true;
	}
	
	if( obj.value.length < 10){
		validaDigito(obj, evnt);
	}
	if( obj.value.length == 10){
		obj.value += " ";
	}
	if( obj.value.length > 10){
		validaDigitoHora(obj, evnt);
	}

}

function validaDigito(obj, evnt) {
	var tk;
	// Recebe a tela pressionada
	tk = (navigator.appName == "Microsoft Internet Explorer") ? evnt.keyCode : evnt.which;
	
	if(tk == 8 || tk == 9 || tk == 46 || tk == 0){
		return true;
	}
    else if(!((tk >= 96 && tk <= 105) || (tk >= 48 && tk <= 57))){
    	(navigator.appName == "Microsoft Internet Explorer") ? evnt.returnValue = null : evnt.returnValue = null;
        return false;
    }
    else if(obj.value.length == 2 || obj.value.length == 5)
        obj.value += "/";
}

function validaDigitoHora(obj, evnt) {

	var tk;
	// Recebe a tela pressionada
	tk = (navigator.appName == "Microsoft Internet Explorer") ? evnt.keyCode : evnt.which;

	if(tk == 8 || tk == 9 || tk == 46 || tk == 0){
		return true;
	}
   	else if(!((tk >= 96 && tk <= 105) || (tk >= 48 && tk <= 57))) {
   		(navigator.appName == "Microsoft Internet Explorer") ? evnt.returnValue = null : evnt.returnValue = null;
   		return false;
   	}
   	else if(obj.value.length == 2 || obj.value.length == 13 || obj.value.length == 16){
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
   // Se nao eh numerico
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
      alert("Ano inferior a 1800");
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
      //Nao numerico retorna false
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
         alert("Data inválida");
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
      alert("Data inválida");
      inputObj.focus();
      inputObj.value="";
      return false;
   }
   return true;
}

function verificaHora(inputObj) {
   if(inputObj.value.length < 5) {
      alert("Hora inválida");
      inputObj.focus();
      return false;
   }
   else if(inputObj.value.substring(0, 2) < 0 || inputObj.value.substring(0, 2) > 23) {
      alert("Hora inválida");
      inputObj.focus();
      return false;
   }
   else if(inputObj.value.substring(3, 5) < 0 || inputObj.value.substring(3, 5) > 59 || inputObj.value.substring(2, 3) != ":") {
      alert("Hora inválida");
      inputObj.focus();
      return false;
   }
   return true;
}
/**
 * Retorna a diferenca em dias entre duas datas.
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

//Validacao de Datas no Formato MM/AAAA
function validaDigitoMesAno(obj, evnt) {
   if((evnt.keyCode < 48) ||(evnt.keyCode > 57)) evnt.returnValue = false;
   else if(obj.value.length == 2) obj.value += "/";
}

function verificaDataMesAno(inputObj) {
   if(isEmpty(inputObj.value)) {
      return false;
   }
   else if(!isDateMesAno(inputObj.value)) {
      alert("Data incorreta");
      inputObj.focus();
      inputObj.value="";
      return false;
   }
   return true;
}

function isDateMesAno(texto) {
   // Se esta em branco ou tamanho menor que 7(mm/aaaa)
   if((texto == "") ||(texto.length < 7))
   return false;
   // Se nao e numerico
   if(!validaFormatacaoDataMesAno(texto))
   return false;
   mes = texto.substring(0, 2);
   ano = texto.substring(3, 7);
   if(mes.substring(0, 1) == 0) mes = mes.substring(1, 2);
   mes = parseInt(mes);
   ano = parseInt(ano);
   if(ano < 1800) {
      alert("Ano inferior a 1800");
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
   return true;
}

function validaFormatacaoDataMesAno(inputVal) {
   inputStr = inputVal.toString();
   for(var i = 0; i < inputStr.length; i++) {
      var oneChar = inputStr.charAt(i);
      // Se existem as barras (/) nos lugare certos
      if((i == 2) &&(oneChar == "/"))
      continue;
      //Nao numerico retorna false
      if(oneChar < "0" || oneChar > "9")
      return false;
   }
   return true;
}

//Validacao de Ano - formato AAAA

function verificaDataAno(inputObj) {
   if(isEmpty(inputObj.value)) {
      return false;
   }
   else if(!isDateAno(inputObj.value)) {
   	  alert("Ano incorreto");
      inputObj.focus();
      inputObj.value="";
      return false;
   }
   return true;
}

function isDateAno(texto) {
   // Se esta em branco ou tamanho menor que 4(aaaa)
   if((texto == "") ||(texto.length < 4))
   return false;
   
   // Se nao e numerico
   inputStr = texto.toString();
   for(var i = 0; i < inputStr.length; i++) {
      var oneChar = inputStr.charAt(i);
      //Nao numerico retorna false
      if(oneChar < "0" || oneChar > "9")
      return false;
   }
   
   ano = texto.substring(0, 4);

   ano = parseInt(ano);
   if(ano < 1800) {
      alert("Ano inferior a 1800");
      return false;
   }
   
   return true;
}


function verificaDataHora(inputObj) {

	var dtCompleto = inputObj.value;
	var dt;
	var hr;
	
	if(dtCompleto == ""){
		return false;
	}else{
		if(trim(dtCompleto).indexOf(" ") > -1){
			
			dt = dtCompleto.substring(0,trim(dtCompleto).indexOf(" "));
			hr = dtCompleto.substring(11,dtCompleto.length)
			
			if(dt.length < 10) {
				alert("Formato de data inválido. Digite a data no formato dd/mm/yyyy hh:mm:ss");
				inputObj.focus();
				return false;
			}
			if(hr.length < 8) {
				alert("Formato de data inválido. Digite a data no formato dd/mm/yyyy hh:mm:ss");
				inputObj.focus();
				return false;
			}
			
			if(!isDate(dt)) {
		      alert("Data inválida");
		      inputObj.focus();
		      return false;
		    }
   
		   	if(hr.substring(0, 2) < 0 || hr.substring(0, 2) > 23) {
		      	alert("Hora inválida");
		      	inputObj.focus();
		      	return false;
		   	}
		   	else if(hr.substring(3, 5) < 0 || hr.substring(3, 5) > 59 || hr.substring(2, 3) != ":") {
		      	alert("Hora inválida");
		      	inputObj.focus();
		      	return false;
		   	}
		   	else if(hr.length == 8 && ( hr.substring(6, 8) < 0 || hr.substring(6, 8) > 59 || hr.substring(5, 6) != ":" )) {
		      	alert("Hora inválida");
		      	inputObj.focus();
		      	return false;
		   	}
		   	
		} else {
			alert("Formato de data inválido. Digite a data no formato dd/mm/yyyy hh:mm:ss");
			try {
				inputObj.focus();
			} catch(e) {}
			return false;

		}
	}
	
    return true;
}

/**
 * O dateDiff sempre traz um valor positivo na diferença entre as datas esse diferencia para "-" negativo se a diferença for negativa
 */
function dateDiff2(sDate1, sDate2){
    var diff  = new Date();
    var date1, date2;

    matchArray1 = sDate1.split(/\/|-/)
    Day1 = matchArray1[0]
    Month1 = matchArray1[1]-1
    Year1 = matchArray1[2]
    
    matchArray2 = sDate2.split(/\/|-/)
    Day2 = matchArray2[0]
    Month2 = matchArray2[1]-1
    Year2 = matchArray2[2]
    
    date1 = new Date(Year1,Month1,Day1)
    date2 = new Date(Year2,Month2,Day2)

    var difDate = date1.getTime() - date2.getTime();
    
    diff.setTime(Math.abs(difDate));
    timediff = diff.getTime();
    days = Math.floor(timediff / (1000 * 60 * 60 * 24));
    
    if(difDate < 0) days = new Number("-"+days);
    
    return days;
}
