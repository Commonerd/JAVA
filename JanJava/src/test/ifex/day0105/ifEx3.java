package test.ifex.day0105;

import java.util.Scanner;

public class ifEx3 {
//1. 두개의 정수를 입력받아 두 숫자의 차를 구하시오
//	단 음수가 나오면 안됩니다.(첫 번째 값이 더 큰 것. 큰 것에서 작은 것 빼기)


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("첫 번째 정수를 입력하세요. >");
		int first = s.nextInt();
		System.out.println("두 번째 정수를 입력하세요. >");
		int second = s.nextInt();
		

		if (first > second) {
			System.out.println(first-second);

		} else {
			System.out.println(second-first);//절대값을 구해야 함.
		}
		

		s.close();
	}
}