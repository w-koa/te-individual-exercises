/**
 * 
 */
package com.techelevator.PostageCalculator;

public class SPU implements DeliveryDriver {

	// THIS CLASS IS NOW OBSOLETE
	private String serviceType;
	
	@Override
	public double calculateRate(int distance, double weight) {
		double rate = 0;
		if (serviceType.equals("4-Day Ground")) {
			rate = (weight * 0.0050) * distance;
		} 
		if (serviceType.equals("2-Day Business")) {
			rate = (weight * 0.050) * distance;
		} 
		if (serviceType.equals("Next Day")) {
			rate = (weight * 0.075) * distance;
		}
		return rate;
	}

	// Getter and Setter
	@Override
	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
//	If "4-Day Ground" then rate = (weight * 0.0050) * distance.
//			If "2-Day Business" then rate = (weight * 0.050) * distance.
//			If "Next Day" then rate = (weight * 0.075) * distance.

}
