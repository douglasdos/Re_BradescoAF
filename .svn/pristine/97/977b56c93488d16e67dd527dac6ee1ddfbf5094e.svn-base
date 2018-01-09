(function($){
	$(document).ready(function(){
	
		var montaMensagemPendente = '';
		var montaMensagemCompleto = '';
		
		ativaPasta = function (aba) {
			$("#sinistro").hide();
			$("#equipamentos").hide();
			$("#detalheBemSinistrado").hide();
			$("#responsavel").hide();
			$("#outrosEnvolvidos").hide();
			
			$("#" + aba).show();
			
			$('[data-tabs] > li > a').removeClass('tab-active');
			$('[data-target=' + aba + ']').addClass('tab-active');
			
			$("#" + aba).show();
		};
		
		$("[data-target='sinistro']").click(function() {
			ativaPasta( 'sinistro' );
		}); 
		
		$("[data-target='equipamentos']").click(function() {
			if(apolicePertenceAoGrupoDeRamos3() == true) {
				if (produtoHabilitamAbaEquipamentos() == true) {
					ativaPasta( 'equipamentos' );	
				}
			}
		});
		
		$("[data-target='detalheBemSinistrado']").click(function() {
			ativaPasta( 'detalheBemSinistrado' );
		}); 
		
		$("[data-target='responsavel']").click(function() {
			ativaPasta( 'responsavel' );
		}); 
		
		$("[data-target='outrosEnvolvidos']").click(function() {
			ativaPasta( 'outrosEnvolvidos' );
		});
		
		//#FuncaoControle
		
		configurarControle = function() {
			
			$(":text ,textarea").css('text-transform', 'uppercase');
			
			$("input").bind('keypress', function(event){
				if (event.which == 13 ) {
					event.preventDefault();
					event.stopPropagation();
				}
			});
			
			configurarControleComunicadoSinistro();	
			configurarControleAbaSinistro();
			configurarControleAbaEquipamentos();
			configurarControleAbaDetalheSinistrado();
			configurarControleResponsavel();
			configurarControleAbaOutrosEnvolvidos();
		};
		
		configurarControleComunicadoSinistro = function() {
			configurarControlePadrao($("#txtNomeContato"),'','50',false);
			configurarControlePadrao($("#dddContato"),'0#','2',false);
			configurarControlePadrao($("#telefoneContato"),'0#','8',false);
			carregarComboTipoRelacao($("#cmbTipoRelacao"));
			
			configurarControlePadrao($("#txtApolice"),'0#','9',true);
			configurarControlePadrao($("#codigoCorretor"),'0#','',true);
			
			configurarControlePadrao($("#numeroSinistro"),'0#','9',true);
			
			configurarControlePadrao($("#txtStatus"),'','',true);
			configurarControlePadrao($("#txtNomeCorretor"),'','',true);
			
			configurarControlePadrao($("#txtNomeSegurado"),'','',true);

		};
		
		configurarControleAbaSinistro = function() {
			configurarControlePadrao($("#chkEnderecoNaoCorreto"),'','',false);
			
			$("#cmbCausa").empty();
			$("#cmbCausa").append($("<option></option>").val("").html("Selecione uma opção"));
			configurarControlePadrao($("#cmbCausa"),'','',true);
			
			configurarControlePadrao($("#txtSinData"),'99/99/9999','10',false);
			
			$("#txtSinData").bind('blur' , function() {
				if ($.trim($(this).val()).length == 0 ) {
					return false;
				}

				if (verificaData($(this).val()) == false) {
					alert('Data inválida');
					$(this).val('');
					$(this).focus();
					return false;
				}
			});
			
			$("#btnSinCalendario").bind("click", function() {
				show_calendar("getElementById('txtSinData')");
			});
			
			$("#cmbNatureza").empty();
			$("#cmbNatureza").append($("<option></option>").val("").html("Selecione uma opção"));
			configurarControlePadrao($("#cmbNatureza"),'','',true);
			
			configurarControlePadrao($("#txtSinHora"),'99:99','5',false);
			
			$("#txtSinHora").bind('blur', function() {
				
				if ($.trim($(this).val()).length == 0 ) {
					return false;
				}

				if (validarHora($(this).val()) == false) {
					alert('Hora inválida');
					$(this).val('');
					$(this).focus();
					return false;
				}
			});
			
			configurarControlePadrao($("#txtSinCep"),'99999-999','9',true);
			
			$("#txtSinCep").bind('blur', function() {
				
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
			
			$("#txtSinCep").bind('keyup', function(event) {
				
				if (event.keyCode == 13 ) {
					if ($("#txtSinCep").is('[readonly]') == false) {
						funcSelecionarCep();	
					}
				}
			});
			
			desabilitarBotao('btnSinLupa');
			
			configurarControlePadrao($("#txtSinEndereco"),'','50',true);
			configurarControlePadrao($("#txtSinNumero"),'0#','10',true);
			configurarControlePadrao($("#txtSinComplemento"),'','50',true);

			carregarUF('cmbSinUf');
			configurarControlePadrao($("#cmbSinUf"),'','',true);
			
			carregarMunicipio('cmbSinCidade' , $("#cmbSinUf").val(), '');
			configurarControlePadrao($("#cmbSinCidade"),'','',true);
			
			configurarControlePadrao($("#txtSinBairro"),'','50',true);
			configurarControlePadrao($("#txtaSinDescricao"),'','400',false);
			
			desabilitarBotao('btnPesquisarSinistro');
			
			$('#txtaSinDescricao').focus(function(){
		        $(this).attr('rows', '4');
		    });
			
			configurarControlePadrao($("#chkHouveCorpoBombeiro"),'','',true);
			configurarControlePadrao($("#chkMoradiaHabitavel"),'','',true);
			configurarControlePadrao($("#chkProvidencioBO"),'','',true);
		};
		
		funcHabilitarCamposDataSinistro = function() {
			
			$("#txtSinCep").removeAttr('readonly');
			$("#txtSinEndereco").removeAttr('readonly');
			$("#txtSinNumero").removeAttr('readonly');
			$("#txtSinComplemento").removeAttr('readonly');
			$("#cmbSinUf").attr('disabled' , false);
			$("#cmbSinCidade").attr('disabled' , false);
			$("#txtSinBairro").removeAttr('readonly');
			
		};
		
		//FuncaoExtra
		
		somenteNumeros = function(str){
			return str.replace(/[^\d]+/g,''); 
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
		
		
		//FuncaoCarregar
		carregarCabecalho = function(apolice) {
			
			$("#txtNomeContato").val('');
			$("#dddContato").val('');
			$("#telefoneContato").val('');
			$("#cmbTipoRelacao").val('');
			$("#txtApolice").val(apolice.numeroApolice);
			$("#codigoCorretor").val(apolice.codigoCorretor);
			$("#numeroSinistro").val('');
			$("#txtStatus").val('');
			$("#txtNomeCorretor").val(apolice.nomeCorretor);
			$("#txtNomeSegurado").val(apolice.nomeSegurado);
		};
		
		carregarAbaSinistro = function(apolice) {
			$("#cmbCausa").attr('disabled' , false);
			carregarComboCausa($("#cmbCausa"));
			carregarComboNatureza($("#cmbNatureza"),$("#cmbCausa").val());
			
			if (apolicePertenceAoGrupoDeRamos3() == false) {
				
				$("#txtSinCep").val(formatarCep(apolice.cepEnderecoSegurado));
				$("#txtSinEndereco").val(apolice.logradouroEnderecoSegurado);
				$("#txtSinNumero").val(apolice.numeroEnderecoSegurado);
				$("#txtSinComplemento").val(apolice.complementoEnderecoSegurado);
				
				SelecionaItemComboInsertCasoEstejaInativo('cmbSinUf', apolice.ufEnderecoSegurado, apolice.ufEnderecoSegurado);
				SelecionaItemComboInsertCasoEstejaInativo('cmbSinCidade', apolice.cidadeEnderecoSegurado, apolice.cidadeEnderecoSegurado);
				$("#txtSinBairro").val(apolice.bairroenderecoSegurado);
			} else {
				$("#txtSinCep").val('');
				$("#btnSinLupa").val('');
				$("#txtSinEndereco").val('');
				$("#txtSinNumero").val('');
				$("#txtSinComplemento").val('');
				$("#cmbSinUf").val('');
				$("#cmbSinCidade").val('');
				$("#txtSinBairro").val('');
				habilitarBotao('btnSinLupa', funcSelecionarCep , 'Pesquisar');
				habilitarBotao('btnPesquisarSinistro', '' , 'Pesquisar');
				funcPesquisarCidade();
				funcHabilitarCamposDataSinistro();
			}
			
			if (apolicePertenceAoGrupoDeRamos1() == true) {
				$("#chkMoradiaHabitavel").attr('disabled' , false);
			}
		};
		
		validarCamposObrigatoriosPendente = function() {
			montaMensagemPendente = '';
			var retorno = true;
			
			if (isEmpty($("#dddContato")) == true || isEmpty($("#telefoneContato")) == true) {
				montaMensagemPendente += 'DDD e/ou Telefone do Contato não Informado\n';
				retorno = false;
			}
			
			if (isEmpty($("#cmbTipoRelacao")) == true) {
				montaMensagemPendente += 'Informe o Tipo de Relação do Contato com o Segurado\n';
				retorno = false;
			}
			
			//ABA SINISTRO
			if (isEmpty($("#txtSinData")) == true) {
				montaMensagemPendente += 'Informe a Data da Ocorrência do Sinistro\n';
				retorno = false;
			}
			
			if (isEmpty($("#txtSinHora")) == true) {
				montaMensagemPendente += 'Informa a Hora da Ocorrência do Sinistro\n';
				retorno = false;
			}

			//ABA DETALHE BEM SINISTRADO
			if(apolicePertenceAoGrupoDeRamos3() != true) {
				if ( !($("#tabelaDetalhe").find('[id=trCloneDetalhe]').length > 0)){
					montaMensagemPendente += 'Incluir pelo menos um Detalhe Bem Sinistrado\n';
					retorno = false;
				}	
			}
			
			//ABA RESPONSAVEL
			//Regra -> Se o campo de checknox sms estiver marcado o telefone ceular é obrigatório.
			if ($("#chkRespReceberAcompanhamentoSMS").is(":checked")) {
				if( $.trim($("#txtRespTelefoneCelular").val()).length == 0) {
					montaMensagemPendente += 'Informa o número de celular do responsável\n';
					retorno = false;
				}
			}
			
			if ($("#chkRespReceberAcompanhamentoEmail").is(":checked")) {
				if( $.trim($("#txtRespEmail").val()).length == 0) {
					montaMensagemPendente += 'Informa o e-mail do responsável\n';
					retorno = false;
				}
			}
			
			if (isEmpty($("#txtRespCpfBeneficiario")) == true) {
				montaMensagemPendente += 'Informe o CPF/CNPJ do Beneficiário\n';
				retorno = false;
			}
			
			return retorno;
		};
		
		validarCamposObrigatoriosCompleto = function() {
			montaMensagemCompleto = '';
			
			if (isEmpty($("#dddContato")) == true || isEmpty($("#telefoneContato")) == true) {
				return false;
			}
			
			if (isEmpty($("#cmbTipoRelacao")) == true) {
				return false;
			}
			
			if (isEmpty($("#txtNomeContato")) == true) {
				return false;
			}
			
			//ABA SINISTRO
			if (isEmpty($("#txtSinData")) == true) {
				return false;
			}
			
			if (isEmpty($("#txtSinHora")) == true) {
				return false;
			}
			
			if (isEmpty($("#txtSinEndereco")) == true) {
				return false;
			}
			
			if (isEmpty($("#txtSinNumero")) == true) {
				return false;
			}
			
			if (isEmpty($("#cmbSinUf")) == true) {
				return false;
			}
			
			if (isEmpty($("#cmbSinCidade")) == true) {
				return false;
			}
			
			if (isEmpty($("#txtSinBairro")) == true) {
				return false;
			}
			
			if (isEmpty($("#txtaSinDescricao")) == true) {
				return false;
			}
			
			//ABA EQUIPAMENTO
			if(apolicePertenceAoGrupoDeRamos3() == true) {
				if (produtoHabilitamAbaEquipamentos() == true) {
					if ( !($("#tabelaEquipamentos").find('[id=trCloneEquipamentos]').length > 0)){
						return false;
					}	
				}
			}

			//ABA DETALHE BEM SINISTRADO
			if(apolicePertenceAoGrupoDeRamos3() != true) {
				if ( !($("#tabelaDetalhe").find('[id=trCloneDetalhe]').length > 0)){
					return false;
				}	
			}
			
			return true;
		};
		
		
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%	 FUNÇÕES BOTÕES	    %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//FuncaoBotao
		funcSalvar = function() {
			
			var wi = (window.dialogArguments)?window.dialogArguments:window.opener;
			
			var idPessCdPessoa = $("#idPessCdPessoa",wi.document).val();
			
			var tipoGravacao = '';
			if (validarCamposObrigatoriosCompleto() == true) {
				tipoGravacao = 'C';
			} else if (validarCamposObrigatoriosPendente() == true) {
				tipoGravacao = 'P';
			} else {
				alert(montaMensagemPendente);
				return false;
			}
			
			var wi = (window.dialogArguments)?window.dialogArguments:window.opener;
			
			var jsonEntrada = {};
			jsonEntrada.comunicado = montarComunicado();
			jsonEntrada.sinistro = montarSinistro();
			jsonEntrada.equipamentos = montarEquipamentos();
			jsonEntrada.detalheBemSinistrado = montarDetalheBemSinistrado();
			jsonEntrada.responsavel = montarResponsavel();
			jsonEntrada.outrosEnvolvidos = montarOutrosEnvolvidos();
			jsonEntrada.apolice = JSON.parse($("#hidApoliceSelecionada",wi.document).val());
			
			var entrada = {};
			entrada.jsonEntrada = JSON.stringify(jsonEntrada);
			entrada.tipoGravacao = tipoGravacao;
			entrada.idPessCdPessoa = idPessCdPessoa;
			entrada.tipoTela = isAberturaSinistro() ? 'A' : 'C';
			entrada.pesrNrSequencia = $("#pesrNrSequencia",wi.document).val();
			
			$.ajax({
				url : '/csiweb-bradescore/crm/GravarSinistro.do',
				data : entrada,
				type : 'POST',
				dataType : 'json',
				beforeSend : function(jqXHR) {
					$('#aguarde').css('visibility','visible');	
				}
			}).success(function(data, textStatus, jqXHR) {
				if (data != null && data.length > 0) {
					if (data[0].retorno == false) {
						var composicaoMensagem = 'Ocorreu um problema ao tentar gravar o sinistro.\n';
						if (data[0].codigo != null && data[0].codigo > 0 ) {
							composicaoMensagem += 'Código: ' + data[0].codigo + '\n';
						}
						
						if (data[0].codigo != null && data[0].codigo > 0 ) {
							composicaoMensagem += 'Mensagem: ' + data[0].mensagem + '\n';
						}
						
						alert(composicaoMensagem);
					} else {
						alert(data[0].mensagem);
						window.close();
					}
				}
			}).error(function(data, textStatus, erro) {	
				alert('ERRO AO CONSULTAR O SERVIÇO DO BRADESCO\nMétodo: "incluirAviso"\nDescrição: ' + erro);
			}).complete(function( jqXHR, textStatus ){
				$('#aguarde').css('visibility','hidden');
			});
		};
		
		montarComunicado = function() {
			var obj = {};
			
			var wi = (window.dialogArguments)?window.dialogArguments:window.opener;
			
			var apolice = JSON.parse($("#hidApoliceSelecionada",wi.document).val());
			
			obj['codigoSucursal'] = apolice.codigoSucursal;
			obj['codigoCia'] = apolice.codigoCia;
			obj['codigoRamo'] = apolice.codigoRamo;
			obj['codigoApolice'] = apolice.numeroApolice;
			obj['codigoProduto'] = apolice.codigoProduto;
			obj['descricaoProduto'] = apolice.descricaoProduto;
			
			var dataOcorrencia = $('[name="csCdtbPessoaespecPeesVo.campoAux4"]' ,wi.window.top.principal.pessoa.dadosPessoa.document).val();
			var horaOcorrencia = $('[name="csCdtbPessoaespecPeesVo.campoAux5"]' ,wi.window.top.principal.pessoa.dadosPessoa.document).val();
			
			obj['dataOcorrenciaIdentificacao'] = dataOcorrencia;
			obj['horaOcorrenciaIdentificacao'] = horaOcorrencia;
				
			obj = adicionarNoJson(obj,'contato','txtNomeContato');
			obj = adicionarNoJson(obj,'ddd','dddContato');
			obj = adicionarNoJson(obj,'telefone','telefoneContato');
			obj = adicionarNoJson(obj,'tipoRelacao','cmbTipoRelacao');
			obj = adicionarNoJson(obj,'apolice','txtApolice');
			obj = adicionarNoJson(obj,'codCorretor','codigoCorretor');
			obj = adicionarNoJson(obj,'numAvisoSinistro','numeroSinistro');
			obj = adicionarNoJson(obj,'status','txtStatus');
			obj = adicionarNoJson(obj,'nomeCorretor','txtNomeCorretor');
			obj = adicionarNoJson(obj,'nomeSegurado','txtNomeSegurado');
			return obj;
		};
		
		montarSinistro = function() {
			var obj = {};
			obj = adicionarNoJson(obj,'endNaoCorreto','chkEnderecoNaoCorreto');
			obj = adicionarNoJson(obj,'causa','cmbCausa');
			obj = adicionarNoJson(obj,'data','txtSinData');
			obj = adicionarNoJson(obj,'natureza','cmbNatureza');
			obj = adicionarNoJson(obj,'hora','txtSinHora');
			obj = adicionarNoJson(obj,'cep','txtSinCep');
			obj = adicionarNoJson(obj,'endereco','txtSinEndereco');
			obj = adicionarNoJson(obj,'numero','txtSinNumero');
			obj = adicionarNoJson(obj,'complemento','txtSinComplemento');
			obj = adicionarNoJson(obj,'uf','cmbSinUf');
			obj = adicionarNoJson(obj,'cidade','cmbSinCidade');
			obj = adicionarNoJson(obj,'bairro','txtSinBairro');
			obj = adicionarNoJson(obj,'descricao','txtaSinDescricao');
			obj = adicionarNoJson(obj,'houveCorpoBombeiro','chkHouveCorpoBombeiro');
			obj = adicionarNoJson(obj,'moradiaHabitavel','chkMoradiaHabitavel');
			obj = adicionarNoJson(obj,'providenciouBo','chkProvidencioBO');
			return obj;
		};
		
		montarEquipamentos = function() {

			var obj = [];
			var trEqui = $("[id=trCloneEquipamentos]");
			
			if (trEqui != null && trEqui.length > 0) {
				trEqui.each(function(index,linha){
					var data = $(linha).data('objeto');
					obj.push(data);
				});
			}
			
			return obj;
		};

		montarDetalheBemSinistrado = function() {

			var obj = [];
			var trDet = $("[id=trCloneDetalhe]");
			
			if (trDet != null && trDet.length > 0) {
				trDet.each(function(index,linha){
					var data = $(linha).data('objeto');
					obj.push(data);
				});
			}
			
			return obj;
		};
		
		montarResponsavel = function() {
			var obj = {};
			obj = adicionarNoJson(obj,'mesmoEnderecoApolice','chkRespMesmoEndereco');
			obj = adicionarNoJson(obj,'nomeResponsavel','txtRespNome');
			obj = adicionarNoJson(obj,'endereco','txtRespEndereco');
			obj = adicionarNoJson(obj,'dddTelefone','txtRespDDD');
			obj = adicionarNoJson(obj,'numeroTelefone','txtRespTelefone');
			obj = adicionarNoJson(obj,'bairro','txtRespBairro');
			obj = adicionarNoJson(obj,'dddCelular','txtRespDDDCelular');
			obj = adicionarNoJson(obj,'numeroCelular','txtRespTelefoneCelular');
			obj = adicionarNoJson(obj,'cep','txtRespCep');
			obj = adicionarNoJson(obj,'email','txtRespEmail');
			obj = adicionarNoJson(obj,'uf','cmbRespUf');
			obj = adicionarNoJson(obj,'cidade','cmbRespCidade');
			obj = adicionarNoJson(obj,'receberSms','chkRespReceberAcompanhamentoSMS');
			obj = adicionarNoJson(obj,'receberEmail','chkRespReceberAcompanhamentoEmail');
			
			obj = adicionarNoJson(obj,'proprioSegurado','chkRespProprioSegurado');
			obj = adicionarNoJson(obj,'outros','cmbRespOutros');
			obj = adicionarNoJson(obj,'nomeBeneficiario','txtRespNomeBeneficiario');
			obj = adicionarNoJson(obj,'cpfBeneficiario','txtRespCpfBeneficiario');
			
			obj = adicionarNoJson(obj,'naoTemContaBanco','chkRespNaoTemContaBanco');
			obj = adicionarNoJson(obj,'codBanco','txtRespCodigoBanco');
			obj = adicionarNoJson(obj,'descricaoBanco','txtRespDescricaoBanco');
			obj = adicionarNoJson(obj,'agencia','txtRespAgencia');
			obj = adicionarNoJson(obj,'conta','txtRespConta');
			obj = adicionarNoJson(obj,'contaDv','txtRespContaDv');
			
			obj = adicionarNoJson(obj,'existeOutroSeguro','chkRespExisteOutrosSeguros');
			obj = adicionarNoJson(obj,'qualCia','cmbRespQualSeguro');
			
			return obj;
		};
		
		montarOutrosEnvolvidos = function() {

			var obj = [];
			var trOutros = $("[id=trCloneOutros]");
			
			if (trOutros != null && trOutros.length > 0) {
				trOutros.each(function(index,linha){
					var data = $(linha).data('objeto');
					obj.push(data);
				});
			}
			
			return obj;
		};
		
		adicionarNoJson = function(obj, nomeNo, nomeCampo) {

			var campo = $("#" + nomeCampo );
			
			if (campo.is(":text")) {
				obj[nomeNo] = campo.val() != null && $.trim(campo.val().toString()).length > 0 ? campo.val().toUpperCase() : ''; 
			} else if (campo.is("select")) {
				if (campo.find(':selected').val() != '' ) {
					var jsonAdd = {};
					jsonAdd["id"] = campo.find(':selected').val().toUpperCase();
					jsonAdd["value"] = campo.find(':selected').text().toUpperCase();
					obj[nomeNo] = jsonAdd;
				}
			} else if (campo.is(":checkbox")) {
				obj[nomeNo] = campo.is(':checked'); 
			} else if (campo.is("textarea")) {
				obj[nomeNo] = campo.val() != null && $.trim(campo.val().toString()).length > 0 ? campo.val().toUpperCase() : '';
			}
			
			return obj;
		};
		
		funcSelecionarCep = function() {

			if ($.trim($("#txtSinCep").val()).length == 0) {
				alert('Informe o Cep para pesquisar.');
				return false;
			}
			
			var dataEntrada = {};
			dataEntrada.cep = $("#txtSinCep").val();
			
			$.ajax({
				url : '/csiweb-bradescore/crm/CarregarCepSinistro.do',
				data : dataEntrada,
				type : 'POST',
				dataType : 'json',
				beforeSend : function(jqXHR) {
					desabilitarBotao('btnSinLupa');
					$('#aguarde').css('visibility','visible');
				}
			}).success(function(data, textStatus, jqXHR) {

				if (data != null && data.length > 0) {
					if (data[0].retorno == true) {
						if( data[0].listacep != null && data[0].listacep.length > 0 ) {
							var cep = data[0].listacep[0];
							
							preencheCamposPlusCep(
									cep.descricaoLogradouro,
									cep.bairro,
									cep.cidade,
									cep.siglaUf,
									'false',
									'');	
						} 
					}
				}
				
			}).error(function(data, textStatus, erro) {	
				alert('ERRO AO CONSULTAR O SERVIÇO DO BRADESCO\nMétodo: "obterListaLogradouroCompletoPorCep"\nDescrição: ' + erro);	
			}).complete(function( jqXHR, textStatus ){
				$('#aguarde').css('visibility','hidden');
				habilitarBotao('btnSinLupa', funcSelecionarCep , 'Pesquisar');
			});
		};
		
		//Envento de click do botão pesquisar e aceitar do cidade por texto.
		funcPesquisarCidade = function() {
			$("#btnPesquisarSinistro").unbind('click');
			$("#btnPesquisarSinistro").bind('click',function() {
				
				var campoUf;
				var campoCidade;
				var campoCidadeBusca;
				var btnCancelar;
				
				campoUf = $("#cmbSinUf");
				campoCidade = $("#cmbSinCidade");
				campoCidadeBusca = $("#txtSinCidadeBusca");
				btnCancelar = $("#btnCancelarSinistro");
				
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
		
		funcAbrirListaEndereco = function() {
			showModalDialog('AbrirListaEnderecoSinistro.do', window, 'help:no;scroll:no;Status:NO;dialogWidth:800px;dialogHeight:220px;dialogTop:250px;dialogLeft:180px');
		};
		
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%	 FUNÇÕES BOTÕES	 FIM   %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//FuncaoEvento
		$("#btnSalvar").bind('click',function() {
			funcSalvar();
		});
		
		$("#btnSair").bind('click',function() {
			window.close();
		});
		
		
		$("#cmbCausa").bind('change', function(){
			carregarComboNatureza($('#cmbNatureza') , $(this).val(), '');
			
			if ($(this).val() == '') {
				$('#cmbNatureza').attr('disabled' , true);
			} else {
				$('#cmbNatureza').attr('disabled' , false);
			}
		});
		
		$("#cmbNatureza").bind('change', function(){
			var textSelect = $(this).find(':selected').text().toUpperCase(); 
			
			if ( textSelect.indexOf('CORPO DE BOMBEIROS') >= 0) {
				$("#chkHouveCorpoBombeiro").attr('disabled' , false);
			} else {
				$("#chkHouveCorpoBombeiro").attr('disabled' , true);
				$("#chkHouveCorpoBombeiro").attr('checked' , false);
			}
			
			if ( textSelect.indexOf('ROUBO') >= 0 || textSelect.indexOf('FURTO') >= 0) {
				$("#chkProvidencioBO").attr('disabled' , false);
			} else {
				$("#chkProvidencioBO").attr('disabled' , true);
				$("#chkProvidencioBO").attr('checked' , false);
			}
		});
		
		$("#chkEnderecoNaoCorreto").bind('click',function() {
			if ($(this).is(":checked")) {
				
				$("#txtSinCep").val('');
				$("#btnSinLupa").val('');
				$("#txtSinEndereco").val('');
				$("#txtSinNumero").val('');
				$("#txtSinComplemento").val('');
				$("#cmbSinUf").val('');
				$("#cmbSinCidade").val('');
				$("#txtSinBairro").val('');
				habilitarBotao('btnSinLupa', funcSelecionarCep , 'Pesquisar');
				habilitarBotao('btnPesquisarSinistro', '' , 'Pesquisar');
				funcPesquisarCidade();
				funcAbrirListaEndereco();
				funcHabilitarCamposDataSinistro();
				
			}
		});
		
		//Evento quando sair do combo de estado.
		$("#cmbSinUf, #cmbRespUf").bind('change', function(){
			if ($(this).attr('id') == 'cmbSinUf') {
				carregarMunicipio('cmbSinCidade' , $(this).val(), '');	
			} else if ($(this).attr('id') == 'cmbRespUf') {
				carregarMunicipio('cmbRespCidade' , $(this).val(), '');
			}
		});
		
		//Enveto click do botão cancelar
		$("#btnCancelarSinistro, #btnCancelarResponsavel").bind('click',function() {
			cancelarTextoMunicipio($(this));
		});
		
		//Evento de keyPress de enter ou esc do campo busca de cidade por texto.
		$("#txtSinCidadeBusca,#txtSinCidadeBuscaResponsavel").bind('keyup', function(event){
			
			var btnPesquisar;
			var btnCancelar;
			
			if($(this).attr('id') == 'txtSinCidadeBusca') {
				btnPesquisar = $("#btnPesquisarSinistro");
				btnCancelar = $("#btnCancelarSinistro");
			} else if($(this).attr('id') == 'txtSinCidadeBuscaResponsavel') {
				btnPesquisar = $("#btnPesquisarResponsavel");
				btnCancelar = $("#btnCancelarResponsavel");
			}
			
			if (event.keyCode == 13 ) {
				btnPesquisar.trigger('click');
			}
			
			if (event.keyCode == 27 ) {
				btnCancelar.trigger('click');
			} 
		});
		
		//FuncaoNegocio
		preencheCamposPlusCep = function(logradouro, bairro, municipio, uf, cep, numero) {
			$("#txtSinEndereco").val(logradouro == null ? '' : logradouro.toUpperCase());
			$("#txtSinNumero").val(numero == null ? '' : numero.toUpperCase());
			
			if(uf != null && uf.length > 0 ) {
				SelecionaItemComboInsertCasoEstejaInativo('cmbSinUf', uf, uf);	
			}
			
			if(municipio != null && municipio.length > 0 ) {
				SelecionaItemComboInsertCasoEstejaInativo('cmbSinCidade', municipio, municipio.toUpperCase());	
			}
			
			$("#txtSinBairro").val(bairro == null ? '' : bairro.toUpperCase());
			
			if (cep != 'false' ) {
				$("#txtSinCep").val(cep == null ? '' : cep.toString().toUpperCase());
			}
			
		};
		
		//função para habitar a procura de cidade pelo campo de texto.
		habilitarTextoMunicipio = function(campoCidade,campoCidadeBusca,btnCancelar,btnPesquisa) {
			campoCidade.toggle();
			campoCidadeBusca.toggle();
			
			if (campoCidade.is(":hidden")) {
				btnCancelar.show();
				btnPesquisa.prop('src', '../resources/assets/imgs/check.gif');
				campoCidadeBusca.val('');
			} else {
				btnPesquisa.prop('src', '../resources/assets/imgs/lupa.gif');
				btnCancelar.hide();
			}
		};
		
		//Função usado quando o click do botão de cancelar é acionado.
		cancelarTextoMunicipio = function(btnCancelar){
			
			var campoUf;
			var campoCidade;
			var campoCidadeBusca;
			var btnPesquisar;
			
			if(btnCancelar.attr('id') == 'btnCancelarSinistro') {
				campoUf = $("#cmbSinUf");
				campoCidade = $("#cmbSinCidade");
				campoCidadeBusca = $("#txtSinCidadeBusca");
				btnPesquisar = $("#btnPesquisarSinistro");
			} else if(btnCancelar.attr('id') == 'btnCancelarResponsavel') {
				campoUf = $("#cmbRespUf");
				campoCidade = $("#cmbRespCidade");
				campoCidadeBusca = $("#txtSinCidadeBuscaResponsavel");
				btnPesquisar = $("#btnPesquisarResponsavel");
			}
			
			campoCidade.show();
			campoCidadeBusca.hide();
			btnPesquisar.prop('src', '../resources/assets/imgs/lupa.gif');
			carregarMunicipio(campoCidade.attr('id') , campoUf.val(), '');
			btnCancelar.hide();
		};
		
		apolicePertenceAoGrupoDeRamos3 = function() {
			
			var wi = (window.dialogArguments)?window.dialogArguments:window.opener;

			var apolice = JSON.parse($("#hidApoliceSelecionada",wi.document).val());
			
			var dataEntrada = {};
			
			var objGrupoRamos = JSON.parse($("#hidGrupoRamos",wi.document).val());

			if (objGrupoRamos != null && objGrupoRamos.length > 0) {
				//Procurar no Ramo 3
				if (objGrupoRamos[0].grupo3 != null && objGrupoRamos[0].grupo3.length > 0) {
					for ( var i = 0; i < objGrupoRamos[0].grupo3.length; i++) {
						var ramo = objGrupoRamos[0].grupo3[i];
						if (ramo.retaCdCorporativo.toString() == apolice.codigoRamo.toString()) {
							return true;
						}
					}	
				}
			}
			
			return false;
		};
		
		apolicePertenceAoGrupoDeRamos1 = function() {
			
			var wi = (window.dialogArguments)?window.dialogArguments:window.opener;

			var apolice = JSON.parse($("#hidApoliceSelecionada",wi.document).val());
			
			var dataEntrada = {};
			
			var objGrupoRamos = JSON.parse($("#hidGrupoRamos",wi.document).val());
			
			if (objGrupoRamos != null && objGrupoRamos.length > 0) {
				//Procurar no Ramo 3
				if (objGrupoRamos[0].grupo1 != null && objGrupoRamos[0].grupo1.length > 0) {
					for ( var i = 0; i < objGrupoRamos[0].grupo1.length; i++) {
						var ramo = objGrupoRamos[0].grupo1[i];
						if (ramo.retaCdCorporativo.toString() == apolice.codigoRamo.toString()) {
							return true;
						}
					}	
				}
			}
			
			return false;
		};
		
		produtoHabilitamAbaEquipamentos = function() {
			
			try {
				var wi = (window.dialogArguments)?window.dialogArguments:window.opener;

				var apolice = JSON.parse($("#hidObterApolice").val());
				
				var dataEntrada = {};
				
				var objGrupoRamos = JSON.parse($("#hidGrupoRamos",wi.document).val());
				
				if (objGrupoRamos != null && objGrupoRamos.length > 0) {
					//Procurar no Ramo 3
					if (objGrupoRamos[0].produtohabilitamequipamento != null && objGrupoRamos[0].produtohabilitamequipamento.length > 0) {
						for ( var i = 0; i < objGrupoRamos[0].produtohabilitamequipamento.length; i++) {
							var produto = objGrupoRamos[0].produtohabilitamequipamento[i];
							if (produto.retaCdCorporativo.toString() == apolice.codigoProduto.toString()) {
								return true;
							}
						}	
					}
				}
			} catch (e) {
				return false;
			}
			
			return false;
		};
		
		
		//FuncaoAjax
		carregarComboTipoRelacao = function(cmbRelacao) {
			
			cmbRelacao.empty();
			
			$.ajax({
				url : '/csiweb-bradescore/crm/CarregarComboTipoRelacaoIncluirSinistro.do',
				data : {},
				type : 'POST',
				dataType : 'json',
				beforeSend : function(jqXHR) {
					cmbRelacao.append($("<option></option>").val("").html("Carregando..."));	
				}
			}).error(function(data, textStatus, erro) {	
				alert('ERRO AO CONSULTAR O SERVIÇO DE TIPO DE RELAÇÃO\nMétodo: "carregarComboTipoRelacao"\nDescrição: ' + erro);		
			}).success(function(data, textStatus, jqXHR) {
				cmbRelacao.empty();
				cmbRelacao.append($("<option></option>").val("").html("Selecione uma opção"));				
				
				$(data).each(function(index,reg){
					cmbRelacao.append($("<option></option>").val(reg.retaCdCorporativo).html(reg.retaDsResptabulada));
				});
			});
		};
		
		carregarComboCausa = function(cmb, objLeitura) {
			
			var wi = (window.dialogArguments)?window.dialogArguments:window.opener;
			
			cmb.empty();
			
			var apolice = JSON.parse($("#hidApoliceSelecionada",wi.document).val());
			
			var dataEntrada = {};
			
			var objEntrada = objLeitura;
			
			dataEntrada.ramo = apolice.codigoRamo; 
			
			$.ajax({
				url : '/csiweb-bradescore/crm/CarregarComboCausaIncluirSinistro.do',
				data : dataEntrada,
				type : 'POST',
				dataType : 'json',
				beforeSend : function(jqXHR) {
					cmb.append($("<option></option>").val("").html("Carregando..."));	
				}
			}).error(function(data, textStatus, erro) {	
				alert('ERRO AO CONSULTAR O SERVIÇO DO BRADESCO\nMétodo: "listarCausas"\nDescrição: ' + erro);
			}).success(function(data, textStatus, jqXHR) {
				cmb.empty();
				cmb.append($("<option></option>").val("").html("Selecione uma opção"));				
				
				if( data != null && data.length > 0) {
					if (data[0].retorno == true) {
						$(data[0].listarcausa).each(function(index,reg){
							cmb.append($("<option></option>").val(reg.codigo).html(reg.descricao));
						});
					} 
				} 
			}).complete(function( jqXHR, textStatus ){
				if (objEntrada != null ) {
					if ( 
							(objEntrada.id != null && objEntrada.id.toString().length > 0) 
							&& (objEntrada.value != null && objEntrada.value.toString().length > 0)) {
						SelecionaItemComboInsertCasoEstejaInativo('cmbCausa', objEntrada.id, objEntrada.value.toString());
						$("#cmbNatureza").attr('disabled', false);
					}
				}
				
				if (isSinistroCompleto() == true) {
					cmb.attr('disabled', true);
				}
			});
		};
		
		carregarComboNatureza = function(cmb, valorCausa, objLeitura) {
			
			var wi = (window.dialogArguments)?window.dialogArguments:window.opener;
			
			cmb.empty();
			
			var apolice = JSON.parse($("#hidApoliceSelecionada",wi.document).val());
			
			var dataEntrada = {};
			
			var objEntrada = objLeitura;
			
			dataEntrada.ramo = apolice.codigoRamo;
			dataEntrada.causa = valorCausa;
			
			$.ajax({
				url : '/csiweb-bradescore/crm/CarregarComboNaturezaIncluirSinistro.do',
				data : dataEntrada,
				type : 'POST',
				dataType : 'json',
				beforeSend : function(jqXHR) {
					cmb.append($("<option></option>").val("").html("Carregando..."));	
				}
			}).error(function(data, textStatus, erro) {	
				alert('ERRO AO CONSULTAR O SERVIÇO DO BRADESCO\nMétodo: "listarNaturezas"\nDescrição: ' + erro);
			}).success(function(data, textStatus, jqXHR) {
				cmb.empty();
				cmb.append($("<option></option>").val("").html("Selecione uma opção"));				
				
				if( data != null && data.length > 0) {
					if (data[0].retorno == true) {
						$(data[0].listarnatureza).each(function(index,reg){
							cmb.append($("<option></option>").val(reg.codigo).html(reg.descricao));
						});
					} 
				} 
			}).complete(function( jqXHR, textStatus ){
				if (objEntrada != null ) {
					if ( 
							(objEntrada.id != null && objEntrada.id.toString().length > 0) 
							&& (objEntrada.value != null && objEntrada.value.toString().length > 0)) {
						SelecionaItemComboInsertCasoEstejaInativo('cmbNatureza', objEntrada.id, objEntrada.value.toString());
					}
				}
				
				if (isSinistroCompleto() == true) {
					cmb.attr('disabled', true);
				}
				
			});
		};
		
		obterDadosApolice = function() {
			
			var wi = (window.dialogArguments)?window.dialogArguments:window.opener;
			var horaOcorrencia = $('[name="csCdtbPessoaespecPeesVo.campoAux5"]' ,wi.window.top.principal.pessoa.dadosPessoa.document).val();
			var dataOcorrencia = $('[name="csCdtbPessoaespecPeesVo.campoAux4"]' ,wi.window.top.principal.pessoa.dadosPessoa.document).val();
			
			var entrada = {}; 
			
			entrada.jsonEntrada = $("#hidApoliceSelecionada",wi.document).val();
			entrada.dataOcorrencia = dataOcorrencia;
			entrada.horaOcorrencia = horaOcorrencia;
			
			$.ajax({
				url : '/csiweb-bradescore/crm/ObterDadosApolice.do',
				data : entrada,
				type : 'POST',
				dataType : 'json',
				beforeSend : function(jqXHR) {
					$('#aguarde').css('visibility','visible');	
				}
			}).success(function(data, textStatus, jqXHR) {
				
				if( data != null && data.length > 0) {
					var apolice = data[0];
					if (apolice.retorno == false) {
						alert(apolice.mensagem);
						window.close();
					} else {
						//Carregar Cabeçalho
						$("#hidObterApolice").val(JSON.stringify(apolice.apolice));
						carregarCabecalho(apolice.apolice);
						carregarAbaSinistro(apolice.apolice);
						carregarAbaResponsavel(apolice.apolice);
						carregarAbaBeneficiario(apolice.apolice);
						carregarConsultaSinistro();
					}
				} else {
					alert('Problema na integração com o web service ApoliceWebServiceService, método obterDadosApolice. \nEsse imprevisto impede ' 
						   + 'o prosseguimento do processo de abertura de sinistro. Favor informar à supervisão.');
					window.close();
				}
			}).error(function(data, textStatus, erro) {	
				alert('ERRO AO CONSULTAR O SERVIÇO DO BRADESCO\nMétodo: "obterDadosApolice"\nDescrição: ' + erro);
			}).complete(function( jqXHR, textStatus ){
				$('#aguarde').css('visibility','hidden');
			});
		};
		
		//Carregar combo Estado
		carregarUF = function(nomeCombo, objetoEstado) {
			
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
				}).error(function(data, textStatus, erro) {	
					alert('ERRO AO CONSULTAR O SERVIÇO DE UF\nMétodo: "carregarUF"\nDescrição: ' + erro);
				}).complete(function(){
					if (objetoEstado != null) {
						SelecionaItemComboInsertCasoEstejaInativo('aure_ds_uf', objetoEstado.value,objetoEstado.text);
					}
				});
		};
		
		//Carregar cidade;
		carregarMunicipio = function(nomeCombo,estado,municipio,objetoMunicio) {
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
				}).error(function(data, textStatus, erro) {	
					alert('ERRO AO CONSULTAR O SERVIÇO DE CIDADE\nMétodo: "carregarMunicipio"\nDescrição: ' + erro);
				}).complete(function(){
					if (objetoMunicio != null) {
						SelecionaItemComboInsertCasoEstejaInativo('aure_ds_cidade', objetoMunicio.value,objetoMunicio.text);
					}
				});
		};
		
		setarLabel = function() {
			var wi = (window.dialogArguments)?window.dialogArguments:window.opener;
			if (isAberturaSinistro()) {
				$("#labelSinistro").html('Comunicado de Abertura de Sinistro');	
			} else if (wi.name == 'consultaSinistro') {
				$("#labelSinistro").html('Consulta de Sinistro');
			}
			
		};
		
		isAberturaSinistro = function() {
			var wi = (window.dialogArguments)?window.dialogArguments:window.opener;
			
			if (wi.name == 'apolice') {
				return true;	
			}
			return false;
		};
		
		carregarConsultaSinistro = function() {
			var mensagemErro = 'Problema na leitura do sinistro. \nEsse imprevisto impede ' 
				   + 'o prosseguimento de consulta. Favor informar à supervisão.'; 
			
			try {
				
				if (isAberturaSinistro() == true) {
					return false;
				}
				
				var wi = (window.dialogArguments)?window.dialogArguments:window.opener;
				
				var sinistroGravado = $("#hidSinistroGravado",wi.document).val();
				
				if ($.trim(sinistroGravado).length == 0 ) {
					alert(mensagemErro);
					window.close();	
				}
				
				var objSinistro = JSON.parse(sinistroGravado);
				
				if (objSinistro == null) {
					alert(mensagemErro);
					window.close();	
				}
				
				carregarComunicado(objSinistro.comunicado);
				carregarSinistro(objSinistro.sinistro);
				carregarEquipamentos(objSinistro.equipamentos);
				carregarDetalheBemSinistrado(objSinistro.detalheBemSinistrado);
				carregarResponsavel(objSinistro.responsavel);
				carregarOutrosEnvolvidos(objSinistro.outrosEnvolvidos);

				if (isSinistroCompleto(objSinistro)) {
					desativarTodosOsCampos();
				}
				
			} catch (e) {
				alert(mensagemErro);
				window.close();
			}
		};
		
		desativarTodosOsCampos = function() {
			$(":text").attr('readonly', 'readonly');
			$('input:checkbox').attr('disabled', true);
			$('select').attr('disabled', true);
			$("textarea").attr('readonly', 'readonly');
			$('button:not([id=btnSair])').each(function(index,botao){
				desabilitarBotao(this.id);
			});
		};
		
		isSinistroCompleto = function(sinistroGravado) {
			try {
				var wi = (window.dialogArguments)?window.dialogArguments:window.opener;
				var status = $("#hidStatusSinistroGravado",wi.document).val();
				
				if (status != null && (status == 'COMPLETO')) {
					return true;
				}	
			} catch (e) {
				return false;
			}
			return false;
		};
		
		carregarComunicado = function(obj) {

			lerCampo(obj,'contato','txtNomeContato');
			lerCampo(obj,'ddd','dddContato');
			lerCampo(obj,'telefone','telefoneContato');
			lerCampo(obj,'tipoRelacao','cmbTipoRelacao');
			lerCampo(obj,'apolice','txtApolice');
			lerCampo(obj,'codCorretor','codigoCorretor');
			lerCampo(obj,'numAvisoSinistro','numeroSinistro');
			lerCampo(obj,'status','txtStatus');
			lerCampo(obj,'nomeCorretor','txtNomeCorretor');
			lerCampo(obj,'nomeSegurado','txtNomeSegurado');
		
		};
		
		carregarSinistro = function(obj) {
			
			lerCampo(obj,'endNaoCorreto','chkEnderecoNaoCorreto');
			lerCampo(obj,'causa','cmbCausa');
			
			
			if (obj.causa != null) {
				carregarComboCausa($("#cmbCausa"), obj.causa);
				if (obj.causa.id != null && obj.causa.id.toString().length > 0) {
					carregarComboNatureza($("#cmbNatureza"),obj.causa.id, obj.natureza);	
				}
			}
			
			lerCampo(obj,'data','txtSinData');
			lerCampo(obj,'natureza','cmbNatureza');
			lerCampo(obj,'hora','txtSinHora');
			lerCampo(obj,'cep','txtSinCep');
			lerCampo(obj,'endereco','txtSinEndereco');
			lerCampo(obj,'numero','txtSinNumero');
			lerCampo(obj,'complemento','txtSinComplemento');
			lerCampo(obj,'uf','cmbSinUf');
			lerCampo(obj,'cidade','cmbSinCidade');
			lerCampo(obj,'bairro','txtSinBairro');
			lerCampo(obj,'descricao','txtaSinDescricao');
			lerCampo(obj,'houveCorpoBombeiro','chkHouveCorpoBombeiro');
			lerCampo(obj,'moradiaHabitavel','chkMoradiaHabitavel');
			lerCampo(obj,'providenciouBo','chkProvidencioBO');
			return obj;
		
		};
		
		carregarEquipamentos = function(obj) {
			if (obj != null && obj.length > 0) {
				$(obj).each(function(index,reg) {
					funAdicionarEquipamento(
							reg.item,
							reg.descricao,
							reg.serieEquipamento,
							reg.marca,
							reg.anoFrabicacaoEquipamento,
							reg.modelo,
							reg.qtde,
							reg.valorEstimado,
							reg.valor);		
				});
			}
		};
		
		carregarDetalheBemSinistrado = function(obj) {
			if (obj != null && obj.length > 0) {
				$(obj).each(function(index,reg) {
					funAdicionarDetalhe(
							reg.detClassificacao,
							reg.detClassificacaoDescricao,
							reg.qtde,
							reg.detValor,
							reg.detValorTotalDanos,
							reg.descricao);
				});
			}
		};
		
		carregarResponsavel = function(obj) {
			lerCampo(obj,'mesmoEnderecoApolice','chkRespMesmoEndereco',true);
			lerCampo(obj,'nomeResponsavel','txtRespNome');
			lerCampo(obj,'endereco','txtRespEndereco');
			lerCampo(obj,'dddTelefone','txtRespDDD');
			lerCampo(obj,'numeroTelefone','txtRespTelefone');
			lerCampo(obj,'bairro','txtRespBairro');
			lerCampo(obj,'dddCelular','txtRespDDDCelular');
			lerCampo(obj,'numeroCelular','txtRespTelefoneCelular');
			lerCampo(obj,'cep','txtRespCep');
			lerCampo(obj,'email','txtRespEmail');
			lerCampo(obj,'uf','cmbRespUf');
			lerCampo(obj,'cidade','cmbRespCidade');
			lerCampo(obj,'receberSms','chkRespReceberAcompanhamentoSMS');
			lerCampo(obj,'receberEmail','chkRespReceberAcompanhamentoEmail');
			
			lerCampo(obj,'proprioSegurado','chkRespProprioSegurado',true);
			lerCampo(obj,'outros','cmbRespOutros');
			lerCampo(obj,'nomeBeneficiario','txtRespNomeBeneficiario');
			lerCampo(obj,'cpfBeneficiario','txtRespCpfBeneficiario');
			
			lerCampo(obj,'naoTemContaBanco','chkRespNaoTemContaBanco',true);
			lerCampo(obj,'codBanco','txtRespCodigoBanco');
			lerCampo(obj,'descricaoBanco','txtRespDescricaoBanco');
			lerCampo(obj,'agencia','txtRespAgencia');
			lerCampo(obj,'conta','txtRespConta');
			lerCampo(obj,'contaDv','txtRespContaDv');
			
			lerCampo(obj,'existeOutroSeguro','chkRespExisteOutrosSeguros',true);
			lerCampo(obj,'qualCia','cmbRespQualSeguro');
			
			return obj;
		};
		
		carregarOutrosEnvolvidos = function(obj) {
			if (obj != null && obj.length > 0) {
				$(obj).each(function(index,reg) {
					funAdicionarOutrosEnvolvidos(
							reg.nome,
							reg.cpf);
				});
			}
		};
		
		
		lerCampo = function(obj, nomeNo, nomeCampo,triggerEmCheckbox) {

			var campo = $("#" + nomeCampo );
			
			if (campo.is(":text")) {
				campo.val(obj[nomeNo] != null && $.trim(obj[nomeNo].toString()).length > 0 ? obj[nomeNo].toUpperCase() : '');
			} else if (campo.is("select")) {
				if (obj[nomeNo] != null ) {
					if ( 
							(obj[nomeNo].id != null && obj[nomeNo].id.toString().length > 0) 
							&& (obj[nomeNo].value != null && obj[nomeNo].value.toString().length > 0)) {
						SelecionaItemComboInsertCasoEstejaInativo(nomeCampo, obj[nomeNo].id, obj[nomeNo].value.toString());
					}
				}
			} else if (campo.is(":checkbox")) {
				if (triggerEmCheckbox != null && triggerEmCheckbox == true) {
					campo.attr('checked' , !obj[nomeNo]).trigger('click');	
				} else {
					campo.attr('checked' , obj[nomeNo]);
				}
				
			} else if (campo.is("textarea")) {
				campo.val(obj[nomeNo] != null && $.trim(obj[nomeNo].toString()).length > 0 ? obj[nomeNo].toUpperCase() : '');
			}
			return obj;
		};
		
		init = function() {
			setarLabel();
			ativaPasta( 'sinistro' );
			configurarControle();
			obterDadosApolice();
		};
		
		init();
		
	});
})(jQuery);