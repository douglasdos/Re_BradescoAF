<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<% 
	response.setContentType("text/html");
	response.setHeader("Pragma","No-cache");
	response.setDateHeader("Expires",0);
	response.setHeader("Cache-Control","no-cache");
%>


<!DOCTYPE html>
<html class="popup">
<head>
	<meta http-equiv="X-UA-Compatible" content="IE=8" />
    <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />

	<title>Comunicado de Abertura de Sinistro</title>
	<link rel="stylesheet" href="aberturaSinistro/style/ps.css">
	<link rel="stylesheet" href="aberturaSinistro/style/popupAberturaSinistro.css">
	<link rel="stylesheet" href="/plusoft-resources/css/global.css" type="text/css">
	<script src="../resources/commons/script/html5shiv.js"></script>
</head>
<body>	
	<form class="tabs">
		<input type="hidden" id="hidObterApolice"> 
		<input type="hidden" id="pesrNrSequencia">
		<input type="hidden" id="anoAtual">
		<input type="hidden" id="dataAtual">
		
		<fieldset>
			<legend id="labelSinistro"></legend>			
			<div class="line">
				<label for="txtNomeContato" class="col-3">Contato</label>
				<input type="text" name="txtNomeContato" id="txtNomeContato" class="col-4">

				<label for="dddContato" class="col-3">Telefone</label>
				<input type="text" name="dddContato" id="dddContato" class="col-1" >
				<input type="text" name="telefoneContato" id="telefoneContato" class="col-3">

				<label for="cmbTipoRelacao" class="col-4">Tipo de Relação</label>
				<select name="cmbTipoRelacao" id="cmbTipoRelacao" class="col-6"></select>
			</div>
			<div class="line">
				<label for="txtApolice" class="col-3">Apólice</label>
				<input type="text" name="txtApolice" id="txtApolice" class="col-4" >
<!-- 				934-926-0531-002314 -->

				<label for="codigoCorretor" class="col-3">Cód. Corretor</label>
				<input type="text" name="codigoCorretor" id="codigoCorretor" class="col-4">

				<label for="numeroSinistro" class="col-4">Núm. Aviso de Sinistro</label>
				<input type="text" name="numeroSinistro" id="numeroSinistro" class="col-6">
			</div>
			<div class="line">
				<label for="txtStatus" class="col-3" >Status</label>
				<input type="text" name="txtStatus" id="txtStatus" class="col-4">

				<label for="txtNomeCorretor" class="col-3">Corretor</label>
				<input type="text" name="txtNomeCorretor" id="txtNomeCorretor" class="col-14">
			</div>
			<div class="line">
				<label for="txtNomeSegurado" class="col-3">Nome Segurado</label>
				<input type="text" name="txtNomeSegurado" id="txtNomeSegurado" class="col-12">
			</div>
			<nav>
				<ul data-tabs>
					<li><a class="tab-active" data-target="sinistro">Sinistro</a></li>
					<li><a data-target="equipamentos">Equipamentos</a></li>
					<li><a data-target="detalheBemSinistrado">Detalhe Bem Sinistrado</a></li>
					<li><a data-target="responsavel">Responsável</a></li>
					<li><a data-target="outrosEnvolvidos">Outros Envolvidos</a></li>
				</ul>
			</nav>
			<div class="shadow">
				<div id="sinistro" data-content>
					<div class="line">
						 <div class="col-9">
							<label for="chkEnderecoNaoCorreto">
							<input type="checkbox" name="chkEnderecoNaoCorreto" id="chkEnderecoNaoCorreto">
							O Endereço do Local do Sinistro não está correto.</label>
						</div>
						<label for="cmbCausa" class="col-2">Causa</label>
						<select name="cmbCausa" id="cmbCausa" class="col-13"></select>
					</div>
					<div class="line">
						<label for="txtSinData" class="col-3">Data</label>
						<input type="text" name="txtSinData" id="txtSinData" class="col-3">
						<span class="col-1">
							<button type="button" class="transparent" title="Calendário" id="btnSinCalendario">
								<img src="../resources/assets/imgs/calendar.gif" alt="Calendário">
							</button>
						</span>

						<label for="cmbNatureza" class="col-4">Natureza</label>
						<select name="cmbNatureza" id="cmbNatureza" class="col-13 "></select>
					</div>
					<div class="line">
						<label for="txtSinHora" class="col-3">Hora</label>
						<input type="text" name="txtSinHora" id="txtSinHora" class="col-3">						
					</div>
					<div class="line">
						<label for="txtSinCep" class="col-3">CEP</label>
						<input type="text" name="txtSinCep" id="txtSinCep" class="col-3">
						<span class="col-1">
							<button type="button" id="btnSinLupa" class="transparent " title="Pesquisar">
								<img src="../resources/assets/imgs/lupa.gif" alt="Pesquisar">
							</button>
						</span>
					</div>
					<div class="line">
						<label for="txtSinEndereco" class="col-3">Endereço</label>
						<input type="text" name="txtSinEndereco" id="txtSinEndereco" class="col-5">						
					</div>
					<div class="line">
						<label for="txtSinNumero" class="col-3">Número</label>
						<input type="text" name="txtSinNumero" id="txtSinNumero" class="col-3">
					</div>
					<div class="line">
						<label for="txtSinComplemento" class="col-3">Complemento</label>
						<input type="text" name="txtSinComplemento" id="txtSinComplemento" class="col-5">
					</div>
					<div class="line">
						<label for="cmbSinUf" class="col-3">UF</label>
						<select name="cmbSinUf" id="cmbSinUf" class="col-2"></select>
					</div>
					<div class="line">
						<label for="cmbSinCidade" class="col-3">Cidade</label>
						<select name="cmbSinCidade" id="cmbSinCidade" class="col-5"></select>
						<input type="text" name="txtSinCidadeBusca" id="txtSinCidadeBusca" style="display: none;" class="col-4">
						
						<div class="col-4"> 
								<button id="btnPesquisarSinistro" class="transparent btnCalendario" title="Pesquisar" type="button">
									<img src="../resources/assets/imgs/lupa.gif" height="15" width="15" alt="Pesquisar" id="imgBtnPesquisar">
								</button>
								
								<button id="btnCancelarSinistro" class="transparent btnCalendario" title="Cancelar" style="display: none;" type="button">
									<img src="../resources/assets/imgs/cancelar.gif" height="15" width="15" alt="Cancelar">
								</button>
						</div>
						
					</div>
					<div class="line">
						<label for="txtSinBairro" class="col-3">Bairro</label>
						<input type="text" name="txtSinBairro" id="txtSinBairro" class="col-5">
					</div>
					<div class="line">
						<fieldset class="fieldsetDescricaoDoSinistro" style="margin-left: 305px !important;">
							<legend>Descrição do Sinistro</legend>
							<div class="line">
								<textarea name="txtaSinDescricao" id="txtaSinDescricao" cols="30" rows="4" class="col-24"></textarea>
							</div>
						</fieldset>
					</div>
					<div class="line">
						<fieldset class="fieldsetTipo col-24">
							<legend>Tipo</legend>
							<div class="line">
								<label for="chkHouveCorpoBombeiro" class="">
									<input type="checkbox" name="chkHouveCorpoBombeiro" id="chkHouveCorpoBombeiro">
									Houve participação do Corpo de Bombeiros
								</label>
								<label for="chkMoradiaHabitavel" class="">
									<input type="checkbox" name="chkMoradiaHabitavel" id="chkMoradiaHabitavel">
									Moradia ficou habitável
								</label>
								<label for="chkProvidencioBO" class="">
									<input type="checkbox" name="chkProvidencioBO" id="chkProvidencioBO">
									Providenciou o Boletim de Ocorrência
								</label>
							</div>
						</fieldset>
					</div>
				</div>
				<div id="equipamentos" data-content style="display: none">
					<div class="line">
						<fieldset>
							<legend>Equipamentos</legend>
							<div class="line">
								<label for="txtEquiItem" class="col-4">Item</label>
								<input type="text" name="txtEquiItem" id="txtEquiItem" class="col-2">

								<label for="txtEquiNome" class="col-8">Nome</label>
								<input type="text" name="txtEquiNome" id="txtEquiNome" class="col-10">
							</div>
							<div class="line">
								<label for="txtEquiNumeroSerie" class="col-4">Número Série</label>
								<input type="text" name="txtEquiNumeroSerie" id="txtEquiNumeroSerie" class="col-4">

								<label for="txtEquiMarca" class="col-6">Marca</label>
								<input type="text" name="txtEquiMarca" id="txtEquiMarca" class="col-10">
							</div>
							<div class="line">
								<label for="txtEquiAnoFabricacao" class="col-4">Ano Fabricação</label>
								<input type="text" name="txtEquiAnoFabricacao" id="txtEquiAnoFabricacao" class="col-2">

								<label for="txtEquiModelo" class="col-8">Modelo</label>
								<input type="text" name="txtEquiModelo" id="txtEquiModelo" class="col-10">
							</div>
							<div class="line">
								<label for="txtEquiQtde" class="col-4">Quantidade</label>
								<input type="text" name="txtEquiQtde" id="txtEquiQtde" class="col-2">

								<label for="txtEquiValorEstimado" class="col-8">Valor Estimado dos Danos</label>
								<input type="text" name="txtEquiValorEstimado" id="txtEquiValorEstimado" class="col-2 ">
							</div>
							<div class="line">
								<label for="txtEquiValorDano" class="col-4">Valor do Dano</label>
								<input type="text" name="txtEquiValorDano" id="txtEquiValorDano" class="col-3">
							</div>
						</fieldset>
					</div>
					<div class="line text-right ">
						<button type="button" class="transparent" title="Incluir Equipamento" id="btnEquiIncluirEquipamento">
							<img src="../resources/assets/imgs/new.gif" alt="Incluir Equipamento">
						</button>
						
						<button type="button" class="transparent" title="Salvar Equipamento" id="btnEquiSalvarEquipamento">
							<img src="../resources/assets/imgs/gravar.gif" alt="Salvar Equipamento">
						</button>
						
						<button type="button" class="transparent" title="Cancelar" id="btnEquiCancelar">
							<img src="../resources/assets/imgs/cancelar.gif" alt="Cancelar">  
						</button>
						
						<button type="button" id="btnEquiListaEquipamento" class="transparent" title="Lista de Equipamentos da Apólice">
							<img src="../resources/assets/imgs/atualizarDados.gif" alt="Lista de Equipamentos da Apólice">
						</button>

					</div>
					<div class="line">
						<fieldset class="col-24">
							<legend>Lista de Equipamentos</legend>
							<div class="list-scroll-vertical listaDeEquipamentos">
								<table>
									<thead>
										<tr>
											<th class="listaDeEquipamentos-lixeira">&nbsp;</th>
											<th class="listaDeEquipamentos-numSerie">Núm. Série</th>
											<th class="listaDeEquipamentos-descricaoDoEquipamentoSinistrado">Descrição do Equipamento Sinistrado</th>
											<th class="listaDeEquipamentos-Quantidade">Quantidade</th>
											<th class="listaDeEquipamentos-ValorUnitarioDoEquipamento">Valor Unitário <abbr title="Equipamento">Equip.</abbr></th>
											<th class="listaDeEquipamentos-valorDaEstimativaDePrejuizoPorEquip">Valor da Estimativa de Prejuízo por Equip.</th>

										</tr>
									</thead>
								</table>
								<div class="list">
									<table id="tabelaEquipamentos">
										<tbody>
											<tr id="trCloneEquipamentos" style="display: none;">
												<td class="listaDeEquipamentos-lixeira" id="tdEquiExcluir">
													<button type="button" class="transparent" title="Excluir" id="btnEquiExcluir">
														<img src="../resources/assets/imgs/lixeira.gif" alt="Excluir">
													</button>
												</td>
												<td class="listaDeEquipamentos-numSerie" id="tdEquiNumeroSerie"></td>
												<td class="listaDeEquipamentos-descricaoDoEquipamentoSinistrado" id="tdEquiNomeEquipamento"></td>
												<td class="listaDeEquipamentos-Quantidade" id="tdEquiQtde"></td>
												<td class="listaDeEquipamentos-ValorUnitarioDoEquipamento" id="tdEquiValorDano"></td>
												<td class="listaDeEquipamentos-valorDaEstimativaDePrejuizoPorEquip" id="tdEquiValorEstimado"></td>
											</tr>
											
											<tr id="trEquiNenhumRegistroClone" style="position: absolute; width: 89%;height: 20px">
												<td class="pLP" style="width: 100%; height: 100% ;position: absolute; border: 0; text-align: center;" >
													<b>Nenhum registro encontrado.</b>
												</td>
											</tr>
											
										</tbody>
									</table>
								</div>
							</div>
							<div class="line">
								<label for="txtEquiTotal" class="col-19">Total</label>
								<input type="text" name="txtEquiTotal" id="txtEquiTotal" class="col-5">
							</div>
						</fieldset>
					</div>
				</div>
				<div id="detalheBemSinistrado" data-content style="display: none">
					<fieldset class="col-24">
						<legend>Dano</legend>
						<div class="line">
							<label for="cmbDetClassificacao" class="col-4">Classificação</label>
							<select name="cmbDetClassificacao" id="cmbDetClassificacao" class="col-10"></select>

							<label for="txtDetQtde" class="col-3">Quantidade</label>
							<input type="text" name="txtDetQtde" id="txtDetQtde" class="col-2 ">

							<label for="txtDetValor" class="col-2">Valor</label>
							<input type="text" name="txtDetValor" id="txtDetValor" class="col-3 ">
						</div>
						<div class="line">
							<label for="txtDetValorTotalDanos" class="col-4">Valor Total Danos (R$)</label>
							<input type="text" name="txtDetValorTotalDanos" id="txtDetValorTotalDanos" class="col-3 ">
						</div>
						<div class="line">
							<label for="txtaDetDescricao" class="col-4">Descrição</label>
							<textarea name="txtaDetDescricao" id="txtaDetDescricao" cols="30" rows="3" class="col-20 "></textarea>
						</div>
					</fieldset>

					<div class="line text-right ">
						<button type="button" class="transparent" title="Incluir Detalhe Bem Sinistrado" id="btnDetIncluirDetalhe">
							<img src="../resources/assets/imgs/new.gif" alt="Incluir Detalhe Bem Sinistrado">
						</button>
						
						<button type="button" class="transparent" title="Salvar Detalhe Bem Sinistrado" id="btnDetSalvarDetalhe">
							<img src="../resources/assets/imgs/gravar.gif" alt="Salvar Detalhe Bem Sinistrado">
						</button>
						
						<button type="button" class="transparent" title="Cancelar" id="btnDetCancelar">
							<img src="../resources/assets/imgs/cancelar.gif" alt="Cancelar">  
						</button>
					</div>

					<fieldset class="col-24">
						<legend>Detalhe</legend>
						<div class="detalheBemSinistrado_listDetalhe list-scroll-vertical">
							<table>
								<thead>
									<tr>
										<th class="listDetalheBemSinistrado-lixeira"></th>
										<th class="listDetalheBemSinistrado-descricaoDoItemDoBemSinistrado">Descrição do Item do Bem Sinistrado</th>
										<th class="listDetalheBemSinistrado-quantidade">Quantidade</th>
										<th class="listDetalheBemSinistrado-valorUnitarioDoItem">Valor Unitário do Item</th>
										<th class="listDetalheBemSinistrado-valorEstDePrejuizoDosItens">Valor Est. De Prejuízo dos Itens</th>
										
									</tr>
								</thead>
							</table>
							
							<div class="list" style="height: 88px">
								<table id="tabelaDetalhe">								
									<tbody>
										<tr id="trCloneDetalhe" style="display: none;">
											<td class="listDetalheBemSinistrado-lixeira" id="tdDetExcluir">
												<button type="button" class="transparent" title="Excluir" id="btnDetExcluirDetalhe">
													<img src="../resources/assets/imgs/lixeira.gif" alt="Excluir">
												</button>
											</td>
											<td class="listDetalheBemSinistrado-descricaoDoItemDoBemSinistrado" id="tdDetDescricao">Descrição do Item do Bem Sinistrado</td>
											<td class="listDetalheBemSinistrado-quantidade" id="tdDetQtde">1</td>
											<td class="listDetalheBemSinistrado-valorUnitarioDoItem" id="tdDetValorUnitario">R$ 123,56</td>
											<td class="listDetalheBemSinistrado-valorEstDePrejuizoDosItens" id="tdDetPrejuizo">R$ 123,56</td>
										</tr>
										
										<tr id="trDetNenhumRegistroClone" style="position: absolute; width: 92%;height: 20px">
											<td class="pLP" style="width: 100%; height: 100% ;position: absolute; border: 0; text-align: center;" >
												<b>Nenhum registro encontrado.</b>
											</td>
										</tr>
									</tbody>
								</table>
							</div>		
						</div>
						<div class="line">
								<label for="txtDetTotal" class="col-19">Total</label>
								<input type="text" name="txtDetTotal" id="txtDetTotal" class="col-5">
							</div>
					</fieldset>
				</div>
				<div id="responsavel" data-content style="display: none">
					<fieldset class="col-12" style="height: 148px">
						<legend>Contato</legend>
						<div class="line" style="margin-top: -19px; margin-left: 40px; position: absolute;">
							<div class="col-22 offset-2">
								<label>
									<input type="checkbox" name="chkRespMesmoEndereco" id="chkRespMesmoEndereco" checked="checked">
									Mesmo endereço da Apólice
								</label>
							</div>
						</div>
						<div class="line">
							<label for="txtRespEndereco" class="col-5">Endereço</label>
							<input type="text" name="txtRespEndereco" id="txtRespEndereco" class="col-17">
						</div>
						<div class="line">
							<label for="txtRespBairro" class="col-5">Número</label>
							<input type="text" name="txtRespNumero" id="txtRespNumero" class="col-3">
							
							<label for="txtRespBairro" class="col-3">Bairro</label>
							<input type="text" name="txtRespBairro" id="txtRespBairro" class="col-11">
						</div>
						<div class="line">
							<label for="txtRespCep" class="col-5">CEP</label>
							<input type="text" name="txtRespCep" id="txtRespCep" class="col-15">
						</div>
						<div class="line">
							<label for="cmbRespUf" class="col-5">UF</label>
							<select name="cmbRespUf" id="cmbRespUf" class="col-5"></select>

							<label for="cmbRespCidade" class="col-4">Cidade</label>
							<select name="cmbRespCidade" id="cmbRespCidade" class="col-8"></select>
							
							<input type="text" name="txtSinCidadeBuscaResponsavel" id="txtSinCidadeBuscaResponsavel" style="display: none;" class="col-8">
							
							<div class="col-1">	 
								<button id="btnPesquisarResponsavel" class="transparent btnCalendario" title="Pesquisar" type="button">
									<img src="../resources/assets/imgs/lupa.gif" height="15" width="15" alt="Pesquisar" id="imgBtnPesquisar">
								</button>
								
								<button id="btnCancelarResponsavel" class="transparent btnCalendario" title="Cancelar" style="display: none;" type="button">
									<img src="../resources/assets/imgs/cancelar.gif" height="15" width="15" alt="Cancelar">
								</button>
							</div>
							
						</div>
					</fieldset>
					<fieldset class="col-12" style="height: 148px">
						<legend>Beneficiário</legend>
						<div class="line" style="margin-top: -19px; margin-left: 40px; position: absolute;">
							<span class="col-22 offset-2">
								<label for="chkRespProprioSegurado">
									<input type="checkbox" name="chkRespProprioSegurado" id="chkRespProprioSegurado" checked="checked">
									O próprio Segurado
								</label>
							</span>							
						</div>
						<div class="line">
							<label for="txtRespNomeBeneficiario" class="col-5">Nome</label>
							<input type="text" name="txtRespNomeBeneficiario" id="txtRespNomeBeneficiario" class="col-19">
						</div>

						<div>
							<label for="cmbRespOutros" class="col-5">Outros</label>
							<select name="cmbRespOutros" id="cmbRespOutros" class="col-19"></select>
						</div>
						<div class="line">
							<label for="txtRespCpfBeneficiario" class="col-5">CPF/CNPJ</label>
							<input type="text" name="txtRespCpfBeneficiario" id="txtRespCpfBeneficiario" class="col-7">
						</div>
						
						<div class="line">
							<span class="col-10 offset-2">
								<label for="chkRespNaoTemContaBanco">
									<input type="checkbox" name="chkRespNaoTemContaBanco" id="chkRespNaoTemContaBanco" checked="checked">
									Não tem Conta em Banco
								</label>																
							</span>														
							<label for="txtRespCodigoBanco" class="col-3">Banco</label>
							<input type="text" name="txtRespCodigoBanco" id="txtRespCodigoBanco" class="col-3">
							<input type="text" name="txtRespDescricaoBanco" id="txtRespDescricaoBanco" class="col-6">							
						</div>
						
						<div class="line">
							<label for="txtRespAgencia" class="col-5">Agência</label>
							<input type="text" name="txtRespAgencia" id="txtRespAgencia" class="col-4">
							<input type="text" name="txtRespAgenciaDv" id="txtRespAgenciaDv" class="col-3">

							<label for="txtRespConta" class="col-3">Conta</label>
							<input type="text" name="txtRespConta" id="txtRespConta" class="col-4">
<!-- 							<label for="txtRespContaDv" class="col-0-5">-</label> -->
							<input type="text" name="txtRespContaDv" id="txtRespContaDv" class="col-3">
							<span class="col-1">
								<button type="button" id="btnRespListarContas" class="transparent" title="Todas as Contas">
									<img src="../resources/assets/imgs/Traking_Reembolso.gif" alt="Todas as Contas">
								</button>
							</span>
						</div>
					</fieldset>
					<fieldset class="col-24" style="margin-top: 5px !important">
						<legend>Outra CIA</legend>
						<div class="line" style="position:absolute;margin-top:-17px;margin-left:20px">
							<label for="chkRespExisteOutrosSeguros" class="offset-3">
								<input type="checkbox" name="chkRespExisteOutrosSeguros" id="chkRespExisteOutrosSeguros">
								Existe seguro em outra CIA. cobrindo o mesmo bem ou evento?
							</label>
						</div>
						<div class="line">
							<label for="textaRespQualSeguro" class="col-3">Qual CIA?</label>
							<select name="cmbRespQualSeguro" id="cmbRespQualSeguro" class="col-21"></select>
						</div>
					</fieldset>
					<fieldset class="col-24" style="margin-top: 5px !important;height: 153px">
						<legend>Responsável</legend>						
						<div class="line">
							<label for="txtRespNome" class="col-3">Nome</label>
							<input type="text" name="txtRespNome" id="txtRespNome" class="col-8">

							
						</div>
						<div class="line">
							<label for="txtRespDDD" class="col-3">Telefone</label>
							<input type="text" name="txtRespDDD" id="txtRespDDD" class="col-2">
							<input type="text" name="txtRespTelefone" id="txtRespTelefone" class="col-4">

							
						</div>
						<div class="line">
							<label for="txtRespDDDCelular" class="col-3">Telefone Celular</label>
							<input type="text" name="txtRespDDDCelular" id="txtRespDDDCelular" class="col-2">
							<input type="text" name="txtRespTelefoneCelular" id="txtRespTelefoneCelular" class="col-4">

							
						</div>

						<div class="line">
							<label for="txtRespEmail" class="col-3">E-mail</label>
							<input type="text" name="txtRespEmail" id="txtRespEmail" class="col-8">
						</div>
						<div class="line">
							<label for="chkRespReceberAcompanhamento" class="col-14">Deseja receber o acompanhamento do seu sinistro por quais canais?</label>
							<label class="col-2" for="chkRespReceberAcompanhamentoSMS">
								<input type="checkbox" name="chkRespReceberAcompanhamentoSMS" id="chkRespReceberAcompanhamentoSMS">
								SMS
							</label>
							<label class="col-2" for="chkRespReceberAcompanhamentoEmail">
								<input type="checkbox" name="chkRespReceberAcompanhamentoEmail" id="chkRespReceberAcompanhamentoEmail">
								E-mail
							</label>
						</div>
					</fieldset>
					
					
				</div>
				<div id="outrosEnvolvidos" data-content style="display: none">
					<fieldset class="col-24">
						<legend>Outros Envolvidos</legend>
						<div class="line">
							<label for="txtOutNome" class="col-4">Nome</label>
							<input type="text" name="txtOutNome" id="txtOutNome" class="col-10">
						</div>
						<div class="line">
							<label for="txtOutCpfCnpj" class="col-4">CPF/CNPJ</label>
							<input type="text" name="txtOutCpfCnpj" id="txtOutCpfCnpj" class="col-5">
						</div>
					</fieldset>
					
					<div class="line text-right ">
						<button type="button" class="transparent" title="Incluir" id="btnOutIncluirEnvolvidos">
							<img src="../resources/assets/imgs/new.gif" alt="Incluir">
						</button>
						
						<button type="button" class="transparent" title="Salvar" id="btnOutSalvarrEnvolvidos">
							<img src="../resources/assets/imgs/gravar.gif" alt="Salvar">
						</button>
						
						<button type="button" class="transparent" title="Cancelar" id="btnOutCancelar">
							<img src="../resources/assets/imgs/cancelar.gif" alt="Cancelar">  
						</button>
					</div>
					
					<fieldset id="fieldset_lista_de_outros_envolvidos">
						<legend>Lista de Outros Envolvidos</legend>
						<div class="list-scroll-vertical listOutrosEnvolvidos">
							<table>
								<thead>
									<tr>
										<th class="listOutrosEnvolvidos-lixeira"></th>
										<th class="listOutrosEnvolvidos-nome">Nome</th>
										<th class="listOutrosEnvolvidos-cpfCNPJ">CPF/CNPJ</th>
										
									</tr>
								</thead>
							</table>
						
							<div class="list" style="height: 148px">
								<table id="tabelaOutros">
									<tbody>
										<tr id="trCloneOutros" style="display: none;">
											<td class="listOutrosEnvolvidos-lixeira" id="tdOutExcluit">
												<button type="button" class="transparent" title="Excluir" id="btnOutExcluir">
													<img src="../resources/assets/imgs/lixeira.gif" alt="Excluir">
												</button>
											</td>
											<td class="listOutrosEnvolvidos-nome" id="tdOutNome" style="width: 554px"></td>
											<td class="listOutrosEnvolvidos-cpfCNPJ" id="tdOutCpfCnpj"></td>
										</tr>
										
										<tr id="trOutNenhumRegistroClone" style="position: absolute; width: 88.5%;height: 20px">
											<td class="pLP" style="width: 100%; height: 100% ;position: absolute; border: 0; text-align: center;" >
												<b>Nenhum registro encontrado.</b>
											</td>
										</tr>
										
									</tbody>
								</table>
							</div>
						</div>
					</fieldset>
				</div>
			</div>
		</fieldset>
		<div class="line text-right">
			<button type="button" class="transparent" title="Salvar" id="btnSalvar">
				<img src="../resources/assets/imgs/gravar.gif" alt="Salvar">
			</button>
			<button type="button" class="transparent" title="Cancelar" id="btnSair">
				<img src="../resources/assets/imgs/cancelar.gif" alt="Cancelar">
			</button>
		</div>
	</form>
	<footer>

		<script src="../resources/vendors/scripts/jquery-1.11.1.js"></script>
		<script src="../resources/commons/script/validator.js" charset="iso-8859-1"></script>
		<script src="../resources/commons/script/json2.js" charset="iso-8859-1"></script>
		<script src="../resources/commons/script/utilitarioGeral.js" charset="iso-8859-1"></script>
		<script src="../resources/commons/script/jquery.mask.min.js" charset="iso-8859-1"></script>
		<script language="JavaScript" src="/plusoft-resources/javascripts/funcoesMozilla.js"></script>
		<script src="/plusoft-resources/javascripts/pt/date-picker.js"></script>
		<script src="aberturaSinistro/js/popupAbaDeEquipamentos.js" charset="UTF-8" type="text/javascript" defer="defer" ></script>
		<script src="aberturaSinistro/js/popupAbaDetalheSinistrado.js" charset="UTF-8" type="text/javascript" defer="defer" ></script>
		<script src="aberturaSinistro/js/popupAbaResponsavel.js" charset="UTF-8" type="text/javascript" defer="defer" ></script>
		<script src="aberturaSinistro/js/popupAbaOutrosEnvolvidos.js" charset="UTF-8" type="text/javascript" defer="defer" ></script>
		<script src="aberturaSinistro/js/popupAberturaSinistro.js" charset="UTF-8" type="text/javascript" defer="defer" ></script>
	</footer>
	
	<div id="aguarde" style="position:absolute; left:300px; top:130px; width:203px; height:148px; z-index:10; visibility: hidden;e">
  		<div align="center">
   			<iframe src="/csicrm/webFiles/operadorapresenta/aguarde.jsp" width="100%" height="100%" frameborder="0" marginwidth="0" marginheight="0"></iframe> 
  		</div>
	</div>
	
</body>


</html>