package com.day4;

public class Variable_8 {
	// boolean타입의 디폴트 값은 false
	// 변수 선언시 타입 앞에 static을 붙일 수 있다.
	// 인스턴스화 없이도 사용 가능
	// boolean타입은 선택하거나 결정할 때 사용한다 - if, switch
	public static boolean isOK; // 전역변수의 scope를 갖는다 - class 전역에서 사용 가능, public을 붙이면 다른 class에서 사용 가능
	// 파라미터가 없는 디폴트 생성자 구현/선언
	public Variable_8() {
		System.out.println("Variable_8디폴트 생성자 호출 성공");
		isOK = true;
	}
	public static void main(String[] args) {
		System.out.println(isOK); // false 출력
		//stack
		isOK = true;
		System.out.println(Variable_8.isOK);

		
	}

}

// 지역변수는 인스턴스화를 통해서 호출 불가