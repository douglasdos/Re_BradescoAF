<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<%@ page import="br.com.plusoft.csi.crm.helper.*"%>
<%@ page import="com.iberia.helper.Constantes"%>

<%@page import="br.com.plusoft.csi.adm.helper.MAConstantes"%>
<%@page import="br.com.plusoft.csi.adm.helper.Configuracoes"%>
<%@page import="br.com.plusoft.csi.adm.helper.ConfiguracaoConst"%>
<%@page import="br.com.plusoft.csi.adm.vo.CsCdtbEmpresaEmprVo"%>

<%@taglib uri="http://plusoft.tags.br/tags-plusoft" prefix="plusoft"%>

<%-- <%@include file="/resources/kernel/includes/funcoes.jsp"%> --%>


<% 
	CsCdtbEmpresaEmprVo empresaVo = (CsCdtbEmpresaEmprVo)request.getSession().getAttribute(MAConstantes.SESSAO_EMPRESA);
	response.setContentType("text/html");
	response.setHeader("Pragma","No-cache");
	response.setDateHeader("Expires",0);
	response.setHeader("Cache-Control","no-cache");
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" >
<html class="crm-funcoes-extras popup">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=8" />
    <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />

	<title>Identificação</title>

	<link rel="stylesheet" href="../resources/commons/css/ps.css">
	<link rel="stylesheet" href="dadosPessoa/identificacaoPessoa/css/identificacao.css">
	<link rel="stylesheet" href="dadosPessoa/identificacaoPessoa/css/iframeIdentificacao.css">

	<script src="../resources/commons/script/createElementsHTML5.js"></script>
</head>
<body>
	<html:form styleId="identificaForm">
		<html:hidden property="acao" styleId="acao" />
		<div class="line">
			<fieldset>
				<legend>Identificação</legend>
				<div class="inline">
					<label for="rdoFalorSombreSinistro" class="col-20">Falar Sobre?</label>
					<label for="rdoFalorSombreSinistro" class="col-2">
						<input type="radio" name="rdoFalorSombreSinistro" id="rdoFalorSombreSinistro" checked value="S">Sinistro
					</label>
					<label for="rdoFalorSombreApolice" class="col-2">
						<input type="radio" name="rdoFalorSombreSinistro" id="rdoFalorSombreApolice" value="A">Apólice
					</label>
				</div>
				<div class="line">
					<div class="col-10" id="divNome">
						<label for="pessNmPessoa">Nome</label>
						<input type="text" name="pessNmPessoa" id="pessNmPessoa">
					</div>
					
					<div class="col-1" id="divlupaNome"><input type="checkbox" name="lupaNome" id="lupaNome"></div>
					
					<div class="col-3">
						<label for="pessDhNascimento">Dt. Nascimento</label>
						<input type="text" name="pessDhNascimento" id="pessDhNascimento">
					</div>
					<div class="col-3">
						<label for="idChamCdChamado">Nº do Chamado</label>
						<input type="text" name="idChamCdChamado" id="idChamCdChamado">
					</div>

					<div class="col-2">
						<label for="pcomDsDdd">DDD</label>
						<input type="text" name="pcomDsDdd" id="pcomDsDdd">
					</div>
					
					<div class="col-1" id="divlupaDdd"><input type="checkbox" name="lupaDdd" id="lupaDdd"></div>
					
					<div class="col-4">
						<label for="pcomDsTelefone">Telefone</label>
						<input type="text" name="pcomDsTelefone" id="pcomDsTelefone">
					</div>
					
					<div class="col-1" id="divlupaTelefone"><input type="checkbox" name="lupaTelefone" id="lupaTelefone"></div>
					
				</div>
				<div class="line">
					<div class="col-4">
						<label for="pessDsCgccpf">CPF / CNPJ</label>
						<input type="text" name="pessDsCgccpf" id="pessDsCgccpf" value="">
						
					</div>
					<div class="col-1" id="divlupaCpf"><input type="checkbox" name="lupaCpf" id="lupaCpf" value="matmNrCpf"></div>
					<div class="col-4">
						<label for="dataOcorrencia">Data/Hora Ocorrência</label>
						<input type="text" name="dataOcorrencia" id="dataOcorrencia" class="col-14">
						<input type="text" name="horaOcorrencia" id="horaOcorrencia" class="col-10">
					</div>
					<div class="col-8">
						<label for="pcomDsComplemento">E-mail</label>
						<input type="text" name="pcomDsComplemento" id="pcomDsComplemento">
					</div>
					<div class="col-1" id="divlupaEmail"><input type="checkbox" name="lupaEmail" id="lupaEmail" value="matmDsEmail"></div>
				</div>
				<div class="line">
					<div class="col-14">
						<div style="text-align: center;background-color: #3E6173;color:#ffffff;" class="col-16">Nº Apólice</div>
						<div class="col-16">
							<div class="list" style="height:21px;overflow:hidden">
								<table>
									<thead>
										<tr>
											<th style="width: 50px;"><span>Sucursal</span></th>
											<th style="width: 60px;"><span>Cia</span></th>
											<th style="width: 70px;"><span>Ramo</span></th>
											<th style="width: 101px;"><span>Apólice</span></th>
										</tr>
									</thead>
								</table>
								<table>
									<tbody>
										<tr>
											<td style="width: 50px;"><input type="text" name="apol_Sucurcsal" id="apol_Sucurcsal" class="col-24"></td>
											<td style="width: 60px;"><input type="text" name="apol_Cia" id="apol_Cia" class="col-24"></td>
											<td style="width: 70px;"><input type="text" name="apol_Ramo" id="apol_Ramo" class="col-24"></td>
											<td style="width: 101px;"><input type="text" name="apol_Apolice" id="apol_Apolice" class="col-23"></td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
						<div class="col-8" style="margin-top:10px">
							<label for="nbrNSinistro">Sinistro</label>
							<input type="text" name="siasNrSinistro" id="siasNrSinistro">
						</div>
					</div>
				</div>
				<div class="inline align-right">
					<button type="button" class="lupa" id="btnBuscar"></button>
					<button type="button" class="naoIdentificado" id="btnNaoIdentificado"></button>
					<button type="button" class="historico" id="btnUltimaAtendida"></button>
					<button type="button" class="Novo" id="btnNovo"></button>
					<button type="button" class="cancelar" style="margin-right:15px" id="btnCancelar"></button>
				</div>
				<div class="line">
					<div class="line">
					<div class="list">
						<table>
							<thead>
								<tr>
									<th class="list-identificacao-col-nome"><span>Nome</span></th>
									<th class="list-identificacao-col-cpfcnpj"><span>CPF/CNPJ</span></th>
									<th class="list-identificacao-col-dt-nascimento"><span>Dt Nascimento</span></th>
									<th class="list-identificacao-col-ddd"><span>DDD</span></th>
									<th class="list-identificacao-col-telefone"><span>Telefone</span></th>
								</tr>
							</thead>
						</table>
						<table id="tabelaPessoa">
							<tbody>
<!-- 								<tr id="trClone" style="display: none;"> -->
<!-- 									<td class="list-identificacao-col-nome" id="tdNome"></td> -->
<!-- 									<td class="list-identificacao-col-cpfcnpj" id="tdCpfCnpj"></td> -->
<!-- 									<td class="list-identificacao-col-dt-nascimento" id="tdDataNascimento"></td> -->
<!-- 									<td class="list-identificacao-col-ddd" id="tdDdd"></td> -->
<!-- 									<td class="list-identificacao-col-telefone" id="tdTelefone"></td> -->
<!-- 								</tr> -->
								
								
								<tr id="trClone" style="display: none;">
									<td class="list-identificacao-col-nome"><span id="tdNome"></span></td>
									<td class="list-identificacao-col-cpfcnpj" ><span id="tdCpfCnpj"></span></td>
									<td class="list-identificacao-col-dt-nascimento" ><span id="tdDataNascimento"></span></td>
									<td class="list-identificacao-col-ddd" ><span id="tdDdd"></span></td>
									<td class="list-identificacao-col-telefone" ><span id="tdTelefone"></span></td>
								</tr>
								
								<tr id="trNenhumRegistroClone" style="display: none; position: absolute; width: 92%;height: 120px">
									<td class="pLP" style="width: 100%; height: 100% ;position: absolute; border: 0; text-align: center;" >
										<b><plusoft:message modulo="Crm"  key="prompt.nenhumregistro" /></b>
									</td>
								</tr>
							</tbody>
						</table>
					</div>

				</div>
			</fieldset>
		</div>					
		<div class="inline align-right">
			<button id="btnSair" type="button" class="out" style="margin-right:15px"></button>
		</div>
	</html:form>
	
	<div id="aguarde" style="position:absolute; left:300px; top:130px; width:203px; height:148px; z-index:10; visibility: hidden;e">
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
<script src="../resources/commons/script/ps.js" charset="iso-8859-1"></script>
<script src="dadosPessoa/identificacaoPessoa/js/identificacaoEspec.js" charset="UTF-8"></script>

<!--Ajuste do Chamado: 89000 - para compatibilidade com Chrome/Firefox e IE -->
<!--Alterado a posição do import porque no começo da página estava ocorrendo erro de javascript -->
<script language="JavaScript" src="/plusoft-resources/javascripts/funcoesMozilla.js"></script>

<script type="text/javascript">
	var CONS_CORIGEM      = '<%=request.getParameter("cOrigem")%>';
	var CONS_PESSOA       = '<%=request.getParameter("pessoa")%>';
	var CONS_TELEFONE     = '<%=request.getParameter("telefone")%>';
	var CONS_CLASSIFEMAIL = '<%=request.getParameter("classifEmail")%>';
	var CONS_EVADVERSO    = '<%=request.getParameter("evAdverso")%>';
	var CONS_CORRESP      = '<%=request.getParameter("corresp")%>';
	var CONS_CAMPOSCHAT   = '<%=request.getParameter("camposChat")%>';
	var CONS_NOME         = '<%=request.getParameter("NOME")%>';
	var CONS_TELEFONE     = '<%=request.getParameter("TELEFONE")%>';
	var CONS_EMAIL        = '<%=request.getParameter("EMAIL")%>';
	var CONS_DDD          = '<%=request.getParameter("DDD")%>';
	var CONS_CPFCNPJ      = '<%=request.getParameter("CPFCNPJ")%>';
	
	var CONS_ALERT_CAMPO_BUSCA 			  ='<plusoft:message modulo="Crm"  key="prompt.alert.campo.busca" />';
	var CONS_NOME_PRECISA_DE_NO_MINIMO_3  ='<plusoft:message modulo="Crm"  key="prompt.O_camp_Nome_precisa_de_no_minimo_3_letras_para_fazer_o_filtro"/>';
	var CON_CAMPO_BUSCA 				  ='<plusoft:message modulo="Crm"  key="prompt.alert.campo.busca"/>';
	
</script>

</html>