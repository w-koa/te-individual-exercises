package com.techelevator.person;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	public boolean isAdult() {
		return age >= 18;
	}
	
	
//	Constructors
//	Signature 	Description
//	Person() 	Default constructor.
//	Data Members
//	Attribute 	Data Type 	Get 	Set 	Description
//	firstName 	String 	X 	X 	The first name of the person.
//	lastName 	String 	X 	X 	The last name of the person.
//	age 	int 	X 	X 	The age of the person.
//	Methods
//	Method Name 	Return Type 	Description
//	getFullName() 	string 	Returns the first and last name of the person separated by a space. For instance, "Sonny Koufax".
//	isAdult() 	bool 	Returns true if the person is 18 or older.
}
