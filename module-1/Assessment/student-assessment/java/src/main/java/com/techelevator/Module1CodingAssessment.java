package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Module1CodingAssessment {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		FlowerShopOrder testOrder = new FlowerShopOrder("Standard", 2);
		
		System.out.println(testOrder.getBouquetType());
		System.out.println(testOrder.getNumberOfRoses());
		System.out.println(testOrder.getSubtotal());
		System.out.println(testOrder.toString());
		System.out.println(testOrder.calculateDeliveryTotal(false, "10000"));
		System.out.println(testOrder.calculateDeliveryTotal(false, "20000"));
		System.out.println(testOrder.calculateDeliveryTotal(true, "20000"));
		System.out.println(testOrder.calculateDeliveryTotal(false, "30000"));
		System.out.println(testOrder.calculateDeliveryTotal(true, "30000"));
		System.out.println(testOrder.calculateDeliveryTotal(false, "40000"));
		System.out.println(testOrder.calculateDeliveryTotal(true, "40000"));
		
		FlowerShopOrder test2 = new FlowerShopOrder("noRosee", 0);
		System.out.println(test2.toString());
		System.out.println(test2.calculateDeliveryTotal(false, "20000"));
		System.out.println(test2.calculateDeliveryTotal(true, "20000"));
		System.out.println(test2.calculateDeliveryTotal(false, "30000"));
		System.out.println(test2.calculateDeliveryTotal(true, "30000"));
		System.out.println(test2.calculateDeliveryTotal(false, "40000"));
		System.out.println(test2.calculateDeliveryTotal(true, "40000"));
		
		
		File flowers = new File("FlowerInput.csv");
		Scanner flowerScan = new Scanner(flowers);
//		if (flowers.exists()) {
//			System.out.println(flowers.getAbsolutePath());
//		}
		while (flowerScan.hasNextLine()) {
			String flower = flowerScan.nextLine();
			
//			System.out.println(flower);
			
			
		}
	}

}
