package com.day4;

public class Variable_1 {
	// 선언부 - 전역변수 - global variable, member variable (다른 class에서도 사용가능-값이 출력)
	// 변수 type을 맞춰야 한다.
	int age = 20;
	// double: 실수 type선언
	double pi = 3.14;
	
	void methodA() {
		// 지역 변수 - class외부에서는 사용 불가<->전역변수(class외부에서도 사용 가능)
		age = 30; //원본을 30으로 덮어씌운다.(오버로드)
	}
	public static void main(String[] args) { //break point 찍기
		// 인스턴스화 - 메모리에 로딩, 상주
		// 인스턴스화를 하면 변수와 메소드를 할 수 있다.
		Variable_1 v1 = new Variable_1(); 
		// 메소드를 호출할 때는 ; 을 붙인다.
		// 메소드를 구현할 땐, {} 좌중괄호와 우중괄호 영역 표시
		// 그 때 그 안에 선언된 변수를 '지역변수'라고 한다.
		System.out.println("before : "+v1.age); //(;세미콜론 JVM)
		v1.methodA(); // 호출
		System.out.println("after : "+v1.age);		
	} //end of main - 북마크
}
