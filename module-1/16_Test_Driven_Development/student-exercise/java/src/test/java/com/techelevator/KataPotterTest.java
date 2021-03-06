package com.techelevator;

import org.junit.*;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class KataPotterTest {

	KataPotter potter = new KataPotter();
	
	@Test
	public void null_returns_0() {
		double actual = 0;
		int[]books = null;
		double expected = potter.getCost(books);
		assertEquals(actual, expected, 0.0001);
	}
	
	@Test
	public void single_purchase_returns_8() {
		double actual = 8;
		int[] books = new int[] {1, 0, 0, 0, 0};
		double expected = potter.getCost(books);
		assertEquals(actual, expected, 0.00001);
	}
	
	@Test
	public void set_of_2_returns_15_pt_2() {
		double actual = 15.2;
		int[] books = new int[] {1, 1, 0, 0, 0};
		double expected = potter.getCost(books);
		assertEquals(actual, expected, 0.0001);
	}
	
	@Test
	public void set_of_3_returns_21_pt_6() {
		double actual = 21.6;
		int[] books = new int[] {1, 1, 1, 0, 0};
		double expected = potter.getCost(books);
		assertEquals(actual, expected, 0.0001);
	}
	
	@Test
	public void set_of_4_returns_25_pt_6() {
		double actual = 25.6;
		int[] books = new int[] {1, 1, 1, 1, 0};
		double expected = potter.getCost(books);
		assertEquals(actual, expected, 0.0001);
	}
	
	@Test
	public void set_of_5_returns_30() {
		double actual = 30.0;
		int[] books = new int[] {1, 1, 1, 1, 1};
		double expected = potter.getCost(books);
		assertEquals(actual, expected, 0.0001);
	}
	
	@Test
	public void set_of_5_and_1_returns_38() {
		double actual = 38.0;
		int[] books = new int[] {2, 1, 1, 1, 1};
		double expected = potter.getCost(books);
		assertEquals(actual, expected, 0.0001);
	}
	
	@Test
	public void set_of_5_and_3_returns_51_pt_2() {
		double actual = 51.2;
		int[] books = new int[] {2, 2, 2, 1, 1};
		double expected = potter.getCost(books);
		assertEquals(actual, expected, 0.0001);
	}
	
	@Test
	public void two_sets_of_5_and_3_returns_51_pt_2() {
		double actual = 102.4;
		int[] books = new int[] {4, 4, 4, 2, 2};
		double expected = potter.getCost(books);
		assertEquals(actual, expected, 0.0001);
	}
	
}
