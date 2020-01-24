package com.techelevator;

public class HomeworkAssignment {

	private int earnedMarks;
	private int possibleMarks;
	private String submitterName;
	private String letterGrade;
	
	// Constructor
	public HomeworkAssignment(int possibleMarks) {
		this.possibleMarks = possibleMarks;
	}
	
	// Getters and Setters
	public int getEarnedMarks() {
		return earnedMarks;
	}
	public void setEarnedMarks(int earnedMarks) {
		this.earnedMarks = earnedMarks;
	}
	public int getPossibleMarks() {
		return possibleMarks;
	}
	public String getSubmitterName() {
		return submitterName;
	}
	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}
	public String getLetterGrade() {
		if ((double) earnedMarks / possibleMarks * 100 >= 90) {
			letterGrade = "A";
		} else if ((double) earnedMarks / possibleMarks * 100 >= 80) {
			letterGrade = "B";
		} else if ((double) earnedMarks / possibleMarks * 100 >= 70) {
			letterGrade = "C";
		} else if ((double) earnedMarks / possibleMarks * 100 >= 60) {
			letterGrade = "D";
		} else
			letterGrade = "F";
		System.out.println(letterGrade);
		return letterGrade;
	}
	
	
}
