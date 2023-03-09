package ch12.lecture.p01object;

public class C15HashCode {
	public static void main(String[] args) {
		Object o1 = new MyClass15();
		Object o2 = new MyClass15();
		
		int h1 = o1.hashCode();
		int h2 = o2.hashCode();
		
		System.out.println(h1); //617901222
		System.out.println(h2); //1159190947
	}
}

class MyClass15 {
	
}