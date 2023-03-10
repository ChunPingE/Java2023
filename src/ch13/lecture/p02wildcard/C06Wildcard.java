package ch13.lecture.p02wildcard;

public class C06Wildcard {
	public static void main(String[] args) {
		MyClass06<Object> o1 = new MyClass06<Object>();
		//MyClass06<Object> o2 = new MyClass06<Stirng>();

		MyClass06<?> o3 = new MyClass06<Object>();
		MyClass06<?> o4 = new MyClass06<String>();
	}
}

class MyClass06<T> {
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}
