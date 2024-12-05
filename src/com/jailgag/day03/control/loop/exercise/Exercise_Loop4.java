package com.jailgag.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop4 {
	/*
	 * 문제4
	 * 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
	 * 만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
	 * 첫번째 입력 : 2
	 * 두번째 입력 : 10
	 * 출력 : 2 3 4 5 6 7 8 9 10
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 입력 : ");
		int num1 =sc.nextInt();
		System.out.print("두번째 입력 : ");
		int num2 = sc.nextInt();
		if(num1 < 1 ||  num2 <1) {
			System.out.println("1이상의 숫자를 입력해주세요를 출력하세요.");
		}else {
			//실행문장 
			// num1: 2, num2: 10
			//1. num2가 더 크면
			for(int i = num1; i <= num2; i++) {
				System.out.println(i + " ");
			}
		}
	}
}