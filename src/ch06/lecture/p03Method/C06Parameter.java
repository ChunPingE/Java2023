package ch06.lecture.p03Method;

public class C06Parameter {
	public static void main(String[] args) {
		//자동 형변환
		int a = 3;
		long b = a;
		double c = b;
		
		MyClass06 o1 = new MyClass06();
		o1.method1(33);
		o1.method1('c'); //가능
		
		o1.method2(29979844546497987L);
		o1.method2(33); //가능
		o1.method2('d'); //가능
		
		o1.method3(3.14);
		o1.method3(165456465456456L);
		o1.method3(55);
		
		o1.method4(3.14f);
		o1.method4(123456L);
		o1.method4(99);
		// o1.method4(3.14); 불가능
		
	}
}
