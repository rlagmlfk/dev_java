package com.javabasic;

import java.util.Optional;

public class Ex14_0 {

	public static void main(String[] args) {
		// int arr = null; 바람직하지 않음
		int[] arr = new int[0];
		System.out.println("arr.length="+arr.length);
		
		// Optional<String> opt = null; // OK but, 바람직하지 않음
		Optional<String> opt = Optional.empty();
		// Optional<String> opt = Optional.of("abc");
		System.out.println("opt= "+opt);
		// System.out.println("opt= "+opt.get()); // NoSuchElementException 에러남
		
		String str = "";
		try {
			str = opt.get();
		} catch (Exception e) {
			str = ""; // 예외가 발생하면 빈문자열("")로로 초기화
		} // 예외처리 해줘야함
		
		// 아래의 방법이 더 간단
		// str = opt.orElse(""); // Optional에 저장된 값이 null이면 ""반환
		str = opt.orElseGet(()->new String()); // 람다식 변환
		str = opt.orElseGet(String::new); // 메소드 참조로 변환
		System.out.println("str="+str);
		
	}

}
