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
<html class="crm-funcoes-extras popup">
<head>
    <meta charset="iso-8859-1">
    <meta http-equiv="X-UA-Compatible" content="IE=8">
    
    <title>Pesquisa de Sucursal</title>
    
    <link rel="stylesheet" href="../resources/commons/css/ps.css">

    <script src="../resources/commons/script/html5shiv.js"></script>
</head>
<body>
    <html:form action="/AbrirPesquisaSucursalRE.do" styleId="pesquisaSucursalForm">
        <div class="inline">
        	<fieldset>
        		<legend>Pesquisa de Sucursal</legend>
        		<div class="inline">
                    <fieldset>
                        <legend>Filtro</legend>
                        
                        <div class="inline">
							<div class="col-8"> 
								<label for="aure_ds_uf" class="col-3">UF</label>
								<select name="aure_ds_uf" id="aure_ds_uf" class="col-21"></select>
							</div>
							
							<div class="col-12"> 
								<label for="aure_ds_cidade" class="col-4">Cidade</label>
                            	<select name="aure_ds_cidade" id="aure_ds_cidade" class="col-20"></select>
                            	<input type="text" name="aure_ds_cidadeBusca" id="aure_ds_cidadeBusca" style="display: none;" class="col-20">
							</div>
							
							<div class="col-4"> 
								<button id="btnPesquisar" class="transparent btnCalendario" title="Pesquisar" type="button">
									<img src="../resources/assets/imgs/lupa.gif" height="15" width="15" alt="Pesquisar" id="imgBtnPesquisar">
								</button>
								
								<button id="btnCancelar" class="transparent btnCalendario" title="Cancelar" style="display: none;" type="button">
									<img src="../resources/assets/imgs/cancelar.gif" height="15" width="15" alt="Cancelar">
								</button>
							</div>
                        </div>
                    </fieldset>      
                </div>

                <div class="inline">
                    <fieldset>
                        <legend>Sucursal</legend>
                        <div class="line">
                            <div class="col-24">
                                <select name="listaSucursal" id="listaSucursal" multiple size="5"></select>
                            </div>
                        </div>
                    </fieldset>
                </div>

                <div class="inline">
                    <fieldset>
                        <legend>Detalhes</legend>
                        <div class="line">
							<div class="col-18"> 
								<label>Nome da Sucursal: </label>
								<input type="text" id="nome">
							</div>
							
							<div class="col-6"> 
								<label>Cod. da Sucursal: </label>
								<input type="text" id="codigo">
							</div>
                        </div>
                        
                        <div class="line">
							<div class="col-18"> 
								<label>Endereço: </label>
								<input type="text" id="endereco">
							</div>
							
							<div class="col-6"> 
								<label>Número: </label>
								<input type="text" id="numero">
							</div>
                        </div>
                        
                        <div class="line">
							<div class="col-9"> 
								<label>Complemento: </label>
								<input type="text" id="complemento">
							</div>
							
							<div class="col-4"> 
								<label>Cep: </label>
								<input type="text" id="cep">
							</div>
							
							<div class="col-11"> 
								<label>Bairro: </label>
								<input type="text" id="bairro">
							</div>
							
                        </div>
                        
                        <div class="line">
							<div class="col-18"> 
								<label>Cidade: </label>
								<input type="text" id="cidade">
							</div>
							
							<div class="col-6"> 
								<label>Telefone: </label>
								<input type="text" id="telefone">
							</div>
                        </div>
                    </fieldset>
                </div>
        	</fieldset>
        </div>
        <div class="inline align-right">
            <button type="button" class="out"></button>
        </div>
    </html:form>
</body>

<div id="aguarde" style="position:absolute; left:300px; top:130px; width:199px; height:148px; z-index:10; visibility: hidden;e">
  <div align="center">
   	<iframe src="/csicrm/webFiles/operadorapresenta/aguarde.jsp" width="100%" height="100%" scrolling="No" frameborder="0" marginwidth="0" marginheight="0"></iframe> 
  </div>
</div>


<script src="../resources/vendors/scripts/jquery-1.11.1.js"></script>
<script src="../resources/commons/script/ps.js"></script>
<script src="../crm/pesquisaSucursal/js/pesquisadesucursal.js"></script>

</html>