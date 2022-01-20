package com.test.day01193;

public class Subway {
	String lineNumber;
	int count;
	int income;
	int charge;

	public Subway(String lineNumber, int charge) {
		super();
		this.lineNumber = lineNumber;
		this.charge = charge;
	} // 블럭 뒤에 세미콜론 찍는 것은 배열에서만 찍는다.

	public void take() {
		count++;
		income += charge;
	}
	public void showInfo() {
		System.out.printf("%s노선의 승객은 %d명이고 수입은 %d입니다.\n", lineNumber, count, income);
	}
}
