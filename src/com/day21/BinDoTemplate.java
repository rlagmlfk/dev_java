package com.day21;

/*
*
도전 문제
0 부터 9사이의 임의의 수를 100개를 채번하여 한 줄에 10개씩
출력하고 그 숫자의 빈도수를 계산하여 출력하시오

원본 : 4  4  1  2  5  7  9  6  0  6
	  5  0  1  2  1  7  0  9  4  8
	  8  6  0  1  0  1  6  1  0  2
	  8  3  3  4  0  2  4  6  2  4
	  9  9  2  4  4  2  2  2  3  3
	  7  9  4  3  2  2  3  4  8  7
	  4  6  3  8  2  0  2  0  2  2
	  5  2  7  0  0  6  8  3  7  6
	  6  9  0  9  6  3  1  9  6  3
	  1  4  6  3  2  6  7  1  7  6
	
숫자:  0  1  2  3  4  5  6  7  8  9
개수: 12  9 17 11 12  3 14  8  6  8
* 
*/
public class BinDoTemplate {
	public BinDoTemplate() {
		int nanSus[] = new int[100];
		int pCount[] = new int[10]; // 카운트 값을 담는다.
		initArray(nanSus, nanSus.length);
		numberCount(nanSus, nanSus.length, pCount);
		print10PerLine(nanSus, nanSus.length);
		printResult(pCount, 10);
	}

	// 배열의 초기화
	void initArray(int nanSus[], int size) {
		// System.out.println(nanSus+","+size);
		for (int i = 0; i < nanSus.length; i++) {
			// 0.0 ~ 10.0 실수 채번한다 0.0 포함, 10.0은 미포함
			nanSus[i] = (int) (Math.random() * 10);
		}

	}

	// 빈도 검사 nanSus에 들어 있는 숫자의 빈도를 pCount에 저장함
	void numberCount(int nanSus[], int size, int pCount[]) {
		int nIndex = 0;
		// 채번된 100가지 숫자에 대해 판정을 해야함
		for (int i = 0; i < size; i++) {
			// 카운트하기 위해서 일단 배열의 값을 담았다.
			// 채번된 숫자가 배열(pCount)의 인덱스 변수에 담긴다.
			nIndex = nanSus[i];
			// pCount는 100개의 숫자에 대한 빈도수를 관리하는 1차 배열이다.
			pCount[nIndex]++;
		}
	}

	// 배열 출력 한 줄에 10개씩 출력하고 줄바꿈 하기
	void print10PerLine(int nanSus[], int size) {
		System.out.printf("원본 : 	");
		for (int i = 0; i < size; i++) {
			System.out.printf("%3d", nanSus[i]);
			if (i % 10 == 9)
				System.out.printf("\n	");
		}
	}

	// 빈도 출력 빈도 배열과 인덱스를 함께 출력
	void printResult(int pCount[], int size) {
		System.out.printf("\n "); // 개행 처리하기
		System.out.printf("숫자 : 	");
		for (int i = 0; i < size; i++) {
			System.out.printf("%3d", i);
		}
		System.out.printf("\n "); // 개행 처리하기
		System.out.printf("개수 : 	");
		for (int i = 0; i < size; i++) {
			System.out.printf("%3d", pCount[i]);
		}
	}

	public static void main(String[] args) {
		new BinDoTemplate();
	}
}