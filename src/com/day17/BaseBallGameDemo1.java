package com.day17;

public class BaseBallGameDemo1 {
	// 사용자가 입력한 숫자를 받는 코드
	public int userInput(String input) {
		int my = 0;
		// 예외가 발생할 가능성이 있는 코드
		// 예외처리를 다중으로 할 때 반드시 상위 클래스가 가장 뒤에 와야 함
		try {
			my = Integer.parseInt(input);
		}catch (NumberFormatException e) {
			System.out.println("제발 숫자만 입력하세요.");
		}
		catch (Exception ex) {
			System.out.println(ex.toString());
		}
		// 설령 문제가 발생되더라도 여기까지 진행됩니다.
		// 이것이 예외처리하는 이유
		// 예외가 발생하더라도 프로그램이 중지하지 않고 다음으로 이동가능
		System.out.println("요기");
		return my;
	}
	
	public static void main(String[] args) {
		BaseBallGameDemo1 bbg = new BaseBallGameDemo1();
		int result = bbg.userInput("안녕");
		System.out.println("사용자가 입력한 값은 "+result);
	}

}
