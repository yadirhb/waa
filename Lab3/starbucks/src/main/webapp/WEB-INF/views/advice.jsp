<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Starbuck's</title>
</head>
<body>
<h2>Ask for advice about your favorite roast:</h2>
<p />
<form action = "./" method="get">
<select name="roast" >
  <option value="-">--Choose Roast--</option>
  <option value="dark">Dark</option>
  <option value="medium">Medium</option>
  <option value="light">Light</option>
</select>
<br/><br/>
<input type="submit" value = "Submit" />
</form>
</body>
</html>