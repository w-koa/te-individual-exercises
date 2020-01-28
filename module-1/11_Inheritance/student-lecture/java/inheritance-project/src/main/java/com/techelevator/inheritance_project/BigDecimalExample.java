package com.techelevator.inheritance_project;

import java.math.BigDecimal;

public class BigDecimalExample {

	public static void main(String[] args) {
		
		// Create a big decimal object
		BigDecimal bd1 = new BigDecimal(121.93);
		
		BigDecimal bd2 = new BigDecimal("9191.29");
		
		System.out.println("Value of 1st is: " + bd1 + "\nvalue of 2nd is: " + bd2);
		
		// Adds values together and saves to bd1
		bd1 = bd1.add(bd2);
		System.out.println(bd1);
		
		bd1 = bd1.subtract(new BigDecimal(84.23));
		System.out.println("now value is " + bd1.setScale(2, BigDecimal.ROUND_HALF_DOWN));
		
		BigDecimal bd3 = bd2.pow(2);
		System.out.println("bd2 squared: " + bd3.setScale(2, BigDecimal.ROUND_HALF_DOWN));
	}

}
