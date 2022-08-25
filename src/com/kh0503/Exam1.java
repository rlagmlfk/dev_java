package com.kh0503;
// 더 큰 타입은 더 작은 타입에 대입연산자를 통해서 재정의할 수 없다.
// 대입(=) 연산자를 기준으로 오른쪽이 왼쪽보다 큰 타입이 오면 안 된다.
public class Exam1 {

	public static void main(String[] args) {
		int i =5; // 지역변수
		double d = 1.5; // double d; -> 선언만 했다.
		i = (int)d; //int<double but 캐스팅 연산자로는 타입이 갖으면 가능
		// 위와 같이 강제 형전환을 시키면 0.5는 담을 수 없다.
		System.out.println(i); // 5->1
		boolean isOK = false; // boolean is OK; -> 초기화 안한 상태
		if(isOK) {
			float f = 1.5f;
			
			// 조건을 만족하지 않으면 단 한번도 실행하지 않는다.
			// insert here - 실행문
		}else {
			
		}
		// System.out.println(f); -> 지역변수라 불가
		Exam1 e1 = new Exam1();
		// 지역변수는 인스턴수 변수, 변수명 불가하다.
		// System.out.println(e1.i);
	}

}
