package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class QuizMaker {

	public static void main(String[] args) throws FileNotFoundException {
		

		// for copy pasta:
		// test_quiz.txt
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter quiz file path: ");
		String path = input.nextLine();
		
		File quizFile = new File(path);
		if (quizFile.exists() == false) {
			System.out.println("File does not exist!");
		}
		
		try (Scanner quizScanner = new Scanner(quizFile)) {
			while (quizScanner.hasNextLine()) {
				String line = quizScanner.nextLine();
				System.out.println(line);
				int lineInt = line.indexOf("\\|");
				String answers = line.substring(lineInt);
				String[] answersArray = line.split("\\|");
				String answersString = Arrays.toString(answersArray).substring(1);
	
				System.out.println(answersString);
				for (int i = 1; i < answersArray.length; i++) {
					
					System.out.println(answersArray[i]);
				}
			
				}
//				System.out.println(quizScanner.nextLine());
			}
		
		
		input.close();
		}
		
		
	}


