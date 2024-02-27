package com.kh.hw.shape.model.vo;

public class Shape {

	private int type;
	private double height;
	private double width;
	private String color = "white";

	public Shape() {
		super();
	}

	public Shape(int type, double height, double width) { //생성자
		super();
		this.type = type;
		this.height = height;
		this.width = width;
	}

	//@Override
	public String information() {
		//TODO : type 을 빼라는건가?
		return " " + "height" + " " + " width"+ " " + color + " "; //필드 이름

	}

	public int getType() { //type 을 불러와서 리턴까지 해줌
		return type;
	}

	public void setType(int type) { //void 이기 때문에 return 생략
		this.type = type;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
