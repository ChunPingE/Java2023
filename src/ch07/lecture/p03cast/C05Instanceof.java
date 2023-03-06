package ch07.lecture.p03cast;

public class C05Instanceof {
	public static void main(String[] args) {
		method1(new Sub05()); // true true

		method1(new Super05()); // true false
	}

	public static void method1(Super05 s) {
		System.out.println(s instanceof Super05); // true
		System.out.println(s instanceof Sub05); // 그때그때 다름.
	}
}

class Sub05 extends Super05 {
}

class Super05 {
}
