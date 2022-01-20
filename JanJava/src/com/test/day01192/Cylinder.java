package com.test.day01192;

public class Cylinder {
	Circle circle; // 포함관계(상속관계가 아니다)
	double height;

	Cylinder(Circle circle, double height) {
		this.circle = circle;
		this.height = height;
	};

	double getVolume() {
		return circle.getArea() * height;
	};

}