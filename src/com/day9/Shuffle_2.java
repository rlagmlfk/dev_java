package com.day9;
// 변수가 몇 개 필요하니? - 3개
// 변수 위치는?

public class Shuffle_2 {
	int i = 45;
	int j = 21;
	int imsi = 0;
	public Shuffle_2() {

		imsi = i;
		i = j;
		j = imsi;
		System.out.println(i+", "+j);
	}
	public static void main(String[] args) {
		Shuffle_2 s1 = new Shuffle_2();

	}

}
