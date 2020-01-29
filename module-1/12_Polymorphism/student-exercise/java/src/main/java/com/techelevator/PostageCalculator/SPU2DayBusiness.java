package com.techelevator.PostageCalculator;

public class SPU2DayBusiness implements DeliveryDriver {

	@Override
	public double calculateRate(int distance, double weight) {
		double rate = 0;
		rate = (weight * 0.050) * distance;
		return rate;
	}

	@Override
	public String getServiceType() {
		return "SPU 2-Day Business\t";
	}

}
