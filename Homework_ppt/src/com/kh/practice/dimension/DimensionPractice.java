package com.kh.practice.dimension;

public class DimensionPractice {

	public void practice1() {
		String[][] arr = { { "(0,0)", "(0,1)", "(0,2)" }, { "(1,0)", "(1,1)", "(1,2)" },
				{ "(2,0)", "(2,1)", "(2,2)" } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}

	public void practice2() {
		// 4행 4열짜리 정수형 배열을 선언 및 할당하고
		// 1) 1 ~ 16까지 값을 차례대로 저장하세요.
		// 2) 저장된 값들을 차례대로 출력하세요.

		int[][] arr = new int[4][4];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = 4 * i + j + 1;
				// 이 공식이 1 2 3 4/5 6 7 8/9 10 11 12 이렇게 나눠줌
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice3() {
		// 4행 4열짜리 정수형 배열을 선언 및 할당하고
		// 1) 16 ~ 1까지 값을 거꾸로 저장하세요.
		// 2) 저장된 값들을 차례대로 출력하세요.

		int[][] arr = new int[4][4];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 4 * (4 - i) - j;
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
			// 안에 for문 한번 끝나면 다음줄로 바꿔서 씀
			// 4행 4열이라 4개까지만 쓰고 다음줄로 넘어감
			// "\t" => 띄워쓰기 , %d => 정수형 출력(printf 출력 서식)
		}
	}

	public void practice4() {
		// 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
		// 아래의 내용처럼 처리하세요.

		int[][] arr = new int[4][4]; 
		arr[0][0] = 6;
		arr[0][1] = 6;
		arr[0][2] = 1;
		
		arr[1][0] = 4;
		arr[1][1] = 10;
		arr[1][2] = 8;
		
		arr[3][0] = 8;
		arr[3][1] = 6;
		arr[3][0] = 5;
		
		int sum03 = 0;
		int sum13 = 0;
		int sum23 = 0;
		int sum30 = 0;
		int sum31 = 0;
		int sum32 = 0;
		int sum33 = 0;
		
			for(int i = 0; i < arr.length - 1; i++) {
				sum03 += arr[0][i]; //sum03 = sum03 + arr[0][]
				arr[0][3] = sum03;
				
				sum13 += arr[1][i];
				arr[1][3] = sum13;
				
				sum23 += arr[2][i];
				arr[2][3] = sum23;
				
				sum13 += arr[1][i];
				arr[1][3] = sum13;
				
				sum30 += arr[i][0];
				arr[3][0] = sum30;
				
				sum31 += arr[i][1];
				arr[3][1] = sum31;
				
				sum32 += arr[i][2];
				arr[3][2] = sum32;
				
				for(int j = 0; j < arr[0].length -1; j++) {
					sum33 += (2 * arr[i][j]);
				}
				arr[3][3] = sum33;
				
			}
			for(int m = 0; m < arr.length; m++) {
				for(int n = 0; n < arr[0].length - 1; n++) {
					System.out.printf("%d\t", arr[m][n]);
				}
				System.out.println();
			}
			

	}

}
