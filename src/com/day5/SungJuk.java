package com.day5;

public class SungJuk {
	int kor=90;
	int eng=95;
	int math=60;
	int total() {
		int hap = 0;
		hap = kor+eng+math;
		return hap;
	}
	/*******************************************************************
	 * 평균을 구하는 메소드 구현
	 * @param hap - 세 과목에 관한 총점을 복사해온다
	 * @return double - 총점을 국어,영어,수학 세 과목으로 나눈다
	 * double/double => double
	 *******************************************************************/
	double average(int hap) {
		double avg = hap/3.0;
		return avg;
	}
	public static void main(String[] args) {
		// sj는 '참조형 변수'로 호출하면 주소번지가 출력된다.
		// 언제 사용? class 안에 선언된 변수나 메소드를 쓸 때 사용
		SungJuk sj = new SungJuk();
		int hap = sj.total();
		System.out.println("총점은 "+hap);
		double avg = sj.average(hap); // non-static을 static으로 불러오기 위해 인스턴스화
		System.out.println("평균은 "+avg);
		// insert here - 화면에 과목명 출력?
		// non-static의 변수명을 static영역에서 사용하려면 인스턴스화를 한다.
		System.out.println("국어:"+sj.kor
				        +", 영어:"+sj.eng
				        +", 수학:"+sj.math);
	
	}

}
