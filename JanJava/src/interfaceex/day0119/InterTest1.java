package interfaceex.day0119;

interface Inter{
	 int A = 100;//상수
	 int getA();//추상메서드
	 
}
class InterTestEx implements Inter{ //Inter1과 InterTestEx는 '상속관계'
	
	@Override //추상메서드 오버라이딩
	public int getA() { //Inter1에 멤버에 public 생략되어 있음
		return A;
	}
} 

public class InterTest1 {
	public static void main(String[] args) {
	// Inter1 i1 = new Inter1(); 인터페이스는 객체를 만들 수 없다.
		Inter i1 = new InterTestEx(); //인터페이스 타입으로 선언하고, 객체
		System.out.println(i1.getA());//오버라이딩된 getA()를 호출한다.
	//추상클래스보단 인터페이스를 더 많이 쓴다.
	}
}
