(function($){
	$(document).ready(function() {
		
		limparTudo = function() {
			$("#listaSucursal").empty();
			limparCampos();	
		};
		
		limparCampos = function() {
			$(":text").val('');
		};
		
		//Carregar combo Estado
		carregarUF = function(nomeCombo, objetoEstado) {
			limparTudo();
			var combo = $('#'+ nomeCombo);
		    combo.empty();
		    combo.append(
				$("<option></option>").val("").html("Selecione uma opção")
			);
			
			var dataEntrada = {};

			$.ajax({
				  method: "POST",
				  url: "/csiweb-bradescore/crm/CarregarUf.do",
				  data: dataEntrada,
				  dataType: 'json'
				})
				.success(function( dataRetorno, textStatus, jqXHR){
					$.each (dataRetorno , function(indice , item) {
		        		combo.append(
		        			$('<option>', { value: item.descUf, text: item.descUf })
		    			);
		            });
				})
				.complete(function(){
					if (objetoEstado != null) {
						SelecionaItemComboInsertCasoEstejaInativo('aure_ds_uf', objetoEstado.value,objetoEstado.text);
					}
				});
		};
		
		
		SelecionaItemComboInsertCasoEstejaInativo = function (nomeCombo , valueDoComboParaSelecionar , descricaoDoComboParaSelecionar ){
			var bExisteValueCombo = false;
			var objCombo = document.getElementById(nomeCombo); 
			
			for (var nCont = 0 ; nCont < objCombo.options.length ; nCont++){
				if (objCombo[nCont].value == valueDoComboParaSelecionar ) {
					bExisteValueCombo = true;
					break;
				}
			}
			
			if (bExisteValueCombo == false){
				$(objCombo).append($('<option>', { value: valueDoComboParaSelecionar, text: descricaoDoComboParaSelecionar }));
			}
			
			objCombo.value = valueDoComboParaSelecionar;
		};
		
		//Evento quando sair do combo de estado.
		$("#aure_ds_uf").bind('change', function(){
			carregarMunicipio('aure_ds_cidade' , $(this).val(), '');
		});
	
		//Carregar cidade;
		carregarMunicipio = function(nomeCombo,estado,municipio,objetoMunicio) {
			limparTudo();
			var combo = $('#'+ nomeCombo);
		    combo.empty();
		    combo.append(
				$("<option></option>").val("").html("Selecione uma opção")
			);
			
			var dataEntrada = {"aure_ds_uf" : '' , "aure_ds_cidade" : ''};
			
			if (estado.length > 0) {
				dataEntrada.aure_ds_uf = estado;
			}
			
			if (municipio.length > 0) {
				dataEntrada.aure_ds_cidade = municipio;
			}
			
			$.ajax({
				  method: "POST",
				  url: "/csiweb-bradescore/crm/CarregarMunicipio.do",
				  data: dataEntrada,
				  dataType: 'json'
				})
				.success(function( dataRetorno, textStatus, jqXHR){
					$.each (dataRetorno , function(indice , item) {
		        		combo.append(
	        				$('<option>', { value: item.muniDsMunicipio, text: item.muniDsMunicipio })
		    			);
		            });
				})
				.complete(function(){
					if (objetoMunicio != null) {
						SelecionaItemComboInsertCasoEstejaInativo('aure_ds_cidade', objetoMunicio.value,objetoMunicio.text);
					}
				});
		};
		
		//função para habitar a procura de cidade pelo campo de texto.
		habilitarTextoMunicipio = function() {
			$("#aure_ds_cidade").toggle();
			$("#aure_ds_cidadeBusca").toggle();
			
			if ($("#aure_ds_cidade").is(":hidden")) {
				$("#btnCancelar").show();
				$("#imgBtnPesquisar").prop('src', '../resources/assets/imgs/check.gif');
				$("#aure_ds_cidadeBusca").val('');
			} else {
				$("#imgBtnPesquisar").prop('src', '../resources/assets/imgs/lupa.gif');
				$("#btnCancelar").hide();
			}
		};
		
		//Envento de click do botão pesquisar e aceitar do cidade por texto. 
		$("#btnPesquisar").bind('click',function() {
			if ($("#aure_ds_cidade").is(":hidden")) {
				if ( !($("#aure_ds_cidadeBusca").val().length > 0)) {
					alert('O Município não pode ser vazio');
					return false;
				} else {
					carregarMunicipio('aure_ds_cidade' , $("#aure_ds_uf").val(), $("#aure_ds_cidadeBusca").val());
				}
			}
			
			habilitarTextoMunicipio();
		});
		
		//Função usado quando o click do botão de cancelar é acionado.
		cancelarTextoMunicipio = function(){
			$("#aure_ds_cidade").show();
			$("#aure_ds_cidadeBusca").hide();
			$("#imgBtnPesquisar").prop('src', '../resources/assets/imgs/lupa.gif');
			carregarMunicipio('aure_ds_cidade' , $("#aure_ds_uf").val(), '');
			$("#btnCancelar").hide();
		};
		
		//Enveto click do botão cancelar
		$("#btnCancelar").bind('click',function() {
			cancelarTextoMunicipio();
		});
		
		//Evento de keyPress de enter ou esc do campo busca de cidade por texto.
		$("#aure_ds_cidadeBusca").bind('keypress', function(event){
			if (event.which == 13 ) {
				$("#btnPesquisar").click();
			}
			
			if (event.which == 27 ) {
				$("#btnCancelar").click();
			} 
		});
		
		configurarControles = function() {
			$(":text:not([id=aure_ds_cidadeBusca])").attr('readonly' , 'readonly');
		};
		
		$("#aure_ds_cidade").bind('change', function(){
			
			$("#listaSucursal").empty();
			limparCampos();
			
			$('#aguarde').css('visibility','visible');
			
			var dataBusca = {};
			dataBusca.aure_ds_uf = $("#aure_ds_uf").val();
			dataBusca.aure_ds_cidade = $("#aure_ds_cidade").val();
			
			$.ajax({
				url : '/csiweb-bradescore/crm/CarregarSucursal.do',
				data : dataBusca,
				type : 'POST',
				dataType : 'json',
			})
			.success(function(data, textStatus, jqXHR) {
				$(data).each(function(index,reg){
					
					if (reg.retorno == false) {
						alert(reg.mensagem);
						return false;
					}
					
					if (reg.listasucursal != null && reg.listasucursal.length > 0) {
						$(reg.listasucursal).each(function(index, sucursal) {
							var item = $("<option></option>").val("").html(sucursal.nome);
							item.prop('objeto', sucursal);
						
							$("#listaSucursal").append(item);	
						});
					}
				});
			})
			.complete(function( jqXHR, textStatus ){
				$('#aguarde').css('visibility','hidden');
			});
		});
		
		$("#listaSucursal").bind('keydown change', function() {
			var reg = $(this).find(':selected').prop('objeto');
			try {$("#nome").val(reg.nome);} catch (e) {}
			try {$("#codigo").val(reg.codigo);} catch (e) {}
			try {$("#endereco").val(reg.endereco);} catch (e) {}
			try {$("#numero").val(reg.numero);} catch (e) {}
			try {$("#complemento").val(reg.complemento);} catch (e) {}
			try {$("#cep").val(reg.cep);} catch (e) {}
			try {$("#bairro").val(reg.bairro);} catch (e) {}
			try {$("#cidade").val(reg.cidade);} catch (e) {}
			try {$("#telefone").val(reg.telefone);} catch (e) {}
		});
	
		init = function() {
			configurarControles();
			carregarUF('aure_ds_uf');
			carregarMunicipio('aure_ds_cidade' , $("#aure_ds_uf").val(), '');
		};
		init();
	});
})(jQuery);