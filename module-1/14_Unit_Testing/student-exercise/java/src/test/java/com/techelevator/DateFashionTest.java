package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class DateFashionTest {

	DateFashion datefashion = new DateFashion();
	
	@Test
	public void dateFashion_5_and_10_returns_2() {
		assertEquals(2, datefashion.getATable(5, 10));
	}

	@Test
	public void dateFashion_5_and_2_returns_0() {
		assertEquals(0, datefashion.getATable(5, 2));
	}
	
	@Test
	public void dateFashion_5_and_5_returns_1() {
		assertEquals(1, datefashion.getATable(5, 5));
	}
}
