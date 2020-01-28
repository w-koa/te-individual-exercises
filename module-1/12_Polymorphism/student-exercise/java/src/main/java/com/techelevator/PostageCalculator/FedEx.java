package com.techelevator.PostageCalculator;

public class FedEx implements DeliveryDriver {


	@Override
	public double calculateRate(int distance, double weight) {
		double rate = 20.00;
		if (distance > 500 && weight > 48) {
			rate = rate + 8.00;
		} else
		if (distance > 500) {
			rate = rate + 5.00;
		} else
		if (weight > 48) {
			rate = rate + 3.00;
		}
		return rate;
	}

	// FedEx does not need service type.... Just Kidding it does.
	@Override
	public String getServiceType() {
		return "FedEx\t";
	}

}
