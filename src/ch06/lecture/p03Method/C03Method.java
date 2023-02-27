package ch06.lecture.p03Method;

public class C03Method {
	public static void main(String[] args) {
		MyClass03 o1 = new MyClass03();
		MyClass03 o2 = new MyClass03();
		
		o1.greeting(); //저는 null입니다.
		o1.name = "son";
		o1.greeting(); //저는 son입니다.
		
		o2.greeting(); //저는 null입니다.
		o2.name = "kim";
		o2.greeting();
	}
}
