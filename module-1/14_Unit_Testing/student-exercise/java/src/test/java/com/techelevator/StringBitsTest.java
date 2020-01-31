package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringBitsTest {

	StringBits stringBits = new StringBits();
	
	@Test
	public void getBits_returns_empty_if_null() {
		assertEquals("", stringBits.getBits(null));
	}
	
	@Test
	public void getBits_hello_returns_hlo() {
		assertEquals("Hlo", stringBits.getBits("Hello"));
	}
	
	@Test
	public void getBits_hi_returns_h() {
		assertEquals("H", stringBits.getBits("Hi"));
	}
	
	@Test
	public void getBits_heeololeo_returns_hello() {
		assertEquals("Hello", stringBits.getBits("Heeololeo"));
	}

}
