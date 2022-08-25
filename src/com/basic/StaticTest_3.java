package com.basic;


//class 선언
public class StaticTest_3 {
	// non-static 타입의 변수를 선언하고 초기화 하였다.
	// 변수명 대신 컴퓨터는 메모리의 주소번지로 기억하지만,
	// 사람은 이 긴 숫자를 기억하는 것 보다는 변수명으로 접근하는 것이 편리함
	int age = 20; // =기호는 대입연산자라고 읽는다 // age 전역변수
	// 변수 선언시 앞에 static을 붙이니까 변수 이름이 약간 누워있음->static 타입의 변수이다.
	static int birth_year = 2000;
	// 오른쪽에 있는 값을 왼쪽에 대입해 주세요 라는 의미
	public static void main(String[] args) { //메소드 선언
		// insert here - age변수를 접근할 수 있나?
		// main메소드는 선언부에 static이 붙어있으니까 static 영역인 것
		// 그러나 변수 age앞에는 static이 없으니까 사용이 불가
		// non-static은 static영역 안에서 사용이 불가
		// 문제해결 방법은? - 내 안에 있더라도 인스턴스화를 하면 사용가능
		StaticTest st = new StaticTest();
		System.out.println(st.age);
		// 변수를 호출하면 주소번지가 나오지 않고 값이 나옴
		System.out.println(birth_year);
	// end of main
	}

} // end of statictest_3
// △영역