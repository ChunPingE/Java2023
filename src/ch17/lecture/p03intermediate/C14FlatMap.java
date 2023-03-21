package ch17.lecture.p03intermediate;

import java.util.List;
import java.util.stream.Stream;

public class C14FlatMap {
	public static void main(String[] args) {
		// flatMap:
		// 원래 원소를 다른 원소 '들'로 매핑

		List<Integer> list = List.of(3, 4, 5);

		// map: 1 대 1
		long count1 = list.stream()
				.map(e -> e)
				.count();
		System.out.println(count1); // 3

		// flatMap : 1 대 다(0이상)
		long count2 = list.stream()
				.flatMap(e -> Stream.of(0, 0)) // 각 값이 들어와서 두개짜리 stream으로 만듬
				.count();
		System.out.println(count2); // 6
	}
}
