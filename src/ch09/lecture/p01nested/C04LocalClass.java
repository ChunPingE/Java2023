package ch09.lecture.p01nested;

public class C04LocalClass {
	void method1() {
		// 로컬클래스(local class)
		// 선언된 메소드 내에서만 사용가능
		class LocalClass1 {
		}
		LocalClass1 o1 = new LocalClass1();
	}

	void method2() {
		// LocalClass1 o1 = new LocalClass1(); 불가능
	}
}
