package com.techelevator.PostageCalculator;

public class PostalService implements DeliveryDriver {

	private String serviceType;
	
	
	@Override
	public double calculateRate(int distance, double weight) {
		double rate = 0;
		if (serviceType.equals("1st Class")) {
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
		} else 
			if (serviceType.equals("2nd Class")) {
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
		} else 
			if (serviceType.equals("3rd Class")) {
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
		} return rate;
	}

	
	
	
	
//	|--------|-----------|-----------|-----------|
//	| Weight |           |           |           |
//	| Not    | 1st Class | 2nd Class | 3rd Class |
//	| Over   | Per Mile  | Per Mile  | Per Mile  |
//	|--------|-----------|-----------|-----------|
//	|  2 oz. |   0.035   |   0.0035  |   0.0020  |
//	|  8 oz. |   0.040   |   0.0040  |   0.0022  |
//	| 15 oz. |   0.047   |   0.0047  |   0.0024  |
//	|  3 lbs.|   0.195   |   0.0195  |   0.0150  |
//	|  8 lbs.|   0.450   |   0.0450  |   0.0160  |
//	|--------|-----------|-----------|-----------|
//	| Over   |           |           |           |
//	| 8 lbs. |   0.500   |   0.0500  |   0.0170  |
//	|--------|-----------|-----------|-----------|
	// Getter and Setter
	@Override
	public String getServiceType() {
		
		return serviceType;
	}
	public String setServiceType(String serviceType) {
		return this.serviceType = serviceType;
		
	}

}
