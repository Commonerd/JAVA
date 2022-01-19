package com.mytest0118;

public class Student extends Person{
	
	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}
	
	@Override
	public void print() {
		System.out.printf("이름 : %s 나이 : %d 학번 : %d\n", getName(), getAge(), getId());
	};
	 
} 
 