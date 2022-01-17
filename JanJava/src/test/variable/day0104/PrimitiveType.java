package test.variable.day0104;

public class PrimitiveType {

	public static void main(String[] args) {
		// 변수 선언
		boolean b;
		b = true;
		System.out.print("b : " + b);
		b = false;
		System.out.print("\nb : " + b);

		char c1 = 'A';
		char c2 = 65;
		char c3 = (char) 0xfAC00; // 44032 ; 0~127벗어나는 숫자라면 해당코드표 가져다가 갖고옴.
		System.out.println("c1 :" + c1); // A
		System.out.println("c2 :" + c2); // A. 왜 이러지? 255까지는 '아스키코드'에 의해 변환된다. 그 밖에 유니코드. ㄹㅇ
		System.out.println("c3 :" + c3);
		/* 여러줄 주석 */
		
		int i = 100;
		/*int 범위를 넘어서는 정수 리터럴(인트가 됨) 값 -> error
		 *뒤에 접미사 L/1을 붙여서 long 타입을 명시해준다.  
		 */
		long l = 100000000000L;//100억은 인트형이 아니라 롱 타입의 데이터라고 명시
		
		float f = 100;
		double d = 100;
		System.out.println("f :"+f);
		System.out.println("d :"+d);
		
		double d2 = 3.14;
		//실수 리터럴 -> double, float 에 저장x
		//실수 리터럴에 접미사 F/f를 붙이면 float타입 명시
		float f2 = 3.14F;
		
		float f3 = 1.00000000001F;
		//플로트에 소수점 많이 주면 알아서 잘라먹는다.
		double d3 = 1.00000000001;
		System.out.println("f3 : "+f3);
		System.out.println("d3 : "+d3);
		
		
	 	
	}

}
