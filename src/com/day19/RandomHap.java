package com.day19;

import java.util.Arrays;
import java.util.Random;

public class RandomHap {
	
	public void NanSu() {
		int sum = 0;
		int hap = 0;
		int score[] = new int[10];
		Random r = new Random();
		for (int i = 0; i < score.length; i++) {
			score[i] = r.nextInt(21) - 10;
			if (score[i] < 0) {
				sum += score[i];
			} else if (score[i] > 0) {
				hap += score[i];
			}
		}
		System.out.println("배열 : " + Arrays.toString(score));
		System.out.println("음수합 : " + sum);
		System.out.println("양수합 : " + hap);
	}
}