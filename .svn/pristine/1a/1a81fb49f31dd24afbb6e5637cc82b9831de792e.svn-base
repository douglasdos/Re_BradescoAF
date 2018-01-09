<%@page import="br.com.plusoft.csi.adm.helper.MAConstantes"%>
<%@page import="br.com.plusoft.csi.adm.vo.CsCdtbEmpresaEmprVo"%>
<%@page import="java.util.ResourceBundle"%>
<%@page import="com.plusoft.plugin.classloader.PluginRegister"%>
<%@page import="com.plusoft.plugin.classloader.PlusoftClassloader"%>
<%@page import="java.util.Locale"%>
<%@ page import="br.com.plusoft.fw.util.*"%>

<%!
	
	/**
	* Esta rotina tem como objetivo limitar o tamanho da string
	* para que a mesma nao ultrapasse o tamanho prÃ© determinado
	*/
	String acronym(String texto, int len){
		String result = null;
		if (texto == null || texto.equals(""))
			result = "&nbsp;";
		else{
			texto = Tools.strReplace("'", "\\\'", texto);
			if (texto.length() > len) {
				result = "<ACRONYM title=\"" + texto + "\" style=\"border: 0\">" +
						 texto.substring(0, len) + "...</ACRONYM>";
			} else {
				result = texto;
			}
		}
		return result;
	}
	
	String acronymChar(String texto, int len){
		String result = null;
		
		if (texto == null || texto.equals(""))
			result = "&nbsp;";
		else{
			texto = Tools.strReplace("\\", "\\\\", texto);
			texto = Tools.strReplace("'", "&prime;", texto);
			texto = Tools.strReplace("\"", "&quot", texto);
			
			if (texto.length() > len) {
				result = "<ACRONYM title=\"" + texto + "\" style=\"border: 0\">" +
						 texto.substring(0, len) + "...</ACRONYM>";
			} else {
				result = texto;
			}
		}
		return result;
	}

	String readCharHtml(String texto){
		String result = null;
		if (texto == null || texto.equals("")){
			result = "&nbsp;";
		}else{
			texto = Tools.strReplace("\n", "<BR>", texto);
			texto = Tools.strReplace("\\", "\\\\", texto);
			texto = Tools.strReplace("'", "\\\'", texto);
			texto = Tools.strReplace("\"", "&quot", texto);
			result = texto;
		}
		return result;
	}

	/**
	* Este metodo tem como objetivo retornar a String de acordo com o idioma selecionado.
	*/
	String getMessage(String key, HttpServletRequest request){
		String idioma = ((Locale)request.getSession().getAttribute("org.apache.struts.action.LOCALE")).getLanguage();
		String desc = null;		
		try{
			CsCdtbEmpresaEmprVo empresaVo = (CsCdtbEmpresaEmprVo)request.getSession().getAttribute(MAConstantes.SESSAO_EMPRESA);
			//Tenta objter a informação no arquivo especifico
			PlusoftClassloader plugin = PluginRegister.getPlugin(empresaVo.getIdEmprCdEmpresa());
			ResourceBundle appConf = null;
			if(plugin != null)
				appConf = java.util.ResourceBundle.getBundle("ApplicationResourcesEspec_" + idioma,((Locale)request.getSession().getAttribute("org.apache.struts.action.LOCALE")),plugin);
			else
				appConf = java.util.ResourceBundle.getBundle("ApplicationResourcesEspec_" + idioma);
			desc = appConf.getString(key);
			}catch(Exception e){
			try{
				//Tenta objter a informação no arquivo do kernel
				java.util.ResourceBundle appConf = java.util.ResourceBundle.getBundle("ApplicationResourcesCrm_" + idioma);
				desc = appConf.getString(key);	
			}catch(Exception x){
				throw new com.plusoft.util.AppException("com.plusoft.util.PropertiesFile", "Não foi possível obter a descricao de acordo com o idioma("+ idioma + ") com o nome (" + key + ").", e);
			}
		}
		return desc;

	}

%>

<script>
// Pega as funções do window.top e disponibiliza a todas as janelas por acesso direto
// Se for Firefox seta o dialogArguments
var wnd = window.top;

if(wnd == undefined)	
	wnd = window;

try {
	if(window.opener != undefined && window.dialogArguments == undefined){
		window.dialogArguments = window.opener.objDialogArguments;
	}
} catch(x){}

while(wnd.dialogArguments!=null) {
	wnd = wnd.dialogArguments;
}

if (window.navigator.appVersion.indexOf("MSIE") == -1) {
	showModalDialog = wnd.showModalDialog; 		
}

//Habilita o readyState no FireFox
if(!this.document.readyState) {
	addEventListener('DOMContentLoaded', onReadyStateChangeFF, false);
}

function onReadyStateChangeFF() {
	this.document.readyState = 'complete';
}
</script>
