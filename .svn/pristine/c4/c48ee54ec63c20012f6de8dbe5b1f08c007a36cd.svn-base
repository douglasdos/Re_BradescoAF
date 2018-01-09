(function($){
	var permiteAbrirConsulta = true;
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
		
		carregarSinistros = function() {
			
			var dataEntrada = {};
			dataEntrada.idPessCdPessoa = $("#idPessCdPessoa").val();
			
			$.ajax({
				url : '/csiweb-bradescore/crm/CarregarSinistros.do',
				data : dataEntrada,
				type : 'POST',
				dataType : 'json',
				beforeSend : function(jqXHR) {
					$('#aguarde').css('visibility','visible');	
				}
			}).success(function(data, textStatus, jqXHR) {
				if (data != null && data.length > 0) {
					$("#trNenhumRegistroClone").hide();
					
					$(data).each(function(index, sinistro){
						
						var rowAdd = $trClone.clone();
						
						rowAdd.data('objeto' , sinistro);
						
						adicionarColuna(rowAdd, '#tdNumeroSinistro', sinistro.pesr_nr_sinistro , 12);
						adicionarColuna(rowAdd, '#tdSurcusal', sinistro.pesr_ds_sucursal , 10);
						adicionarColuna(rowAdd, '#tdRamo', sinistro.pesr_ds_ramo , 7);
						adicionarColuna(rowAdd, '#tdCia', sinistro.pesr_ds_cia , 7);
						adicionarColuna(rowAdd, '#tdApolice', sinistro.pesr_ds_apolice , 7);
						adicionarColuna(rowAdd, '#tdDataSinistro', tranformarDataHoraPadraoParaBr(sinistro.pesr_dh_sinistro) , 16);
						adicionarColuna(rowAdd, '#tdNatureza', sinistro.pesr_ds_natureza , 10);
						adicionarColuna(rowAdd, '#tdProduto', sinistro.pesr_ds_produto , 10);
						adicionarColuna(rowAdd, '#tdStatus', sinistro.pesr_ds_status , 10);
						
						if (sinistro.pesr_ds_status == 'PENDENTE') {
							rowAdd.find("#imgLinha").attr('src', '/plusoft-resources/images/botoes/editar.gif');	
						} else if (sinistro.pesr_ds_status == 'COMPLETO') {
							rowAdd.find("#imgLinha").attr('src', '../resources/assets/imgs/lupa.gif');
						}
						
						rowAdd.find('#btnPesquisar').bind('click',function(){
							
							if (permiteAbrirConsulta == false) {
								alert('Não foi encontrado nenhum grupo de ramos cadastrado no módulo de administração.\n'
										+ 'Por gentileza solicite a configuração.\n' 
										+ 'Por segurança será desabilitado a funcionalidade de "Consultar Sinistro"');
								return false;
							}
							
							var objeto = $(this).parents('tr').data('objeto');
							var objetoGravado = JSON.parse(objeto.pesr_tx_json);
							$("#hidApoliceSelecionada").val(JSON.stringify(objetoGravado.apolice));
							$("#hidSinistroGravado").val(objeto.pesr_tx_json);
							$("#hidStatusSinistroGravado").val(objeto.pesr_ds_status);
							$("#pesrNrSequencia").val(objeto.pesr_nr_sequencia);
							
							$('[name="csCdtbPessoaespecPeesVo.campoAux4"]' ,window.top.principal.pessoa.dadosPessoa.document).val(objetoGravado.comunicado.dataOcorrenciaIdentificacao);
							$('[name="csCdtbPessoaespecPeesVo.campoAux5"]' ,window.top.principal.pessoa.dadosPessoa.document).val(objetoGravado.comunicado.horaOcorrenciaIdentificacao);
							
							showModalDialog('AbrirIncluirSinistro.do', window, 'help:no;scroll:no;Status:NO;dialogWidth:850px;dialogHeight:570px;dialogTop:90px;dialogLeft:150px');
						});
						
						$("#tabelaSinistro").append(rowAdd);
					});
				}
			}).error(function(data, textStatus, erro) {	
				alert('ERRO AO CONSULTAR O SERVIÇO DE CONSULTAR SINISTRO\nMétodo: "carregarSinistros"\nDescrição: ' + erro);
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
						permiteAbrirConsulta = false;
					} else {
						setObjGrupoRamos(data);	
					}
				} else {
					alert('Não foi encontrado nenhum grupo de ramos cadastrado no módulo de administração.\n'
							+ 'Por gentileza solicite a configuração.\n' 
							+ 'Por segurança será desabilitado a funcionalidade de "Consultar Sinistro"');
					permiteAbrirConsulta = false;
				}
			}).error(function(data, textStatus, erro) {	
				alert('ERRO AO CONSULTAR O SERVIÇO DE RAMOS\nMétodo: "carregarGrupoRamos"\nDescrição: ' + erro);
				permiteAbrirConsulta = false;
			}).complete(function( jqXHR, textStatus ){
				$('#aguarde').css('visibility','hidden');
			});
		};
		
		setObjGrupoRamos = function(objGrupo) {
			$("#hidGrupoRamos").val(JSON.stringify(objGrupo)); 
		};
		
		init = function() {
			carregarGrupoRamos();
			carregarSinistros();
		};
		
		init();
		
	});
})(jQuery);