package com.week3;

public class Initialization_7 {
	int count;
	int hap = 0;
	public void acount() {
		for(count=1;count<6;count++) {
			hap = hap+count;
		}
		System.out.println("after count : "+count);
		System.out.println("after hap : "+hap);
		// 만일 이어서 1부터 5까지 다시 세면서 홀수의 합을 구하라고 한다면?
		// 초기화는 어디에? 그리고 얼마로 해야할까?
	count = 1;
	  hap = 0;
	  for(;count<6;count++) {
		  if(count%2==1)
			  hap = hap+count;
	  }
	  System.out.println("홀수의 합은 : "+hap);
	}
	public static void main(String[] args) {
		Initialization_7 i3 = new Initialization_7();
		i3.acount();
	}
}
