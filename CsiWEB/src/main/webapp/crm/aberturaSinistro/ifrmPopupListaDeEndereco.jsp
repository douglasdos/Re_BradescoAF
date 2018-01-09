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

	<title>Lista de Endereços</title>

	<link rel="stylesheet" href="../resources/commons/css/ps.css">
	<link rel="stylesheet" href="aberturaSinistro/style/popupListaDeEndereco.css">
</head>
<body>
	<form>
		<fieldset class="col-24">
			<legend>Lista de Endereços</legend>		
			<div class="list-scroll-vertical">
				<table>
					<thead>
						<tr>
							<th class="list-checkbox"></th>
							<th class="list-endereco">Endereço</th>
							<th class="list-numero">Número</th>
							<th class="list-bairro" >Bairro</th>
							<th class="list-cep">CEP</th>
							<th class="list-uf">UF</th>
							<th class="list-cidade">Cidade</th>
						</tr>
					</thead>
				</table>
				
				<div class="list" style="height: 112px">
					<table id="tabelaEndereco">					
						<tbody>
							<tr id="trClone" style="display: none;">
								<td class="list-checkbox" id="tdRdo">
									<input type="radio" name="rdoSelecionado" id="rdoSelecionado"></td>
								<td class="list-endereco" id="tdEndereco" ></td>
								<td class="list-numero" id="tdNumero"></td>
								<td class="list-bairro" id="tdBairro"></td>
								<td class="list-cep" id="tdCep"></td>
								<td class="list-uf" id="tdUf"></td>
								<td class="list-cidade" id="tdCidade"></td>
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
			<div class="col-24 align-right">
				<button type="button" class="transparent" title="Salvar" id="btnSalvar">
					<img src="../resources/assets/imgs/gravar.gif" alt="Salvar">
				</button>
				<button type="button" class="transparent" title="Cancelar" id="btnCancelar">
					<img src="../resources/assets/imgs/cancelar.gif" alt="Cancelar">
				</button>
			</div>
		</fieldset>
	</form>
	
	<div id="aguarde" style="position:absolute; left:300px; top:18px; width:203px; height:148px; z-index:10; visibility: hidden;e">
  		<div align="center">
   			<iframe src="/csicrm/webFiles/operadorapresenta/aguarde.jsp" width="100%" height="100%" frameborder="0" marginwidth="0" marginheight="0"></iframe> 
  		</div>
	</div>
	
</body>
<script src="../resources/vendors/scripts/jquery-1.11.1.js"></script>
<script src="../resources/commons/script/validator.js" charset="iso-8859-1"></script>
		<script src="../resources/commons/script/json2.js" charset="iso-8859-1"></script>
		<script src="../resources/commons/script/utilitarioGeral.js" charset="iso-8859-1"></script>
<script src="aberturaSinistro/js/popupListaDeEndereco.js" charset="UTF-8" type="text/javascript" defer="defer" ></script>

</html>