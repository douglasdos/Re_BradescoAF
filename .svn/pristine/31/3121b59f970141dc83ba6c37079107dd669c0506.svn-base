(function($){
	$(document).ready(function(){
		var $trClone = $("#trClone").clone();
		$trClone.css('display','');
		$("#trClone").remove();
		
		var $trEquiNenhumRegistroClone = $("#trNenhumRegistroClone").clone();
		$trEquiNenhumRegistroClone.css('display','');
		$("#trNenhumRegistroClone").remove();

		configurarControle = function() {
			configurarControlePadrao($("#txtNumeroBanco"),'0#','4',false);
			configurarControlePadrao($("#txtDescricaoBanco"),'','50',false);
			
			configurarControlePadrao($("#txtNumeroAgencia"),'0#','5',false);
			configurarControlePadrao($("#txtNumeroAgenciaDv"),'','2',false);
			
			configurarControlePadrao($("#txtNumeroConta"),'0#','13',false);
			configurarControlePadrao($("#txtNumeroContaDv"),'','2',false);
		};
		
		verificaHabilitarNenhumRegistro = function() {
			
			var $trNenhumRegistro = $("#tabelaConta").find('#trNenhumRegistroClone'); 
			if ( $trNenhumRegistro != null && $trNenhumRegistro.length > 0) {
				$trNenhumRegistro.remove();
			}
			
			if (!($("#tabelaConta").find('[id=trClone]') != null && $("#tabelaConta").find('[id=trClone]').length > 0)) {
				$("#tabelaConta").append($trEquiNenhumRegistroClone.clone());
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
		
		adicionarLinha = function(reg) {
			var $rowAdd = $trClone.clone();
			
			
			if (!(reg.codigoBanco != null && reg.codigoBanco.toString().length > 0 )) {
				reg.codigoBanco = '237' ;	
			}
			
			if (!(reg.descricaoBanco != null && reg.descricaoBanco.toString().length > 0 )) {
				reg.descricaoBanco = 'Banco Bradesco S.A.';
			}
			
			$rowAdd.data('objeto' , reg);
			
			if (reg.item == 0) {
				return;
			}
			
			var agencia = '';
			if (reg.codigoAgencia != null && reg.codigoAgencia.toString().length > 0) {
				agencia += reg.codigoAgencia;
				if (reg.dvAgencia != null && reg.dvAgencia.toString().length > 0) {
					agencia += '-' + reg.dvAgencia;
				}
			} else {
				if (reg.dvAgencia != null && reg.dvAgencia.toString().length > 0) {
					agencia += reg.dvAgencia;
				}	
			}
			
			var conta = '';
			if (reg.numeroContaCorrente != null && reg.numeroContaCorrente.toString().length > 0) {
				conta += reg.numeroContaCorrente;
				if (reg.dvContaCorrente != null && reg.dvContaCorrente.toString().length > 0) {
					conta += '-' + reg.dvContaCorrente;
				}
			} else {
				if (reg.dvContaCorrente != null && reg.dvContaCorrente.toString().length > 0) {
					conta += reg.dvContaCorrente;
				}	
			}
			
			$rowAdd.find('#tdBanco').html(acromy(reg.codigoBanco +' - ' + reg.descricaoBanco, 45));
			$rowAdd.find('#tdAgencia').html(acromy(agencia, 15));
			$rowAdd.find('#tdConta').html(acromy(conta, 15));
			
			$rowAdd.bind('click',function() {
				$(this).find('#rdoSelecionado').prop('checked' , true);
			});
			
			
			$("#tabelaConta").append($rowAdd);
		};
		
		carregarContaCorrente = function() {
			
			var wi = (window.dialogArguments)?window.dialogArguments:window.opener;
			
			var apolice = JSON.parse($("#hidObterApolice",wi.document).val());
			
			if (apolice != null ) {
				
				var entrada = {}; 
				entrada.pessDsCgccpf = apolice.cpfCnpjSegurado;
				
				$.ajax({
					url : '/csiweb-bradescore/crm/CarregarContaCorrente.do',
					data : entrada,
					type : 'POST',
					dataType : 'json',
					beforeSend : function(jqXHR) {
						$('#aguarde').css('visibility','visible');	
					}
				}).error(function(data, textStatus, erro) {	
					alert('ERRO AO CONSULTAR O SERVIÇO DO BRADESCO\nMétodo: "consultarContaCorrentePorCPF"\nDescrição: ' + erro);
					verificaHabilitarNenhumRegistro();
				}).success(function(data, textStatus, jqXHR) {

					if( data != null && data.length > 0) {
						var contaCorrente = data[0];
						if (contaCorrente.retorno == false) {
							alert(contaCorrente.mensagem);
						} else {
							if (contaCorrente != null && contaCorrente.contacorrente != null && contaCorrente.contacorrente.length > 0) {
								var lstContaCorrente = contaCorrente.contacorrente;
								$(lstContaCorrente).each(function(index, reg) {
									adicionarLinha(reg);
								});
							}
						}
					}
				})
				.complete(function( jqXHR, textStatus ){
					$('#aguarde').css('visibility','hidden');
					verificaHabilitarNenhumRegistro();
				});
				
			}
		};
		
		$("#btnSalvar").bind('click',function() {
			
			var wi = (window.dialogArguments)?window.dialogArguments:window.opener;
			
			if (!($("#rdoSelecionado:checked") != null && $("#rdoSelecionado:checked").length > 0)) {
				alert('Selecione uma conta');
				return false;
			}
			
			var trConta = $("#rdoSelecionado:checked").parents('tr');
			var objConta = trConta.data('objeto'); 
			
			var agencia = '';
			if (objConta.codigoAgencia != null && objConta.codigoAgencia.toString().length > 0) {
				agencia += objConta.codigoAgencia;
				if (objConta.dvAgencia != null && objConta.dvAgencia.toString().length > 0) {
					agencia += objConta.dvAgencia;
				}
			} else {
				if (objConta.dvAgencia != null && objConta.dvAgencia.toString().length > 0) {
					agencia += objConta.dvAgencia;
				}	
			}
		
			$("#txtRespCodigoBanco",wi.document).val(
					objConta.codigoBanco != null && objConta.codigoBanco.toString().length > 0 ? objConta.codigoBanco.toString() : '');
			$("#txtRespDescricaoBanco",wi.document).val(
					objConta.descricaoBanco != null && objConta.descricaoBanco.toString().length > 0 ? objConta.descricaoBanco.toString().toUpperCase() : '');
			$("#txtRespAgencia",wi.document).val(agencia);
			$("#txtRespConta",wi.document).val(
					objConta.numeroContaCorrente != null && objConta.numeroContaCorrente.toString().length > 0 ? objConta.numeroContaCorrente.toString() : '');
			$("#txtRespContaDv",wi.document).val(
					objConta.dvContaCorrente != null && objConta.dvContaCorrente.toString().length > 0 ? objConta.dvContaCorrente.toString() : '');
					
			window.close();
		});
		
		$("#btnIncluir").bind('click',function(){
			var montaMensagem = '';
			
			if (isEmpty($("#txtNumeroBanco")) == true) {
				montaMensagem += 'Informe o Código do Banco\n';
			}
			
			if (isEmpty($("#txtDescricaoBanco")) == true) {
				montaMensagem += 'Informe o Nome do Banco\n';
			}
			
			if (isEmpty($("#txtNumeroAgencia")) == true) {
				montaMensagem += 'Informe a Agência do Banco\n';
			}
			
			if (isEmpty($("#txtNumeroConta")) == true) {
				montaMensagem += 'Informe a Conta do Banco\n';
			}

			if (montaMensagem.length > 0) {
				alert(montaMensagem);
				return false;
			}
			
			var reg = {};
			reg.codigoBanco = $("#txtNumeroBanco").val();
			reg.descricaoBanco = $("#txtDescricaoBanco").val();
			reg.codigoAgencia = $("#txtNumeroAgencia").val();
			reg.dvAgencia = $("#txtNumeroAgenciaDv").val();
			reg.numeroContaCorrente = $("#txtNumeroConta").val();
			reg.dvContaCorrente = $("#txtNumeroContaDv").val();
				
			adicionarLinha(reg);
			
			$(":text").val('');
			
			verificaHabilitarNenhumRegistro();
		});
		
		$("#btnSair").bind('click',function(){
			window.close();
		});
		
		isEmpty = function(objeto) {
			try {
				if ($.trim(objeto.val()).length == 0 ) {
					return true;
				}	
			} catch (e) {
				return false;
			}
			 
			return false;
		};
		
		init = function() {
			configurarControle();
			verificaHabilitarNenhumRegistro();
			carregarContaCorrente();
		};
		
		init();
	});
})(jQuery);