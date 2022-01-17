package oopex.day0107;

public class TvMain {

	public static void main(String[] args) {
		
		Tv t; //Tv타입의 변수 t가 선언됨. Tv클래스로 만든 객체의 주소값'만'저장한다. 
		t = new Tv();
		//new : 객체 생성. 메모리의 공간을 할당받고 주소값 지정. 
		//클래스에 선언된 변수와 메서드를 인스턴스화 한다. 
	
		//A a; // a에는 A클래스로 만든 객체의 주소값만 저장한다.
		// .: 객체 안에 있는 멤버를 사용
		// a[] =>배열은 인덱스 호출 ; a.이름
		t.power(); //메서드는 ()까지 같이 적어줘야 한다.
		//티비 켜고
		t.channel = 7;
		//채널 7번에 맞추고
		t.chUp();
		//채널 한번 올리고
		System.out.println(t.channel);
		//현재 채널 출력
		
		Tv t2 = new Tv();
		t2.inch = 100;
		//t1과 tv2는 독립적 객체임.
		
		System.out.println("t.inch : "+t.inch);
		System.out.println("t2.inch : "+t2.inch);
		//주소값 개념이 가장 중요하다. 이를 반드시 이해하도록.
		
		t = t2;
		System.out.println("after t = t2");
		System.out.println("t.inch : "+t.inch);
		System.out.println("t2.inch : "+t2.inch);

	}

}
