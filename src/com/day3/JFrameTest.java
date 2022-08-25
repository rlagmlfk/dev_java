package com.day3;

public class JFrameTest {
	//선언부
	
	//화면처리부 - non-static타입의 메소드 선언
	// bc void 앞에 static 부재
	// non-static의 메소드는 메인 메소드 내에서 호출 불가
	
	public void initDisplay()  {
		System.out.println("initDisplay 호출 성공");
	}// end of initDisplay
	//메인메소드 - 실행 가능, exe실행 파일로 만들 수 있음 - 가장 먼저 실행
	//entry point - main thread이다
	// 16-17-18-10-11-12
	public static void main(String[] args) {
		JFrameTest jft = new JFrameTest();
		jft.initDisplay();
		
	}

}// end of JFrameTest
