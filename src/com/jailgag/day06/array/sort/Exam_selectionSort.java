package com.jailgag.day06.array.sort;

public class Exam_selectionSort {
	/*
	 * 선택정렬이란?
	 * 인접합 두개의 원소를 검사하여 정렬하는 방법
	 * 구현이 쉽다는 장점, 이미 정렬된 데이터를 정렬할때 가장빠름.
	 * 기본적으로 다른 정렬에 비해서 속도가 느린편이며 역순으로 된 데이터를 정렬할때 가장 느림
	 * 
	 * 개인적으로 연습할때 괄호 주의!!
	 */
	
	public static void main(String[] args) {
		int [] arrs = {2, 5, 4, 1, 3};
		int min =0;
		for(int j = 1; j < arrs.length; j++) {
			if(arrs[0] > arrs[j]) {
				min =j;
			}
		}
		int temp = arrs[0];         // 출력값 1 4 5 2 3   *** 다쓰면 노트에다가 적어서
		arrs[0] = arrs[min];        // 이해 해볼것!!!
		arrs[min] = temp;
			
		for(int j = 2; j < arrs.length; j++) {
			if(arrs[1] > arrs[j]) {
				min =j;
			}
		}
		temp = arrs[1];         // 복붙하면  j = 2 로 바꿈 int temp 에서 int 삭제
		arrs[1] = arrs[min];
		arrs[min] = temp;             // 출력값2 : 1 5 4 1 3
		for(int num: arrs) {          // 다음에 (사진참조) 0 값을 1로 바꿈 출력값 1 3 4 2 5 
				System.out.print(num  + " ");
			
			
		}
//	if(arrs[0] > arrs[1]) {
//		//인덱스 값을 기억
//		min =1;
//	}
//	if(arrs[0] > arrs[2]) {
//		min = 2;
//	}
//	if(arrs[0] > arrs[3]) {
//		min = 3;
//	}
//	if(arrs[0] > arrs[4]) {
//		min = 4;
//	}
	}
}

