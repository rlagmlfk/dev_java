package com.day6;

import javax.swing.JFrame;
import javax.swing.JButton;

public class JButtonTest {

	JFrame jf = new JFrame();
	// 선언과 생성을 나누어 처리하는 경우에는 객체 생성에 대한 시점에 문제가 생길 수 있다.
	// 선언이 먼저, 사용이 나중
	// 선언만 되어있어도 문법 에러는 발생하지 않음
	// 그러나 new예약어를 통해서 실제 클래스가 메모리에 로딩이 안되어 있다면,
	//NullpointerException과 같은 런타임 에러를 만날 수 있음.
	JButton jbtn_north = null;
	JButton jbtn_center = new JButton("중앙");
	// 화면을 그리는 메소드 선언
	public void initDisplay() {
		// 선언부와 생성부를 나누어서 인스턴스화 할 수 있다.
		jbtn_north = new JButton("조회");
		jf.add("North", jbtn_north);
		jf.add("Center", jbtn_center);
		jf.setSize(500, 400);
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		JButtonTest jbt = new JButtonTest();
		jbt.initDisplay();
	}

}
