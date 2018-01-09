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
<html class="crm-pessoas">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>Sinistro</title>
	<link rel="stylesheet" href="/plusoft-resources/css/global.css" type="text/css">
	<link rel="stylesheet" href="../resources/commons/css/ps.css">
	<link rel="stylesheet" href="aberturaSinistro/style/sinistro.css">

</head>

<script language="JavaScript">
	window.name="consultaSinistro";
</script>

<body>
	<html:form styleId="aberturaSinistroForm">
		
		<html:hidden property="idPessCdPessoa" styleId="idPessCdPessoa"/>
		<input type="hidden" id="hidGrupoRamos">
		<input type="hidden" id="hidApoliceSelecionada">
		<input type="hidden" id="hidSinistroGravado">
		<input type="hidden" id="hidStatusSinistroGravado">
		<input type="hidden" id="pesrNrSequencia">
		
		<div class="list-scroll-vertical">
			<table>
				<thead>
					<tr>
						<th class="list-NumeroSinistro">Número Sinistro</th>
						<th class="list-sucursal">Sucursal</th>
						<th class="list-ramo">Ramo</th>
						<th class="list-cia">CIA</th>
						<th class="list-apolice">Apólice</th>
						<th class="list-dataEHoraDoSinistro">Dt./Hora Sinistro</th>
						<th class="list-natureza">Natureza</th>
						<th class="list-produto">Produto</th>
						<th class="list-status">Status</th>
						<th class="list-lupa">&nbsp;</th>
						<th style="padding:8px"></th>
					</tr>
				</thead>
			</table>
			
			<div class="list" style="height: 167px">
				<table id="tabelaSinistro">
					<tbody>
						<tr id="trClone" style="display: none;" >
							<td class="list-NumeroSinistro" id="tdNumeroSinistro"></td>
							<td class="list-sucursal" id="tdSurcusal"></td>
							<td class="list-ramo" id="tdRamo"></td>
							<td class="list-cia" id="tdCia"></td>
							<td class="list-apolice" id="tdApolice"></td>
							<td class="list-dataEHoraDoSinistro" id="tdDataSinistro"></td>
							<td class="list-natureza" id="tdNatureza"></td>
							<td class="list-produto" id="tdProduto"></td>
							<td class="list-status" id="tdStatus"></td>
							<td class="list-lupa" id="tdLupa">
								<button type="button" class="transparent" title="Pesquisar" id="btnPesquisar">
									<img src="../resources/assets/imgs/lupa.gif" alt="Pesquisar" id="imgLinha">
								</button>
							</td>
						</tr>
						
						<tr id="trNenhumRegistroClone" style="position: absolute; width: 89%;height: 20px;">
							<td class="pLP" style="width: 100%; height: 100% ;position: absolute; border: 0; text-align: center;">
								<b>Nenhum registro encontrado.</b>
							</td>
						</tr>
						
					</tbody>
				</table>
			</div>
		</div>
	</html:form>
</body>

<script src="../resources/vendors/scripts/jquery-1.11.1.js"></script>
<script src="../resources/commons/script/utilitarioGeral.js" charset="iso-8859-1"></script>
<script src="../resources/commons/script/validator.js" charset="iso-8859-1"></script>
<script src="../resources/commons/script/json2.js" charset="iso-8859-1"></script>
<script language="JavaScript" src="/plusoft-resources/javascripts/funcoesMozilla.js"></script>

<script src="aberturaSinistro/js/consultaSinistro.js"></script>

</html>