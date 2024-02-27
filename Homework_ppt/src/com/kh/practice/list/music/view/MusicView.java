package com.kh.practice.list.music.view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {

	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController(); //Controller 를 필드로 가지고 있고 이거 호출

	public void mainMenu() {
		while (true) {

			System.out.println("=====***** 메인 메뉴 =====*****");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 수정");
			System.out.println("7. 곡 명 오름차순 정렬");
			System.out.println("8. 곡 명 내림차순 정렬");
			System.out.println("9. 종료");
			System.out.println();
			System.out.print("메뉴 번호 입력 : ");

			String menuNum = sc.nextLine();

			switch (menuNum) {
			case "1":
				addList();
			case "2":
				addAtZero();
			case "3":
				printAll();
			case "4":
				searchMusic();
			case "5":
				removeMusic();
			case "6":
				setMusic();
			case "7":
				ascTitle();
			case "8":
				descSinger();
			case "9":
				System.out.println("프로그램 종료");
				break;
			}
			if (menuNum.equals("9")) {
				break;
			}
		}
	}

	public void addList() {
		
			System.out.println("=====***** 마지막 위치에 곡 추가 =====*****");
			System.out.print("곡 명 : ");
			String musicName = sc.nextLine();
			System.out.print("가수 명: ");
			String singerName = sc.nextLine();

			// 곡 명과 가수 명을 사용자에게 입력 받는다.

			// 추가 성공 시 “추가 성공”, 추가 실패 시 “추가 실패” 콘솔창에 출력
			
			mc.addList(new Music(musicName, singerName));
			// MusicController에 addList()를 이미 위에서 선언해서 정보만 넘기면 됨			
//			if() {
//			
//				System.out.println("추가 성공");
//			}else {
//				System.out.println("추가 실패");	
//			}
			
			
			
			
		
	}

	public void addAtZero() {
		System.out.println("=====***** 첫 위치에 곡 추가 =====*****");
		System.out.print("곡 명: ");
		String musicName = sc.nextLine();
		System.out.print("가수 명 : ");
		String singerName = sc.nextLine();
		System.out.println("추가 성공");

		mc.addAtZero(new Music(musicName, singerName));
		// MusicController에 addAtZero()를 이용해서 입력한 정보를 넘기고
		
		// 추가 성공 시 “추가 성공”, 추가 실패 시 “추가 실패” 콘솔 창에 출력
		
	}

	public void printAll() {
		System.out.println("=====***** 전체 곡 목록 출력 =====*****");
		mc.printAll();
		
	}

	public void searchMusic() {

		// searchMusic()의 반환 값에 따라 반환 값이 없으면 “검색한 곡이 없습니다.”
		// 반환 값이 있으면 “검색한 곡은 000(곡 명, 가수 명) 입니다.” 콘솔 창에 출력
		
		System.out.println("=====***** 특정 곡 검색 =====*****");
		System.out.print("검색할 곡 명 : ");
		String musicName = sc.nextLine();
		
		mc.searchMusic(musicName);
		
		
	}

	public void removeMusic() {

		// removeMusic()의 반환 값에 따라 반환 값이 없으면 “ 삭제할 곡이 없습니다.”
		// 반환 값이 있으면 “000(곡 명, 가수 명)을 삭제 했습니다” 콘솔 창에 출력
		
		System.out.println("=====***** 특정 곡 삭제 =====*****");
		System.out.print("삭제할 곡 명: ");
		String musicName = sc.nextLine();
		
		mc.removeMusic(musicName);
		
		

	}

	public void setMusic() {
		// 사용자에게 수정할 곡을 입력 하여 MusicController에 setMusic으로 검색 할 수 있게
		// 값을 넘기며 수정할 곡 명과 가수 명을 받아 setMusic으로 값을 넘긴다.
		// 검색 결과 값이 없으면 “수정할 곡이 없습니다.”, 검색 결과 값이 있고
		// 수정 했으면 “000(곡 명, 가수 명)의 값이 변경 되었습니다.” 콘솔 창에 출력
		
		System.out.println("=====***** 특정 곡 수정 =====*****");
		System.out.print("검색할 곡 명: ");
		String musicName = sc.nextLine();
		System.out.print("수정할 곡 명: ");
		String setName = sc.nextLine();
		System.out.print("수정할 가수 명: ");
		String setSinger = sc.nextLine();
		
		mc.setMusic(musicName, setSinger);
	}

	public void ascTitle() {
		// MusicController에 ascTitle()의 값에 따라 성공 시 “정렬 성공”, 실패 시 “정렬 실패” 
		System.out.println("정렬 성공");
	}

	public void descSinger() {
		// musicController에 descSinger()의 값에 따라 성공 시 “정렬 성공”, 실패 시 “정렬 실패"
		System.out.println("정렬 성공");
	}

}
