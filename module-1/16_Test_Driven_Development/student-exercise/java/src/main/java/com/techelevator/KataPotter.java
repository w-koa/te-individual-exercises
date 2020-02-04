package com.techelevator;

import java.text.DecimalFormat;

public class KataPotter {

	public double getCost(int[] books) {
		DecimalFormat df = new DecimalFormat("#.00");
		int counter = 0;
		double price = 8;

		for (int book : books) {
			if (book > 0) {

				book = book - 1;
				counter++;
			}
		}
		switch (counter) {
		case (5): {
			return (price * counter) * 0.75;
		}
		case (4): {
			return (price * counter) * 0.80;
		}
		case (3): {
			return (price * counter) * 0.90;
		}
		case (2): {
			return (price * counter) * 0.95;
		}
		default: {
			price = price * counter;
		}
		}
		return price;
	}
}
