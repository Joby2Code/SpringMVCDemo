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
<br />
<c:choose>
	<c:when test="${empty requestScope.empdetails}">
		<fmt:message key="searchResult.noresult" />
	</c:when>
	<c:otherwise>
		<table border="1">
			<tr>
				<th><fmt:message key="empno" /></th>
				<th><fmt:message key="ename" /></th>
				<th><fmt:message key="job" /></th>
				<th><fmt:message key="mgr" /></th>
				<th><fmt:message key="hiredate" /></th>
				<th><fmt:message key="sal" /></th>
				<th><fmt:message key="comm" /></th>
				<th><fmt:message key="deptno" /></th>
			</tr>
			<c:forEach items="${requestScope.empdetails }" var="emp">
				<tr>
					<td><c:out value="${emp.empno }"/></td>
					<td><c:out value="${emp.name }"/></td>
					<td><c:out value="${emp.job }"/></td>
					<td><c:out value="${emp.mgr }"/></td>
					<td><c:out value="${emp.hiredate }"/></td>
					<td><c:out value="${emp.sal }"/></td>
					<td><c:out value="${emp.comm }"/></td>
					<td><c:out value="${emp.deptno }"/></td>
				</tr>
			</c:forEach>
		</table>
	</c:otherwise>
</c:choose>
<br />
<fmt:message key="searchResult.searchAgain" />
<a href="/WEB-INF/views/Search.jsp"> <fmt:message key="searchResult.click" />
</a>
</body>
</html>