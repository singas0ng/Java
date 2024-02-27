package com.kh.example.pratice5.run;

import com.kh.example.pratice5.model.vo.Lotto;

public class Run {

	public static void main (String[] args) {
		
		Lotto L1= new Lotto(); //circle type 객체 생성
		L1.getAreaOfCircle(); //원의 넓이 값 호출
		L1.getSizeOfCircle();  //원의 둘레 값 호출
		L1.incrementRadius();
		L1.getAreaOfCircle();
		L1.getSizeOfCircle();
	}
}
