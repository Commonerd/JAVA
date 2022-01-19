package com.test.day01193;

public class Subway {
	int linenumber;
	int passenger;
	int income;
	int rate;

	public Subway(int linenumber, int rate) {
		super();
		this.linenumber = linenumber;
		this.rate = rate;
	}

	void pickup (int passenger) {
		this.passenger += passenger; 
		System.out.println(this.passenger);
	}
		
}
}
