package ch04.sec03;

public class SwichValueExample {
	public static void main(String[] args) {
		String grade = "B";

		// JAVA 11이전문법
		int score1 = 0;
		switch (grade) {
		case "A":
			score1 = 100;
			break;
		case "B":
			int result = 100 - 20;
			score1 = result;
			break;
		default:
			score1 = 60;
		}
		System.out.println("score1: " + score1);

		// JAVA 12부터 가능
		int score2 = switch (grade) // 타입 변수 = switch(변수)
		{
		case "A" -> 100;
		case "B" -> {
			int result = 100 - 20;
			// JAVA 13부터가능
			yield result; // 연산 result를 yield해서 처음 변수에 담는다.
		}
		default -> 60; // default 생략불가
		};
		System.out.println("score2: " + score2);
	}
}
