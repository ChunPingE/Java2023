package ch06.lecture.p04static;

public class MyClass02 {
	// static filed (class filed)
	static String name;
	static int age;

	// static method (class method)
	static void greeting() {
		System.out.println(age + "살" + name + "입니다.");
	}
}