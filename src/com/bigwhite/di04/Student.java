package com.bigwhite.di04;

public class Student {
	private String name;
	private int age;
	private School school1 = new BaseSchool();
	
	public Student() {
		super();
	}

	public Student(String name, int age, School school) {
		super();
		this.name = name;
		this.age = age;
		this.school1 = school;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public School getSchool() {
		return school1;
	}

	public void setSchool(School school) {
		this.school1 = school;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", school=" + school1 + "]";
	}
}
