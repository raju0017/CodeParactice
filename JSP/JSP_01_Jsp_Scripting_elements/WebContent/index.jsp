<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body  bgcolor="lightblue">
<h2>Hi...Welcome to the Jsp world</h2>
<h1>
<br>=======Scriptlet tag Starts===============<br>
<% 
	String name = request.getParameter("name");
	out.print("Hi.."+name+"   Welcome to scriptlet tag");
%>
<br>=======Scriptlet tag ends===============<br>


<br>=======expression tag Starts===============<br>

<%= " Hi..."+name+"  welcome to Expression tag  " %><br>
Current time:<%=Calendar.getInstance().getTime() %>

<br>=======expression tag ends===============<br>


<br>=======declaration  tag Starts===============<br>
<%! int a=5;
	int b=10;
	int c =a*b;
	
	int cube(int n){
		return n*n*n;
	}
%>
<%=
"the Product of a&b="+c 
%>
<br>
<%= 
"the cube method  cube of 5 is "+cube(5)
%>
<br>=======declaration tag ends===============
</h1>
</body>
</html>