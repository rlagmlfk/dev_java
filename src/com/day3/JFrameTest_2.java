package com.day3;

import javax.swing.JFrame;

public class JFrameTest_2 {
	//선언부
	JFrame jf = new JFrame();
	int width = 600;
	public void initDisplay()  {
		System.out.println("initDisplay 호출 성공");
		jf.setSize(500,400);
		jf.setSize(width,400);
		jf.setLayout(null);
		jf.setVisible(true);
		
	}// end of initDisplay
	
	public static void main(String[] args) {
		JFrameTest_2 jft = new JFrameTest_2();
		jft.initDisplay();
	}

}// end of JFrameTest
 // non-static의 jf는 메인메소드에서 사용불가,bc 메인 메소드에는 static이 붙어있기때문