package ch12.lecture.p01object;

public class C16HashCode {
	public static void main(String[] args) {
		Object o1 = new MyClass16();
		Object o2 = new MyClass16();
		
		int h1 = o1.hashCode();
		int h2 = o2.hashCode();
		
		System.out.println(h1); //99
		System.out.println(h2); //99
	}
}

class MyClass16 {
	@Override
	public int hashCode() {
		return 99;
	}
}