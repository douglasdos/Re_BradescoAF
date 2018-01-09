<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<%
	response.setContentType("text/html");
	response.setHeader("Pragma","No-cache");
	response.setDateHeader("Expires",0);
	response.setHeader("Cache-Control","no-cache");
%>

<html>
<head>
<link rel="stylesheet" href="/plusoft-resources/css/global.css"type="text/css">

<style>
	.principalPstQuadroLocal {  font-family: Arial, Helvetica, sans-serif; font-size: 11px; font-weight: bold; color: #FFFFFF; text-decoration: none; background-color: #7EA5B8; height: 17px;text-align: left }
</style>

</head>
<body class="principalBgrPageIFRM"  scroll="auto">
	<html:form >
		<html:hidden property="validacao" styleId="validacao"/>
	</html:form>
</body>
<script src="../resources/vendors/scripts/jquery-1.11.1.js"></script>
<script language="JavaScript">
	(function($){
		$(document).ready(function() {
			
			var objJson = $.parseJSON($('#validacao').val());
			
			if (objJson != null) {
				if (objJson.bloco != null && objJson.bloco.length > 0) {
					for ( var i = 0; i < objJson.bloco.length; i++) {
						var bloco = objJson.bloco[i];
						var table = '';
						table += '<table width="100%" border="0" cellspacing="0" cellpadding="0">';
						table += '	<tr> ';
						table += '		<td width="100%" class="principalPstQuadroLocal" align="left">';
						table += '			' + bloco.cabecalho;
						table += '		</td>';
						table += '	</tr>';
						table += '	<tr>';
						table += '      <table width="100%" border="0" cellspacing="0" cellpadding="0" class="principalLabel">';
						table += '		<tr> ';
						table += '			<td>&nbsp;</td>';
						table += '		</tr>';
						table += '		</table>'; 
						table += '	</tr>';
						table += '	<tr>'; 
						table += '		<td width="100%" class="principalLabel" align="left">';
						table += '			' + bloco.mensagem ;
						table += '		</td>';
						table += '	</tr>';
						table += '	<tr>';
						table += '      <table width="100%" border="0" cellspacing="0" cellpadding="0" class="principalLabel">';
						table += '		<tr> ';
						table += '			<td>&nbsp;</td>';
						table += '		</tr>';
						table += '		</table>'; 
						table += '	</tr>';

						if (bloco.imagens != null && bloco.imagens.length > 0) {
							for ( var j = 0; j < bloco.imagens.length; j++) {
								var imagem = bloco.imagens[j];
								table += '	<tr> ';
								table += '		<td width="100%" class="principalLabel" align="left">';
								table += '			<img src="' + imagem + '" width="90%">';
								table += '			<hr>';
								table += '		</td>';
								table += '	</tr>';
							}
						}

						table += '</table>';
						table += '<table width="100%" border="0" cellspacing="0" cellpadding="0" class="principalLabel">';
						table += '	<tr> ';
						table += '		<td>&nbsp;</td>';
						table += '	</tr>';
						table += '</table>';
	
						var $validacao = $(table); 
	
						$("body").append($validacao);	
					}
				}
			}
		});
	})(jQuery);

</script>
</html>
