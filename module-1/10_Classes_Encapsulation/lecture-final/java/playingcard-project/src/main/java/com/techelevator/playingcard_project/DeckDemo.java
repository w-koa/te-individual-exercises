package com.techelevator.playingcard_project;

public class DeckDemo {

	public static void main(String[] args) {
		//Create a deck of cards
		Deck deckOfCards = new Deck();
		System.out.println(deckOfCards);
		
		deckOfCards.shuffle();
		System.out.println((deckOfCards));
		System.clearProperty("cls");
		
		PlayingCard myCard = deckOfCards.deal();
		myCard.flip();
		System.out.println(myCard);
	}

}
