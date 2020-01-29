package com.techelevator.PostageCalculator;

public class PostalService2ndClass implements DeliveryDriver {

	@Override
	public double calculateRate(int distance, double weight) {
		double rate = 0;
		if (weight > 128) {
			rate = distance * 0.050;
		} else if (weight <= 128 && weight > 48) {
			rate = distance * 0.045;
		} else if (weight <= 48 && weight > 15) {
			rate = distance * 0.0195;
		} else if (weight <= 15 && weight > 8) {
			rate = distance * 0.0047;
		} else if (weight <= 8 && weight > 2) {
			rate = distance * 0.004;
		} else rate = distance * 0.0035;
		return rate;
	}

	@Override
	public String getServiceType() {
		return "Postal Service 2nd Class";
	}

}
