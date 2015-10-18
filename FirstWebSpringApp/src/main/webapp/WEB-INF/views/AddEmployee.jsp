<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Registration</title>
</head>
<body>
	<i><form:errors path="EmpDetails.name" /><br /> <br /> <form:errors
			path="EmpDetails.deptno" /> </i>
	<form action="addEmployee.spring" method="post">
		<pre>
Employee Number:<input type="text" name="empno" />
Name:<input type="text" name="name" />
Job:<input type="text" name="job" />
Manager ID:<input type="text" name="mgr" />
Salary:<input type="text" name="sal" />
Commition:<input type="text" name="comm" />
Department No:<input type="text" name="deptno" />

<input type="submit" value="Add employee" />
</pre>
	</form>
</body>
</html>