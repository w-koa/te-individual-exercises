package com.techelevator.playingcard_project;

public class DeckDemo {

	public static void main(String[] args) {
		Deck deckOfCards = new Deck();
		System.out.println(deckOfCards.toString());
		
		deckOfCards.shuffle();
		System.out.println(deckOfCards.toString());
		
		PlayingCard myCard = deckOfCards.deal();
		myCard.flipCard();
		System.out.println(myCard);

	}

}
