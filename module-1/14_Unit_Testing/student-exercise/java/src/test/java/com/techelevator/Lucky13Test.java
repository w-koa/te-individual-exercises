package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class Lucky13Test {

	Lucky13 lucky13 = new Lucky13();
	
	@Test
	public void getLucky_0_2_4_returns_true() {
		int[] nums = new int[] {0, 2, 4};
		assertEquals(true, lucky13.getLucky(nums));
	}
	
	@Test
	public void getLucky_123_returns_false() {
		int[] nums = new int[] {1, 2, 3};
		assertEquals(false, lucky13.getLucky(nums));
	}
	
	@Test
	public void getLucky_124_returns_false() {
		int[] nums = new int[] {1, 2, 4};
		assertEquals(false, lucky13.getLucky(nums));
	}

}
