package com.kh.example.pratice5.model.vo;

import java.util.Random;

public class Lotto {
	//static과 final이 동시에 붙어있으면 명시적 초기화 해야함 => 생성자에서는 할 수 X
	private static final double PI = 3.14;
	private static int radius = 1;
	private int[] lotto; //난수들로 6개 초기화
	
	public Lotto(int radius, int[] lotto) { //생성자
		//this.PI = PI;
		this.radius = radius;
		this.lotto = lotto;
	}
	public Lotto() {
		//this.PI = 3.14;
		lotto = new int[6];
		for(int i = 0; i < lotto.length; i++) {
			Math.random();
//			Random rd = new Random;
//			lotto[i] = rd.nextInt(45);
			lotto[i] = new Random().nextInt(45);
 		} //초기화 블럭
		radius = 3;
	 }
	
	
	
	public static int getRadius() {
		return radius;
	}
	public static void setRadius(int radius) {
		Lotto.radius = radius;
	}
	public int[] getLotto() {
		return lotto;
	}
	public void setLotto(int[] lotto) {
		this.lotto = lotto;
	}
	public static double getPi() {
		return PI;
	}
	public void incrementRadius() {
		radius++;
	}
	public void getAreaOfCircle () {
		System.out.println("넓이: " + radius * radius * PI);
	}
	public void getSizeOfCircle() {
		System.out.println("둘레: " + radius*PI*2);
	}
}


