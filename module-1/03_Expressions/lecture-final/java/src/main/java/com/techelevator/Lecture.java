package com.techelevator;

public class Lecture {
    /*
    1. This method is named returnNotOne and it returns an int. Change
    it so that it returns something other than a 1.
    */
<<<<<<< HEAD:module-1/03_Expressions/student-lecture/java/src/main/java/com/techelevator/Lecture.java
    public int returnNotOne() {
        return 2;
=======
    public int returnNotOne() {  // method signature
        return 42;
>>>>>>> 4b46d932bb0dc96020f8c0cb956c106e9b566a70:module-1/03_Expressions/lecture-final/java/src/main/java/com/techelevator/Lecture.java
    }

    /*
    2. This method is named returnNotHalf and it returns a double. Change
    it so that it returns something other than a 0.5.
    */
    public double returnNotHalf() {
<<<<<<< HEAD:module-1/03_Expressions/student-lecture/java/src/main/java/com/techelevator/Lecture.java
        return 0.0;
=======
        return 6.5;
>>>>>>> 4b46d932bb0dc96020f8c0cb956c106e9b566a70:module-1/03_Expressions/lecture-final/java/src/main/java/com/techelevator/Lecture.java
    }

    /*
    3. This method needs to return a String. Fix it to return a valid String.
    */
    public String returnName() {
<<<<<<< HEAD:module-1/03_Expressions/student-lecture/java/src/main/java/com/techelevator/Lecture.java
        return "something";
=======
        return "Margaret";
>>>>>>> 4b46d932bb0dc96020f8c0cb956c106e9b566a70:module-1/03_Expressions/lecture-final/java/src/main/java/com/techelevator/Lecture.java
    }

    /*
    4. This method currently returns an int. Change it so that it returns a double.
    */
    public double returnDoubleOfTwo() {
        return 2.0;
    }

    /*
    5. This method should return the language that you're learning. Change
    it so that it does that.
    */
    public String returnNameOfLanguage() {
        return "Java";
    }

    /*
    6. This method uses an if statement to define what to return. Have it
    return true if the if statement passes.
    */
    public boolean returnTrueFromIf() {
    	boolean result = false;
        if (true) {
<<<<<<< HEAD:module-1/03_Expressions/student-lecture/java/src/main/java/com/techelevator/Lecture.java
            return true;
=======
            result = true;
>>>>>>> 4b46d932bb0dc96020f8c0cb956c106e9b566a70:module-1/03_Expressions/lecture-final/java/src/main/java/com/techelevator/Lecture.java
        }
        return result;
    }

    /*
    7. This method uses an if to check to make sure that one is equal
    to one. Make sure it returns true when one equals one.
    */
    public boolean returnTrueWhenOneEqualsOne() {
    	boolean result = false;
        if (1 == 1) {
<<<<<<< HEAD:module-1/03_Expressions/student-lecture/java/src/main/java/com/techelevator/Lecture.java
            return true;
=======
            result = true;
>>>>>>> 4b46d932bb0dc96020f8c0cb956c106e9b566a70:module-1/03_Expressions/lecture-final/java/src/main/java/com/techelevator/Lecture.java
        }

        return result;
    }

    /*
    8. This method checks a parameter passed to the method to see if it's
    greater than 5 and returns true if it is.
    */
    public boolean returnTrueWhenGreaterThanFive(int number) {
    	boolean result = false;
        if (number > 5) {
<<<<<<< HEAD:module-1/03_Expressions/student-lecture/java/src/main/java/com/techelevator/Lecture.java
        return true;
        } else {
=======
        	result = true;
        } else { // else means otherwise
>>>>>>> 4b46d932bb0dc96020f8c0cb956c106e9b566a70:module-1/03_Expressions/lecture-final/java/src/main/java/com/techelevator/Lecture.java

        }
        return result;
    }

    /*
    9. If you think about it, we really don't need the if statement above.
    How can we rewrite exercise 8 to have only one line of code?
    */
    public boolean returnTrueWhenGreaterThanFiveInOneLine(int number) {
        return (number > 5); // What can we put here that returns a boolean that we want?
    }

    /*
    10. This method will take a number and do the following things to it:
    * If addThree is true, we'll add three to that number
    * If addFive is true, we'll add five to that number
    * We'll then return the result
    */
    public int returnNumberAfterAddThreeAndAddFive(int number, boolean addThree, boolean addFive) {
        if (addThree) {
            number = number + 3;
        }

        // We can't use an else here. They could both be true, so we have to check each one.

        if (addFive) {
<<<<<<< HEAD:module-1/03_Expressions/student-lecture/java/src/main/java/com/techelevator/Lecture.java
            number += 5;
=======
            number += 5;  // number = number + 5;
>>>>>>> 4b46d932bb0dc96020f8c0cb956c106e9b566a70:module-1/03_Expressions/lecture-final/java/src/main/java/com/techelevator/Lecture.java
        }

        return number;
    }

    /*
    11. Write an if statement that returns "Fizz" if the parameter is 3 and returns an empty String for anything else.
    */
    public String returnFizzIfThree(int number) {
    	if (number == 3) {
<<<<<<< HEAD:module-1/03_Expressions/student-lecture/java/src/main/java/com/techelevator/Lecture.java
        
		return "Fizz";
    	} else return "";
=======
    		return "Fizz";
    	}
        return "";
>>>>>>> 4b46d932bb0dc96020f8c0cb956c106e9b566a70:module-1/03_Expressions/lecture-final/java/src/main/java/com/techelevator/Lecture.java
    }

    /*
    12. Now write the above using the Ternary operator ?:. If you're not sure what this is, you can Google it.
    */
    public String returnFizzIfThreeUsingTernary(int number) {
<<<<<<< HEAD:module-1/03_Expressions/student-lecture/java/src/main/java/com/techelevator/Lecture.java
        return number == 3 ? "Fizz" : "";
=======
        return (number == 3)? "Fizz" : "";
>>>>>>> 4b46d932bb0dc96020f8c0cb956c106e9b566a70:module-1/03_Expressions/lecture-final/java/src/main/java/com/techelevator/Lecture.java
    }

    /*
    13. Write an if/else statement that returns "Fizz" if the parameter is 3, "Buzz" if the parameter is 5 and an empty String for anything else.
    */
    public String returnFizzOrBuzzOrNothing(int number) {
<<<<<<< HEAD:module-1/03_Expressions/student-lecture/java/src/main/java/com/techelevator/Lecture.java
    	if (number == 3) { return "Fizz";
    	} else if (number == 5) { return "Buzz";
    	}
    	else return "";
=======
    	String result = "";
    	if (number == 3) {
    		result = "Fizz";
    	} else if (number== 5) {
    		result = "Buzz";
    	} else {
    		result = "";
    	}
        return result;
>>>>>>> 4b46d932bb0dc96020f8c0cb956c106e9b566a70:module-1/03_Expressions/lecture-final/java/src/main/java/com/techelevator/Lecture.java
    }

    /*
    14. Write an if statement that checks if the parameter number is either equal to or greater than 18. Return "Adult" if it is or "Minor" if it's not.
    */
    public String returnAdultOrMinor(int number) {
        if (number >= 18) {
            return "Adult";
        } else {
            return "Minor";
        }
    }

    /*
    15. Now, do it again with a different boolean operation.
    */
    public String returnAdultOrMinorAgain(int number) {
<<<<<<< HEAD:module-1/03_Expressions/student-lecture/java/src/main/java/com/techelevator/Lecture.java
        if (18 <= number) {
=======
        if (number > 17) {
>>>>>>> 4b46d932bb0dc96020f8c0cb956c106e9b566a70:module-1/03_Expressions/lecture-final/java/src/main/java/com/techelevator/Lecture.java
            return "Adult";
        } else {
            return "Minor";
        }
    }

    /*
    16. Return as above, but also return "Teen" if the number is between 13 and 17 inclusive.
    */
    public String returnAdultOrMinorOrTeen(int number) {
        if (number >= 18) {
            return "Adult";
        } else if (number >= 13 && number <= 17) {
            return "Teen";
        } else {
            return "Minor";
        }
    }

}