(function($){
	
	$(document).ready(function(){

		var $trClone = $("#trClone").clone();
		$trClone.show();
		$("#trClone").remove();
		
		var $trNenhumRegistroClone = $("#trNenhumRegistroClone").clone();
		$trNenhumRegistroClone.css('display','');
		$("#trNenhumRegistroClone").remove();
		
		carregarLista = function() {
			
			var wi = (window.dialogArguments)?window.dialogArguments:window.opener;
			var obterApolice = JSON.parse($("#hidObterApolice",wi.document).val());

			$('#aguarde').css('visibility','visible');
			
			if (obterApolice != null && obterApolice.localizacaoRiscos != null && obterApolice.localizacaoRiscos.length > 0) {
				
				$(obterApolice.localizacaoRiscos).each(function(index, endereco) {
					var $rowAdd = $trClone.clone();
					
					$rowAdd.data('objeto',endereco);
					
					if (validarRegistroVazio(endereco) == true) {
						return;
					}
					
					$rowAdd.find('#tdEndereco').html(acromy(endereco.enderecoLocalRisco, 30));
					$rowAdd.find('#tdNumero').html(acromy(endereco.numeroLocalRisco, 10));
					$rowAdd.find('#tdBairro').html(acromy(endereco.bairroLocalRisco, 20));
					$rowAdd.find('#tdCep').html(acromy(endereco.cepLocalRisco, 10));
					$rowAdd.find('#tdUf').html(acromy(endereco.ufLocalRisco, 3));
					$rowAdd.find('#tdCidade').html(acromy(endereco.cidadeLocalRisco, 10));
					
					$rowAdd.bind('click',function() {
						$(this).find('#rdoSelecionado').prop('checked' , true);
					});
					
					$("#tabelaEndereco").append($rowAdd);
				});
			}
		
			verificaHabilitarNenhumRegistro();
			
			$('#aguarde').css('visibility','hidden');
		};
		
		$("#btnCancelar").bind('click', function() {
			window.close();
		});
		
		$("#btnSalvar").bind('click',function() {
			
			var wi = (window.dialogArguments)?window.dialogArguments:window.opener;
			
			if (!($("#rdoSelecionado:checked") != null && $("#rdoSelecionado:checked").length > 0)) {
				alert('Selecione um endereço');
				return false;
			}
			
			var trEnd = $("#rdoSelecionado:checked").parents('tr');
			var objEnd = trEnd.data('objeto'); 
			
			wi.preencheCamposPlusCep(
					objEnd.enderecoLocalRisco == null ? '' : objEnd.enderecoLocalRisco, 
					objEnd.bairroLocalRisco == null ? '' : objEnd.bairroLocalRisco, 
					objEnd.cidadeLocalRisco == null ? '' : objEnd.cidadeLocalRisco, 
					objEnd.ufLocalRisco == null ? '' : objEnd.ufLocalRisco, 
					objEnd.cepLocalRisco == null ? '' : objEnd.cepLocalRisco, 
					objEnd.numeroLocalRisco == null ? '' : objEnd.numeroLocalRisco);
			window.close();
		});
		
		verificaHabilitarNenhumRegistro = function() {
			
			var $trNenhumRegistro = $("#tabelaEndereco").find('#trNenhumRegistroClone'); 
			if ( $trNenhumRegistro != null && $trNenhumRegistro.length > 0) {
				$trNenhumRegistro.remove();
			}
			
			if (!($("#tabelaEndereco").find('[id=trClone]') != null && $("#tabelaEndereco").find('[id=trClone]').length > 0)) {
				$("#tabelaEndereco").append($trNenhumRegistroClone.clone());
			}
		};
		
		validarRegistroVazio = function(endereco) {
			if (endereco != null) {
				if (endereco.bairroLocalRisco =='' 
					&& endereco.cepLocalRisco == 0
					&& endereco.cidadeLocalRisco == ''
					&& endereco.complementoLocalRisco == ''
					&& endereco.enderecoLocalRisco == ''
					&& endereco.item == 0
					&& endereco.localizacaoRisco == 0
					&& endereco.numeroLocalRisco == ''
					&& endereco.ufLocalRisco == '') {
					
					return true;
				}
			}
				
			return false;
			
		};
		
		init = function() {
			verificaHabilitarNenhumRegistro();
			carregarLista();
		};
		
		init();
		
	});
})(jQuery);