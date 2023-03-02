package ch06.lecture.p11capsule;

public class C01Encapulation {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();
		//o1.age = 1;
		//o1.age = -1;
		
		o1.setAge(3);
		o1.desc(); //나이는: 3입니다.
		o1.setAge(-1);
		o1.desc(); //나이는: 0입니다.
		
	}
}
