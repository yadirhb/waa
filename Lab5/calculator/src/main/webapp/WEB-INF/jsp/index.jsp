<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><spring:message code="title.formPage" /></title>
</head>
<body>
	<h2>
		<spring:message code="title.formPage" />
	</h2>
	<c:if test="${errors != null}">
		<p id="errors">Error(s)!
		<ul>
			<c:forEach var="error" items="${errors}">
				<li><c:out value="${error}" /></li>
			</c:forEach>
		</ul>
	</c:if>
	<form:form method="post" modelAttribute="calculator">
		<form:input path="add1" size="2" />+
		<form:input path="add2" size="2" />=
		<c:out value="${sum}">0</c:out>
		<br />
		<form:input path="mult1" size="2" />* 
		<form:input path="mult2" size="2" />=
		<c:out value="${product}">0</c:out>
		<br />
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>