package com.day9;

public class Car {
	int WheelNum = 0;
	public void stop() {
		
	}

}
// 'A is a B 이다'가 성립되면 상속
class Sonata extends Car{
	@Override
	public void stop() {
		
	}
	// 메소드 오버로딩 규칙을 준수했으니 괜찮음
	public int stop(int i) {
		return 0;
	}
	public int stop(double i) {
		return 0;
	}
}