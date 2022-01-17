package test.operation.day0104;

public class OperEx1 {

	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 3;
		
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 * n2);
		System.out.println((double) n1 / n2);  // 나누기 시에는 값손실 최소화 위해 '더블'로 캐스팅해주고 나머지(%)랑 함께. 
		System.out.println(n1 % n2);
		// 어떤 숫자라도 0으로 나눌 수 없다.
		//int n3 = 0;
		// System.out.println(n1/n3); //런타임 익셉션-ArithmeticException.
		// System.out.println(n1%n3);
		
		String s = "";
		String s1 = n1 + s;
		//String s2 = n1 - s;
		// - * / % => 숫자 데이터만 다룰 수 있다. 
	}

}
