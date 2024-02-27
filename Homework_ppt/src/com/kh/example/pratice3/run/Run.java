package com.kh.example.pratice3.run;

import com.kh.example.pratice3.model.vo.Circle;

public class Run {

	public static void method(String [] args) {
	
		
		Circle c1= new Circle(); //circle type 객체 생성
		c1.getAreaOfCircle(); //원의 넓이 값 호출
		c1.getSizeOfCircle();  //원의 둘레 값 호출
		c1.incrementRadius();
		c1.getAreaOfCircle();
		c1.getSizeOfCircle();
		
	}

}
