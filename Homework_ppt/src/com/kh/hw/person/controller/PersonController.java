package com.kh.hw.person.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.hw.employee.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	List<Student> sList = new ArrayList<>();
	List<Employee> eList = new ArrayList<>();
	
	Student[] s = new Student[3];
	Employee[] e = new Employee[10];
	
	public int personCount() {
		return 0;
		
	}
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		
		for(int i = 0; i < 4 ; i++) {
			Student inputStudent = new Student();
			inputStudent.setGrade(grade);
			inputStudent.setMajor(major);
			s[i] = inputStudent;
		}
		
		
	
	}
	public Student[] printStudent() {
		return s; //student 저장된거 반환
	}
	public void insertEmployee (String name, int age, double height, double weight, int salary, String dept) {
		
		
	
		
	}
	public Employee[] printEmployee() {
		return e; //Employee 저장된거 반환해야지
	}
}
