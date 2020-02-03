package com.techelevator;

public interface ValidCardHand {

	public void show(); // shows all cards in hand
	public void clearHand(); // removes cards from hand
	public void dealHand(CardDeck aDeck); // fill hand from CardDeck
	public void drawCard(PlayingCard aCard); // draws a card
}
