<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://plusoft.tags.br/tags-plusoft" prefix="plusoft" %>
<script type="text/javascript">
function habilitaCamposManif(){
	//função implementada no arquivo espec
}

//Metodo utilizado para verificar alguma coisa antes de salvar o chamado
function podeGravarChamado(){
	return true;
}

function podeGerarNumeroChamado() {
	return true;
}

function podeCancelarAtendimento() {
	return true;
}

function podeSairAplicacao() {
	return true;
}

function validaEspec(){
	return true;
}

function executarAposGravarManif(){
	//executar alguma acao apos gravar a manifestacao.
}

function onLoadLstManifestacao(){
	//executar alguma acao apos gravar a manifestacao.
}

function onLoadManifestacaoDetalhe(){
	//executar alguma acao apos gravar a manifestacao.
}

function funcionalidadeAdicionalWkf(){
	return true;
}

function onLoadManifWorkflowEspec(){
	
}

function fazerAposCancelarChamado(){
	
}

function fazerAposGravacaoChamado(){
	
}

function fazerAposGravarDiverso(){
	
}

function funcionalidadeAdicionalComandos(){	
	return true;
}

//funcao chamado ao clicar na seta azul, para confirmar investigacao
function antesIncluirInvestigacao(){
	return true;
}

//funcao chamada ao clicar no disquete para gravar investigacao
function antesGravarInvestigacao(){
	return true;
}

//funcao chamada ao carregar a tela de investigacao
function onloadEspecInvestigacao(){

}

//funcao chamado antes de gravar os dados da amostra
function antesGravarAmostra(){
	return true;
}

//funcao chanada antes de confirmar followup
function antesConfirmarFollowup(){
	return true;
}

//jvarandas - 31/08/2010
//Função criada para ser utilizada na tela de Destinatário da Manifestação do CRM e Workflow
function onLoadManifestacaoDestinatario() {
	document.getElementById("divFuncaoExtraDestinatarioManif").style.visibility = "hidden";
}

function onClickHistoricoManifestacaoDestinatario() {
	
}

//Chamado: 82811 - 06/07/2012 - Carlos Nunes
function imprimirFicha()
{
	if (confirm('<plusoft:message modulo="Crm"  key="prompt.desejaImprimirFicha"/>')){
		showModalDialog('Chamado.do?acao=consultar&tela=imprEtiqueta&csNgtbChamadoChamVo.idChamCdChamado=' + chamado ,window,'help:no;scroll:auto;Status:NO;dialogWidth:800px;dialogHeight:600px,dialogTop:200px,dialogLeft:450px');
	}
}

</script>