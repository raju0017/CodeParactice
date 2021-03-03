<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Directives</title>
</head>
<body bgcolor="lightgreen">
<%@page import = "java.util.Date" %>
<%-- <%@ page contentType=application/msword %>   --%>
<%@page info = "Composed by Nagaraj" %>
<%@ page buffer = '16kb' %><!--  default is 8kb -->
<%@page isELIgnored="true" %><!-- by default false -->
<%@page isThreadSafe="false" %><!-- now it is Threadsafe -->
<%@page errorPage="MyerrorPage.jsp" %>
<%@page isErrorPage="false" %>
<%@include file="header.html" %>

ToDay Date:<%= new Date() %>




</body>
</html>