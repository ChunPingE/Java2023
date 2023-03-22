package ch18.lecture.p06bufferd;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class C01BufferedOutputStream {
	public static void main(String[] args) {

		String name = "output/buffered1.txt";
		try (OutputStream fos = new FileOutputStream(name);
				OutputStream os = new BufferedOutputStream(fos);) {

			long start = System.nanoTime();
			for (int i = 0; i < 1000000; i++) {
				os.write(1);
			}
			os.flush();
			long end = System.nanoTime();
			System.out.println((end - start) + "ns"); // 23197800ns

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
