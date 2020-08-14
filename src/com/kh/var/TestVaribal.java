package com.kh.var;

public class TestVaribal {
	
	public void method1() {
		System.out.println(2500000);
		
		int sal = 2500000;
		System.out.println(sal);
//		System.out.println();
	}
	
	public void method2() {
	  //변수 선언하기
	  //1. 변수 선언(회원정보)
	  String name;//이름- String (문자열)
	  String num;//전화 번호- String(문자열)
	  String id;//아이디- String(문자열)
	  String pw;//비밀번호- String(문자열)
	  char gender;//성별- char (문자 하나)
	  double hei;//신장(키)- double (실수의 기본)
	  double wei;//몸무게- double
	  int age;//나이- int (정수 형)
	  boolean mrg;//결혼여부- boolean ( 참 ,거짓)
	  
	  // 선언한 변수에 값 대입하기(넣기)
	  name ="박재현";
	  num = "0102589****";
	  id = "angeloutus";
	  pw = "angeloutus123";
	  gender = 'M';
	  hei = 183.3;
	  wei = 83.3;
	  age = 25;
	  mrg = false;
	  
	  // 변수 안의 값 확인하기
	  System.out.println(name);
	  System.out.println(num);
	  System.out.println(id);
	  System.out.println(pw);
	  System.out.println(gender);
	  System.out.println(wei);
	  System.out.println(age);
	  System.out.println(mrg);
	  
	  
  }
}
