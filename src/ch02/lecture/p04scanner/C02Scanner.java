package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C02Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("키보드로 작성해 보세요>");

		String str = scanner.nextLine();
		// 스캐너가 훑고지나가고 입력된 값을 리턴 그리고 다음 줄로 간다.
		// 엔터를 만날때까지 읽어감

		System.out.println("입력된 값 출력");
		System.out.println(str);
	}
}
