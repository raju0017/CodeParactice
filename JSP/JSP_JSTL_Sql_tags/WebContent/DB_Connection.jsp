<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jstl/sql" prefix="sql"%>
<%@page isELIgnored="true"%>

<center><b><font size="7">
<sql:setDataSource driver="oracle.jdbc.driver.OracleDriver" 
url="jdbc:oracle:thin:@localhost:1521:xe" user="system" password="system"/>
<sql:update var="result" sql="create table emp1(eid number, ename varchar2(10), esal number)"/>
Row Count ...... <c:out value="${result}"/>

</font></b></center>
</body>
</html>