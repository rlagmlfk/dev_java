package com.day4;

public class Variable_1_2 {
	// 전역변수 age선언 및 초기화(초기값은 20)
	int age = 20; // 전역변수는 인스턴스화가 실행되고 나면 그 다음에 heap메모리 안에 class안에 초기화가 됨
	// 사용자 정의 메소드 선언 - 파라미터는 없어도 합법, 있어도 합법
	void methodA() {
		// 5번 라인의 전역변수 20에서 30으로 재정의함
		// 아래 코드에서 int를 붙이면 지역변수가 되고 int를 붙이지 않으면
		// 전역변수에서 저장한 값 20이 30으로 덮어쓰기 됨
		age = 30;
	} // end of methodA
	// 14-15-16-5-18-19-7-11-12-21-22-23-끝
	public static void main(String[] args) { 
		// 아래 코드가 메모리에 로딩되면 5번 라인에 age변수도 생성되고 20으로 초기화됨
		Variable_1_2 v1 = new Variable_1_2(); // 여기서 v1은 지역변수
		// 아래 v1.age.는 20이 출력됨 그러나 7번 메소드를 경유하면 11에서 30으로 변경됨
		System.out.println("before : "+v1.age); // 20이 출력
		v1.methodA(); // 이 메소드를 경유하면 age가 30으로 변경됨
		// 아래 코드에서는 30이 출력
		System.out.println("after : "+v1.age);		
	} //end of main
} // end of Variable_1_2
