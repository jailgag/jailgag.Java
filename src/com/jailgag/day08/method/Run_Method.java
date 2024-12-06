package com.jailgag.day08.method;

public class Run_Method {
	
	public static void main(String[] args) {
		Exam_Method em = new Exam_Method();
		em.noReturnNoParam();
		//리턴형 없고 매개변수 없음
		em.noReturnYesParam(20250502); // 빨간줄 나옴..()안에 값넣어주니빨간줄 사라짐.
		//리턴형 없고 매개변수 있음
		//System.out.println(1);
		System.out.println(em.yesReturnNoParam()); //먼저 기본값써주고괄호로 넣고
		//리턴형 있고 매개변수 없음                                           //Sysout적어줌
		
		int result = em.yesReturnYesParam(1000);
		System.out.println(result);
		//리턴형 있고 매개변수 있음
		result = em.sum(1,2,3,4,5);
		System.out.println("result : " + result);
		
	}
}
