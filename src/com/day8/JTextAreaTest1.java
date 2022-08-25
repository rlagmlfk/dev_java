package com.day8;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JTextAreaTest1 extends JFrame implements ActionListener {
	// JTextField에 오늘 스터디할까 엔터 쳤을 때 JTextField에는 문자열을 지우고 
	// JTextArea에는 방금 입력한 메시지를 출력해 본다.
	JTextField jf_msg = new JTextField();
	
	JTextArea jta_display = new JTextArea();
	
	
	public void initDisplay() {
		jf_msg.addActionListener(this);
		jta_display.setBackground(Color.orange);
		jf_msg.setBackground(Color.LIGHT_GRAY);
		this.add("Center",jta_display);
		this.add("South",jf_msg);
		this.setSize(300,400);
		this.setVisible(true); //false이면 비활성화
		
	}
	public static void main(String[] args) {
		JTextAreaTest1 jtt = new JTextAreaTest1();
		jtt.initDisplay();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == jf_msg) {
			jta_display.append(jf_msg.getText()+"\n");
			jf_msg.setText("");
		}
		
	}

}
