package ch12.lecture.p01object;

public class C03ToString {
	public static void main(String[] args) {
		MyClass03 o1 = new MyClass03();
		String s1 = o1.toString();
		System.out.println(s1);
		
		Object o2 = o1;
		System.out.println(o2.toString());
		//같은객체니 같은게 나옴
		System.out.println(System.identityHashCode(o2));
		
		Object o3 = new MyClass03();
		System.out.println(o3.toString());
		//다른객체니 다른게 나옴
	}
}

class MyClass03 {}
