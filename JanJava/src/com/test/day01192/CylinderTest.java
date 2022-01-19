package com.test.day01192;

public class CylinderTest {

	public static void main(String[] args) {
		Circle circle = new Circle(2.8);
		Cylinder cyl = new Cylinder(circle, 5.6);
		System.out.println(cyl.getVolume());
		//반지름 2.8, 높이 5.6의 원통의 부피를 출력
		//부피= 파이*반지름^2*높이
		
		
	}

}
