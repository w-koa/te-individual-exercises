package com.techelevator;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class AnimalGroupNameTest {

	AnimalGroupName animalGroup = new AnimalGroupName();
	
	@Test
	public void getHerd_rhino_returns_crash() {
		assertEquals(animalGroup.getHerd("rhino"), "Crash");
	}
	
	@Test
	public void getHerd_RHINO_returns_crash() {
		assertEquals(animalGroup.getHerd("RHINO"), "Crash");
	}
	
	@Test
	public void getHerd_cat_returns_unknown() {
		assertEquals(animalGroup.getHerd("Cat"), "unknown");
	}

	@Test
	public void getHerd_null_returns_unknown() {
		assertEquals(animalGroup.getHerd(null), "unknown");
	}
}
