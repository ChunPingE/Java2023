package ch06.sec08.exam03;

public class CarExample {
	public static void main(String[] args) {
		//Car객체 생성
		Car myCar = new Car();
		
		//리턴값이 없는 setGas()메소드 호출
		myCar.setGas(5);
		
		//isLeftGas()메소드를 호출해서 리턴값이 true일경우 if블록실행
		if(myCar.isLeftGas()) {
			System.out.println("출발합니다.");
			
			myCar.run();
		}
		
		System.out.println("gas를 주입하세요");
	}

}
