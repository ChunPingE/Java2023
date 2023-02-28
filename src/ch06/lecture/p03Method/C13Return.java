package ch06.lecture.p03Method;

public class C13Return {
	public static void main(String[] args) {
		MyClass13 o1 = new MyClass13();

		int var1 = o1.method1();
		System.out.println(var1); // 3

		int var2 = o1.method1() * 2;

		String var3 = o1.method2();
		System.out.println(var3); // hello

		String var4 = o1.method2() + "java";
		System.out.println(var4); // hellojava

		System.out.println(o1.method2()); // hello
	}
}
