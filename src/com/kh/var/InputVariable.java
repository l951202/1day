package com.kh.var;

import java.util.Scanner;

public class InputVariable {
	// 기능 제공용 클래스
	
	
	// Java1.5버전 이후부터는 키보드의 입력값을 위보다 쉽게 
	// 처리하게 되었다.
	public void inputMethod2( ) {
		// System.im : 키보드 (입력자원)
		// Sustem.out : 모니터 (출력자원)
		// System.err : 표준 에러 출력 
		
		//Scanner : 각각의 자료형 별로
		//			키보드의 입력값을 처리해주는 객체
	 
		Scanner sc = new Scanner(System.in);
		// 키보드 입력을 위한 변수 공간 선언
		String name; // 이름
		int point;		//점수
		double avg;		//평균
		
		// 화면에 값을 입력 받기 위한 안내 메시지 출력하기
		System.out.print("이름을 입력하세요:");
		name = sc.nextLine();
		
		System.out.print("점수를 입력하세요:");
		point = sc.nextInt();
		
		System.out.print("편균을 입력하세요:");
		avg = sc.nextDouble();
		
		// 키보드로 입력한 내용 출력하기
		System.out.println("이름:"+ name);
		System.out.println("점수:" + point);
		System.out.println("평균:" + avg);
	}
	public void myInputMethod() {
		//기본 자료형 3거지 이상을 사용하여
		//도서 정보를 입력받는 프로그램 만들어 보기
		//단,Scanner 를 사용하며,
		//변수의 이름은 aaa,bbb(x)
		//그럴듯하게 직접 지어 사용하세요!
		Scanner sc = new Scanner(System.in);
		String name;
		int page;
		double dc;
		
		System.out.print("제목");
		name = sc.nextLine();
		System.out.print("페이지 ");
		page = sc. nextInt();
		System.out.print("할인률");
		dc = sc. nextDouble();
		System.out.println("제목" +name);
		System.out.println("페이지" +page);
		System.out.println("할인률" +dc);
		
		
		
	}
}
