package com.day14;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import java.util.List;
// 자동차는 소나타이다. 소나타는 자동차이다. 소나타 is a 자동차 - 상속
// JFrame이 부모, Main_1이 아들
public class Main_1 extends JFrame implements ActionListener{
   // 메인화면에 사용할 컴포넌트들을 선언합니다.
    private JButton btnInsert = new JButton("입력");
    private JButton btnUpdate = new JButton("수정");
    private JButton btnDelete = new JButton("삭제");
    private JButton btnSelect = new JButton("조회");
    private JButton btnDetail = new JButton("상세보기");
    Dialog_1 dialog = null;
   public void initDisplay() {
      dialog = new Dialog_1();
       // 창의 x버튼을 눌렀을 때 열린 화면에 자원을 회수
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // JFrame은 디폴트 레이아웃이 BorderLayout인데 내가 굳이 일부러 FlowLayout 변경 설정합니다.
       // FlowLayout은 디폴트가 왼쪽에서 오른쪽으로 배치가 되는 레이아웃을 담당하는 클래스입니다.
       this.setLayout(new FlowLayout());
       // 입력 버튼이 눌려졌을 때 JVM이 감지하고 이벤트 처리 메소드를 호출해주는 역할
       // 아래 코드가 없으면 버튼을 눌렀는지 감지못함 -> 딱 한번만 호출되어야 한다.
       btnInsert.addActionListener(this);
       // this: Main_1. super: JFrame
       // 내(Main_1) 안에서 add, setTitle, setSize, setVisible 메소드를 선언 및 구현한 적이 없다.
       this.add(btnInsert); // 부모가 제공하는 메소드를 호출한다.
       this.add(btnUpdate);
       this.add(btnDelete);
       this.add(btnSelect);
       this.add(btnDetail);
       this.setTitle("메인 Ver1.0");
       this.setSize(700, 500);
       this.setVisible(true);
   }
/* 44 - 45(인스턴스화: 디폴트 생성자[파라미터가 없는 생성자]호출)-생성자가 정의되지 않았다.->JVM이 제공함
*  46 - 20-21(인스턴스화-Dialog_1) - 32-39:화면그리기(UserInterface) - 
*/
   public static void main(String[] args) {
      Main_1 abook = new Main_1();
      abook.initDisplay();
   }
   @Override
   public void actionPerformed(ActionEvent e) {
      Object obj = e.getSource();
      if(btnInsert == obj) {
         dialog.initDisplay();
      }
   }
}

