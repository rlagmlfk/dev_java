package com.day10;
// 두 개의 클래스가 A is a B 관계에 있을 때, 객체 지향 언어에서는 상속관계로 설계한다.
// 전역변수는 초기화를 생략할 수 있다.
// 전역변수의 경우 생성자를 통해서 초기화를 대신 지원받는다.
class Super {
	// 파라미터가 아무것도 없으니까 생략하면 JVM이 대신 로딩해준다.
	Super() { //파라미터가 없는 생성자를 디폴트 생성자라 한다.
		System.out.println("Super() 호출 성공");
	}
	public void methodA () {
		System.out.println("Super - methodA 호출 성공");
	}
}
class Sub extends Super {
	Sub() { //파라미터가 없는 생성자를 디폴트 생성자라 한다.
		System.out.println("Sub() 호출 성공");
	}
	@Override
	public void methodA () {
		System.out.println("Sub - methodA 호출 성공");
	}
	
}
public class Overloading_1 {

	public static void main(String[] args) {
		//Super sup = new Super(); // Super - methodA호출 성공
		//sup.methodA();
		Sub   sub = new Sub(); // Sub - methodA호출 성공
		sub.methodA();
		// 선언부의 타입과 생성부의 타입이 다를 수 있다. - 폴리모피즘, 다형성
		// sup1 = new Sub();
		// 
		// sup1.methodA();

	}

}
