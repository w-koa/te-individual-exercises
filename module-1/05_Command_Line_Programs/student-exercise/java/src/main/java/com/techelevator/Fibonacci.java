package com.techelevator;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a positive integer: ");
		String fibonacciStr = input.nextLine();
		int fibonacciInt = Integer.parseInt(fibonacciStr);
		
		ArrayList<Integer> fibonacciArray = new ArrayList<Integer>();
		fibonacciArray.add(0);
		fibonacciArray.add(1);
		
		for (int i = 2; i < fibonacciInt; i++) {
			int nextNumber = fibonacciArray.get(i - 1) + fibonacciArray.get(i - 2);
			fibonacciArray.add(nextNumber);
			if (fibonacciInt < nextNumber) {
				fibonacciArray.remove(i);
				break;
			}
		} 
		
		
		System.out.println("Fiboncci numbers before: " + fibonacciInt + ": " + fibonacciArray);

	}

}
