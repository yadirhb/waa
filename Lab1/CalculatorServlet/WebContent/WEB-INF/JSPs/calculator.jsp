<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculation Form</title>
</head>
<body>
	<h2>Private Calculator</h2>
	<form action="calc" method="post">
		<input type = "text" name = "add1" size = "2"  value = "" />+
		<input type = "text" name = "add2" value = "" size = "2"/><br/>
		<input type = "text" name = "mult1" value = "" size = "2"/>*
		<input type = "text" name = "mult2" value = ""  size = "2"/><br/>
		<input type = "submit" value = "Submit"/>
	</form>
</body>
</html>