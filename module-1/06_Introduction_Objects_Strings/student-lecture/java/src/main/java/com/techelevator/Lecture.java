package com.techelevator;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");



		/* create an new instance of String using a literal */

		String greeting = "Hello, World";
		String greetingPart2 = " Hello world";
		String longerGreeting = greeting + greetingPart2;
		System.out.println(longerGreeting);
		
		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();
		
		String name = "Robert Norman Ross";
		//Gets length of name string.
		int nameLength = name.length();
		System.out.println(nameLength);
		
		//Gets character at index[3]
		char testLetter = name.charAt(3);
		System.out.println(testLetter);
		
		//Prints starting index of string "or"
		int position = name.indexOf("or");
		System.out.println(position);
		
		//Prints position of first "r"
		int position2 = name.indexOf("r");
		System.out.println(position2);
		
		String middleName = name.substring(7, 13);
		System.out.println(middleName);
		
		String lastName = name.substring(14);
		System.out.println(lastName);
		
		String carelessString = "Drinking Tea ";
		String carefulString = carelessString.trim();
		System.out.println(carefulString + carefulString.length());
		System.out.println(carelessString + carelessString.length());
		
		String shoutingString = "BLAHAWEOIJFOIBOBBLAIB!!!!";
		String quietString = shoutingString.toLowerCase();
		System.out.println(shoutingString);
		System.out.println(quietString);
		
		//Can chain methods. Here we change the rest to lower case and use substrings to combine.
		String lowerCasePart = shoutingString.substring(1).toLowerCase();
		String upperCasePart = shoutingString.substring(0, 1);
		System.out.println(upperCasePart + lowerCasePart);
		
		// Replace method example
		String tiredString = "I am tired.";
		String energeticString = tiredString.replace("tired", "super");
		System.out.println(tiredString);
		System.out.println(energeticString);
		// tiredString.replace("tired", "super");
		// Still prints "I am tired."
		// If you don't save the new string to a variable, method does not do anything. Strings are immutable!
		
		
		/* Other commonly used methods:
		 *
		 * endsWith
		 * startsWith
		 * indexOf
		 * lastIndexOf
		 * length
		 * substring
		 * toLowerCase
		 * toUpperCase
		 * trim
		 */

		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();
		
		// Takes an array of characters and converts to a string.
		char [] helloArray = new char[] {'H', 'e', 'l', 'l', 'o'};
		String hello1 = new String(helloArray);
		System.out.println(hello1);
		
		String hello2 = new String("Hello");
		System.out.println(hello2);
		
		if (hello1 == hello2) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
		
		if (hello1.equals(hello2)) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
		
		// same reference point
		String hello3 = hello1;
		if (hello1 == hello3) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
		/* Double equals will compare to see if the two variables, hello1 and
		 * hello2 point to the same object in memory. Are they the same object? */
	

		/* So, to compare the values of two objects, we need to use the equals method.
		 * Every object type has an equals method */

		
		/* The String class gets special treatment in the Java language.  One
		 * example of this is that there is a literal representation of a
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */

	}
}
