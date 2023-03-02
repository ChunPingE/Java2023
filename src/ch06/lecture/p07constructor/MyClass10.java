package ch06.lecture.p07constructor;

public class MyClass10 {
	String name;
	int age;
	String birth;

	public MyClass10(String name) {
		this.name = name;
	}

	public MyClass10(String name, int age) {
		this(name); // 다른생성자호출
		//this.name = name;
		this.age = age;
	}
	
	public MyClass10(String name, int age, String birth) {
		this(name, age); // 다른생성자호출
		//this.name = name;
		//this.age = age;
		this.birth = birth;
	}
	
	void printField() {
		System.out.printf("name: %s, age: %d, birth: %s\n", name, age, birth);
	}


}
