package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) throws FileNotFoundException {
		int lineNumber = 0;
		
		File inputFile = getInputFileFromUser();
		try (Scanner fileScanner = new Scanner(inputFile)) {
			while (fileScanner.hasNextLine()) { // checks to make sure there is something to read
				
				String fileLine = fileScanner.nextLine();
				lineNumber++;
				
				System.out.println(lineNumber + ": " + fileLine);
			}
		}
	}

	private static File getInputFileFromUser() {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter path to input file >>> ");
		String path = userInput.nextLine();

		File inputFile = new File(path);
		if (inputFile.exists() == false) { // checks for the existence of a file
			System.out.println(path + " does not exist");
			System.exit(1); // Ends the program
		} else if (inputFile.isFile() == false) {
			System.out.println(path + " is not a file");
			System.exit(1); // Ends the program
		}
		userInput.close();
		return inputFile;
		
	}
	
	private static String getStringFromUser() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word to search for: ");
	}

}
