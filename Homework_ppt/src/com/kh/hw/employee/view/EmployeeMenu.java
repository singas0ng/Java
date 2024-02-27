package com.kh.hw.employee.view;

import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;

public class EmployeeMenu {

	private Scanner sc = new Scanner(System.in);
	private EmployeeController ec = new EmployeeController();

	public EmployeeMenu() { // 메인메뉴 출력하는 기본 생성자
		while (true) {

			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 수정");
			System.out.println("3. 사원 삭제");
			System.out.println("4. 사원출력");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호를 누르세요 : ");
			String menu = sc.nextLine();

			switch (menu) {
			case "1":
				insertEmp();
				break;
			case "2":
				updateEmp();
				break;
			case "3":
				deleteEmp();
				break;
			case "4":
				printEmp();
				break;
			case "9":
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("번호를 잘못 입력했습니다.");
				break;
			}
			if (menu.equals("9")) {
				break;
			}
		}
	}

	public void insertEmp() { // 저장 데이터를 사용자에게 받는 메소드

		System.out.print("사원 번호");
		String empNo = sc.nextLine();
		int iempNo = Integer.parseInt(empNo);

		System.out.print("사원 이름");
		String name = sc.nextLine();

		System.out.print("사원 성별");
		String gender = sc.nextLine();
		char cgender = gender.charAt(0);

		System.out.print("전화번호");
		String phone = sc.nextLine();

		System.out.print("추가 정보를 더 입력하시겠습니까?(y/n) : ");
		String inputconfirm = sc.nextLine();

		if (inputconfirm.equals("y") || inputconfirm.equals("Y")) {
			System.out.println("사원 부서 : ");
			String dept = sc.nextLine();
			
			System.out.println("사원 연봉 : ");
			String salary = sc.nextLine();
			int isalary = Integer.parseInt(salary);
			
			System.out.println("보너스 율: ");
			String bonus = sc.nextLine();
			double dbonus = Double.parseDouble(bonus);

			ec.add(iempNo, name, cgender, phone, dept, isalary, dbonus);
			//EmployeeController 에서 쓴 형이랑 같은 형으로 써야함 무조건
		} else {
			ec.add(iempNo, name, cgender, phone);
		}

	}

	public void updateEmp() {

		System.out.println("가장 최신의 사원 정보를 수정하게 됩니다");
		System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
		System.out.println("1. 전화번호");
		System.out.println("2. 사원 연봉");
		System.out.println("3. 보너스 율");
		System.out.println("9. 돌아가기");
		System.out.println("메뉴 번호를 누르세요 : ");
		String menuNum = sc.nextLine();
		
		
		switch (menuNum) {
		case "1":
			System.out.println("수정할 전화번호 : ");
			String phone = sc.nextLine();
			ec.modify(phone);			
		case "2":
			System.out.println("수정할 사원 연봉 : ");
			String salary = sc.nextLine();
			int isalary = Integer.parseInt(salary);			
		case "3":
			System.out.println("수정할 보너스 율 : ");
			String bonus = sc.nextLine();
			double dbonus = Double.parseDouble(bonus);
		case "9":
			System.out.println("메인메뉴로 돌아갑니다");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;

		}
	}

	public void deleteEmp() {
		System.out.println("정말 삭제하시겠습니까?(y/n) : ");
		String answer = sc.nextLine();
	
		if (answer == "y" || answer == "Y") {
			System.out.println("데이터 삭제에 성공하였습니다.");
		} else {
			
			System.out.println();
		}

	}

	public void printEmp() {
		if (ec.inform() == null) { //사원 데이터 없는 경우
			System.out.println("사원 데이터가 없습니다.");
		} else {
			System.out.println(ec.inform()); //사원 데이터 있는 경우
		}

	}

}
