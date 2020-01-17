package com.techelevator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PricesProgram {
	
	public static void main(String[] args) {
		// Create constant Tax
		final double TAX = 0.06;
		
		// Formatting pattern, sets decimalFormat to the pattern
		String pattern = "###,###,###,###.##";
		DecimalFormat decimalFormat = new DecimalFormat(pattern);
		
		// Create connection between program and keyboard for input
		Scanner input = new Scanner(System.in);		
//		
//		// Create array for prices
//		double [] prices = new double[3];
//		
//		// Loop asking for prices
//		for (int i = 0; i < prices.length; i++) {
//			System.out.println("Enter a price: ");
//			String priceStr = input.nextLine();
//			prices[i] = Double.parseDouble(priceStr);
//		}
//		
//		// Loop for storing taxed values and prints prices and tax. Prints in format pattern if the number is too large.
//		for (int i = 0; i < prices.length; i++) {
//			double tax = prices[i] * TAX;
//			String format = decimalFormat.format(prices[i]);
//			System.out.println("Price: " + format + "\t Tax: " + String.format("%.2f", tax));
//		}
		
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		int[] nums = new int[3];
		System.out.println("Enter 3 Numbers:");
		String numberStr = input.nextLine();
		System.out.println(numberStr);
		
		// Creates array of strings
		String[] numArray = numberStr.split(" ");
		for (int i = 0; i < numArray.length; i++) {
			System.out.println(numArray[i]);
		}
		
	}
}
