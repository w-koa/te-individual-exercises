package com.techelevator.PostageCalculator;

import java.util.ArrayList;
import java.util.Scanner;

public class PostalCalculator {

	public static void main(String[] args) {
		
		PostalService postalFirstClass = new PostalService();
		postalFirstClass.setServiceType("1st Class");
		PostalService postalSecondClass = new PostalService();
		postalSecondClass.setServiceType("2nd Class");
		PostalService postalThirdClass = new PostalService();
		postalThirdClass.setServiceType("3rd Class");
		
		SPU spuNextDay = new SPU();
		spuNextDay.setServiceType("Next Day");
		SPU spuTwoDay = new SPU();
		spuTwoDay.setServiceType("2-Day Business");
		SPU spuFourDay = new SPU();
		spuFourDay.setServiceType("4-Day Ground");
		
		ArrayList<DeliveryDriver> serviceList = new ArrayList<DeliveryDriver>();
		serviceList.add(postalFirstClass);
		serviceList.add(postalSecondClass);
		serviceList.add(postalThirdClass);
		
		serviceList.add(new FedEx());
		
		serviceList.add(spuNextDay);
		serviceList.add(spuTwoDay);
		serviceList.add(spuFourDay);
		
		
		
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
		
		System.out.println("Delivery Method \t\tCost");
		System.out.println("====================================");
		for (DeliveryDriver service : serviceList) {
			System.out.printf(service.getServiceType() + " \t\t\t" + 
					String.format("$%,.2f", service.calculateRate(distanceInt, weightInt)) + "\n");
		}
		
	}

}
