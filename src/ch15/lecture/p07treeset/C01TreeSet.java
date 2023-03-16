package ch15.lecture.p07treeset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C01TreeSet {
	public static void main(String[] args) {
		// 정렬된 Set
		Set<Integer> set = new HashSet<>();
		Set<Integer> treeSet = new TreeSet<>();

		set.add(3000);
		treeSet.add(3000);
		set.add(20);
		treeSet.add(20);
		set.add(20000);
		treeSet.add(20000);

		//HashSet은 순서보장 x
		System.out.println(set); //[20000, 20, 3000]
		System.out.println(treeSet); //[20, 3000, 20000]
	}
}
