package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CigarPartyTest {

	CigarParty cigarParty = new CigarParty();
	
	@Test
	public void haveParty_30_false_returns_false() {
		assertEquals(false, cigarParty.haveParty(30, false));
	}
	
	@Test
	public void haveParty_50_false_returns_true() {
		assertEquals(true, cigarParty.haveParty(50, true));
	}
	
	@Test
	public void haveParty_70_true_returns_true() {
		assertEquals(true, cigarParty.haveParty(70, true));
	}
	
	@Test
	public void haveParty_30_true_returns_false() {
		assertEquals(false, cigarParty.haveParty(30, true));
	}

}
