    NS4 = (document.layers) ? 1 : 0;
    IE4 = (document.all) ? 1 : 0;
   ver4 = (NS4 || IE4) ? 1 : 0;
  isMac = (navigator.appVersion.indexOf("Mac") != -1) ? 1 : 0;


//-----------------------------------------------------------------
//
// Funcoes utilizadas pelo navegador esquerdo
//
// Inicio
//
//-----------------------------------------------------------------


function onMinRestoreClick( Elem, ElemImg )
{
	if( Elem.style.display == "none" )
	{
		Elem.style.display = "";
		ElemImg.src = "../images/menuVert/\mais01.gif";
	}
	else
	{
		Elem.style.display = "none";
		ElemImg.src = "../images/menuVert/\menos.gif";
	}
}

function onCloseClick( Elem, ElemTitle )
{
	Elem.style.display = "none";
	ElemTitle.style.display = "none";
}


function onRefreshClick( Elem )
{
	Elem.src = Elem.src;
}
