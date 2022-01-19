package com.test.day01192;

public class Cylinder extends Circle {
	Circle circle;
	double height;
	Cylinder(Circle circle, double height){
		super();
		this.circle=circle;
		this.height=height;
	};
	double getVolume() {
		return circle.getArea()* height;
	};
	
}
  