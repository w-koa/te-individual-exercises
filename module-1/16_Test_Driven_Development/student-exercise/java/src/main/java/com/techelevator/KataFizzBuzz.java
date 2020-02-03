package com.techelevator;

public class KataFizzBuzz {

	public String fizzBuzz(int number) {
		if (number == 0) {
			return "";
		} else
		if (number % 15 == 0) {
			return "FizzBuzz";
		} else
		if (number % 3 == 0) {
			return "Fizz";
		} else
		if (number % 5 == 0) {
			return "Buzz";
		} else
		 	{
			return Integer.toString(number);
		}
	}
}
