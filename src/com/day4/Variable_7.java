package com.day4;

public class Variable_7 {
	void methodA( ) {
		
	}
	/*************************************************************
	 * 
	 * @return
	 *************************************************************/
	int methodB() {
		int x = 5;
		int y;
		y = x;
		return y;
	
		// 지역변수는 초기화를 해야한다.
		// return 0; // 리턴에는 값이 오거나 변수가 올 수 있다.
	}
	public static void main(String[] args) {
		Variable_7 v7 = new Variable_7();
		int x;
		v7.methodA();
		x = v7.methodB();
		x = x + 2;
		System.out.println(x);
	}

}
