package com.kh.practice.chap01_poly.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;

public class LibraryMenu {

	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		System.out.println("==== 메뉴 ====");
		System.out.println("1. 마이 페이지");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색");
		System.out.println("4. 도서 대여하기");
		System.out.println("9. 프로그램 종료하기");
		System.out.print("메뉴 번호 : ");
		String menuNum = sc.nextLine();

		switch (menuNum) {
		case "1":
			lc.myInfo();
			break;
		case "2":
			selectAll();
			break;
		case "3":
			searchBook();
			break;
		case "4":
			rentBook();
			break;
		case "9":
			System.out.println();
			System.out.println("프로그램 종료하기");
			break;
		}
		if (!menuNum.equals("1") && !menuNum.equals("2") && !menuNum.equals("3") && !menuNum.equals("4")
				&& !menuNum.equals("9")) {
			System.out.println();
			System.out.println("잘못 누르셨습니다. 다시 눌러주세요.");
			System.out.println();
			mainMenu();
		}

	}

	public void selectAll() {
		// LibraryController의 selectAll()메소드 호출하여 결과 값 Book[] 자료형 bList에 담기
		// for문 이용하여 bList의 모든 도서 목록 출력
		// 단, i를 이용하여 인덱스도 같이 출력 → 대여할 때 도서번호를 알기 위해
		// ex ) 0번도서 : 백종원의 집밥 / 백종원 / tvN / true
		
		Book[] bList = lc.selectAll();

		for(int i = 0; i < bList.length; i++) {
			System.out.println(i + "번도서 : " + bList[i]);
		}
	}

	public void searchBook() {

		System.out.println("검색할 제목 키워드 : "); // “검색할 제목 키워드 : “ >> 입력 받음 (keyword)
		String keyword = sc.nextLine();

		Book[] searchList = lc.searchBook(keyword); 
		// 1. 왼쪽 먼저 작성 : LibraryController의 searchBook() 에 전달
		// 2. 오른쪽 작성: 그 결과 값을 Book[] 자료형 searchList에 담아 검색 결과인 도서 목록 출력

		if(searchList.length > 0) {
			System.out.println("검색 결과 : ");
			for(int i = 0; i < searchList.length; i++) {
				System.out.println(searchList[i]);
			}
		} else {
			System.out.println("검색 결과가 없습니다.");
		} 
	}

	public void rentBook() {

		lc.selectAll();

		System.out.println("대여할 도서 번호 선택");
		String indexStr = sc.nextLine();
		int index = Integer.parseInt(indexStr);
		
		int result = lc.rentBook(index);

		switch (result) {
		case 0:
			System.out.println("성공적으로 대여되었습니다.");
			break;
		case 1:
			System.out.println("나이 제한으로 대여 불가능입니다.");
			break;
		case 2:
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
			break;
		default:
			System.out.println("알 수 없는 오류가 발생했습니다.");
			break;
		}
	}
}
