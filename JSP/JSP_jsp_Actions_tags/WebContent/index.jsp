<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>this is index page</h2>
<%-- <jsp:forward page="printdate.jsp"/> --%>

<%-- 
<jsp:forward page="printdate.jsp">
<jsp:param value="Nagaraju" name="name"/>
</jsp:forward>--%>
 
<%--  <jsp:include page="printdate.jsp"/>
 --%>
 <jsp:include page="printdate.jsp">
 <jsp:param value="king" name="name"/>
 </jsp:include>
 </body>
</html>