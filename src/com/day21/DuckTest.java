package com.day21;
// 자바+스프링(객체 주입, 의존성주입, 제어역전)
import com.day16.MallardDuck;

public class DuckTest {
	MallardDuck myDuck = null;
	// 메소드를 통해서 객체를 주입받을 수 있다.
	MallardDuck getInstence() {
		// 중급 - 싱글톤 패턴 검색 - 공유하기 위해
		if(myDuck == null) {
			myDuck = new MallardDuck();
		}
		return myDuck;
	}
	void test() {
		getInstence().display(); // myDuck.display(); => NullPointerException발생
	}

	public static void main(String[] args) {
		DuckTest dt = new DuckTest();
		dt.test();
	}
}