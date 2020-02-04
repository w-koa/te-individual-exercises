package com.techelevator;

import org.junit.*;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class KataPotterTest {

	KataPotter potter = new KataPotter();
	
	@Test
	public void single_purchase_returns_8() {
		double actual = 8;
		int[] books = new int[] {1, 0, 0, 0, 0};
		double expected = potter.getCost(books);
		assertEquals(actual, expected, 0.00001);
	}
	
}
