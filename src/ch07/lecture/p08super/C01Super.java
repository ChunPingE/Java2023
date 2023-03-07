package ch07.lecture.p08super;

public class C01Super {
	public static void main(String[] args) {
		Sub01 o1 = new Sub01();
	}
}
class Super01{
	//이클래스로 인스턴스를 만들때 해야하는일
	public Super01() {
		System.out.println("상위 클래스 초기화 코드");
	}
}

class Sub01 extends Super01{
	public Sub01() {
		// 그전에 상위클래스의 초기화 작업을 해아함
		// 상위클래스 생성자 호출코드 다른 코드보다 밑에잇을수없음
		super(); //꼭 먼저 해야함 (작성하지 않으면 자동으로 삽입됨)
		
		//이 클래스로 인스턴스 만들때 해야하는일
		System.out.println("하위 클래스 초기화 코드");
	}
}