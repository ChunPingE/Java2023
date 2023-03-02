package ch06.lecture.p07constructor;

public class C03Constructor {
	public static void main(String[] args) {
		MyClass03 o1 = new MyClass03();
		MyClass03 o2 = new MyClass03();
		
		o1.descript(); //이름: son, 나이: 77
		o2.descript(); //이름: son, 나이: 77
	}
}
