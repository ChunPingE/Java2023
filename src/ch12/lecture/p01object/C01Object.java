package ch12.lecture.p01object;

import java.util.ArrayList;
import java.util.Scanner;

public class C01Object {
	public static void main(String[] args) {
		//Object
		//모든 클래스의 상위클래스
		
		String s1 = "java";
		Object o1 = s1; 
		
		Scanner sc = new Scanner("");
		Object o2 = sc;
		
		ArrayList list = new ArrayList();
		Object o3 = list;
		
		C01Object o4 = new C01Object();
		Object o5 = o4;
		
		Object o6 = new MyClass01();
		
		int i = 3;
		Object o7 = i;
		
	}
}

// extends Object 생략 됨
class MyClass01 {}
