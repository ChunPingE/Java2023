package ch13.lecture.p01generic;

import java.util.Scanner;

public class C04Diamond {
	public static void main(String[] args) {
		MyClass03<String> o1 = new MyClass03<String>();
		
		//인스턴스 만드는 타입의 아규먼트 생략가능
		// 다이아몬드처럼 생겨서 다이아몬드 표기법이라고 한다.
		MyClass03<String> o2 = new MyClass03<>();
	}
}


class MyClass03<T> {
	public T item;
}
