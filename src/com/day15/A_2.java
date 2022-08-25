package com.day15;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
// ActionListener가 인터페이스이다.
// 이때 추상메소드인 actionPerformed를 오버라이딩해야한다.
public class A_2 extends JFrame implements ActionListener{
	B_2 b = new B_2(); // 초기화와 생성을 한 번에 한 경우이다.
	JButton jbtn_insert = new JButton("입력");
	public void initDisplay() {
		System.out.println("initDisplay 호출 성공");
		this.setLayout(new FlowLayout());
		jbtn_insert.addActionListener(this);
		this.add(jbtn_insert);
		this.setSize(400,500);
		this.setVisible(true);
	} // end of initDisplay
	public static void main(String[] args) {
		// 이것을 '예외처리'라고 한다. try..catch블록을 사용한다.
		// try-> ctrl+space bar - 자동완성 기능 사용하기
		try {
			// 예외가 발생할 가능성이 있는 코드 집어 넣기
			// A_2 a = null; // 타입만 정해졌다.
			A_2 a = new A_2();
			a.initDisplay(); // NullPointException이 발생하면 그 뒤에 어떤 코드도 실행기회를 갖지 못함
		} catch (Exception e) {
			System.out.println("NullPointException 발생함.");
		}
		System.out.println("initDisplay 호출 후...");
	}
	// 아래 메소드는 ActionListener라는 인터페이스에 선언되어 있는 추상메소드
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼을 누르는 건 사용자이지만 느끼는건 JVM이다.
		// JVM이 느낀 버튼의 주소번지를 가져오는 메소드가 있다.
		// 더 큰 타입은 더 작은 방에 대입할 수 없다. 오른쪽이 무조건 작아야한다.
		// 강제형전환
		// String obj = e.getSource(); // 반환타입 -Object
		// NullPointException이 발생하지 않음
		// JVM이 정의하고 있는 객체 중 JVM이 대신 인스턴스화 해주는 클래스가 있다. -> 의존성 주입이다.
		Object obj = e.getSource();
		if(obj == jbtn_insert) { // JVM이 감지한 주소번지와 개발자가 선언한 주소번지가 같니?
			System.out.println("입력버튼 눌렸다.");
			
		}
		
	}
}
