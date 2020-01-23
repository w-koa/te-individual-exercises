package com.techelevator;

public class Dog {
	// Data members or data variables
	private boolean has4Legs;
	private int cutenessFactor;
	private String name;
	
	// Constructor - Default 
	public Dog() {
		this.has4Legs = true;
		this.cutenessFactor = 5;
		this.name = "Spot";
	}
	
	// Constructor - using Parameters. Considered Overloaded because there are two methods of same name.
	public Dog(String name, int cutenessFactor, boolean has4Legs) {
		this.name = name;
		this.cutenessFactor = cutenessFactor;
		this.has4Legs = has4Legs;
	}
	
	// Setters
	public void setHas4Legs (boolean has4Legs) {
		this.has4Legs = has4Legs;
	}
	public void setCutenessFactor (int cutenessFactor) {
		this.cutenessFactor = cutenessFactor;
	}
	public void setName (String name) {
		this.name = name;
	}
	
	// Getters
	public boolean getHas4Legs() {
		return has4Legs;
	}
	public int getCutenessFactor() {
		return cutenessFactor;
	}
	public String getName() {
		return name;
	}
	public void getHowCute() {
		if (cutenessFactor >= 5) {
			System.out.println("Thats a cute dog!");
		} else {
			System.out.println("dog is meh.");
		}
	}
}
