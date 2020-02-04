package com.techelevator;

public class KataPotter {

	public double getCost(int[] books) {
//		int[] secondSet = new int[4];
		int counter = 0;
		double price = 0;
		
		for (int book : books) {
			if (book > 0) {
				counter++;
				
			}
			
			price = counter * 8;
			
		}
		return price;
		
		
	}
}
