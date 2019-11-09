package edu.mum.cs.waa.starbucks.domain;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Advice {

	@NotNull(message = "The type cannot be null.")
	private Roast roast = Roast.medium;

	@NotBlank(message = "The name cannot be empty.")
	private String name;
	
	public Advice() {
		super();
	}

	public Advice(Roast roast, String name) {
		super();
		this.roast = roast;
		this.name = name;
	}

	public Roast getRoast() {
		return roast;
	}

	public void setRoast(Roast roast) {
		this.roast = roast;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
