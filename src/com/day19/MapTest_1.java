package com.day19;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest_1 {

	// 제네릭
	Map<String, Object> map = new HashMap<>(); // 모든 클래스를 받으려면 Object를 정의

	public MapTest_1() {
		// Map계열은 값을 담을 때 put메소드를 사용한다
		// 파라미터가 두 개 필요한데 하나는 키 값이고, 두 번째는 값이다.
		map.put("mem_id", "scott"); // 아이디
		map.put("mem_pw", "cyber"); // 비밀번호
		map.put("mem_name", "나신입"); // 이름
		pringMap(); // 출력을 담당하는 메소드 호출하기
	}

	public void pringMap() {
		// 키 값만을 추출할 때 사용
		Set<String> set = map.keySet();
		// 키 값이 세 가지(mem_id, mem_pw, mem_name)이니까 배열에 담을 수 있다.
		// 프론트엔드 - 배열에 집중-- 3차배열, 다차원배열 제외
		// obj 배열에는 키값이 들어있다.
		Object obj[] = set.toArray(); // Object대신 String을 쓰면 오류가 난다.
		for (int i = 0; i < obj.length; i++) {
			// 형전환 연산자 사용할 때는 받아주는 타입을 적는 것이다.
			String key = (String) obj[i]; // 타입을 맞추자
			System.out.println(key + ", " + map.get(key));
		}
	}

	public static void main(String[] args) {
		new MapTest_1(); // 재사용할 것이 아니면 변수선언 필요없음
	}

}
