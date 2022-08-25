package com.day16;
// FlyWithWings는 FlyBehavior인터페이스의 구현체 클래스이다.
// Why? FlyBehavior에 있는 추상메소드를 오버라이딩하고있으니까
// 아래 클래스는 청둥오리의 클래스가 되어야함
public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("날고있어요");
	}

}
