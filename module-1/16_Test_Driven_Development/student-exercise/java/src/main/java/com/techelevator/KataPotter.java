package com.techelevator;

import java.util.LinkedList;
import java.util.Queue;

public class KataPotter {

	public double getCost(int[] books) {

		double price = 0;
		Queue<Integer> uniqueSet = new LinkedList<>();

		if (books == null) {
			return 0;
		}
		boolean isTrue = true;
		while (isTrue) {
			int counter = 0;
			for (int i = 0; i < books.length; i++) {
				if (books[i] > 0) {
					books[i] = books[i] - 1;
					counter++;
				}
			}
			if (counter == 0) {
				isTrue = false;
			}
			uniqueSet.add(counter);
			System.out.println(uniqueSet);
		}

		while (uniqueSet.contains(5) && uniqueSet.contains(3)) {
			uniqueSet.remove(5);
			uniqueSet.remove(3);
			price += 51.2;
		}
		while (uniqueSet.size() > 0) {
			int set = uniqueSet.poll();

			if (set == 5) {
				price += 30;
			} else if (set == 4) {
				price += 25.6;
			} else if (set == 3) {
				price += 21.6;
			} else if (set == 2) {
				price += 15.2;
			} else if (set == 1) {
				price += 8;
			}

		}
		System.out.println(price);
		return price;

//		for (int set : uniqueSet) {
//			switch (set) {
//			case (5): {
//				price += 30; // (price * counter) * 0.75; // 30
//				break;
//			}
//			case (4): {
//				price += 25.6; //(price * counter) * 0.80; // 25.6
//				break;
//			}
//			case (3): {
//				price += 21.6; //(price * counter) * 0.90; // 21.6
//				break;
//			}
//			case (2): {
//				price += 15.2; //(price * counter) * 0.95; // 15.2
//				break;
//			}
//			case (1): {
//				price += 8; //price = 8 * counter; // 8
//				break;
//			}

//		}
//		System.out.println(price);
//		return price;
	}
}
