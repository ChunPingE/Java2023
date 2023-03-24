package ch14.lecture.p05concurrency;

public class C02Concurrency {
	// sycronized 블록 동기화블록
	// intrinsic lock
	// monitor lock
	// monitor
	// lock
	static int field = 0;

	public static void main(String[] args) {
		Object o = new Object();
		Thread a = new Thread(() -> {
			for (int i = 0; i < 100000; i++) {
				synchronized (o) {
					field++;
				}
			}
		});

		Thread b = new Thread(() -> {
			for (int i = 0; i < 100000; i++) {
				synchronized (o) {
					field++;
				}
			}
		});

		a.start();
		b.start();

		try {
			a.join();
			b.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(field);
	}
}
