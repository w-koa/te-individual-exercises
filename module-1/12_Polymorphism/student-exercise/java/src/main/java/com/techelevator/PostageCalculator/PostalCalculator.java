package com.techelevator.PostageCalculator;

import java.util.ArrayList;
import java.util.Scanner;

public class PostalCalculator {

	public static void main(String[] args) {
		
//		PostalService postalFirstClass = new PostalService();
//		postalFirstClass.setServiceType("1st Class");
//		PostalService postalSecondClass = new PostalService();
//		postalSecondClass.setServiceType("2nd Class");
//		PostalService postalThirdClass = new PostalService();
//		postalThirdClass.setServiceType("3rd Class");
		
//		SPU spuNextDay = new SPU();
//		spuNextDay.setServiceType("Next Day");
//		SPU spuTwoDay = new SPU();
//		spuTwoDay.setServiceType("2-Day Business");
//		SPU spuFourDay = new SPU();
//		spuFourDay.setServiceType("4-Day Ground");
		// New arrayList to add new delivery services.
		ArrayList<DeliveryDriver> serviceList = new ArrayList<DeliveryDriver>();
		serviceList.add(new PostalService1stClass());
		serviceList.add(new PostalService2ndClass());
		serviceList.add(new PostalService3rdClass());
		
		serviceList.add(new FedEx());
		
		serviceList.add(new SPU4DayGround());
		serviceList.add(new SPU2DayBusiness());
		serviceList.add(new SPUNextDay());
		
		
		// Get Inputs and parse string answers to int.
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the weight of the package: ");
		String weightString = input.nextLine();
		int weightInt = Integer.parseInt(weightString);
		
		System.out.println("[P]ounds or [O]unces? ");
		String weightTypeString = input.nextLine();

		
		if (weightTypeString.equals("P")) {
			weightInt *= 16;
		}
		
		System.out.println("Enter distance package will travel: ");
		String distanceString = input.nextLine();
		int distanceInt = Integer.parseInt(distanceString);
		
		// Prints out info for each service added to list.
		System.out.println("Delivery Method \t\t\tCost");
		System.out.println("================================================");
		for (DeliveryDriver service : serviceList) {
			System.out.printf(service.getServiceType() + " \t\t" + 
					String.format("$%,.2f", service.calculateRate(distanceInt, weightInt)) + "\n");
		}
		
		input.close();
	}

}
