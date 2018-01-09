<%@page import="br.com.plusoft.csi.crm.util.SystemDate"%>
<%@page isELIgnored="false" %>

<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>


<% 
response.setContentType("text/html");
response.setHeader("Pragma","No-cache");
response.setDateHeader("Expires",0);
response.setHeader("Cache-Control","no-cache");

SystemDate dataAtual = new SystemDate();

%>

<html>
<head>
<title>-- CRM -- Plusoft</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">

<link rel="stylesheet" href="/plusoft-resources/css/global.css" type="text/css">
<script type="text/javascript" src="/plusoft-resources/javascripts/ajaxPlusoft.js"></script>
<script type="text/javascript" src="/plusoft-resources/javascripts/consultaBanco.js"></script>
<script language="JavaScript" src="/plusoft-resources/javascripts/pt/date-picker.js"></script>
<script language="JavaScript" src="/plusoft-resources/javascripts/pt/validadata.js"></script>
<script language="JavaScript" src="/plusoft-resources/javascripts/pt/funcoes.js"></script>

<script language="JavaScript">

var codigoAnteriorCertificado = "";
var descAnteriorCertificado = "";
var descricaoProduto_sel = "";
var nomeEstipulante_sel = "";
var codigoUnidadeProdutora_sel = "";
var numeroCertificado_sel = "";
var mostrouDetalhe = false;

function comparaData(ini,fim){	
	
	if (ini.value != "" && fim.value != ""){
		if(!validaPeriodo(ini.value,fim.value)){
			alert ('A data "Até" deve ser maior ou igual a data Inicial de pesquisa!');
			fim.focus();
			return false;
		}
	}
	
	return true;	
}

function validaBuscaAfinidades(){
	
	if(afinidadeForm.produto.value == -1){
		alert("O campo Produto é obrigatório!");
		afinidadeForm.produto.focus();
		return false;
	}
	
	if (!comparaData(afinidadeForm.data_inicial,afinidadeForm.data_final)){
		return false;
	}
	
	ajax = new ConsultaBanco("","/csiweb-bradescore/crm/ValidaSubmitAfinidade.do");
	ajax.addField("data_inicial", afinidadeForm.data_inicial.value);
	ajax.addField("data_final", afinidadeForm.data_final.value);
	
	ajax.executarConsulta(retornoValidacaoAfinidades, false, true);
	
}

function retornoValidacaoAfinidades(ajax){
	
	// Verifica se ocorreu algum erro na execução
	if(ajax.getMessage() != ''){
		showError(ajax.getMessage());
		return false; 
	}
	
	rs = ajax.getRecordset();
	
	// Adiciona todas as linhas
	if(rs.next()){
		
		if(rs.get("campo") == "data_final"){
			afinidadeForm.data_final.value = rs.get("data");
		}
		
		if(rs.get("campo") == "data_inicial"){
			afinidadeForm.data_inicial.value = rs.get("data");
		}

	}
	
	procurarAfinidades();
	
	
}

function gravarAtendimentoPadrao(situacaoAtual, descSituacaoAtual, semRegistros ){
	
	ajax = new ConsultaBanco("","/csiweb-bradescore/crm/GravarAtendPadraoAfinidade.do");
	
	ajax.addField("idPessCdPessoa", afinidadeForm.idPessCdPessoa.value);
	ajax.addField("idChamCdChamado", afinidadeForm.idChamCdChamado.value);
	ajax.addField("pessDsCpf", afinidadeForm.pessDsCpf.value);
	ajax.addField("situacao_anterior", codigoAnteriorCertificado);
	ajax.addField("situacao_atual", situacaoAtual);
	ajax.addField("descricao_produto", descricaoProduto_sel);
	ajax.addField("nome_estipulante", nomeEstipulante_sel);
	ajax.addField("codigo_unidade_produtora", codigoUnidadeProdutora_sel);
	ajax.addField("numero_certificado", numeroCertificado_sel);
	ajax.addField("desc_situacao_anterior", descAnteriorCertificado);
	ajax.addField("desc_situacao_atual", descSituacaoAtual);
	ajax.addField("atend_padrao_semregistros", semRegistros);
	
	$("aguarde").style.visibility = 'visible';
	
	ajax.executarConsulta(retornoGravarAtendimentoPadrao, false, true);
	
}

function retornoGravarAtendimentoPadrao(ajax){
	
	$("aguarde").style.visibility = 'hidden';
	
	// Verifica se ocorreu algum erro na execução
	if(ajax.getMessage() != ''){
		showError(ajax.getMessage());
		return false; 
	}
	
	rs = ajax.getRecordset();
	
	// Adiciona todas as linhas
	if(rs.next()){
		
		alert(rs.get("mensagem"));

		if(rs.get("id_cham") != ""){
			afinidadeForm.idChamCdChamado.value = rs.get("id_cham");
			window.top.superior.populaIdChamado(rs.get("id_cham"));
		}

	}
	
}

function procurarAfinidades(){
	
	document.getElementById('lstAfinidades').style.visibility = "";
	
	//funcao implementada no arquivo especifico do cliente
	ajax = new ConsultaBanco("","/csiweb-bradescore/crm/BuscarCertificados.do");
	ajax.addField("data_inicial", afinidadeForm.data_inicial.value);
	ajax.addField("data_final", afinidadeForm.data_final.value);
	ajax.addField("pessDsCpf", afinidadeForm.pessDsCpf.value);
	ajax.addField("produto", afinidadeForm.produto.value);
	
	$("aguarde").style.visibility = 'visible';
	
	ajax.executarConsulta(retornoListaCertificados, false, true);
	
}

function retornoListaCertificados(ajax){
	
	// Verifica se ocorreu algum erro na execução
	if(ajax.getMessage() != ''){
		$("aguarde").style.visibility = 'hidden';
		showError(ajax.getMessage());
		return false; 
	}
	
	rs = ajax.getRecordset();
	
	 // Remove Todas as Linhas que estão sendo exibidas
	for(var i=0; i<$("tableCertificados").rows.length; i++) {
		if($("tableCertificados").rows[i].style.display=="block"){
			if($("tableCertificados").rows[i].name!="nenhumRegistro") {
				$("tableCertificados").deleteRow(i);
				i--;			
			}
		}
	}
	 
	if(rs == null || rs.getSize() == 0){
		$("aguarde").style.visibility = 'hidden';
		$('nenhumRegistro').style.display="block";
		return;
	}
	
	$('nenhumRegistro').style.display="none";
	
	// Adiciona todas as linhas
	while(rs.next()){
		
		if(rs.get("coderro") != "" && rs.get("coderro") != undefined ){
			
			$('tdNenhumRegistro').innerHTML = "<b>" + rs.get("msgerro") + "</b>";
			$('nenhumRegistro').style.display="block";
			$("aguarde").style.visibility = 'hidden';
			
			if(rs.get("coderro") == "08"){
				gravarAtendimentoPadrao("", "", "S");
			}else{
				alert("Erro de Comunicação com Sistema AFND. Atendimento Padrão não foi gravado.");
			}
			
			return;
			
		}
		
		addRowRegistro(
				rs.get("descricaoproduto"), 
				rs.get("nomeestipulante"),
				rs.get("codigounidadeprodutora"),
				rs.get("numerocertificado"),
				rs.get("datainiciovigencia"),
				rs.get("nomesegurado"),
				rs.get("situacaocertificado"),
				rs.get("endossodetalheurl"),
				rs.get("codigosituacaocert"));
	}
	
	$("aguarde").style.visibility = 'hidden';
	
	mostrouDetalhe = false;
	
}

function addRowRegistro(descricaoProduto, nomeEstipulante, codigoUnidadeProdutora, numeroCertificado, dataInicioVigencia, nomeSegurado, situacaoCertificado, endossoDetalheUrl, codigoSituacaoCert) {

	// Pega o tamanho da tabela para definir o novo índice do registro
	var indice = $("tableCertificados").rows.length-1; // O -1 faz com que ele comece pelo índice "0" zero

	// Adiciona uma nova linha na tabela
	var newRow = cloneNode("rowCertificado", { idSuffix: ""+indice});
	
	newRow.indice = indice;
	newRow.descproduto = descricaoProduto;
	newRow.estipulante = nomeEstipulante;
	newRow.uniprodutora = codigoUnidadeProdutora;
	newRow.numcert = numeroCertificado;
	newRow.endossourl = endossoDetalheUrl;
	newRow.codsituacao = codigoSituacaoCert;
	newRow.descsituacao = situacaoCertificado;
	
	// Atualiza as células da nova linha com os valores do registro
	setValue(newRow.cells[1], descricaoProduto, 10);
	setValue(newRow.cells[2], nomeEstipulante, 12);
	setValue(newRow.cells[3], codigoUnidadeProdutora, 20);
	setValue(newRow.cells[4], numeroCertificado, 20);
	setValue(newRow.cells[5], dataInicioVigencia, 20);
	setValue(newRow.cells[6], nomeSegurado, 8);
	setValue(newRow.cells[7], situacaoCertificado, 15);
	
	// Mostra a nova linha na tabela
	newRow.style.display="block";
	
	if(descricaoProduto_sel == descricaoProduto && nomeEstipulante_sel == nomeEstipulante && codigoUnidadeProdutora_sel == codigoUnidadeProdutora && numeroCertificado_sel == numeroCertificado){
		
		document.getElementsByName("radioCertificado")[indice-1].checked = true;
		
		if(mostrouDetalhe){
			gravarAtendimentoPadrao(codigoSituacaoCert, situacaoCertificado, "N");
		}
		
	}
	
}

function inicio(){
	
	afinidadeForm.produto.value = "0";
	validaBuscaAfinidades();
	
}

var janela;

function exibeDetalheCertificado(objTr){
	
	AtivarPasta('PRODUTO');
	
	codigoAnteriorCertificado = objTr.codsituacao;
	descricaoProduto_sel = objTr.descproduto;
	nomeEstipulante_sel = objTr.estipulante;
	codigoUnidadeProdutora_sel = objTr.uniprodutora;
	numeroCertificado_sel = objTr.numcert;
	descAnteriorCertificado = objTr.descsituacao;
	
	document.getElementsByName("radioCertificado")[objTr.indice].checked = "true";
	
	//ifrmProdutos.location = objTr.endossourl + afinidadeForm.parametro_formato_url.value;

	janela = window.open(objTr.endossourl + afinidadeForm.parametro_formato_url.value, 'afinidadejanela', 'width:1000, height:650');
	mostrouDetalhe = true;
	
	setTimeout("verificaJanela()",2000);
	
}

function verificaJanela(){
	
	if(mostrouDetalhe){
		try{
			if(janela.closed){
				validaBuscaAfinidades();
			}else{
				setTimeout("verificaJanela()",1000);
			}
		}catch(e){
			setTimeout("verificaJanela()",1000);
		}
	}
	
}

function SetClassFolder(pasta, estilo) {
 	stracao = "document.all.item(\"" + pasta + "\").className = '" + estilo + "'";
 	eval(stracao);
} 


function AtivarPasta(pasta){
	
	return false;
	
	switch (pasta)
	{
	case 'AFINIDADE':
		MM_showHideLayers('afinidade','','show','divproduto','','hide');
		SetClassFolder('tdAfinidade','principalPstQuadroLinkSelecionado');
		SetClassFolder('tdProduto','principalPstQuadroLinkNormal');
		
		//validaBuscaAfinidades();
		
		break;
	
	case 'PRODUTO':
		MM_showHideLayers('afinidade','','hide','divproduto','','show');
		SetClassFolder('tdAfinidade','principalPstQuadroLinkNormal');
		SetClassFolder('tdProduto','principalPstQuadroLinkSelecionado');
		
		//mostrouDetalhe = true;
		
		break;
	}
 	eval(stracao);
}

function MM_findObj(n, d) { //v4.0
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && document.getElementById) x=document.getElementById(n); return x;
}

function MM_showHideLayers() { //v3.0
  var i,p,v,obj,args=MM_showHideLayers.arguments;
  for (i=0; i<(args.length-2); i+=3) if ((obj=MM_findObj(args[i]))!=null) { v=args[i+2];
    if (obj.style) { obj=obj.style; v=(v=='show')?'visible':(v='hide')?'hidden':v; }
    obj.visibility=v; }
}

</script>
</head>
<body class="principalBgrPage"  scroll="no" leftmargin="5" topmargin="5" marginwidth="5" marginheight="5" onload="inicio()" >

<html:form styleId="afinidadeForm" action="/AbreTelaAfinidade.do">

<html:hidden property="parametro_formato_url" />
<html:hidden property="idPessCdPessoa" />
<html:hidden property="pessDsCpf" />
<html:hidden property="idChamCdChamado" />

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
      <table width="99%" border="0" cellspacing="0" cellpadding="0" align="center">
        <tr>
          <td>
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr> 
                <td id="tdAfinidade" class="principalPstQuadroLinkSelecionado" onclick="AtivarPasta('AFINIDADE');" >Afinidade</td>
                <td id="tdProduto" class="principalPstQuadroLinkNormal" onclick="AtivarPasta('PRODUTO')" style="display:none">Produto</td>
                <td class="principalLabel">&nbsp;</td>
              </tr>
            </table>
            <table width="100%" border="0" cellspacing="0" cellpadding="0" class="principalBordaQuadro" height="421">
              <tr>
                <td valign="top">
                
                  <div id="afinidade" style="position:absolute; width:100%; height:421px; z-index:1; background-color:#f4f4f4"> 
                    <table width="100%" border="0" cellspacing="0" cellpadding="0" class="espacoPqn">
                      <tr> 
                        <td>&nbsp;</td>
                      </tr>
                    </table>
                    <table width="100%" border="0" cellspacing="0" cellpadding="0">
                      <tr> 
                        <td class="principalLabel" align="right" width="11%">
                        	Tipo Doc. <img src="/plusoft-resources/images/icones/setaAzul.gif" width="7" height="7"> 
                        </td>
                        <td class="principalLabelValorFixo" width="30%">
                        	&nbsp;<bean:write name="afinidadeForm" property="tipo_doc" />
                        </td>
                        <td class="principalLabel" width="22%" align="right">
                        	CPF / CNPJ <img src="/plusoft-resources/images/icones/setaAzul.gif" width="7" height="7"> 
                        </td>
                        <td class="principalLabelValorFixo" width="29%">
                        	&nbsp;<bean:write name="afinidadeForm" property="pessDsCpf" />
                        </td>
                        <td class="principalLabel" width="8%" align="center">&nbsp;</td>
                      </tr>
                    </table>
                    <table width="100%" border="0" cellspacing="0" cellpadding="0" class="espacoPqn">
                      <tr> 
                        <td>&nbsp;</td>
                      </tr>
                    </table>
                    <table width="100%" border="0" cellspacing="0" cellpadding="0">
                      <tr> 
                        <td class="principalLabel" width="11%" align="right">Produto 
                          <img src="/plusoft-resources/images/icones/setaAzul.gif" width="7" height="7"> 
                        </td>
                        <td class="principalLabel" width="30%"> 
                          
                          <html:select property="produto" styleClass="principalObjForm">
                          	  <html:option value="-1"><bean:message key="prompt.combo.sel.opcao" /></html:option>
							  <html:option value="0">TODOS</html:option>
							  <logic:present name="produtoVector">
							     <html:options collection="produtoVector" property="idRetaCdResptabulada" labelProperty="retaDsResptabulada"/>
							  </logic:present>
						  </html:select>
                          
                        </td>
                        <td class="principalLabel" width="22%" align="right">Periodo 
                          <img src="/plusoft-resources/images/icones/setaAzul.gif" width="7" height="7"> 
                        </td>
                        <td class="principalLabel" width="14%"> 
                          <table width="100%" border="0" cellspacing="0" cellpadding="0">
                            <tr> 
                              <td width="78%"> 
                              	<html:text property="data_inicial" styleClass="principalObjForm" maxlength="10" onkeydown="return validaDigito(this, event)" onblur="verificaData(this)" />
                              </td>
                              <td width="22%"><img src="/plusoft-resources/images/botoes/calendar.gif" width="16" height="15" onclick="show_calendar('afinidadeForm.data_inicial')" class="geralCursoHand" title="Calendário"></td>
                            </tr>
                          </table>
                        </td>
                        <td class="principalLabel" width="4%" align="right">At&eacute; 
                          <img src="/plusoft-resources/images/icones/setaAzul.gif" width="7" height="7"> 
                        </td>
                        <td class="principalLabel" width="14%"> 
                          <table width="100%" border="0" cellspacing="0" cellpadding="0">
                            <tr> 
                              <td width="78%"> 
                                <html:text property="data_final" styleClass="principalObjForm" maxlength="10" onkeydown="return validaDigito(this, event)" onblur="verificaData(this)" />
                              </td>
                              <td width="22%"><img src="/plusoft-resources/images/botoes/calendar.gif" width="16" height="15" onclick="show_calendar('afinidadeForm.data_final')" class="geralCursoHand" title="Calendário"></td>
                            </tr>
                          </table>
                        </td>
                        <td class="principalLabel" width="5%" align="center"><img src="/plusoft-resources/images/botoes/setaDown.gif" width="21" height="18" class="geralCursoHand" onClick="validaBuscaAfinidades();"></td>
                      </tr>
                    </table>
                    <table width="100%" border="0" cellspacing="0" cellpadding="0" class="espacoPqn">
                      <tr> 
                        <td>&nbsp;</td>
                      </tr>
                    </table>
                    <table width="99%" border="0" cellspacing="0" cellpadding="0" align="center" class="principalLstCab">
                      <tr> 
                        <td width="3%">&nbsp;</td>
                        <td width="13%">Produto</td>
                        <td width="12%">Estipulante</td>
                        <td width="11%" align="center">Unid. Produtora</td>
                        <td width="12%" align="center">Certificado</td>
                        <td width="11%" align="center">In&iacute;cio Vig&ecirc;ncia</td>
                        <td width="12%">Segurado</td>
                        <td width="26%">Situa&ccedil;&atilde;o Certificado</td>
                      </tr>
                    </table>
                    <table width="99%" border="0" cellspacing="0" cellpadding="0" align="center" class="principalBordaQuadro" height="350">
                      <tr> 
                        <td valign="top"> 
                          <div id="lstAfinidades" style="position:absolute; width:100%; height:100%; z-index:1; overflow-y:scroll"> 
							
                            <table width="100%" border="0" cellspacing="0" cellpadding="0" id="tableCertificados">
                              
                              <tr class="intercalaLst0" style="display:none" id="rowCertificado" indice="" endossourl="" codsituacao="" descproduto="" estipulante="" uniprodutora="" numcert="" descsituacao=""> 
                              
                                <td width="3%" class="principalLstPar" align="center"> 
                                  	<input type="radio" name="radioCertificado" value="this.parentNode.parentNode.indice" onclick="">
                                </td>
                                <td width="13%" class="principalLstPar"></td>
                                <td width="12%" class="principalLstPar"></td>
                                <td width="11%" class="principalLstPar" align="center"></td>
                                <td width="12%" class="principalLstPar" align="center"></td>
                                <td width="11%" class="principalLstPar" align="center"></td>
                                <td width="13%" class="principalLstPar"></td>
                                <td class="principalLstPar" width="19%"></td>
                                <td class="principalLstPar" width="4%" align="center">
                                	<img src="/plusoft-resources/images/botoes/lupa.gif" width="15" height="15" class="geralCursoHand" onclick="exibeDetalheCertificado(this.parentNode.parentNode);">
                                </td>
                                
                              </tr>
                              <tr id="nenhumRegistro" name="nenhumRegistro" style="display:none"> 
			                  	<td id="tdNenhumRegistro" width="100%" height="350" align="center" class="principalLabel" colspan="9"><br>
			                    	<b>Nenhum registro encontrado!</b> 
			                  	</td>
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
                  </div>
                   
                  <div id="divproduto" style="position:absolute; width:100%; height:421px; visibility:hidden; z-index:0; background-color:#f4f4f4"> 
                  
                  	<iframe id="ifrmProdutos" name="ifrmProdutos" src="" width="100%" height="421" scrolling="yes" frameborder="0" marginwidth="0" marginheight="0" ></iframe>
                  
                  </div>
                  
                </td>
              </tr>
            </table>
          </td>
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

<div id="aguarde" style="position:absolute; left:300px; top:180px; width:199px; height:148px; z-index:1; visibility: hidden"> 
  <div align="center"><iframe src="../resources/aguarde.jsp" width="100%" height="100%" scrolling="No" frameborder="0" marginwidth="0" marginheight="0"></iframe></div>
</div>

</html:form>

</body>
</html>
