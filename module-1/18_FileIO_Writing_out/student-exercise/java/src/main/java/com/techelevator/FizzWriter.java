package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class FizzWriter {

	public static void main(String[] args) throws IOException {

		String path = "FizzBuzz.txt";
		File newFile = new File(path);
		
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(newFile);
		} catch (FileNotFoundException e) {
			System.out.println("File cannot be written to");
			e.printStackTrace();
			System.exit(0);
		}
		
		newFile.createNewFile();
		System.out.println(newFile.getName() + " has been created.");
		
		for (int i = 1; i <= 300; i++) {
			String numString = Integer.toString(i);
			if ((i % 3 == 0 && i % 5 == 0) || (numString.contains("3") && numString.contains("5"))) {
				writer.println("FizzBuzz");
			} else
			if (i % 3 == 0 || numString.contains("3")) {
				writer.println("Fizz");
			} else
			if (i % 5 == 0 || numString.contains("5")) {
				writer.println("Buzz");
			}
			 else
			 	{
				writer.println(Integer.toString(i));
			}
		}
		writer.close();
	}

}
