package ch06.sec10.exam03;

public class Car {
	// 인스턴스 필드 선언
	int speed;

	// 인스턴스 메소드 선언
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}

	static void simulate() {
		// 객체생성
		Car myCar = new Car();
		// 인스턴스 멤버 사용
		myCar.speed = 200;
		myCar.run(); // 200으로 달립니다.
	}

	public static void main(String[] args) {
		// 정적메소드호출
		Car.simulate();

		// 객체생성
		Car myCar = new Car();
		// 인스턴스 멤버 사용
		myCar.speed = 60;
		myCar.run(); // 60으로 달립니다.
	}
}
