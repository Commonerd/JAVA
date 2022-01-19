package interfaceex.day0119;

interface Inter1 {
	int getA();
}
interface Inter2{
	int getA();
}
interface Inter3 extends Inter1, Inter2 { //다중상속이 가능하다
//	public int getA() {
//		return 0;
//	}  => 인터페이스는 물려받은 메서드를 그대로 갖고 있어야 한다. 
	// 오버라이딩은 일반 클래스에서 한다.
	// int getA(); //이름과 매개변수가 같은 추상메서드인 경우 하나로 인식함 
	int getDate();
}

	
public class InterTest2 implements Inter3{
	int a = 100;
	public static void main(String[] args) {

	}

	@Override
	public int getA() {
		return a;
	}

	@Override
	public int getDate() {
		return a+10;
	}

}
