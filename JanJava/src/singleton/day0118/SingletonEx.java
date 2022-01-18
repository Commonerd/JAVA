package singleton.day0118;

class Singleton { // 객체를 하나만 만들 클래스다.

	private static Singleton s = new Singleton(); // 객체를 만들 건데, 실행시점을 설정해야 해서 static으로 한 번 만들어 놓는다.

	private Singleton() {
	} // 프라이빗이자 매개변수 없는 생성자 생성

	public static Singleton getInstance() {
		return s;
	}

	// 멤버 선언
	int x;
}

public class SingletonEx {

	public static void main(String[] args) {
		// Singleton s = new Singleton(); //싱글턴 클래스가 캡슐화 되어 있어서 실행 불가.
		Singleton s = Singleton.getInstance(); // 만들어진 객체의 주소값을 전달 받는다.
		s.x = 10;
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2.x);// 10
		
		System.out.println(s==s2);//true
	}

}
