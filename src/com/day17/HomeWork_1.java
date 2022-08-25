package com.day17;

public class HomeWork_1 {
	int i = 1 ;
	int hap = 0;

	public void acount() {
		for (; i < 101; i++) {
			if (i % 3 == 0) {
				hap = hap + i;
			}
			System.out.println(i);
		}
		System.out.println("3의 배수의 합은 ==> " + hap);
	}

	public static void main(String[] args) {
		HomeWork_1 hp = new HomeWork_1();
		hp.acount();
	}
}