package com.techelevator.TollBoothCalculator;

public class TollCalcDemo {

	public static void main(String[] args) {

		Truck trucktest = new Truck(4);
		System.out.println(trucktest.calculateToll(100));
		System.out.println(trucktest.getType());

		Truck trucky = new Truck(12);
		System.out.println(trucky.calculateToll(100));
		System.out.println(trucky.getType());
		
		Car onlyCar = new Car(false);
		System.out.println(onlyCar.calculateToll(90));
		System.out.println(onlyCar.getType());
		
		Tank tanky = new Tank();
		System.out.println(tanky.getType());
		System.out.println(tanky.calculateToll(100));
		
	}

}
