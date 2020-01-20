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
