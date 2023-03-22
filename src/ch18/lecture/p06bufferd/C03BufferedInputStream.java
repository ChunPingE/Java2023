package ch18.lecture.p06bufferd;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class C03BufferedInputStream {
	public static void main(String[] args) {

		String name = "output/buffered1.txt";
		try (InputStream fis = new FileInputStream(name);
				InputStream is = new BufferedInputStream(fis);) {

			long start = System.nanoTime();
			while (true) {
				int data = is.read();
				if (data == -1) {
					break;
				}
			}
			long end = System.nanoTime();
			System.out.println(end - start + "ns"); // 23932700ns

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
