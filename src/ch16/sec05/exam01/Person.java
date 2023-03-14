package ch16.sec05.exam01;

public class Person {
	public void action(Calculabe calculabe) {
		double result = calculabe.calc(10, 4);
		System.out.println("결과: " + result);
	}
}
