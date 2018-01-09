
var ajaxRequestController = 0;
/*************************************************************************************************
 Realiza uma consulta no banco.
 Com o resultado é possível popular um combo ou retornar um recordset para trabalhar como quiser.
 Este método chama sempre o select-by-desc do XML.
 
 urlXml --> caminho do XML para realizar a consulta
***************************************************************************************************/
function ConsultaBanco(urlXml, url){
	this.requestId = ajaxRequestController++;
	this.strBrancoComboPopular = "-- Selecione uma opção--";
	
	var erro;
	var xmlhttp;
	var objetoAtual = this;
	var arrayFieldName = new Array();
	var arrayFieldValue = new Array();
	
	//Request que será chamada para realizar as consultas
	var urlRequest = url==null?"/csicrm/ConsultaBanco.do":url;
	var params = "entity="+ urlXml
	//Adiciona um Field que será utilizado como CONDITION AND na consulta
	//Recebe o nome e o valor do campo
	this.addField = function(fieldName, fieldValue){
		indice = this.getFieldIndex(fieldName);
		if(indice!=null){
			arrayFieldValue[indice] = fieldValue;
		}else{
			arrayFieldName[arrayFieldName.length +1] = fieldName;
			arrayFieldValue[arrayFieldValue.length +1] = fieldValue;
		}		
		
		fieldValue = ""+fieldValue;

		if(urlXml!="") {
			while(fieldValue.indexOf('%')>-1){
				fieldValue = fieldValue.replace('%', '#');
			} 
		}
		fieldValue = url_escape(fieldValue);
		
		params += "&" + fieldName +"="+ fieldValue;				
	};
	
	this.getFieldIndex = function(fieldName){
		
		for ( var i = 0; i < arrayFieldName.length; i++) {
			if(arrayFieldName[i] == fieldName){
				return i;
			}
		}
		return null;
	};
	
	this.getField = function(fieldName){
		indice = this.getFieldIndex(fieldName)
		if(indice!=null){
			return arrayFieldValue[indice];
		}else{
			return null;
		}		
	};
	
	function url_escape(url) {
	    url = url.toString();
	    var regcheck = url.match(/[\x90-\xFF]/g);  
	    if ( regcheck )
	    {
	        for (var i = 0; i < i.length; i++)
	        {
	            url = url.replace(regcheck[i], '%u00' + (regcheck[i].charCodeAt(0) & 0xFF).toString(16).toUpperCase());
	        }
	    }

	    return escape(url).replace(/\+/g, "%2B");
	}
	/*******************************************************************************************
	 Popula o combo passado como parâmetro com o resultado da consulta
	 Recebe o Objeto Combo, o campo que será a descrição do combo e o vampo que será o valor
	********************************************************************************************/

	//Parametros internos utilizados na função popularCombo
	var comboPopular;
	var valorComboPopular;
	var descricaoComboPopular;
	var valorSelecionadoComboPopular;
	var optionBrancoComboPopular;
	var funcRetornoComboPopular;
	var xmlNodeRetorno;	
	var retornoConsulta;
	var retViewState;
	var retMens;
		
	this.executarConsulta = function(funcRetorno, retornarViewState, retornarMensagem){	
		retornoConsulta = funcRetorno;
		
		if(retornarViewState==null || retornarViewState=='')
			retornarViewState = false;
		
		if(retornarMensagem==null || retornarMensagem=='')
			retornarMensagem = false;
		
		retViewState = retornarViewState;
		retMens = retornarMensagem;
			
		this.addField("retornarViewState", "" + retornarViewState);
		this.addField("retornarMensagem", "" + retornarMensagem);
		this.chamarURL(params, "POST", urlRequest);
	};
	
	this.getXmlNodeConsulta = function() {
		if(xmlNodeRetorno.childNodes.length==0) {
			if(xmlNodeRetorno.parseError) {
				alert('Erro no parse do Xml\n\nreason:'+xmlNodeRetorno.parseError.reason+
						'\nline:'+xmlNodeRetorno.parseError.line+
						'\ncode:'+xmlNodeRetorno.parseError.errorCode);
			} else {
				alert('Xml Vazio.');
			}
			
			return null;
		} else {
			return xmlNodeRetorno.childNodes[xmlNodeRetorno.childNodes.length-1];
		}
	}
		
	
	this.getXmlNodeRetorno = function(){
		return xmlNodeRetorno;			
	};
	
	this.getViewState = function(){
		if(xmlNodeRetorno == null){
			alert('Resultado não Retornado.');
			return;
		}
		if(this.getXmlNodeConsulta().childNodes[1].childNodes[0]==null){
			return '';
		}else{
			return this.getXmlNodeConsulta().childNodes[1].childNodes[0].nodeValue;
		}
	};
	
	
	this.getMessage = function(){
		if(xmlNodeRetorno == null){
			alert('Resultado não Retornado.');
			return;
		}
		
		var message = this.getXmlNodeConsulta().childNodes[2].childNodes[0];
		if(message!=null) {
			if(message.nodeValue) {
				return message.nodeValue;
			}
		} 
		
		return "";
	};
	
	this.popularCombo = function(objCombo, valor, descricao, valorSelecionado, optionBranco, funcRetorno){
		comboPopular = objCombo;
		valorComboPopular = valor;
		descricaoComboPopular = descricao;
		valorSelecionadoComboPopular = valorSelecionado;
		optionBrancoComboPopular = optionBranco;
		funcRetornoComboPopular = funcRetorno;
		if(xmlNodeRetorno == null){
			alert('Resultado não Retornado.');
			return;
		}
		
		this.retornoPopulaCombo(xmlNodeRetorno);
	};
	
	this.aguardeCombo = function(objCombo) {
		while(objCombo.length > 0)
			objCombo.remove(0);
		
		var item = new Option();
		item.value = "";
		item.text = "-- Aguarde ... --";
		addOptionCombo(objCombo, item, null);
	}

	
	//Trata o retorno da chamada do métoro popularCombo e popula o combo desejado
	this.retornoPopulaCombo = function(fields){
		var item;
		var atributos;
		rs = this.getRecordset();
		
		while(comboPopular.length > 0)
			comboPopular.remove(0);
		
		if(optionBrancoComboPopular){
			item = new Option();
			item.value = "";
			
			item.text = this.strBrancoComboPopular;
			addOptionCombo(comboPopular, item, null);
		}
		
		while(rs.next()){
			item = new Option();
			item.value = rs.get(valorComboPopular);
			item.text = rs.get(descricaoComboPopular);
			
			addOptionCombo(comboPopular, item, null);
			
			if(funcRetornoComboPopular != "")
				funcRetornoComboPopular();
		}
		
		comboPopular.value = valorSelecionadoComboPopular;
		
		if(comboPopular.selectedIndex == -1)
			comboPopular.selectedIndex = 0;
		
		if(rs.getSize()==1)
			comboPopular.selectedIndex = 1;
		
		this.processaViewState(this.getViewState());
		
		// Após posicionar deve disparar o evento
		try {
			comboPopular.onchange();
		} catch(e) {}
		
	}
	
	this.processaViewState = function(viewstate){

	}
	
	/**********************************************
	 Retorna o recordset com o retorno da consulta
	**********************************************/
	
	var funcRetornoRecordset;
	
	this.getRecordset = function(funcRetorno){
		funcRetornoRecordset = funcRetorno;
		
		if(xmlNodeRetorno == null){			
			return null;
		}
		return this.retornoGetRecordset();
		
	};
	
	//Trata o retorno e monta o recordset
	this.retornoGetRecordset = function(){

		var atributos;
		var vo;
		var recordset = new Recordset();
		
		fields = this.getXmlNodeConsulta().childNodes[0];
		for(var i = 0; i < fields.childNodes.length; i++){
			if(fields.childNodes[i].nodeType == 1){
				atributos = fields.childNodes[i];
				vo = new Field();
				
				for(var j = 0; j < atributos.childNodes.length; j++){
					if(atributos.childNodes[j].nodeType == 1){
						vo.add(atributos.childNodes[j].getAttribute("name"), atributos.childNodes[j].getAttribute("value"));
					}
				}
				
				recordset.add(vo);
			}
		}
	
		return recordset;
	};
	
	/******************************************************************************
	 Chama uma URL passando parâmetros por GET ou POST
	 
	 pRequestFormId	--> Nome do Form POST
	 pGetPost		--> GET ou POST, default é GET
	 pURL			--> A URL que será chamada pela função com AJAX
	 pCallback		--> A função que receberá o retorno do AJAX, vazio para nenhum
	*******************************************************************************/
	this.chamarURL = function(pRequestFormId, pGetPost, pURL){	
		erro == null;
		
		var queryString = null;
		if (pGetPost == "POST" && pRequestFormId != "") {
			queryString = pRequestFormId;
		}
		try { 
			xmlhttp = new ActiveXObject("Msxml2.XMLHTTP"); 
		} catch (e) { 
			try { 
				xmlhttp = new ActiveXObject("Microsoft.XMLHTTP"); 
			} catch (E) { 
				xmlhttp = false; 
			} 
		} 

		if  (!xmlhttp && typeof XMLHttpRequest != 'undefined' ) { 
			try  { 
				xmlhttp = new  XMLHttpRequest(); 
			} catch  (e) { 
				xmlhttp = false ; 
			} 
		} 

		xmlhttp.onreadystatechange = this.processResponse;
		xmlhttp.open(pGetPost, pURL, true);
		xmlhttp.setRequestHeader("charset","ISO-8859");   
		xmlhttp.setRequestHeader("Encoding","ISO-8859");   
		xmlhttp.setRequestHeader("X-Requested-With", "");   

		if (pGetPost == "POST") {
			xmlhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
			xmlhttp.setRequestHeader("Content-length", pRequestFormId.length);
			xmlhttp.setRequestHeader("Connection", "close");
		}else{
			xmlhttp.setRequestHeader('Content-Type','text/xml'); 		
		}
		xmlhttp.send(queryString);
		
	};

	/************************************************************************
	 Função chamada pela 'chamarURL()' para definir o retorno da URL chamada
	*************************************************************************/
	this.processResponse = function() {		
		if (xmlhttp.readyState == 4) {
			if(xmlhttp.status == 200) {
				xmlNodeRetorno = xmlhttp.responseXML;
				retornoConsulta(objetoAtual);
			}
			else { // Problemas
				erro = 'Problema: ' + xmlhttp.statusText + ' - (' + xmlhttp.status + ')';
				if(erro.indexOf('Unknown')> -1){					
					objetoAtual.executarConsulta(retornoConsulta,retViewState, retMens)
				}else{
					alert(erro);
				}
			}
		}
		
	};
	

	/****************************************************************************
	 Objeto que permite navegar pelos registros retornados por uma ConsultaBanco
	****************************************************************************/
	function Recordset(){
		var registrosArray = new Array();
		var size = 0;
		var curr = -1;
		

		//Move para o próximo registro
		//Retorna FALSE caso esteja no último registro
		this.next = function(){
			if(curr == (size -1))
				return false;
			else
				curr++;
				
			return true;
		}
		
		//Adiciona uma linha no RECORDSET
		//Recebe um objeto FIELD
		this.add = function(linha){
			registrosArray[size] = linha;
			size++;
		};
		
		//Retorna o valor da coluna passada como parametro da linha atual do recordset
		this.get = function(nomeColuna){
			return registrosArray[curr].get(nomeColuna);
		};
		
		//Retorna o número do registro atual
		this.getCurr = function(){
			return curr;
		};
		
		//Retorna o tamanho do recordset
		this.getSize = function(){
			return size;
		};
		
		//Retorna a lista de campos do registro
		this.getFieldNames = function(){
			return registrosArray[curr].getFieldNames();
		}
		
		
		
	}

	/******************************************
	 Objeto utilizado pelo Recordset.
	 Representa uma linha dentro do Recordset.
	*******************************************/
	function Field(){
		var coluna = new Array();
		var fieldNames = new Array();
		var fieldCount = 0;
		
		//Adiciona um valor para o field
		//Recebe nome e valor
		this.add = function(nomeColuna, valor){
			if(coluna[nomeColuna] == undefined) {
				fieldNames[fieldCount++] = nomeColuna;
				coluna[nomeColuna] = valor;
			}
			
		};
		
		//Retorna o valor passado como parametro de dentro do field
		this.get = function(nomeColuna){
			return coluna[nomeColuna];
		};
		
		//Retorna a lista de campos do Registro
		this.getFieldNames = function(){
			return fieldNames;
		}
		

	}

}
