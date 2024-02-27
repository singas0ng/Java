package com.kh.hw.shape.controller;

import java.util.Scanner;
import com.kh.hw.shape.model.vo.Shape;

public class SquareController {
	
	private Shape s = new Shape();
	
	public double calcPerimeter(double height, double width) { //return type: double
		double result = 0.0;
		//TODO 1. result = ...; //일단 먼저 return 으로 double 형태로 적어놔야 오류 사라짐
		//TODO 2. 생성자..?
		result = height*2 + width*2;
		return result;
	}
	public double calcArea(double height, double width) { //return type: double
		double result = 0.0;
		//TODO 1. result = ...; //일단 먼저 return 으로 double 형태로 적어놔야 오류 사라짐
		//TODO 2. 생성자..?
		s.setHeight(height);
		s.setWidth(width);
		result = height * width;
		return result;
	}
	public void paintColor(String color) { //메개인자 String, return type: void
		s.setColor(color);
	}
	public String print() { //String 모양으로 return
		String result = "";
		result ="사각형" + s.information();
		return result;
	}
	
}

//s: Shape = new Shape => shape 이라는 참조자료형 쓰임
