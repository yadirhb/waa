<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Starbuck's</title>
</head>
<body>
	<div>
		<h2 style="display: inline-block;">Ask for advice about your
			favorite roast:</h2>
		<div
			style="display: inline-block; float: right; margin: 10px 20px;">
			<form:form action="../logout" modelAttribute="user">
				<span>Welcome, <c:out value="${user.username}">Anonymus</c:out></span>
				<input type="submit" value="Logout" />
			</form:form>
		</div>
	</div>
	<p />
	<form action="./" method="get">
		<select name="roast">
			<option value="-">--Choose Roast--</option>
			<option value="dark">Dark</option>
			<option value="medium">Medium</option>
			<option value="light">Light</option>
		</select> <br /> <br /> <input type="submit" value="Submit" />
	</form>
</body>
</html>