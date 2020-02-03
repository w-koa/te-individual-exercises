package com.techelevator;

import org.junit.*;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class KataFizzBuzzTest {
	
	KataFizzBuzz fuzz = new KataFizzBuzz();
	
	@Test
	public void fizzbuzz_1_returns_string_1() {
		String expected = "1";
		String actual = fuzz.fizzBuzz(1);
		assertEquals(expected, actual);
	}
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
	
	@Test
	public void number_22_returns_22() {
		String expected = "22";
		String actual = fuzz.fizzBuzz(22);
		assertEquals(expected, actual);
	}
	
	@Test
	public void number_0_returns_empty_string() {
		String expected = "";
		String actual = fuzz.fizzBuzz(0);
		assertEquals(expected, actual);
	}
	
	@Test
	public void number_13_returns_fizz() {
		String expected = "Fizz";
		String actual = fuzz.fizzBuzz(13);
		assertEquals(expected, actual);
	}
	
}
