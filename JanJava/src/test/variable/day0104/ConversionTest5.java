package test.variable.day0104;

public class ConversionTest5 {

	public static void main(String[] args) {
		char c1 = 'A';  
		char c2 = (char)(c1 +1); 
		System.out.println(c1+1); //66
		System.out.println(c2); // B
		// A(차르, 2바이트) + 1(인트, 4바이트) => 4바이트 미만(A)은 인트로 계산. 그래서 A는 인트 65가 된다.  

		short s = 10;
		char c = 'A'; 
		System.out.println(s + c); //결과값 타입은 int다.
		
	}

}
