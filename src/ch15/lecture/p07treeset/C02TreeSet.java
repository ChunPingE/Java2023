package ch15.lecture.p07treeset;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class C02TreeSet {
	public static void main(String[] args) {
		// 정렬된 Set
		NavigableSet<Integer> set = new TreeSet<>();
		set.addAll(Set.of(3, 1, 20, 3000, 15, 7, 9, 2500, 100));

		System.out.println(set);
		// [1, 3, 7, 9, 15, 20, 100, 2500, 3000]

		// first : 가장 첫번째 아이템
		System.out.println(set.first()); // 1

		// last : 마지막 아이템
		System.out.println(set.last()); // 3000

		// lower : 특정값보다 작은 아이템
		System.out.println(set.lower(50)); // 20

		// higher : 특정값보다 큰 아이템
		System.out.println(set.higher(50)); // 100

		// floor : 특정값보다 작은데 본인 포함
		System.out.println(set.floor(20)); // 20

		// ceiling : 특정 값보다 큰데 본인 포함
		System.out.println(set.ceiling(20)); // 20

		// 거꾸로 정렬된 NavigableSet 리턴
		NavigableSet<Integer> descendingSet = set.descendingSet();
		System.out.println(descendingSet);
		// [3000, 2500, 100, 20, 15, 9, 7, 3, 1]
	}
}
