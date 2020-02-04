package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class KataPotter {

	public double getCost(int[] books) {

		int counter = 0;
		double price = 0;
		List<Integer> uniqueSet = new ArrayList<>();

		if (books == null) {
			return 0;
		}
		
		for (int book : books) {
			if (book > 0) {
				book = book - 1;
				counter++;
			}
		}
		uniqueSet.add(counter);
		System.out.println(uniqueSet.toString());
		for (int set : uniqueSet) {
			switch (set) {
			case (5): {
				price += 30; // (price * counter) * 0.75; // 30
				break;
			}
			case (4): {
				price += 25.6; //(price * counter) * 0.80; // 25.6
				break;
			}
			case (3): {
				price += 21.6; //(price * counter) * 0.90; // 21.6
				break;
			}
			case (2): {
				price += 15.2; //(price * counter) * 0.95; // 15.2
				break;
			}
			case (1): {
				price += 8; //price = 8 * counter; // 8
				break;
			}
			}
		}
		System.out.println(price);
		return price;
	}
}
