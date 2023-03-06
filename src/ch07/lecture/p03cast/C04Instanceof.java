package ch07.lecture.p03cast;

public class C04Instanceof {
	public static void main(String[] args) {
		// instacneof 연산자
		// 연산결과 boolean
		// 왼쪽항 참조 변수, 오른쪽 항 Type
		// true : 왼쪽 항의 참조변수가 가리키는 객체가 오른쪽 항 type이면
		// 아니면 false

		Sub04 o1 = new Sub04();

		boolean b1 = o1 instanceof Sub04;
		boolean b2 = o1 instanceof Super04;
		System.out.println(b1);// true
		System.out.println(b2);// true

		Super04 o2 = new Super04();
		boolean b3 = o2 instanceof Super04;
		boolean b4 = o2 instanceof Sub04;
		System.out.println(b3);// true
		System.out.println(b4); // false
	}
}

class Sub04 extends Super04 {

}

class Super04 {

}
