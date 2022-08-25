package com.day9;
// 변수가 몇 개 필요하니? - 3개
// 변수 위치는?

public class Shuffle_4 {
	public boolean methodA(int i, int j) {
		int imsi; // 지역변수는 초기화를 반드시 해야한다.
		imsi = i;
		i = j;
		j = imsi;
		System.out.println(i+", "+j);
		return true; // shuffle이 성공하면 true, 실패하면 false
	}
	public void	methodB() {}
	public static void main(String[] args) {
		Shuffle_4 s4 = new Shuffle_4();
		boolean isOK = s4.methodA(3, 6);
		if(isOK) {
			System.out.println("참 잘했어요^^");
		}
		s4.methodB();
	}

}
