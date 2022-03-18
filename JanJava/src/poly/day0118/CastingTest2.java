package poly.day0118;

class CastingTest2 {
	public static void main(String args[]) {
		Car car = new Car();//조상클래스를 객체로 만든다.
		Car car2 = null;
		FireEngine fe = null;
  
		car.drive();//OK. 객체만들어짐
		if(car instanceof FireEngine) {
			System.out.println("(FireEngine)실행");
			fe = (FireEngine)car;
		} else {
			fe = new FireEngine();
		}
//			fe = (FireEngine)car;//error FireEngine fe = new Car();
		fe.drive();//***NullPointerException. 객체가 없어서 주소값이 null인데도 쓰려고 해서 발생하는 에러다.
		car2 = fe;
		car2.drive();
		//런타임 익셉션이 발생함. 
		//실제 객체의 타입까지 생각해야 한다.
		}
	}
