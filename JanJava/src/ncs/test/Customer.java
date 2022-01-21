package ncs.test;

public class Customer {
	int money = 10000;
	int point ;//기본값 0
	
	public void order(Food f) {
		if(money <f.price) {
			System.out.println("주문 불가");
			return;
		} 
			money -= f.price;
			point += f.point;
			System.out.println(f.getName()+"을/를 주문하셨습니다.");
	}
}
