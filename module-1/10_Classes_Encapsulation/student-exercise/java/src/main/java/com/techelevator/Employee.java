package com.techelevator;

public class Employee {

	// Attributes
	private int employeeId;
	private String firstName;
	private String lastName;
	private String fullName;
	private String department;
	private double annualSalary;
	
	// Constructor
	public Employee(int employeeId, String firstName, String lastName, double salary) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.annualSalary = salary;
	}
	//Getters and Setters
	public int getEmployeeId() {
		return employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFullName() {
		return this.fullName = lastName + ", " + firstName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	
	// Methods
	public void raiseSalary(double percent) {
		this.annualSalary = annualSalary + (annualSalary * (percent / 100));
	}
	
//	employeeId 	int 	X 		The employee id.
//	firstName 	string 	X 		The employee's first name.
//	lastName 	string 	X 	X 	The employee's last name.
//	fullName (derived) 	string 	X 		The employee's full name.
//	department 	string 	X 	X 	The employee's department.
//	annualSalary 	double 	X 		The employee's annual salary.
}
