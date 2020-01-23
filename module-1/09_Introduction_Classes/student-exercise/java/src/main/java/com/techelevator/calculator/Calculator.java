package com.techelevator.calculator;

public class Calculator {

	private int result;
	//Getter
	public int getResult() {
		return result;
	}

	
	//Default calculator
	public Calculator() {
		this.result = 0;
	}
	
	public int add(int addend) {
		return this.result = result + addend;
	}
	
	public int multiply(int multiplier) {
		return this.result = result * multiplier;
	}
	
	public int power(int exponent) {
		return this.result = (int) Math.pow(result, exponent);
	}
	
	public void reset() {
		this.result = 0;
	}
	
	public int subtract(int subtrahend) {
		return this.result = result - subtrahend;
	}
}
