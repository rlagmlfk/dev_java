package com.day15;
// 선언부에 abstract가 오면 추상클래스
// 인터페이스는 생성자를 가질 수 없지만 추상클래스는 생성자를 가질 수 있다.
// 일반 메소드와 추상 메소드 모두 가질 수 있다.
// 일반 메소드와 구분하기 위해 추상메소드 앞에 abstract는 절대 생략 불가.
public abstract class Car implements MoveBehavior{
	public int speed = 0;
	public int wheelNum = 0;
	// 어떤 자동차가 될 지 정할 수 없어서 추상메소드로 정함
	// 세미콜론으로 끝나는 메소드는 추상메소드이다.
	public abstract void display(); // 세미콜론으로 끝나 추상메소드, abstract 생략불가 생략하면 컴파일 에러
	@Override
	// 좌중괄호 우중괄호가 있는 메소드를 일반 메소드라 한다.
	public void run() { // 엑셀을 밟으면 그때마다 호출
		speed = speed +1;
	}
}
/* 인터페이스는 추상클래스보다 더 추상적이다-> 추상메소드만 가지기때문
 * 인터페이스와 추상클래스의 공통점은 둘 다 단독으로 인스턴스화 불가-> 다형성이 가능
 * 이것으로 인해 구현체 클래스에 따라서 같은 이름의 메소드를 호출하더라도 서로 다른 메소드가 실행되어 다른 기능이 제공되는 것이다. - 다형성
 * 인터페이스는 오직 추상메소드만 가질 수 있다.-> abstract 예약어 생략 가능
 * 인터페이스는 생성자를 가질 수 없다.
 * 추상클래스는 생성자를 갖는다.
 * 추상클래스는 일반메소드와 추상메소드를 모두 가질 수 있다.
 * 추상클래스에서는 abstract를 생략할 수 없다.
 * 추상클래스가 있어서 다형성이 가능해진다.
 * 추상클래스와 인터페이스때문에 선언부의 타입과 생성부의 타입이 다를 수 있다.
 * 단 JAVA는 이럴 경우 생성부의 타입으로 객체가 생성된다. 메모리에 로딩된다.
 * 
 * 클래스타입 변수명 = new 클래스타입(); - 스탠다드
 * 추상클래스 변수명 = new 구현체클래스(); - 다형성이 가능해진다.-> 코드수정이 줄어듬
 * 인터페이스 변수명 = new 구현체클래스();
 */