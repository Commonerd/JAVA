package com.test.day01194;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.no = "A1892";
		e1.name = "박나래";
		e1.dept = "총괄개발부";
		e1.job = "대리";
		e1.sal = 3500;
		Employee e2 = new Employee("B8077", "유재석", "Web개발부", "부장", 4000);
		Employee e3 = new Employee("C5691", "김동욱", "Android개발부", "과장", 4000);

		Employee[] emps = { e1, e2, e3 };

		Scanner s = new Scanner(System.in);
		System.out.println("사원번호를 입력하세요.");
		String input_no = s.next();// input_no : 입력했을 떄 저장하는 사원번호
		int x = 0; // 0->사원 없음, 1-> 사원 있음
		for (Employee e : emps) {// emps안에 있는 것을 다 꺼냅니다.그것을 Employee e에 저장합니다.
			String no = e.no;
			if (input_no.equals(no)) { // ==가 아니라, equals를 쓴다.
				x = 1;
				System.out.println(e);
				break;
			}
			if (x == 0) {
				System.out.println("해당사원이 없습니다.");
			}
		}
		s.close();
	}
}