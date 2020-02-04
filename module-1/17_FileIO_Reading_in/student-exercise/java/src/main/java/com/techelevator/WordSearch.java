package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) throws FileNotFoundException {
		int lineNumber = 0;
		boolean isCaseSensitive = false;
		String temp = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter file path: ");
		String filePath = input.nextLine();
		
		System.out.println("Enter a word to search for: ");
		String wordInput = input.nextLine();
		
		System.out.println("Should this be case sensitive? [Y]es or [N]o");
		String caseSense = input.nextLine();
		if (caseSense.equals("Y") || caseSense.equals("y")) {
			isCaseSensitive = true;			
		} else wordInput = wordInput.toLowerCase();
		
		File searchFile = new File(filePath);
		if (searchFile.exists() == false) {
			System.out.println("File does not exist");
		}
		
		try (Scanner fileScanner = new Scanner(searchFile)){
			while(fileScanner.hasNextLine()) {
				String words = fileScanner.nextLine();
				lineNumber++;
				
				if(!isCaseSensitive) {
					temp = words.toLowerCase();
				}
				if (words.contains(wordInput)) {
					System.out.println(lineNumber + " " + words);
				}
			}
		} catch (Exception e) {
			System.out.println("nooooo, i broke");
		}
		
		input.close();
		
	}
}
