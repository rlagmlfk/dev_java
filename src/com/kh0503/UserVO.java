package com.kh0503;
//데이터만 담을 수 있는 클래스 설계하기
// 접두어에 사용된 VO는 Value Object의 약자이다.
// 자바의 변수와 오라클의 변수 사이에 매칭해주는 클래스 설계이름이다.
public class UserVO {
	// id를 담을 변수 선언
	// 전역변수의 위변조를 막기 위해서 private으로 선언한 뒤
	// 값을 꺼낼 때는 getter메소드를 호출하고
	// 값을 담을 때는 setter메소드에 파라미터를 통해서 복사된 값이 전역변수인 mem_id에 저장됨
	private String mem_id;
	// pw를 담을 변수 선언
	private String mem_pw;
	// 사용자의 생일을 담을 변수 선언
	private String mem_birth;
	// 디폴트 생성자 - 파라미터가 하나도 없는 그런 생성자
	// 역할: RAM에 저장 - 재사용성
	// 전역변수를 재사용하기 위해서는 생성자를 반드시 호출할 것
	public UserVO() {}
	// 세 개의 파라미터를 갖는 생성자를 통해서 전역변수의 초기화가 가능함.
	public UserVO(String mem_id, String mem_pw, String mem_birth) {
		// this가 붙은 mem_id는 전변, this가 없는 변수는 지역변수(위치: 파라미터)
		this.mem_id = mem_id;
		this.mem_pw = mem_pw;
		this.mem_birth = mem_birth;
	}
	public String getMem_id() {
		return mem_id;
	}
	// 접근제한자가 public이므로 외부에서 접근이 가능하다.
	// 파라미터를 통해서 값이 전달되고 전역변수인 mem_id에 값이 저장
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getMem_pw() {
		return mem_pw;
	}
	public void setMem_pw(String mem_pw) {
		this.mem_pw = mem_pw;
	}
	public String getMem_birth() {
		return mem_birth;
	}
	public void setMem_birth(String mem_birth) {
		this.mem_birth = mem_birth;
	}
}
