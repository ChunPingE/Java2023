package ch16.lecture.p02lambda;

public class C03Lambda {
	public static void main(String[] args) {
		MyInterface03 o1 = new MyInterface03() {
			@Override
			public void method1(int a) {
				System.out.println("익명 클래스로 재정의");
				System.out.println("받은 값: " + a);
			}
		};
		
		MyInterface03 o2 = (int a) -> {
			System.out.println("익명 클래스로 재정의");
			System.out.println("받은 값: " + a);
		};
		
		//타입 생략
		MyInterface03 o3 = (a) -> {
			System.out.println("익명 클래스로 재정의");
			System.out.println("받은 값: " + a);
		};
		
		//괄호 생략
		MyInterface03 o4 = a -> {
			System.out.println("괄호 생략");
			System.out.println("받은 값: " + a);
		};
		
		//파라미터이름이 같을 필요 없다.
		MyInterface03 o5 = x -> {
			System.out.println("괄호 생략");
			System.out.println("받은 값: " + x);
		};
	}
}

@FunctionalInterface
interface MyInterface03 {
	// 파라미터가 있는 추상메소드
	void method1(int a);
}