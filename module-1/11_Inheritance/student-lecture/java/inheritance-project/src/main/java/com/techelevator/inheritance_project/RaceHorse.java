package com.techelevator.inheritance_project;

public class RaceHorse extends Horse {

	// Attributes
	private int numberOfRaces;

	
	// Getters and Setters
	public int getNumberOfRaces() {
		return numberOfRaces;
	}

	public void setNumberOfRaces(int numberOfRaces) {
		this.numberOfRaces = numberOfRaces;
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"\nRaces run: " + numberOfRaces;
	}
}
