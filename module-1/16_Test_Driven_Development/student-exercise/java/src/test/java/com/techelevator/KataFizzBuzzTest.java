package com.techelevator;

import org.junit.*;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class KataFizzBuzzTest {
	
	KataFizzBuzz fuzz = new KataFizzBuzz();
	@Test
	public void number_div_by_3_returns_fizz() {
		String expected = "Fizz";
		String actual = fuzz.fizzBuzz(3);
		assertEquals(expected, actual);
	}
	
	@Test
	public void number_div_by_5_returns_buzz() {
		String expected = "Buzz";
		String actual = fuzz.fizzBuzz(5);
		assertEquals(expected, actual);
	}
	
	@Test
	public void number_div_by_15_returns_fizzbuzz() {
		String expected = "FizzBuzz";
		String actual = fuzz.fizzBuzz(15);
		assertEquals(expected, actual);
	}
	
}
