package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class Less20Test {

	Less20 less20 = new Less20();
	@Test
	public void isLessThanMultipleOf20_19_returns_true() {
		assertTrue(less20.isLessThanMultipleOf20(19));
		
	}

	@Test
	public void method_tests_if_38_is_1_or_2_less_than_20() {
		assertTrue(less20.isLessThanMultipleOf20(38));
	}
	@Test
	public void method_tests_if_40_is_1_or_2_less_than_20() {
		assertTrue(less20.isLessThanMultipleOf20(40));
	}
}
