package com.jailgag.day04.recap;

import java.util.Scanner;

public class StuentApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//무한반복을 하기위한 반복문
		//1 for(;;) {}
		//2.  while(true) {}
		int kor =0;           // 괄호 실수 있으니 오류....
		int eng =0;           // 다시 코딩 해볼것!!!!연습!!
		int math =0;
		while(true) {
			System.out.println("===== 메인 메뉴 =====");
			System.out.println("1 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.print("선택 >> ");
			int choice = sc.nextInt();
			//switch ~case
			switch(choice) {
			case 1: 
				System.out.println("===== 성적 입력=====");
				System.out.print("국어 :");
				kor = sc.nextInt();
				System.out.print("영어 :");
				eng = sc.nextInt();
				System.out.print("수학");
				math = sc.nextInt();
				break;
			case 2:
				System.out.println("=====성적 출력====="); 
				System.out.println("국어 :  "+ kor);
				System.out.println("영어 :" + eng);
				System.out.println("수학 :" + math);
				System.out.println("총점 :" + (kor+eng+math));
				System.out.println("평균: " + (kor+eng+math)/(double)3);
				break;
			case 3: 
				System.out.println("=====프로그램이 종료 되었습니다");
				return;
			
		}
	}
}
}


			
		
