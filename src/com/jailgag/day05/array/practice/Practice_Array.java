package com.jailgag.day05.array.practice;

import java.util.Scanner;

public class Practice_Array {
	public void practice1() {
		/*
		 * 길이가 10인 배열 선언
		 * 1부터 10까지의 값
		 * 반복문을 이용하여 순서대로 배열에 저장
		 */
		int [] arrs;
		arrs = new int[10];
		for(int i = 0; i < 10; i++) {
			arrs[i] = (i+1);
		}
		for(int i= 0; i < 10; i++) {
			System.out.print(arrs[i]+ " ");  //" " <--띄어쓰기??
		}
	}
	public void practice2() {
		/*
		 * 길이가 10인 배열 선언
		 * 10부터 1까지의 값
		 * 반복문을 이용하여 순서대로 배열에 저장
		 */
		int [] arrs = new int[10];
		for(int i = 0, count=10; i < 10; i++,count--) // count 쓰니 거꾸로!!
			arrs[i] = count;
		for(int i = 0; i < 10; i++)
			System.out.print(arrs[i]+ " ");  //" "-->역시 띄어쓰기!!
		// 에러 ??? 다시 써볼것 !!!
	}
	public void practice3() {
		/*
		 * 길이가 5인 String배열 선언
		 * "사과", "귤", "포도", "복숭아", "참외" 순서대로 저장
		 * 그리고 배열 인덱스를 이용해서 귤 출력
		 */
		String fruits [];
		fruits = new String[5];
		fruits[0] = "사과";
		fruits[1] = "귤";
		fruits[2] = "포도";
		fruits[3] = "복숭아";
		fruits[4] = "참외";
		System.out.println(fruits[1]); //귤
		for(int i =0; i < fruits.length; i++)
			System.out.println(fruits[i]+ " ");
	}
	public void practice4() {
		/*
		 * 사용자에게 입력받은 양의 정수만큼 배열 크기를 할당하고
		 * 1부터 입력받은 값까지 배열에 초기화한 후 출력하세요
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		int [] nums = new int[input];
		// 배열에 데이터 저장 (1~ input 까지)
		//??
		for(int i =0; i < input; i++) {
			nums[i] = (i+1);
			System.out.print(nums[i] + " ");
		}
		
	}
	public void practice5() {
		/*
		 * 문자열 : application
		 * 문자 : i
		 * application에 i가 존재하는 위치(인덱스) 4 8
		 * i 개수 : 2
		 */
		
	}
	public void practice6() {
		System.out.println("practice6");
	}
	public void practice7() {
		System.out.println("practice7");
	}
	public void practice8() {
		System.out.println("practice8");
	}
	public void practice9() {
		System.out.println("practice9");
	}
	public void practice10() {
		System.out.println("practice10");
	}
	public void practice11() {
		System.out.println("practice11"
				+ "");
	}
}
