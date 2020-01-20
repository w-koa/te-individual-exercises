package com.techelevator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DecimalToBinary {
	//Easy Method
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an Integer to convert to binary: ");
		String intStr = input.nextLine();
		int integer = Integer.parseInt(intStr);
		String binary = Integer.toBinaryString(integer);
		
		System.out.println(integer + " in binary is " + binary);
	
	//Without toBinaryString method
	
		System.out.print("Enter an integer to convert to binary: ");
		intStr = input.nextLine();
		integer = Integer.parseInt(intStr);
		int originalNum = Integer.parseInt(intStr);
		
		int[] binaryArray = new int[99];
		int index = 0;
		for (int i = 0; integer > 0; i++) {
			binaryArray[i] = integer % 2;
			integer = integer / 2;
			index++;
			
		}
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binaryArray[i]);
		}
		System.out.println(" is binary for: " + originalNum);
	}

	
	
	
}
