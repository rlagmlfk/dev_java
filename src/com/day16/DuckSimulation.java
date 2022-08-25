package com.day16;

public class DuckSimulation {

	public static void main(String[] args) {
		Duck myDuck = new MallardDuck();
		// MallardDuck은 FlyBehavior의 구현체클래스가 아니다.
		// MallardDuck은 fly메소드를 직접 오버라이딩 하지 않는다.
		myDuck.PerformFly();
		myDuck.display();
		myDuck = null;
		myDuck = new RubberDuck();
		myDuck.display();
		myDuck.PerformFly();
		WoodDuck herDuck = new WoodDuck();
		herDuck.display();
		herDuck.PerformFly();
		// herDuck = myDuck; 불가 => 오른쪽의 타입이 왼쪽의 타입보다 작아야한다.
		// herDuck = (WoodDuck)myDuck; 불가 => 예외가 발생
		herDuck.display();
		// myDuck = herDuck;
	}

}
