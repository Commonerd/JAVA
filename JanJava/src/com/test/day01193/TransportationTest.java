package com.test.day01193;

public class TransportationTest {

	public static void main(String[] args) {
		Subway line2 = new Subway("2", 1250);
		Bus bus100 = new Bus("100", 1000);
		Bus bus200 = new Bus("200", 2000);
		Student jerry = new Student("Jerry", 1, 10000);
		jerry.takeSubway(line2);//메서드 안에 매개변수 유의해서 입력할 것(나는 안해서 실수)
		jerry.takeBus(bus100);//메서드 안에 매개변수 유의해서 입력할 것(나는 안해서 실수)
		Student tom = new Student("Tom", 2, 15000);
		tom.takeBus(bus200);
		jerry.show();
		tom.show();
	}

}
