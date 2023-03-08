package ch12.lecture.p01object;

public class C06ToString {
	public static void main(String[] args) {
		Object o1 = new MyClass06("son", 77);
		Object o2 = new MyClass06("park", 55);
		
		System.out.println(o1.toString());
		//나이는 77살 이고 이름은: son입니다.
		System.out.println(o2.toString());
		//나이는 55살 이고 이름은: park입니다.
	}
}

class MyClass06 {
	private String name;
	private int age;
	
	public MyClass06(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "나이는 " + age + "살 이고 이름은: " + name + "입니다.";
	}
}
