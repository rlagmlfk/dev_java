package com.kh0503;

public class Exam3 {

	public static void main(String[] args) {
		// 원시형 타입은 부르면 값이 나온다.
		// 원시형 타입은 하나만 선언할 수 있다.
		// 참조형 타입은 주소번지가 출력된다.
		boolean isFail = false;
		Exam3 e3 = new Exam3();
		// e3은 참조형 변수라고 한다.
		// 참조형 변수에는 여러개의 변수가 있을 수 있다.
		// 클래스 안에는 여러개의 변수를 선언할 수 있다.
		System.out.println(e3); // 주소번지가 출력
		// 디폴트 생성자 호출
		// uVO를 인스턴스(참조형)변수라 한다.
		// 디폴트 생성자를 호출했을때는 mem_id = null, mem_pw = null, mem_birth = null 초기화
		UserVO uVO = new UserVO(); 
		// mem_id = "banana", mem_pw = "156", mem_birth = "1999-12-25" 초기화
		uVO = new UserVO("banana","156","1999-12-25");
		// System.out.println(uVO.mem_id); -> 불가, 왜냐하면 접근제한자 private이므로 클래스 외부에서 접근 불가
		System.out.println(uVO.getMem_id()); // getter/setter를 통해 public으로 변경후 가능
		System.out.println(uVO.getMem_pw());
		System.out.println(uVO.getMem_birth());
	}

}
