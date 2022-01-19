package com.test.day01193;

public class Bus {
	int number;
	int rate;
	int income;
	int passenger;
	public Bus(int number, int rate) {
		super();
		this.number = number;
		this.rate = rate;
	}
	
	void pickup (int passenger) {
		this.passenger += passenger; 
		System.out.println(this.passenger);
	}
	
	
}
