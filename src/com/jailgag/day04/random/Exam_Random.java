package com.jailgag.day04.random;

import java.util.Random;
import java.util.Scanner;

public class Exam_Random {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random rand = new Random();
		//Random.nextInt(n)
		//n 을 넘겨주면 rand.nextInt(n)의 결과값은 0~ n-1 사이의 램덤한 수를 리턴함
		//for(int i =0; i < 50; i++) 
		//	System.out.println(rand.nextInt(10)+ " ");
		//0~9 사이의 램덤한 수를 출력하는 프로그램을 작성하여라
		//1~10 사이의 랜덤한 수를 출력하는 프로그램을 적성하여라
	   //	for(int i =0; i < 50; i++) 
	 //System.out.print(rand.nextInt(10)+10)+ " ");
		//0 ~n-1 + a
		//25~35사이의 램덤한 수를 출력하는 프로그램을 작성하여라
	//	for(int i = 0; i < 50; i++) {
//
//		System.out.println((rand.nextInt(11)+25)+ " ");
		// Math.random()*(최대-최소+1)+최소
		//1~ 10 사이의 난수
		// Math.random()*(10-1+1)+1
		System.out.println((Math.random()*10)+1);
		//정신없이 쓰다보니 에러 나서 대괄호 문제점...
		
		}

	}	

