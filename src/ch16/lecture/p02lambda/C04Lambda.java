package ch16.lecture.p02lambda;

public class C04Lambda {
	public static void main(String[] args) {
		MyInterface04 o1 = new MyInterface04() {
			@Override
			public void method1(int x, int y) {
				System.out.println("익명클래스");
				System.out.println(x + ", " + y);
			}
		};

		MyInterface04 o2 = (int x, int y) -> {
			System.out.println("람다식");
			System.out.println(x + ", " + y);
		};

		MyInterface04 o3 = (a, b) -> {
			System.out.println("타입 생략");
			System.out.println(a + ", " + b);
		};
		
		//파라미터 한개일때만 () 생략 가능
	}
}

@FunctionalInterface
interface MyInterface04 {
	void method1(int x, int y);
}