package ch06.lecture.p07constructor;

public class C08Overloading {
	public static void main(String[] args) {
		MyClass08 o1 = new MyClass08("son", 33, "01-02", false);
		MyClass08 o2 = new MyClass08("son", 33, null, false);
		
		o2.birthDate = "01-02";
		
		MyClass08 o3 = new MyClass08("son", 33, false);
	}
}
