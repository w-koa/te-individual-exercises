package com.techelevator;

import java.text.DecimalFormat;

public class KataPotter {

	public double getCost(int[] books) {
		DecimalFormat df = new DecimalFormat("#.00");
		int counter = 0;
		double price = 8;

		for (int book : books) {
			if (book > 0) {
				counter++;
				book = book - 1;
			}
			if (counter == 3) {
				return (price * counter) * 0.90;
			} 
			if (counter == 2) {
				return (price * counter) * 0.95;
			} 
			if (counter == 1) {

				price = price * counter;
			}
		}
		return price;

	}

}
