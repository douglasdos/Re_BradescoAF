<%
//	boolean CONF_VARIEDADE = true, CONF_CONSUMIDOR = true, CONF_SEMLINHA = true, CONF_SUPERGRUPO = true, CONF_BUSCACODCORPPRAS = true;
//	String TELA_MANIF = "";

	boolean inverterCmbManifestacao = false, inverterBuscaCodPras = false;
	String divCmbAsn1 = "", divCmbAsn2 = "", divCmbLinha = "", divCmbCodCorpPras1 = "", divCmbCodCorpPras2 = "", divCmbManifestacao1 = "", 
			divCmbManifestacao2 = "", divCmbSegmento = "", divCmbGrupoManif = "", divCmbTipoManif = "", divDescontinuado = "", divGrupoCmb1 = "",
			divGrupoCmb2 = "", divBtn1 = "", divBtn2 = "", imgCaractPras = "", divProdutoAssunto = "";

	//Valores padrão dos grupos de combos da esquerda e da direita
	divGrupoCmb1 = "float: left; width: 365px;";
	divGrupoCmb2 = "float: right; width: 380px;";
	divBtn1 = "padding-top: 45px; float: left;";
	divBtn2 = "padding-top: 65px; float: right;";
	divCmbCodCorpPras1 += "width: 40px; margin-top: 7px;";
	divCmbCodCorpPras2 += "width: 40px; margin-top: 7px;";
	imgCaractPras = "display: none;";
	
	//Mostrando ou escondendo os campos conforme as configurações
	if(!CONF_VARIEDADE){
		divCmbAsn2 = "display: none;";
		divCmbCodCorpPras2 += "display: none;";
	}
	else{
		inverterBuscaCodPras = true;
		divCmbCodCorpPras1 += "display: none;";
	}
		
	if(!CONF_CONSUMIDOR)
		divDescontinuado = "display: none;";
	
	if(CONF_SEMLINHA)
		divCmbLinha = "display: none;";
	
	if(!CONF_SUPERGRUPO)
		divCmbSegmento = "display: none;";
	
	if(!CONF_BUSCACODCORPPRAS){
		divCmbCodCorpPras1 = "display: none;";
		divCmbCodCorpPras2 = "display: none;";
	}
	
	//Definindo o Layout conforme os padrões
	//PADRAO1
	if(TELA_MANIF.equals("PADRAO1")){

		divDescontinuado += "left: 530px;";
		divProdutoAssunto += "left: 400px;";
		
		//Invertendo a tela
		divGrupoCmb1 = "float: right; width: 400px;";
		divGrupoCmb2 = "float: left; width: 380px;";
		divBtn1 = "top: 60px; left: 375px; position: absolute;";
		divBtn2 = "top: 82px; left: 792px; position: absolute;";
		
		//Definindo o layout
		divCmbManifestacao1 += "padding-top: 5px; width: 180px;";
		divCmbManifestacao2 += "display: none;";
		divCmbSegmento += "padding-top: 5px; width: 175px;";
		divCmbGrupoManif += "padding-top: 5px; width: 175px;";
		
		if(CONF_SUPERGRUPO)
			divCmbTipoManif += "padding-top: 5px; width: 185px;";
		else
			divCmbTipoManif += "padding-top: 5px; width: 362px;";

		if(!CONF_SEMLINHA){
			divCmbLinha += "width: 375px;";
			
			if(CONF_VARIEDADE){
				divCmbAsn1 += "width: 190px;";
				
				if(CONF_BUSCACODCORPPRAS)
					divCmbAsn2 += "padding-top: 5px; width: 140px;";
				else
					divCmbAsn2 += "padding-top: 5px; width: 180px;";
			}
			else{
				if(CONF_BUSCACODCORPPRAS)
					divCmbAsn1 += "width: 335px;";
				else
					divCmbAsn1 += "width: 375px;";
			}
		}
		else{
			if(!CONF_VARIEDADE && CONF_BUSCACODCORPPRAS){
				divCmbAsn1 += "width: 335px;";
			}
			else{
				divCmbAsn1 += "width: 375px;";
				if(CONF_BUSCACODCORPPRAS)
					divCmbAsn2 += "padding-top: 5px; width: 335px;";
				else
					divCmbAsn2 += "padding-top: 5px; width: 375px;";
			}
		}
	}
	//PADRAO2
	else if(TELA_MANIF.equals("PADRAO2")){
		
		divDescontinuado += "left: 290px;";
		divProdutoAssunto += "left: 170px;";
		
		if(!CONF_SEMLINHA){
			divCmbLinha += "width: 362px;";
			
			if(CONF_VARIEDADE){
				divCmbAsn1 += "width: 190px;";
				
				if(CONF_BUSCACODCORPPRAS)
					divCmbAsn2 += "padding-top: 5px; width: 131px;";
				else
					divCmbAsn2 += "padding-top: 5px; width: 171px;";
			}
			else{
				if(CONF_BUSCACODCORPPRAS)
					divCmbAsn1 += "width: 322px;";
				else
					divCmbAsn1 += "width: 362px;";
			}
			
			divCmbManifestacao1 += "padding-top: 5px; width: 190px;";
			divCmbManifestacao2 += "display: none;";
			divCmbSegmento += "padding-top: 5px; width: 190px;";
			divCmbGrupoManif += "padding-top: 5px; width: 190px;";
			
			if(CONF_SUPERGRUPO)
				divCmbTipoManif += "padding-top: 5px; width: 185px;";
			else
				divCmbTipoManif += "padding-top: 5px; width: 375px;";
		}
		else{
			if(!CONF_VARIEDADE && CONF_BUSCACODCORPPRAS){
				divCmbAsn1 += "width: 322px;";
			}
			else{
				divCmbAsn1 += "width: 362px;";
				if(CONF_BUSCACODCORPPRAS)
					divCmbAsn2 += "padding-top: 5px; width: 322px;";
				else
					divCmbAsn2 += "padding-top: 5px; width: 362px;";
			}

			if(CONF_VARIEDADE){
				divCmbManifestacao1 += "padding-top: 5px; width: 190px;";
				divCmbManifestacao2 += "display: none;";
				divCmbGrupoManif += "padding-top: 5px; width: 190px;";
			}
			else{
				inverterCmbManifestacao = true;
				divCmbManifestacao1 += "display: none;";
				divCmbManifestacao2 += "padding-top: 5px; width: 362px;";
				if(CONF_SUPERGRUPO)
					divCmbGrupoManif += "padding-top: 5px; width: 190px;";
				else
					divCmbGrupoManif += "padding-top: 5px; width: 375px;";
			}
			
			if(CONF_VARIEDADE && CONF_SUPERGRUPO)
				divCmbTipoManif += "padding-top: 5px; width: 185px;";
			else
				divCmbTipoManif += "padding-top: 5px; width: 375px;";
			
			divCmbSegmento += "padding-top: 5px; width: 190px;";
		}
	}
	//PADRAO3
	else if(TELA_MANIF.equals("PADRAO3")){
		divGrupoCmb1 = "width: 800px;";
		divGrupoCmb2 = "width: 800px;";
		divBtn1 = "top: 60px; left: 365px; position: absolute;";
		divBtn2 = "top: 82px; left: 792px; position: absolute;";
		
		divDescontinuado += "left: 290px;";
		divProdutoAssunto += "left: 170px;";
		
		if(!CONF_SEMLINHA){
			if(CONF_VARIEDADE){
				divCmbLinha += "width: 190px;";
				divCmbAsn1 += "width: 190px;";
				if(CONF_BUSCACODCORPPRAS)
					divCmbAsn2 += "padding-top: 5px; width: 355px;";
				else
					divCmbAsn2 += "padding-top: 5px; margin-left: 20px; width: 375px;";
			}
			else{
				divCmbLinha += "width: 370px;";
				
				if(CONF_BUSCACODCORPPRAS){
					divCmbAsn1 += "width: 322px;";
					divCmbCodCorpPras1 = "width: 50px; margin-top: 7px; margin-left: 10px;";
				}
				else
					divCmbAsn1 += "margin-left: 30px; width: 362px;";
			}
			
			divCmbManifestacao1 += "padding-top: 5px; width: 190px;";
			divCmbManifestacao2 += "display: none;";
			divCmbSegmento += "padding-top: 5px; width: 178px;";

			if(CONF_SUPERGRUPO){
				divCmbGrupoManif += "padding-top: 5px; margin-left: 30px; width: 190px;";
				divCmbTipoManif += "padding-top: 5px; width: 185px;";
			}
			else{
				divCmbGrupoManif += "padding-top: 5px; width: 178px;";
				divCmbTipoManif += "padding-top: 5px; margin-left: 32px; width: 375px;";
			}
		}
		else{
			if(CONF_VARIEDADE){
				divCmbAsn1 += "width: 190px;";
				
				if(CONF_BUSCACODCORPPRAS)				
					divCmbAsn2 += "width: 150px; padding-top: 5px";
				else
					divCmbAsn2 += "width: 190px; padding-top: 5px";
			}
			else{
				if(CONF_BUSCACODCORPPRAS)
					divCmbAsn1 += "width: 330px;";
				else
					divCmbAsn1 += "width: 370px;";
			}

			inverterCmbManifestacao = true;
			divCmbManifestacao1 += "display: none;";
			divCmbManifestacao2 += "padding-top: 5px; margin-left: 30px; width: 370px;";
			divCmbSegmento += "padding-top: 5px; width: 180px;";
			
			if(CONF_SUPERGRUPO)
				divCmbGrupoManif += "padding-top: 5px; width: 172px;";
			else
				divCmbGrupoManif += "padding-top: 5px; width: 355px;";
			
			divCmbTipoManif += "padding-top: 5px; margin-left: 48px; width: 370px;";
		}
	}
	//PADRAO4
	else if(TELA_MANIF.equals("PADRAO4")){
		imgCaractPras = "display: block;";
		divCmbSegmento += "padding-top: 5px; width: 190px;";
		
		divDescontinuado += "left: 290px;";
		divProdutoAssunto += "left: 170px;";
		
		if(!CONF_SEMLINHA){
			
			if(CONF_VARIEDADE){
				divCmbLinha += "width: 170px;";
				divCmbAsn1 += "width: 185px;";
				
				if(CONF_BUSCACODCORPPRAS)
					divCmbAsn2 += "padding-top: 5px; width: 320px;";
				else
					divCmbAsn2 += "padding-top: 5px; width: 360px;";
			}
			else{
				divCmbLinha += "width: 362px;";
				
				if(CONF_BUSCACODCORPPRAS)
					divCmbAsn1 += "width: 322px;";
				else
					divCmbAsn1 += "width: 362px;";
			}
			
			divCmbManifestacao1 += "padding-top: 5px; width: 180px;";
			divCmbManifestacao2 += "display: none;";
			divCmbGrupoManif += "padding-top: 5px; width: 190px;";
			
			if(CONF_SUPERGRUPO)
				divCmbTipoManif += "padding-top: 5px; width: 185px;";
			else
				divCmbTipoManif += "padding-top: 5px; width: 375px;";
		}
		else{
			if(CONF_VARIEDADE){
				divCmbManifestacao1 += "padding-top: 5px; width: 190px;";
				divCmbManifestacao2 += "display: none;";
				divCmbGrupoManif += "padding-top: 5px; width: 190px;";
				divCmbAsn1 += "width: 362px;";
				
				if(CONF_BUSCACODCORPPRAS)
					divCmbAsn2 += "width: 322px;";
				else
					divCmbAsn2 += "width: 362px;";
			}
			else{
				inverterCmbManifestacao = true;
				divCmbManifestacao1 += "display: none;";
				divCmbManifestacao2 += "padding-top: 5px; width: 362px;";
				
				if(CONF_SUPERGRUPO)
					divCmbGrupoManif += "padding-top: 5px; width: 190px;";
				else
					divCmbGrupoManif += "padding-top: 5px; width: 375px;";
				
				if(CONF_BUSCACODCORPPRAS)
					divCmbAsn1 += "width: 322px;";
				else
					divCmbAsn1 += "width: 362px;";
			}
			
			if(CONF_SUPERGRUPO && CONF_VARIEDADE)
				divCmbTipoManif += "padding-top: 5px; width: 185px;";
			else
				divCmbTipoManif += "padding-top: 5px; width: 375px;";
		}
	}

%>


<style type="text/css">
	#divCmbAsn2, #divCmbAsn1, #divCmbLinha, #divCmbCodCorpPras1, #divCmbCodCorpPras2, #divCmbManifestacao1, 
	#divCmbManifestacao2, #divCmbSegmento, #divCmbGrupoManif, #divCmbTipoManif{
		float: left;
		padding-left: 	2px;
		margin-top: 	2px;
	}

	#imgCaractPras{
		margin-left:10px;
		<%=imgCaractPras%>
	}

	#divDescontinuado{
		float: left; 
		margin-left: 5px;
		position: absolute;
		<%=divDescontinuado%>
	}
	
	#divProdutoAssunto{
		float: left; 
		margin-left: 5px;
		position: absolute;
		<%=divProdutoAssunto%>
	}

	#divBtn1{<%=divBtn1%>}

	#divBtn2{<%=divBtn2%>}

	#divGrupoCmb1{<%=divGrupoCmb1%>}
	
	#divGrupoCmb2{<%=divGrupoCmb2%>}
	
	#divCmbSegmento{<%=divCmbSegmento%>}
	
	#divCmbGrupoManif{<%=divCmbGrupoManif%>}

	#divCmbManifestacao1{<%=divCmbManifestacao1%>}
	
	#divCmbManifestacao2{<%=divCmbManifestacao2%>}
	
	#divCmbTipoManif{<%=divCmbTipoManif%>}
	
	#divCmbSegmento{<%=divCmbSegmento%>}
	
	#divCmbLinha{<%=divCmbLinha%>}
	
	#divCmbCodCorpPras1{<%=divCmbCodCorpPras1%>}
	
	#divCmbAsn1{<%=divCmbAsn1%>}
	
	#divCmbCodCorpPras2{<%=divCmbCodCorpPras2%>}
	
	#divCmbAsn2{<%=divCmbAsn2%>}
</style>

<script type="text/javascript">
	function layoutCombos(){
		<%if(inverterBuscaCodPras){%>
			document.getElementById("divCmbCodCorpPras2").innerHTML = document.getElementById("divCmbCodCorpPras1").innerHTML;
			document.getElementById("divCmbCodCorpPras1").innerHTML = "&nbsp;";
		<%}%>

		<%if(inverterCmbManifestacao){%>
			document.getElementById("divCmbManifestacao2").innerHTML = document.getElementById("divCmbManifestacao1").innerHTML;
			document.getElementById("divCmbManifestacao1").innerHTML = "&nbsp;";
			//cmbProdAssunto.submeteForm();
		<%}%>
	}
</script>