package test.ifex.day0105;

import java.util.Scanner;

public class ConditionOperEx {
	/** api문서 주석*/
	//스캐너 생성 후
	//입력한 값을 저장, 저장된 값이 짝수라면 "짝수입니다."출력
	//저장된 값이 짝수라면 "홀수입니다."출력
	//스캐너 종료
	//** 조건연산자 ? : 이용해서
	//public static void main(String[] args) {
	//	Scanner s = new Scanner(System.in); //System.in => 화면에서 입력.
	//	System.out.print("값을 입력하세요. >");
	//	int first = s.nextInt();
	//	first % 2 = 0 ? "짝수입니다." : "홀수입니다."
		
	//	s.close();
	
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in); //System.in => 화면에서 입력.
			System.out.print("값을 입력하세요. >");
			int num = s.nextInt();
			String str="";
			
			str = num % 2 == 0 ? "짝수입니다." : "홀수입니다.";
			System.out.printf("%d는 %s", num, str);
			s.close();
			
	// 내 코드와 무슨 차이가 있는가?
	// 나는 =를 쓰는 실수, 답은 ==을 써야 함. 
	// 그 외의 것? String str=""; str = ; System.out.printf("%d는 %s", num, str)
	} 

}
