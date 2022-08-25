package com.day17;

public class HomeWork_2 {
	int i = 0;
	int hap = 0;

	public void account() {
		while (i < 100) {
			if (i % 3 == 0) {
				hap = hap + i;
			}
			i++;
			System.out.println(i);
		}

		System.out.println("3의 배수의 합은 ===> " + hap);
	}
	public static void main(String[] args) {
		HomeWork_2 hw = new HomeWork_2();
		hw.account();
	}
}
