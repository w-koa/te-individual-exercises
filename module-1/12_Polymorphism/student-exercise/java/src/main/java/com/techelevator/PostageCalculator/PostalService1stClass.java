package com.techelevator.PostageCalculator;

public class PostalService1stClass implements DeliveryDriver {

	@Override
	public double calculateRate(int distance, double weight) {
		double rate = 0;
		if (weight > 128) {
			rate = distance * 0.50;
		} else if (weight <= 128 && weight > 48) {
			rate = distance * 0.45;
		} else if (weight <= 48 && weight > 15) {
			rate = distance * 0.195;
		} else if (weight <= 15 && weight > 8) {
			rate = distance * 0.047;
		} else if (weight <= 8 && weight > 2) {
			rate = distance * 0.04;
		} else rate = distance * 0.035;
			return rate;
	}

	@Override
	public String getServiceType() {
		return "Postal Service 1st Class";
	}

}
