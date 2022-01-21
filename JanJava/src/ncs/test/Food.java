package ncs.test;

public class Food {
	int price;
	int point;
	public Food(int price) {
		this.price = price;
		this.point = price/10;//0.1을 곱하면 인트타입에 문제발생.
	}
	public String getName() {
		return "";//나는 이 리턴을 했지만, 변수영역에 name을 억지스럽게 만듦
	}
}
