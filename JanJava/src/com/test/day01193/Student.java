package com.test.day01193;

public class Student 
	String name;
	int grade;
	int money;
	public Student(String name, int grade, int money) {
		super();
		this.name = name;
		this.grade = grade;
		this.money = money;
	}
	
	void takeBus() {
		this.money -= Bus.Rate
	
	}
	
	public void takeSubway() {
		this.money -= Subway.Rate
	}
	
	void leftmoney () {
		System.out.println(money);
	}
}
