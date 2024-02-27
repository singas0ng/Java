package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;
import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();

	public void mainMenu() {
		boolean exit = false;
		
		System.out.println("==Welcome KH Library==");
		System.out.println();
		System.out.println("====***** 메인 메뉴 *****====");
		System.out.println("1. 새 도서 추가");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색 조회");
		System.out.println("4. 도서 삭제");
		System.out.println("5. 도서 명 오름차순 정렬");
		System.out.println("9. 종료");
		System.out.println();
		System.out.print("메뉴 번호 입력 : ");
		String menuNum = sc.nextLine();
		
		
		switch(menuNum) {
		case "1":
			insertBook();
		case "2":
			selectList();
		case "3":
			searchBook();
		case "4":
			deleteBook();
		case "5" :
			ascBook();
		case "9" : 
			System.out.println("프로그램 종료합니다.");
		default:
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			if(menuNum.equals(9)) {
				break;
			}
		}
	
	}

	public void insertBook() {
		System.out.println("===== 새 도서 추가 =====");
		System.out.println("책 정보를 입력하세요");
		System.out.println("도서 명 : ");
		String title = sc.nextLine();
		System.out.print("저자 명 : ");
		String author = sc.nextLine();
		System.out.print("장르(1. 인문 / 2. 과학 / 3. 외국어 / 4. 기타) : ");
		int category = sc.nextInt();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		switch(category) {
		case 1:
			category = "인문";
			break;
		case 2:
			category = "과학";
			break;
		case 3:
			tCate = "외국어";
			break;
		case 4:
			tCate = "기타";
			break;
		default:
			System.out.println("장르 번호를 잘못 입력하였습니다.");
		}
		
		bc.insertBook(title, author, tCate, price);
	}

	public void selectList() {
		
		bc.selectList();
	
	}

	public void searchBook() {
		System.out.println("===== 도서 검색 ======");
		System.out.println("검색 키워드 : 의");
		
		
		bc.searchBook(keyword);
	}

	public void deleteBook() {
		System.out.println("===== 도서 삭제 =====");
		System.out.println("삭제할 도서 명 : 갈증에 한 수위");
		System.out.print("삭제할 저자 명 : ");
		String author = sc.nextLine();
		System.out.println("성공적으로 삭제되었습니다.");
	}

	public void ascBook() {
	
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - i -1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j +1] = temp;
				}
			}
		}
		
		
		System.out.println("정렬에 성공하습니다.");
	}
}
