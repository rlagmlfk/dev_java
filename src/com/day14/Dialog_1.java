package com.day14;

import java.awt.FlowLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class Dialog_1 extends JDialog {
	// 디폴트 생성자는 생략가능 - JVM, 자동으로 가능 언제? Main_1안에 20번에서 인스턴스화를 했을때
	// Dialoh_1 dialog = null; 변수의 선언
	// dialog = new Dialog_1(); loading...중
	// Dialog_1 dialog = new Dialog_1(); 인스턴스화
   public void initDisplay() { // 화면을 그려주는 메소드 구현이다. (Sub창 - 자녀창)
       this.setTitle("메인 서브창");
       this.setSize(300, 400);
       this.setVisible(true);
   }
}
