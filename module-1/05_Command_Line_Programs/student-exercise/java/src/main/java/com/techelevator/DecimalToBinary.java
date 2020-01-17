package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an Integer to convert to binary: ");
		String intStr = input.nextLine();
		int integer = Integer.parseInt(intStr);
		String binary = Integer.toBinaryString(integer);
		
		System.out.println(integer + " in binary is " + binary);
	}

}
