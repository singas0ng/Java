package com.kh.hw.person.model.vo;

public class Employee {

	private int salary; //급여
	private String dept; //부서
	
	public Employee() {
		
	}
	public Employee(String name, int age, double weight, int salary, String dept) {
		
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
//	@Override
//	public String toString() {
//		return;
//	}
	
	
	
	
	
}
