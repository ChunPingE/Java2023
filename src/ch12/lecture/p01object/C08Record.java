package ch12.lecture.p01object;

public class C08Record {
	public static void main(String[] args) {
		MyClass08 o1 = new MyClass08("son", 33);
	}
}

class MyClass08 {
	private final String name;
	private final int age;

	public MyClass08(String name, int age){
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "MyClass07 [name=" + name + ", age=" + age + "]";
	}
}
