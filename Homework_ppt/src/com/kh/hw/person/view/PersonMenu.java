package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {

	Scanner sc = new Scanner(System.in);
	PersonController pc = new PersonController();

	public void mainMenu() {
		
		while (true) {
		System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 학생은 0명입니다.");
		System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 사원은 0명입니다.");

			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			String num = sc.nextLine();
			
			switch (num) {
			case "1":
				studentMenu();
			case "2":
				employeeMenu();
			case "9":
				System.out.println("종료합니다.");
				System.out.println("");
				break;
			default:				
				if(num != "1" && num != "2" && num != "9" ) {
					System.out.println();
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
					System.out.println();
					mainMenu();
				}
			}
		}
	}

	public void studentMenu() {
		// 만일 학생 객체 배열에 담긴 데이터의 수가 3개 일 때
		// “학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상
		// 활성화 되지 않습니다.”를 출력 후 메뉴 번호를 담음
		// 실제로 1번을 누르면 “잘못 입력하셨습니다. 다시 입력해주세요.”를 출력
		// 학생 객체 배열에 담긴 데이터의 수가 3개가 아닐 때는
		// 위에 출력한 메뉴 모두 받을 수 있게 함
		// 	메뉴 번호 :잘못 입력했을 경우, “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
		
		System.out.println("");
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 보기");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		String num = sc.nextLine();
		
		switch(num) {
		case "1" :
			insertStudent();
		case "2" :
			printStudent();
		case "9" :
			System.out.println();
			System.out.println("메인으로 돌아갑니다.");
			System.out.println();
			mainMenu();	
		}
		if(num != "1" && num != "2" && num != "9" ) {
			System.out.println();
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
		}
		studentMenu();
		
	}

	public void employeeMenu() {
		
		// 만일 사원 객체 배열에 담긴 데이터의 수가 10개 일 때
		// “사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가 메뉴는 더 이상
		// 활성화 되지 않습니다.”를 출력 후 메뉴 번호를 담음
		// 실제로 1번을 누르면 “잘못 입력하셨습니다. 다시 입력해주세요.”를 출력
		// 사원 객체 배열에 담긴 데이터의 수가 10개가 아닐 때는
		// 위에 출력한 메뉴 모두 받을 수 있게 함
		// 메뉴 번호 : 잘못 입력했을 경우, “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
		
		System.out.println("");
		System.out.println("1. 사원 추가");
		System.out.println("2. 사원 보기");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		String num = sc.nextLine();
		
		switch(num) {
		case "1":
			insertEmployee();
		case "2":
			printEmployee();
		case "9":
			System.out.println();
			System.out.println("메인으로 돌아갑니다.");
			mainMenu();
		}
		if(num != "1" && num != "2" && num != "9" ) {
			System.out.println();
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
		}
		employeeMenu();
	}

	public void insertStudent() {

		System.out.println("");
		System.out.println("학생 이름 : ");
		String name = sc.nextLine();
		System.out.println("학생 나이 : ");
		String age = sc.nextLine();
		int iage = Integer.parseInt(age);
		System.out.println("학생 키 : ");
		String height = sc.nextLine();
		Double dheight = Double.parseDouble(height);
		System.out.println("학생 몸무게 : ");
		String weight = sc.nextLine();
		Double dweight = Double.parseDouble(weight);
		System.out.println("학생 학년 : ");
		String grade = sc.nextLine();
		int igrade = Integer.parseInt(grade);
		System.out.println("학생 전공 : ");
		String major = sc.nextLine();
		String num = sc.nextLine();
		
	
				
			
		
	}

	public void printStudent() {
		pc.printStudent();
	}

	public void insertEmployee() {
		
		System.out.println("");
		System.out.println("사원 이름 : ");
		String name = sc.nextLine();
		System.out.println("사원 나이 : ");
		String age = sc.nextLine();
		int iage = Integer.parseInt(age);
		System.out.println("사원 키 : ");
		String height = sc.nextLine();
		Double dheight = Double.parseDouble(height);
		System.out.println("사원 몸무게 : ");
		String weight = sc.nextLine();
		Double dweight = Double.parseDouble(weight);
		System.out.println("사원 급여 : ");
		String salary = sc.nextLine();
		int isalary = Integer.parseInt(salary);
		System.out.println("사원 부서 : ");
		String dept = sc.nextLine();
		String num = sc.nextLine();
		
		
	}

	public void printEmployee() {
		pc.printEmployee();
	}

}
