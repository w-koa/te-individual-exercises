package com.techelevator.PostageCalculator;

public class SPUNextDay implements DeliveryDriver {

	@Override
	public double calculateRate(int distance, double weight) {
		double rate = 0;
		rate = (weight * 0.075) * distance;
		return rate;
	}

	@Override
	public String getServiceType() {
		return "SPU Next Day\t\t";
	}

}
