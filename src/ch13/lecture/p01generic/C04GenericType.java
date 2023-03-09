package ch13.lecture.p01generic;


public class C04GenericType {
	public static void main(String[] args) {
		MyClass04<String, Integer> o1 = new MyClass04<>();
		o1.setItem("hello");
		o1.setItem2(99);
		
		String s1 = o1.getItem();
		int i1 = o1.getItem2(); 
		
		MyClass04<String, String> o2 = new MyClass04<>();
		o2.setItem("hello");
		o2.setItem2("world");
		
		String s2 = o2.getItem();
		String s3 = o2.getItem2(); 
	}
}


class MyClass04<T, U> {
	public T item;
	public U item2;
	
	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}
	public U getItem2() {
		return item2;
	}
	public void setItem2(U item2) {
		this.item2 = item2;
	}
}
