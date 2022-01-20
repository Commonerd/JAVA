package com.test.day01194;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.name="박나래";
		employee1.dept="총괄개발부";
		employee1.job="대리";
		employee1.sal=3500;
		Employee employee2 = new Employee();
		employee2.name="유재석";
		employee2.dept="Web개발부";
		employee2.job="부장";
		employee2.sal=4500;
		Employee employee3 = new Employee();
		employee3.name="김동욱";
		employee3.dept="Andorid개발부";
		employee3.job="과장";
		employee3.sal=4000;
		Scanner s = new Scanner(System.in);
		System.out.println("사원번호를 입력하세요. >");
		String a = s.next();
		
		if (a=="A1892") {
			System.out.println(1);
			}
//			System.out.printf("%s : %s\t %s\t %s", a, employee1.dept, employee1.name, employee1.job);
//		} else if (a=="B8077") {
//			System.out.printf("%s : %s\t %s\t %s", a, employee2.dept, employee2.name, employee2.job);
//		} else if (a=="C5691") {
//			System.out.printf("%s : %s\t %s\t %s", a, employee3.dept, employee3.name, employee3.job);
//		}
		s.close();
		
	}	

}
