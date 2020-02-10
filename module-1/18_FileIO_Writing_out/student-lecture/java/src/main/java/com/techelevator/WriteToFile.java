package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteToFile {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a file name to write to: ");
		String fileName = input.nextLine();

		File file = new File(fileName);
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(file);
		} catch (FileNotFoundException e) {
			System.out.println("File cannot be written to");
			e.printStackTrace();
			System.exit(0);
		}
		writer.println("Employee name                   Hours           Rate     Salary");
		writer.println("====================================================================");
		// get user input
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter Employee name: ");
			String name = input.nextLine();
			System.out.println("Enter Number of Hours Worked: ");
			int hours = Integer.parseInt(input.nextLine());
			System.out.println("Enter rate of pay: ");
			double rate = Double.parseDouble(input.nextLine());
			double salary = hours * rate;

			// writes to file below
			writer.printf("%-30s	%6d	%8.2f	%8.2f\n", name, hours, rate, salary);
		}
		// close file!
		writer.close();
		input.close();

		// if we want to append instead of overwrite, use FileWriter object.
		// True = append, False = overwrite
	}

}
