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
					//verificar se o ramo da apolice est� em algum dos grupos de ramos
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
						$("#hidDataOcorrencia").val(rowAdd.data('dataOcorrenciaIdentificacao'));
						$("#hidHoraOcorrencia").val(rowAdd.data('horaOcorrenciaIdentificacao'));
						showModalDialog('AbrirIncluirSinistro.do', window, 'help:no;scroll:no;Status:NO;dialogWidth:850px;dialogHeight:570px;dialogTop:90px;dialogLeft:150px');		
					} else {
						alert('Ramo n�o pertencente � permiss�o de abertura de aviso de sinistro');
					}
				}
			} catch (e) {}
			
		};
		
		carregarApolices = function() {
			
			//Carregar a tabela temporaria usada para armazenar as informa��es de apolices
			$.ajax({
				url : '/csiweb-bradescore/crm/CarregarListaApoliceTemporaria.do',
				data : {},
				type : 'POST',
				dataType : 'json',
				beforeSend : function(jqXHR) {
					$('#aguarde').css('visibility','visible');	
				}
			}).error(function(data, textStatus, erro) {	
				alert('ERRO AO EXECUTAR O SERVI�O DE LISTA DE AP�LICE TEMPOR�RIA\nM�todo: "carregarListaApoliceTemporaria"\nDescri��o: ' + erro);
			}).success(function(data, textStatus, jqXHR) {
				
				if (data != null && data.length > 0) {
					
					var $lstApolices = data[0].ltaa_tx_jsonapolices;
					
					if ($lstApolices != null && $lstApolices.length > 0) {
						var objetoLista = $.parseJSON($lstApolices);

						if (objetoLista != null && objetoLista.lstApolices != null && objetoLista.lstApolices.length > 0) {
							$("#trNenhumRegistroClone").hide();
							
							$(objetoLista.lstApolices).each(function(index, apolice) {
								var rowAdd = $trClone.clone();
								
								rowAdd.data('objeto' , apolice);
								rowAdd.data('dataOcorrenciaIdentificacao', data[0].ltaa_ds_dataocorrencia); 
								rowAdd.data('horaOcorrenciaIdentificacao', data[0].ltaa_ds_horaocorrencia);
							
								var comporNumeroApolice = apolice.codigoSucursal ;
								comporNumeroApolice += "." + apolice.codigoRamo ;
								comporNumeroApolice += "." + apolice.codigoCia ;
								comporNumeroApolice += "." + apolice.numeroApolice ;
								
								rowAdd.find('#tdApolice').html(acromy(comporNumeroApolice, 17));
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
				}
				
			}).complete(function( jqXHR, textStatus ){
				$('#aguarde').css('visibility','hidden');
			});
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
					alert('N�o foi encontrado nenhum grupo de ramos cadastrado no m�dulo de administra��o.\n'
							+ 'Por gentileza solicite a configura��o.\n' 
							+ 'Por seguran�a ser� desabilitado o bot�o de "Incluir Comunicado de Sinistro"');
					$("#btnIncluirComunicado").hide();
				}
			}).error(function(data, textStatus, erro) {	
				alert('ERRO AO CONSULTAR O SERVI�O DE RAMOS\nM�todo: "carregarGrupoRamos"\nDescri��o: ' + erro);
			}).complete(function( jqXHR, textStatus ){
				$('#aguarde').css('visibility','hidden');
				carregarApolices();
			});
		};
		
		setObjGrupoRamos = function(objGrupo) {
			$("#hidGrupoRamos").val(JSON.stringify(objGrupo)); 
		};
		
		init = function() {
			carregarGrupoRamos();
			desabilitarBotao('btnIncluirComunicado');
			selecionarAbaApolice();
			
		};
		
		function selecionarAbaApolice() {
			
			var divDinamico = jQuery("#divDinamico" , window.top.superior.document);
			
			if (divDinamico.find("#hidFalorSombreSinistro") != null || divDinamico.find("#hidFalorSombreSinistro").length > 0 ) {
				if (divDinamico.find("#hidFalorSombreSinistro").val() == 'A') {
			   		
			   		for(i = 0; i < parent.numAbasDinamicas; i++){
						try {
							var obj = parent.document.getElementById('aba' + i);
							if(eval('obj.document.ifrm' + i ).name == 'apolice') {
								parent.document.getElementById("aba"+ i).click();
								break;
							}
						} catch(e){}		
					}
			   		
				}
			}
		}
		
		init();
		
	});
})(jQuery);