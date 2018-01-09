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

	<title>Todas as Contas</title>

	<link rel="stylesheet" href="aberturaSinistro/style/ps.css">
	<link rel="stylesheet" href="aberturaSinistro/style/popupContasDisponiveis.css">
</head>
<body>
	<form>
		<fieldset class="col-24">
			<legend>Todas as Contas</legend>
			<div class="line">
				<label for="txtNumeroBanco" class="col-2">Banco</label>
				<input type="text" name="txtNumeroBanco" id="txtNumeroBanco" class="col-3">
				<input type="text" name="txtDescricaoBanco" id="txtDescricaoBanco" class="col-5">

				<label for="txtNumeroAgencia" class="col-2">Agência</label>
				<input type="text" name="txtNumeroAgencia" id="txtNumeroAgencia" class="col-2">
				<input type="text" name="txtNumeroAgenciaDv" id="txtNumeroAgenciaDv" class="col-1">

				<label for="txtNumeroConta" class="col-2">Conta</label>
				<input type="text" name="txtNumeroConta" id="txtNumeroConta" class="col-3">
				<input type="text" name="txtNumeroContaDv" id="txtNumeroContaDv" class="col-1">

				<span class="col-1">
					<button type="button" class="transparent" title="Incluir" id="btnIncluir">
						<img src="../resources/assets/imgs/setaDown.gif" alt="Incluir">
					</button>
				</span>
			</div>
			<div class="list-scroll-vertical">
				<table>
					<thead>
						<tr>
							<th class="listContasDisponiveis-radio"></th>
							<th class="listContasDisponiveis-banco">Banco</th>
							<th class="listContasDisponiveis-agencia">Agência</th>
							<th class="listContasDisponiveis-conta">Conta</th>
						</tr>
					</thead>
				
				</table>
				<div style="margin-top: 0;overflow: hidden;width: 100%;margin-left: -1px;border-right: 0;">
					<table id="tabelaConta">
						<tbody>
							<tr id="trClone" style="display: none;">
								<td class="listContasDisponiveis-radio" id="tdSelecionar">
									<input type="radio" name="rdoConta" id="rdoSelecionado"></td>
								<td class="listContasDisponiveis-banco"  id="tdBanco"></td>
								<td class="listContasDisponiveis-agencia"  id="tdAgencia"></td>
								<td class="listContasDisponiveis-conta"  id="tdConta"></td>
							</tr>
							
							<tr id="trNenhumRegistroClone" style="position: absolute; width: 90%;height: 20px">
								<td class="pLP" style="width: 100%; height: 100% ;position: absolute; border: 0; text-align: center;" >
									<b>Nenhum registro encontrado.</b>
								</td>
							</tr>
							
						</tbody>
					</table>
				</div>
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
	
	<div id="aguarde" style="position:absolute; left:227px; top:32px; width:203px; height:148px; z-index:10; visibility: hidden;e">
  		<div align="center">
   			<iframe src="/csicrm/webFiles/operadorapresenta/aguarde.jsp" width="100%" height="100%" frameborder="0" marginwidth="0" marginheight="0"></iframe> 
  		</div>
	</div>
	
</body>

<script src="../resources/vendors/scripts/jquery-1.11.1.js"></script>
<script src="../resources/commons/script/validator.js" charset="iso-8859-1"></script>
<script src="../resources/commons/script/json2.js" charset="iso-8859-1"></script>
<script src="../resources/commons/script/utilitarioGeral.js" charset="iso-8859-1"></script>
<script src="../resources/commons/script/jquery.mask.min.js" charset="iso-8859-1"></script>
<script language="JavaScript" src="/plusoft-resources/javascripts/funcoesMozilla.js"></script>
<script src="aberturaSinistro/js/popupContasDisponiveis.js" charset="UTF-8" type="text/javascript" defer="defer" ></script>

</html>