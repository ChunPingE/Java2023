package ch11.lecture.p05custom;

public class C03CustomException {
	public static void main(String[] args) throws Exception {
		MyException1 e = new MyException1();
		MyException1 e1 = new MyException1("some message");

		throw e1;
	}
}

class MyException1 extends Exception {
	public MyException1() {
	}

	public MyException1(String message) {
		super(message);
	}
}
