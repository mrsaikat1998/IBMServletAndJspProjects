<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String dividend=request.getParameter("dividend");
		String divisor=request.getParameter("divisor");
		int dividendNo=Integer.parseInt(dividend);
		int divisorNo=Integer.parseInt(divisor);
		int quotient=dividendNo/divisorNo;
		out.println("Quotient Value : "+quotient);
	%>
</body>
</html>