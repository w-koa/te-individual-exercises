package com.techelevator.playingcard_project;

public class PlayingCard {
	// Attributes
	private String suit;
	private char rank;
	private int value;
	private boolean isFaceUp;
	
	// Default Constructor
	public PlayingCard() {
		this.setSuit("Spades");
		this.setRank('A');
		this.setValue(14);
		this.setFaceUp(false);
	}
	
	public PlayingCard(String suit, char rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	public PlayingCard(String suit, char rank, int value, boolean isFaceUp) {
		super();
		this.suit = suit;
		this.rank = rank;
		this.value = value;
		this.isFaceUp = isFaceUp;
	}


	// Sets and Gets
	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public char getRank() {
		return rank;
	}

	public void setRank(char rank) {
		this.rank = rank;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public boolean isFaceUp() {
		return isFaceUp;
	}

	public void setFaceUp(boolean isFaceUp) {
		this.isFaceUp = isFaceUp;
	}
	
	public String toString() {
		return "[" + suit + ", " + rank + ", " + value + ", " + isFaceUp + "]";
	}
	
	public boolean flipCard() {
		isFaceUp = !isFaceUp;
		return isFaceUp;
	}
	
}
