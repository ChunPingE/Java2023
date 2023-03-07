package ch07.lecture.p09protected.package2;

import ch07.lecture.p09protected.package1.Super01;

public class Sub01 extends Super01{
	public void Method2() {
		method01(); // 자식이라 됨
	}
	
	public void Method3() {
		Super01 o1Super01 = new Super01();
		//o1.method01(); //다른패키지라 안됨
	}
}
