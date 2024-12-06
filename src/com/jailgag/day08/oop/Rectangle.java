package com.jailgag.day08.oop;

import java.util.Scanner;

/*
 * 너비와 높이를 입력받아 사각형의 합을 출력하는 프로그램을 작성하라!!
 * 너비(width)와 높이(heigth) 필드, 그리고 면적값을 제공하는 getArea()
 * 메소드를 가진 Rectangle 클래스를 만들어 활용하기!!
 * 
 * >>4 5 입력 하면
 * 사각형의 면적은 : 20 
 */

public class Rectangle {
	int width;
	int heigth;
	
	public int getArea() {
		return width*heigth;
		
	}
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();   //  <-- Scanner 형식비슷함
		Scanner sc = new Scanner(System.in);
		System.out.print(">> ");
//		rect.width = 4;
//		rect.heigth = 5;       //<--Scanner를 써서 이부분을 밑에것으로 수정해야함!!
		rect.width = sc.nextInt();
		rect.heigth = sc.nextInt();
		
		System.out.println("사각형의 면적은 : " + rect.getArea());
	}
}
