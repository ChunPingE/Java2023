package ch15.lecture.p03set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C04Contains {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("java");
		set.add("css");
		set.add("jsp");
		set.add("html");
		
		//contains : 해당 원소가 이미 있는지?
		System.out.println(set.contains("java")); //true
		System.out.println(set.contains("jsp")); //true
		System.out.println(set.contains("python")); //false
	}
}
