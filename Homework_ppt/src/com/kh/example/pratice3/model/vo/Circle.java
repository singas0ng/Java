package com.kh.example.pratice3.model.vo;

public class Circle {

	private double PI = 3.14;
	private int radius = 1;
	
	public Circle() {
		
	}

	public double getPI() {
		return PI;
	}

	public void setPI(double pI) {
		PI = pI;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
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
