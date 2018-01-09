function mascaraMoeda(objTextBox, e){
	
	var SeparadorMilesimo = '.';
	var SeparadorDecimal = ',';
    var sep = 0;
    var key = '';
    var i = j = 0;
    var len = len2 = 0;
    var strCheck = '0123456789';
    var aux = aux2 = '';
    var whichCode = (window.Event) ? e.which : e.keyCode;
    if (whichCode == 13) return true;
    key = String.fromCharCode(whichCode); // Valor para o código da Chave
    if (strCheck.indexOf(key) == -1) return false; // Chave inválida
    len = objTextBox.value.length;
    for(i = 0; i < len; i++)
        if ((objTextBox.value.charAt(i) != '0') && (objTextBox.value.charAt(i) != SeparadorDecimal)) break;
    aux = '';
    for(; i < len; i++)
        if (strCheck.indexOf(objTextBox.value.charAt(i))!=-1) aux += objTextBox.value.charAt(i);
    aux += key;
    len = aux.length;
    if (len == 0) objTextBox.value = '';
    if (len == 1) objTextBox.value = '0'+ SeparadorDecimal + '0' + aux;
    if (len == 2) objTextBox.value = '0'+ SeparadorDecimal + aux;
    if (len > 2) {
        aux2 = '';
        for (j = 0, i = len - 3; i >= 0; i--) {
            if (j == 3) {
                aux2 += SeparadorMilesimo;
                j = 0;
            }
            aux2 += aux.charAt(i);
            j++;
        }
        objTextBox.value = '';
        len2 = aux2.length;
        for (i = len2 - 1; i >= 0; i--)
        objTextBox.value += aux2.charAt(i);
        objTextBox.value += SeparadorDecimal + aux.substr(len - 2, len);
    }
    
    return false;
	
}

var reDigits = /^\d+$/;
function numInteiro(pStr) {
	if (reDigits.test(pStr)) {
		return true;
	} else if (pStr != null && pStr != "") {
		return false;
	}
}
var reDecimalPt = /^[+-]?((\d+|\d{1,3}(\.\d{3})+)(\,\d*)?|\,\d+)$/;
var reDecimalEn = /^[+-]?((\d+|\d{1,3}(\,\d{3})+)(\.\d*)?|\.\d+)$/;
var reDecimal = reDecimalPt;
function numReal(pStr) {
	charDec = ",";
	if (reDecimal.test(pStr)) {
		pos = pStr.indexOf(charDec);
		decs = pos == -1 ? 0 : pStr.length - pos - 1;
		return true;
	} else if (pStr != null && pStr != "") {
		return false;
	}
}
function validaCPF(cpf) {
	cpf = cpf.replace('.', '');
	cpf = cpf.replace('.', '');
	cpf = cpf.replace('-', '');
	erro = new String;
	if (cpf.length < 11)
		erro += "São necessários 11 dígitos para verificação do CPF! \n\n";
	var nonNumbers = /\D/;
	if (nonNumbers.test(cpf))
		erro += "A verificação de CPF suporta apenas numeros! \n\n";
	if (cpf == "00000000000" || cpf == "11111111111" || cpf == "22222222222"
			|| cpf == "33333333333" || cpf == "44444444444"
			|| cpf == "55555555555" || cpf == "66666666666"
			|| cpf == "77777777777" || cpf == "88888888888"
			|| cpf == "99999999999") {
		erro += "Numero de CPF invalido!";
	}
	var a = [];
	var b = new Number;
	var c = 11;
	for (i = 0; i < 11; i++) {
		a[i] = cpf.charAt(i);
		if (i < 9)
			b += (a[i] * --c);
	}
	if ((x = b % 11) < 2) {
		a[9] = 0;
	} else {
		a[9] = 11 - x;
	}
	b = 0;
	c = 11;
	for (y = 0; y < 10; y++)
		b += (a[y] * c--);
	if ((x = b % 11) < 2) {
		a[10] = 0;
	} else {
		a[10] = 11 - x;
	}
	status = a[9] + "" + a[10]
	if ((cpf.charAt(9) != a[9]) || (cpf.charAt(10) != a[10])) {
		erro += "Digito verificador com problema!";
	}
	if (erro.length > 0) {
		return false;
	}
	return true;
}
function verificaData(Data) {
	Data = Data.substring(0, 10);
	var dma = -1;
	var data = Array(3);
	var ch = Data.charAt(0);
	for (i = 0; i < Data.length
			&& ((ch >= '0' && ch <= '9') || (ch == '/' && i != 0));) {
		data[++dma] = '';
		if (ch != '/' && i != 0)
			return false;
		if (i != 0)
			ch = Data.charAt(++i);
		if (ch == '0')
			ch = Data.charAt(++i);
		while (ch >= '0' && ch <= '9') {
			data[dma] += ch;
			ch = Data.charAt(++i);
		}
	}
	if (ch != '')
		return false;
	if (data[0] == '' || isNaN(data[0]) || parseInt(data[0]) < 1)
		return false;
	if (data[1] == '' || isNaN(data[1]) || parseInt(data[1]) < 1
			|| parseInt(data[1]) > 12)
		return false;
	if (data[2] == ''
			|| isNaN(data[2])
			|| ((parseInt(data[2]) < 0 || parseInt(data[2]) > 99) && (parseInt(data[2]) < 1900 || parseInt(data[2]) > 9999)))
		return false;
	if (data[2] < 50)
		data[2] = parseInt(data[2]) + 2000;
	else if (data[2] < 100)
		data[2] = parseInt(data[2]) + 1900;
	switch (parseInt(data[1])) {
	case 2: {
		if (((parseInt(data[2]) % 4 != 0 || (parseInt(data[2]) % 100 == 0 && parseInt(data[2]) % 400 != 0)) && parseInt(data[0]) > 28)
				|| parseInt(data[0]) > 29)
			return false;
		break;
	}
	case 4:
	case 6:
	case 9:
	case 11: {
		if (parseInt(data[0]) > 30)
			return false;
		break;
	}
	default: {
		if (parseInt(data[0]) > 31)
			return false;
	}
	}
	return true;
}

//valida o CNPJ digitado
function validarCNPJ(valor){
	var retorno = true;
    var cnpj = valor;
    var valida = new Array(6,5,4,3,2,9,8,7,6,5,4,3,2);
    var dig1= new Number;
    var dig2= new Number;

    exp = /\.|\-|\//g
    cnpj = cnpj.toString().replace( exp, "" ); 
    var digito = new Number(eval(cnpj.charAt(12)+cnpj.charAt(13)));

    for(i = 0; i<valida.length; i++){
            dig1 += (i>0? (cnpj.charAt(i-1)*valida[i]):0);  
            dig2 += cnpj.charAt(i)*valida[i];       
    }
    dig1 = (((dig1%11)<2)? 0:(11-(dig1%11)));
    dig2 = (((dig2%11)<2)? 0:(11-(dig2%11)));

    if(((dig1*10)+dig2) != digito)  
    	retorno = false;

    return retorno;
}

function replaceAll(string, token, newtoken) {
	while (string.indexOf(token) != -1) {
		string = string.replace(token, newtoken);
	}
	return string;
}

function validarCPF(cpf) {  
    cpf = cpf.replace(/[^\d]+/g,'');    
    if(cpf == '') return false; 
    // Elimina CPFs invalidos conhecidos    
    if (cpf.length != 11 || 
        cpf == "00000000000" || 
        cpf == "11111111111" || 
        cpf == "22222222222" || 
        cpf == "33333333333" || 
        cpf == "44444444444" || 
        cpf == "55555555555" || 
        cpf == "66666666666" || 
        cpf == "77777777777" || 
        cpf == "88888888888" || 
        cpf == "99999999999")
            return false;       
    // Valida 1o digito 
    add = 0;    
    for (i=0; i < 9; i ++)       
        add += parseInt(cpf.charAt(i)) * (10 - i);  
        rev = 11 - (add % 11);  
        if (rev == 10 || rev == 11)     
            rev = 0;    
        if (rev != parseInt(cpf.charAt(9)))     
            return false;       
    // Valida 2o digito 
    add = 0;    
    for (i = 0; i < 10; i ++)        
        add += parseInt(cpf.charAt(i)) * (11 - i);  
    rev = 11 - (add % 11);  
    if (rev == 10 || rev == 11) 
        rev = 0;    
    if (rev != parseInt(cpf.charAt(10)))
        return false;       
    return true;   
}

////valida o CPF digitado
//function validarCPF(valor){
//	var retorno = true;
//	var cpf = valor;
//	
//	if (valor == '11111111111' || valor == '22222222222' || valor == '33333333333' || valor == '44444444444' || 
//	        valor == '55555555555' || valor == '66666666666' || valor == '77777777777' || valor == '88888888888' ||  
//	    	valor == '99999999999' || valor == '00000000000' ) {
//				return false;
//	}
//	
//	
//    exp = /\.|\-/g
//    cpf = cpf.toString().replace( exp, "" ); 
//    var digitoDigitado = eval(cpf.charAt(9)+cpf.charAt(10));
//    var soma1=0, soma2=0;
//    var vlr =11;
//
//    for(i=0;i<9;i++){
//            soma1+=eval(cpf.charAt(i)*(vlr-1));
//            soma2+=eval(cpf.charAt(i)*vlr);
//            vlr--;
//    }       
//    soma1 = (((soma1*10)%11)==10 ? 0:((soma1*10)%11));
//    soma2=(((soma2+(2*soma1))*10)%11);
//
//    var digitoGerado=(soma1*10)+soma2;
//    if(digitoGerado!=digitoDigitado)        
//    	retorno = false;
//    
//    return retorno;
//    
//}

function validateEmail(email) {
    var re = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    return re.test(email);
}

function validarHora(valor) {
	
	var retorno = true;
	
	var matchhora = new RegExp(/^([0-1]\d|2[0-3]):[0-5]\d$/);
	
	if (valor.match(matchhora) == null) {
		retorno = false;
	}

	return retorno; 
}

function tranformarDataPadraoParaBr(data) {
	
	try {
		if (data == null || data == '') {
			return '';
		}

		var ano = data.substring(0,4);
		var mes = data.substring(5,7);
		var dia = data.substring(8,10);
		
	} catch (e) {
		return data;
	}
	
	return dia + '/' +  mes + '/' + ano; 
}

function tranformarDataHoraPadraoParaBr(data) {
	
	try {
		if (data == null || data == '') {
			return '';
		}

		var ano = data.substring(0,4);
		var mes = data.substring(5,7);
		var dia = data.substring(8,10);
		
		if (data.toString().length == 10 ) {
			return dia + '/' +  mes + '/' + ano;
		}
		
		var hora = data.substring(11,13);
		var min = data.substring(14,16);
		
	} catch (e) {
		return data;
	}
	
	return dia + '/' +  mes + '/' + ano + ' ' + hora + ':' + min;  
}


function tranformarDataYYYYMMDDPadraoParaBr(data) {
	
	try {
		if (data == null || data == '') {
			return '';
		}
		
		var ano = data.substring(0,4);
		var mes = data.substring(4,6);
		var dia = data.substring(6,8);
		
	} catch (e) {
		return data;
	}
	
	return dia + '/' +  mes + '/' + ano; 
}

function formatarCPF(valor) {
	
	if (!(valor != null && valor.toString().length > 0 )) {
		return '';
	}
	
	valor = replaceAll(valor, '.', '');
	valor = replaceAll(valor, '-', '');
	valor = replaceAll(valor, '/', '');
	
	if (valor.length == 11 ) {
		var cpfFormat = valor.substring(0,3) + '.';
		cpfFormat += valor.substring(3,6) + '.';
		cpfFormat += valor.substring(6,9) + '-';
		cpfFormat += valor.substring(9);
		return cpfFormat;
	}
	
	if (valor.length == 14) {
		var cnpjFormat = valor.substring(0,2) + '.';
		cnpjFormat += valor.substring(2,5) + '.';
		cnpjFormat += valor.substring(5,8) + '/';
		cnpjFormat += valor.substring(8,12) + '-';
		cnpjFormat += valor.substring(12);
		return cpfFormat;
	}
	
	return valor;
}

function formatarCep(valor) {
	
	try {
		if (isNaN(valor) == false) {
			valor = valor.toString();
		} 
		
		if (valor != null && valor.length > 0) {
			if (valor.length == 8) {
				return valor.substring(0,5) + '-' + valor.substring(5);  
			}
		}
		
		return valor;
	} catch (e) {
		return valor;
	}
}
