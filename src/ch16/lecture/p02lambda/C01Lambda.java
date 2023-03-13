package ch16.lecture.p02lambda;

public class C01Lambda {
	public static void main(String[] args) {
		//functional interface로 lambda식만들 수 있음
		MyInterface01 o1 = () -> System.out.println("재정의 메소드@");
		MyInterface01 o2 = () -> System.out.println("또다른 메소드@");
		o1.method1();
		o2.method1();
	}
}

// lambda expression
// 추상메소드가 하나인 interface의 익명클래스 객체를 만드는 코드가 람다식이다.
//functional interface : 추상 메소드가 하나인 interface

@FunctionalInterface
interface MyInterface01{
	void method1();
	
	// Object에 있는 메소드는 추상메소드 수에 포함 안된다.
	String toString(); 
	
	default void method2() {
	}
	
	static void method3() {
	}
}