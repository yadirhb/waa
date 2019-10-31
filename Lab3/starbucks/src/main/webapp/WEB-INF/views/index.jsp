<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Starbuck's</title>
</head>
<body>
	<h2>Ask for advice about your favorite roast:</h2>
	<p />
	<form action="./advice" method="get">
		<select name="roast" disabled>
			<option value="-">--Choose Roast--</option>
			<option value="dark">Dark</option>
			<option value="medium">Medium</option>
			<option value="light">Light</option>
		</select> <br />
		<br /> <input type="submit" value="Submit" disabled />
	</form>
	<div id='advice'></div>
	<p />
	Login:
	<form:form modelAttribute="user" action="./login" method="post">
		Name: <input type="text" name="username" size="9" /><br /> Password: <input
			type="password" name="password" size="9" /><br /> <br /> <input
			type="submit" value="Log In" />
	</form:form>
</body>
</html>