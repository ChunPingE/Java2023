package ch18.lecture.p06bufferd;

import java.io.FileInputStream;
import java.io.InputStream;

public class C04InputStream {
	public static void main(String[] args) {

		String name = "output/buffered1.txt";
		try (InputStream fis = new FileInputStream(name);) {

			long start = System.nanoTime();
			while (true) {
				int data = fis.read();
				if (data == -1) {
					break;
				}
			}
			long end = System.nanoTime();
			System.out.println(end - start + "ns"); // 3959312900ns

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
