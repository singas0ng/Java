package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.List;
import com.kh.practice.list.library.model.vo.Book;
import com.kh.practice.list.library.view.BookMenu;

public class BookController { 

	private List<Book> booklist = new ArrayList<Book>();

	public BookController() { //초기 값을 넣어줄 기본 생성자
		booklist.add(new Book("자바의 정석/남궁 성/기타/27000"));
		booklist.add(new Book("쉽게 배우는 알고리즘/문병로/기타/15000"));
		booklist.add(new Book("대화의 기술/강보람/인문/17500"));
		booklist.add(new Book("암 정복기/박신우/의료/21000"));
		booklist.add(new Book("갈증에 한 수위/헛개수/인문/15000"));
	}

	public void insertBook(Book bk) { //리스트에 값 저장 메소드
		booklist.add(bk);
	}
	public ArrayList selectList() { //모든 리스트 출력하는 메소드
		ArrayList<Book> result = new ArrayList<Book>();
		return (ArrayList) booklist;
		if(booklist.get(i))
	} 
	public ArrayList searchBook(String keyword) { //키워드로 책을 검색하는 메소드
	ArrayList<Book> result = new ArrayList<Book>();
		for(int i = 0; i < booklist.size(); i++) {
			if(booklist.get(i).getTitle().equals(keyword) || booklist.get(i).getAuthor().equals(keyword)) { 
			//get에서 꺼내면 book 모양
			//keyword 가 입력한 단어라고 생각하면 될듯
			//get 에서 꺼내면 book모양 => get에서 무엇을 해야 keyword랑 같은 것을 찾느냐
			//입력한 단어가 책의 title에 있는 단어와 같은지, 작가이름에 있는 단어와 같을수도 있으니 둘다 keyword랑 비교
				result.add(booklist.get(i));
			}
		}
		return result;
	}
	public Book deleteBook(String title, String author) { //책 제목과 저자명으로 책을 삭제하는 메소드
		Book result = new Book();
		return result;
	
	}
	public int ascBook() { //책 오름차순으로 정리
		int result = 0;
		return result;
	}
}
