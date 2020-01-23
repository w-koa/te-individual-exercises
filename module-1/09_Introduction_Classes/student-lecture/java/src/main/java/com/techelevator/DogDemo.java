package com.techelevator;

public class DogDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog1 = new Dog();
		dog1.setName("Bob");
		dog1.setHas4Legs(true);
		dog1.setCutenessFactor(10);
		
		System.out.println("Dog name: " + dog1.getName());
		System.out.println("Has 4 legs: " + dog1.getHas4Legs());
		System.out.println("Cuteness Factor: " + dog1.getCutenessFactor());
				
				
		Dog dog2 = new Dog();
		dog2.setName("Jim");
		dog2.setHas4Legs(false);
		dog2.setCutenessFactor(2);
		
		System.out.println("Dog name: " + dog2.getName());
		System.out.println("Has 4 legs: " + dog2.getHas4Legs());
		System.out.println("Cuteness Factor: " + dog2.getCutenessFactor());
		dog2.getHowCute();
		
		Dog dog3 = new Dog();
		
		System.out.println("Dog name: " + dog3.getName());
		System.out.println("Has 4 legs: " + dog3.getHas4Legs());
		System.out.println("CutenessFactor: " + dog3.getCutenessFactor());
		dog3.getHowCute();
		
		Dog dog4 = new Dog("ASDF", 12, true);
		System.out.println("Dog Name: " + dog4.getName());
		System.out.println("Has 4 legs: " + dog4.getHas4Legs());
		System.out.println("CutenessFactor: " + dog4.getCutenessFactor());
		dog4.getHowCute();
		}
}


