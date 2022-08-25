package com.game;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {

	public static void main(String[] args) {
		Random r = new Random();
		int dap = r.nextInt(10);
		Scanner scan = new Scanner(System.in);
		System.out.println("0부터 9까지의 숫자를 입력하시요.");
		String str = null;
		while((str=scan.next()) != null) {
			if(Integer.parseInt(str)==dap){
				System.out.println("마따~");
				break;
			}
			else if(Integer.parseInt(str) > dap) {
				System.out.println("나차라~");
			}
			else if(Integer.parseInt(str) < dap) {
				System.out.println("노피라~");
			}
		}

	}

}
