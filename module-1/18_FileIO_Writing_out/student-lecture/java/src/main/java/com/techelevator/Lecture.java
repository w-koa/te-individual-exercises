package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lecture {
	
	public static void main(String[] args) throws IOException {
		
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the path of a file or directory: ");
		String path = input.nextLine();
		// use path from user input to create a new File object.
		
		File file = new File(path);
		
		/*	File only needs try/catch if reading or writing (establishing a stream)
		 * 	will need to write exceptions in that case.
		 */
		
		if (file.exists()) {
			System.out.println("File information: ");
			System.out.println("\tName: " + file.getName());
			System.out.println("\tAbsolute Path: " + file.getAbsolutePath());
			System.out.println("\tSize: " + file.length());
			
			if (file.isDirectory()) {
				System.out.println("\ttype: directory");
			}
			if (file.isFile()) {
				System.out.println("\ttype: file");
			}
		} else {
			System.out.println("file does not exist");
		}
		
		// Create directory so we can put file into it.
		System.out.println();
		System.out.println("Enter Name of directory");
		path = input.nextLine();
		
		File newDirectory = new File(path);
		if (newDirectory.exists()) {
			System.out.println("Sorry, directory already exists");
		} else {
			if (newDirectory.mkdir()) {
				System.out.println("New directory created at: " + newDirectory.getAbsolutePath());
			} else {
				System.out.println("Could not create the directory");
				System.exit(0);
			}
		}
		
		
		System.out.println();
		System.out.println("Let's create a new file");
		System.out.println("Enter a name for the file");
		String fileName = input.nextLine();
		File newFile = new File (newDirectory, fileName);
		
		newFile.createNewFile();
		
		System.out.println("File information: ");
		System.out.println("\tName: " + newFile.getName());
		System.out.println("\tAbsolute Path: " + newFile.getAbsolutePath());
		System.out.println("\tSize: " + newFile.length());
	
		System.out.println();
		System.out.println("Writing to a file");
		System.out.println("Enter something to be written to file: ");
		String message = input.nextLine();
		
		PrintWriter writer = new PrintWriter(newFile);
		writer.println(message);
		
		System.out.println("File information: ");
		System.out.println("\tName: " + newFile.getName());
		System.out.println("\tAbsolute Path: " + newFile.getAbsolutePath());
		System.out.println("\tSize: " + newFile.length());
		
		input.close();
		writer.close();
	}
}