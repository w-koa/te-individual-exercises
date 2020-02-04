package com.techelevator;

public class KataPotter {

	public double getCost(int[] books) {
	
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
			return (price * counter) * 0.75; // 30
		}
		case (4): {
			return (price * counter) * 0.80; // 25.6
		}
		case (3): {
			return (price * counter) * 0.90; // 21.6
		}
		case (2): {
			return (price * counter) * 0.95; // 15.2
		}
		default: {
			price = price * counter; // 8
		}
		}
		return price;
	}
}
