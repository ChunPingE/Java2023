package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.A;

public class C {
	public C() {
		// 객체 생성
		A a = new A();

		// 필드값변경
		a.field1 = 1; // o
		// a.field2 = 1; // x default필드 접근 불가
		// a.field3 = 1; //x private필드 접근 불가

		// 메소드 호출
		a.method1();
		// a.method2(); // x default필드 접근 불가
		// a.method3(); private메소드 접근 불가
	}
}
