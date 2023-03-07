package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class D extends A {
	// 생성자 선언
	public D() {
		// A생성자호출
		super();
	}

	// 메소드
	public void method1() {
		// A필드값 변경
		this.field = "value";
		// A메소드 호출
		this.method();
	}

	// 메소드
	public void method2() {
		//직접 객체 사용은 불가능
		// A a = new A(); // X
		// a.field = "value"; //X
		// a.method(); //x
	}
}
