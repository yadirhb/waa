# Web Application Architecture (WAA)

## Lab 08

This folder contains the RestfulEmployee modified according to the Lab08 specifications.

First Iteration: Added controller request methods in EmployeeController and in the front-end.

### Notes: 

1 - Added this code in the front-end error ````make_visible('errors') // Fixed the name of the component, different as in lecture slides.```

```javascript
if (errorObject.responseJSON.errorType == "ValidationError") {
	$('#success').html("");
	$("#errors").append(
			'<H3 align="center"> Error(s)!! <H3>');
	$("#result").append('<p>');
	var errorList = errorObject.responseJSON.errors;
	$.each(errorList, function(i, error) {
		$("#errors").append(error.message + '<br>');
	});
	$("#errors").append('</p>');
	make_visible('errors');
} else {
	alert(errorObject.responseJSON.errors(0)); // "non" Validation Error
}
```