package ch06.lecture.p10access;

public class C04Singleton {
	public static void main(String[] args) {
		//인스턴스 여러개 만들기 가능
		//각각의 참조값을 가짐.
		MyClass04 o1 = new MyClass04();
		MyClass04 o2 = new MyClass04();
		
		System.out.println(System.identityHashCode(o1)); //617901222
		System.out.println(System.identityHashCode(o2)); //1159190947
		
		MyClass05 o3 = MyClass05.getInstance();
		MyClass05 o4 = MyClass05.getInstance();
		
		System.out.println(System.identityHashCode(o3)); //798154996
		System.out.println(System.identityHashCode(o4)); //798154996
	}
}