package com.techelevator;

public class Testing {

	public static void main(String[] args) {
		Television tv = new Television();
		System.out.println(tv.getCurrentChannel());
		System.out.println(tv.isOn());
		System.out.println(tv.getCurrentVolume());
		System.out.println(tv.toString());

		tv.turnOn();
		System.out.println(tv.isOn());
		System.out.println(tv.getCurrentChannel());
		tv.channelUp();
		System.out.println(tv.getCurrentChannel());
	}

}
