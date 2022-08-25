package com.day9;

public class MethodOverloading1 {
	void hap() {
		
	}
	void hap(int i) throws Exception{
		
	}
	void hap(boolean i) { //타입이 다르거나 개수가 달라야 합법
		
	}
	void hap(boolean i, int j) {
		
	}
	/* int hap() { -> 중복되어 불가능
		return 0;
	}*/
	public static void main(String[] args) {
		

	}

}
