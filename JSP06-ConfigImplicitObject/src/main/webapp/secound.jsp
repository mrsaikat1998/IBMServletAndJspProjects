<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	out.println("<h1>Get Init Parameter : " + config.getInitParameter("dname") + "</h1>");
	out.print("<br><h1>Servlet Name is: " + config.getServletName() + "</h1>");
	%>
</body>
</html>