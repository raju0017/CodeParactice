<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<%!int eid;
	String ename;
	double esal;%>

		<%
			eid = Integer.parseInt(request.getParameter("eid"));
			ename = request.getParameter("ename");
			esal = Double.parseDouble(request.getParameter("esal"));
		%>
		<jsp:useBean id="eb" class="com.EmpBean" scope="page" />
		<jsp:setProperty property="eid" name="eb" value="<%=eid%>" />
		<jsp:setProperty property="ename" name="eb" value="<%=ename%>" />
		<jsp:setProperty property="esal" name="eb" value="<%=esal%>" />

		<h3>
			**********Employee Details**********<br>
		Employee id		:	<jsp:getProperty property="eid" name="eb" /><br> 
		Employee name 	:	<jsp:getProperty property="ename" name="eb" /><br> 
		Employee salary	:	<jsp:getProperty property="esal" name="eb" /><br>
		</h3>
	</center>
</body>
</html>