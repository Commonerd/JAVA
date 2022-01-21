package langex.day0121;

class Value{//벨류는 오브젝트를 상속받고 있다.
	int x;
	int y;
	public Value(int x, int y) {//생성자 2개.
		this.x=x;
		this.y=y;
	}
	
	@Override
	public boolean equals(Object obj) {
		//x,y에 저장된 값이 같으면 같은 객체가 되도록 오버라이딩 해주기
		if (obj instanceof Value) {
			Value v1 = (Value)obj;
			return x ==v1.x && y == v1.y;//obj를 밸류타입으로 캐스팅해준 다음 x값 꺼내오기
		} return false;
		//equals 연습 시키는 것은 set떄문에 쓸 일이 있어서 연습시키는 것.
		
}

	@Override
	public String toString() {
		return "Value [x=" + x + ", y=" + y + "]";
	} //toString() 메서드 오버라이딩. 그냥 오버라이딩이랑 헷갈리지 말기를. 
	
}

public class EqualsEx {

	public static void main(String[] args) {
		Value v1 = new Value(10,20);
		Value v2 = new Value(10,20);
		Value v3 = new Value(20,30);
		//뉴를 통해 주소값 할당받고
		//벨류는 오브젝트 클래스 상속받고 있음
		//오브젝트로부터 물려받은 멤버들, 오버라이딩 안함
		//그래서 물려받은 11개 메서드 그대로 갖고 있음
		//벨류만이 갑ㅈ고 있는 건 x=0;으로 초기화되어있음
		//10이라는 값을 this.x에게 저장
		//v2의 주소값은 x20이라고 가정해보고.
		//v1의 주소값은 x10이라고 가정해보고.
		System.out.println("v1 == v2"+(v1 == v2));
		//똑같이 생긴 객체(값 10)이지만, 주속밧이 서로 다르다. 
		//변수가 갖고 있는 값을 의미한다. v1과 v2는 주소 x10, x20을 각자 갖고있고
		//서로 비교했을 떄 다를 수밖에 없다.
		//변수에 저장된 주소값을 비교 
		System.out.println(v1.equals(v2));
		//equals메서드를 통해 v2의 객체와 v1의 객체는 모양으 같지만 
		//서로 다른 객체이기 때문에 같지 않다. 
		//객체비교(주소)
		v1 = v2;
		//v2가 지닌x20이라는 주소값을 v1에게 저장한다.
		System.out.println("v1 == v2"+(v1 == v2));
		// v1과 v2의 주소값이 같아졌따.
		System.out.println("v1.equals(v2)"+v1.equals(v2));
		// v1이 가리키는 객체와 v2가 가리키는 객체가 같아졌다.
		
		System.out.println();
		System.out.println(v1.toString());//주소값 출력되면, toString메서드 오버라이딩 안됨
		System.out.println(v1.hashCode());//주소값이 나온다.
		System.out.println(v3.hashCode());//
		
		System.out.println(System.identityHashCode(v1));//위나 아래나 해쉬코드 주속값 뽑아내는 것. 
		System.out.println(System.identityHashCode(v3));
		
	}

}
