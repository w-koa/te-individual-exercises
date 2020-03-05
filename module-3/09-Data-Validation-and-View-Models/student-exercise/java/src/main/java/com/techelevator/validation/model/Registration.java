package com.techelevator.validation.model;

import java.time.LocalDate;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class Registration {

	@NotBlank(message = "*")
	@Max(value = 20, message = "Must be 20 characters or less")
	private String firstName;
	
	@NotBlank(message = "*")
	@Max(value = 20, message = "Must be 20 characters or less")
	private String lastName;
	
	@NotBlank(message = "*")
	@Email(message = "Invalid email address")
	private String email;
	
	@NotBlank(message = "*")
	private String confirmEmail;
	
	@NotBlank(message = "*")
	@Min(value = 8, message = "Password must be 8 or more characters")
	private String password;
	
	@NotBlank(message = "*")
	private String confirmPassword;
	
	@NotBlank(message = "*")
	@Pattern(regexp= "\\dd/\\MM\\/yyyy", message = "Value is not valid for Birthday")
	private LocalDate birthDate;
	
	@NotBlank(message = "*")
	@Min(value = 1, message = "Must be between 1 - 10")
	@Max(value = 10, message = "Must be between 1 - 10")
	private int numberOfTickets;
	/*
	 * First Name Required, Max Length (20) 
	 * Last Name Required, Max Length (20)
	 * Email Required, Valid Email Address 
	 * Confirm Email Must Match Email Password Required, Minimum Length (8) 
	 * Confirm Password Must Match Password 
	 * Birth Date Required, Valid Date 
	 * Number of Tickets Required, Valid Range (1 to 10)
	 */
	
	
	// Gets and Sets
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
	public String getConfirmEmail() {
		return confirmEmail;
	}
	public void setConfirmEmail(String confirmEmail) {
		this.confirmEmail = confirmEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public int getNumberOfTickets() {
		return numberOfTickets;
	}
	public void setNumberOfTickets(int numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}

}
