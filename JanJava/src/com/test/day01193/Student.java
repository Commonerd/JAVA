package com.test.day01193;

public class Student {
	String name;
	int grade;
	int money;
	public Student(String name, int grade, int money) {
		super();
		this.name = name;
		this.grade = grade;
		this.money = money;
	}
		
	public void takeBus(Bus bus) {//Bus타입의 변수 bus 생성. 아래에서 버스의 메서드를 불러봐야 하기 떄문
		System.out.println(name+"이 "+bus.busNumber+" 버스에 탑승합니다."); 
		money -= bus.charge;
		bus.take();//버스 상태변경 해야 함
	}
	public void takeSubway(Subway subway) {//Subway타입의 변수 subway 생성.
		System.out.println(name+"이 "+subway.lineNumber+" 지하철을 탑니다.");
		money -= subway.charge;
		subway.take();//서브웨이 상태변경해야 함
	}
	
	public void show(){
		System.out.println(name+"의 용돈이 "+money+" 남았습니다.");
	}
}
