package com.test.day01206;

public class CustomerMain {

	public static void main(String[] args) {
		Customer b = new Customer(10000);
		Noodle nd = new Noodle(1000);
		Rice rc = new Rice(2000);
		b.order(nd.name);
		b.order(rc.name);
		
		System.out.println("현재 남은 돈은"+b.money+"입니다.");
		System.out.println("현재 보너스 점수는"+b.point+"입니다.");
	}
	

}
