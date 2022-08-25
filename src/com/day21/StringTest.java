package com.day21;

public class StringTest {

	public static void main(String[] args) {
		String s = "이순신";
		s = "Hello World"; // 대입연산자를 통해 문자열 재정의
		System.out.println(s.length()); // 문자열의 길이를 출력한다.
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.substring(0, 3));
		// System.out.println(s.substring(7, 2)); 불가 => 뒤의 숫자가 앞의 숫자보다 작아야 한다.
		s = "java";
		s.replace('j', 'h');
		System.out.println(s); // java or hava => java가 나온다. String은 원본이 바뀌지 않는다.
		// 굳이 바꾸러면 대입연산자로 치환을 해야 한다. -> 비효율적
		// StringBuffer, StringBuilder
		s = s.replace('j', 'h');
		System.out.println(s);
	}

}
