package com.mytest0118;

public class Employee extends Person{
	String dept;

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}
	 
	void print() {
		System.out.printf("이름: $s 나이: %d 학번: %d", super., );
	}; 
}
