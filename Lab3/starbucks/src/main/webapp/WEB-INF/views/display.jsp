<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Starbuck's</title>
</head>
<body>
	<h2>
		Starbuck's
		<c:out value="${roast}" />
		Roast Coffees:
	</h2>
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