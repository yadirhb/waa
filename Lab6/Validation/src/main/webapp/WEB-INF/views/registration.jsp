<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>

	<h1>Registration Form</h1>
	<br />
	<form:form modelAttribute="student" action="registration" method="post">
		<fieldset>
			<legend>Student data:</legend>
			<div>
				<label for="firstName">First Name:</label>
				<form:input id="firstName" path="firstName" />
				<br />
				<form:errors path="firstName" cssStyle="color : red;" />
			</div>
			<div>
				<label for="lastName">Last Name:</label>
				<form:input id="lastName" path="lastName" />
				<br />
				<form:errors path="lastName" cssStyle="color : red;" />
			</div>
			<div>
				<label for="email">Email:</label>
				<form:input id="email" path="email" type="email" />
				<br />
				<form:errors path="email" cssStyle="color : red;" />
			</div>
			<div>
				<label for="gender">Gender:</label>
				<form:select id="gender" path="gender">
					<option value="-">--Select Gender--</option>
					<option value="M">Male</option>
					<option value="F">Female</option>
					<option value="O">Other</option>
				</form:select>
				<br />
				<form:errors path="gender" cssStyle="color : red;" />
			</div>
			<div>
				<label for="birthday">Birth date:</label>
				<form:input id="birthday" path="birthday" type="date"
					pattern="\d{4}/\d{2}/\d{2}" />
				<br />
				<form:errors path="birthday" cssStyle="color : red;" />
			</div>
			<div>
				<label>Phone number:</label> (
				<form:input path="phone.area" pattern="\d{3}" size="1" />
				) -
				<form:input path="phone.prefix" pattern="\d{3}" size="1" />
				-
				<form:input path="phone.number" pattern="\d{4}" size="2" />
				<br />
				<form:errors path="phone.*" cssStyle="color : red;" />
			</div>
			<br /> <input type="submit" name="saveStudent" value="Register" />
		</fieldset>
	</form:form>






































</body>
</html>