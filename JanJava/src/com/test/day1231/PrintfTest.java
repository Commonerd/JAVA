package com.test.day1231;

public class PrintfTest {

	public static void main(String[] args) {
		System.out.printf("%d\t", 123);
		System.out.printf("%5d\t", 123);
		System.out.printf("%05d\n", 123);
		
		System.out.printf("%f\n",123.45);
		System.out.printf("%7.1f\n",123.45);
		System.out.printf("%7.3f\n",123.45);
		
		System.out.printf("%s\n","hello");
		System.out.printf("%10s\n","hello");
		
	}

}
