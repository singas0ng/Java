package com.kh.hw.person.model.vo;

public class Student {

	private int grade; //학년
	private String major; //전공
	
	public Student() {
		
	}
	public Student(String name, int age, double height, double weight, int grade, String major) {
		
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String toString() {
		return "Student[grade = "+ grade + ", major = "+ major + "]";
	}


}
