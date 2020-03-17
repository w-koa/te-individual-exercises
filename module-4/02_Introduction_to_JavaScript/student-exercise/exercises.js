﻿
1.// **sumDouble** Given two int values, return their sum. Unless the two values are the 
   // same, then return double their sum.

		//sumDouble(1, 2) → 3
		//sumDouble(3, 2) → 5
		//sumDouble(2, 2) → 8

		function sumDouble(x, y) {
			// do logic here
			// return result;
			if(x == y) {
				return (x + y) * 2;
			} else
			return x + y;
        }


/*
2. **hasTeen** We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
    Given 3 int values, return true if 1 or more of them are teen.

		hasTeen(13, 20, 10) → true
		hasTeen(20, 19, 10) → true
		hasTeen(20, 10, 13) → true
*/
		function hasTeen(x, y, z) {
			if (x > 12 && x < 20 || y > 12 && y < 20 || z > 12 && z < 20) {
				return true;
			} else
			return false;
		}

/* 
3. **lastDigit** Given two non-negative int values, return true if they have the same 
    last digit, such as with 27 and 57.

		lastDigit(7, 17) → true
		lastDigit(6, 17) → false
		lastDigit(3, 113) → true
*/
		function lastDigit(x, y) {
			if (x % 10 == y % 10) {
				return true;
			} else
			return false;
		}

/*
4. **seeColor** Given a string, if the string begins with "red" or "blue" return that color 
    string, otherwise return the empty string.

		seeColor("redxx") → "red"
		seeColor("xxred") → ""
        seeColor("blueTimes") → "blue"
*/
		function seeColor(stringThing) {
			if (stringThing.substring(0,3) == "red") {
				return "red";
			} else if (stringThing.substring(0, 4) == "blue") {
				return "blue";
			} else
			return "";
		}

/*
5. **oddOnly** Write a function that given an array of integer of any length, filters out 
    the even number, and returns a new array of just the the odd numbers.

		oddOnly([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) → [1, 3, 5, 7, 9, 11];
		oddOnly([2, 4, 8, 32, 256]); → []
*/
		function oddOnly(intArray) {
			let newArray = [];
			for (i = 0; i < intArray.length; i++) {
				if (intArray[i] % 2 != 0) {
					newArray.push(intArray[i]);
				}
			}
			return newArray;
		}


/*
6. **frontAgain** Given a string, return true if the first 2 chars in the string also appear 
    at the end of the string, such as with "edited".

		frontAgain("edited") → true
		frontAgain("edit") → false
		frontAgain("ed") → true
*/
		function frontAgain(someString) {
			if (someString.substring(0,2) == someString.substring(someString.length - 2)) {
				return true;
			} else
			return false;
		}

/*
7. **cigarParty** When squirrels get together for a party, they like to have cigars. 
A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. 
Unless it is the weekend, in which case there is no upper bound on the number of cigars. 
Write a squirrel party function that return true if the party with the given values is successful, 
or false otherwise.

		cigarParty(30, false) → false
		cigarParty(50, false) → true
		cigarParty(70, true) → true
*/
		function cigarParty(cigars, isWeekend) {
			if (isWeekend && cigars >= 40) {
				return true;
			} else
			if (!isWeekend && (cigars >= 40 && cigars <=60)) {
				return true;
			} else 
			return false;
		}
		

/*
8. **fizzBuzz** Because you know you can't live without it, FizzBuzz.

		fizzBuzz(3) → "Fizz"
		fizzBuzz(1) → 1
		fizzBuzz(10) → "Buzz"
		fizzBuzz(15) → "FizzBuzz"
		fizzBuzz(8) → 8
*/
		function fizzBuzz(number) {
			if (number % 15 == 0) {
				return "FizzBuzz";
			} else
			if (number % 5 == 0) {
				return "Buzz";
			} else
			if (number % 3 == 0) {
				return "Fizz";
			} else
			return number;
		}

/*
9. **filterEvens** Write a function that filters an array to only include even numbers.

	filterEvens([]) → []
	filterEvens([1, 3, 5]) → []
	filterEvens([2, 4, 6]) → [2, 4, 6]
	filterEvens([100, 8, 21, 24, 62, 9, 7]) → [100, 8, 24, 62]
*/
		function filterEvens(numArray) {
			let filteredArray = [];
			for (i = 0; i < numArray.length; i++) {
				if (numArray[i] % 2 == 0) {
					filteredArray.push(numArray[i]);
				}
			}
			return filteredArray;
		}

/*
10. **filterBigNumbers** Write a function that filters numbers greater than or equal to 100.

	filterBigNumbers([7, 10, 121, 100, 24, 162, 200]) → [121, 100, 162, 200]
	filterBigNumbers([3, 2, 7, 1, -100, -120]) → []
	filterBigNumbers([]) → []
*/
		function filterBigNumbers(numArray) {
			let filteredArray = [];
			for (i = 0; i < numArray.length; i++) {
				if (numArray[i] >= 100) {
					filteredArray.push(numArray[i]);
				}
			}
			return filteredArray;
		}

/*
11. **filterMultiplesOfX** Write a function to filter numbers that are a multiple of a 
parameter, `x` passed in.

	filterMultiplesOfX([3, 5, 1, 9, 18, 21, 42, 67], 3) → [3, 9, 18, 21, 42]
	filterMultiplesOfX([3, 5, 10, 20, 18, 21, 42, 67], 5) → [5, 10, 20]
*/
		function filterMultiplesOfX(numArray, x) {
			let filtered = [];
			for (i = 0; i < numArray.length; i++) {
				if (numArray[i] % x == 0) {
					filtered.push(numArray[i]);
				}
			}
			return filtered;
		}

/*
12. **createObject** Write a function that creates an object with a property called 
firstName, lastName, and age. Populate the properties with your values.

	createObject() →

	{
		firstName,
		lastName,
		age
	}
*/
function createObject() {
	let person = {
	firstName: "Bob",
	lastName: "Smith",
	age: 101
	}
	return person;
}
