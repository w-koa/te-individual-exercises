package com.techelevator;

public class KataPotter {

	public double getCost(int[] books) {
		
		int counter = 0;
		double price = 8;
		
		for (int book : books) {
			if (book > 0) {
				counter++;
				book = book - 1;
			}
			if (counter == 2) {
				return (price * counter) * 0.95;
			}
			price = price * counter;
			
		}
		return price;
		
		
	}
}
