package com.techelevator;

import java.util.concurrent.CountDownLatch;

public class LoopPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Using the nums array, calculate the average, find the smallest and the
		 * largest values.
		 */

		int[] nums = { 5, 7, 12, 1, 24, 3 };

		int sum = 0, largest = nums[0], smallest = nums[0]; // Declares variables sum, largest, smallest, and assigns
															// them
		// Iterates through Array nums.
		for (int i = 0; i < nums.length; i++) {
			// adds sum of numbers
			sum = sum + nums[i];

			// finds largest value
			if (nums[i] > largest) {
				largest = nums[i];
			}

			// finds smallest value
			if (nums[i] < smallest) {
				smallest = nums[i];
			}
		}
		// calculate average
		double average = (double) sum / nums.length;

		// print results
		System.out.println("Smallest: " + smallest);
		System.out.println("Largest: " + largest);
		System.out.println("Average: " + String.format("%.3f", average));
		
		countByFivesLoop();
	}

	public static void countByFivesLoop() {
		// Counts from 10 to 100 by 5s
		System.out.println("\n\nPrinting by 5s from 10 to 100 inclusive");
		for (int i = 10; i <= 100; i += 5) {
			System.out.println(i);
		}
	}
	
}
