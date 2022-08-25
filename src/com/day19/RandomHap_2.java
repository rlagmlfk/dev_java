package com.day19;

import java.util.Arrays;

public class RandomHap_2 {
	int i = 0;
	int sum = 0;
	int hap = 0;
	int array[] = null;

	public RandomHap_2() {
		array = new int[10];
		NanSu_2();
	}

	public void NanSu_2() {
		for (; i < array.length; i++) {
			array[i] = (int) (Math.random() * 21) - 10;
			if (array[i] < 0) {
				sum += array[i];
			} else if (array[i] > 0) {
				hap += array[i];
			}
		}
		System.out.println("배열 : " + Arrays.toString(array));
		System.out.println("음수합 : " + sum);
		System.out.println("양수합 : " + hap);
	}
}
