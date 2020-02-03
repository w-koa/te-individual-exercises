package com.techelevator;

public class TestCard {

	public static void main(String[] args) {

		CardDeck deck = new CardDeck(false);
		
		deck.showDeck();
		
		deck.shufflDeck();
		
		deck.showDeck();
		
		
		CardHand hand = new CardHand(5);
		hand.show();
		hand.dealHand(deck);
		System.out.println("Hand: ");hand.show();
		hand.drawCard(deck.dealCard());
		
		PokerHand pokerhand = new PokerHand();
		pokerhand.dealHand(deck);
		System.out.println("poker hand: ");
		pokerhand.show();
		
		deck.showDeck();
	}

}
