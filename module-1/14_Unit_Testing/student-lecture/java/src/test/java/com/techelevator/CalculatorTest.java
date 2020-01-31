package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void add_method_adds_1_and_2_and_returns_3() {
		Calculator calculator = new Calculator();
		int num1 = 1;
		int num2 = 2;
		int expected = 3;
		int actual = calculator.add(num1, num2);
		assertEquals(expected, actual);
	}

	@Test
	public void add_method_adds_12000_and_123_and_returns_12123() {
		Calculator calculator = new Calculator();
		int num1 = 12000;
		int num2 = 123;
		int expected = 12123;
		int actual = calculator.add(num1, num2);
		assertEquals(expected, actual);
	}
	
	@Test
	public void add_method_adds_16_3_and_3_1415_and_returns_19_4415() {
		Calculator calculator = new Calculator();
		assertEquals(calculator.add(16.3,  3.1415), 19.4415, 0.00001);
	}
	
	@Test
	public void inRange_method_checks_that_14_is_in_range_of_10_and_20() {
		Calculator calculator = new Calculator();
		assertTrue(calculator.inRange(14, 10, 20));
	}
	
}
