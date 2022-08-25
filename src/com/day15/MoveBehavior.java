package com.day15;

public interface MoveBehavior {
	// int i = 0; 변수를 가질 수 없다
	final int i = 0; //final 상수를 가지면 가능
	public abstract void run();
	// 인터페이스에서 선언된 모든 메소드는 추상메소드이다.
	// 인터페이스에서 선언된 모든 메소드는 추상메소드 이므로
	// abstract예약어 생략이 가능하다.
	// 인터페이스에서 선언된 메소드의 리턴타입이 있더라도
	// 좌중괄호와 우중괄호를 쓸 수 없으므로 return예약어를 쓰지 않아도 된다.
	public abstract int stop();
}
