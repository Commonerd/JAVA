package com.test.day01206;

public class Customer {
	int money;
	int point;
	
	public Customer(int i) {
		this.money=i;
	}

	public void order(Food f) {//생성한 객체를 전달받아
		if(money > f.price) {
			System.out.println("주문불가");
		} 
			money -= f.price;
			point += f.point;
	}

	public void order(String name) {
		// TODO Auto-generated method stub
		
	}
}