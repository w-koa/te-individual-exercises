package com.techelevator.validation.model;

import java.util.Date;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

public class Registration {

	@NotBlank(message = "*")
	@Size(max = 20, message = "Must be 20 characters or less")
	private String firstName;
	
	@NotBlank(message = "*")
	@Size(max = 20, message = "Must be 20 characters or less")
	private String lastName;
	
	@NotBlank(message = "*")
	@Email(message = "Invalid email address")
	private String email;
	private String confirmEmail;
//	private boolean emailMatching;	This appears to work without needing to exist
	
	@AssertTrue(message = "Emails must match")
    public boolean isEmailMatching() {
        if (email != null) {
            return email.equals(confirmEmail);
        }
        return true;
    }
	
	@NotBlank(message = "*")
	@Size(min = 8, message = "Password must be 8 or more characters")
	private String password;
	private String confirmPassword;
//	private boolean passwordMatching;
	
	@AssertTrue(message = "Passwords must match")
    public boolean isPasswordMatching() {
        if (password != null) {
            return password.equals(confirmPassword);
        }
        return true;
    }
	
	
	@NotNull(message = "*")
	@Past(message = "Must be a past date")
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date birthday;
	
	@NotNull(message = "*")
	@Min(value = 1, message = "Must be between 1 - 10")
	@Max(value = 10, message = "Must be between 1 - 10")
	private Integer numberOfTickets;
	
	
	// These Asserts did work, but needed to instantiate the attributes to empty strings
	// otherwise it would throw Null Pointer. 
	
//	@AssertTrue(message = "Passwords must match")
//	public boolean isPasswordMatching() {
//		boolean isMatching = (this.password.equals(this.confirmPassword));
//		return isMatching;
//	}
//	@AssertTrue(message = "Emails must match")
//	public boolean isEmailMatching() {
//		boolean isMatching = (this.email.equals(this.confirmEmail));
//		return isMatching;
//	}
	
	
	/* For reference
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
	public Integer getNumberOfTickets() {
		return numberOfTickets;
	}
	public void setNumberOfTickets(Integer numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	

}
