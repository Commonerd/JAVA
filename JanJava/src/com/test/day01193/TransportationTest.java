package com.test.day01193;

public class TransportationTest {

	public static void main(String[] args) {
		Subway subway = new Subway(2, 1250);
		Bus bus1 = new Bus(100, 1000);
		Bus bus2 = new Bus(200, 2000);
		Student student1 = new Student("Jerry", 1, 10000);
		student1.takeSubway();
		student1.takeBus();
		Student student2 = new Student("Tom", 2, 15000);
		student2.takeBus();
		System.out.printf("%s의 남은 돈 : %d\n $s의 남은 돈 : %d",
				student1.name,student1.leftmoney(),
				student2.name,student2.leftmoney());
	}

}
