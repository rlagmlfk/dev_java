package com.kh0503;

import java.util.Scanner;

public class Test {
	// if(str=="exit")를 쓰려면, String exit = "exit"를 선언해야한다.
	// public Test() {} 생략이 가능함 - 단, 생성자가 하나도 선언된게 없을 때만 가능
	public void count() {
		Scanner sc = new Scanner(System.in); //UI(User Interface:View계층) 없이도
		while(true) { // 끊임없이 실행 - 메모리(ram:휘발성-오라클-table구조:MemberVO)에 계속 쌓인다.
			System.out.print("문자열을 입력해 주세요 : "); //Hint
			String str = sc.nextLine(); //nextLine의 리턴타입이 void라면 대입연산자를 써서 받을 수 없다. - 메소드의 재사용성
			if(str.equals("exit")) { //사용자가 도스창에 exit이라는 문자열을 입력하면 equals를 써야한다. 
				break; // while문을 탈출한다. 19번 라인으로 이동한다.
			}else {
				System.out.println(str.length() + "글자 입니다.");
			}
		}///// end of while
		System.out.println("프로그램을 종료합니다."); // while문 안에 break문은 무한루프를 방지하는 코드이다.
	}///////// end of count
/* JVM 실행 순서
 * 25-26[인스턴스화]-27[메소드 호출]-7-8[사용자가 콘솔에 입력한 값 입력받기]-9[while:반복문, 괄호안이 false이면 실행불가]
 * 10-11[입력문자 저장됨]-12[입력문자가 exit과 같은 문자열인지 비교]-13[12번 조건이 참이면 실행됨:break호출하면 while문 탈출함]	
 * 14[사용자가 입력한 문자열이 exit이 아닐때 실행됨]-15-17-18
 */
	public static void main(String[] args) {
		Test t = new Test();//디폴트 생성자 호출이 동시에 일어남 - 생략 가능
		t.count();
	}

}

// while문 다음에 괄호 안에는 boolean 타입이 온다.
// while문 좌중괄호 우중괄호 안에 있는 코드를 실행문이라고 한다.
// 이 실행문은 괄호 안에 true일때만 실행된다.
// 괄호 안에 false이면 실행문은 한 번도 실행기회를 갖지 못한다.

// do{...}while(3<5); 무조건 한 번은 실행된다. 숫자야구: 356 579 0스트라이크 1볼(세 자리 수 중에 같은 숫자가 1개는 있다)

