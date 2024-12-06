package com.jailgag.day08.oop;

public class Circle {
	final double PI = 3.14;
	double radius;
	
	public double getArea() {
		return PI*radius*radius;
	}
	public static void main(String[] args) {
		Circle pizza = new Circle();
		pizza.radius =10;
		System.out.println(pizza.getArea());  //복습!더!! pizza.getArea()
                                              //적고 ()감싸주고 Sysout!! 	
		Circle donut = new Circle();  // <-- Scanner 쓸때 형식비슷함
		donut.radius =2;
		System.out.println(donut.getArea());
	}
	
}
