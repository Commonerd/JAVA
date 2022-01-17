package forex.day0105;

import java.util.Scanner;

public class ForEx4 {

	public static void main(String[] args) {
		//숫자를 입력하면 그 숫자에 맞는 구구단 출력하세요.
		Scanner s = new Scanner(System.in);
		System.out.println("단을 입력하세요 >");
		int dan = s.nextInt();
		
		System.out.println(dan+"단");
		System.out.println("===========");
		for(int i = 1; i<=9 ; i++) {
			System.out.printf("%d * %d = %d\n",dan, i, dan*i);
			
		}
		System.out.println("===========");
		for(int i = 9; i>=1 ; i--) {
			System.out.printf("%d * %d = %d\n",dan, i, dan*i);
		}
		
		s.close();
		
					
		//for 문을 이용해 1~100 사이의 값 중 3과 7의 공배수를 구하고, 그중 최소 공배수 출력해주세요.
		
		//for문을 이용해 알파벳 대문자 A~Z까지 출력해주세요.
		
		// 1부터 100까지의 자연수 중에서 3의 배수이면서 동시에 5의 배수인 숫자를 출력하세요.
		
//		int n = 1
//		for(int i=15; i<=100; n +=1) {
//			i=i*n
//		}
		// 2와 100 사이에 있는 모든 소수(prime number)를 찾는 프로그램 작성하세요(소수는 1과 자신 이외 약수 없어야)
		//즉 현재 정수에서 시작해 100사이에 약수가 하나라도 있으면 소수가 아니다.
		//약수는 % 연산자를 이용하여 검사할 수 있다. 
		//즉, i가 5의 약수라면 i%5가 이 된다.
		
		//for 문을 이용해 1부터 누적해서 합계를 구하다가 합이 300이 넘으면 중지하고, 그때까지의 합과 마지막으로 더해진 값을 구하는 코드를 작성하세요. 
		
	
			/* 2.
			 * int second = for(int i=)
			 
			 */
			/*
			 * for (int i1 = 65; i1<=90; i1++) { System.out.println(i1);
			 * 
			 * }
			 */
			
			// 1부터 100까지의 자연수 중에서 3의 배수이면서 동시에 5의 배수인 숫자를 출력하세요.
			
			//15, 30, 45, 60, 75, 90
		
			// 2와 100 사이에 있는 모든 소수(prime number)를 찾는 프로그램 작성하세요(소수는 1과 자신 이외 약수 없어야)
			//즉 현재 정수에서 시작해 100사이에 약수가 하나라도 있으면 소수가 아니다.
			//약수는 % 연산자를 이용하여 검사할 수 있다. 
			//즉, i가 5의 약수라면 i%5가 이 된다.
			
			//for 문을 이용해 1부터 누적해서 합계를 구하다가 합이 300이 넘으면 중지하고, 그때까지의 합과 마지막으로 더해진 값을 구하는 코드를 작성하세요.
			/*		
			int i = 1;
			int sum = i;
			for(; sum + i <=300; i++) {
				System.out.println(sum);
				System.out.println(i);*/
		
		}
	}


