package ch13.lecture.p01generic;

import java.util.Scanner;

public class C02Generic {
	public static void main(String[] args) {
		//T가 String이 되는 것임
		MyClass02<String> o1 = new MyClass02<String>();
		o1.setItem("java");
		String s1 = o1.getItem();
		System.out.println(s1.length());
		
		MyClass02<Scanner> o2 = new MyClass02<Scanner>();
		o1.setItem("");
		Scanner sc = o2.getItem();
		sc.hasNext();
		
		MyClass02<Integer> o3 = new MyClass02<Integer>();
		o3.setItem(3); //autoboxing
		int i = o3.getItem(); //unboixng
		System.out.println(i);
	}
}

// generic type 
// T : type parameter
// 작성 관습 : 대문자 한글자
class MyClass02<T> {
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}
