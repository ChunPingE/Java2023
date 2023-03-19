package ch17.lecture.p02terminal;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class leet2206 {
	public boolean divideArray(int[] nums) {
		// Divide Array Into Equal Pairs
		Map<Integer, Integer> map = new HashMap<>();

		// 각 값이 몇개인 세는 코드
		for (int n : nums) {
			if (map.containsKey(n)) {
				// 키 n의 값을 1 더해서 다시 entry에 넣는다.
				int oldvalue = map.get(n);
				map.put(n, oldvalue + 1);
			} else {
				map.put(n, 1);
			}
		}

		// value가 홀수 인게 잇으면 return false
		return map.values()
				.stream()
				.anyMatch(e -> (e % 2) == 0);
	}
}
