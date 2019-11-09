<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE HTML>
<html>
<head>
<title><spring:message code="title.productForm" /></title>
<style type="text/css">
@import url(resources/main.css);
</style>
</head>
<body>
	<div id="global">
		<form:form modelAttribute="product" action="product" method="post">
			<fieldset>
				<legend><spring:message code="title.productForm" /></legend>
				<p>
					<label for="category"><spring:message code="label.category" /></label>
					<form:select id="category" path="category.id">
						<form:option value="-1"><spring:message code="default.category" /></form:option>
						<form:options items="${categories}" itemLabel="name"
							itemValue="id" />
					</form:select>
				</p>

				<p>
					<label for="name"><spring:message code="label.productName" /></label> <input type="text"
						id="name" name="name">
				</p>
				<p>
					<label for="description"><spring:message code="label.description" /></label> <input type="text"
						id="description" value="${product.description}" name="description">
				</p>
				<p>
					<label for="price"><spring:message code="label.price" /></label> <input type="text" id="price"
						name="price">
				</p>
				<p id="buttons">
					<input id="submit" type="submit" value="<spring:message code="label.addProduct" />">
			</fieldset>
		</form:form>
	</div>
</body>
</html>
