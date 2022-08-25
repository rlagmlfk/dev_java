package com.day9;

public class P38 {
	// Casting 연산자
	// 자동형전환, 강제형전환
	public static void main(String[] args) {
		int i = 10;
		double d = 3.14;
		String s = null;
		boolean isOK = false;
		// i = d; 큰 것을 작은 것에 넣는 것은 불가하다.
		// casting 연산자는 받아주는 쪽의 타입으로 쓴다.
		// 대신 받아주는 쪽의 데이터 범위만 담을 수 있다.

		i = (int)d; // 형전환(casting연산자) 
		d = i; // 괜찮다.
		
		// s = (String)d; -> 불가
		// isOK = (boolean)i; -> 불가
		System.out.println(i); // 3.14 -> 3
		// 어떤 변수 이름에 괄호가 있으면 3가지 중에 하나이다.
		// 1. 메소드 2. 생성자 3. Casting연산자(형전환 연산자)
		
	}

}
