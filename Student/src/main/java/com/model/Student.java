package com.model;
//POJO  

public class Student {
	private String name;
	private int stuId;
	private char gender;

	public Student() {
		super();
	}
	public Student(String name, int stuId, char gender) {
		super();
		this.name = name;
		this.stuId = stuId;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	

}
