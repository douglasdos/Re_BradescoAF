(function($){
	
	$(document).ready(function(){

		var $trClone = $("#trClone").clone();
		$trClone.show();
		
		desabilitarBotao = function(nomeBotao) {
			$("#" + nomeBotao).off('click');
			$("#" + nomeBotao).removeClass();
			$("#" + nomeBotao).addClass('transparent geralImgDisable');
			$("#" + nomeBotao).attr('alt', '');
			$("#" + nomeBotao).attr('title', '');
		};
		
		habilitarBotao = function(nomeBotao, funcao , tooltip) {
			$("#" + nomeBotao).off('click');
			$("#" + nomeBotao).bind('click' , function(event) {
				event.stopPropagation();
				funcao();
			});
			$("#" + nomeBotao).removeClass();
			$("#" + nomeBotao).addClass('transparent geralCursoHand');
			$("#" + nomeBotao).attr('alt', tooltip);
			$("#" + nomeBotao).attr('title', tooltip);
		};
		
		funcIncluirComunicado = function() {
			
			try {
				var apolice = $("#rdoSelecionar:checked").parents('tr').data('objeto');
				var objGrupoRamos = JSON.parse($("#hidGrupoRamos").val());
				if ( apolice != null ) {
					var bPodeAbrirLink = false;
					//verificar se o ramo da apolice está em algum dos grupos de ramos
					if (objGrupoRamos != null && objGrupoRamos.length > 0) {
						//Procurar no Ramo 1
						if (objGrupoRamos[0].grupo1 != null && objGrupoRamos[0].grupo1.length > 0) {
							for ( var i = 0; i < objGrupoRamos[0].grupo1.length; i++) {
								var ramo = objGrupoRamos[0].grupo1[i];
								if (ramo.retaCdCorporativo.toString() == apolice.codigoRamo.toString()) {
									bPodeAbrirLink = true;
								}
							}	
						}
						
						//Procurar no Ramo 2
						if (objGrupoRamos[0].grupo2 != null && objGrupoRamos[0].grupo2.length > 0) {
							for ( var i = 0; i < objGrupoRamos[0].grupo2.length; i++) {
								var ramo = objGrupoRamos[0].grupo2[i];
								if (ramo.retaCdCorporativo.toString() == apolice.codigoRamo.toString()) {
									bPodeAbrirLink = true;
								}
							}	
						}
						
						//Procurar no Ramo 3
						if (objGrupoRamos[0].grupo3 != null && objGrupoRamos[0].grupo3.length > 0) {
							for ( var i = 0; i < objGrupoRamos[0].grupo3.length; i++) {
								var ramo = objGrupoRamos[0].grupo3[i];
								if (ramo.retaCdCorporativo.toString() == apolice.codigoRamo.toString()) {
									bPodeAbrirLink = true;
								}
							}	
						}
						
						//Procurar no Ramo 4
						if (objGrupoRamos[0].grupo4 != null && objGrupoRamos[0].grupo4.length > 0) {
							for ( var i = 0; i < objGrupoRamos[0].grupo4.length; i++) {
								var ramo = objGrupoRamos[0].grupo4[i];
								if (ramo.retaCdCorporativo.toString() == apolice.codigoRamo.toString()) {
									bPodeAbrirLink = true;
								}
							}	
						}
					}
					
					if (bPodeAbrirLink == true) {
						var rowAdd = $("#rdoSelecionar:checked").parents('tr');
						$('[name="csCdtbPessoaespecPeesVo.campoAux4"]' ,window.top.principal.pessoa.dadosPessoa.document).val(rowAdd.data('dataOcorrenciaIdentificacao')); 
						$('[name="csCdtbPessoaespecPeesVo.campoAux5"]' ,window.top.principal.pessoa.dadosPessoa.document).val(rowAdd.data('horaOcorrenciaIdentificacao'));
						showModalDialog('AbrirIncluirSinistro.do', window, 'help:no;scroll:no;Status:NO;dialogWidth:850px;dialogHeight:570px;dialogTop:90px;dialogLeft:150px');		
					} else {
						alert('Ramo não pertencente à permissão de abertura de aviso de sinistro');
					}
				}
			} catch (e) {}
			
		};
		
		carregarApolices = function() {
			
			var $lstApolices = $('[name="csCdtbPessoaespecPeesVo.campoAux7"]' ,window.top.principal.pessoa.dadosPessoa.document).val();
			
			if ($lstApolices != null && $lstApolices.length > 0) {
				var objetoLista = $.parseJSON($lstApolices);
				if (objetoLista != null && objetoLista.lstApolices != null && objetoLista.lstApolices.length > 0) {
					$("#trNenhumRegistroClone").hide();
					
					$(objetoLista.lstApolices).each(function(index, apolice) {
						var rowAdd = $trClone.clone();
						
						rowAdd.data('objeto' , apolice);
						rowAdd.data('dataOcorrenciaIdentificacao', $('[name="csCdtbPessoaespecPeesVo.campoAux4"]' ,window.top.principal.pessoa.dadosPessoa.document).val()); 
						rowAdd.data('horaOcorrenciaIdentificacao', $('[name="csCdtbPessoaespecPeesVo.campoAux5"]' ,window.top.principal.pessoa.dadosPessoa.document).val());
					
						
						rowAdd.find('#tdApolice').html(acromy(apolice.numeroApolice, 10));
						rowAdd.find('#tdDescricao').html(acromy(apolice.descricaoProduto,18));
						rowAdd.find('#tdNome').html(acromy(apolice.nomeSegurado,17));
						rowAdd.find('#tdDataInicio').html(acromy(apolice.dataInicioVigencia,10));
						rowAdd.find('#tdDataFinal').html(acromy(apolice.dataFimVigencia,10));
						
						rowAdd.bind('click',function() {
							$(this).find('#rdoSelecionar').prop('checked' , true);
							habilitarBotao( 'btnIncluirComunicado', funcIncluirComunicado , 'Incluir Comunicado de Sinistro');
							$("#hidApoliceSelecionada").val(JSON.stringify($(this).data('objeto')));
						});

						$("#tabelaApolice").append(rowAdd);
						
					});
				}
			}
		};
		
		carregarGrupoRamos = function(cmbRelacao) {
			
			$.ajax({
				url : '/csiweb-bradescore/crm/CarregarGrupoRamos.do',
				data : {},
				type : 'POST',
				dataType : 'json',
				beforeSend : function(jqXHR) {
					$('#aguarde').css('visibility','visible');	
				}
			}).success(function(data, textStatus, jqXHR) {
				if (data != null && data.length > 0) {
					if (data[0].retorno == false) {
						alert(data[0].mensagem);
						$("#btnIncluirComunicado").hide();
					} else {
						setObjGrupoRamos(data);	
					}
				} else {
					alert('Não foi encontrado nenhum grupo de ramos cadastrado no módulo de administração.\n'
							+ 'Por gentileza solicite a configuração.\n' 
							+ 'Por segurança será desabilitado o botão de "Incluir Comunicado de Sinistro"');
					$("#btnIncluirComunicado").hide();
				}
			}).error(function(data, textStatus, erro) {	
				alert('ERRO AO CONSULTAR O SERVIÇO DE RAMOS\nMétodo: "carregarGrupoRamos"\nDescrição: ' + erro);
			}).complete(function( jqXHR, textStatus ){
				$('#aguarde').css('visibility','hidden');
			});
		};
		
		setObjGrupoRamos = function(objGrupo) {
			$("#hidGrupoRamos").val(JSON.stringify(objGrupo)); 
		};
		
		init = function() {
			carregarGrupoRamos();
			desabilitarBotao('btnIncluirComunicado');
			carregarApolices();
			
		};
		
		init();
		
	});
})(jQuery);