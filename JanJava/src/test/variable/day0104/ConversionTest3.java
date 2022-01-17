package test.variable.day0104;

public class ConversionTest3 {

	public static void main(String[] args) {
		short s1 = 10;
		short s2 = 20;
		
		
		short s3 =(short) (s1 + s2); //s1+s2 -> 새로운 리터럴로 인트형 값이 나온다. 인트는 4바이트 쇼트는 2바이트.4바이트 미만의 계싼은 int로 바꿔서 계산.
		int result = s1 + s2;
		
		System.out.println("s3 :"+s3);
		System.out.println("result : "+result);

	}

}
