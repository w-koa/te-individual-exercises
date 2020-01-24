package com.techelevator;

public class Television {

	// Attributes
	private boolean isOn;
	private int currentChannel;
	private int currentVolume;

	//Constructor - Default
	public Television() {
		this.isOn = false;
		this.currentChannel = 3;
		this.currentVolume = 2;
	} 

	//Getters
	public boolean isOn() {
		return isOn;
	}

	public int getCurrentChannel() {
		return currentChannel;
	}

	public int getCurrentVolume() {
		return currentVolume;
	}
	
	
	//Methods
    public void turnOff() {
    	this.isOn = false;
    }
    
    public void turnOn() {
    	this.isOn = true;
    	this.currentChannel = 3;
    	this.currentVolume = 2;
    }
    
    public void changeChannel(int newChannel) {
    	if (isOn) {
    		if (currentChannel >= 3 && currentChannel <= 18) {
    			this.currentChannel = newChannel;
    		} else currentChannel = 3;
    	}  	
    }
    
    public void channelUp() {
    	if(isOn == true) {
    		this.currentChannel++;
    		if (currentChannel > 18) {
    			this.currentChannel = 3;
    		}
    	} 
    }
    
    public void channelDown() {
    	if (isOn == true) {
    		this.currentChannel--;
    		if (currentChannel < 3) {
    			this.currentChannel = 18;
    		}
    	} 
    	
    }
    
    public void raiseVolume() {
    	if (isOn == true) {
    		if (currentVolume <= 10) {
        		this.currentVolume += 1;
        	}
    	} else return;
    }
    
    public void lowerVolume() {
    	if (isOn == true) {
    		if (currentVolume > 0) {
    			this.currentVolume -= 1;
    		}
    	} else return;
    }
}
//	isOn 	boolean 	X 		Whether or not the TV is turned on.
//	currentChannel 	int 	X 		The value for the current channel. Channel levels go between 3 and 18.
//	currentVolume 	int 	X 		The current volume level.

