package ch06.sec13.exam03.package1;

public class A {
	// public
	public int field1;
	// default
	int field2;
	// private
	private int field3;

	// 생성자 선언
	// 클래스 내부일 경우 접근제한자 영향 x
	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;

		method1();
		method2();
		method3();
	}

	public void method1() {
	}

	void method2() {
	}

	private void method3() {
	}
}
