package ch13.lecture.p01generic;

public class C06GenericMethod {
	public static void main(String[] args) {
		MyClass06 o1 = new MyClass06();
		String s1 = o1.<String>method();
		Integer i1  = o1.<Integer>method();
		
		String s2 = o1.method();
		Integer i2 = o1.method();
	}
}

class MyClass06 {
	public <T> T method() {
		return null;
	}
}
