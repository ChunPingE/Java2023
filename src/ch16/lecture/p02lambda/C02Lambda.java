package ch16.lecture.p02lambda;

public class C02Lambda {
	public static void main(String[] args) {
		//파라미터가 없으면 빈 () 괄호 사용
		//메소드 body는 {}
		MyInterface02 o1 = () -> {
			//메소드 body
			System.out.println("메소드 body 작성");
		};
		
		o1.method1();
		
		//메소드의 명령문이 하나이면 중괄호 생략가능
		MyInterface02 o2 = () -> {
			System.out.println("명령문 여러개1");
			System.out.println("명령문 여러개2");
		};
		
		//생략가능하면 생략!!
		//lambda는 생략할수록 읽기 쉬움
		MyInterface02 o3 = () -> System.out.println("명령문 하나");
	}
}

// lambda expression
// 추상메소드가 하나인 interface의 익명클래스 객체를 만드는 코드가 람다식이다.
//functional interface : 추상 메소드가 하나인 interface

@FunctionalInterface
interface MyInterface02{
	//파라미터가 없는 추상메소드
	void method1();
}