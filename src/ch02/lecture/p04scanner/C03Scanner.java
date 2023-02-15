package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C03Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 값 입력>");
		String str1 = sc.nextLine();
		int num1 = Integer.parseInt(str1);

		System.out.println("두번째 값 입력>");
		String str2 = sc.nextLine();
		int num2 = Integer.parseInt(str2);
		
		System.out.println(num1 + num2);
		

	}
}
