package com.techelevator.inheritance_project;

public class Horse {

	// Attributes
	private String name;
	private String color;
	private int birthYear;
	
	// Computer provides default constructor if none is written.
	
	// Constructor
	public Horse() {
		
	}
	public Horse(String name, String color, int birthYear) {
		this.name = name;
		this.color = color;
		this.birthYear = birthYear;
	}
	
	// Getters and Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		if (color.equals("Brown") || color.equals("Black")) {
			this.color = color;
		} else {
			this.color = "Brown";
		}
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	@Override
	//Override
	public String toString() {
		return "Horse name: " + name + 
				"\nHorse color: " + color + 
				"\nHorse birthyear: " + birthYear;
	}
		
	
}
