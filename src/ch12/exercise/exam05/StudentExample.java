package ch12.exercise.exam05;

import java.util.HashSet;

public class StudentExample {
	public static void main(String[] args) {
		HashSet<Student> hashSet = new HashSet<>();

		hashSet.add(new Student("1"));
		hashSet.add(new Student("1"));
		hashSet.add(new Student("2"));

		// 저장된 수 출력
		System.out.println("저장된 Student 수: " + hashSet.size());
	}
}
