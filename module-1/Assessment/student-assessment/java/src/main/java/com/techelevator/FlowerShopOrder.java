package com.techelevator;

public class FlowerShopOrder {
	
	//Attributes
	private String bouquetType;
	private int numberOfRoses;
	private double subtotal;
	
	// Constructor
	public FlowerShopOrder(String bouquetType, int numberOfRoses) {
		this.bouquetType = bouquetType;
		this.numberOfRoses = numberOfRoses;
		this.subtotal = 19.99 + (numberOfRoses * 2.99);
	}

//	Override the toString()/ToString() method and have it return "ORDER - {bouquet type} - 
//	{number of roses} roses - {subtotal}"
//	where {bouquet type}, {number of roses}, and {subtotal} are placeholders for the actual values. 
//	The values from the object should be shown in the string where {variable-name} is indicated.
	
	// Methods
	
	@Override
	public String toString() {
		return "ORDER - " + bouquetType + " - " + numberOfRoses + " roses" + " - $" + subtotal;
		
	}
	
	// Calculates delivery total based on zip code.
	public double calculateDeliveryTotal(boolean sameDayDelivery, String zipCode) {
		
		int zipCodeInt = Integer.parseInt(zipCode);
		double sameDayFee = 5.99;
		double deliveryTotal = 0;
		
		if (zipCodeInt >= 10000 && zipCodeInt < 20000) {
			return subtotal;
		}
		
		if (sameDayDelivery) {
			if (zipCodeInt >= 20000 && zipCodeInt < 30000) {
				deliveryTotal = subtotal + sameDayFee + 3.99;
			}
			else if (zipCodeInt >= 30000 && zipCodeInt < 40000) {
				deliveryTotal = subtotal + sameDayFee + 6.99;
			}
			else if (zipCodeInt >= 40000) {
				deliveryTotal = subtotal + 19.99; // same day does not exist for this zip range, matches false.
			}
		} 
		else if (zipCodeInt >= 20000 && zipCodeInt < 30000) {
			deliveryTotal = subtotal + 3.99;
		}
		else if (zipCodeInt >= 30000 && zipCodeInt < 40000) {
			deliveryTotal = subtotal + 6.99;
		}
		else if (zipCodeInt >= 40000) {
			deliveryTotal = subtotal + 19.99;
		}
		return deliveryTotal;
		
	}
	
	// Getters
	public String getBouquetType() {
		return bouquetType;
	}

	public int getNumberOfRoses() {
		return numberOfRoses;
	}

	public double getSubtotal() {
		return subtotal;
	}


	
	
}
