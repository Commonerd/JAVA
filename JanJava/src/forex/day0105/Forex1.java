package forex.day0105;

public class Forex1 {

	public static void main(String[] args) {
		// 10번 반복 0 ~9 까지 돌아 총 10번 반복하겠다면...
		// 0은 초기식 ; 9는 조건식 ;
		// for문 안에서 선언된 변수는 지역 안에서만 쓸 수 있다. '지역변수'라고 한다.
		// 초기식을 밖에서 선언했으면 for문 안에서 생략 가능하다.
		// 즉 int i = 0; 을 전역변수로 선언했는지, for문 안에서 지역변수로 선언했는지 차이.
		// 아래 식에서는 i++을 수행문 밖으로 빼도 됨.
		// 결과적으로 for문 안에 좌우는 생략된 형태임.
		// 초기식과 증감식은 생략할 수 있지만, 무한 반복에 빠지지 않도록 주의.
		int i = 0;
		for (; i <= 9;) {
			System.out.println(i);
			i++;
		}
		System.out.println(i);// '지역변수'를 외부에서 불러오려고 하기 때문에 에러나는 것임.
		System.out.println("for end!!");

		// 0~20까지 출력?
		for (int q = 0; q <= 20; q++) {
			System.out.println(q);
		}
		System.out.println("for end");

		// 1~20까지 출력
		for (int q = 1; q <= 20; q++) {
			System.out.println(q);
		}
		System.out.println("for end");

		for (int q = 1; q <= 20; q++) { 
			if(q % 2 !=0)
			System.out.println("odd :"+q);
		}
		System.out.println("for end");
		
		for (int q = 1; q <= 20; q+=2) { 
			System.out.println("odd :"+q);
		}
		System.out.println("for end");
		
		for (int q = 2; q <= 20; q++) { 
			if(q % 2 !=1)
			System.out.println("even :"+q);
		}
		System.out.println("for end");
		
		for (int q = 2; q <= 20; q+=2) { 
			System.out.println("even :"+q);
		}
		System.out.println("for end");
	}

} // 0~까지출력

/*
 * package forex.day0105;
 * 
 * public class Forex1 {
 * 
 * public static void main(String[] args) { //10번 반복 0 ~9 까지 돌아 총 10번 반복하겠다면...
 * // 0은 초기식 ; 9는 조건식 ; for (int i=0; i <=3; i++) { System.out.println(i); }
 * System.out.println("for end!!"); }
 * 
 * }
 */