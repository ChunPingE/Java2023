package ch16.lecture.p02lambda;

public class C05Lambda {
	public static void main(String[] args) {
		MyInterface05 o1 = new MyClass05();
		int r1 = o1.method();
		
		MyInterface05 o2 = () -> {
			System.out.println("람다로 메소드 재정의");
			return 3;
		};
		
		//명령문 return 하나면 중괄호와 return 생략가능
		MyInterface05 o3 = () ->  5;
	}
}

class MyClass05 implements MyInterface05 {
	@Override
	public int method() {
		System.out.println("명령문 작성...");
		return 0;
	}
}

@FunctionalInterface
interface MyInterface05 {
	int method();
}