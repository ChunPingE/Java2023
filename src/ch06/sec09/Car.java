package ch06.sec09;

public class Car {
	// 필드선언
	String model;
	int speed;

	// 생성자 선언
	public Car(String model) {
		this.model = model;
	}

	// 메소드 선언
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	// this생략가능
	void run() {
		this.setSpeed(100);
		System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h)");
	}
}
