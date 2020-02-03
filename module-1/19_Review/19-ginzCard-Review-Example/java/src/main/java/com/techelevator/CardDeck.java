package com.techelevator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.techelevator.PlayingCard.CardSuit;
import com.techelevator.PlayingCard.CardValue;

public class CardDeck {

	/*
	 * Class to simulate a Deck of Playing Cards
	 * Initial setup as Queue/linked list
	 */
	
	Queue<PlayingCard> deckofCards = new LinkedList<>();
	
	// Define number of cards in a suit
	public static final int NUMER_OF_CARDS_PER_SUIT = 13;
	
	// Default constructor
	public CardDeck() {
		resetDeck(true);
	}
	
	// Constructor that allows user to determine whether to create with jokers or not
	public CardDeck(boolean withJokers) {
		resetDeck(withJokers);
	}
	
	public void resetDeck(boolean withJokers) {
		deckofCards.clear(); // removes all elements from queue
		for (int i = 1; i <= NUMER_OF_CARDS_PER_SUIT; i++) {
			deckofCards.add(new PlayingCard(i, PlayingCard.CardSuit.SPADE));
		}
		for (int i = 1; i <= NUMER_OF_CARDS_PER_SUIT; i++) {
			deckofCards.add(new PlayingCard(i, PlayingCard.CardSuit.HEART));
		}
		for (int i = 1; i <= NUMER_OF_CARDS_PER_SUIT; i++) {
			deckofCards.add(new PlayingCard(i, PlayingCard.CardSuit.DIAMOND));
		}
		for (int i = 1; i <= NUMER_OF_CARDS_PER_SUIT; i++) {
			deckofCards.add(new PlayingCard(i, PlayingCard.CardSuit.CLUB));
		}
		if (withJokers) {
			deckofCards.add(new PlayingCard(CardValue.JOKER, CardSuit.JOKER));
			deckofCards.add(new PlayingCard(CardValue.JOKER, CardSuit.JOKER));
		}
	}
	
	public void shufflDeck() {
		Collections.shuffle((List<?>) deckofCards);
	}
	public PlayingCard dealCard() {
		if (deckofCards.size() > 0) {
			return deckofCards.remove();
		}
		return null;
	}
	
	public void showDeck() {
		System.out.println("Number of cards in deck: " + deckofCards.size());
		for (PlayingCard card : deckofCards) {
			card.showCardWithHash();
		}
	}
	
}
