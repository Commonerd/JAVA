package oopex.day0107;

public class Tv {//main이 없으므로 실행시켜도 아무 소용이 없다.

	String color;
	int channel;
	boolean power;
	int inch;

	void power() {
		power = !power;
	}

	void chUp() {
		channel++;
	}

	void chDown() {
		channel--;
	}

}
