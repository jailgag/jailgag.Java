package com.jailgag.day02.control.condition.exercise;

import java.util.Scanner;

public class Exercise_If3 {
	public static void main(String[] args) {
		/*
		 * 문제3
		 * 점수를 입력받아 등급을 알려주는 프로그램을 작성하세요.
		 * 단, 점수는 0 ~ 100 사이의 수를 입력하도록 함.
		 * 점수를 입력해주세요 : 92
		 * 학점은 A입니다.
		 * 
		 * 점수를 입력해주세요 : 102
		 * 0 ~ 100 사이의 수를 입력해주세요
		 * 커트라인 ( 90 ~ 100 : A, 89 ~ 80 : B, 79 ~ 70 : C, 69 ~ 60 : D, 그 외 F )
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해주세요 :");
		int score =sc.nextInt();
		if(score >=90 && score <= 100) {
			System.out.println("학점은 A입니다");
		}else if(score <=89 && score >= 80) {
			System.out.println("학점은 B입니다");
		}else if(score <= 79 && score >=70) {
			System.out.println("학점은 C입니다");
		}
	}

}
