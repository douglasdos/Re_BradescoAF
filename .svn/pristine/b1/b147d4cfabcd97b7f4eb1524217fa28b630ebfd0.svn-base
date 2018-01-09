(function($){
	var statusEquipamento = 'novo';
	var $trCloneEquipamentos = $("#trCloneEquipamentos").clone();
	$trCloneEquipamentos.css('display','');
	$("#trCloneEquipamentos").remove();
	
	var $trEquiNenhumRegistroClone = $("#trEquiNenhumRegistroClone").clone();
	$trEquiNenhumRegistroClone.css('display','');
	$("#trEquiNenhumRegistroClone").remove();
	
	$("#tabelaEquipamentos").append($trEquiNenhumRegistroClone.clone());
	
	calcularValorEstimadoEquipamentos = function() {
		if (($("#txtEquiQtde").val() != null && $("#txtEquiQtde").val().toString().length > 0) 
				&& ($("#txtEquiValorDano").val() != null && $("#txtEquiValorDano").val().toString().length > 0)) {
			var valor = replaceAll($("#txtEquiValorDano").val(), '.','');
			valor = replaceAll(valor, ',','.');
			 
			var valor = (parseFloat($("#txtEquiQtde").val()) * parseFloat(valor)); 
			var texto = valor.toLocaleString("pt-BR", { minimumFractionDigits: 2 });
			$("#txtEquiValorEstimado").val(texto);
		} else {
			$("#txtEquiValorEstimado").val('');
		}
	};
	
	function replaceAll(string, token, newtoken) {
		while (string.indexOf(token) != -1) {
			string = string.replace(token, newtoken);
		}
		return string;
	}
	
	configurarControleAbaEquipamentos = function() {
		
		configurarControlePadrao($("#txtEquiItem"),'0#','9',true);
		configurarControlePadrao($("#txtEquiNome"),'','50',true);
		configurarControlePadrao($("#txtEquiNumeroSerie"),'','50',true);
		configurarControlePadrao($("#txtEquiMarca"),'','50',true);
		configurarControlePadrao($("#txtEquiAnoFabricacao"),'0#','4',true);
		configurarControlePadrao($("#txtEquiModelo"),'','50',true);
		configurarControlePadrao($("#txtEquiQtde"),'0#','9',true);
		
		$("#txtEquiQtde").bind('blur',function(){
			calcularValorEstimadoEquipamentos();
		});
		
		$("#txtEquiValorDano").bind('blur',function(){
			calcularValorEstimadoEquipamentos();
			
			if ($.trim( $(this).val()).length > 0) {
				var valor = replaceAll($(this).val(), '.','');
				valor = replaceAll(valor, ',','.');
				$(this).val(parseFloat(valor).toLocaleString("pt-BR", { minimumFractionDigits: 2 }));	
			}
		});

		configurarControlePadrao($("#txtEquiValorEstimado"),'','17',true); 
		$("#txtEquiValorEstimado").mask("#.##0,00", {reverse: true}); 

		configurarControlePadrao($("#txtEquiValorDano"),'','17',true); 
		$("#txtEquiValorDano").mask("#.##0,00", {reverse: true});
		
		configurarControlePadrao($("#txtEquiTotal"),'','17',true); 
		$("#txtEquiTotal").mask("#.##0,00", {reverse: true});
		
		desabilitarBotao('btnEquiSalvarEquipamento');
		desabilitarBotao('btnEquiCancelar');
	};

	//funcaoEvento
	$("#btnEquiIncluirEquipamento").bind('click',function(){
		funcIncluirEquipamentos();
	});
	
	$("#btnEquiListaEquipamento").bind('click',function(){
		funcAbrirListaEquipamentos();
	});
	
	//funcaoBotao
	funcIncluirEquipamentos = function() {
		statusEquipamento = 'novo';
		$("#equipamentos").find(':text:not(#txtEquiTotal)').val('');
		desabilitarBotao('btnEquiIncluirEquipamento');
		habilitarBotao('btnEquiSalvarEquipamento', funcGravarEquipamentos , 'Salvar Equipamento');
		habilitarBotao('btnEquiCancelar', funcCancelarEquipamentos , 'Cancelar');
		funcHabilitarCamposEquipamentos();
		$("#txtEquiItem").trigger('focus');
	};
	
	funcGravarEquipamentos = function() {
		var mensagemErro = '';
		if ($.trim($("#txtEquiNome").val()).length == 0 ) {
			mensagemErro += 'Informe o Nome do Equipamento Sinistrado\n'; 
		}
		
		if ($.trim($("#txtEquiMarca").val()).length == 0 ) {
			mensagemErro += 'Informe a Marca do Equipamento Sinistrado\n';
		}
		
		if ($.trim($("#txtEquiValorDano").val()).length == 0 ) {
			mensagemErro += 'Informe o Valor do Dano\n';
		}
		
		if (mensagemErro.length > 0 ) {
			alert(mensagemErro);
			return false;
		}
		
		if (statusEquipamento == 'novo') {
			if (funAdicionarEquipamento(
					$("#txtEquiItem").val(),
					$("#txtEquiNome").val(),
					$("#txtEquiNumeroSerie").val(),
					$("#txtEquiMarca").val(),
					$("#txtEquiAnoFabricacao").val(),
					$("#txtEquiModelo").val(),
					$("#txtEquiQtde").val(),
					$("#txtEquiValorEstimado").val(),
					$("#txtEquiValorDano").val()) == false) {
				return false;	
			}
		} else { //alterar
			
			if (funAlterarEquipamento(
					$("#txtEquiItem").val(),
					$("#txtEquiNome").val(),
					$("#txtEquiNumeroSerie").val(),
					$("#txtEquiMarca").val(),
					$("#txtEquiAnoFabricacao").val(),
					$("#txtEquiModelo").val(),
					$("#txtEquiQtde").val(),
					$("#txtEquiValorEstimado").val(),
					$("#txtEquiValorDano").val()) == false) {
				return false;	
			}
		}
		
		verificaHabilitarNenhumRegistroEquipamentos();
		
		funcLimparEquipamentos();
	};
	
	funcCancelarEquipamentos = function() {
		funcLimparEquipamentos();
	};
	
	funcAbrirListaEquipamentos = function() {
		showModalDialog('AbrirListaEquipamentoSinistro.do', window, 'help:no;scroll:no;Status:NO;dialogWidth:1000px;dialogHeight:250px;dialogTop:270px;dialogLeft:10px');
	};
	
	//FuncaoExtra
	calcularTotalEquipamentos = function() {
		var lstLinhas = $("#tabelaEquipamentos").find('[id=trCloneEquipamentos]');
		
		var soma = 0.0;
		for ( var int = 0; int < lstLinhas.length; int++) {
			var linha = lstLinhas[int];
			var objeto = $(linha).data('objeto');
			
			if ($.trim(objeto.valorEstimado).length > 0 ) {
				var valorEstimado = replaceAll(objeto.valorEstimado, '.','');
				valorEstimado = replaceAll(valorEstimado, ',','.');
				soma+= parseFloat(valorEstimado);
			}
		}
		soma = soma.toLocaleString("pt-BR", { minimumFractionDigits: 2 });
		$("#txtEquiTotal").val(soma);
	};
	
	verificaHabilitarNenhumRegistroEquipamentos = function() {
		
		var $trNenhumRegistro = $("#tabelaEquipamentos").find('#trEquiNenhumRegistroClone'); 
		if ( $trNenhumRegistro != null && $trNenhumRegistro.length > 0) {
			$trNenhumRegistro.remove();
		}
		
		if (!($("#tabelaEquipamentos").find('[id=trCloneEquipamentos]') != null && $("#tabelaEquipamentos").find('[id=trCloneEquipamentos]').length > 0)) {
			$("#tabelaEquipamentos").append($trEquiNenhumRegistroClone.clone());
		}
	};
	
	funAdicionarEquipamento = function(
			item,
			descricao,
			serieEquipamento,
			marca,
			anoFrabicacaoEquipamento,
			modelo, 
			qtde, 
			valorEstimado, 
			valor) {
		
		
		var objeto = {};
		
		objeto.item = (item != null && $.trim(item).length > 0 ? item : '' );
		objeto.descricao = (descricao != null && $.trim(descricao).length > 0 ? descricao : '' );
		objeto.serieEquipamento = (serieEquipamento != null && $.trim(serieEquipamento).length > 0 ? serieEquipamento : '' );
		objeto.marca = (marca != null && $.trim(marca).length > 0 ? marca : '' );
		objeto.anoFrabicacaoEquipamento = (anoFrabicacaoEquipamento != null && $.trim(anoFrabicacaoEquipamento).length > 0 ? anoFrabicacaoEquipamento : '' );
		objeto.modelo = (modelo != null && $.trim(modelo).length > 0 ? modelo : '' );
		objeto.qtde = (qtde != null && $.trim(qtde).length > 0 ? qtde : '' );
		objeto.valorEstimado = (valorEstimado != null && $.trim(valorEstimado).length > 0 ? valorEstimado : '' );
		objeto.valor = (valor != null && $.trim(valor).length > 0 ? valor : '' );
		
		if ($("#tabelaEquipamentos").find('[id=trCloneEquipamentos]').length > 9 ) {
			alert('Só é permitido adicionar até 10 equipamentos');
			return false;
		}
		
		if (validarMesmoNumeroDeItemESerie(objeto)) {
			return false;
		}
		
		var $rowAdd = $trCloneEquipamentos.clone();
		$rowAdd.data('objeto' , objeto);
		
		$rowAdd.find('#tdEquiNumeroSerie').html(acromy(objeto.serieEquipamento, 7));
		$rowAdd.find('#tdEquiNomeEquipamento').html(acromy(objeto.descricao, 33));
		$rowAdd.find('#tdEquiQtde').html(acromy(objeto.qtde, 7));
		$rowAdd.find('#tdEquiValorDano').html(acromy(objeto.valor, 14));
		$rowAdd.find('#tdEquiValorEstimado').html(acromy(objeto.valorEstimado, 28));
		

		$rowAdd.find('#btnEquiExcluir').bind('click',function(event){
			event.stopPropagation();
			$(this).parents('tr').remove();
			verificaHabilitarNenhumRegistroEquipamentos();
			calcularTotalEquipamentos();
			funcLimparEquipamentos();
		});
		
		$rowAdd.bind('click',function(){
			statusEquipamento = 'editar';
			var objeto = $(this).data('objeto');

			$("#txtEquiItem").val((objeto.item != null && $.trim(objeto.item).length > 0 ? objeto.item : '' ));
			$("#txtEquiNome").val((objeto.descricao != null && $.trim(objeto.descricao).length > 0 ? objeto.descricao : '' ));
			$("#txtEquiNumeroSerie").val((objeto.serieEquipamento != null && $.trim(objeto.serieEquipamento).length > 0 ? objeto.serieEquipamento : '' ));
			$("#txtEquiMarca").val((objeto.marca != null && $.trim(objeto.marca).length > 0 ? objeto.marca : '' ));
			$("#txtEquiAnoFabricacao").val((objeto.anoFrabicacaoEquipamento != null && $.trim(objeto.anoFrabicacaoEquipamento).length > 0 ? objeto.anoFrabicacaoEquipamento : '' ));
			$("#txtEquiModelo").val((objeto.modelo != null && $.trim(objeto.modelo).length > 0 ? objeto.modelo : '' ));
			$("#txtEquiQtde").val((objeto.qtde != null && $.trim(objeto.qtde).length > 0 ? objeto.qtde : '' ));
			$("#txtEquiValorEstimado").val((objeto.valorEstimado != null && $.trim(objeto.valorEstimado).length > 0 ? objeto.valorEstimado : '' ));
			$("#txtEquiValorDano").val((objeto.valor != null && $.trim(objeto.valor).length > 0 ? objeto.valor : '' ));
			
			if (isSinistroCompleto() == false) {
				desabilitarBotao('btnEquiIncluirEquipamento');
				habilitarBotao('btnEquiSalvarEquipamento', funcGravarEquipamentos , 'Salvar Equipamento');
				habilitarBotao('btnEquiCancelar', funcCancelarEquipamentos , 'Cancelar');
			}
			
			$("#tabelaEquipamentos").find('[id=trCloneEquipamentos]').css('background-color','#F4F4F4');			
			$(this).css('background-color','rgb(214, 217, 224)');
						
			funcHabilitarCamposEquipamentos();
			$("#txtEquiItem").trigger('focus');
			
		});
		
		$("#tabelaEquipamentos").append($rowAdd);
		
		verificaHabilitarNenhumRegistroEquipamentos();
		
		calcularTotalEquipamentos();
		
		return true;
		
	};
	
	funAlterarEquipamento = function(
			item,
			descricao,
			serieEquipamento,
			marca,
			anoFrabicacaoEquipamento,
			modelo, 
			qtde, 
			valorEstimado, 
			valor) {
		
		
		var objeto = {};
		
		objeto.item = (item != null && $.trim(item).length > 0 ? item : '' );
		objeto.descricao = (descricao != null && $.trim(descricao).length > 0 ? descricao : '' );
		objeto.serieEquipamento = (serieEquipamento != null && $.trim(serieEquipamento).length > 0 ? serieEquipamento : '' );
		objeto.marca = (marca != null && $.trim(marca).length > 0 ? marca : '' );
		objeto.anoFrabicacaoEquipamento = (anoFrabicacaoEquipamento != null && $.trim(anoFrabicacaoEquipamento).length > 0 ? anoFrabicacaoEquipamento : '' );
		objeto.modelo = (modelo != null && $.trim(modelo).length > 0 ? modelo : '' );
		objeto.qtde = (qtde != null && $.trim(qtde).length > 0 ? qtde : '' );
		objeto.valorEstimado = (valorEstimado != null && $.trim(valorEstimado).length > 0 ? valorEstimado : '' );
		objeto.valor = (valor != null && $.trim(valor).length > 0 ? valor : '' );
		
		if ($("#tabelaEquipamentos").find('[id=trCloneEquipamentos]').length > 9 ) {
			alert('Só é permitido adicionar até 10 equipamentos');
			return false;
		}
		
		if (validarMesmoNumeroDeItemESerieEditar(objeto)) {
			return false;
		}
		
		var $rowAdd = $("#tabelaEquipamentos").find('[id=trCloneEquipamentos]').filter(function(index,elemen){
			if ($(elemen).css('background-color') == 'rgb(214, 217, 224)') {
				return true;
			}
		});
		
		$rowAdd.data('objeto' , objeto);
		
		$rowAdd.find('#tdEquiNumeroSerie').html(acromy(objeto.serieEquipamento, 7));
		$rowAdd.find('#tdEquiNomeEquipamento').html(acromy(objeto.descricao, 33));
		$rowAdd.find('#tdEquiQtde').html(acromy(objeto.qtde, 7));
		$rowAdd.find('#tdEquiValorDano').html(acromy(objeto.valor, 14));
		$rowAdd.find('#tdEquiValorEstimado').html(acromy(objeto.valorEstimado, 28));
		
		
		$("#tabelaEquipamentos").find('[id=trCloneEquipamentos]').css('background-color','rgb(244, 244, 244)');
		
		verificaHabilitarNenhumRegistroEquipamentos();
		
		calcularTotalEquipamentos();
		
		return true;
		
	};
	
	validarMesmoNumeroDeItemESerie = function(objeto){
		var lstEquipamentos = $("#tabelaEquipamentos").find('[id=trCloneEquipamentos]');
		
		var mensagem = '';
		var encontrouItem = false;
		var encontrouSerie = false;
		
		for ( var i = 0; i < lstEquipamentos.length; i++) {
			var linha = lstEquipamentos[i];
			var objetoLinha = $(linha).data('objeto');
			if ((objetoLinha.item == objeto.item)) {
				encontrouItem = true;
			}
		}
		
		for ( var i = 0; i < lstEquipamentos.length; i++) {
			var linha = lstEquipamentos[i];
			var objetoLinha = $(linha).data('objeto');
			if (((objetoLinha.serieEquipamento.length > 0 && objeto.serieEquipamento.length > 0) && objetoLinha.serieEquipamento == objeto.serieEquipamento)) {
				encontrouSerie = true;
			}
		}
		
		if (encontrouItem == true) {
			mensagem = 'Número de Item já cadastrado\n';
		}
		
		if (encontrouSerie == true) {
			mensagem += 'Número de Série já cadastrado\n';
		}
		
		if (mensagem.length > 0 ) {
			alert(mensagem);
			return true;
		}
		
		return false;
	};
	
	validarMesmoNumeroDeItemESerieEditar = function(objeto){
		var lstEquipamentos = $("#tabelaEquipamentos").find('[id=trCloneEquipamentos]').filter(function(index,elemen){
			if ($(elemen).css('background-color') == 'rgb(214, 217, 224)') {
				return false;
			} else {
				return true;
			}
		});
		
		var mensagem = '';
		var encontrouItem = false;
		var encontrouSerie = false;
		
		for ( var i = 0; i < lstEquipamentos.length; i++) {
			var linha = lstEquipamentos[i];
			var objetoLinha = $(linha).data('objeto');
			if ((objetoLinha.item == objeto.item)) {
				encontrouItem = true;
			}
		}
		
		for ( var i = 0; i < lstEquipamentos.length; i++) {
			var linha = lstEquipamentos[i];
			var objetoLinha = $(linha).data('objeto');
			if (((objetoLinha.serieEquipamento.length > 0 && objeto.serieEquipamento.length > 0) && objetoLinha.serieEquipamento == objeto.serieEquipamento)) {
				encontrouSerie = true;
			}
		}
		
		if (encontrouItem == true) {
			mensagem = 'Número de Item já cadastrado\n';
		}
		
		if (encontrouSerie == true) {
			mensagem += 'Número de Série já cadastrado\n';
		}
		
		if (mensagem.length > 0 ) {
			alert(mensagem);
			return true;
		}
		
		return false;
	};
	
	funcLimparEquipamentos = function() {
		$("#equipamentos").find(':text:not(#txtEquiTotal)').val('');
		habilitarBotao('btnEquiIncluirEquipamento', funcIncluirEquipamentos , 'Incluir Equipamento');
		desabilitarBotao('btnEquiSalvarEquipamento');
		desabilitarBotao('btnEquiCancelar');
		funcDesabilitarCamposEquipamentos();
		$("#tabelaEquipamentos").find('[id=trCloneEquipamentos]').css('background-color','rgb(244, 244, 244)');
		statusEquipamento = 'novo';
	};
	
	funcHabilitarCamposEquipamentos = function() {
		$("#txtEquiItem").removeAttr('readonly');
		$("#txtEquiNome").removeAttr('readonly');
		$("#txtEquiNumeroSerie").removeAttr('readonly');
		$("#txtEquiMarca").removeAttr('readonly');
		$("#txtEquiAnoFabricacao").removeAttr('readonly');
		$("#txtEquiModelo").removeAttr('readonly');
		$("#txtEquiQtde").removeAttr('readonly');
		$("#txtEquiValorDano").removeAttr('readonly');
	};
	
	
	funcDesabilitarCamposEquipamentos = function() {
		$("#txtEquiItem").attr('readonly' , 'readonly');
		$("#txtEquiNome").attr('readonly' , 'readonly');
		$("#txtEquiNumeroSerie").attr('readonly' , 'readonly');
		$("#txtEquiMarca").attr('readonly' , 'readonly');
		$("#txtEquiAnoFabricacao").attr('readonly' , 'readonly');
		$("#txtEquiModelo").attr('readonly' , 'readonly');
		$("#txtEquiQtde").attr('readonly' , 'readonly');
		$("#txtEquiValorDano").attr('readonly' , 'readonly');
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