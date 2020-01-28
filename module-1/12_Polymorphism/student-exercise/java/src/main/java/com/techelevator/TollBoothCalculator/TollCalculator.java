package com.techelevator.TollBoothCalculator;

import java.util.ArrayList;

public class TollCalculator {

	public static void main(String[] args) {
		ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
		
		vehicleList.add(new Car(false));
		vehicleList.add(new Car(true));
		vehicleList.add(new Truck(4));
		vehicleList.add(new Truck(6));
		vehicleList.add(new Truck(8));
		vehicleList.add(new Tank());
		
		int totalDistance = 0;
		double totalTolls = 0;
		
		System.out.println("Vehicle \t\tDistance \tToll");
		System.out.println("=============================================================");
		
		for (Vehicle vehicle : vehicleList) {
			String type = vehicle.getType();
			int distance = (int) ((Math.random() * 300) + 1);
			totalDistance += distance;
			totalTolls += vehicle.calculateToll(distance);
			
			System.out.printf(type + " \t\t" + distance + "\t\t" + "$" + String.format("%.2f", vehicle.calculateToll(distance)) + "\n");
		}

		System.out.println("\nTotal Distance: " + totalDistance + "mi.");
		System.out.printf("Total Toll Revenue: $" + String.format("%,.2f",totalTolls));
	}

}
