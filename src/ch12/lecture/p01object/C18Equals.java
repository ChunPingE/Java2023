package ch12.lecture.p01object;

public class C18Equals {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = o1;
		
		System.out.println(o1.hashCode()); //1554547125
		System.out.println(o2.hashCode()); //617901222
		System.out.println(o3.hashCode()); //1554547125
		
		System.out.println(o1.equals(o3)); //true
		System.out.println(o1.equals(o2)); //false
	}
}