package ch09.lecture.p01nested;

public class C03StaticNestedClass {
	public static void main(String[] args) {
		MyClass03.Nested03 o1 = new MyClass03.Nested03();
	}
}

//중첩 클래스
class MyClass03 {
	//staitc nested class
	//정적 멤버 클래스
	static class Nested03 {}
}
