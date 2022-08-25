package com.basic;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char ch = ' ';
		
		System.out.println("문자를 하나 입력하세요.>");
		
		String input = scan.nextLine();
		ch = input.charAt(0);
		
		if('0' <= ch && ch <= '9') {
			System.out.printf("입력하신 문자는 숫자입니다.%n");
		}
		if('a' <= ch && ch<='z') {
			System.out.printf("입력하신 문자는 영문자입니다.%n");
		}
	}

}
