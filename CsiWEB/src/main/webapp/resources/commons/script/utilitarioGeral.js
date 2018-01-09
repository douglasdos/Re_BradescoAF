
(function($){
	addCampoSetValoresToFormText = function(tipoGravacao, incrementoCampo, idCampo, nomeTabela , nomeCampo ) {
		var strTxt = '';
		
		idCampo = '#' + idCampo;
		
		if (tipoGravacao == 'M') {
			tipoGravacao = 'csNgtbManifEspecMaesVo';
		} else if (tipoGravacao == 'P') {
			tipoGravacao = 'csCdtbPessoaespecPeesVo';
		}
		
		if ($.trim($(idCampo).val()).length == 0 ) {
			strTxt += " <input type=\"hidden\" name=\""+ tipoGravacao+ "."+incrementoCampo+"." + nomeTabela + "." + nomeCampo + "\" value=\"" + "" + "\" > ";	
		}
		else {
			
			if (idCampo == '#maniNrSequencia' && $(idCampo).val() == '0') {
				strTxt += " <input type=\"hidden\" name=\""+ tipoGravacao+ "."+incrementoCampo+"." + nomeTabela + "." + nomeCampo + "\" value=\"" + "" + "\" > ";
			} else {
				strTxt += " <input type=\"hidden\" name=\""+ tipoGravacao+ "."+incrementoCampo+"." + nomeTabela + "." + nomeCampo + "\" value=\"" + $(idCampo).val().toUpperCase() + "\" > ";	
			}
		}
		
		return strTxt;
	};
	
	addCampoSetValoresSoNumerosToFormText = function(tipoGravacao, incrementoCampo, idCampo, nomeTabela , nomeCampo ) {
		var strTxt = '';
		
		idCampo = '#' + idCampo;
		
		if (tipoGravacao == 'M') {
			tipoGravacao = 'csNgtbManifEspecMaesVo';
		} else if (tipoGravacao == 'P') {
			tipoGravacao = 'csCdtbPessoaespecPeesVo';
		}
		
		if ($.trim($(idCampo).val()).length == 0 ) {
			strTxt += " <input type=\"hidden\" name=\""+ tipoGravacao+ "."+incrementoCampo+"." + nomeTabela + "." + nomeCampo + "\" value=\"" + "" + "\" > ";	
		}
		else {
			
			if (idCampo == '#maniNrSequencia' && $(idCampo).val() == '0') {
				strTxt += " <input type=\"hidden\" name=\""+ tipoGravacao+ "."+incrementoCampo+"." + nomeTabela + "." + nomeCampo + "\" value=\"" + "" + "\" > ";
			} else {
				strTxt += " <input type=\"hidden\" name=\""+ tipoGravacao+ "."+incrementoCampo+"." + nomeTabela + "." + nomeCampo + "\" value=\"" + somenteNumeros($(idCampo).val()) + "\" > ";	
			}
		}
		
		return strTxt;
	};
	
	
	toDoubleGravaBanco = function(valor) {
		valor = valor.replace('.', '');
		valor = valor.replace(',', '.');
		return valor;
	};
	
	
	addCampoSetValoresToFormTextGravaDecimal = function(tipoGravacao, incrementoCampo, idCampo, nomeTabela , nomeCampo ) {
		var strTxt = '';
		
		idCampo = '#' + idCampo;
		
		if (tipoGravacao == 'M') {
			tipoGravacao = 'csNgtbManifEspecMaesVo';
		} else if (tipoGravacao == 'P') {
			tipoGravacao = 'csCdtbPessoaespecPeesVo';
		}
		
		if ($.trim($(idCampo).val()).length == 0 ) {
			strTxt += " <input type=\"hidden\" name=\""+ tipoGravacao+ "."+incrementoCampo+"." + nomeTabela + "." + nomeCampo + "\" value=\"" + "" + "\" > ";	
		}
		else {
			
			if (idCampo == '#maniNrSequencia' && $(idCampo).val() == '0') {
				strTxt += " <input type=\"hidden\" name=\""+ tipoGravacao+ "."+incrementoCampo+"." + nomeTabela + "." + nomeCampo + "\" value=\"" + "" + "\" > ";
			} else {
				strTxt += " <input type=\"hidden\" name=\""+ tipoGravacao+ "."+incrementoCampo+"." + nomeTabela + "." + nomeCampo + "\" value=\"" + toDoubleGravaBanco($(idCampo).val()) + "\" > ";	
			}
		}
		
		return strTxt;
	};
	

	addCampoSetValoresToFormCheckBox = function(tipoGravacao, incrementoCampo, idCampo, nomeTabela , nomeCampo) {
		
		var strTxt = '';
		
		idCampo = '#' + idCampo;
		
		if (tipoGravacao == 'M') {
			tipoGravacao = 'csNgtbManifEspecMaesVo';
		} else if (tipoGravacao == 'P') {
			tipoGravacao = 'csCdtbPessoaespecPeesVo';
		}
		
		if ($(idCampo).is(":checked")) {
			strTxt += " <input type=\"hidden\" name=\""+ tipoGravacao+ "."+incrementoCampo+"." + nomeTabela + "." + nomeCampo + "\" value=\"" + "S" + "\" > ";	
		}
		else {
			strTxt += " <input type=\"hidden\" name=\""+ tipoGravacao+ "."+incrementoCampo+"." + nomeTabela + "." + nomeCampo + "\" value=\"" + "N" + "\" > ";
		}
		
		return strTxt;
	};
	
	somenteNumeros = function(str){
		return str.replace(/[^\d]+/g,''); 
	};
	
	acromy = function(texto , qtdeCarecteresAcronym) {
		var retorno = '';
		
		try {
			if (texto != null && texto != undefined) {
				if (isNaN(texto) == false) {
					texto = texto.toString();
				}
			}
			
			if ( texto.length > 0  ) {
				if ( texto.length > qtdeCarecteresAcronym ) {
					var $acronym = $("<acronym></acronym>");
					$acronym.attr("title", texto );
					$acronym.html(texto.substring(0, qtdeCarecteresAcronym -1) + '...');
					retorno = $acronym;
				} else {
					retorno = texto;
				}
			}
		} catch (e) {
			retorno = texto;
		}
		
		if (retorno == '') {
			retorno = texto;
		}
		
		return retorno;
	};
	
	adicionarColuna = function(row, nomeTd, camposValor , tamanho) {
		
		if (tamanho == null) {
			tamanho = 10;
		}
		
		if (camposValor != null && $.trim(camposValor.toString()).length > 0 ) {
			$(row).find(nomeTd).html(acromy(camposValor, tamanho));	
		} else {
			$(row).find(nomeTd).html(acromy('', tamanho));
		}
	};
	
	
	
	
})(jQuery);

