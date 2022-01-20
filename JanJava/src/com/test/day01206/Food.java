package com.test.day01206;

public class Food {
	String name;
	static int price;
	int point;
	public Food(int price) {
		this.price = price;
		this.point += price *0.1; 
	}


	public String getName() {
		return name;
	}
	
}
