package interfaceex.day0119;

interface MyInter1 { // 이름이 같고 바디가 다른 경우임.
	// 바디가 있는 메서드 경우, 이름갖고 바디가 다를 떄
	// 어떤 바디를 써야할지 몰라서, 다중상속을 막아놓았다.
	default void method1() {
		System.out.println("MyInter1 method1()");
	}

	default void method2() {
		System.out.println("MyInter1 method2()");
	}

	static void staticMethod() {
		System.out.println("MyInter1.staticMethod()");

	}
}

interface MyInter2 {
	default void method1() {
		System.out.println("MyInter2 method1()");
	}

	static void staticMethod() {
		System.out.println("MyInter2.staticMethod()");
	}
}

class Parent {
	public void method2() {
		System.out.println("Parent method2()");
	}
}

class Child extends Parent implements MyInter1, MyInter2 {

	@Override
	public void method1() {
		System.out.println("Child method1() override");
	} // myinter1과 myinter2 구현
	// MyInter1, 2에 추상메서드 없었음.
	// 여러 인터페이스에 디폴트 메서드간에 충돌하므로, 디폴트 메서드를 오버라이딩 해야 한다.
	//
}

public class InterTest3 {
	public static void main(String[] args) {
		Child c = new Child();
		c.method2(); // 클래스에 있는 메서드가 상속됨
		c.method1(); // 클래스에서 오버라이딩 된 메서드

		MyInter1.staticMethod();// 인터페이스명.static메서드명;
		MyInter2.staticMethod();//
	}

}
