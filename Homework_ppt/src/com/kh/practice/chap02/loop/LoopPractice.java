package com.kh.practice.chap02.loop;

import java.util.*;
import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {

//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num <= 0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i + "");
			}

		}

	}

	public void practice2() {
		// 위 문제와 모든것이 동일하나 1 미만의 숫자가 입력됐다면
		// “1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num <= 0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for (int i = 1; i <= num; i++) {
				System.out.println(i + " ");

			}

		}

	}

	public void practice3() {
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num <= 0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for (int i = num; i < 10 && i > 0; i--) {
				System.out.println(i + "");
			}
		}

	}

}
