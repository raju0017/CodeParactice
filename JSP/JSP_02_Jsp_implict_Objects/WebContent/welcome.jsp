<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<%
//implicit response Object
response.setContentType("text/html");

//implicit request Object
String name = request.getParameter("name");
String pwd = request.getParameter("pwd");

//implicit out Object
out.println("welcome "+name);
out.println("<br>");
//response.sendRedirect("http://www.google.com");

//implicit config object
String driver = config.getInitParameter("driver");
out.println("driver= "+driver);
out.println("<br>");

//implicit application(Context) Object
String context=application.getInitParameter("Application");
out.print("application Context "+context);
out.println("<br>");

//implici session object
session.setAttribute("password", pwd);

//<a href="=second.jsp">second jsp page</a> 


// pageContextimplicit Object
pageContext.setAttribute("application", context,pageContext.APPLICATION_SCOPE);

%>
<a href="second.jsp">second jsp page</a>  

</body>
</html>	