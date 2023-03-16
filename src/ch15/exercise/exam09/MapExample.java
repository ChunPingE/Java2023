package ch15.exercise.exam09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null;
		int maxScore = 0;
		int totalScore = 0;

		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			int value = map.get(key);
			totalScore += value;
			if (value > maxScore) {
				maxScore = value;
				name = key;
			}
		}

		int avg = totalScore / map.size();
		System.out.println(avg); // 91
		System.out.println(maxScore); // 96
		System.out.println(name); // blue
	}
}
