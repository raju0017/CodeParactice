<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<c:set var ="a" value="10" scope="session"/>
<c:set var ="b" value="0" scope="session"/><br>

<c:out value="${a }"/><br>
<c:out value="${b }"/><br>

<c:remove var="a"/>
<c:out value="${a }"/><!-- the a value is null here  -->

<c:out value="${a/b }"></c:out>

<c:catch>
<c:set var="c" value="10/0"/>
<c:out value="${c }"></c:out>
</c:catch>



</center>


</body>
</html>