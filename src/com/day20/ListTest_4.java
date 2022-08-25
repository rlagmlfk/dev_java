package com.day20;

import java.util.ArrayList;
import java.util.List;
/* List나 Map은 Object타입만 담을 수 있다. => Wrapper클래스를 이용해서 담는다.
 * int - Integer
 * double - Double
 * float - Float
 * boolean - Boolean, new Boolean(true); != new Boolean("true");
 * => 어떤 값에 더블쿼테이션을 붙이면 String타입이다.
 */
public class ListTest_4 {

	public static void main(String[] args) {

		// 제네릭을 추가한 인스턴스화의 경우 타입체크 필요없음
		List<Integer> numberList = new ArrayList<>();
		numberList.add(5);
		// 제네릭에서 String타입을 명시하였으므로 캐스팅 연산자가 필요없다.
		Integer num = numberList.get(0);
		// 받을 때는 원시형타입으로 받을 수 있다. 왜냐하면 오토박싱(원시형을 자동으로 래퍼클래스로 전환)이 적용되어서
		int num2 = numberList.get(0);
		// insert here
		System.out.println(num); //5
	}

}
