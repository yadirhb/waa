<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Starbuck's</title>
</head>
<body>
	<div>
		<h2 style="display: inline-block;">
			Starbuck's
			<c:out value="${roast}" />
			Roast Coffees:
		</h2>
		<div style="display: inline-block; float: right; margin: 10px 20px;">
			<form:form action="../logout" modelAttribute="user">
				<span>Welcome, <c:out value="${user.username}">Anonymus</c:out></span>
				<input type="submit" value="Logout" />
			</form:form>
		</div>
	</div>
	<form action="./form" method="get">
		<table>
			<c:forEach var="advice" items="${advices}" varStatus="loop">
				<tr
					style="background-color:${(loop.index) % 2 == 0 ? 'cyan' : 'yellow'}">
					<td><c:out value="${advice}" /></td>
				</tr>
			</c:forEach>
		</table>

		<input type="submit" value="Back" />
	</form>
</body>
</html>