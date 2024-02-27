package com.kh.practice.chap01_poly.controller;

import java.util.Arrays;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {

	private Member mem = null; // 회원 레퍼런스
	private Book[] bList = new Book[5]; // 도서 전체 목록 리스트

	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}

	public void insertMember(Member mem) {
		this.mem = mem;
	}

	public Member getMem() {
		return mem;
	}

	public void setMem(Member mem) {
		this.mem = mem;
	}

	public Member myInfo() { // 회원 레퍼렌스 리턴
		return mem;

	}

	public Book[] selectAll() {
		return bList;

	}

	public Book[] searchBook(String keyword) {

		Book[] result = new Book[5];
		// 검색 결과를 담아줄 새로운 Book 객체 배열 생성
		// 검색 결과 도서 목록이 최대 5개일 수 있으니 임의로 크기 5 할당

		int count = 0;
		// 해당 검색결과의 도서목록 주소 값 리턴

		for (Book book : bList) { // for문을 이용하여 bList 도서 목록들의 도서명과 전달받은 keyword 비교
			if (book.getTitle().contains(keyword)) { // 전달받은 keyword를 포함하고 있으면 → HINT : String 클래스의 contains() 참고
				result[count] = book; // 검색결과의 도서목록에 담기 → HINT : count 이용
				count++;
				if (count == 5) {
					break;
				}
			}
		}
		return result;

//        깊은 복사: 원래 있는 파일을 복사 했을 때 복사된 파일이 기존 파일에 영향을 받지 X
//        => 애초에 공간을 따로 만들고 각 공간 안에 값들을 꺼내서 사용 

	}

	public int rentBook(int index) {

	
		

		if (bList[index] instanceof AniBook) {
			AniBook aniBook = (AniBook) bList[index];
			if (mem.getAge() < aniBook.getAccessAge()) { 	
				// 전달받은 인덱스의 도서가 만화책인 경우 회원의 나이와 해당 만화책의 제한 나이를 비교
				int result = 1;
				// 회원 나이가 더 적 은 경우 result를 1로 초기화
			}
		} else if(bList[index] instanceof CookBook) {
			CookBook cookBook = (CookBook) bList[index];
			if(mem.getCouponCount() > 0) {
				
				}
			}
		
		
		// 전달받은 인덱스의 도서가 요리책인 경우 해당 요리책의 쿠폰 유무가 유일 경우 회원의 couponCount를 1증가 시킨 후 result
		// 2로 초기화
		// → result 리턴

		return 0;

	}
}
