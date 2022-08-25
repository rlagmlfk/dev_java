package com.javabasic;

public class Time {
	
	private int hour;
	private int minute;
	private float second;
	
	public int getHour() {return hour;}
	public int getMinute() {return minute;}
	public float getSecond() {return second;}
	
	// hour의 값을 변경하기 위한 메서드
	// , 지정한 값이 0보다 작거나 23보다 크면
	// 즉, 유효한 값이 아니면 변경하지 않고 메서드를 종료
	public void setHour(int h) {
		if(h < 0 || h > 23) return;
		hour = h; // 지정된 값(h)가 유효한 경우에만 hour를 변경
	}
	public void setMinute(int m) {
		if(m < 0 || m > 59) return;
		minute = m;
	}
	public void setSecond(float s) {
		if(s < 0 || s > 59.99f) return;
		second = s;
	}

}

/* 
 * 제어자(private)를 이용해 변수의 값을 직접 변경하지 못하게 하고,
 * 메서드를 통해 값을 변경하도록 작성
 */

