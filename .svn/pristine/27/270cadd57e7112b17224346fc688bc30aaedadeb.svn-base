<%@page isELIgnored="false" %>

<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>


<% 
response.setContentType("text/html");
response.setHeader("Pragma","No-cache");
response.setDateHeader("Expires",0);
response.setHeader("Cache-Control","no-cache");
%>

<html>
<head>
<title>-- CRM -- Plusoft</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">

<link rel="stylesheet" href="/plusoft-resources/css/global.css" type="text/css">
<script type="text/javascript" src="/plusoft-resources/javascripts/ajaxPlusoft.js"></script>
<script type="text/javascript" src="/plusoft-resources/javascripts/consultaBanco.js"></script>

<script language="JavaScript">
function procurarAfinidades(){
	document.getElementById('lstAfinidades').style.visibility = "";
}
<!--
function MM_reloadPage(init) {  //reloads the window if Nav4 resized
  if (init==true) with (navigator) {if ((appName=="Netscape")&&(parseInt(appVersion)==4)) {
    document.MM_pgW=innerWidth; document.MM_pgH=innerHeight; onresize=MM_reloadPage; }}
  else if (innerWidth!=document.MM_pgW || innerHeight!=document.MM_pgH) location.reload();
}
MM_reloadPage(true);
// -->
</script>
</head>
<body class="principalBgrPage"  scroll="no" leftmargin="5" topmargin="5" marginwidth="5" marginheight="5">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr> 
    <td colspan="2"> 
      <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr> 
          <td height="16" class="principalPstQuadro">Afinidade</td>
          <td height="16" class="principalQuadroPstVazia">&nbsp;</td>
          <td width="4" height="16" heigt="1"><img src="/plusoft-resources/images/linhas/VertSombra.gif" width="4" height="100%"></td>
        </tr>
      </table>
    </td>
  </tr>
  <tr> 
    <td class="principalBgrQuadro" width="100%">
      <table width="100%" border="0" cellspacing="0" cellpadding="0" class="espacoPqn">
        <tr>
          <td>&nbsp;</td>
        </tr>
      </table>
      <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr> 
          <td class="principalLabel" width="8%" align="right">Tipo Doc. <img src="/plusoft-resources/images/icones/setaAzul.gif" width="7" height="7"> 
          </td>
          <td class="principalLabel" width="22%"> 
            <select name="select2" class="principalObjForm">
              <option>-- Selecione uma op&ccedil;&atilde;o --</option>
              <option>CPF</option>
              <option>CNPJ</option>
            </select>
          </td>
          <td class="principalLabel" width="10%" align="right">CPF/CNPJ <img src="/plusoft-resources/images/icones/setaAzul.gif" width="7" height="7"> 
          </td>
          <td class="principalLabel" width="20%"> 
            <input type="text" name="textfield3" class="principalObjForm" style="width:98%">
          </td>
          <td class="principalLabel" width="8%" align="right">Periodo <img src="/plusoft-resources/images/icones/setaAzul.gif" width="7" height="7"> 
          </td>
          <td class="principalLabel" width="12%">
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr> 
                <td width="78%"> 
                  <input type="text" name="textfield2" class="principalObjForm">
                </td>
                <td width="22%"><img src="/plusoft-resources/images/botoes/calendar.gif" width="16" height="15" class="geralCursoHand" title="Calendário"></td>
              </tr>
            </table>
          </td>
          <td class="principalLabel" width="4%" align="right">At&eacute; <img src="/plusoft-resources/images/icones/setaAzul.gif" width="7" height="7"> 
          </td>
          <td class="principalLabel" width="12%">
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr> 
                <td width="78%"> 
                  <input type="text" name="textfield" class="principalObjForm">
                </td>
                <td width="22%"><img src="/plusoft-resources/images/botoes/calendar.gif" width="16" height="15" class="geralCursoHand" title="Calendário"></td>
              </tr>
            </table>
          </td>
          <td class="principalLabel" width="4%" align="center"><img src="/plusoft-resources/images/botoes/lupa.gif" width="15" height="15" class="geralCursoHand" title="Pesquisar" onClick="procurarAfinidades();"></td>
        </tr>
      </table>
      <table width="100%" border="0" cellspacing="0" cellpadding="0" class="espacoPqn">
        <tr> 
          <td>&nbsp;</td>
        </tr>
      </table>
      <table width="99%" border="0" cellspacing="0" cellpadding="0" align="center" class="principalLstCab">
        <tr> 
          <td width="14%">&nbsp; Produto</td>
          <td width="11%">Estipulante</td>
          <td width="11%" align="center">Unid. Produtora</td>
          <td width="12%" align="center">Certificado</td>
          <td width="12%" align="center">In&iacute;cio Vig&ecirc;ncia</td>
          <td width="16%">Segurado</td>
          <td>Situa&ccedil;&atilde;o Certificado</td>
        </tr>
      </table>
      <table width="99%" border="0" cellspacing="0" cellpadding="0" align="center" class="principalBordaQuadro" height="340">
        <tr>
          <td valign="top">
            <div id="lstAfinidades" style="position:absolute; width:100%; height:100%; z-index:1;overflow-y: scroll; visibility: hidden"> 
              <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr class="geralCursoHand" onClick="window.open('PopUpReenbolso.jsp','Bradesco');"> 
                  <td width="14%" class="principalLstPar">&nbsp; SEGURO RESID&Ecirc;N...</td>
                  <td width="11%" class="principalLstPar">CASAS BAHIA...</td>
                  <td width="11%" class="principalLstPar" align="center">001</td>
                  <td width="12%" class="principalLstPar" align="center">000000000012</td>
                  <td width="12%" class="principalLstPar" align="center">24/06/2008</td>
                  <td width="16%" class="principalLstPar">CARLOS MOURA</td>
                  <td class="principalLstPar" width="22%">DOCUMENTO DEPENDENTE 
                    DE...</td>
                </tr>
                <tr class="geralCursoHand"> 
                  <td width="14%" class="principalLstImpar">&nbsp; SEGURO RESID&Ecirc;N...</td>
                  <td width="11%" class="principalLstImpar">CASAS BAHIA...</td>
                  <td width="11%" class="principalLstImpar" align="center">001</td>
                  <td width="12%" class="principalLstImpar" align="center">000000000013</td>
                  <td width="12%" class="principalLstImpar" align="center">24/06/2008</td>
                  <td width="16%" class="principalLstImpar">PATR&Iacute;CIA MELLO</td>
                  <td class="principalLstImpar" width="22%">DOCUMENTO DEPENDENTE 
                    DE...</td>
                </tr>
              </table>
            </div>
          </td>
        </tr>
      </table>
      <table width="100%" border="0" cellspacing="0" cellpadding="0" class="espacoPqn">
        <tr> 
          <td>&nbsp;</td>
        </tr>
      </table>
      <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td>&nbsp;</td>
        </tr>
      </table>
      <table width="100%" border="0" cellspacing="0" cellpadding="0" class="espacoPqn">
        <tr> 
          <td>&nbsp;</td>
        </tr>
      </table>
    </td>
    <td height="1px" width="4px"><img src="/plusoft-resources/images/linhas/VertSombra.gif" height="100%" width="4"></td>
  </tr>
  <tr> 
    <td height="4" width="100%"><img height="4" width="100%" src="/plusoft-resources/images/linhas/horSombra.gif"></td>
    <td height="4" width="4px"><img src="/plusoft-resources/images/linhas/cntInferiorDireito.gif" width="4" height="4"></td>
  </tr>
</table>
</body>
</html>
