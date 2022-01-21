package ncs.test;

public class CustomerMain {

	public static void main(String[] args) {
		Customer b = new Customer();
		Noodle nd = new Noodle();
		Rice rc = new Rice();
		
		b.order(nd);
		b.order(rc);
		
		System.out.printf("현재 남은 돈은 %d입니다.\n",b.money);
		System.out.printf("현재 보너스 점수는 %d입니다.",b.point);
	}

}
