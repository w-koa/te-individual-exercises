package com.techelevator;

public class Airplane {
	
	// Attributes
	private String planeNumber;
	private int bookedFirstClassSeats;
	private int availableFirstClassSeats;
	private int totalFirstClassSeats;
	private int bookedCoachSeats;
	private int availableCoachSeats;
	private int totalCoachSeats;
	
	//Constructor
	public Airplane (String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
		this.planeNumber = planeNumber;
		this.totalFirstClassSeats = totalFirstClassSeats;
		this.totalCoachSeats = totalCoachSeats;
		this.availableFirstClassSeats = totalFirstClassSeats;
		this.availableCoachSeats = totalCoachSeats;
	}
	
	// Getters
	public String getPlaneNumber() {
		return planeNumber;
	}
	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}
	public int getAvailableFirstClassSeats() {
		return availableFirstClassSeats = totalFirstClassSeats - bookedFirstClassSeats;
	}
	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}
	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}
	public int getAvailableCoachSeats() {
		return availableCoachSeats = totalCoachSeats - bookedCoachSeats;
	}
	public int getTotalCoachSeats() {
		return totalCoachSeats;
	}
	
	// Methods
	public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
		if (forFirstClass) {
			if (availableFirstClassSeats >= totalNumberOfSeats) {
				availableFirstClassSeats = availableFirstClassSeats - totalNumberOfSeats;
				bookedFirstClassSeats += totalNumberOfSeats;
				return true;
			}
		} else if (availableCoachSeats >= totalNumberOfSeats) {
				availableCoachSeats = availableCoachSeats - totalNumberOfSeats;
				bookedCoachSeats += totalNumberOfSeats;
				return true;
			}
		
		return false;
	}
	
	
//	planeNumber 	string 	X 		The six-character plane number.
//	bookedFirstClassSeats 	int 	X 		The number of already booked first class seats
//	availableFirstClassSeats (derived) 	int 	X 		The number of available first class seats.
//	totalFirstClassSeats 	int 	X 		The total number of first class seats.
//	bookedCoachSeats 	int 	X 		The number of already booked first class seats
//	availableCoachSeats (derived) 	int 	X 		The number of available first class seats.
//	totalCoachSeats 	int 	X 		The total number of first class seats.

}
