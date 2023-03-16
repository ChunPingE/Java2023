package ch15.sec05.exam04;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorExample {
	public static void main(String[] args) {
		// 비교자를 제공한 TreeSet 컬렉션 생성
		TreeSet<Fruit> treeSet = new TreeSet<>((f1, f2) -> f1.price - f2.price);

		/*
		TreeSet<Fruit> treeSet2 = new TreeSet<>(new Comparator<Fruit>() {
			@Override
			public int compare(Fruit o1, Fruit o2) {
				return o1.price - o2.price;
			}
		});
		*/
		
		// 객체저장
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 10000));
		treeSet.add(new Fruit("딸기", 6000));

		// 객체 하나씩 가져오기
		for (Fruit fruit : treeSet) {
			System.out.println(fruit.name + ":" + fruit.price);
		}
	}
}
