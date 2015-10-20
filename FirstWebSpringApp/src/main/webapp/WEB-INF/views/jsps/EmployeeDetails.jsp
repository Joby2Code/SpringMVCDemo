<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title><fmt:message key="search.result.title" /></title>
</head>
<body>
	<fmt:message key="searchResult.header" />
	<c:choose>
		<c:when test="${empty requestScope.empdetails }">
			<fmt:message key="searchResult.noresult" />
		</c:when>
		<c:otherwise>
			<table border="0">
				<tr align="left">
					<th><fmt:message key="empno" /></th>
					<td>:<c:out value="${requestScope.empdetails.empno}" /></td>
				</tr>
				<tr align="left">
					<th><fmt:message key="ename" /></th>
					<td>:<c:out value="${requestScope.empdetails.name}" /></td>
				</tr>
				<tr align="left">
					<th><fmt:message key="job" /></th>
					<td>:<c:out value="${requestScope.empdetails.job}" /></td>
				</tr>
				<tr align="left">
					<th><fmt:message key="mgr" /></th>
					<td>:<c:out value="${requestScope.empdetails.mgr}" /></td>
				</tr>
				<tr align="left">
					<th><fmt:message key="hiredate" /></th>
					<td>:<c:out value="${requestScope.empdetails.hiredate}" /></td>
				</tr>
				<tr align="left">
					<th><fmt:message key="sal" /></th>
					<td>:<c:out value="${requestScope.empdetails.sal}" /></td>
				</tr>
				<tr align="left">
					<th><fmt:message key="comm" /></th>
					<td>:<c:out value="${requestScope.empdetails.comm}" /></td>
				</tr>
				<tr align="left">
					<th><fmt:message key="deptno" /></th>
					<td>:<c:out value="${requestScope.empdetails.deptno}" /></td>
				</tr>
			</table>
		</c:otherwise>
	</c:choose>

	<br />
	<fmt:message key="searchResult.searchAgain" />
	<a href="Search.jsp"> <fmt:message key="searchResult.click" />
	</a>

</body>

</html>