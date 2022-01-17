package com.test.day1231;

import java.util.Scanner;

public class ChangeNumber {
//inch를 입력하면 cm단위로 변환해 출력해주세요.
//1inch == 2.54cm	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("inch값을 입력하세요. >");
		int inch = s.nextInt();
		double cm = inch * 2.54; // 실수는 double, 정수는 int
		System.out.printf("%d inch는 %.2fcm입니다.",inch,cm);
		s.close();
	}

}
