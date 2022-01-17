package test.variable.day0104;

public class ConversionTest {

	public static void main(String[] args) {
		int num1 = 2100000000;
		int num2 = 2100000000;
		
		int result = num1 + num2;
		System.out.println(result);// 이상하다. 왜 마이너지? 
		//오퍼플로우된 음수 값이 저장됨. 데이터의 손실이 발생함.
		//원칙이 지켜지지 않을 경우 데이터의 손실이 발생
		
		long result2 = (long) num1 + num2; // (long) (num1+num2); => 불가
		System.out.println(result2);
	
	}

}
