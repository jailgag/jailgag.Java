package com.jailgag.day08.method;

public class Exam_Method {
	/*
	 * 리턴형 o,x 
	 * 매개변수 0,x
	 * 
	 * 리턴형 x, 매개변수x
	 * 리턴형 x, 매개변수o
	 * 리턴형 o, 매개변수x
	 * 리턴형 o, 매개변수0
	 */
	public void noReturnNoParam() {
		System.out.println("noReturnNoParam"); 
		return;
	}
	public void noReturnYesParam(int num) {
		//int num = 20250502; <--타입이 안맞는 에러?
		System.out.println("num : " +num);
		return;
	}
	
	public int yesReturnNoParam() { //<--오타에러....
		int date = 20241224;
		return date;
	}
	
	public int yesReturnYesParam(int num) {
		num += 10;
		return num;
	}
	
	//리턴형 있고 매개변수 있음
	public int sum(int ...numbers) {
		int sum = 0;
			for(int num: numbers) {
				sum += num;
			}
			return sum;
	}
	
}
