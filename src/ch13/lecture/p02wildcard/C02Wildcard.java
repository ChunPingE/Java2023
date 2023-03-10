package ch13.lecture.p02wildcard;

public class C02Wildcard {
	public static void main(String[] args) {
		// 값이 나갈때(out) super
		MyClass02<? super String> o1 = new MyClass02<String>();
		o1.item = new String(); // String 또는 그 하위타입 대입가능
		// String s1 = o1.item; // String에 할당불가
		
		// 값이 나갈때(out) super
		MyClass02<? super Number> o3 = new MyClass02<Number>();
		o3.item = new Integer(5);
		o3.item = new Double(5);
		//T가 Number또는 그 상위에 잇는거니까 하위클래스 넣는게 가능함.
		//Object가 될수도 잇으니 Number n1 = 에 담는건 불가능
		
		// 값이 들어올때(in) extends
		MyClass02<? extends String> o2 = new MyClass02<String>();
		// o2.item = new String(); // String 또는 그 하위타입 대입불가능
		String s2 = o2.item; // String에 할당 가능
		
		MyClass02<? extends Number> o4 = new MyClass02<Number>();
		// o2.item = new String(); // String 또는 그 하위타입 대입불가능
		Number s3 = o4.item;
		Object s4 = o4.item;
	}
}

class MyClass02<T> {
	public T item;
}
