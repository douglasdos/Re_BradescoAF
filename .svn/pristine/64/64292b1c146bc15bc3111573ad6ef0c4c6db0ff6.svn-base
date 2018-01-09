(function($){

	function replaceAll(string, token, newtoken) {
		while (string.indexOf(token) != -1) {
			string = string.replace(token, newtoken);
		}
		return string;
	}
	
	configurarControleResponsavel = function() {
		
		//CONTATO
		configurarControlePadrao($("#chkRespMesmoEndereco"),'','',false);
		configurarControlePadrao($("#txtRespEndereco"),'','50',true);
		configurarControlePadrao($("#txtRespBairro"),'','50',true);
		configurarControlePadrao($("#txtRespCep"),'99999-999','9',true);
		
		$("#txtRespCep").bind('blur', function() {
			
			if ($.trim($(this).val()).length == 0 ) {
				return false;
			}
			
			if (somenteNumeros($(this).val()).length != 8 ) {
				alert('CEP inválido');
				$(this).val('');
				$(this).focus();
				return false;
			}
		});
		
		carregarUF('cmbRespUf');
		configurarControlePadrao($("#cmbRespUf"),'','',true);
		
		carregarMunicipio('cmbRespCidade' , $("#cmbSinUf").val(), '');
		configurarControlePadrao($("#cmbRespCidade"),'','',true);
		desabilitarBotao('btnPesquisarResponsavel');
		
		
		//BENEFICIARIO
		configurarControlePadrao($("#chkRespProprioSegurado"),'','',false);

		carregarComboOutros($("#cmbRespOutros"));
		configurarControlePadrao($("#cmbRespOutros"),'','',true);
		
		configurarControlePadrao($("#txtRespNomeBeneficiario"),'','50',true);
		
		configurarControlePadrao($("#txtRespCpfBeneficiario"),'','14',true);
		
		$("#txtRespCpfBeneficiario").attr('maxlength', 14);
		$("#txtRespCpfBeneficiario").mask('0#');
		
		$("#txtRespCpfBeneficiario").bind('focusin',function() {
			$(this).val($(this).val().replace(/[^\d]+/g,''));
		});
		
		$("#txtRespCpfBeneficiario").bind('blur',function() {
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
		
		document.getElementById('txtRespCpfBeneficiario').onpaste= function() {
			var $cpf = $(this);
			$("#txtRespCpfBeneficiario").attr('maxlength', 18);
			$("#txtRespCpfBeneficiario").unmask();
			
			setTimeout(function() {
				$cpf.focus();
			},100);
		};
		
		configurarControlePadrao($("#chkRespNaoTemContaBanco"),'','',false);
		configurarControlePadrao($("#txtRespCodigoBanco"),'0#','4',true);
		configurarControlePadrao($("#txtRespDescricaoBanco"),'','50',true);
		configurarControlePadrao($("#txtRespAgencia"),'0#','5',true);
		configurarControlePadrao($("#txtRespConta"),'0#','13',true);
		configurarControlePadrao($("#txtRespContaDv"),'','2',true);
		desabilitarBotao('btnRespListarContas');
		
		
		//OUTRA CIA
		configurarControlePadrao($("#chkRespExisteOutrosSeguros"),'','',false);
		configurarControlePadrao($("#cmbRespQualSeguro"),'','',true);
		carregarComboQualCia($("#cmbRespQualSeguro"));
		
		
		//RESPONSAVEL
		configurarControlePadrao($("#txtRespNome"),'','50',false);
		
		configurarControlePadrao($("#txtRespDDD"),'0#','6',false);
		configurarControlePadrao($("#txtRespTelefone"),'0#','11',false);
				
		configurarControlePadrao($("#txtRespDDDCelular"),'0#','6',false);
		configurarControlePadrao($("#txtRespTelefoneCelular"),'0#','11',false);

		configurarControlePadrao($("#txtRespEmail"),'','100', false);
		
		$("#txtRespEmail").bind('blur' ,function() {
			if ($.trim($(this).val()).length == 0 ) {
				return false;
			}
			
			if (validateEmail($(this).val()) == false) {
				alert('E-mail inválido');
				$(this).val('');
				$(this).focus();
				return false;
			}
		});
		
		document.getElementById('txtRespEmail').onpaste= function() {
			var $valor = $(this);
						
			setTimeout(function() {
				$valor.val('');
			},100);
		};
		
		document.getElementById('txtRespEmail').oncopy= function() {
						
			setTimeout(function() {
				window.clipboardData.setData('text' , '');
			},100);
		};
		
		configurarControlePadrao($("#chkRespReceberAcompanhamentoSMS"),'','',false);
		configurarControlePadrao($("#chkRespReceberAcompanhamentoEmail"),'','',false);
		
	};

	carregarAbaResponsavel = function(apolice) {
		
		//Responvavel
		carregarDadosResponsavel(apolice);
		
		//Endereco
		carregarEnderecoResponsavel(apolice);
	};
	
	carregarDadosResponsavel = function(apolice) {
		$("#txtRespNome").val(apolice.nomeSegurado);
		$("#txtRespDDD").val(apolice.numeroDddFone);
		$("#txtRespTelefone").val(apolice.numeroFone);
		$("#txtRespDDDCelular").val(apolice.numeroDddCelular);
		$("#txtRespTelefoneCelular").val(apolice.numeroCelular);
		$("#txtRespEmail").val(apolice.enderecoEmail);
	};
	
	carregarEnderecoResponsavel = function(apolice) {
		$("#txtRespEndereco").val(apolice.logradouroEnderecoSegurado);
		$("#txtRespBairro").val(apolice.bairroenderecoSegurado);
		$("#txtRespCep").val(formatarCep(apolice.cepEnderecoSegurado));
		SelecionaItemComboInsertCasoEstejaInativo('cmbRespUf', apolice.ufEnderecoSegurado, apolice.ufEnderecoSegurado);
		SelecionaItemComboInsertCasoEstejaInativo('cmbRespCidade', apolice.cidadeEnderecoSegurado, apolice.cidadeEnderecoSegurado);
	};
	
	carregarAbaBeneficiario = function(apolice) {
		//Beneficiario
		$("#txtRespNomeBeneficiario").val(apolice.nomeSegurado);
		$("#txtRespCpfBeneficiario").val(apolice.cpfCnpjSegurado != null ? formatarCPF(apolice.cpfCnpjSegurado.toString()) : '');
	};
	
	$("#chkRespMesmoEndereco").bind('change' , function(){
		if($(this).is(':checked') == false) {
			$("#txtRespEndereco").val('');
			$("#txtRespBairro").val('');
			$("#txtRespCep").val('');

			funcHabilitarCamposResponsavel();
			
			carregarUF('cmbRespUf');
			carregarMunicipio('cmbRespCidade' , $("#cmbSinUf").val(), '');
			
		} else {
			var apolice = JSON.parse($("#hidObterApolice").val());
			carregarEnderecoResponsavel(apolice);
			funcDesabilitarCamposResponsavel();
		}
	});
	
	$("#chkRespProprioSegurado").bind('change' , function(){
		if($(this).is(':checked') == false) {
			$("#txtRespNomeBeneficiario").val('');
			$("#txtRespCpfBeneficiario").val('');
			$("#cmbRespOutros").val('');
			
			funcHabilitarCamposBeneficiario();
			
		} else {
			var apolice = JSON.parse($("#hidObterApolice").val());
			carregarAbaBeneficiario(apolice);
			funcDesabilitarCamposBeneficiario();
		}
	});
	
	$("#chkRespExisteOutrosSeguros").bind('change' , function(){
		if($(this).is(':checked') == true) {
			$("#cmbRespQualSeguro").attr('disabled' , false);
		} else {
			$("#cmbRespQualSeguro").val(''); 
			$("#cmbRespQualSeguro").attr('disabled',true);
		}
	});
	
	$("#cmbRespOutros").bind('change', function(){
		
		var textSelect = $(this).find(':selected').text().toUpperCase(); 
		if ( textSelect.indexOf('CORRETOR') >= 0) {
			var apolice = JSON.parse($("#hidObterApolice").val());
			$("#txtRespNomeBeneficiario").val(apolice.nomeCorretor);
		}
	});
	
	$("#chkRespNaoTemContaBanco").bind('change', function(){
		
		if($(this).is(':checked') == false) {
			funcHabilitarCamposBanco();
		} else {
			funcDesabilitarCamposBanco();
			$("#txtRespCodigoBanco").val('');
			$("#txtRespDescricaoBanco").val('');
			$("#txtRespAgencia").val('');
			$("#txtRespConta").val('');
			$("#txtRespContaDv").val('');
		}
	});
	

	funcHabilitarCamposResponsavel = function() {
		$("#txtRespEndereco").removeAttr('readonly');
		$("#txtRespBairro").removeAttr('readonly');
		$("#txtRespCep").removeAttr('readonly');
		$("#cmbRespUf").removeAttr('disabled');
		$("#cmbRespCidade").removeAttr('disabled');
		habilitarBotao('btnPesquisarResponsavel', '' , 'Pesquisar');
		funcPesquisarCidadeResponsavel();
		
	};
	
	funcDesabilitarCamposResponsavel = function() {
		$("#txtRespEndereco").attr('readonly' , 'readonly');
		$("#txtRespBairro").attr('readonly' , 'readonly');
		$("#txtRespCep").attr('readonly' , 'readonly');
		$("#cmbRespUf").attr('disabled' , true);
		$("#cmbRespCidade").attr('disabled' , true);
		desabilitarBotao('btnPesquisarResponsavel');
	};
	
	funcHabilitarCamposBeneficiario= function() {
		$("#cmbRespOutros").removeAttr('disabled');
		$("#txtRespNomeBeneficiario").removeAttr('readonly');
		$("#txtRespCpfBeneficiario").removeAttr('readonly');
	};
	
	
	funcDesabilitarCamposBeneficiario = function() {
		$("#cmbRespOutros").attr('disabled' , true);
		$("#txtRespNomeBeneficiario").attr('readonly' , 'readonly');
		$("#txtRespCpfBeneficiario").attr('readonly' , 'readonly');
	};
	
	funcHabilitarCamposBanco= function() {
		$("#txtRespCodigoBanco").removeAttr('readonly');
		$("#txtRespDescricaoBanco").removeAttr('readonly');
		$("#txtRespAgencia").removeAttr('readonly');
		$("#txtRespConta").removeAttr('readonly');
		$("#txtRespContaDv").removeAttr('readonly');
		habilitarBotao('btnRespListarContas', funcAbrirListaConta , 'Todas as Contas');
	};
	
	funcDesabilitarCamposBanco = function() {
		$("#txtRespCodigoBanco").attr('readonly' , 'readonly');
		$("#txtRespDescricaoBanco").attr('readonly' , 'readonly');
		$("#txtRespAgencia").attr('readonly' , 'readonly');
		$("#txtRespConta").attr('readonly' , 'readonly');
		$("#txtRespContaDv").attr('readonly' , 'readonly');
		desabilitarBotao('btnRespListarContas');
	};
	
	funcPesquisarCidadeResponsavel = function() {
		$("#btnPesquisarResponsavel").bind('click',function() {
			
			var campoUf;
			var campoCidade;
			var campoCidadeBusca;
			var btnCancelar;
			
			campoUf = $("#cmbRespUf");
			campoCidade = $("#cmbRespCidade");
			campoCidadeBusca = $("#txtSinCidadeBuscaResponsavel");
			btnCancelar = $("#btnCancelarResponsavel");
			
			
			if (campoCidade.is(":hidden")) {
				if ( !(campoCidadeBusca.val().length > 0)) {
					alert('O Município não pode ser vazio');
					return false;
				} else {
					carregarMunicipio(campoCidade.attr('id') , campoUf.val(), campoCidadeBusca.val());
				}
			}
			
			habilitarTextoMunicipio(campoCidade,campoCidadeBusca, btnCancelar, $(this));
		});
	};
	
	funcAbrirListaConta = function() {
		showModalDialog('AbrirListaContaCorrenteSinistro.do', window, 'help:no;scroll:no;Status:NO;dialogWidth:650px;dialogHeight:250px;dialogTop:220px;dialogLeft:270px');
	};
	
	carregarComboOutros = function(cmbRespOutros) {
		cmbRespOutros.empty();
		cmbRespOutros.append($("<option></option>").val("").html("Selecione uma opção"));
		cmbRespOutros.append($("<option></option>").val('PAI').html('PAI'));
		cmbRespOutros.append($("<option></option>").val('MÃE').html('MÃE'));
		cmbRespOutros.append($("<option></option>").val('FILHO(A)').html('FILHO(A)'));
		cmbRespOutros.append($("<option></option>").val('CÔNJUGE').html('CÔNJUGE'));
		cmbRespOutros.append($("<option></option>").val('EMPREGADO(A)').html('EMPREGADO(A)'));
		cmbRespOutros.append($("<option></option>").val('SEGURADO').html('SEGURADO'));
		cmbRespOutros.append($("<option></option>").val('CORRETOR').html('CORRETOR'));
		cmbRespOutros.append($("<option></option>").val('OUTROS').html('OUTROS'));
	};
	
	//FuncaoAjax
	carregarComboQualCia = function(cmbRespQualSeguro) {
		
		cmbRespQualSeguro.empty();
		cmbRespQualSeguro.append($("<option></option>").val("").html("Carregando..."));
		
		var wi = (window.dialogArguments)?window.dialogArguments:window.opener;

		var objGrupoRamos = JSON.parse($("#hidGrupoRamos",wi.document).val());
		
		if (objGrupoRamos != null && objGrupoRamos.length > 0) {
			if (objGrupoRamos[0].qualcia != null && objGrupoRamos[0].qualcia.length > 0) {
				cmbRespQualSeguro.empty();
				cmbRespQualSeguro.append($("<option></option>").val("").html("Selecione uma opção"));
				for ( var i = 0; i < objGrupoRamos[0].qualcia.length; i++) {
					var qualcia = objGrupoRamos[0].qualcia[i];
					cmbRespQualSeguro.append($("<option></option>").val(qualcia.retaCdCorporativo).html(qualcia.retaDsResptabulada));
				}	
			}
		}
	};
	
})(jQuery);