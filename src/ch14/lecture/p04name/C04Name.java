package ch14.lecture.p04name;

public class C04Name {
	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {
			Thread t = Thread.currentThread();
			System.out.println(t.getName());
		}, "작업스레드1");
		
		t1.start();
	}
}
