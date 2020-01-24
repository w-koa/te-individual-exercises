package com.techelevator.playingcard_project;

public class PlayingCardDemo {

	public static void main(String[] args) {
		
		PlayingCard aceOfSpades = new PlayingCard();
		System.out.println(aceOfSpades.toString());
		
		PlayingCard kingOfHearts = new PlayingCard("Hearts", 'K', 13, true);
		System.out.println(kingOfHearts.toString());
		
		aceOfSpades.flipCard();
		System.out.println(aceOfSpades);
		
	}

}
