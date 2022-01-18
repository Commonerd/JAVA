package poly.day0118;

class Product3 {
	int price;
	int bonusPoint;
	
	Product3(int price) {
		this.price = price;
		bonusPoint = (int) (price /10.0);
	}
	
	Product3() {
		price = 0;
		bonusPoint = 0;
	}
}

class Tv3 extends Product3 {
	Tv3() {
		super(100);
	}
	
	public String toString() {
		return "Tv";
	}
}

class Computer3 extends Product3 {
	Computer3() {
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}

class Audio3 extends Product3 {
	Audio3() {
		super(50);
	}
	@Override
	public String toString() {
		return "Audio";
	}
}

class Buyer3 {
	int money = 1000;
	int bonusPoint = 0;
	Product3[] item = new Product3[10];
	int i = 0;
	
	void buy(Product3 p) {
		if(money<p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println(p+"을/를 구입하셨습니다.");
	}
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i = 0; i<item.length; i++) {
			if(item[i] == null)
				break;
			sum += item[i].price;
			itemList += item[i] + ",";
			
			System.out.println("구입하신 물품을 총금액은 "+ sum +"만원입니다.");
			System.out.println("구입하신 제품은 " + itemList +"입니다.");
		}
	}
}

class PolyArgumentTest3 {
	public static void main(String args[]) {
		Buyer3 b3 = new Buyer3();
		Tv3 tv3 = new Tv3();
		Computer3 com3 = new Computer3();
		Audio3 audio3 = new Audio3();
		b3.buy(tv3);
		b3.buy(com3);
		b3.buy(audio3);
		b3.summary();
		
		
	}
}