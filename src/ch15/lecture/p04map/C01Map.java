package ch15.lecture.p04map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class C01Map {
	public static void main(String[] args) {
		// Map
		// (key, value) 쌍 entry를 저장
		// key는 중복 되지 않음

		Map<String, String> map = new HashMap<>();

		// entry 추가
		map.put("kang", "slamdunk");
		map.put("serly", "avatar");
		map.put("maverick", "topgun");

		// entry의 수
		int size = map.size();
		System.out.println(size); // 3

		map.put("kang", "baseball");
		System.out.println(map.size()); // 3

		// key로 value얻기
		String v1 = map.get("serly"); // avatar
		System.out.println(v1);
		System.out.println(map.get("kang")); // baseball

		// entry 지우기
		map.remove("kang");
		System.out.println(map.size()); // 2

		// 전체탐색

		System.out.println("keySet사용 ###########");
		Set<String> keys = map.keySet(); // 키 set얻기
		for (String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}

		System.out.println("foreach 메소드 $$$$$$$$$$");
		map.forEach((k, v) -> System.out.println(k + ":" + v));

		System.out.println("entrySet 메소드 ***********");
		Set<Entry<String, String>> entries = map.entrySet();
		for (Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
