<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculation Form</title>
</head>
<body>
	<h2>Private Calculator</h2>
	<c:if test="${errors != null}">
     
     <p id="errors">
         Error(s)!
        <ul>
	        <c:forEach var="error" items="${errors}">
	            <li>${error}</li>
	        </c:forEach>
	    </ul>
 
     
 </c:if>
	<form action="calc" method="post">
		<input type = "text" name = "add1" size = "2"  value="${form.add1}" />+
		<input type = "text" name = "add2" value = "${form.add2}" size = "2"/><br/>
		<input type = "text" name = "mult1" value = "${form.mult1}" size = "2"/>*
		<input type = "text" name = "mult2" value = "${form.mult2}"  size = "2"/><br/>
		<input type = "submit" value = "Submit"/>
	</form>
</body>
</html>