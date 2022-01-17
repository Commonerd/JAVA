package test.operation.day0104;

public class OperEx5 {

	public static void main(String[] args) {
		int a = 10;
		int b = 7;
		
		System.out.println(a & b);
		// 1.이진수로 전환. 프로그래머 계산기. 
		//10 == 1010; 
		// 7 == 0111;
		// => 0010 ==> 2
		System.out.println(a | b);
		// 1111 => 15
		System.out.println(a ^ b);
		// 1101 => 13
		System.out.println(~a);
		//  00000000 00000000 00000000 00001010 // 0
	}

}
