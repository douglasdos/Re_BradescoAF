<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@page import="java.util.Locale"%>

<%
	if(request.getSession().getAttribute("org.apache.struts.action.LOCALE") == null){
		request.getSession().setAttribute("org.apache.struts.action.LOCALE",new Locale("pt","br"));
	}
%>

<script language="JavaScript">

</script>