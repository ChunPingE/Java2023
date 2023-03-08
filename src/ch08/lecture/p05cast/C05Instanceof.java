package ch08.lecture.p05cast;

import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;

public class C05Instanceof {
	public static void main(String[] args) {
		method("java"); //모두 true
		method(new StringBuilder("java")); //구현한거는 다 true
		method(new StringBuffer(""));
	}
	
	public static void method(CharSequence c) {
		System.out.println(c instanceof String);
		System.out.println(c instanceof Object);
		System.out.println(c instanceof Serializable);
		System.out.println(c instanceof CharSequence);
		System.out.println(c instanceof Comparable);
		System.out.println(c instanceof Constable);
		System.out.println(c instanceof ConstantDesc);
	}
}
