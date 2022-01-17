package test.operation.day0104;

public class OperEx3 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		boolean c = a < b;
		System.out.println(c);
		
		c = a == b; // == 비교 연산자부터 시행. 그 다음 대입연산자 = . 
		System.out.println(c);
		
		c = a!= b; 
		System.out.println(c);
		
		String s1 = "ABC";
		String s2 = "ABC";
		System.out.println(s1 == s2);
		// s1에는 주소값 저장이지만, 처음이니까 일단 값 저장. s2는 이미 만들어진 값 가져와 주소값. 
		// s1 X10이라는 주소값, s2도 X10이라는 주소값. 문자열은 하나 갖고 같이 쓴다. 비교하는 건 주소값을 비교하는 것이다. 
		// 스트링타입은 실제값이 아니라 '주소값'을 비교하는 것이다.
		
		
	}

}
// =는 대입이고, ==가 같다는 뜻이다!