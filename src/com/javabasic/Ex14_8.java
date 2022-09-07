package com.javabasic;

import java.util.Optional;
import java.util.OptionalInt;

public class Ex14_8 {

	public static void main(String[] args) {
		Optional<String> optStr = Optional.of("abcde");
		// Optional<Integer> optInt = optStr.map(String::length);
		Optional<Integer> optInt = optStr.map(s->s.length()); // 람다식 변환
		System.out.println("optStr= "+optStr.get());
		System.out.println("optInt= "+optInt.get());

		int result1 = Optional.of("123")
				.filter(x->x.length() > 0) // filter()로 문자열의 length가 0보다 큰지 확인
				.map(Integer::parseInt).get(); // filter() 통과 후 변환 -> 123 값이나옴
		
		int result2 = Optional.of("")
				.filter(x->x.length() > 0) // length가 0보다 큰가? 빈문자열이라 false
				.map(Integer::parseInt).orElse(-1); // null값이 들어와서 null일때 -1반환
		
		System.out.println("result1= "+result1);
		System.out.println("result2= "+result2);
		
		Optional.of("456")
			.map(Integer::parseInt) 
			.ifPresent(x->System.out.printf("result3= %d%n",x)); // optional 값이 있으면 출력
		
		OptionalInt optInt1 = OptionalInt.of(0); // 0을 저장
		OptionalInt optInt2 = OptionalInt.empty(); // 빈 객체를 생성
		
		System.out.println(optInt1.isPresent()); // true
		System.out.println(optInt2.isPresent()); // false
		
		System.out.println(optInt1.getAsInt()); // 0
		// System.out.println(optInt2.getAsInt()); // NoSuchElementException
		System.out.println("optInt1= "+optInt1);
		System.out.println("optInt2= "+optInt2);
		System.out.println("optInt1.equals(optInt2)? "+optInt1.equals(optInt2));
	}

}
