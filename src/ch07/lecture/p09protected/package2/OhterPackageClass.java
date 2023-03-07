package ch07.lecture.p09protected.package2;

import ch07.lecture.p09protected.package1.Super01;

public class OhterPackageClass {
	public void someMethod() {
		Super01 o1 = new Super01();
		//o1.method01(); // 다른패키지여서 안됨
	}
}
