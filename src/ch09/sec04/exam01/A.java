package ch09.sec04.exam01;

public class A {
	// 각 B객체는 이름이 우연히 같을 뿐 다른 클래스이다.
	// 생성자
	A() {
		// 로컬클래스 선언
		class B {
		}

		// 로컬객체 생성
		B b = new B();
	}

	// 메소드
	void method() {
		// 로컬클래스 선언
		class B {
		}

		// 로컬객체 생성
		B b = new B();
	}

}
