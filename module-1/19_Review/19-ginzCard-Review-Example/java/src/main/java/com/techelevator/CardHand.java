package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class CardHand implements ValidCardHand{

	private int numCardsInHand;
	protected List<PlayingCard> aHand;
	
	public CardHand(int numCardsInHand) {
		this.numCardsInHand = numCardsInHand;
		aHand = new ArrayList<>(numCardsInHand);
		
	}
	
	
	public List<PlayingCard> getHand() {
		return aHand;
	}
	@Override
	public void drawCard(PlayingCard aCard) {
		aHand.add(aCard);
	}

	@Override
	public void show() {
		for (PlayingCard aCard: aHand) {
			System.out.println(aCard);
		}
	}

	@Override
	public void clearHand() {
		aHand.clear();
		
	}

	@Override
	public void dealHand(CardDeck aDeck) {
		for (int i = 0; i < numCardsInHand; i++) {
			aHand.add(aDeck.dealCard()); // take a card from the deck and add it to hand
		}
		
	}
}
