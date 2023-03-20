package ch17.lecture.p03intermediate;

import java.util.List;

public class C03Distinct {
	public static void main(String[] args) {
		// limit 중간연산 : 크기제한
		List<Integer> list = List.of(3, 1, 2, 0, 1, 2, 3);

		long count = list.stream()
				.count();

		System.out.println(count); // 7
		
		long count2 = list.stream()
				.distinct()
				.count();
		
		System.out.println(count2); // 4
	}
}
