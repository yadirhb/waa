<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE HTML>
<html>
<head>
<title><spring:message code="title.productDetails" /></title>
<style type="text/css">
@import url(resources/main.css);
</style>
</head>
<body>
	<div id="global">
		<h4><spring:message code="message.productSaved" /></h4>

		<h5><spring:message code="label.details" /></h5>
		<spring:message code="label.productName" /> ${product.name}<br />
		<spring:message code="label.category" /> ${product.category.name}<br />
		<spring:message code="label.description" /> ${product.description}<br />
		<spring:message code="label.price" /> $${product.price}

		<form action="listproducts" method="get">
			<input id="submit" type="submit" value="<spring:message code="title.productList" />">
		</form>

	</div>
</body>
</html>