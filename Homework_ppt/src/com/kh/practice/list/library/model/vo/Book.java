package com.kh.practice.list.library.model.vo;

import java.util.Objects;

public class Book {

	private String title;
	private String author;
	private String category;
	private int price;
	
	public Book() { //기본 생성자
		super();
	}
	public Book(String title, String author, String category, int price) {
		//매개변수가 있는 생성자
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() { //객체의 정보를 리턴하는 메소드
		return "Book [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	@Override
	public int hashCode() { //해시코드를 리턴하는 메소드
		return Objects.hash(author, category, price, title);
	}
	@Override
	public boolean equals(Object obj) { //객체가 같은지 여뷰를 리턴하는 메소드
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(category, other.category) && price == other.price
				&& Objects.equals(title, other.title);
	}

	public int compareTo(Book otherBook) { 
		//정렬 기준을 가지고 있는 메소드 비교 => 도서 명을 졍렬하라고해서 책 이름을 비교해야함
		return this.title.compareTo(otherBook.title);
	}
	
	
}
