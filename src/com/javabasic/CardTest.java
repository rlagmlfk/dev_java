package com.javabasic;

public class CardTest {

	public static void main(String[] args) {
		
		// 클래스 변수(static변수)는 객체생성 없이 '클래스이름.클래스변수'로 직접 사용 가능
		System.out.println("Card.width = "+Card.width);
		System.out.println("Card.height = "+Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		// 인스턴스 변수의 값을 변경
		Card c2 = new Card();
		c2.kind = "spade";
		c2.number = 4;
		
		System.out.println("c1 은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + 
							c1.width + ", " + c1.height + ")");
		System.out.println("c2 은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + 
				c2.width + ", " + c2.height + ")");
		System.out.println("c1의 width와 height를 각각 50,80으로 변경합니다.");
		
		// 클래스 변수의 값을 변경한다.
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("c1 은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + 
				c1.width + ", " + c1.height + ")");
		System.out.println("c2 은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + 
				c2.width + ", " + c2.height + ")");
	}

}

class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}

/*
 * Card인스턴스인 c1과 c2는 클래스 변수인 width와 height를 공유하기 때문에,
 * c1의 width와 height를 변경하면 c2의 width와 height값도 바뀐 것과 같은 결과를 얻는다.
 * 
 * 참조변수 c1, c2를 통해서도 클래스 변수를 사용할 수 있지만, 
 * 이렇게 하면 클래스 변수를 인스턴스로 오해하기 쉽기때문에
 * 클래스이름.클래스변수(Card.with) 형태로 사용하는 것이 좋음
*/
