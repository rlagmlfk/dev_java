package com.basic;
// ctrl+s 누르면 저장과 동시에 javac Hello.java => Hello.class
//java Hello 엔터
//public(예약어)은 접근 제한자라고 한다.->변수명으로 사용불가
//public > protected > friendly > private
//class는 클래스 선언시 사용하는 예약어
public class Hello {
	//선언부 - 변수 선언 및 초기화를 할 수 있다.
	//변수와 메소드를 선언할 수 있다.
	//변수 선언을 통해서 데이터를 담을 수 있다.
	//변수타입 변수명 대입연산자 값

// 여기는 클래스 영역입니다.
// 클래스 안에는 변수와 메소드가 살고 있습니다.
// 변수에는 데이터(숫자, 문자열, 참 또는 거짓)를 담는다.
	//메인 메소드가 있어야 exe파일(실행 파일)로 만들 수 있습니다.
	//코드가 많아도 가장 먼저 실행되는 곳이 main method이다.
	//메인 메소드가 entry point이다 - 제일 먼저 실행된다.
	//메인 스레드 이다.
	//메소드와 변수 구분 - 어떤 이름 뒤에 괄호가 있으면 메소드이다.
	//static영역에서는 non-static변수나 메소드는 사용이 불가하다.
	public static void main(String[] args) {
		// System이 가리키는 것은 내가 사용중인 PC이다.
		// out변수는 출력장치를 의미
		// printin은 메소드 이다 - 출력 기능 담당 메소드
		// where? - 콘솔창에 출력
		// 출력을 해야 소통이 가능
		System.out.println("Hello World");	
	}// end of main method - 기능, 처리, event

} // end of Hello class 사용자 정의 클래스 선언 및 구현이 끝나는 것
