package com.techelevator.PostageCalculator;

public class PostalService3rdClass implements DeliveryDriver {

	@Override
	public double calculateRate(int distance, double weight) {
		double rate = 0;
		if (weight > 128) {
			rate =  distance * 0.0170;
		} else if (weight <= 128 && weight > 48) {
			rate = distance * 0.016;
		} else if (weight <= 48 && weight > 15) {
			rate = distance * 0.015;
		} else if (weight <= 15 && weight > 8) {
			rate = distance * 0.0024;
		} else if (weight <= 8 && weight > 2) {
			rate = distance * 0.0022;
		} else rate = distance * 0.0020;
		return rate;
	}
	
	@Override
	public String getServiceType() {
		return "Postal Service 3rd Class";
	}

}
