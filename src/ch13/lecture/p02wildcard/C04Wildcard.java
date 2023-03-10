package ch13.lecture.p02wildcard;

public class C04Wildcard {
	
	public static void main(String[] args) {
		MyClass04<Number> o1 = new MyClass04<>();
		o1.setItem(5);
		printItem(o1);
		
		MyClass04<Integer> o2 = new MyClass04<>();
		o2.setItem(5);
		printItem(o2);
		
		MyClass04<Double> o3 = new MyClass04<>();
		o3.setItem(3.14);
		printItem(o3);
	}
	
	public static void printItem(MyClass04<? extends Number> param) {
		//들어오는게 Number 또는 그 하위타입이니
		//Number또는 그 상위로 읽는 게 가능
		Number num = param.getItem();
		System.out.println(num.doubleValue() * num.doubleValue() );
	}
}
class MyClass04<T>{
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}
