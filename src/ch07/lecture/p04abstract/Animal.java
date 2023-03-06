package ch07.lecture.p04abstract;

//추상클래스 (abstract class)
//이 클래스로 인스턴스를 만들 수 없음.
public abstract class Animal {
	public void see() {
		System.out.println("눈으로 봅니다.");
	}
	
	//추상메소드(abstract method)
	//몸통(body)없는 메소드
	//추상메소드가 있는 클래스는 추상 클래스이어야한다.
	//상속받는 클래스에서 무조건 재정의해야한다.
	abstract void breath();
}
