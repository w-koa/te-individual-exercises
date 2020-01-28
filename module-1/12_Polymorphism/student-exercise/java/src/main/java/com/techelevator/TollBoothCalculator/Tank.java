package com.techelevator.TollBoothCalculator;

public class Tank implements Vehicle {

	public Tank() {
		
	}
	
	@Override
	public double calculateToll(int distance) {
		return 0;
	}

	@Override
	public String getType() {
		return "Tank\t ";
	}

}
