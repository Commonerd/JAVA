package com.test.day01206;

public class Rice extends Food {
	String name="밥";

	public Rice() {
		super(price);//슈퍼클래스의 생성자를 호출해서 음식값 전달
	}

	public Rice(int i) {
	}

	public String getName() {
		return name;
	}
}
