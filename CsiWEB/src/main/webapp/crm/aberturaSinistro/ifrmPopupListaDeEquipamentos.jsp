<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<% 
	response.setContentType("text/html");
	response.setHeader("Pragma","No-cache");
	response.setDateHeader("Expires",0);
	response.setHeader("Cache-Control","no-cache");
%>

<style>

#cab_lista {
	overflow: hidden !important;
    height: 2px !important;
}

#cab_lista + .list-scroll-vertical {
	margin-top: -6px !important;
}
</style>

<!DOCTYPE html>
<html class="popup">
<head>
	<meta http-equiv="X-UA-Compatible" content="IE=8" />
    <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />

	<title>Lista de Equipamentos da Apólice</title>
	<link rel="stylesheet" href="aberturaSinistro/style/ps.css">
	<link rel="stylesheet" href="aberturaSinistro/style/popupListaDeEquipamentosDaApolice.css">
	<link rel="stylesheet" href="/plusoft-resources/css/global.css" type="text/css">
	<script src="../resources/commons/script/html5shiv.js"></script>
</head>


<body>
	<form>
		<fieldset class="col-24">
			<legend>Lista de Equipamentos da Apólice</legend>		
			<div id="cab_lista" class="list-scroll-vertical">
				<table>
					<thead>
						<tr>
							<th class="listaDeEquipamentoDaApolice-checkbox">
								
								<button type="button" class="transparent" id="btnMarcar">
									<img src="../resources/assets/imgs/selecionar_sim.gif" alt="">
								</button>
								
								<button type="button" class="transparent" id="btnDesMarcar">
									<img src="../resources/assets/imgs/selecionar_nao.gif" alt="">
								</button>
								
							</th>
							<th class="nome">Nome</th>
							<th class="marca">Marca</th>
							<th class="modelo">Modelo</th>
							<th class="item">Item</th>
							<th class="numero-de-serie">Número de Série</th>
							<th class="ano-fabricacao">Ano Fabricação</th>
							<th class="quantidade">Quantidade</th>
							<th class="valor-do-dano">Valor do Dano</th>
							<th class="valor-estimado-dos-danos">Valor Estimado dos Danos</th>
						</tr>
					</thead>
				</table>				
			</div>
			<div class="list-scroll-vertical">
				<table id="tabelaEquipamento">
					<tbody>
						<tr id="trClone" style="display: none;">
							<td class="listaDeEquipamentoDaApolice-checkbox" id="tdMarcar">
								<input type="checkbox" name="chkMarcar" id="chkMarcar">
							</td>
							<td class="nome" id="tdNome">
								<span></span> 
								<input type="text" name="" id="" class="col-24" >
							</td>
							<td class="marca" id="tdMarca">
								<span></span>
								<input type="text" name="" id="" class="col-24" >
							</td>
							<td class="modelo" id="tdModelo">
								<span></span>
								<input type="text" name="" id="" class="col-24" >
							</td>
							<td class="item" id="tdItem">
								<span></span>
								<input type="text" name="" id="" class="col-24" >
							</td>
							<td class="numero-de-serie" id="tdSerie">
								<span></span>
								<input type="text" name="" id="" class="col-24" >
							</td>
							<td class="ano-fabricacao" id="tdAnoFabricacao">
								<span></span>
								<input type="text" name="" id="" class="col-24" >
							</td>
							<td class="quantidade" id="tdQtde">
								<span>1</span>
								<input type="text" name="" id="" class="col-24">
							</td>
							<td class="valor-do-dano" id="tdValorDano">
								<span></span>
								<input type="text" name="" id="" class="col-24">
							</td>
							<td class="valor-estimado-dos-danos" id="tdValorEstimado">
								<span></span>
								<input type="text" name="" id="" class="col-24">
							</td>
						</tr>
						
						<tr id="trNenhumRegistroClone" style="position: absolute; width: 93%;height: 20px">
							<td class="pLP" style="width: 100%; height: 100% ;position: absolute; border: 0; text-align: center;" >
								<b>Nenhum registro encontrado.</b>
							</td>
						</tr>
						
					</tbody>
				</table>
			</div>
			<div class="col-24 text-right">
				<button type="button" class="transparent" title="Salvar" id="btnSalvar">
					<img src="../resources/assets/imgs/gravar.gif" alt="Salvar">
				</button>
				<button type="button" class="transparent" title="Cancelar" id="btnSair">
					<img src="../resources/assets/imgs/cancelar.gif" alt="Cancelar">
				</button>
			</div>
		</fieldset>
	</form>
</body>
<script src="../resources/vendors/scripts/jquery-1.11.1.js"></script>
<script src="../resources/commons/script/validator.js" charset="iso-8859-1"></script>
<script src="../resources/commons/script/json2.js" charset="iso-8859-1"></script>
<script src="../resources/commons/script/utilitarioGeral.js" charset="iso-8859-1"></script>
<script src="../resources/commons/script/jquery.mask.min.js" charset="iso-8859-1"></script>
<script language="JavaScript" src="/plusoft-resources/javascripts/funcoesMozilla.js"></script>
<script src="aberturaSinistro/js/popupListaDeEquipamentos.js" charset="UTF-8" type="text/javascript" defer="defer" ></script>


</html>