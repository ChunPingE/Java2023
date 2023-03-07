package ch08.lecture.p02abstract_method;

public class C01Interface {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();
		MyInterface01 o2 = o1;
		
		MyInterface01 o3 = new MyClass01();
		
		o1.method1();
		o1.method2();
		
		System.out.println();
		
		o2.method1(); //실제 인스턴스메소드가 실행됨.
		//o2.method2(); 당연히 불가능
	}
}
