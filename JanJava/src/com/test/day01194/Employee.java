package com.test.day01194;

public class Employee {
	public String no;
	public String name;
	public String dept;
	public String job;
	public int sal;

	public Employee() {
	}

	public Employee(String no, String name, String dept, String job, int sal) {
		super();
		this.no = no;
		this.name = name;
		this.dept = dept;
		this.job = job;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return no + " : " + dept + " " + name + " " + job;
	}

}
