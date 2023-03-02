package ch06.lecture.p04static;

public class MyClass05 {
	// instance filed
	String name;

	// static filed
	static String model;

	// instance method
	void printName() {
		System.out.println(name);
		System.out.println(model);
	}

	// static method
	static void printModel() {
		System.out.println(model);
		// System.out.println(name); 불가능
	}
}