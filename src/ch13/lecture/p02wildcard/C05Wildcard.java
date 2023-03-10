package ch13.lecture.p02wildcard;

public class C05Wildcard {
	
	public static void main(String[] args) {
		MyClass05<Object> o1 = new MyClass05<>();
		addItem(o1);
		
		MyClass05<Number> o2 = new MyClass05<>();
		addItem(o2);
		
		MyClass05<Integer> o3 = new MyClass05<>();
		//addItem(o3); 불가능
		
		
	}
	
	public static void addItem(MyClass05<? super Number> param) {
		//들어오는게 Number 또는 그 상위타입이니
		//Number또는 그 하위로 값을 세팅하는게 가능
		param.setItem(3);
		param.setItem(3.14);
	}
}
class MyClass05<T>{
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}
