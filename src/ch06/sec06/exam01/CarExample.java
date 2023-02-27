package ch06.sec06.exam01;

public class CarExample {
	public static void main(String[] args) {
		// Car 객체 생성
		Car myCar = new Car();

		// Car객체의 필드값 읽기
		System.out.println("모델명: " + myCar.model); // null
		System.out.println("시동여부: " + myCar.start); // false
		System.out.println("현재속도: " + myCar.speed); // 0

		Car yourCar = new Car();
		System.out.println("모델명: " + yourCar.model); // null
		System.out.println("시동여부: " + yourCar.start); // false
		System.out.println("현재속도: " + yourCar.speed); // 0
	
		myCar.speed  = 100;
		System.out.println("현재속도: " + myCar.speed); // 100
		System.out.println("현재속도: " + yourCar.speed); // 0
		
		Car hisCar = yourCar;
		yourCar.speed = 50;
		System.out.println("현재속도: " + yourCar.speed); // 50
		System.out.println("현재속도: " + hisCar.speed); // 50
		
	
	
	}
}
