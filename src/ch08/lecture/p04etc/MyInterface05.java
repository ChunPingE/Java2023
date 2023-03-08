package ch08.lecture.p04etc;

public interface MyInterface05 {
	// public static final field

	// public static method
	static void method1() {
		common();
		System.out.println("method1 코드");
	}

	static void method2() {
		common();
		System.out.println("method2 코드");
	}

	private static void common() {
		System.out.println("공통된 코드");
	}

	// public abstact instance method

	// public default instance method

	// private instance method
}
