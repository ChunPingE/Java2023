package ch12.lecture.p01object;

public class C11Enum {
	public static void main(String[] args) {
		System.out.println(Season.SPRING);
		System.out.println(Season.SUMMER);
		System.out.println(Season.FALL);
		System.out.println(Season.WINTER);
		
		Season s1 = Season.SPRING;
		Season s2 = Season.SUMMER;
		Season s3 = Season.FALL;
		Season s4 = Season.WINTER;
		
		System.out.println(s1.ordinal()); //0
		System.out.println(s2.ordinal()); //1
		System.out.println(s3.ordinal()); //2
		System.out.println(s4.ordinal()); //3
		
		Season s5 = Season.valueOf("SPRING");
		Season s6 = Season.valueOf("SUMMER");
		Season s7 = Season.valueOf("FALL");
		Season s8 = Season.valueOf("WINTER");
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s5)); 
		//이미 객체가만들어진거라 같은 참조값을 가진다.
	}
}

enum Season{
	//값이름 나열
	SPRING, SUMMER, FALL, WINTER
}

