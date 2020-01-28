package com.techelevator.TollBoothCalculator;

public class Car implements Vehicle {

	private boolean hasTrailer;
	
	public Car(boolean hasTrailer) {
		this.hasTrailer = hasTrailer;
	}
	
	@Override
	public double calculateToll(int distance) {
		if (hasTrailer) {
			return (distance * 0.020) + 1.00;
		} else
		return distance * 0.020;
	}

	@Override
	public String getType() {
		// return name of vehicle type
		if (hasTrailer) {
			return "Car + trailer ";
		} else
		return "Car\t ";
	}

}
