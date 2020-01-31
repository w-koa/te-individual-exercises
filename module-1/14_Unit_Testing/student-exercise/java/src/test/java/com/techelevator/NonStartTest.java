package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class NonStartTest {
	
	NonStart nonStart = new NonStart();

	@Test
	public void getPartialString_Hello_There_returns_ellohere() {
		String a = "Hello";
		String b = "There";
		assertEquals("ellohere", nonStart.getPartialString(a, b));
	}

	@Test
	public void getPartialString_java_code_returns_avaode() {
		String a = "java";
		String b = "code";
		assertEquals("avaode", nonStart.getPartialString(a, b));
	}
	
	@Test
	public void getPartialString_shotl_java_returns_hotlava() {
		String a = "shotl";
		String b = "java";
		assertEquals("hotlava", nonStart.getPartialString(a, b));
	}
}
