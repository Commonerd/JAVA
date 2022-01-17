package oopex.day0107;

public class Car {
	int speed;
	String carNumber;
	String model;
	String color;

	void drive(int s) { //s는 지역변수
		if (speed + s > 230) {
			speed = 230;
		} else {
			speed += s;
		} // 받아온 값만큼 증가
	}

	void slow(int s) { //s는 지역변수(드라이브의 s와 다르다)
		if (speed - s < 0) {
			speed = 0;
		} else {
			speed -= s;
		} // if문 for문 다 메서드 안에 넣어주자.
	}

	void stop() {
		speed = 0;
	}

}
