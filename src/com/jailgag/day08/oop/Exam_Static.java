package com.jailgag.day08.oop;

import java.util.Random;

class StaticSample {
	public int num;
	public void normalMethod() {}
	
	public static int input;
	public static void staticMethod() {}
}

public class Exam_Static {
	public static void main(String[] args) {
		StaticSample sample = new StaticSample();
		sample.num = 11;
		sample.normalMethod();
		
		StaticSample.input = 10;
		StaticSample.staticMethod();  //<---빨간줄 생김...다시작성
									//콘트롤시프트해서 사라짐!! 다시코딩해볼것!! 
								
		Random rand = new Random();  
		rand.nextInt(10);
		
		int num =(int)Math.random()*10+1;
	}
}
