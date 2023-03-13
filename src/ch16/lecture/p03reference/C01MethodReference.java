package ch16.lecture.p03reference;

public class C01MethodReference {
	public static void main(String[] args) {
		MyInterface01 o1 = a -> System.out.println(a);
		MyInterface01 o2 = a -> MyClass01.method(a);
		
		//MethodReference (스태틱 메소드 참조)
		MyInterface01 o3 = MyClass01::method;
	}
}

@FunctionalInterface
interface MyInterface01 {
	void action(int a);
}

class MyClass01 {
	public static void method(int a) {
	}
}
