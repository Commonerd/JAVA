package com.test.day01204;

public class DeskTop implements Computer {

	@Override
	public int getRentalPrice(int day) {
		int cost = 1000;
		day -= 3;
		if (day > 0) {
			cost += day * 300;

		}
		return cost;
	}

	
}
