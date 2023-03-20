package ch17.lecture.p03intermediate;

import java.util.Random;

public class C06Peek {
	public static void main(String[] args) {
		// peek
		// 랜덤한 인티저 값 생성
		// 한꺼번에 일하기 때문에 2번씩 5번 출력
		new Random().ints(5)
				.peek(System.out::println)
				.forEach(System.out::println);
	}
}
