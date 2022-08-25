package com.day19;

import com.day16.Duck;
import com.day16.MallardDuck;
import com.day16.RubberDuck;
// 생성부와 선언부의 이름이 다르면 안 된다. -> 상속관계, 인터페이스를 impliments하지 않아서
public class DuckTest {
	/* 파라미터에 더 상위 클래스 타입을 적어주면 다양한 구현체 클래스를 받을 수 있다. - 다형성 기대 가능
	   다형성 - 같은 이름의 메소드가 호출되더라도 기능이 서로 다르게 동작한다.
	   선언부와 생성부의 이름이 다를 때 가능
	   이것이 가능하려면 상속관계이거나 인터페이스의 구현체 클래스라면 가능하다.*/
	public void methodA(Duck duck) {
		System.out.println("methodA(Duck)");
		if(duck instanceof RubberDuck) { // 너 RubberDuck타입이니?
			System.out.println("나는 RubberDuck 타입입니다.");
		}else if(duck instanceof MallardDuck) {
			System.out.println("나는 MallardDuck 타입 입니다.");
		}else { // 그 나머지 else인 경우에는 조건문이 올 수 없다.
			System.out.println("나는 기타 Duck타입입니다.");
		}
		System.out.println(duck);
	}
	public void methodA(MallardDuck duck) {
		System.out.println("methodA(MallardDuck)");
		System.out.println(duck);
	}
	// public void methodC(int i = 5){} -> X, 파라미터 자리에 선언만 가능하다. 초기화는 불가
	// => 그 변수의 값을 정할 수 없다.
	public void methodC(int i) {
		System.out.println(i);
	}
	public static void main(String[] args) {
		DuckTest dt = new DuckTest();
		Duck myDuck = new RubberDuck(); // 생성자 호출
		Duck herDuck = new MallardDuck();
		// dt.methodA(Duck); -> Duck에 빨간줄이 뜨는 이유는 단독으로 구현못해서
		// 인스턴스변수가 있으면 다른 변수나 다른 메소드 호출시 재사용 가능
		// new RubberDuck();은 한번만 사용가능 - 재사용 불가
		dt.methodA(new RubberDuck()); // Duck이 RubberDuck의 상위클래스이다.->8번을 상속받는다
		dt.methodA(herDuck);
		dt.methodA(myDuck); // pass by value(주소번지-원본) <-> call by value(복사본)
		// dt.methodB(new MallardDuck());
		dt.methodC(5);
		// dt.methodA(참조형타입); -> 타입이 다르다
	}

}
