package ch09.lecture.p01nested;

public class C01NestedClass {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();

		MyClass01.Nested01 o2 = o1.new Nested01();
	}
}

//중첩 클래스
class MyClass02 {
	class Nested02 {
	}
	Nested02 item = new Nested02();
	
	void method1() {
		Nested02 local = new Nested02();
	}
}
