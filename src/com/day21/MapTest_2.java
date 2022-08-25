package com.day21;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest_2{

	public static void main(String[] args) {
		Map<String, Object> pmap = new HashMap<>();
		pmap.put("mem_id", "tomato");
		pmap.put("mem_pw", "111");
		pmap.put("mem_name", "토마토");
		// 메소드 호출의 리턴값으로 객체를 주입(생성)받을 수 있다. 
		Object keys[] = pmap.keySet().toArray(); 
		for(Object key:keys) {
			System.out.println(key+", "+pmap.get(key));
		}
	}

}
