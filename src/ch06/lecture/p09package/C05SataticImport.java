package ch06.lecture.p09package;

import ch06.lecture.p09package.package1.MyClass05;

// Static import
// : static멤버(filed, method)
import static ch06.lecture.p09package.package1.MyClass05.name;
import static ch06.lecture.p09package.package1.MyClass05.method1;
import static ch06.lecture.p09package.package1.MyClass05.method2;

public class C05SataticImport {
	public static void main(String[] args) {
		
		String n = name;
		
		method1();
		method2();
		
	}
}
