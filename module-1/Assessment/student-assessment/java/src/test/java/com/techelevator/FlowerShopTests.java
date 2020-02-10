package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class FlowerShopTests {

	FlowerShopOrder roseTest = new FlowerShopOrder("Two Roses", 2);
	FlowerShopOrder standardTest = new FlowerShopOrder("Standard", 0);
	
	@Test
	public void test_null_type_returns_null() {
		String expected = null;
		FlowerShopOrder nullTest = new FlowerShopOrder(null, 0);
		assertEquals(expected, nullTest.getBouquetType());
	}
	
	@Test
	public void test_Constructor_for_boquet_type() {
		String expected = "Standard";
		
		assertEquals(expected, standardTest.getBouquetType());
	}
	
	@Test
	public void test_constructor_for_number_of_roses() {
		int expected = 0;
		assertEquals(expected, standardTest.getNumberOfRoses());
	}

	@Test
	public void test_constructor_for_default_subtotal_1999() {
		double expected = 19.99;
		assertEquals(expected, standardTest.getSubtotal(), 0.0001);
	}
	
	@Test
	public void test_2_roses_returns_2() {
		int expected = 2;
		assertEquals(expected, roseTest.getNumberOfRoses());
	}
	
	@Test
	public void test_getSubtotal_method_2_roses_returns_25_97() {
		double expected = 25.97;
		assertEquals(expected, roseTest.getSubtotal(), 0.0001);
	}
	
	@Test
	public void method_calculateDeliverTotal_no_roses_at_zip_10000_returns_1999() {
		double expected = 19.99;
		assertEquals(expected, standardTest.calculateDeliveryTotal(false, "10000"), 0.0001);
	}
	
	@Test
	public void method_calculateDeliverTotal_no_roses_at_zip_20000_no_sameday_returns_2398() {
		double expected = 23.98;
		assertEquals(expected, standardTest.calculateDeliveryTotal(false, "20000"), 0.0001);
	}
	
	@Test
	public void method_calculateDeliverTotal_no_roses_at_zip_20000_yes_sameday_returns_2997() {
		double expected = 29.97;
		assertEquals(expected, standardTest.calculateDeliveryTotal(true, "20000"), 0.0001);
	}
	
	@Test
	public void method_calculateDeliverTotal_no_roses_at_zip_30000_no_sameday_returns_2698() {
		double expected = 26.98;
		assertEquals(expected, standardTest.calculateDeliveryTotal(false, "30000"), 0.0001);
	}
	
	@Test
	public void method_calculateDeliverTotal_no_roses_at_zip_30000_yes_sameday_returns_3297() {
		double expected = 32.97;
		assertEquals(expected, standardTest.calculateDeliveryTotal(true, "30000"), 0.0001);
	}
	
	@Test
	public void method_calculateDeliverTotal_no_roses_at_zip_40000_no_sameday_returns_3998() {
		double expected = 39.98;
		assertEquals(expected, standardTest.calculateDeliveryTotal(false, "40000"), 0.0001);
	}
	
	@Test
	public void method_calculateDeliverTotal_no_roses_at_zip_40000_yes_sameday_returns_3998() {
		double expected = 39.98;
		assertEquals(expected, standardTest.calculateDeliveryTotal(true, "40000"), 0.0001);
	}
	
	@Test
	public void toString_method_for_standard_0_roses_returns_Order_boquetType_numberofRoses_and_subtotal_beforeDeliver() {
		String expected = "ORDER - Standard - 0 roses - $19.99";
		String actual = standardTest.toString();
		assertEquals(expected, actual);
	}
}
