package com.javabasic;

public class MyMathTest {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.mutiply(5L, 3L);
		// double대신 long 값으로 호출. 이 값은 double로 자동형변환
		double result4 = mm.divide(5L, 3L);
		
		
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);

	}

}

class MyMath {
	
	long add(long a, long b) {
		long result = a+b;
		return result;
		// return a+b; 위의 두줄을 이와 같이 한 줄로 간단히 가능
	}
	
	long subtract(long a, long b) {return a-b;}
	long mutiply(long a, long b) {return a*b;}
	double divide(double a, double b) {
		return a/b;
	}
	
	
}