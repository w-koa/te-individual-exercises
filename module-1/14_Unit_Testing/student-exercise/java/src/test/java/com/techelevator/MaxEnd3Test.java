package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxEnd3Test {

	MaxEnd3 maxEnd3 = new MaxEnd3();
	
	@Test
	public void maxEnd3_123_returns_333() {
		int[] nums = new int[] {1, 2, 3};
		int[] expected = new int[] {3, 3, 3};
		assertArrayEquals(expected, maxEnd3.makeArray(nums));
	}
	
	@Test
	public void maxEnd3_11_5_9_returns_11s() {
		int[] nums = new int[] {11, 5, 9};
		int[] expected = {11, 11, 11};
		assertArrayEquals(expected, maxEnd3.makeArray(nums));
	}
	
	@Test
	public void maxEnd3_2_11_3_returns_333() {
		int[] nums = {2, 11, 3};
		int[] expected = {3, 3, 3};
		assertArrayEquals(expected, maxEnd3.makeArray(nums));
	}

}
