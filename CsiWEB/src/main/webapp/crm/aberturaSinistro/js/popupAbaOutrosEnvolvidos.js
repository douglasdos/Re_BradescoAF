(function($){
	var statusDetalhe = 'novo';
	var $trCloneOutros = $("#trCloneOutros").clone();
	$trCloneOutros.css('display','');
	$("#trCloneOutros").remove();
	
	var $trOutNenhumRegistroClone = $("#trOutNenhumRegistroClone").clone();
	$trOutNenhumRegistroClone.css('display','');
	$("#trOutNenhumRegistroClone").remove();
	
	$("#tabelaOutros").append($trOutNenhumRegistroClone.clone());
	
	function replaceAll(string, token, newtoken) {
		while (string.indexOf(token) != -1) {
			string = string.replace(token, newtoken);
		}
		return string;
	}
	
	configurarControleAbaOutrosEnvolvidos = function() {
		
		configurarControlePadrao($("#txtOutNome"),'','50',true);
	 
		configurarControlePadrao($("#txtOutCpfCnpj"),'','14',true);
		
		$("#txtOutCpfCnpj").attr('maxlength', 14);
		$("#txtOutCpfCnpj").mask('0#');
		
		$("#txtOutCpfCnpj").bind('focusin',function() {
			$(this).val($(this).val().replace(/[^\d]+/g,''));
		});
		
		$("#txtOutCpfCnpj").bind('blur',function() {
			if ($.trim($(this).val()).length == 0 ) {
				return false;
			}
			
			if ($.trim($(this).val()).length != 11 && $.trim($(this).val()).length != 14) {
				alert('CPF / CNPJ inválido');
				$(this).val('');
				$(this).focus();
				return false;
			}
			var validarCpfCnpj = false;
			if (validarCPF($(this).val()) == true || validarCNPJ($(this).val()) == true ) {
				validarCpfCnpj = true;
			}

			if (validarCpfCnpj == false) {
				alert('CPF / CNPJ inválido');
				$(this).val('');
				$(this).focus();
				return false;
			}
			
			if ($(this).val().length == 11 ) {
				var cpfFormat = $(this).val().substring(0,3) + '.';
				cpfFormat += $(this).val().substring(3,6) + '.';
				cpfFormat += $(this).val().substring(6,9) + '-';
				cpfFormat += $(this).val().substring(9);
				$(this).val(cpfFormat);
				return ;
			}
			
			if ($(this).val().length == 14) {
				var cnpjFormat = $(this).val().substring(0,2) + '.';
				cnpjFormat += $(this).val().substring(2,5) + '.';
				cnpjFormat += $(this).val().substring(5,8) + '/';
				cnpjFormat += $(this).val().substring(8,12) + '-';
				cnpjFormat += $(this).val().substring(12);
				$(this).val(cnpjFormat);
			}
		});
		
		document.getElementById('txtOutCpfCnpj').onpaste= function() {
			var $cpf = $(this);
			$("#txtOutCpfCnpj").attr('maxlength', 18);
			$("#txtOutCpfCnpj").unmask();
			
			setTimeout(function() {
				$cpf.focus();
			},100);
		};
		
		desabilitarBotao('btnOutSalvarrEnvolvidos');
		desabilitarBotao('btnOutCancelar');
	};

	//funcaoEvento
	$("#btnOutIncluirEnvolvidos").bind('click',function(){
		funcIncluirOutrosEnvolvidos();
	});


//	//funcaoBotao
	funcIncluirOutrosEnvolvidos = function() {
		statusDetalhe = 'novo';
		$("#outrosEnvolvidos").find(':text').val('');
		desabilitarBotao('btnOutIncluirEnvolvidos');
		habilitarBotao('btnOutSalvarrEnvolvidos', funcGravarOutrosEnvolvidos , 'Salvar');
		habilitarBotao('btnOutCancelar', funcCancelarOutrosEnvolvidos , 'Cancelar');
		funcHabilitarCamposOutrosEnvolvidos();
		$("#txtOutNome").trigger('focus');
	};
	
	funcGravarOutrosEnvolvidos = function() {
		var mensagemErro = '';
				
		if ($.trim($("#txtOutNome").val()).length == 0 ) {
			mensagemErro += 'Informe o Nome de Outros Envolvidos\n';
		}
		
		if (mensagemErro.length > 0 ) {
			alert(mensagemErro);
			return false;
		}
		
		if (statusDetalhe == 'novo') {
			if (funAdicionarOutrosEnvolvidos(
					$("#txtOutNome").val(),
					$("#txtOutCpfCnpj").val()) == false) {
				return false;	
			}
		} else { //alterar
			
			if (funAlterarOutrosEnvolvidos(
					$("#txtOutNome").val(),
					$("#txtOutCpfCnpj").val()) == false) {
				return false;	
			}
		}
		
		verificaHabilitarNenhumRegistroOutrosEnvolvidos();
		
		funcLimparOutrosEnvolvidos();
	};
	
	funcCancelarOutrosEnvolvidos = function() {
		funcLimparOutrosEnvolvidos();
	};

	
	verificaHabilitarNenhumRegistroOutrosEnvolvidos = function() {
		
		var $trNenhumRegistro = $("#tabelaOutros").find('#trOutNenhumRegistroClone'); 
		if ( $trNenhumRegistro != null && $trNenhumRegistro.length > 0) {
			$trNenhumRegistro.remove();
		}
		
		if (!($("#tabelaOutros").find('[id=trCloneOutros]') != null && $("#tabelaOutros").find('[id=trCloneOutros]').length > 0)) {
			$("#tabelaOutros").append($trOutNenhumRegistroClone.clone());
		} 
	};
	
	funAdicionarOutrosEnvolvidos = function(
			nome,
			cpf) {
		
		var objeto = {};
		
		objeto.nome = (nome != null && $.trim(nome).length > 0 ? nome : '' );
		objeto.cpf = (cpf != null && $.trim(cpf).length > 0 ? cpf : '' );
		
		var $rowAdd = $trCloneOutros.clone();
		$rowAdd.data('objeto' , objeto);
		
		$rowAdd.find('#tdOutNome').html(acromy(objeto.nome, 65));
		$rowAdd.find('#tdOutCpfCnpj').html(acromy(objeto.cpf, 17));

		$rowAdd.find('#btnOutExcluir').bind('click',function(event){
			event.stopPropagation();
			$(this).parents('tr').remove();
			verificaHabilitarNenhumRegistroOutrosEnvolvidos();
			funcLimparOutrosEnvolvidos();
		});
		
		$rowAdd.bind('click',function(){
			statusDetalhe = 'editar';
			var objeto = $(this).data('objeto');
			
			$("#txtOutNome").val((objeto.nome != null && $.trim(objeto.nome).length > 0 ? objeto.nome : '' ));
			$("#txtOutCpfCnpj").val((objeto.cpf != null && $.trim(objeto.cpf).length > 0 ? formatarCPF(objeto.cpf) : '' ));
			
			if (isSinistroCompleto() == false) {
				desabilitarBotao('btnOutIncluirEnvolvidos');
				habilitarBotao('btnOutSalvarrEnvolvidos', funcGravarOutrosEnvolvidos , 'Salvar');
				habilitarBotao('btnOutCancelar', funcCancelarOutrosEnvolvidos , 'Cancelar');
			}
			
			$("#tabelaOutros").find('[id=trCloneOutros]').css('background-color','#F4F4F4');			
			$(this).css('background-color','rgb(214, 217, 224)');
						
			funcHabilitarCamposOutrosEnvolvidos();
			
			$("#txtOutNome").trigger('focus');
			
		});
		
		$("#tabelaOutros").append($rowAdd);
		
		verificaHabilitarNenhumRegistroOutrosEnvolvidos();
		
		return true;
		
	};
	
	funAlterarOutrosEnvolvidos = function(
			nome,
			cpf) {
		
		var objeto = {};
		
		objeto.nome = (nome != null && $.trim(nome).length > 0 ? nome : '' );
		objeto.cpf = (cpf != null && $.trim(cpf).length > 0 ? cpf : '' );
				
		var $rowAdd = $("#tabelaOutros").find('[id=trCloneOutros]').filter(function(index,elemen){
			if ($(elemen).css('background-color') == 'rgb(214, 217, 224)') {
				return true;
			}
		});
		
		$rowAdd.data('objeto' , objeto);
		
		$rowAdd.find('#tdOutNome').html(acromy(objeto.nome, 65));
		$rowAdd.find('#tdOutCpfCnpj').html(acromy(objeto.cpf, 17));
		
		$("#tabelaOutros").find('[id=trCloneOutros]').css('background-color','rgb(244, 244, 244)');
		
		verificaHabilitarNenhumRegistroOutrosEnvolvidos();
		
		return true;
		
	};

	funcLimparOutrosEnvolvidos = function() {
		$("#outrosEnvolvidos").find(':text').val('');
		habilitarBotao('btnOutIncluirEnvolvidos', funcIncluirOutrosEnvolvidos , 'Incluir');
		desabilitarBotao('btnOutSalvarrEnvolvidos');
		desabilitarBotao('btnOutCancelar');
		funcDesabilitarCamposOutrosEnvolvidos();
		$("#tabelaOutros").find('[id=trCloneOutros]').css('background-color','rgb(244, 244, 244)');
		statusDetalhe = 'novo';
	};
	
	funcHabilitarCamposOutrosEnvolvidos = function() {
		$("#txtOutNome").removeAttr('readonly');
		$("#txtOutCpfCnpj").removeAttr('readonly');
	};
	
	funcDesabilitarCamposOutrosEnvolvidos = function() {
		$("#txtOutNome").attr('readonly' , 'readonly');
		$("#txtOutCpfCnpj").attr('readonly' , 'readonly');
	};

	desabilitarBotao = function(nomeBotao) {
		$("#" + nomeBotao).off('click');
		$("#" + nomeBotao).removeClass();
		$("#" + nomeBotao).addClass('transparent geralImgDisable');
		$("#" + nomeBotao).attr('alt', '');
		$("#" + nomeBotao).attr('title', '');
	};
	
	habilitarBotao = function(nomeBotao, funcao , tooltip) {
		
		if (typeof(funcao) == 'function') {
			$("#" + nomeBotao).off('click');
			$("#" + nomeBotao).bind('click' , function(event) {
				event.stopPropagation();
				funcao();
			});	
		}
		
		$("#" + nomeBotao).removeClass();
		$("#" + nomeBotao).addClass('transparent geralCursoHand');
		$("#" + nomeBotao).attr('alt', tooltip);
		$("#" + nomeBotao).attr('title', tooltip);
	};
})(jQuery);