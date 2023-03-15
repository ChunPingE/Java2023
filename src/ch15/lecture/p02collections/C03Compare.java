package ch15.lecture.p02collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class C03Compare {
	public static void main(String[] args) {
		List<Person03> list1 = List.of(
				new Person03("cha", 50),
				new Person03("son", 30),
				new Person03("park", 40));
		List<Person03> list2 = new ArrayList<>(list1);

		System.out.println(list2);
		Collections.sort(list2);
		System.out.println(list2);
	}
}

class Person03 implements Comparable<Person03> {
	private String name;
	private int age;

	public Person03(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person03 [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person03 o) {
		// 이름순 정렬
		// return this.name.compareTo(o.name);
		// 나이순 정렬
		// return age - o.age;

		// 1.나이순 비교 같다면 이름순 비교
		int ageDiff = this.age - o.age;

		if (ageDiff == 0) {
			return this.name.compareTo(o.name);
		}
		return ageDiff;
	}
}
