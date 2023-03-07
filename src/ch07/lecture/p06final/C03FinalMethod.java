package ch07.lecture.p06final;

public class C03FinalMethod {
	public static void main(String[] args) {
		
	}

}
class Super03{
	public void method1() {
	}
	
	public final void method2() {
	}
}

class Sub03 extends Super03 {
	@Override
	public void method1() {
		System.out.println("재정의");
	}
	/*
	@Override
	public void method2() {
		System.out.println("재정의불가능");
	}
	*/
}