<%@ page import="br.com.plusoft.csi.adm.helper.generic.GenericHelper"%>
<%@ taglib uri="http://plusoft.tags.br/tags-plusoft" prefix="plusoft" %>

<% 
	GenericHelper gHelper = new GenericHelper(empresaVo.getIdEmprCdEmpresa());
	long numMax = gHelper.getNumMaxRegistrosExibirMesa(empresaVo.getIdEmprCdEmpresa());
%>

<script language="JavaScript">
<!--
var vlLim = new Number('<%=numMax%>');
var vlMin = new Number(0);
var vlMax = vlLim - 1;
var nTotal= new Number(0);

function initPaginacao(){
	vlMin = new Number(0);
	vlMax = vlLim - 1;
	nTotal= new Number(0);
}

/*
*	M�todo utilizado quando a pagina��o est� na mesma p�gina da lista
*	Motivo: Nesta situa��o as vari�veis de controle de pagina��o s�o apagados pela atualiza��o da p�gina.
*/
function setPaginacao(valorMin,valorMax){
	
	if (valorMax > 0){
		vlMin = new Number(valorMin);
		vlMax = new Number(valorMax);
	}	
}
/*
*  M�todo para atualiza as vari�veis de pagina��o
*  nrTotal: Total de registros retornados na consulta 
*  OBS:Executar este m�todo sempre ap�s a a atualiza��o da lista de registros
*/
function atualizaPaginacao(nrTotal){
	nTotal = nrTotal;
	
	if (nTotal-1<=0){
		vlMin = nTotal-1;
	}
	
	if (vlMax > nTotal-1){
		vlMax = nTotal-1;
	}
	atualizaLabel();
	habilitaBotao();
}

function atualizaLabel(){
	window.document.getElementById("vlMin").innerHTML = vlMin + 1 ;
	window.document.getElementById("vlMax").innerHTML = vlMax + 1;
	window.document.getElementById("nTotal").innerHTML = nTotal;
}

function habilitaBotao(){

	if (vlMin > 0 ){
		window.document.getElementById("imgAnt").disabled = false;
		window.document.getElementById("imgAnt").className = "geralCursoHand";
	}else{
		window.document.getElementById("imgAnt").disabled = true;
		window.document.getElementById("imgAnt").className = "geralImgDisable";
	}
	
	if (vlMax < (nTotal - 1)){
		window.document.getElementById("imgProx").disabled = false;
		window.document.getElementById("imgProx").className = "geralCursoHand";
	}else{
		window.document.getElementById("imgProx").disabled = true;
		window.document.getElementById("imgProx").className = "geralImgDisable";
	}
}

/* Tipo: A=P�gina anterior
 * 		 P=Pr�xima p�gina
*/
function submitPag(tipo){
	var regDe = new Number(0);
	var regAte = new Number(0);
	
	if (tipo == "P"){
		regDe = vlMax + 1;
		regAte = vlMax + vlLim;
		if (regAte > nTotal){
			regAte = nTotal - 1;
		}
	}
	
	if (tipo == "A"){
		regDe = vlMin - vlLim;
		if (regDe < 0)
			regDe = 0;
		regAte = vlMin -1;
	}
	
	vlMin=regDe;
	vlMax=regAte;

	//m�todo a ser implementado na p�gina principal
	submitPaginacao(regDe,regAte);
}

// -->
</script>
<div id="LayerPaginacao" style="left:0px; top:0px; width:200px; height:21px; z-index:1">
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td class="pL" width="7%">
				<img id="imgAnt" src="webFiles/images/botoes/setaLeft.gif" disabled width="21" height="18" title="<plusoft:message modulo="Crm"  key="prompt.paginaAnterior" />" class="geralImgDisable" onclick="submitPag('A');">
			</td>
			<td class="pL" width="30%" align="Center"><span id="vlMin">&nbsp;</span></td>
			<td class="pL" width="10%" align="Center"><plusoft:message modulo="Crm"  key="prompt.paginacao.ate"/></td>
			<td class="pL" width="30%" align="Center"><span id="vlMax">&nbsp;</span></td>
			<td class="pL" width="7%">
				<img id="imgProx" src="webFiles/images/botoes/setaRight.gif" disabled width="21" height="18" title="<plusoft:message modulo="Crm"  key="prompt.proximaPagina" />" class="geralImgDisable" onclick="submitPag('P');">
			</td>
			<td class="pL" width="3%" >&nbsp;</td>
			<td class="pL" width="13%" align="center"><plusoft:message modulo="Crm"  key="prompt.paginacao.total"/>:&nbsp;</td>
			<td class="pL" width="30%" align="right"><span id="nTotal">&nbsp;</span></td>
		</tr>
	</table>
</div>
