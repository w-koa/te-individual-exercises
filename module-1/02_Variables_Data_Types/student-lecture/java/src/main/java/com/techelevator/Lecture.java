package com.techelevator;

public class Lecture {

	public static void main(String[] args) {
		
		/*
		1. Create a variable to hold an int and call it numberOfExercises.
			Then set it to 26.
		*/
		int numberOfExercises;
		numberOfExercises = 26;
		System.out.println(numberOfExercises);

		/*
		2. Create a variable to hold a double and call it half.
			Set it to 0.5.
		*/
		double half = 0.5;
		System.out.println(half);

		/*
		3. Create a variable to hold a String and call it name.
			Set it to "TechElevator".
		*/
		String name = "TechElevator";
		System.out.println(name);

		/*
		4. Create a variable called seasonsOfFirefly and set it to 1.
		*/
		int seasonsOfFirefly = 1;
		
		System.out.println(seasonsOfFirefly);

		/*
		5. Create a variable called myFavoriteLanguage and set it to "Java".
		*/
		String myFavoriteLanguage = "Java";
		System.out.println(myFavoriteLanguage);

		/*
		6. Create a variable called pi and set it to 3.1416.
		*/
		double pi = 3.1416;
		
		System.out.println(pi);

		/*
		7. Create and set a variable that holds your name.
		*/
		String myName = "Willis";
		System.out.println(myName);
		/*
		8. Create and set a variable that holds the number of buttons on your mouse.
		*/
		int mouseButtons = 2;
		System.out.println(mouseButtons);
		/*
		9. Create and set a variable that holds the percentage of battery left on
		your phone.
		*/
		int phoneBattery = 80;
		System.out.println(phoneBattery);
		/*
		10. Create an int variable that holds the difference between 121 and 27.
		*/
		int num1 = 121;
		int num2 = 27;
		int difference = num1 - num2;
		System.out.println(difference);
		/*
		11. Create a double that holds the addition of 12.3 and 32.1.
		*/
		double sum = 12.3 + 32.1;
		System.out.println(sum);
		System.out.printf("%6.2f\n", sum);
		/*
		12. Create a String that holds your full name.
		*/
		String fullName = "Willis Koa";
		System.out.println(fullName);
		/*
		13. Create a String that holds the word "Hello, " concatenated onto your
		name from above.
		*/
		String hello = "Hello, " + fullName;
		System.out.println(hello);
		/*
		14. Add a " Esquire" onto the end of your full name and save it back to
		the same variable.
		*/
		fullName = fullName + " Esquire";
		System.out.println(fullName);
		/*
		15. Now do the same as exercise 14, but use the += operator.
		*/
		fullName = fullName += " Esquire";
		System.out.println(fullName);
		/*
		16. Create a variable to hold "Saw" and add a 2 onto the end of it.
		*/
		String saw = "Saw";
		System.out.println(saw + 2);
		/*
		17. Add a 0 onto the end of the variable from exercise 16.
		*/
		
		System.out.println(saw + 2 + 0);
		/*
		18. What is 4.4 divided by 2.2?
		*/
		double answer = 4.4/2.2;
		System.out.println(answer);
		/*
		19. What is 5.4 divided by 2?
		*/
		double answer2 = 5.4/2;
		System.out.println(answer2);
		/*
		20. What is 5 divided by 2?
		*/
		int answer3 = 5/2;
		System.out.println(answer3);
		/*
		21. What is 5.0 divided by 2?
		*/
		double answer4 = 5.0/2;
		System.out.println(answer4);
		/*
		22. What is 66.6 divided by 100? Is the answer you get right or wrong?
		*/
		double answer5 = 66.6/100;
		//boolean correct = false;
		System.out.println(answer5);
		/*
		23. If I divide 5 by 2, what's my remainder?
		*/
		int answer6 = 5/2;
		int remainder6 = 5%2;
		System.out.println(answer6 + " with a remainder of " + remainder6);
		/*
		24. What is 1,000,000,000 * 3?
		*/
		long bigNumber = 1000000000l * 3;
		System.out.println(bigNumber);
		/*
		25. Create a variable that holds a boolean called doneWithExercises and
		set it to false.
		*/
		boolean doneWithExercises = false;
		System.out.println(doneWithExercises);
		/*
		26. Now set doneWithExercise to true.
		*/
		doneWithExercises = true;
		System.out.println(doneWithExercises);
	}

}
