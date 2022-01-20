package com.test.day01206;

public class Rice extends Food {
	String name="밥";

	public Rice() {
		super();//슈퍼클래스의 생성자를 호출해서 음식값 전달
	}

	public String getName() {
		return name;
	}
}
