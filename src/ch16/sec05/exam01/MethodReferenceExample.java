package ch16.sec05.exam01;

public class MethodReferenceExample {
	public static void main(String[] args) {
		Person person = new Person();
		
		person.action(new Calculabe() {
			@Override
			public double calc(double x, double y) {
				double result = Computer.staticMethod(x, y);
				return result;
			}
		});
		
		// 정적메소드 일경우
		person.action((x, y) -> Computer.staticMethod(x, y));
		person.action(Computer::staticMethod);

		// 인스턴스 메소드일 경우
		Computer com = new Computer();
		person.action((x,y) -> com.instanceMethod(x, y));
		person.action(com::instanceMethod);
	}
}
