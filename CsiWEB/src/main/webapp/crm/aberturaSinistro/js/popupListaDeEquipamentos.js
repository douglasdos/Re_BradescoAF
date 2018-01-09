(function($){
	$(document).ready(function(){
		var $trClone = $("#trClone").clone();
		$trClone.css('display','');
		$("#trClone").remove();
		
		var $trEquiNenhumRegistroClone = $("#trNenhumRegistroClone").clone();
		$trEquiNenhumRegistroClone.css('display','');
		$("#trNenhumRegistroClone").remove();
		
		
		carregarEquipamentos = function() {
			var wi = (window.dialogArguments)?window.dialogArguments:window.opener;
			
			var apolice = JSON.parse($("#hidObterApolice",wi.document).val());

			if (apolice != null && apolice.length > 0) {
				if (apolice[0].apolice != null) {
					var apolice = apolice[0].apolice;
					if (apolice.equipamentos != null && apolice.equipamentos.length > 0 ) {
						$(apolice.equipamentos).each(function(index,reg){
							
							var $rowAdd = $trClone.clone();
							$rowAdd.data('objeto' , reg);
							
							if (reg.item == 0) {
								return;
							}
							
							$rowAdd.find('#tdNome').find('span').html(acromy(reg.descricao, 15));
							$rowAdd.find('#tdNome').find(':text').val(reg.descricao);
							
							$rowAdd.find('#tdMarca').find('span').html(acromy(reg.marca, 10));
							$rowAdd.find('#tdMarca').find(':text').val(reg.marca);
							
							$rowAdd.find('#tdModelo').find('span').html(acromy(reg.modelo, 10));
							$rowAdd.find('#tdModelo').find(':text').val(reg.modelo);
							
							$rowAdd.find('#tdItem').find('span').html(acromy(reg.item, 10));
							$rowAdd.find('#tdItem').find(':text').val(reg.item);
							
							$rowAdd.find('#tdSerie').find('span').html(acromy(reg.serieEquipamento, 13));
							$rowAdd.find('#tdSerie').find(':text').val(reg.serieEquipamento);
							
							$rowAdd.find('#tdAnoFabricacao').find('span').html(acromy(reg.anoFrabicacaoEquipamento, 12));
							$rowAdd.find('#tdAnoFabricacao').find(':text').val(reg.anoFrabicacaoEquipamento);
							
							$rowAdd.find('#tdQtde').find('span').html(acromy('', 12));
							$rowAdd.find('#tdQtde').find(':text').val();
							
							$rowAdd.find('#tdValorDano').find('span').html(acromy(reg.valor, 12));
							$rowAdd.find('#tdValorDano').find(':text').val(reg.valor);
							
							$rowAdd.find('#tdValorEstimado').find('span').html(acromy('', 17));
							$rowAdd.find('#tdValorEstimado').find(':text').val('');

							$rowAdd.find('#chkMarcar').bind('click',function() {
								if ($(this).is(':checked')) {
									$(this).parents('tr').find('span').hide();
									$(this).parents('tr').find(':text').show();
								} else {
									$(this).parents('tr').find('span').show();
									$(this).parents('tr').find(':text').hide();
								}
							});
							
							$("#tabelaEquipamento").append($rowAdd);
						});	
					}
				}
			}
			
			verificaHabilitarNenhumRegistroEquipamentos();
			
			formatarControles();
			
		};
		
		formatarControles = function() {
			
			$("[id=tdNome]").find(':text').each(function() {
				configurarControlePadrao($(this),'','50',false);
				
				$(this).bind('blur',function(){
					var objeto = $(this).parents('tr').data('objeto');
					objeto.descricao = $(this).val();
					$(this).parents('td').find('span').html(acromy(objeto.descricao, 15));
					$(this).parents('tr').data('objeto', objeto);
					$(this).css('background','white');
				});
			});
			
			$("[id=tdMarca]").find(':text').each(function() {
				configurarControlePadrao($(this),'','50',false);
				
				$(this).bind('blur',function(){
					var objeto = $(this).parents('tr').data('objeto');
					objeto.marca = $(this).val();
					$(this).parents('td').find('span').html(acromy(objeto.marca, 10));
					$(this).parents('tr').data('objeto', objeto);
					$(this).css('background','white');
				});
				
			});
			
			$("[id=tdModelo]").find(':text').each(function() {
				configurarControlePadrao($(this),'','50',false);
				
				$(this).bind('blur',function(){
					var objeto = $(this).parents('tr').data('objeto');
					objeto.modelo = $(this).val();
					$(this).parents('td').find('span').html(acromy(objeto.modelo, 10));
					$(this).parents('tr').data('objeto', objeto);
				});
				
			});
			
			$("[id=tdItem]").find(':text').each(function() {
				configurarControlePadrao($(this),'0#','9',false);
				
				$(this).bind('blur',function(){
					var objeto = $(this).parents('tr').data('objeto');
					objeto.item = $(this).val();
					$(this).parents('td').find('span').html(acromy(objeto.item, 10));
					$(this).parents('tr').data('objeto', objeto);
				});
				
			});

			
			$("[id=tdSerie]").find(':text').each(function() {
				configurarControlePadrao($(this),'','50',false);
				
				$(this).bind('blur',function(){
					var objeto = $(this).parents('tr').data('objeto');
					objeto.serieEquipamento = $(this).val();
					$(this).parents('td').find('span').html(acromy(objeto.serieEquipamento, 13));
					$(this).parents('tr').data('objeto', objeto);
				});
				
			});
			
			$("[id=tdAnoFabricacao]").find(':text').each(function() {
				configurarControlePadrao($(this),'0#','4',false);
				
				$(this).bind('blur',function(){
					var objeto = $(this).parents('tr').data('objeto');
					objeto.anoFrabicacaoEquipamento = $(this).val();
					$(this).parents('td').find('span').html(acromy(objeto.anoFrabicacaoEquipamento, 12));
					$(this).parents('tr').data('objeto', objeto);
				});
				
			});
			
			$("[id=tdQtde]").find(':text').each(function() {
				configurarControlePadrao($(this),'0#','9',false);
				
				$(this).bind('blur',function(event){
					
					var objeto = $(this).parents('tr').data('objeto');
					objeto.qtde = $(this).val();
					$(this).parents('td').find('span').html(acromy(objeto.qtde, 12));
					$(this).parents('tr').data('objeto', objeto);
					
					if ((objeto.qtde != null && objeto.qtde.toString().length > 0) 
							&& (objeto.valor != null && objeto.valor.toString().length > 0)) {
						var valor = replaceAll(objeto.valor, '.','');
						valor = replaceAll(valor, ',','.');
						 
						var valor = (parseFloat(objeto.qtde) * parseFloat(valor)); 
						var texto = valor.toLocaleString("pt-BR", { minimumFractionDigits: 2 });
						$(this).parents('tr').find('#tdValorEstimado').find('span').html(acromy(texto, 17));
						$(this).parents('tr').find('#tdValorEstimado').find(':text').val(texto);
						objeto.valorEstimado = texto;
						$(this).parents('tr').data('objeto', objeto);
					} else {
						$(this).parents('tr').find('#tdValorEstimado').find('span').html(acromy('', 17));
						$(this).parents('tr').find('#tdValorEstimado').find(':text').val('');
						objeto.valorEstimado = '';
					}
				});
				
			});
			
			$("[id=tdValorDano]").find(':text').each(function() {
				configurarControlePadrao($(this),'','17',false); 
				$(this).mask("#.##0,00", {reverse: true});
				
				$(this).bind('blur',function(){
					var objeto = $(this).parents('tr').data('objeto');
					objeto.valor = $(this).val();
					$(this).parents('td').find('span').html(acromy(objeto.valor, 12));
					$(this).parents('tr').data('objeto', objeto);
					
					if ((objeto.qtde != null && objeto.qtde.toString().length > 0) 
							&& (objeto.valor != null && objeto.valor.toString().length > 0)) {
						var valor = replaceAll(objeto.valor, '.','');
						valor = replaceAll(valor, ',','.');
						 
						var valor = (parseFloat(objeto.qtde) * parseFloat(valor)); 
						var texto = valor.toLocaleString("pt-BR", { minimumFractionDigits: 2 });
						$(this).parents('tr').find('#tdValorEstimado').find('span').html(acromy(texto, 17));
						$(this).parents('tr').find('#tdValorEstimado').find(':text').val(texto);
						objeto.valorEstimado = texto;
						$(this).parents('tr').data('objeto', objeto);
					} else {
						$(this).parents('tr').find('#tdValorEstimado').find('span').html(acromy('', 17));
						$(this).parents('tr').find('#tdValorEstimado').find(':text').val('');
						objeto.valorEstimado = '';
					}
					$(this).css('background','white');
				});
			});
			
			$("[id=tdValorEstimado]").find(':text').each(function() {
				configurarControlePadrao($(this),'','17',true); 
				$(this).mask("#.##0,00", {reverse: true});
			});
			
		};
		
		function replaceAll(string, token, newtoken) {
			while (string.indexOf(token) != -1) {
				string = string.replace(token, newtoken);
			}
			return string;
		}
		verificaHabilitarNenhumRegistroEquipamentos = function() {
			
			var $trNenhumRegistro = $("#tabelaEquipamento").find('#trNenhumRegistroClone'); 
			if ( $trNenhumRegistro != null && $trNenhumRegistro.length > 0) {
				$trNenhumRegistro.remove();
			}
			
			if (!($("#tabelaEquipamento").find('[id=trClone]') != null && $("#tabelaEquipamento").find('[id=trClone]').length > 0)) {
				$("#tabelaEquipamento").append($trEquiNenhumRegistroClone.clone());
			}
		};
		
		configurarControlePadrao = function(objeto,maskara,maxLength, readOnly) {
			if (maskara != null && maskara.length > 0) {
				objeto.mask(maskara);
			}
			
			if (maxLength != null && maxLength.length) {
				objeto.attr('maxlength', maxLength);
			}
			
			if (readOnly != null && readOnly == true) {
				if (objeto.is('input:checkbox') || objeto.is('select')) {
					objeto.attr('disabled', true);
				} else {
					objeto.attr('readonly', 'readonly');	
				}
			}
		};
		
		init = function() {
			verificaHabilitarNenhumRegistroEquipamentos();
			carregarEquipamentos();
		};
		
		$("#btnSair").bind('click',function(){
			window.close();
		});
		
		$("#btnSalvar").bind('click',function(){
			
			var trValidar = $("[id=chkMarcar]:checked");
			
			if (!(trValidar != null && trValidar.length > 0 )) {
				alert('Nenhum equipamento foi selecionado');
				return false;
			}
			
			var tdNome = $("[id=tdNome]").find(':text').filter(function(index, eleme){
				return $(eleme).parents('tr').find('#chkMarcar').is(':checked');
			});
			
			var tdMarca = $("[id=tdMarca]").find(':text').filter(function(index, eleme){
				return $(eleme).parents('tr').find('#chkMarcar').is(':checked');
			});
			
			var tdValor = $("[id=tdValorDano]").find(':text').filter(function(index, eleme){
				return $(eleme).parents('tr').find('#chkMarcar').is(':checked');
			});
			
			var mensagemErroNome = '';
			var mensagemErroMarca = '';
			var mensagemErroValor = '';
			
			for ( var i = 0; i < tdNome.length; i++) {
				var campo = tdNome[i];
				if ($.trim($(campo).val()) == '') {
					$(campo).css('background','#dab1b1');
					mensagemErroNome = 'Informe o Nome do Equipamento Sinistrado\n';
				}
			}
			
			for ( var i = 0; i < tdMarca.length; i++) {
				var campo = tdMarca[i];
				if ($.trim($(campo).val()) == '') {
					$(campo).css('background','#dab1b1');
					mensagemErroMarca = 'Informe a Marca do Equipamento Sinistrado\n';
				}
			}
			
			for ( var i = 0; i < tdValor.length; i++) {
				var campo = tdValor[i];
				if ($.trim($(campo).val()) == '') {
					$(campo).css('background','#dab1b1');
					mensagemErroValor = 'Informe o Valor do Dano\n';
				}
			}
			
			if (mensagemErroNome.length > 0 || mensagemErroMarca.length > 0 || mensagemErroValor.length > 0) {
				alert(mensagemErroNome + mensagemErroMarca + mensagemErroValor);
				return false;
			}

			var wi = (window.dialogArguments)?window.dialogArguments:window.opener;
			
			var trClones = $("[id=trClone]").filter(function(index,eleme){
				return $(eleme).find('#chkMarcar').is(':checked');
			});
			
			if (trClones != null && trClones.length > 0) {
				
				for ( var i = 0; i < $(trClones).length; i++) {
					var reg = $(trClones)[i];
					var objeto = $(reg).data('objeto');
					
					if (wi.funAdicionarEquipamento(
							objeto.item,
							objeto.descricao,
							objeto.serieEquipamento,
							objeto.marca,
							objeto.anoFrabicacaoEquipamento,
							objeto.modelo, 
							objeto.qtde, 
							objeto.valorEstimado, 
							objeto.valor) == false) {
						return false;
					} 
					
					$(reg).find('#chkMarcar').prop('checked',true).trigger('click');
				}
			}
			
			window.close();
		});
		
		$("#btnMarcar").bind('click',function() {
			$("[id=chkMarcar]").prop('checked',false).trigger('click');
		});
	
		$("#btnDesMarcar").bind('click',function() {
			$("[id=chkMarcar]").prop('checked',true).trigger('click');;
		});
		
		init();
		
	});
})(jQuery);