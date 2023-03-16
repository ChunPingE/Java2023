package ch15.sec08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableExample {
	public static void main(String[] args) {
		// List 불변 컬렉션 생성
		List<String> immutableList1 = List.of("A", "B", "C");
		// immutableList1.add("D"); 불가능

		// Set 불변 컬렉션 생성
		Set<String> immutableSet1 = Set.of("A", "B", "C");
		// immutableSet1.remove("A"); 불가능

		// Map 불변 컬렉션 생성
		Map<Integer, String> immutableMap1 = Map.of(
				1, "A",
				2, "B",
				3, "C");
		// immutableMap1.put(4, "D"); 불가능

		// List 컬렉션을 불변 컬렉션으로 복사
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		List<String> immutableList2 = List.copyOf(list);

		// 수정가능한 리스트로 변경
		List<String> list2 = new ArrayList<>(immutableList2);

		// Set컬렉션을 불변 컬렉션으로 복사
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		Set<String> immutableset2 = Set.copyOf(set);

		// Map컬렉션을 불변 컬렉션으로 복사
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		Map<Integer, String> immutableMap2 = Map.copyOf(map);

		// 배열로부터 List불변 컬렉션 생성
		// 수정은 가능
		String[] arr = { "A", "B", "C" };
		List<String> immutableList3 = Arrays.asList(arr);

		// int[] arr2 = { 3, 4, 5 };
		// List<Integer> list4 = Arrays.asList(arr2);
		// 자동 박싱 안해줌

		Integer[] arr2 = { 3, 4, 5 };
		List<Integer> list4 = Arrays.asList(arr2);
	}
}
