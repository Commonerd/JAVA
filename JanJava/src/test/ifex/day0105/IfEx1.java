package test.ifex.day0105;

public class IfEx1 {
//if(조건식){조건식의 결과가 true일때 실행할 문장;}
//개발을 많이 한 사람들은 {} 생략하기도 한다.
//}else { 조건식의 결과가 false일때 실행할 문장; }
//실행할 문장이 하나라면 {}을 생략할 수 있다.

	public static void main(String[] args) {
		int su1 = 100 ;
		if (su1 >= 50) {
			System.out.println("50이상");
		}
		else {
			System.out.println("50미만");
		}
		System.out.println("program end!!");

	}

}
