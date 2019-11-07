package com.students.domain;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class Student {

	private Integer id;

	@NotEmpty(message = "{Error.firstName.notEmpty}")
	@Size(min = 2, max = 50, message = "{Error.name.size}")
	private String firstName = null;

	@NotEmpty(message = "{Error.lastName.notEmpty}")
	@Size(min = 2, max = 50, message = "{Error.name.size}")
	private String lastName = null;

	@Email(message = "{Error.email.invalid}")
	private String email = null;

	@Pattern(regexp = "(M|F|O|-){1}")
	private String gender = null;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull(message = "{Error.date.notNull}")
	@Past
	private Date birthday;

	@NotNull(message = "{Error.phone.notNull}")
	private Phone phone;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

}
