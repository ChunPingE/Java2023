package ch06.lecture.p02field;

public class C03Field {
	public static void main(String[] args) {
		MyClass03 var1 = new MyClass03();
		MyClass03 var2 = new MyClass03();
		
		System.out.println(var1.name);
		System.out.println(var1.height);
		

		
		//초기화되지 않은 변수 사용불가
		/*
		int a;
		System.out.println(a);
		*/
	}
}
