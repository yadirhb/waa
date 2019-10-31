package edu.mum.cs.waa.starbucks.domain;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class User {

	@NotBlank(message = "The password cannot be null.")
	private String password;

	@NotBlank(message = "The username cannot be empty.")
	private String username;

	public User() {
		super();
	}
	
	public User(String username, String password) {
		super();
		this.password = password;
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
