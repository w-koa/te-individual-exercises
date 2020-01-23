package com.techelevator.shoppingcart;

public class ShoppingCart {

	private int totalNumberOfItems;
	private double totalAmountOwed;
	//Getters and Setters
	public int getTotalNumberOfItems() {
		return totalNumberOfItems;
	}
	
	public double getTotalAmountOwed() {
		return totalAmountOwed;
	}
	
	
	//Methods
	public double getAveragePricePerItem() {
		if (totalAmountOwed > 0) {
			return totalAmountOwed / totalNumberOfItems;
		}
		return totalAmountOwed;
	}
	
	public void addItems(int numberOfItems, double pricePerItem) {
		this.totalNumberOfItems = numberOfItems;
		this.totalAmountOwed = (pricePerItem * numberOfItems);
	}
	
	public void empty() {
		this.totalNumberOfItems = 0;
		this.totalAmountOwed = 0;
	}
	
//	ShoppingCart
//	Constructors
//	Signature 	Description
//	ShoppingCart() 	Default constructor.
//	Data Members
//	Attribute 	Data Type 	Get 	Set 	Description
//	totalNumberOfItems 	int 	X 		The number of items in the shopping cart. All shopping carts have 0 items by default.
//	totalAmountOwed 	double 	X 		The total for the shopping cart. All shopping carts have 0.0 owed by default.
//	Methods
//	Method Name 	Return Type 	Description
//	getAveragePricePerItem() 	decimal 	Returns the result of totalAmountOwed / totalNumberOfItems.
//	addItems(int numberOfItems, double pricePerItem) 	void 	Updates totalNumberOfItems and increases totalAmountOwed by (pricePerItem * numberOfItems)
//	empty() 	void 	Resets totalNumberOfItems and totalAmountOwed to 0.
	
}
