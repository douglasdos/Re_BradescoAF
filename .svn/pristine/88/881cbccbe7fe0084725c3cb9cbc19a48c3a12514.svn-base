<%@ taglib uri="http://plusoft.tags.br/tags-plusoft" prefix="plusoft" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@page import="java.util.Locale"%>

<%@page import="br.com.plusoft.csi.adm.helper.Configuracoes"%>
<%@page import="br.com.plusoft.csi.adm.helper.ConfiguracaoConst"%>

<%
	if(request.getSession().getAttribute("org.apache.struts.action.LOCALE") == null){
		request.getSession().setAttribute("org.apache.struts.action.LOCALE",new Locale("pt","br"));
	}
%>

<script src="../csiweb-bradescore/resources/vendors/scripts/jquery-1.11.1.js"></script>


<script language="JavaScript">

function travaCamposAtendimento(){
	//implementado no arquivo especifico
	
}
function travaCamposEndereco(){
	//implementado no arquivo especifico
}

function travaCamposTelefone(){
	//implementado no arquivo especifico
}


function travaObjGeralWindow(janela){
	//implementado no arquivo especifico
}

function pessoaPermiteEdicao(idChamCdChamado, maniNrSequencia, idTpmaCdTpManifestacao, idAsnCdAssuntoNivel){
	return true;
}

function validateEspec(par){
	
	var pessoaForm;
	
	if(document.getElementById("contatoForm") != undefined){
		pessoaForm = document.contatoForm;
	}else{
		pessoaForm = document.pessoaForm;
	}
	
	if (pessoaForm.pessInPfj[0].checked == false && pessoaForm.pessInPfj[1].checked == false) {
		alert('Selecione o tipo de pessoa "Física" ou "Jurídica"');
		bEnvia = true;
		return false;
	}
	
	if (Trim(pessoaForm.pessDsCpf.value) == '') {
		alert('O campo CPF / CNPJ é obrigatório');
		bEnvia = true;
		return false;
	}
	
	if (par==true && trim(pessoaForm.pessNmPessoa.value).length  < 3) {	
		alert('<plusoft:message modulo="Crm"  key="prompt.O_campo_Nome_deve_ter_no_minimo_3_letras"/>');
		
		if(pessoaForm.pessNmPessoa.disabled == false)
			pessoaForm.pessNmPessoa.focus();
		
		bEnvia = true;
		return false;
	}
	
	if (par == true && pessoaForm.pessInPfj[0].checked && !preencheHiddenSexo()){
// 		if (!confirm('<plusoft:message modulo="Crm"  key="prompt.alert.radio.sexo"/>')){
		alert('O campo Sexo é obrigatório');	
			bEnvia = true;
			return false;
// 		}
	}
	
	if (Trim(pessoaForm.idTpPublico.value) == '') {
		alert('O campo Tipo de Público é obrigatório');
		bEnvia = true;
		return false;
	}
	
	try {
		var iframeEndereco = document.getElementById('ifrmEndereco');
		var iframeFormaContato = iframeEndereco.contentWindow.document.getElementById('ifrmFormaContato');
		var iframeListaFormaCoontato = iframeFormaContato.contentWindow.document.getElementsByName('LstFormaContato')[0];
		
		if ( iframeListaFormaCoontato.contentWindow.window.getTotalItensLista() == 0 ) {
			alert('É necessário adicionar pelo menos um telefone');
			bEnvia = true;
			return false;
		}
		
		
	} catch (e) {}
	
	
// 	if (window.top.Critica_Formulario(pessoaForm)){
// //		MM_showHideLayers('Complemento','','hide');
// 		return true;
// 	}

	bEnvia = true;
	return true;
}

function Trim(str){
	return str.replace(/^\s+|\s+$/g,"");
}

//Metodo utilizado para fazer alguma acao quando a pessoa for identificada
function onLoadEspec(){
	
	if(parent.parent.parent != undefined && parent.parent.parent.esquerdo != undefined && parent.parent.parent.esquerdo.ifrm01 != undefined && parent.parent.parent.esquerdo.ifrm01.ctiApplet != undefined){				
		parent.parent.parent.esquerdo.ifrm01.iniciaApplet();
	}
	
		/*
	********************
	/ OCORRENCIA MASSIVA
	/ SETA O ID DE PESSOA AO IFRM QUE GERENCIA AS OCORRENCIAS, ELE RETORNA SE EXIBE POPUP E HABILITACAO DO ICONE
	/ DE OCORRENCIAS ATIVAS.
	********************
	*/
	
	<%if (Configuracoes.obterConfiguracao(ConfiguracaoConst.CONF_APL_MASSIVA,request).equals("S")) {%>
		
		if (window.name == 'dadosPessoa'){
			if(idPessAnt!=pessoaForm.idPessCdPessoa.value && top.esquerdo.ifrmOperacoes.document.getElementById("avisoOcorrencia")){
				top.esquerdo.ifrmOperacoes.document.getElementById("avisoOcorrencia").style.visibility='hidden';
			}
	
			if(idPessAnt!=pessoaForm.idPessCdPessoa.value && pessoaForm.idPessCdPessoa.value>0){
				if (window.top.esquerdo.comandos.validaCampanha() != "" && window.top.esquerdo.comandos.validaCampanha() != "0"){ // ATIVO
					top.superior.ifrmExibePopUp.location='CsNgtbOcorrenciamassivaOcma.do?tela=ifrmExibePopUp&idPessCdPessoa=' + pessoaForm.idPessCdPessoa.value + '&inPopRealisado=true';
				}else{//RECEPTIVO
					top.superior.ifrmExibePopUp.location='CsNgtbOcorrenciamassivaOcma.do?tela=ifrmExibePopUp&idPessCdPessoa=' + pessoaForm.idPessCdPessoa.value + '&inPopRecebido=true';
				}
				parent.parent.document.all.nContPess.value = "1";
			}
		}
		
	<%}%>
}

//Metodo executado quando o usuario altera o valor do combo tipo de publico
function cmbTipoPublico_onChangeEspec(){
}


//Metodo que faz a validacao do campo CpfCnpj
function validaCpfCnpjEspec(obj,setaFoco) {
      return ConfereCIC(obj,setaFoco);
}

//Chamado: 80357 - Carlos Nunes 07/02/2012
function validaEdicaoContato(id){
	return true;
}

</script>
