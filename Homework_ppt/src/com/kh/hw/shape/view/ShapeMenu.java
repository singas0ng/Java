package com.kh.hw.shape.view;

import java.util.Scanner;
import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController(); // 필드에서 TriangleController 이 객체화 되어있음

	public void inputMenu() {
		int faultInputCount = 0;// 10번째 누르면 더이상 못누르게 하고싶을때
		// 돌때마다 또 다시 0이 될일 없게 while문 바깥에다가 씀
		while (true) { // while 조건식 => 잘못 눌렀을때 public void inputMenu 반복해야함
			// true 는 무한반복이라서 while(true) 쓰려면 반드시 break 존재해야함!!!!! 그래야 반복문 빠져나옴 ㅠㅠ
			boolean isExitMenu = false;
			System.out.println("=====도형 프로그램=====");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 :");
			String menuNum = sc.nextLine();
			switch (menuNum) {
			case "3": // 내가 누르는 숫자 번호 설정 => 3
				faultInputCount = 0;
				triangleMenu();
				break;
			case "4":
				faultInputCount = 0;
				squareMenu();
				break;
			case "9":
				faultInputCount = 0;
				isExitMenu = true;
//				System.out.println("종료");
				break;
			default:
				faultInputCount++; // 늘어난 경우의 수가 __일 경우 빠져나가게 하는 것
				System.out.println("잘못된 번호입니다. 다시 입력하세요");
//				if(faultInputCount > 5) {
//				System.out.println("메뉴얼 숙지하고 실행해 주세요.");
//				//break; //반복문 while 끝냄
//				isExitMenu = true;
//			}
				break;
			}
			if (isExitMenu) {
				System.out.println("종료");
				break; // 반복문 while 끝냄
			}
		}

//		if (menuNum.equals("3")) {
//
//		} else if(menuNum.equals("4")){
//
//		} else {
//			System.out.println("잘못된 번호입니다. 다시 입력하세요");
//		}
	}

	public void triangleMenu() {

		while (true) {
			boolean isExitMenu = false;

			System.out.println("===== 삼각형 =====");
			System.out.println("1. 삼각형 면적");
			System.out.println("2. 삼각형 색칠");
			System.out.println("3. 삼각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			String menuNum = sc.nextLine();
			switch (menuNum) {
			case "1":
			case "2":
				inputSize(3, Integer.parseInt(menuNum));
				break;
			case "3":
				printInformation(3);
				break;
			case "9":
				// inputMenu(); => 이거 안됨 => 위에꺼를 또 다시 쌓는거
				isExitMenu = true;
				break;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력하세요");
				break;
			}
			if (isExitMenu) {
				System.out.println("메인으로");
				break; // 반복문 while 끝냄
			}
		}
	} // 메소드 끝나는 지점 (

	public void squareMenu() {
		while (true) {
			boolean isExitMenu = false;

			System.out.println("===== 사각형 =====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 면적");
			System.out.println("3. 사각형 색칠");
			System.out.println("4. 사각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			String menuNum = sc.nextLine();

			switch (menuNum) {
			case "1":
				inputSize(4, Integer.parseInt(menuNum)); // 1 대신 Integer.parseInt(menuNum) 사용 가능
				break;
			case "2":
				inputSize(4, Integer.parseInt(menuNum));
				break;
			case "3":
				inputSize(4, Integer.parseInt(menuNum));
				break;
			case "4":
				printInformation(4);
				break;
			case "9":
				// inputMenu(); => 이거 안됨 => 위에꺼를 또 다시 쌓는거
				isExitMenu = true;
				break;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력하세요");
				break;
			}
			if (isExitMenu) {
				System.out.println("메인으로");
				break;
			}
		}
	}

	public void inputSize(int type, int menuNum) {
		String typeStr = "";
		if(type == 3) {
			typeStr = "삼각형";
		} else if(type == 4) {
			typeStr = "사각형";
		}
		
		if ((type == 3 && menuNum == 2) || (type == 4 && menuNum == 3)) {
			System.out.println("색깔을 입력하세요.");
			String colorStr = sc.nextLine();
			
			if (type == 3) {
				tc.paintColor(colorStr);
			} else if (type == 4) {
				scr.paintColor(colorStr);
			}
			System.out.println("색이 수정되었습니다.");
		} else {

			System.out.print("높이 : ");
			String heightStr = sc.nextLine();
			System.out.print("너비 : ");
			String widthStr = sc.nextLine();
//			String str = String.valueOf();

			double height = Double.parseDouble(heightStr);// 문자로 되어있는 것을 double 형태에 넣어줌
			double width = Double.parseDouble(widthStr);

			if (type == 4 && menuNum == 1) {
				System.out.print("사각형 둘레 : " + scr.calcPerimeter(height, width));
			} else if (type == 4 && menuNum == 2) {
				System.out.print("사각형 면적 : " + scr.calcArea(height, width));
			} else if (type == 3 && menuNum == 1) {
				System.out.print("삼각형 면적 : " + tc.calcArea(type, menuNum));
			}
		}

//		if (type == 3) {
//			if (menuNum == 1) {
//				System.out.print("높이 : ");
//				String heightStr = sc.nextLine();
//				System.out.print("너비 : ");
//				String widthStr = sc.nextLine();
//
//				double height = Double.parseDouble(heightStr);
//				double width = Double.parseDouble(widthStr);
//				System.out.println("삼각형 면적 :" + tc.calcArea(height, width));
//			
//			} else if (menuNum == 2) {
//				System.out.print("색깔을 입력하세요 : ")
//			}
//			
//		} else if (type == 4) {
//			if (menuNum == 1) {
//			System.out.print("높이 : ");
//			String heightStr = sc.nextLine();
//			System.out.print("너비 : ");
//			String widthStr = sc.nextLine();
				
//			double height = Double.parseDouble(heightStr);
//			double width = Double.parseDouble(widthStr);
//				System.out.print("사각형 둘레 : " + scr.calcPerimeter(height, width));
		
//			} else if (menuNum == 2) {
//				System.out.print("높이 : ");
//				String heightStr = sc.nextLine();
//				System.out.print("너비 : ");
//				String widthStr = sc.nextLine();
			
//				double height = Double.parseDouble(heightStr);
//				double width = Double.parseDouble(widthStr);
		
//				System.out.print("사각형 면적 : " + scr.calcArea(height, width));
//			
//			} else if (menuNum == 3) {
//				System.out.print("색깔을 입력하세요 : ");
//			}

//		}
	}

	public void printInformation(int type) { // 사각형 정보일 때(4번) 호출됨
		if (type == 3) {
			System.out.println(tc.print()); // tc.print(); => String 모양으로 return
		} else if (type == 4) {
			System.out.println(scr.print());
		}
	}
}

//sc : Scanner = new Scanner(System.in)...
//=> Scanner, SquareController, TriangleController 참조자료형 쓰임