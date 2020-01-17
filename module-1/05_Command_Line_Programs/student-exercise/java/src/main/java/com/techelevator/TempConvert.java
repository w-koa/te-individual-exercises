package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the temperature: ");
		String temperatureStr = input.nextLine();
		double temperature = Integer.parseInt(temperatureStr);
		
		System.out.print("Enter the Temperature type (C)elsius or (Farenheit): ");
		String tempTypeStr = input.nextLine();
		String celcius = "C";
		String farenheit = "F";
		
		if (tempTypeStr.equals(celcius)) {
			temperature = (temperature * 1.8 + 32);
			System.out.println("Temperature in Farenheit: " + String.format("%.1f", temperature) + "F");
		}
		
		if (tempTypeStr.equals(farenheit)) {
			temperature = ((temperature - 32) / 1.8);
			System.out.println("Temperature in Celcius: " + String.format("%.1f", temperature) + "C");
		}
	}

}
