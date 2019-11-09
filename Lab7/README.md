# Web Application Architecture (WAA)

## Lab 07

This folder contains the EmployeeValidDemo modified according to the Lab07 specifications.

First Iteration: Added internationalization to EmployeeValidDemo application.

Notes:

- Configure the Multipart inside the JavaConfig in the Dispatcher.class

```java
    @Bean
	public MultipartResolver multipartResolver() {
		CommonsMultipartResolver bean = new CommonsMultipartResolver();
		bean.setMaxUploadSizePerFile(10240000);
		return bean;
	}
```

- Added dependency in the pom file to enable multipart uploads.

```xml
	<dependency>
		<groupId>commons-fileupload</groupId>
		<artifactId>commons-fileupload</artifactId>
	</dependency>
```