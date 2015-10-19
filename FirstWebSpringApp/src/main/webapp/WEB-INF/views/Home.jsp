<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calc App</title>
</head>
<body>
	<%
		if (request.getAttribute("result") != null) {
	%>
	Result of previous request (<%=request.getParameter("submit")%>):
	<b><%=request.getParameter("operand1")%>,<%=request.getParameter("operand2")%>
		is <%=request.getAttribute("result")%></b>
	<%
		}
	%>

	<form action="mypath.spring" method="post">
		Operand 1:<input type="text" name="operand1" /><br /> 
		Operand 2:<input type="text" name="operand2" /><br /> 
		<input type="submit" name="submit" value="add"> 
		<input type="submit" name="submit" value="subtract">
	</form>
</body>
</html>