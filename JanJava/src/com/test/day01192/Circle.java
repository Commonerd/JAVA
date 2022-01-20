package com.test.day01192;

public class Circle {
	double radius;//반지름
	double PI=3.141592; //원주율. 상수로 만들어달라는 의미
	
	Circle(double radius){//반지름 초기화 생성자구현
		this.radius=radius;
	};
	public Circle() {
		super();
		
	}
	double getArea() {
		return radius * radius * PI; 
	}//현재 반지름 사용하여 원의 면적 구하는 메서드
	
}
