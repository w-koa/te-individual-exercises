package com.techelevator.dog;

public class Dog {

	private boolean isSleeping;

	public boolean isSleeping() {
		return isSleeping;
	}

	public void setSleeping(boolean isSleeping) {
		this.isSleeping = isSleeping;
	}
	
	public Dog() {
		this.isSleeping = false;
	}
	
	public String makeSound() {
		if (isSleeping) {
			return "Zzzzz...";
		} else return "Woof!";
	}

	public void sleep() {
		this.isSleeping = true;
	}
	
	public void wakeUp() {
		this.isSleeping = false;
	
	}
	
	
//	Dog
//	Constructors
//	Signature 	Description
//	Dog() 	Default constructor. All new dogs are awake by default.
//	Data Members
//	Attribute 	Data Type 	Get 	Set 	Description
//	isSleeping 	boolean 	X 		true if the dog is asleep, false if not. All new dogs are awake by default.
//	Methods
//	Method Name 	Return Type 	Description
//	makeSound() 	string 	Returns "Zzzzz..." if the dog is asleep. Returns "Woof!" if the dog is awake.
//	sleep() 	void 	Sets isSleeping to true.
//	wakeUp() 	void 	Sets isSleeping to false.
	
}
