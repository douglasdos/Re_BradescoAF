
//Configuracao default da modal caso seja passado em branco
var dFeatures = 'dialogHeight: 450px; dialogWidth: 1049px; dialogTop: 646px; dialogLeft: 4px; edge: Raised; center: Yes; help: Yes; resizable: Yes; status: Yes;';//default features

//Objeto para armazenar o modal dialog
var modalWin = "";

//Objeto que guarda o dialogArguments do modal para caso o url dentro dele mude que ele continue enxergando
var objDialogArguments = "";

try{
	if(window.opener != undefined && window.dialogArguments == undefined){
		window.dialogArguments = window.opener.objDialogArguments;
	}
}
catch(x){}



/*************************************************************************
 Se o browser não for o IE, aplica uma função para mostrar o modal dialog
**************************************************************************/

document.write("<div onclick=\"checkFocus();\" onmousemove=\"checkFocus();\" id=\"divTravaTudo\" style=\"visibility: hidden; position: absolute; top: 0; left: 0; height: 100%; width: 100%; opacity:0.4;filter:alpha(opacity=40); background-color: #CDCDCD; z-index: 500; \"></div>");

function showModalOpen(sURL, vArguments, sFeatures){
		//if (sURL==null||sURL==''){
		//	alert ("Invalid URL input.");
			//return false;
		//}
		if (vArguments==null||vArguments==''){
			vArguments='';
		}
		if (sFeatures==null||sFeatures==''){
			sFeatures=dFeatures;
		}
		
		sFeatures = sFeatures.replace(/ /gi,'');
		aFeatures = sFeatures.split(";");
		sWinFeat = "directories=0,menubar=0,titlebar=0,toolbar=0,dependent=yes,dialog=yes,minimizable=no,modal=yes,alwaysRaised=yes,";
		
		var scrollbars = false;
		for ( x in aFeatures ){
			aTmp = aFeatures[x].split(":");
			sKey = aTmp[0].toLowerCase();
			sVal = aTmp[1];
			switch (sKey){
				case "dialogheight":
					sWinFeat += "height="+sVal+",";
					pHeight = sVal;
					break;
				case "dialogwidth":
					sWinFeat += "width="+sVal+",";
					pWidth = sVal;
					break;
				case "dialogtop":
					sWinFeat += "screenY="+sVal+",";
					break;
				case "dialogleft":
					sWinFeat += "screenX="+sVal+",";
					break;
				case "resizable":
					sWinFeat += "resizable="+sVal+",";
					break;
				case "status":
					sWinFeat += "status="+sVal+",";
					break;
				case "scroll":
					if ( sVal.toLowerCase() == "no" )
						sWinFeat += "scrollbars=0,";
					else
						sWinFeat += "scrollbars=1,";
										
					scrollbars = true;
					break;
				case "center":
					if ( sVal.toLowerCase() == "yes" ){
						sWinFeat += "screenY="+((screen.availHeight-pHeight)/2)+",";
						sWinFeat += "screenX="+((screen.availWidth-pWidth)/2)+",";
					}
					break;
			}
		}
		
		//Se a propriedade scroll não for definida, coloca scroll por default
		if(!scrollbars)
			sWinFeat += "scrollbars=1,";
				
		window.top.modalWin=window.open(String(sURL),"",sWinFeat,true);
		if (vArguments!=null&&vArguments!=''){
			window.top.modalWin.dialogArguments = vArguments;
			objDialogArguments = vArguments;
		}
		
		window.top.document.getElementById("divTravaTudo").style.visibility = "visible";
		
		return window.top.modalWin;
}


if (window.navigator.appVersion.indexOf("MSIE") == -1){	
	window.showModalDialog = function(sURL, vArguments, sFeatures){
		return showModalOpen(sURL, vArguments, sFeatures);		
	}
}



/********************************************
 Função para controlar o foco do modalDialog
********************************************/
function checkFocus(){
	if (modalWin != null && !modalWin.closed){
		try {
			modalWin.focus();
		} catch(e) {}
	}
	else{
		document.getElementById("divTravaTudo").style.visibility = "hidden";
		objDialogArguments = "";
	}
}

/***************************************************************************************
O trecho abaixo é para funcionar o window.status.readyState
***************************************************************************************/
if(!this.document.readyState) {
	addEventListener('DOMContentLoaded', onReadyStateChangeFF, false);
}

function onReadyStateChangeFF() {
	this.document.readyState = 'complete';
}