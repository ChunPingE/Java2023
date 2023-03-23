package ch14.exercise.exam02;

public class ThreadExample2 {
	public static void main(String[] args) {
		Thread thread1 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 3; i++) {
					System.out.println("음악을 재생합니다.");
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		thread1.start();

		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 3; i++) {
				System.out.println("동영상을 재생합니다.");
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		thread2.start();
	}
}
