package com.techelevator.farm;

import java.math.BigDecimal;
import java.util.Scanner;

public class OldMacdonald {
	public static void main(String[] args) {

		FarmAnimal[] farmAnimals = new FarmAnimal[] { new Cow(), new Chicken(), new Sheep() };

		for (FarmAnimal animal : farmAnimals) {
			String name = animal.getName();
			String sound = animal.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
			System.out.println();
		}
		
		Sheep sheep1 = new Sheep();
		
		System.out.println(sheep1.getSoundOnce());
		
		Tractor tractor1 = new Tractor();
		System.out.println(tractor1.getPrice());
		tractor1.setSound("AHAHHAHAHHHHHHAAAAHH");
		tractor1.setName("SCREAMY");
		tractor1.setColor("BLUE!!");
		System.out.println(tractor1.getSoundTwice());
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("What type of crop do you want to buy? ");
		Crops crop = new Crops();
		crop.setName(input.nextLine());
		System.out.println("What unit are you buying? ");
		crop.setUnit(input.nextLine());
		
		System.out.println("That will cost " + crop.getPrice().setScale(2, BigDecimal.ROUND_HALF_DOWN));
		
	}
}