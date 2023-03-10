package ch09.lecture.p02anonymous;

public class C06Anonymous {
	public static void main(String[] args) {
		class Sub06 extends MyClass06 {
			@Override
			void myMethod() {
				System.out.println("로컬 클래스 재정의1");
			}
		}
		
		MyClass06 o1 = new Sub06();
		method1(o1);
		
		MyClass06 o2 = new MyClass06() {
			@Override
			void myMethod() {
				System.out.println("로컬 클래스 재정의2(익명클래스)");
			}
		};
		method1(o2);
		
		method1(new MyClass06() {
			@Override
			void myMethod() {
				System.out.println("로컬 클래스 재정의3(익명클래스, 아규먼트)");
			}
		});
	}

	public static void method1(MyClass06 param) {
		param.myMethod();
	}
}

abstract class MyClass06 {
	abstract void myMethod();
}
