package com.practice.week2.n1;

public class Student implements Comparable<Student>{
	private String name;
	

	public Student(String name) {
		//super();
		this.name = name;
	}
	public Student() {}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	

}