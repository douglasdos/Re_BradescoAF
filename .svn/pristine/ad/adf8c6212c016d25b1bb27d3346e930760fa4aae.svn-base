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
	<meta http-equiv="X-UA-Compatible" content="IE=8" />
    <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />

	<title>Apólice</title>
	
	<link rel="stylesheet" href="/plusoft-resources/css/global.css" type="text/css">
	<link rel="stylesheet" href="../resources/commons/css/ps.css">
	<link rel="stylesheet" href="aberturaSinistro/style/apolice.css">
</head>

<script language="JavaScript">
	window.name="apolice";
</script>

<body>
	<html:form styleId="aberturaSinistroForm">
		<html:hidden property="idPessCdPessoa" styleId="idPessCdPessoa"/>
		<input type="hidden" id="hidGrupoRamos">
		<input type="hidden" id="hidApoliceSelecionada">
		<div class="col-24">
			<div class="alternating-color" style="overflow-x: hidden;">
				<table>
					<thead>
						<tr>
							<th class="list-radio"></th>
							<th class="list-apolice"><span>Apólice</span></th>
							<th class="list-apolice-descricao-do-produto"><span>Descrição do Produto</span></th>
							<th class="list-apolice-nome-do-segurado"><span>Nome do Segurado</span></th>
							<th class="list-apolice-data-do-inicio-da-vigencia"><span>Data do início da vigência</span></th>
							<th class="list-apolice-data-do-termino-da-vigencia"><span>Data do término da vigência</span></th>
							<th style="padding:8px"></th>
						</tr>
					</thead>
				</table>
				
				<div class="list" style="height: 167px">
					<table id="tabelaApolice">
						<tbody>
							<tr id="trClone" style="display: none;" >
								<td class="list-radio" id="tdRadio">
									<input type="radio" name="rdoSelecionar" id="rdoSelecionar">
								</td>
								<td class="list-apolice" id="tdApolice"></td>
								<td class="list-apolice-descricao-do-produto" id="tdDescricao"></td>
								<td class="list-apolice-nome-do-segurado" id="tdNome"></td>
								<td class="list-apolice-data-do-inicio-da-vigencia" id="tdDataInicio"></td>
								<td class="list-apolice-data-do-termino-da-vigencia" id="tdDataFinal"></td>
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
		</div>
		<div class="col-24 align-right">
			<button id="btnIncluirComunicado" type="button" class="transparent disabled" title="Incluir Comunicado de Sinistro">
				<img src="../resources/assets/imgs/INFO1.gif" alt="Incluir Comunicado de Sinistro">
			</button>
		</div>
	</html:form>
	
	<div id="aguarde" style="position:absolute; left:300px; top:37px; width:203px; height:148px; z-index:10; visibility: hidden;e">
  		<div align="center">
   			<iframe src="/csicrm/webFiles/operadorapresenta/aguarde.jsp" width="100%" height="100%" frameborder="0" marginwidth="0" marginheight="0"></iframe> 
  		</div>
	</div>
	
</body>



<script src="../resources/vendors/scripts/jquery-1.11.1.js"></script>
<script src="../resources/commons/script/utilitarioGeral.js" charset="iso-8859-1"></script>
<script src="../resources/commons/script/json2.js" charset="iso-8859-1"></script>
<script language="JavaScript" src="/plusoft-resources/javascripts/funcoesMozilla.js"></script>

<!-- <script src="../../scripts/commons/ps.js"></script> -->
<script src="aberturaSinistro/js/apolice.js"></script>
</html>
