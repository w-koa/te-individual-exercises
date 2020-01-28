package com.techelevator.TollBoothCalculator;

public class Truck implements Vehicle {

	private int numberOfAxels;
	
	public Truck(int numberOfAxels) {
		this.numberOfAxels = numberOfAxels;
	}
	
	@Override
	public double calculateToll(int distance) {
		if (numberOfAxels == 4) {
			return distance * 0.040;
		} else if (numberOfAxels == 6) {
			return distance * 0.045;
		}  else
			return distance *  	0.048;
	}	

	@Override
	public String getType() {
		return "Truck\t ";
	}

}
