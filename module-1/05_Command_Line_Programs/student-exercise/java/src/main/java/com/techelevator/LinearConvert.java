package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a length: ");
		String lengthStr = input.nextLine();
		double length = Double.parseDouble(lengthStr);
		double firstLength = Double.parseDouble(lengthStr);
		
		System.out.print("Is the length in (m)eters, or (f)eet? ");
		String lengthTypeStr = input.nextLine();
		String meters = "m";
		String feet = "f";
		
		if (lengthTypeStr.equals(meters)) {
			length = length * 0.3048;
			System.out.println(firstLength + "m is " + String.format("%.2f", length) + "ft");
		}
		
		if (lengthTypeStr.equals(feet)) {
			length = length * 3.2808399;
			System.out.println(firstLength + "ft is " + String.format("%.2f", length) + "m");
		}
	}

}
