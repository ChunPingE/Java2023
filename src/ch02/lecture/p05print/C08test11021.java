package ch02.lecture.p05print;

import java.util.Scanner;

public class C08test11021 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int loop = sc.nextInt();

		for (int i = 0; i < loop; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.printf("Case #%2$d: %1$d\n", a + b, i + 1);

		}

	}

}
