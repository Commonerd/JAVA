package test.variable.day0104;

public class ConversionTest4 {
//크기가 다른 타입의 계산은 큰 타입의 데이터로 바꿔서 계산
//계산할 떄 변수에 저장된 값만 꺼내와서 저장
//실수의 소수점을 버릴 경우 (int)로 형변환한다. 
	public static void main(String[] args) {
		int i = 100;
		double d = 100;
		
		double result = i +d; //타입이 다르면 큰타입으로 '자동'으로 바꿈.
		int iResult = (int)(i + d); // 또는 double iResult= i + d; 
		
		System.out.println("i : "+i); // 100 (i의 타입 변한 것 없다)
		System.out.println("d : "+d); // 100.0 (d의 타입 변한 것 없다)
		System.out.println("result : "+result);  // 200.0
		System.out.println("iResult : "+iResult); // 200

	}

}
