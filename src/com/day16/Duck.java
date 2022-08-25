package com.day16;
// 클래스 선언부에 abstract가 붙으면 추상클래스 선언이다.
public abstract class Duck {
	// 추상 클래스는 생성자를 가질 수 있다.
	FlyBehavior flyBehavior = null;
	QuackBehavior quackBehavior = null;
	public Duck() {
		// 추상클래스에서는 구현체 클래스를 결정할 수 없다. 
		// 왜냐하면 구체적인 클래스가 정해지지 않았다. WoodDuck인지 RubberDuck인지 아니면 MallardDuck인지
		// flyBehavior = new FlyWithWings();
	}
	// 고무 오리와 나무오리, 청둥오리는 외모가 각기 다르다.
	// 서로 다른 외모를 구현하려면 구현체 클래스가 필요하다.
	public abstract void display();
	public void PerformFly() { // 이 코드로 인해 결합도가 낮아지게 된다.
		flyBehavior.fly();
	}
	public void swimming() {
		System.out.println("모든 오리는 물 위에 뜬다.");
	}
}
