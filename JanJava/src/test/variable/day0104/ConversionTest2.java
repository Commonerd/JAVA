package test.variable.day0104;

public class ConversionTest2 {

	public static void main(String[] args) {
		
		byte b = 100;
		int i = b; 
		
		System.out.println("b : "+b);
		System.out.println("i : "+i);
		//리터럴 100, b에 바이트 타입으로 저장. b를 인트 i로. 즉 바이트가 인트로로 됨. 이걸 '프로모션'이라 함.
		
		int i2 = 300;
		byte b2 = (byte)i2;
		
		System.out.println("i2 :"+i2);
		System.out.println("b2 :"+b2);
		
	}

}
