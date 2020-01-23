package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("       MAPS");
		System.out.println("####################");
		System.out.println();

		/* Map is an interface and HashMap is a class that implements Map */

		Map <String, Integer> myMap = new HashMap<>();
		
		myMap.put("Andorra", 42);
		myMap.put("James", 24);
		myMap.put("Seth", 7);
		myMap.put("Norm", 23);
		myMap.put("Kevin", 11);
		myMap.put("Margaret", 42);
		
		System.out.println("Seth's favorite number is " + myMap.get("Seth"));
		
		double favNumber = myMap.get("Norm");
		System.out.println("Norm's favorite number is " + favNumber);
		
		Set<String> keys = myMap.keySet();
		for (String name : keys) {
			System.out.println(name + "'s favorite number is " + myMap.get(name));
		}
		
		
		Set<String> names = new TreeSet<>();
		names.add("Scott");
		names.add("Greg");
		names.add("Casey");
		names.add("Mike");
		names.add("Son");
		names.add("Tim");
		
		names.add("Scott"); // this addition is ignored since it already exists.
		for (String name : names) {
			System.out.println(name + " Hash = " + name.hashCode());
		}
		
		
		/* The "put" method is used to add elements to a Map */

		/* The "get" method is used to retrieve elements from a Map */
	
		/* keySet returns a Set of all of the keys in the Map */
		
		/* If the key already exists, put will overwrite the existing value with the new value */


		System.out.println("####################");
		System.out.println("       SETS");
		System.out.println("####################");
		System.out.println();



		System.out.println("####################");
		System.out.println("Sets cannot contain duplicates");
		System.out.println("####################");
		System.out.println();


		System.out.println("####################");
		System.out.println("Sets do not guarantee ordering");
		System.out.println("####################");
		System.out.println();



	}

}
