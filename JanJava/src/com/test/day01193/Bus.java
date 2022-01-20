package com.test.day01193;

public class Bus {
	String busNumber;//버스번호
	int charge;//요금
	int income;//누적수입
	int count;//누적승객수
	

	
	public Bus(String busNumber, int charge) {
		super();
		this.busNumber = busNumber;
		this.charge = charge;
	} 
	//승객 태우기 메서드
	public void take () {
		income += charge;
		count++;
	}
	//버스 상태를 출력하는 메서드
	public void showInfo() {
		System.out.printf("%s번 버스의 승객은 %d명이고 수입은 %d입니다.\n", busNumber, count, income);
	}
	
}
