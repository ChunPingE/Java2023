package ch18.sec03.exam01;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {
	public static void main(String[] args) {
		try (InputStream is = new FileInputStream("output/test4.db")) {

			byte[] data = new byte[100];

			while (true) {
				int num = is.read(data);
				if (num == -1) {
					break;
				}
				for (int i = 0; i < num; i++) {
					System.out.println(data[i]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
