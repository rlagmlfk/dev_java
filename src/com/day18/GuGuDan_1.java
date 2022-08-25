package com.day18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuGuDan_1 {
	int a;
	int b;
	int i = 1;
	int j;

	public void gugudan() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("첫 단을 입력하세요.");
			a = sc.nextInt();
			System.out.println("끝 단을 입력하세요.");
			b = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("정수만 입력하세요.");
			gugudan();
		}
		if (a < b) {
			for (; i <= 9; i++) {
				for (int j = a; j <= b; j++) {
					System.out.printf("%d X %d = %2d ", j, i, (j * i));
				}
				System.out.println();
			}
		} else {
			for (; i <= 9; i++) {
				for (int j = a; j >= b; j--) {
					System.out.printf("%d X %d = %2d ", j, i, (j * i));
				}
				System.out.println();
			}
		}
	}
}
