package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public void practice2() {

		int[] arr = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public void practice3() {
		// 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		// 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		// ex. 양의 정수 : 5
		// 1 2 3 4 5

		System.out.print("양의 정수 : ");
		int num = sc.nextInt();

		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");

		}

	}
	
	public void practice4() {
		String[] fruit = new String[]{"사과", "귤", "포도", "참외"};
		
		System.out.println(fruit[1]);
	}
	
	public void practice6() {
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
	
		
		String[] arr = new String[]{"월", "화", "수", "목", "금", "토", "일"};
				
		
			if(num < 6 && num >= 0) {
				System.out.println(arr[num]);
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		
		
	}

}
