package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class FrontTimesTest {

	FrontTimes frontTimes = new FrontTimes();
	
	@Test
	public void frontTimes_chocolate_2_returns_chocho() {
		assertEquals("ChoCho", frontTimes.generateString("Chocolate", 2));
	}
	
	@Test
	public void frontTimes_chocolate_3_returns_chochocho() {
		assertEquals("ChoChoCho", frontTimes.generateString("Chocolate", 3));
	}

	@Test
	public void frontTimes_abc_3_returns_abcabcabc() {
		assertEquals("abcabcabc", frontTimes.generateString("abc", 3));
	}
	
	@Test
	public void str_null_returns_empty() {
		assertEquals("", frontTimes.generateString(null, 1));
	}
}
