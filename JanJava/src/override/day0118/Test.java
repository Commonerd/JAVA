package override.day0118;

class Parent {
	private void method1() {
		System.out.println("parent method 1");
	}

	public void method2() {
		method1();
	}
}

class Child extends Parent {
//	private void method1() {
//	System.out.println("parent method 1");
//}
	@Override //클래스 이름이 같음(오버라이딩된 메서드 의심) 
	//오버라이딩 붙여봤는데 에러가 안난다면 아래는 오버라이딩 메서드다.
	public void method1() { //안되는 이유는 Parent클래스의 private 메서드 떄문. 
		System.out.println("Child method 1");
	}
// public void method2(){
//	method1();
//	}
}

public class Test {

	public static void main(String[] args) {
		Child c = new Child();
		c.method2();
	} 

}
