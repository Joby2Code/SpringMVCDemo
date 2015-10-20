<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<fmt:setBundle basename="en" />
<html>
<head>
<title><fmt:message key="search.title" /></title>
</head>
</html>
<body>
	<form action="search.spring" method="post">
		<table border="0">
			<tr>
				<td><fmt:message key="search.label" /></td>
				<td><input type="text" name="searchKey" /></td>
			</tr>
			<tr>
				<td><fmt:message key="search.searchby" /></td>
				<td><select name="searchBy">
						<option value="searchByEmpno">EmployeeNumber</option>
						<option value="searchByEname">EmployeeName</option>
						<option value="searchByJob">Job</option>
						<option value="searchByDeptno">Department Number</option>
				</select></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					name="submit" value="<fmt:message key="search.submit"/>" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><fmt:message key="search.desc" /></td>
			</tr>

		</table>





	</form>
</body>
</html>