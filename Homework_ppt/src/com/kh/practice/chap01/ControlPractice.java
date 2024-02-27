package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {

		while (true) {
			System.out.println("1. 입력");
			System.out.println("2. 수정");
			System.out.println("3. 조회");
			System.out.println("4. 삭제");
			System.out.println("7. 종료");
			System.out.println("메뉴 번호를 입력하세요 : ");
			int menuNum = sc.nextInt();

			switch (menuNum) {
			case 1:
				System.out.println("입력 메뉴입니다.");
				return;
			case 2:
				System.out.println("수정 메뉴입니다.");
				return;
			case 3:
				System.out.println("조회 메뉴입니다.");
				return;
			case 4:
				System.out.println("삭제 메뉴입니다.");
				return;
			case 7:
				System.out.println("프로그램이 종료됩니다.");
				return;
			}
		}
	}

	public void practice2() {

		System.out.print("숫자 한 개를 입력하세요. : ");
		int num = sc.nextInt();

		if (num > 0) {
			if (num % 2 == 0)
				System.out.println("짝수다");
			else
				System.out.println("홀수다");
		} else
			System.out.println("양수만 입력해주세요.");

	}

	public void practice3() { // if문 두개라서 둘다 잘 마무리해야 출력된다

		System.out.print("국어 점수 : ");
		int kr = sc.nextInt();
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();

		int sum = kr + math + eng;
		double avg = (kr + math + eng) / 3;

		if (avg >= 60) {
			if (kr >= 40 && math >= 40 && eng >= 40) {
				System.out.println("국어 : " + kr);
				System.out.println("수학 : " + math);
				System.out.println("영어 : " + eng);
				System.out.println(sum);
				System.out.println(avg);
				System.out.println("축하합니다, 합격입니다!");

			} else {
				System.out.println("불합격입니다.");
			}

		} else {
			System.out.println("불합격입니다.");
		}
	}

	public void practice4() {

		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();

		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println(month + "는 겨울입니다.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println(month + "는 봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(month + "는 여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(month + "는 가을입니다.");
			break;
		default:
			System.out.println(month + "는 잘못 입력된 달입니다.");
		}

	}

	public void practice5() {

		String id = "myId";
		String pw = "myPassword12";

		System.out.print("아이디 : ");
		String i = sc.nextLine();
		System.out.print("비밀번호 : ");
		String p = sc.nextLine();

		if (i.equals(id)) {
			if (p.equals(pw)) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}

		} else {
			System.out.println("아이디가 틀렸습니다.");
		}
	}

}
