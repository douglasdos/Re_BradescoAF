


_escapeHtml = true;
_highlightHandler = null;

byId = function() {
var elements = new Array();
for (var i = 0; i < arguments.length; i++) {
  var element = arguments[i];
  if (typeof element == 'string') {
        var el = document.getElementById(element);
	 if(el==null){
	   var arr = document.getElementsByName(element);

          if(arr!=null) { 
	      if(arr.length>0) {
                el = arr[0];
	      }
          }
	 }

	 element = el;
      }
      if (arguments.length == 1) {
        return element;
      }
      elements.push(element);
    }
    return elements;
};

cloneNode = function(ele, options) {
  ele = _getElementById(ele, "cloneNode()");
  if (ele == null) return null;
  if (options == null) options = {};
  var clone = ele.cloneNode(true);
  if (options.idPrefix || options.idSuffix) {
    _updateIds(clone, options);
  }
  else {
    _removeIds(clone);
  }
  ele.parentNode.insertBefore(clone, ele);
  return clone;
};

_getElementById = function(ele, source) {
  var orig = ele;
  ele = byId(ele);
  if (ele == null) {
   alert(source + " can't find an element with id: " + orig + ".");
  }
  return ele;
};

_updateIds = function(ele, options) {
	
  if (options == null) options = {};
  if (ele.id) {
    ele.setAttribute("id", (options.idPrefix || "") + ele.id + (options.idSuffix || ""));
  } 
  var children = ele.childNodes;
  for (var i = 0; i < children.length; i++) {
    var child = children.item(i);
    if (child.nodeType == 1 /*Node.ELEMENT_NODE*/) {
      _updateIds(child, options);
    }
  }
};

_removeIds = function(ele) {	
  if (ele.id) ele.removeAttribute("id");
  var children = ele.childNodes;
  for (var i = 0; i < children.length; i++) {
    var child = children.item(i);
    if (child.nodeType == 1 /*Node.ELEMENT_NODE*/) {
      _removeIds(child);
    }
  }
};

setValue = function(ele, val,tamanho, options) {

  if (val == null) val = "";
  if (options == null) options = {};

  if(tamanho != null)
	  val = getAcronym(val, tamanho)
  
  var orig = ele;
  if (typeof ele == "string") {
    ele = byId(ele);
    // We can work with names and need to sometimes for radio buttons, and IE has
    // an annoying bug where getElementById() returns an element based on name if
    // it doesn't find it by id. Here we don't want to do that, so:
    if (ele && ele.id != orig) ele = null;
  }
  var nodes = null;
  if (ele == null) {
    // Now it is time to look by name
    nodes = document.getElementsByName(orig);
    if (nodes.length >= 1) ele = nodes.item(0);
  }

  if (ele == null) {
    alert("setValue() can't find an element with id/name: " + orig + ".");
    return;
  }

  // All paths now lead to some update so we highlight a change
  highlight(ele, options);

  if (_isHTMLElement(ele, "select")) {
    if (ele.type == "select-multiple" && _isArray(val)) _selectListItems(ele, val);
    else _selectListItem(ele, val);
    return;
  }

  if (_isHTMLElement(ele, "input")) {
    if (ele.type == "radio" || ele.type == "checkbox") {
      if (nodes && nodes.length >= 1) {
        for (var i = 0; i < nodes.length; i++) {
          var node = nodes.item(i);
          if (node.type != ele.type) continue;
          if (_isArray(val)) {
            node.checked = false;
            for (var j = 0; j < val.length; j++)
              if (val[j] == node.value) node.checked = true;
          }
          else {
            node.checked = (node.value == val);
          }
        }
      }
      else {
        ele.checked = (val == true);
      }
    }
    else ele.value = val;

    return;
  }

  if (_isHTMLElement(ele, "textarea")) {
    ele.value = val;
    return;
  }

  // If the value to be set is a DOM object then we try importing the node
  // rather than serializing it out
  if (val.nodeType) {
    if (val.nodeType == 9 /*Node.DOCUMENT_NODE*/) val = val.documentElement;
    val = _importNode(ele.ownerDocument, val, true);

    ele.appendChild(val);

    return;
  }
  // Fall back to innerHTML and friends
  if (_shouldEscapeHtml(options) && typeof(val) == "string") {
	  
	if(val.indexOf("ACRONYM") > -1){
		ele.innerHTML = val;
		return;
	}
    if (ele.textContent) ele.textContent = val;
    else if (ele.innerText) val==''?ele.innerText = " ":ele.innerText = val;
    else ele.innerHTML = escapeHtml(val);
  }
  else {
    ele.innerHTML = val;
  }
};


getAcronym = function(texto, nr) {
	retorno = '';
	if (texto.length > nr) {
		retorno = "<ACRONYM title=\"" + texto + "\" style=\"border: 0\">";
		retorno += texto.substring(0, nr) + "...";
		retorno += "</ACRONYM>";
	} else {
		return texto;
	}
	
	return retorno;
}

highlight = function(ele, options) {
  if (options && options.highlightHandler) {
    options.highlightHandler(byId(ele));
  }
  else if (_highlightHandler != null) {
    _highlightHandler(byId(ele));
  }
};

_isHTMLElement = function(ele, nodeName) {
  if (ele == null || typeof ele != "object" || ele.nodeName == null) {
    return false;
  }
  if (nodeName != null) {
    var test = ele.nodeName.toLowerCase();
    if (typeof nodeName == "string") {
      return test == nodeName.toLowerCase();
    }
    if (_isArray(nodeName)) {
      var match = false;
      for (var i = 0; i < nodeName.length && !match; i++) {
        if (test == nodeName[i].toLowerCase()) {
          match =  true;
        }
      }
      return match;
    }
    alert("_isHTMLElement was passed test node name that is neither a string or array of strings");
    return false;
  }
  return true;
};

_shouldEscapeHtml = function(options) {
  if (options && options.escapeHtml != null) {
    return options.escapeHtml;
  }
  return _escapeHtml;
};


/**
 * @private Find multiple items in a select list and select them. Used by setValue()
 * @param ele The select list item
 * @param val The array of values to select
 */
_selectListItems = function(ele, val) {
  // We deal with select list elements by selecting the matching option
  // Begin by searching through the values
  var found  = false;
  var i;
  var j;
  for (i = 0; i < ele.options.length; i++) {
    ele.options[i].selected = false;
    for (j = 0; j < val.length; j++) {
      if (ele.options[i].value == val[j]) {
        ele.options[i].selected = true;
      }
    }
  }
  // If that fails then try searching through the visible text
  if (found) return;

  for (i = 0; i < ele.options.length; i++) {
    for (j = 0; j < val.length; j++) {
      if (ele.options[i].text == val[j]) {
        ele.options[i].selected = true;
      }
    }
  }
};

/**
 * @private Find an item in a select list and select it. Used by setValue()
 * @param ele The select list item
 * @param val The value to select
 */
_selectListItem = function(ele, val) {
  // We deal with select list elements by selecting the matching option
  // Begin by searching through the values
  var found = false;
  var i;
  for (i = 0; i < ele.options.length; i++) {
    if (ele.options[i].value == val) {
      ele.options[i].selected = true;
      found = true;
    }
    else {
      ele.options[i].selected = false;
    }
  }

  // If that fails then try searching through the visible text
  if (found) return;

  for (i = 0; i < ele.options.length; i++) {
    ele.options[i].selected = (ele.options[i].text == val);
  }
};

removeAllRows = function(ele, options) {
	  ele = _getElementById(ele, "removeAllRows()");
	  if (ele == null) return;
	  if (!options) options = {};
	  if (!options.filter) options.filter = function() { return true; };
	  if (!_isHTMLElement(ele, ["table", "tbody", "thead", "tfoot"])) {
	    alert("removeAllRows() can only be used with table, tbody, thead and tfoot elements. Attempt to use: " + _detailedTypeOf(ele));
	    return;
	  }
	  var child = ele.firstChild;
	  var next;
	  while (child != null) {
	    next = child.nextSibling;	   
	    if (options.filter(child)) {
	      ele.removeChild(child);
	    }
	    child = next;
	  }
	};	
	
removeAllNonPrototipeRows = function (trSufix, tableName){
	cont = 0;	
	while(document.getElementById(trSufix + cont)!=null){
		document.getElementById(tableName).deleteRow(document.getElementById(trSufix + cont).rowIndex);
		cont++;		
	}
	
};

_isArray = function(data) {
	  return (data && data.join);
	};	
	
var $;
if (!$) {
  $ = byId;
}	


function carregarComboAjax(combo, entity, statement, fieldValue, fieldLabel, filters) {
	var ajax = new ConsultaBanco(entity, "CarregarCombo.do");

	ajax.addField("statementName", statement);
	for(var i=5;i<arguments.length;i++) {
		ajax.addField(arguments[i], $(arguments[i]).value);
	}
	
	ajax.aguardeCombo($(combo));
	ajax.executarConsulta(
		function(ajax) {
			if(ajax.requestId < $(combo).lastRequestId) return;
			$(combo).lastRequestId = ajax.requestId;
			
			ajax.popularCombo($(combo), fieldValue, fieldLabel, $(combo).onloadvalue, true, false);
		}, true, true);
}

function carregarListaAjax(table, url, filters) {
	var ajax = new ConsultaBanco("", url);
	
	for(var i=2;i<arguments.length;i++) {
		ajax.addField(arguments[i], $(arguments[i]).value);
	}
	
	ajax.executarConsulta(
		function(ajax) {
			atualizarLista(table, ajax);
		}, true, true);
}

function carregarViewState(table) {
	var ajax = new ConsultaBanco("", "AbrirViewState.do");

	ajax.addField("listViewState", $($("tbl"+table).viewState).value);

	ajax.executarConsulta(function(ajax) { 
		atualizarLista(table, ajax);
		 }, true, true);
}


function incluirLista(table, indice, fields) {
	var ajax = new ConsultaBanco("", "AdicionarViewState.do");

	ajax.addField("listViewState", $($("tbl"+table).viewState).value);
	ajax.addField("indice", indice+"");
	
	for(var i=2;i<arguments.length;i++) {
		ajax.addField(arguments[i], $(arguments[i]).value);
	}

	ajax.executarConsulta(function(ajax) { 
		atualizarLista(table, ajax);
		 }, true, true);
}


function removerLista(table, indice) {
	if(!confirm("Deseja mesmo remover o item da lista?")) return false;
	 
	var ajax = new ConsultaBanco("", "RemoverViewState.do");

	ajax.addField("listViewState", $($("tbl"+table).viewState).value);
	ajax.addField("indice", indice+"");
	
	ajax.executarConsulta(function(ajax) { 
		atualizarLista(table, ajax);
		 }, true, true);
}

function atualizarLista(table, ajax) {
	var rowId = "row"+table;
	var tableId = "tbl"+table;
	var emptyId = "empty"+table;
	
	// Controla as requests para não atualizar uma tabela que já foi atualizada com registros velhos
	if(ajax.requestId < $(tableId).lastRequestId) return;
	$(tableId).lastRequestId = ajax.requestId;
	
	if(ajax.getMessage() != ''){
		showError(ajax.getMessage());
		return false; 
	}
	
	
	if($(tableId).viewState!="") 
		$($(tableId).viewState).value = ajax.getViewState();
	
	
	removeAllNonPrototipeRows(rowId, tableId);
	
	rs = ajax.getRecordset();

	
	// Inclui na tabela os itens da View administracao.jsp
	while(rs.next()){
		var indice = $(tableId).rows.length-1; // O -1 faz com que ele comece pelo índice "0" zero

		// Adiciona uma nova linha na tabela
		var newRow = cloneNode(rowId, { idSuffix: ""+indice });

		newRow.indice=indice;
		
		// Atualiza os atributos da linha da tabela com os dados do recordset
		for(var i=0;i< rs.getFieldNames().length;i++) {
			var f = rs.getFieldNames()[i];
			
			if(f) newRow.setAttribute(f, rs.get(f) );
		}
			
		// Atualiza as células da nova linha com os valores do registro
		var cl = new Number(newRow.indice)%2 == 0 ? "principalLstPar" : "principalLstImpar";
		for(var i=0;i<newRow.cells.length;i++) {
			f = newRow.cells[i].fieldName;

			if(f) {
				if(f.indexOf(".") > -1) f = f.substring(f.indexOf(".")+1);
				
				setValue(newRow.cells[i], rs.get(f), newRow.cells[i].acronymlen);
			}
			
			newRow.cells[i].className = cl;
			if(newRow.cells[i].onclick) newRow.cells[i].style.cursor='pointer';
			
		}
		
		newRow.style.display="block";
	}

	try {
		$(emptyId).style.display=($(tableId).rows.length == 1)?"block":"none";
	} catch(e) {}
	
	ajax = null;
}
