package com.kh.practice.func;

import java.util.Scanner;

public class OperationPractice {
	int i;

	public void practice1() {

		System.out.println("정수 : ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if (i >= 0) {
			System.out.println("양수다");
		} else {
			System.out.println("앙수가 아니다");
		}
		System.out.println("");
	}

	public void practice2() {

		System.out.println("정수: ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if (i > 0) {
			System.out.println("양수다");
		} else if (i == 0) {
			System.out.println("0이다");
		} else {
			System.out.println("음수다");
		}

	}

	public void practice3() {
		System.out.println("정수 : ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if (i % 2 == 0) {
			System.out.println("짝수다");
		} else {
			System.out.println("홀수다");
		}

	}

	public void practice4() {

	}
	
	public void practice5() {
		System.out.println("이름 : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		System.out.println("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.println("반(숫자만) : ");
		int cnum = sc.nextInt();
		
		System.out.println("번호(숫자만) : ");
		int num = sc.nextInt();
		
		System.out.println("성별(M/F) : ");
		String gender = sc.nextLine();
		if(gender == "M or m") {
			System.out.println("남학생");
		}else if (gender == "F or f") {
			System.out.println("여학생");
		}
			
		System.out.println("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble();
		
		
		System.out.println(name + "학년" + grade + "반" + num + "번" + name + "의" + grade + "은" + score + "입니다.");
	}

	public static void main(String[] args) {
		
	}
}
