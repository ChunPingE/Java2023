package ch16.lecture.p03reference;

public class C03MethodReference {
	public static void main(String[] args) {
		//인스턴스 메소드 참조
		//reference to an instance method of a particular object
		MyInterface04 o1 = a -> System.out.println(a);

		MyClass03 s1 = new MyClass03();
		MyInterface04 o2 = a -> s1.method(a);
		MyInterface04 o3 = s1::method;
		
		MyInterface02 o4 = () -> s1.method1();
		MyInterface02 o5 = s1::method1;
		
		MyInterface03 o6 = (a,b) -> s1.method2(a, b);
		MyInterface03 o7 = s1::method2;
	}
}

interface MyInterface04 {
	void action(int a);
}

class MyClass03 {
	void method1() {
	}

	void method2(int a, int b) {
	}

	public void method(int a) {
	}
}
