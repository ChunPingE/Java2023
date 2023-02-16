package ch03.lecture.p01arithmetic;

public class C01Arithmetic {
	public static void main(String[] args) {
		// 산술 연산자
		// +, -, *, /, %(나머지 modulo, remainder)

		int i1 = 30;
		int i2 = 50;

		System.out.println(i1 + i2);// 80
		System.out.println(i1 - i2);// -20
		System.out.println(i1 * i2);// 1500
		System.out.println(i1 / i2);// 0 - 정수간의 연산은 결과가 정수
		System.out.println(i1 % i2);// 30

		double d1 = 3.14;
		double d2 = 9.9;

		System.out.println(d1 + d2);// 13.04000...
		System.out.println(d1 - d2);// -6.76
		System.out.println(d1 * d2);// 31.086...
		System.out.println(d1 / d2);// 0.31717...

		// 정수와 실수의 산술연산
		// 결과는 실수
		int i3 = 10;
		double d3 = 3;

		System.out.println(i3 + d3);// 13.0
		System.out.println(i3 - d3);// 7.0
		System.out.println(i3 * d3);// 30.0
		System.out.println(i3 / d3);// 3.333

		// *,/,%가 +,-보다 우선순위가 높다. 사칙연산 규칙을따름.
		int i4 = 5 + 3 / 2; // 6
		int i5 = 5 * 3 + 10; // 25
		int i6 = 9 + 10 % 3; // 10

	}

}
