package com.techelevator.validation.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class Login {
	
	@NotBlank(message = "*")
	@Email(message = "Invalid email address")
	private String email;
	
	@NotBlank(message = "*")
	private String password;

}
