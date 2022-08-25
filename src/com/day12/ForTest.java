package com.day12;

public class ForTest {

	public static void main(String[] args) {
		// for(초기화;조건식;증감연산자) {
		int hap = 0;
		for(int i=0;i<5;i=i+1) {
			if(i%2==0) {
				hap = hap+i;
			}
			System.out.println(i);
		}
		// System.out.println(i); -> i는 지역변수라 for문 내에서만 가능
		System.out.println("1부터 5까지의 합은 "+ hap);
		}

	}
