package ch18.lecture.p06bufferd;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class C02OutputStream {
	public static void main(String[] args) {

		String name = "output/buffered2.txt";
		try (OutputStream fos = new FileOutputStream(name);) {

			long start = System.nanoTime();
			for (int i = 0; i < 1000000; i++) {
				fos.write(1);
			}
			long end = System.nanoTime();
			System.out.println((end - start) + "ns"); //4546134600ns

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
