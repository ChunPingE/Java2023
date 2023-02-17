package ch03.lecture.p06String;

public class C08StartWith {
	public static void main(String[] args) {
		// startsWith
		// 특정 문자열로 시작하는지?
		// return type : boolean

		// codingbat 문제: warmup1=-1 notstring

		String str1 = "spring";

		System.out.println(str1.startsWith("s")); // true
		System.out.println(str1.startsWith("sp")); // true
		System.out.println(str1.startsWith("pr")); // false

		// endsWith
		// 특정문자열로 끝나는지?
		// return type : boolean

		System.out.println(str1.endsWith("g")); // true
		System.out.println(str1.endsWith("ng")); // true
		System.out.println(str1.endsWith("s")); // false

	}
}
