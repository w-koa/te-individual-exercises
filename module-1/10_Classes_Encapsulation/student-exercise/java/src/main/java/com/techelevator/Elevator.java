package com.techelevator;

public class Elevator {

	// Attributes
	private int currentFloor;
	private int numberOfFloors;
	private boolean doorOpen;
	
	// Constructor
	public Elevator(int totalNumberOfFloors) {
		this.numberOfFloors = totalNumberOfFloors;
		this.currentFloor = 1;
	}

	// Getters
	public int getCurrentFloor() {
		return currentFloor;
	}

	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public boolean isDoorOpen() {
		return doorOpen;
	}
	
	// Methods
	public void openDoor() {
		this.doorOpen = true;
	}
	
    public void closeDoor() {
    	this.doorOpen = false;
    }
    
    public void goUp(int desiredFloor) {
    	if (doorOpen == false)
    		if (currentFloor < desiredFloor && desiredFloor <= numberOfFloors) {
    			this.currentFloor = desiredFloor;
    		}
    	}
    
    public void goDown(int desiredFloor) {
    	if (doorOpen == false)
    		if (desiredFloor < currentFloor && desiredFloor >= 1) {
    			this.currentFloor = desiredFloor;
    		}
		}
}
//	currentFloor 	int 	X 		The current floor that the elevator is on.
//	numberOfFloors 	int 	X 		The number of floors available to the elevator.
//	doorOpen 	boolean 	X 		Whether the elevator door is open or not.

