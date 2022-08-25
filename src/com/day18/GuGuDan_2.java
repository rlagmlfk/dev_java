package com.day18;

import java.util.Scanner;

public class GuGuDan_2 {
	int t;
	int f;
	int i = 1;
	int j = 1;
	
	public void gugudan_2() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("첫 단을 입력하세요");
		t = scan.nextInt();
		System.out.println("끝 단을 입력하세요");
		f = scan.nextInt();
		if(t<f) {
		while(i<=9) {
			System.out.println(t+"X"+i+"="+(t*i));
			i++;
			while(j<=9) {
				System.out.println(f+"X"+j+"="+(f*j));
				j++;
			}j=1;
		}
		}
		}
		}