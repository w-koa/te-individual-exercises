package com.techelevator.PostageCalculator;

public interface DeliveryDriver {
	// Abstract Methods
	public double calculateRate(int distance, double weight);
	public String getServiceType();
	
}
