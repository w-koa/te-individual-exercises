package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class SameFirstLastTest {

	SameFirstLast sameFirstLast = new SameFirstLast();
	
	@Test
	public void isItTheSame_nums_null_returns_false() {
		assertEquals(false, sameFirstLast.isItTheSame(null));
	}

	@Test
	public void isItTheSame_123_returns_false() {
		int[] nums = {1, 2, 3};
		assertEquals(false, sameFirstLast.isItTheSame(nums));
	}
	
	@Test
	public void isItTheSame_1231_returns_true() {
		int[] nums = {1, 2, 3, 1};
		assertEquals(true, sameFirstLast.isItTheSame(nums));
	}
	
	@Test
	public void isItTheSame_121_returns_true() {
		int[] nums = {1, 2, 1};
		assertEquals(true, sameFirstLast.isItTheSame(nums));
	}
}
