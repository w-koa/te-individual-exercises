package com.techelevator.inheritance_project;

public class HorseDemo {

	public static void main(String[] args) {
		
		// Create a horse
		Horse horse1 = new Horse();
//		
//		System.out.println("Horse name: " + horse1.getName() + 
//				"\nHorse color: " + horse1.getColor() + 
//				"\nHorse birthyear: " + horse1.getBirthYear());
		horse1.setName("woeijoj");
		horse1.setColor("Galaxy super nova");
		horse1.setBirthYear(1234);
		
		printInfo(horse1);
		
		RaceHorse horse2 = new RaceHorse();
		horse2.setName("SLOWBBA");
		horse2.setColor("green");
		horse2.setBirthYear(9999);
		horse2.setNumberOfRaces(9999);
		
		printInfo(horse2);
		System.out.println("Races run: " + horse2.getNumberOfRaces());
		
		System.out.println(horse2.toString());
		
	}
	public static void printInfo(Horse horse) {
		System.out.println("Horse name: " + horse.getName() + 
				"\nHorse color: " + horse.getColor() + 
				"\nHorse birthyear: " + horse.getBirthYear());
	}
	
	

}
