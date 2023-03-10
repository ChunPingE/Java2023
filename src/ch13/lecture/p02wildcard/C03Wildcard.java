package ch13.lecture.p02wildcard;

public class C03Wildcard {
	public static void main(String[] args) {
		//<? super Number>
		//Number item; 혹은 Object item만 가능
		MyClass03<? super Number> o1 = null;
		o1 = new MyClass03<Number>();
		MyClass03<? super Number> o2 = new MyClass03<Object>();
		
		//o1.item = new Number(); 되는데 추상이라 안됨
		o1.item = new Integer(5);
		o2.item = new Double(5);
		
		MyClass03<? extends Number> o3 = new MyClass03<Number>();
		MyClass03<? extends Number> o4 = new MyClass03<Integer>();
		MyClass03<? extends Number> o6 = new MyClass03<Double>();
		
		Number n1 = o4.item;
		Object o5 = o4.item;
		//Integer i1 = o4.item; 불가능
		
		MyClass03<? extends Integer> o7 = new MyClass03<Integer>();
		Integer i1 = o7.item;
	}
}

class MyClass03<T> {
	public T item;
}
