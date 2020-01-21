package com.techelevator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");

		List<String> animals = new ArrayList<> (Arrays.asList("Dog", "Cat", "Horse", "Lizard", "Butterfly"));
		animals.add("Penguin");
		animals.add(0, "bat");
		System.out.println(animals.get(0));
		
		for (int i = 0; i < animals.size(); i++) {
			System.out.println(animals.get(i));
		}
		
		animals.add(2, "Rats");
		for (int i = 0; i < animals.size(); i++) {
			System.out.println(animals.get(i));
		}
		
		animals.remove(2);
		for (int i = 0; i < animals.size(); i++) {
			System.out.println(animals.get(i));
		}
		
		if (animals.contains("Dog")) {
			System.out.println("nice List!");
		}
		
		boolean containsRats = animals.contains("rats");
		System.out.println("rats in list: " + containsRats);
		
		int index = animals.indexOf("Dog");
		System.out.println("Dog is in the: " + index + " position.");
		
		String[] animalsArray = animals.toArray(new String[animals.size()]);
		for (int i = 0; i < animalsArray.length; i++) {
			System.out.println(animalsArray[i]);
		}

		Integer employees = new Integer (25); 		// wraps primitive int and turns it into an object.
		Integer piecesOfCake = new Integer ("24"); 	// takes String and converts to Integer.
		
		for (String animal : animals) {
			System.out.println(animal);
		}
		
		List<String> names = new ArrayList<>(); // Declares string list.
		
		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");

		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		System.out.println("####################");
		System.out.println(" PRIMITIVE WRAPPERS");
		System.out.println("####################");

		/* Every primitive data type has an equivalent "primitive wrapper class" that is an object representation
		 * of a primitive value */

		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();

		System.out.println("####################");
		System.out.println("       QUEUES");
		System.out.println("####################");
		System.out.println();

		Queue <String> thingsToDo = new LinkedList<>();
		thingsToDo.offer("read");
		thingsToDo.offer("lecture notes");
		thingsToDo.offer("code");
		
		
		
		
		/////////////////////
		// PROCESSING ITEMS IN A QUEUE
		/////////////////////

		System.out.println("####################");
		System.out.println("       STACKS");
		System.out.println("####################");
		System.out.println();

		////////////////////
		// PUSHING ITEMS TO THE STACK
		////////////////////

		////////////////////
		// POPPING THE STACK
		////////////////////

	}
}
