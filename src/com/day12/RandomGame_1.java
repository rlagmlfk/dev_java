package com.day12;

import java.util.Random;
import java.util.Scanner;

public class RandomGame_1 {
	public static void gameStart() {
		// 임의의 숫자를 채번하는 메소드를 제공하는 클래스 - 0.0~1.0
		Random r = new Random();
		// 게임이 시작되기 전에 0부터 9사이의 임의의 수를 채번하기
		// 사용자가 값을 입력하는 것보다 먼저 채번해야 한다.
		int dap = r.nextInt(10);
		// 사용자가 콘솔화면에 입력한 값을 읽어올 때 - 듣기
		Scanner scan = new Scanner(System.in);
		// 안내메시지 - 유효범위는 0~9 사이이다.
		System.out.println("0부터 9까지의 숫자를 입력하시요."); // 0이상 10미만 사이의 정수를 리턴해준다.
		// 사용자가 입력한 값을 담을 변수 선언
		String str = null;
		// str = scan.next();
		// 사용자가 입력한 값이 null이 아니면 계속 반복하라 - 횟수는 정해지지 않음 -> 정하고 싶을 때 for문
		for(;(str=scan.next()) != null;) {
			// 너가 입력한 값이 채번한 값과 같니?
			if(Integer.parseInt(str)==dap){
				System.out.println("마따~");
				break;
			}
			// if문 조건에 수렴하지 않으면 아래로 온다.
			else if(Integer.parseInt(str) > dap) { // 너무 큰 숫자를 적었다. 낮춰라 - 힌트문 제공. 요구사항. 요구사항 정의서 작성
				System.out.println("나차라~");
			}
			else if(Integer.parseInt(str) < dap) {
				System.out.println("노피라~");
			}
		} // end of while
		System.out.println("while문 탈출하면 여기가 출력된다.");
	} // end of gameStart
	public static void main(String[] args) {
		// 메소드 호출시 구현된 메소드 앞에 static이 있으면 인스턴스화 없이 "클래스 타입.메소드명();" 으로 호출가능
		RandomGame_1.gameStart();
	} //// end of main ////

}
