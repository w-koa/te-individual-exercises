package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class Exercises {

	/*
	 * Map Exercises
	 */

	/*
	 * Given the name of an animal, return the name of a group of that animal
	 * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").
	 *
	 * The animal name should be case insensitive so "elephant", "Elephant", and
	 * "ELEPHANT" should all return "herd".
	 *
	 * If the name of the animal is not found, null, or empty, return "unknown".
	 *
	 * Rhino -> Crash
	 * Giraffe -> Tower
	 * Elephant -> Herd
	 * Lion -> Pride
	 * Crow -> Murder
	 * Pigeon -> Kit
	 * Flamingo -> Pat
	 * Deer -> Herd
	 * Dog -> Pack
	 * Crocodile -> Float
	 *
	 * animalGroupName("giraffe") → "Tower"
	 * animalGroupName("") -> "unknown"
	 * animalGroupName("walrus") -> "unknown"
	 *
	 */
	public String animalGroupName(String animalName) {
		//Easy Method using TreeMap<>(String.CASE_INSENSITIVE_ORDER).
		Map<String, String> animalGroups = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
		
		animalGroups.put("Rhino", "Crash");
		animalGroups.put("Giraffe", "Tower");
		animalGroups.put("Elephant", "Herd");
		animalGroups.put("Lion", "Pride");
		animalGroups.put("Crow", "Murder");
		animalGroups.put("Pigeon", "Kit");
		animalGroups.put("Flamingo", "Pat");
		animalGroups.put("Deer", "Herd");
		animalGroups.put("Dog", "Pack");
		animalGroups.put("Crocodile", "Float");
		
		boolean isAnimalHere = animalGroups.containsKey(animalName);
		
		if (isAnimalHere) {
			return animalGroups.get(animalName);
		} else return "unknown";
		
		//return animalGroups.getOrDefault(animalName.toLowerCase(), null);
	}

	/*
	 * Given an String item number (a.k.a. SKU), return the discount percentage if the item is on sale.
	 * If the item is not on sale, return 0.00.
	 *
	 * If the item number is empty or null, return 0.00.
	 *
	 * "KITCHEN4001" -> 0.20
	 * "GARAGE1070" -> 0.15
	 * "LIVINGROOM"	-> 0.10
	 * "KITCHEN6073" -> 0.40
	 * "BEDROOM3434" -> 0.60
	 * "BATH0073" -> 0.15
	 *
	 * The item number should be case insensitive so "kitchen4001", "Kitchen4001", and "KITCHEN4001"
	 * should all return 0.20.
	 *
	 * isItOnSale("kitchen4001") → 0.20
	 * isItOnSale("") → 0.00
	 * isItOnSale("GARAGE1070") → 0.15
	 * isItOnSale("dungeon9999") → 0.00
	 *
	 */
	public Double isItOnSale(String itemNumber) {
		// Easy case insensitivity using TreeMap<>(String.CASE_INSENSITIVE_ORDER).
		Map<String, Double> priceMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
		priceMap.put("KITCHEN4001", 0.20);
		priceMap.put("GARAGE1070", 0.15);
		priceMap.put("LIVINGROOM", 0.10);
		priceMap.put("KITCHEN6073", 0.40);
		priceMap.put("BEDROOM3434", 0.60);
		priceMap.put("BATH0073", 0.15);
		
		boolean isItemHere = priceMap.containsKey(itemNumber);
		if (isItemHere) {
			if (priceMap.get(itemNumber) > 0) {
				return priceMap.get(itemNumber);
			}
		} else return 0.00;
		
		return 0.00;
	}

	/*
	 * Modify and return the given map as follows: if "Peter" has more than 0 money, transfer half of it to "Paul",
	 * but only if Paul has less than $10s.
	 *
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 *
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099}
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
	 *
	 */
	public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {
		int peterMoney = peterPaul.get("Peter");
		int paulMoney = peterPaul.get("Paul");
		
		if (peterMoney > 0 && paulMoney < 1000) {
			int peterMoneyRemainder = peterMoney % 2;
			peterMoney = peterMoney /2;
			paulMoney = (paulMoney + peterMoney );
			
			peterPaul.replace("Peter", peterMoney + peterMoneyRemainder);
			peterPaul.replace("Paul", paulMoney);
			
		}
//		System.out.println(peterPaul);
		return peterPaul;
	}

    /*
	 * Modify and return the given map as follows: if "Peter" has $50 or more, AND "Paul" has $100 or more,
	 * then create a new "PeterPaulPartnership" worth a combined contribution of a quarter of each partner's
	 * current worth.
	 *
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 * 
	 * peterPaulPartnership({"Peter": 5000, "Paul": 10000}) → {"Peter": 3750, "Paul": 7500, "PeterPaulPartnership": 3750}
	 * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter": 3333, "Paul": 1234567890}
	 *
	 */
	public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
		
		if (peterPaul.get("Peter") >= 5000 && peterPaul.get("Paul") >= 10000) {
			peterPaul.put("PeterPaulPartnership", (int) ((peterPaul.get("Peter") * 0.25) + (peterPaul.get("Paul")) * .25));
			peterPaul.replace("Peter", (int) (peterPaul.get("Peter") * 0.75));
			peterPaul.replace("Paul", (int) (peterPaul.get("Paul") * 0.75));
			
			//System.out.println(peterPaul);
		}
		//System.out.println(peterPaul);
		return peterPaul;
	}

	/*
	 * Given an array of non-empty strings, return a Map<String, String> where for every different string in the array,
	 * there is a key of its first character with the value of its last character.
	 *
	 * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
	 * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
	 * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d", "m": "t", "n": "t"}
	 */
	public Map<String, String> beginningAndEnding(String[] words) {
		Map<String, String> beginAndEndMap = new HashMap<>();
		for (String word : words) {
	
			beginAndEndMap.put(word.substring(0, 1), word.substring(word.length() - 1));
		}
		//System.out.println(beginAndEndMap);
		return beginAndEndMap;
	}

	/*
	 * Given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the
	 * number of times that string appears in the array.
	 *
	 * ** A CLASSIC **
	 *
	 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
	 * wordCount([]) → {}
	 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
	 *
	 */
	public Map<String, Integer> wordCount(String[] words) {

		Map<String, Integer> wordCounterMap = new HashMap<>();
		
		for (int i = 0; i < words.length; i++) {
			int counter = 0;
			for (int j = 0; j < words.length; j++) {
			
				if(words[i].equals(words[j])) {
					counter++;
				}
			wordCounterMap.put(words[i], counter);
			}
		}
//		System.out.println(wordCounterMap);
		return wordCounterMap;
	}

	/*
	 * Given an array of int values, return a Map<Integer, Integer> with a key for each int, with the value the
	 * number of times that int appears in the array.
	 *
	 * ** The lesser known cousin of the the classic wordCount **
	 *
	 * integerCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 1, 44: 1, 55: 1, 63: 3, 77: 1, 99:2}
	 * integerCount([107, 33, 107, 33, 33, 33, 106, 107]) → {33: 4, 106: 1, 107: 3}
	 * integerCount([]) → {}
	 *
	 */
	public Map<Integer, Integer> integerCount(int[] ints) {
		Map<Integer, Integer> intCounter = new HashMap<>();
		
		for (int i = 0; i < ints.length; i++) {
			int counter = 0;
			for (int j = 0; j < ints.length; j++) {
			
				if(ints[i] == ints[j]) {
					counter++;
				}
			intCounter.put(ints[i], counter);
			}
		}
		return intCounter;
		
	}

	/*
	 * Given an array of strings, return a Map<String, Boolean> where each different string is a key and value
	 * is true only if that string appears 2 or more times in the array.
	 *
	 * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
	 * wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
	 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 *
	 */
	public Map<String, Boolean> wordMultiple(String[] words) {
		Map<String, Boolean> multipleWordsMap = new HashMap<>();
	
		for (int i = 0; i < words.length; i++) {
			int counter = 0;
			
			for (int j = 0; j < words.length; j++) {
				if (words[i] == words[j]) {
					counter++;
				}
				if (counter >= 2) {
					multipleWordsMap.put(words[i], true);
				} else
			multipleWordsMap.put(words[i], false);
			}
		}
	
//		System.out.println(multipleWordsMap);
		return multipleWordsMap;
	}

	/*
	 * Given two maps, Map<String, Integer>, merge the two into a new map, Map<String, Integer> where keys in Map2,
	 * and their Integer values, are added to the Integer values of matching keys in Map1. Return the new map.
	 *
	 * Unmatched keys and their Integer values in Map2 are simply added to Map1.
	 *
	 * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11, "SKU4": 5})
	 * 	 → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
	 *
	 */
	public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse, Map<String, Integer> remoteWarehouse) {
		
		Map<String, Integer> combinedWares = new HashMap<>();
		
		combinedWares.putAll(mainWarehouse);
		Iterator<String> it = remoteWarehouse.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			if (mainWarehouse.containsKey(key)) {
				combinedWares.replace(key, mainWarehouse.get(key) + remoteWarehouse.get(key));
			} else combinedWares.put(key, remoteWarehouse.get(key));
		}
		
		System.out.println(combinedWares);
		
		// Lambda Method
		//remoteWarehouse.forEach((k, v) -> mainWarehouse.merge(k, v, Integer::sum));
		
		//System.out.println(mainWarehouse);
		return combinedWares;
	}

	/*
	 * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
	 *
	 * Given an array of strings, for each string, the count of the number of times that a substring length 2 appears
	 * in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1.
	 *
	 * We don't count the end substring, but the substring may overlap a prior position by one.  For instance, "xxxx"
	 * has a count of 2, one pair at position 0, and the second at position 1. The third pair at position 2 is the
	 * end substring, which we don't count.
	 *
	 * Return Map<String, Integer>, where the key is string from the array, and its last2 count.
	 *
	 * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1, "xaxxaxaxx": 1, "axxxaaxx": 2}
	 *
	 */
	public Map<String, Integer> last2Revisited(String[] words) {
		Map<String, Integer> last2Again = new HashMap<>();
		
		for (String word : words) {
			
			int count = 0;
			if (word.length() < 2) {
				last2Again.put(word, count);
			}
			String lastTwo = word.substring(word.length() - 2);
			for (int i = 0; i < word.length() - 2; i++) {
				if (word.substring(i, i + 2).equals(lastTwo)) {
					count++;
				}
				last2Again.put(word, count);
			}
		}
//		System.out.println(last2Again);
		return last2Again;
	}

	/*
	 Given a list of Strings, return a list that contains the distinct values. In other words, no value is to be
	 included more than once in the returned list. (Hint: Think Set)
	 distinctValues( ["red", "yellow", "green", "yellow", "blue", "green", "purple"] ) -> ["red", "yellow", "green", "blue", "purple"]
	 distinctValues( ["jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way"] ) -> ["jingle", "bells", "all", "the", "way"]
	 */
	public List<String> distinctValues(List<String> stringList) {
		List<String> distinct = new ArrayList<>();
		Set<String> stringSet = new LinkedHashSet<>();
		Stack<String> stringStack = new Stack<>();
		
		for (String item : stringList) {
			stringSet.add(item);
		}
		distinct.addAll(stringSet);

		System.out.println(distinct);
		return distinct;
	}

}
