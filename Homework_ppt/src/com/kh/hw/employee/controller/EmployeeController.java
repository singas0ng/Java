package com.kh.hw.employee.controller;

import com.kh.hw.employee.model.vo.Employee;

public class EmployeeController {

	private Employee e = new Employee(); //employee 공간 자료형
	
	public void add(int empNo, String name, char gender, String phone) {
		e.setEmpNo(empNo);
		e.setName(name);
		e.setGender(gender);
		e.setPhone(phone);
	//매개변수 있는 생성자를 이용하여 데이터 저장하는 메소드
		
	}
	
	public void add(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
		e.setEmpNo(empNo);
		e.setName(name);
		e.setGender(gender);
		e.setPhone(phone);
		e.setDept(dept);
		e.setSalary(salary);
		e.setBonus(bonus);
	//매개변수 있는 생성자를 이용하여 데이터 저장하는 메소드
	}
	
	public void modify(String phone) {
		e.setPhone(phone);
	//setter로 정보 수정
	}
	
	public void modify(int salary) {
		e.setSalary(salary);
	//setter로 정보 수정
	}
	
	public void modify(double bonus) {
		e.setBonus(bonus);
	//setter로 정보 수정
	}
	
	public Employee remove() { //객체를 삭제하는 메소드
		e = new Employee(); //객체 e에 null을 저장
		return e;
	}
	public String inform() { //객체에 저장된 데이터를 가져와 반환하는 메소드
		if(e.getName() == null) { //객체 e가 null 이라면
			return null; //반환
		}else {
			return e.getName(); //아니면 사원 정보 반환
		}
		
	}
}
