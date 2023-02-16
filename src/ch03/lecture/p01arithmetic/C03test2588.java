package ch03.lecture.p01arithmetic;

import java.util.Scanner;

public class C03test2588 {
	public static void main(String[] args) {
		// (세 자리 수) × (세 자리 수)
		// 각 연산 자리 값
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int a = num1 * (num2 % 10); 
		int b = num1 * (num2 % 100) / 10; //정수를 나누면 나머지는 없어지니가!!
		int c = num1 * (num2 / 100);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(num1 * num2);

	}
}
