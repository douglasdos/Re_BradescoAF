(function($){
	$(document).ready(function() {
		var wi = (window.dialogArguments)?window.dialogArguments:window.opener;
		var trClone = $("#trClone").clone();
		trClone.attr('style', '');
		
		var trNenhumRegistroClone = $("#trNenhumRegistroClone").clone();
		trNenhumRegistroClone.css('display', '');
		
		
		//########################################################################################
		//###################################### Funções Botões ##################################
		//########################################################################################
		
		buscarPessoa = function() {
			
			var campoPreenchido = false;
			
			$(':text').each(function(index, campo){
				if ($.trim($(campo).val()).length > 0) {
					campoPreenchido = true;	
				}
			});
			
			if (campoPreenchido == false) {
				alert(CONS_ALERT_CAMPO_BUSCA);
				return false;
			}
			
			if ($.trim($("#pessDsCgccpf").val()).length == 0) {
				alert('O campo "CPF / CNPJ" é obrigatório');
				return false;
			}
			
			$("#acao").val("<%= Constantes.ACAO_CONSULTAR %>");

			$('#aguarde').css('visibility','visible');

			var classificador = 
				window.location.search.indexOf('classifEmail') >= 0 ? true : false ;
			
			var dataBusca = {};	
				
			if (classificador == true) {
				var dataBuscaRetorno = montaDataClassificadorDeEmail();
				
				if (dataBuscaRetorno.retorno == false ) {
					$('#aguarde').css('visibility','hidden');
					alert(CON_CAMPO_BUSCA);
					return false;
				}
				
				dataBusca = dataBuscaRetorno.campos;
				
			} else {
				var dataBuscaRetorno = montaData();
				if (dataBuscaRetorno.retorno == false ) {
					$('#aguarde').css('visibility','hidden');
					return false;
				}
				
				dataBusca = dataBuscaRetorno.campos;
			}
			
			limparTabela();
			
			$("#btnBuscar").unbind('click');
			
			$.ajax({
				url : '/csiweb-bradescore/crm/BuscarPessoaEspec.do',
				data : dataBusca,
				type : 'POST',
				dataType : 'json'
			}).success(function(data, textStatus, jqXHR) {
								
				$(data).each(function(index,reg){
					if(reg.retorno == false) {
						limparTabela();
						var trNenhum = trNenhumRegistroClone.clone();
						$("#tabelaPessoa").append(trNenhum);
						if (reg.mensagem != null && reg.mensagem.length > 0) {
							alert(reg.mensagem);	
						}
						
						ativarBotao($("#btnNovo"), 'Novo', 'click', adicionarNovo);
					} else {
						if (reg.tipobusca == 'buc') {
							if (reg.listapessoa != null && reg.listapessoa.length > 0) {
								var lstApolices = reg.listaapolices;
								var registro = reg;
								$(reg.listapessoa).each(function(index,pessoa) {
									var trNovo = trClone.clone();
									var objeto = {};
									objeto.lstApolices = lstApolices;
									objeto.pessoa = pessoa;
									objeto.dataOcorrencia = registro.dataocorrencia;
									objeto.horaOcorrencia = registro.horaocorrencia;
									objeto.rdoFalorSombreSinistro = registro.rdofalorsombresinistro;
									
									trNovo.prop('objeto' , objeto);
									trNovo.find('#tdNome').html(acromy(pessoa.nomePessoa,40));		
									trNovo.find('#tdCpfCnpj').html(formatarCPF(pessoa.cpfCgc));
									
									trNovo.find('#tdDataNascimento').html(tranformarDataYYYYMMDDPadraoParaBr(pessoa.dataNascimento));
									trNovo.find('#tdDdd').html(pessoa.ddd);
									trNovo.find('#tdTelefone').html(pessoa.fone);
									
									trNovo.bind('click',function() {
										objeto = limparJson(objeto);
										abre('', '', JSON.stringify(objeto));
									});
									
									$("#tabelaPessoa").append(trNovo);
								});
							}
							
						} else if (reg.tipobusca == 'plusoft') {
							if (reg.posicionarnatela == true) {
								//Identificar automaticamente
								if (reg.listapessoa != null && reg.listapessoa.length > 0) {
									abre(reg.listapessoa[0].id_pess_cd_pessoa, reg.listapessoa[0].pess_nm_pessoa);	
								} else {
									limparTabela();
									var trNenhum = trNenhumRegistroClone.clone();
									$("#tabelaPessoa").append(trNenhum);
								}
							} else {
								
								if (reg.listapessoa != null && reg.listapessoa.length > 0) {
									$(reg.listapessoa).each(function(index,pessoa) {
										var trNovo = trClone.clone();
										trNovo.find('#tdNome').html(acromy(pessoa.pess_nm_pessoa,40));		
										trNovo.find('#tdCpfCnpj').html(formatarCPF(pessoa.pess_ds_cgccpf));
										trNovo.find('#tdDataNascimento').html(tranformarDataPadraoParaBr(pessoa.pess_dh_nascimento));
										trNovo.find('#tdDdd').html(pessoa.pcom_ds_ddd);
										trNovo.find('#tdTelefone').html(pessoa.pcom_ds_comunicacao);
										
										trNovo.bind('click',function() {
											abre(pessoa.id_pess_cd_pessoa, pessoa.pess_nm_pessoa);
										});
										
										$("#tabelaPessoa").append(trNovo);
									});
								}
							}
						}
					}
				});
			})
			.complete(function( jqXHR, textStatus ){
				$("#btnBuscar").bind('click' , buscarPessoa);
				$('#aguarde').css('visibility','hidden');
			});
			
			
		};
		
		limparJson = function(objeto) {
			
			if (objeto.lstApolices != null && objeto.lstApolices.length > 0 ) {
				$(objeto.lstApolices).each(function(index, apolice) {
					apolice.typeDesc = {};
					apolice.anyDesc = {};
					apolice.propertyDescriptors = {};
					apolice.fields = {};
				});
			}
			
			if (objeto.pessoa != null ) {
				
				objeto.pessoa.typeDesc = {};
				objeto.pessoa.anyDesc = {};
				objeto.pessoa.propertyDescriptors = {};
				objeto.pessoa.fields = {};
			}
			
			return objeto;
			
		};
		
		montaData = function() {

			var dataBusca = {};
			
			dataBusca.retorno = false;
			dataBusca.campos = {};
			
			dataBusca.campos.rdoFalorSombreSinistro = $("[name=rdoFalorSombreSinistro]:checked").val(); 
			dataBusca.campos.pessNmPessoa = $("#pessNmPessoa").val();
			dataBusca.campos.pessDhNascimento = $("#pessDhNascimento").val();
			dataBusca.campos.idChamCdChamado = $("#idChamCdChamado").val();
			dataBusca.campos.pcomDsDdd = $("#pcomDsDdd").val();
			dataBusca.campos.pcomDsTelefone = $("#pcomDsTelefone").val();
			dataBusca.campos.pessDsCgccpf = $("#pessDsCgccpf").val();
			dataBusca.campos.dataOcorrencia = $("#dataOcorrencia").val();
			dataBusca.campos.horaOcorrencia = $("#horaOcorrencia").val();
			dataBusca.campos.pcomDsComplemento = $("#pcomDsComplemento").val();
			dataBusca.campos.apol_Sucurcsal = $("#apol_Sucurcsal").val();
			dataBusca.campos.apol_Cia = $("#apol_Cia").val();
			dataBusca.campos.apol_Ramo = $("#apol_Ramo").val();
			dataBusca.campos.apol_Apolice = $("#apol_Apolice").val();
			dataBusca.campos.siasNrSinistro = $("#siasNrSinistro").val();
			
			dataBusca.retorno = true;

			return dataBusca;
		};
		
		montaDataClassificadorDeEmail = function() {
			
			var dataBusca = {};
			
			dataBusca.retorno = false;
			dataBusca.campos = {};
			
			dataBusca.campos.pessDsCgccpf = $("#pessDsCgccpf").val();
			
			if ($("#lupaNome").is(":checked")) {
				if ($.trim($("#pessNmPessoa").val()).length > 0) {
					dataBusca.campos.pessNmPessoa = $("#pessNmPessoa").val();
					dataBusca.retorno = true;
				}
			}
			
			if ($("#lupaDdd").is(":checked")) {
				if ($.trim($("#pcomDsDdd").val()).length > 0) {
					dataBusca.campos.pcomDsDdd = $("#pcomDsDdd").val();
					dataBusca.retorno = true;
				}
			}
			
			if ($("#lupaTelefone").is(":checked")) {
				if ($.trim($("#pcomDsTelefone").val()).length > 0) {
					dataBusca.campos.pcomDsTelefone = $("#pcomDsTelefone").val();
					dataBusca.retorno = true;
				}
			}
			
			if ($("#lupaCpf").is(":checked")) {
				if ($.trim($("#pessDsCgccpf").val()).length > 0) {
					dataBusca.campos.pessDsCgccpf = $("#pessDsCgccpf").val();
					dataBusca.retorno = true;
				}
			}
			
			if ($("#lupaEmail").is(":checked")) {
				if ($.trim($("#pcomDsComplemento").val()).length > 0) {
					dataBusca.campos.pcomDsComplemento = $("#pcomDsComplemento").val();
					dataBusca.retorno = true;
				}
			}
			
			return dataBusca;
			
		};
		
		
		//Botão não identificado
		naoIdentificado = function() {
			
			var nameOrigem = "pessoaForm";
			
			if( $('form' , wi.document) != null){
				nameOrigem = $('form' , wi.document).attr('name'); 
			}
			
			var returnValue = showModalDialog('../../csicrm/ShowPessCombo.do?tela=cmbTpPublicoNaoIdent&idEmprCdEmpresa=<%=(empresaVo!=null?String.valueOf(empresaVo.getIdEmprCdEmpresa()):"") %>&origem='+nameOrigem, wi, 'help:no;scroll:no;Status:NO;dialogWidth:300px;dialogHeight:160px,dialogTop:200px,dialogLeft:450px');
			
			if(navigator.appName=='Microsoft Internet Explorer'){
				if(returnValue != undefined && returnValue){
					self.close();
				}
			}
		};
		
		//Botão Ultima Pessoa Atendida
		ultimaAtendida = function() {
			wi.abrirUltimo();
			self.close();
		};
		
		//Botão Nova Pessoa
		adicionarNovo = function() {
			
			
			var classificador = 
				window.location.search.indexOf('classifEmail') >= 0 ? true : false ;
			
			var wi = (window.dialogArguments)?window.dialogArguments:window.opener;
				
			if (classificador == true) {
				
				var $formClass = window.dialogArguments.$('form');
				
				if ($.trim($formClass.find('[name=matmNmCliente]').val())  != ""){
					$("#pessNmPessoa").val($formClass.find('[name=matmNmCliente]').val());
				}
				
				if ( $.trim($("#pessNmPessoa").val())  == ""){
					alert ('O campo nome é obrigatório.');
					$("#pessNmPessoa").focus();
					return false;
				}

		        //Ajuste do Chamado: 89000 - para compatibilidade com Chrome/Firefox e IE
				
				wi.setNovaPessoa(true);
				
	    		$("#pessNmPessoa").val($formClass.find('[name=matmNmCliente]').val());
	    		$("#pcomDsDdd").val($formClass.find('[name=matmDsDddRes]').val());
	    		$("#pcomDsTelefone").val($formClass.find('[name=matmDsFoneRes]').val());
	    		$("#pessDsCgccpf").val($formClass.find('[name=matmNrCpf]').val());
	    		$("#pcomDsComplemento").val($formClass.find('[name=matmDsEmail]').val());

	    		$("#acao").val('salvarPessoaTelaClassificador');
	    		$('form').attr('action', '../../csicrm/ResultListIdentifica.do');
	    		$('form').submit();
			} else {
			
				var campos = new Array(2);
				var valores = new Array(2);

				campos[0] = 'pessNmPessoa';
				valores[0] = $('#pessNmPessoa').val();

				campos[1] = 'ddd';
				valores[1] = $('#pcomDsDdd').val(); 

				campos[2] = 'telefone';
				valores[2] = $('#pcomDsTelefone').val(); 

				wi.novo(campos, valores);
				self.close();
			}
		};
		
		//Botão Cancelar Pessoa
		$('#btnCancelar').bind('click', function() {
			$(':text').val('');
			$('[name=rdoFalorSombreSinistro][value=S]').prop('checked' , true);
		});
	
		
		habilitaDesabilitaLupa =  function(exibirLupa) {
			if (exibirLupa == true) {
				$("#divlupaCpf, #divlupaNome, #divlupaDdd, #divlupaTelefone, #divlupaEmail").css('display' , 'block');
				$("#divNome").removeClass('col-10');
				$("#divNome").addClass('col-8');
			} else {
				$("#divlupaCpf, #divlupaNome, #divlupaDdd, #divlupaTelefone, #divlupaEmail").css('display' , 'none');
				$("#divNome").removeClass('col-8');
				$("#divNome").addClass('col-10');
			}
		}; 
		
		//########################################################################################
		//############################## Configuração dos Controles ##############################
		//########################################################################################
		configurarControle = function() {
			
			$("#btnNaoIdentificado").bind('click' , naoIdentificado);
			$("#btnUltimaAtendida").bind('click' , ultimaAtendida);
			$("#btnBuscar").bind('click' , buscarPessoa);
			
			desativarBotao($("#btnNovo") , 'click');
			
			$("#pessNmPessoa").attr('maxlength', 80);
			
			$("#pessDhNascimento,#dataOcorrencia").attr('maxlength', 10);
			$("#pessDhNascimento,#dataOcorrencia").mask('99/99/9999');
			$("#pessDhNascimento,#dataOcorrencia").bind('blur' , function() {
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
			
			$("#idChamCdChamado").mask('0#');
			
			$("#pessDsCgccpf").attr('maxlength', 14);
			$("#pessDsCgccpf").mask('0#');
			
			$("#pessDsCgccpf").bind('focusin',function() {
				$(this).val($(this).val().replace(/[^\d]+/g,''));
			});
			
			$("#pessDsCgccpf").bind('blur',function() {
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
			
			document.getElementById('pessDsCgccpf').onpaste= function() {
				var $cpf = $(this);
				$("#pessDsCgccpf").attr('maxlength', 18);
				$("#pessDsCgccpf").unmask();
				
				setTimeout(function() {
					$cpf.focus();
				},100);
			};
			
			$("#pcomDsComplemento").attr('maxlength', 150);
			$("#pcomDsComplemento").bind('blur' ,function() {
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
			
			$("#pcomDsDdd").attr('maxlength', 3);
			$("#pcomDsDdd").mask('0#');
			
			$("#pcomDsTelefone").attr('maxlength', 8);
			$("#pcomDsTelefone").mask('0#');
			

			$("#horaOcorrencia").attr('maxlength', 5);
			$("#horaOcorrencia").mask('99:99');
			$("#horaOcorrencia").bind('blur', function() {
				
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

			$("#apol_Sucurcsal").attr('maxlength', 3);
			$("#apol_Sucurcsal").mask('0#');
			
			$("#apol_Cia").attr('maxlength', 3);
			$("#apol_Cia").mask('0#');
			
			$("#apol_Ramo").attr('maxlength', 4);
			$("#apol_Ramo").mask('0#');
			
			$("#apol_Apolice").attr('maxlength', 6);
			$("#apol_Apolice").mask('0#');
			
			$("input").bind('keypress', function(event){
				if (event.which == 13 ) {
					buscarPessoa();
					event.preventDefault();
					event.stopPropagation();
				}
			});
		};
		
//		validarHora = function(campoTexto) {
//			var matchhora = new RegExp(/^([0-1]\d|2[0-3]):[0-5]\d$/);
//					
//			if (campoTexto.val() == '') {
//				return false;
//			}
//					
//			if (!campoTexto.val().match(matchhora)) {
//				alert('Hora inválida');
//				campoTexto.val('');
//				campoTexto.focus();
//				return false;
//			}
//					
//		};
		
		//Kernel
		
		abrirTela = function() {
			//Alexandre Mendonca / Chamado 68485
			//quando é chamada a tela de identificacao por retorno de correspondencia não pode exister a opção Chamado
			
			var wiParent = (window.dialogArguments)?window.dialogArguments:window.opener;
			
			habilitaDesabilitaLupa(false);
			
			if(CONS_CORIGEM == 'R'){
				desativarBotao($("#idChamCdChamado"), 'click');
			}
			
			$("#pessNmPessoa").focus();
			
			if (CONS_PESSOA == 'nome') {
//				$("#pessNmPessoa").val(  $('form', wiParent.document).find('[name=pessNmPessoa]').val());
			}	
	
			$("#pessNmPessoa").focus();
			
			if (CONS_CLASSIFEMAIL != 'null') {
				
				habilitaDesabilitaLupa(true);
				
				$("#pessNmPessoa").val(wiParent.$("[name=matmNmCliente]").val());
				$("#pessDsCgccpf").val(wiParent.$("[name=matmNrCpf]").val());
				$("#pcomDsComplemento").val(wiParent.$("[name=matmDsEmail]").val());
				
				if(wiParent.$("[name=lupaFoneRes]").is(":checked") &&  $.trim(wiParent.$("[name=matmDsFoneRes]").val()).length > 0){
					$("#pcomDsTelefone").val(wiParent.$("[name=matmDsFoneRes]").val());
				}else if(wiParent.$("[name=lupaFoneCom]").is(":checked") &&  $.trim(wiParent.$("[name=matmDsFoneCom]").val()).length > 0){
					$("#pcomDsTelefone").val(wiParent.$("[name=matmDsFoneCom]").val());
				}else if(wiParent.$("[name=lupaFoneCel]").is(":checked") &&  $.trim(wiParent.$("[name=matmDsFoneCel]").val()).length > 0){
					$("#pcomDsTelefone").val(wiParent.$("[name=matmDsFoneCel]").val());
				}

				if(wiParent.$("[name=lupaDddRes]").is(":checked") &&  $.trim(wiParent.$("[name=matmDsDddRes]").val()).length > 0){
					$("#pcomDsDdd").val(wiParent.$("[name=matmDsDddRes]").val());
				}else if(wiParent.$("[name=lupaDddCom]").is(":checked") &&  $.trim(wiParent.$("[name=matmDsDddCom]").val()).length > 0){
					$("#pcomDsDdd").val(wiParent.$("[name=matmDsDddCom]").val());
				}else if(wiParent.$("[name=lupaDddCel]").is(":checked") &&  $.trim(wiParent.$("[name=matmDsDddCel]").val()).length > 0){
					$("#pcomDsDdd").val(wiParent.$("[name=matmDsDddCel]").val());
				}
				
				var paramArray = CONS_CLASSIFEMAIL.split(';');
				for (var i = 0; i < paramArray.length; i++) {
					if (paramArray[i] == 'matmNrCpf'){
						$("#lupaCpf").prop('checked', true);
					}else if (paramArray[i] == 'matmNmCliente'){
						$("#lupaNome").prop('checked', true);
					}else if (paramArray[i] == 'matmDsEmail'){
						$("#lupaEmail").prop('checked', true);
					}else if (paramArray[i] == 'matmDsFoneRes' || paramArray[i] == 'matmDsFoneCom' || paramArray[i] == 'matmDsFoneCel'){
						$("#lupaTelefone").prop('checked', true);
					}else if (paramArray[i] == 'matmDsDddRes' || paramArray[i] == 'matmDsDddCom' || paramArray[i] == 'matmDsDddCel'){
						$("#lupaDdd").prop('checked', true);
					}
				}

				if ($("#lupaCpf").is(':checked') 
						|| $("#lupaNome").is(':checked') 
						|| $("#lupaEmail").is(':checked') 
						|| $("#lupaTelefone").is(':checked')
						|| $("#lupaDdd").is(':checked'))
					buscarPessoa();
			}
			
			if (CONS_EVADVERSO != 'null') {
				try{
					window.top.principal = window.dialogArguments.window.dialogArguments.window.top.principal;
					window.top.ifrmPermissao = window.dialogArguments.window.dialogArguments.window.top.ifrmPermissao;
					pessoaForm = window.dialogArguments.window.dialogArguments.window.top.principal.pessoa.dadosPessoa.pessoaForm;
						
					document.all("btnNovo").onclick = function(){
						url = 'DadosContato.do?idPessCdPessoaPrinc=' + window.dialogArguments.farmacoForm.idPessCdPessoa.value + '&pessNmPessoa=' + identificaForm.pessNmPessoa.value;
						showModalDialog(url, window, 'help:no;scroll:no;Status:NO;dialogWidth:860px;dialogHeight:670px,dialogTop:0px,dialogLeft:10px');
					};
				}catch(e){
					desativarBotao($("#btnNovo"), 'click');
				}
				
				desativarBotao($("#btnNaoIdentificado"), 'click');
				desativarBotao($("#btnUltimaAtendida"), 'click');
			}
			
			//identifica a tela que chamado a p?gina de identifica??o e disabilita alguns comandos
			if (CONS_CORRESP == 'corresp') {
				//identificaForm.BCorp.disabled = true;
				desativarBotao($("#btnNaoIdentificado"), 'click');
				desativarBotao($("#btnUltimaAtendida"), 'click');
				desativarBotao($("#btnNovo"), 'click');
			}

			getCamposChat();
		};
		
		getCamposChat = function() {
			if(CONS_CAMPOSCHAT == 'S') {
				var nomeChat = CONS_NOME;
				if(nomeChat!='' && nomeChat!='null') 
					$("#pessNmPessoa").val(nomeChat);

				var telefoneChat = CONS_TELEFONE;
				if(telefoneChat!='' && telefoneChat!='null') 
					$("#pcomDsTelefone").val(telefoneChat);

				var emailChat = CONS_EMAIL;
				if(emailChat!='' && emailChat!='null') 
					$("#pcomDsComplemento").val(emailChat);

				var dddChat = CONS_DDD;
				if(dddChat!='' && dddChat!='null') 
					$("#pcomDsDdd").val(dddChat);

				var cpfChat = CONS_CPFCNPJ;
				if(cpfChat!='' && cpfChat!='null') 
					$("#pessDsCgccpf").val(cpfChat);
			}
		};
		
		abre = function(idPessCdPessoa, pessNmPessoa, pessCdCorporativo, objeto) {
			wi = (window.dialogArguments)?window.dialogArguments:window.opener;

			if(pessCdCorporativo==undefined || pessCdCorporativo=='') {
			
				var divDinamico = $("#divDinamico" , wi.top.superior.document); 
				if (divDinamico.find("#hidFalorSombreSinistro") == null || divDinamico.find("#hidFalorSombreSinistro").length == 0 ) {
					var hidFalorSombreSinistro = $('<input type="hidden" id="hidFalorSombreSinistro">').val($("[name=rdoFalorSombreSinistro]:checked").val());
					divDinamico.get(0).insertAdjacentHTML("BeforeEnd", hidFalorSombreSinistro.get(0).outerHTML);	
				} else {
					divDinamico.find("#hidFalorSombreSinistro").val($("[name=rdoFalorSombreSinistro]:checked").val());
				}
				
				wi.document.forms[0]['csCdtbPessoaespecPeesVo.campoAux6'].value = $("[name=rdoFalorSombreSinistro]:checked").val();
				wi.abrir(idPessCdPessoa, pessNmPessoa);
				
			} else {
				wi.abrirCorporativo('', '', pessCdCorporativo);
			}
			
			self.close();
		};
		
		abreMr = function(id, nome){
			abre(id, nome);
		};

		abreCorresp = function(id, nome){
			abre(id, nome);
		};

		abreNI = function (){
			wi = (window.dialogArguments)?window.dialogArguments:window.opener;
			
			var nameOrigem = "pessoaForm";
			
			if(wi.document.forms[0] != undefined){
				nameOrigem = wi.document.forms[0].name; 
			}
			
			var returnValue = showModalDialog('../../csicrm/ShowPessCombo.do?tela=cmbTpPublicoNaoIdent&idEmprCdEmpresa=<%=(empresaVo!=null?String.valueOf(empresaVo.getIdEmprCdEmpresa()):"") %>&origem='+nameOrigem, wi, 'help:no;scroll:no;Status:NO;dialogWidth:300px;dialogHeight:160px,dialogTop:200px,dialogLeft:450px');
			
			if(navigator.appName=='Microsoft Internet Explorer'){
				if(returnValue != undefined && returnValue){
					self.close();
				}
			}
		};

		//Ajuste do Chamado: 89000 - para compatibilidade com Chrome/Firefox e IE
		abrirNI = function(id, naoIdent){
			wi = (window.dialogArguments)?window.dialogArguments:window.opener;

			var nameOrigem = "pessoaForm";
			
			if(wi.document.forms[0] != undefined){
				nameOrigem = wi.document.forms[0].name; 
			}
			
			if(nameOrigem == "pessoaForm"){
				wi.abrirNI(id, naoIdent);
			}
			else{
				wi.abrirContatoNI(id);
			}
			
			self.close();
		};
		
		abreUltimo = function (){
			wi = (window.dialogArguments)?window.dialogArguments:window.opener;
			wi.abrirUltimo();
			self.close();
		};
		
		desativarBotao = function(botao, eventoARemover){
			
			botao.attr('disabled' , true);
			botao.css('className' , 'desabilitado');
			
			if ($.trim(eventoARemover).length > 0 ) {
				botao.unbind(eventoARemover);	
			}
		};
		
		
		ativarBotao = function(botao, classe, eventoARemover, funcao){
			
			botao.attr('disabled' , false);
			botao.css('className' , classe);
			
			if ($.trim(eventoARemover).length > 0 ) {
				botao.bind(eventoARemover, funcao);	
			}
		};
		
		init = function() {
			configurarControle();
			abrirTela();
		};
		
		limparTabela = function() {
			var linhas = $("#tabelaPessoa").find('tr');
			linhas.each(function(index, linha){
				if (index > 0) {
					$(linha).remove();
				}
			});
		};
		
		init();
		
	});
})(jQuery);