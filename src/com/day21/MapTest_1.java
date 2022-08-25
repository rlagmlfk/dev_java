package com.day21;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 자바자료구조 - 랜덤하게 쓰기가 된다.
 * List보다 읽기와 쓰기가 빠르다
 * List구조는 Index로 접근하고 순차적이다.(정렬 - 2차 가공이 필요하다 -> 속도가 느리다)
 * List => 1조가 넘는 메시지를 서버가 매초마다 밀어낸다.
 * 
 * Map은 빈자리가 있으면 넣는다.
 * 프론트엔드 진로 - 배열 - React수업
 */
public class MapTest_1 {

	public static void main(String[] args) {
		Map<String, Object> pmap = new HashMap<>();
		pmap.put("one", 1);
		// 중복은 상관없다.
		pmap.put("two", 2);
		pmap.put("three", 2);
		pmap.put("three", 3);
		Set<String> set = pmap.keySet();
		// insert here
		Object keys[] = set.toArray();
		for(Object key:keys) {
			System.out.println(key+", "+pmap.get(key));
		}
	}

}
