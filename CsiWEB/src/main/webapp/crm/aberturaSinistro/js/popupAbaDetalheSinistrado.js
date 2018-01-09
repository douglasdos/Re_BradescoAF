(function($){
	var statusDetalhe = 'novo';
	var $trCloneDetalhe = $("#trCloneDetalhe").clone();
	$trCloneDetalhe.css('display','');
	$("#trCloneDetalhe").remove();
	
	var $trDetNenhumRegistroClone = $("#trDetNenhumRegistroClone").clone();
	$trDetNenhumRegistroClone.css('display','');
	$("#trDetNenhumRegistroClone").remove();
	
	$("#tabelaDetalhe").append($trDetNenhumRegistroClone.clone());
	
	calcularValorEstimado = function() {
		if (($("#txtDetQtde").val() != null && $("#txtDetQtde").val().toString().length > 0) 
				&& ($("#txtDetValor").val() != null && $("#txtDetValor").val().toString().length > 0)) {
			var valor = replaceAll($("#txtDetValor").val(), '.','');
			valor = replaceAll(valor, ',','.');
			 
			var valor = (parseFloat($("#txtDetQtde").val()) * parseFloat(valor)); 
			var texto = valor.toLocaleString("pt-BR", { minimumFractionDigits: 2 });
			$("#txtDetValorTotalDanos").val(texto);
		} else {
			$("#txtDetValorTotalDanos").val('');
		}
	};
	
	function replaceAll(string, token, newtoken) {
		while (string.indexOf(token) != -1) {
			string = string.replace(token, newtoken);
		}
		return string;
	}
	
	configurarControleAbaDetalheSinistrado = function() {
		
		configurarControlePadrao($("#cmbDetClassificacao"),'','',true);
		carregarComboClassificacao($("#cmbDetClassificacao"));
		
		$("#cmbDetClassificacao").bind('change', function(){
			var textSelect = $(this).find(':selected').text().toUpperCase(); 
			if ( textSelect.indexOf('PRÉDIO') >= 0) {
				$("#txtDetQtde").attr('readonly' , 'readonly');
				$("#txtDetQtde").val('1');
			} else {
				$("#txtDetQtde").removeAttr('readonly');
			}
			calcularValorEstimado();
		});
		
		configurarControlePadrao($("#txtDetQtde"),'0#','9',true);
		$("#txtDetQtde").bind('blur',function(){
			calcularValorEstimado();
		});
		
		configurarControlePadrao($("#txtDetValor"),'','17',true); 
		$("#txtDetValor").mask("#.##0,00", {reverse: true});
		
		$("#txtDetValor").bind('blur',function(){
			calcularValorEstimado();
			
			if ($.trim( $(this).val()).length > 0) {
				var valor = replaceAll($(this).val(), '.','');
				valor = replaceAll(valor, ',','.');
				$(this).val(parseFloat(valor).toLocaleString("pt-BR", { minimumFractionDigits: 2 }));	
			}
		});
		
		configurarControlePadrao($("#txtDetValorTotalDanos"),'','17',true); 
		$("#txtDetValorTotalDanos").mask("#.##0,00", {reverse: true});
		
		configurarControlePadrao($("#txtaDetDescricao"),'','50',true);
		
		configurarControlePadrao($("#txtDetTotal"),'','17',true);
	 
		desabilitarBotao('btnDetSalvarDetalhe');
		desabilitarBotao('btnDetCancelar');
	};

	//funcaoEvento
	$("#btnDetIncluirDetalhe").bind('click',function(){
		funcIncluirDetalhe();
	});


//	//funcaoBotao
	funcIncluirDetalhe = function() {
		statusDetalhe = 'novo';
		$("#detalheBemSinistrado").find(':text:not(#txtDetTotal)').val('');
		desabilitarBotao('btnDetIncluirDetalhe');
		habilitarBotao('btnDetSalvarDetalhe', funcGravarDetalhe , 'Salvar Detalhe Bem Sinistrado');
		habilitarBotao('btnDetCancelar', funcCancelarDetalhe , 'Cancelar');
		funcHabilitarCampos();
		$("#cmbDetClassificacao").trigger('focus');
	};
	
	funcGravarDetalhe = function() {
		var mensagemErro = '';
		if ($.trim($("#cmbDetClassificacao :selected").val()).length == 0 ) {
			mensagemErro += 'Informe a Classificação\n'; 
		}
		
		if ($.trim($("#txtDetQtde").val()).length == 0 ) {
			mensagemErro += 'Informa Quantidade do Bem\n';
		}
		
		if ($.trim($("#txtDetValor").val()).length == 0 ) {
			mensagemErro += 'Informe o Valor do Bem\n';
		}
		
		if ($.trim($("#txtDetValor").val()).length == 0 ) {
			mensagemErro += 'Informe a Descrição do Bem\n';
		}
		
		if (mensagemErro.length > 0 ) {
			alert(mensagemErro);
			return false;
		}
		
		if (statusDetalhe == 'novo') {
			if (funAdicionarDetalhe(
					$("#cmbDetClassificacao :selected").val(),
					$("#cmbDetClassificacao :selected").text(),
					$("#txtDetQtde").val(),
					$("#txtDetValor").val(),
					$("#txtDetValorTotalDanos").val(),
					$("#txtaDetDescricao").val()) == false) {
				return false;	
			}
		} else { //alterar
			
			if (funAlterarDetalhe(
					$("#cmbDetClassificacao :selected").val(),
					$("#cmbDetClassificacao :selected").text(),
					$("#txtDetQtde").val(),
					$("#txtDetValor").val(),
					$("#txtDetValorTotalDanos").val(),
					$("#txtaDetDescricao").val()) == false) {
				return false;	
			}
		}
		
		verificaHabilitarNenhumRegistroDetalhe();
		
		funcLimparDetalhes();
	};
	
	funcCancelarDetalhe = function() {
		funcLimparDetalhes();
	};

	
//	//FuncaoExtra
	calcularTotalDetalhe = function() {
		var lstLinhas = $("#tabelaDetalhe").find('[id=trCloneDetalhe]');
		
		var soma = 0.0;
		for ( var int = 0; int < lstLinhas.length; int++) {
			var linha = lstLinhas[int];
			var objeto = $(linha).data('objeto');
			
			if ($.trim(objeto.detValorTotalDanos).length > 0 ) {
				var detValorTotalDanos = replaceAll(objeto.detValorTotalDanos, '.','');
				detValorTotalDanos = replaceAll(detValorTotalDanos, ',','.');
				soma+= parseFloat(detValorTotalDanos);
			}
		}
		soma = soma.toLocaleString("pt-BR", { minimumFractionDigits: 2 });
		$("#txtDetTotal").val(soma);
	};
	
	verificaHabilitarNenhumRegistroDetalhe = function() {
		
		var $trNenhumRegistro = $("#tabelaDetalhe").find('#trDetNenhumRegistroClone'); 
		if ( $trNenhumRegistro != null && $trNenhumRegistro.length > 0) {
			$trNenhumRegistro.remove();
		}
		
		if (!($("#tabelaDetalhe").find('[id=trCloneDetalhe]') != null && $("#tabelaDetalhe").find('[id=trCloneDetalhe]').length > 0)) {
			$("#tabelaDetalhe").append($trDetNenhumRegistroClone.clone());
		} 
	};
	
	funAdicionarDetalhe = function(
			detClassificacao,
			detClassificacaoDescricao,
			qtde,
			detValor,
			detValorTotalDanos,
			descricao) {
		
		var objeto = {};
		
		objeto.detClassificacao = (detClassificacao != null && $.trim(detClassificacao).length > 0 ? detClassificacao : '' );
		objeto.detClassificacaoDescricao = (detClassificacaoDescricao != null && $.trim(detClassificacaoDescricao).length > 0 ? detClassificacaoDescricao : '' );
		objeto.qtde = (qtde != null && $.trim(qtde).length > 0 ? qtde : '' );
		objeto.detValor = (detValor != null && $.trim(detValor).length > 0 ? detValor : '' );
		objeto.detValorTotalDanos = (detValorTotalDanos != null && $.trim(detValorTotalDanos).length > 0 ? detValorTotalDanos : '' );
		objeto.descricao = (descricao != null && $.trim(descricao).length > 0 ? descricao : '' );
		
		var $rowAdd = $trCloneDetalhe.clone();
		$rowAdd.data('objeto' , objeto);
		
		$rowAdd.find('#tdDetDescricao').html(acromy(objeto.descricao, 41));
		$rowAdd.find('#tdDetQtde').html(acromy(objeto.qtde, 10));
		$rowAdd.find('#tdDetValorUnitario').html(acromy(objeto.detValor, 20));
		$rowAdd.find('#tdDetPrejuizo').html(acromy(objeto.detValorTotalDanos, 20));

		$rowAdd.find('#btnDetExcluirDetalhe').bind('click',function(event){
			event.stopPropagation();
			$(this).parents('tr').remove();
			verificaHabilitarNenhumRegistroDetalhe();
			calcularTotalDetalhe();
			funcLimparDetalhes();
		});
		
		$rowAdd.bind('click',function(){
			statusDetalhe = 'editar';
			var objeto = $(this).data('objeto');
			
			$("#cmbDetClassificacao").val((objeto.detClassificacao != null && $.trim(objeto.detClassificacao).length > 0 ? objeto.detClassificacao : '' ));
			$("#txtDetQtde").val((objeto.qtde != null && $.trim(objeto.qtde).length > 0 ? objeto.qtde : '' ));
			$("#txtDetValor").val((objeto.detValor != null && $.trim(objeto.detValor).length > 0 ? objeto.detValor : '' ));
			$("#txtDetValorTotalDanos").val((objeto.detValorTotalDanos != null && $.trim(objeto.detValorTotalDanos).length > 0 ? objeto.detValorTotalDanos : '' ));
			$("#txtaDetDescricao").val((objeto.descricao != null && $.trim(objeto.descricao).length > 0 ? objeto.descricao : '' ));
			
			if (isSinistroCompleto() == false) {
				desabilitarBotao('btnDetIncluirDetalhe');
				habilitarBotao('btnDetSalvarDetalhe', funcGravarDetalhe , 'Salvar Detalhe Bem Sinistrado');
				habilitarBotao('btnDetCancelar', funcCancelarDetalhe , 'Cancelar');	
			}
			
			$("#tabelaDetalhe").find('[id=trCloneDetalhe]').css('background-color','#F4F4F4');			
			$(this).css('background-color','rgb(214, 217, 224)');
						
			funcHabilitarCampos();
			
			var textSelect = objeto.detClassificacaoDescricao.toUpperCase(); 
			if ( textSelect.indexOf('PRÉDIO') >= 0) {
				$("#txtDetQtde").attr('readonly' , 'readonly');
				$("#txtDetQtde").val('1');
			} else {
				$("#txtDetQtde").removeAttr('readonly');
			}
			
			$("#txtEquiItem").trigger('focus');
			
		});
		
		$("#tabelaDetalhe").append($rowAdd);
		
		verificaHabilitarNenhumRegistroDetalhe();
		
		calcularTotalDetalhe();
		
		return true;
		
	};
	
	funAlterarDetalhe = function(
			detClassificacao,
			detClassificacaoDescricao,
			qtde,
			detValor,
			detValorTotalDanos,
			descricao) {
		
		
		var objeto = {};
		
		objeto.detClassificacao = (detClassificacao != null && $.trim(detClassificacao).length > 0 ? detClassificacao : '' );
		objeto.detClassificacaoDescricao = (detClassificacaoDescricao != null && $.trim(detClassificacaoDescricao).length > 0 ? detClassificacaoDescricao : '' );
		objeto.qtde = (qtde != null && $.trim(qtde).length > 0 ? qtde : '' );
		objeto.detValor = (detValor != null && $.trim(detValor).length > 0 ? detValor : '' );
		objeto.detValorTotalDanos = (detValorTotalDanos != null && $.trim(detValorTotalDanos).length > 0 ? detValorTotalDanos : '' );
		objeto.descricao = (descricao != null && $.trim(descricao).length > 0 ? descricao : '' );
		
		var $rowAdd = $("#tabelaDetalhe").find('[id=trCloneDetalhe]').filter(function(index,elemen){
			if (replaceAll($(elemen).css('background-color'), ' ', '' ) == 'rgb(214,217,224)') {
				return true;
			}
		});
		
		$rowAdd.data('objeto' , objeto);
		
		$rowAdd.find('#tdDetDescricao').html(acromy(objeto.descricao, 41));
		$rowAdd.find('#tdDetQtde').html(acromy(objeto.qtde, 10));
		$rowAdd.find('#tdDetValorUnitario').html(acromy(objeto.detValor, 20));
		$rowAdd.find('#tdDetPrejuizo').html(acromy(objeto.detValorTotalDanos, 20));
		
		$("#tabelaDetalhe").find('[id=trCloneDetalhe]').css('background-color','rgb(244, 244, 244)');
		
		verificaHabilitarNenhumRegistroDetalhe();
		
		calcularTotalDetalhe();
		
		return true;
		
	};

	funcLimparDetalhes = function() {
		$("#detalheBemSinistrado").find(':text:not(#txtDetTotal)').val('');
		$("#detalheBemSinistrado").find('select').val('');
		$("#detalheBemSinistrado").find('textarea').val('');
		habilitarBotao('btnDetIncluirDetalhe', funcIncluirDetalhe , 'Incluir Detalhe Bem Sinistrado');
		desabilitarBotao('btnDetSalvarDetalhe');
		desabilitarBotao('btnDetCancelar');
		funcDesabilitarCampos();
		$("#tabelaDetalhe").find('[id=trCloneDetalhe]').css('background-color','rgb(244, 244, 244)');
		statusDetalhe = 'novo';
	};
	
	funcHabilitarCampos = function() {
		$("#cmbDetClassificacao").removeAttr('disabled');
		$("#txtDetQtde").removeAttr('readonly');
		$("#txtDetValor").removeAttr('readonly');
		$("#txtaDetDescricao").removeAttr('readonly');
	};
	
	
	funcDesabilitarCampos = function() {
		
		$("#cmbDetClassificacao").attr('disabled' , true);
		$("#txtDetQtde").attr('readonly' , 'readonly');
		$("#txtDetValor").attr('readonly' , 'readonly');
		$("#txtaDetDescricao").attr('readonly' , 'readonly');
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
	
	//FuncaoAjax
	carregarComboClassificacao = function(cmbClassificacao) {
		
		cmbClassificacao.empty();
		cmbClassificacao.append($("<option></option>").val("").html("Carregando..."));
		
		var wi = (window.dialogArguments)?window.dialogArguments:window.opener;

		var objGrupoRamos = JSON.parse($("#hidGrupoRamos",wi.document).val());
		
		if (objGrupoRamos != null && objGrupoRamos.length > 0) {
			if (objGrupoRamos[0].classificacao != null && objGrupoRamos[0].classificacao.length > 0) {
				cmbClassificacao.empty();
				cmbClassificacao.append($("<option></option>").val("").html("Selecione uma opção"));
				for ( var i = 0; i < objGrupoRamos[0].classificacao.length; i++) {
					var classificacao = objGrupoRamos[0].classificacao[i];
					cmbClassificacao.append($("<option></option>").val(classificacao.retaCdCorporativo).html(classificacao.retaDsResptabulada));
				}	
			}
		}
	};
})(jQuery);