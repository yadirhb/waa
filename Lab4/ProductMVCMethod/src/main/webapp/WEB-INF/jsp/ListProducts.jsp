<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE HTML>
<html>
<head>
<title><spring:message code="title.saveProduct" /></title>
<style type="text/css">
@import url(resources/main.css);
</style>
</head>
<body>
	<div id="global">
		<h2><spring:message code="title.productList" /></h2>
		<table>
			<tr>
				<th><spring:message code="header.name" /></th>
				<th><spring:message code="header.category" /></th>
				<th><spring:message code="header.description" /></th>
			</tr>
			<c:forEach var="product" items="${products}">
				<tr>
					<td>${product.name}</td>
					<td>${product.category.name}</td>
					<td>${product.description}</td>
				</tr>
			</c:forEach>
		</table>

		<form action="product" method="get">
			<input id="submit" type="submit" value="<spring:message code="label.addProduct" />">
		</form>
	</div>
</body>
</html>