package ch17.lecture.p02terminal;

import java.util.*;
import java.util.stream.*;

public class C15Collect {
	public static void main(String[] args) {
		List<String> list = List.of("java", "css", "html", "jsp");

		Map<Integer, List<String>> r1 = list.stream()
				.collect(Collectors.groupingBy(s -> s.length()));

		System.out.println(r1); // {3=[css, jsp], 4=[java, html]}

		//고전적 for문
		Map<Integer, List<String>> r2 = new HashMap<>();
		for (String s : list) {
			Integer key = s.length();
			List<String> val = r2.get(key);

			if (val == null) {
				val = new ArrayList<>();
				r2.put(key, val);
			}
			val.add(s);
		}
		System.out.println(r2); //{3=[css, jsp], 4=[java, html]}
	}
}
