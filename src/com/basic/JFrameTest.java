package com.basic;

public class JFrameTest {
	// 선언부
	
	// 화면 그리기 - non static의 메소드이다.
	public void initDisplay() {
		// insert here
	}
	public static void methodA() {
	System.out.println("methodA 호출 성공");
	}
	
	// 메인 메소드 - static메소드이다.
	// 메소드 선언시 static이 있을 때와 없을 때가 다르다.
	public static void main(String[] args) {
		// 인스턴스화를 통해서 선언된 변수명을 인스턴스 변수라고 한다.
		JFrameTest jft = new JFrameTest();
		//내 안에 있는(선언된) 메소드라 하더라도 static영역 안에서 non-static메소드를 호출 불가
		//본래 내 안에 선언된 메소드는 내 안에서는 호출 가능
		jft.initDisplay();
		//static이 붙은 메소드는 인스턴스화 없이도 사용이 가능함
		methodA();	
	}

} //end of JFrameTest

// static 영역 안에서 non-static 타입의 변수나 메소드를 호출할 수 없다
// 선언부에 선언된 변수나 메소드는 본래 클래스 내부에서는 언제든 어느 위치에서든 호출 가능 but 위의 경우는 예외
// 문제해결 방법 :  non-static 타입의 변수나 메소드를 사용할 떄는 인스턴스 화를 하면 접근 가능