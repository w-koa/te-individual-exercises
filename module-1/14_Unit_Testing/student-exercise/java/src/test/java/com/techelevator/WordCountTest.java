package com.techelevator;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class WordCountTest {

	WordCount wordCount = new WordCount();
	
	@Test
	public void getCount_null_returns_empty() {
		Map<String, Integer> expected = new HashMap<>();
		expected.put(null, null);
		assertEquals(expected, wordCount.getCount(null));
	}
	@Test
	public void getCount_ba_ba_black_sheep_returns_ba_2_black_1_sheep_1() {
		String[] string = {"ba", "ba", "black", "sheep"};
		Map<String, Integer> expected = new HashMap<>();
		expected.put("ba", 2);
		expected.put("black", 1);
		expected.put("sheep", 1);
		assertEquals(expected, wordCount.getCount(string));
	}
	
	@Test
	public void getCount_abacb_returns_b2_c1_a_2() {
		Map<String, Integer> expected = new HashMap<>();
		expected.put("b", 2);
		expected.put("c", 1);
		expected.put("a",2);
		String[] string = {"a", "b", "a", "c", "b"};
		assertEquals(expected, wordCount.getCount(string));
	}
	
	@Test
	public void getCount_cba_returns_c1_b1_a1() {
		Map<String, Integer> expected = new HashMap<>();
		expected.put("a", 1);
		expected.put("b", 1);
		expected.put("c", 1);
		String[] string = {"c", "b", "a"};
		assertEquals(expected, wordCount.getCount(string));
	}

}
