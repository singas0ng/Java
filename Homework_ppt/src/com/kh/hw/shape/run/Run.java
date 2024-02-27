package com.kh.hw.shape.run;

import com.kh.hw.shape.view.ShapeMenu;

public class Run {

	public static void main(String[] args) {
//		ShapeMenu sm = new ShapeMenu(); //라는 객체를 만들고
//		sm.inputMenu();
		//이 위를 아래처럼 쓸 수 있음
		new ShapeMenu().inputMenu();
	}
}
