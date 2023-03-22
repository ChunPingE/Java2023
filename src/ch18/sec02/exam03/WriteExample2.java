package ch18.sec02.exam03;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {
	public static void main(String[] args) {
		try (OutputStream os = new FileOutputStream("output/test4.db")) {

			byte[] array = { 10, 20, -1, 40, 50 };

			os.write(array);

			os.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
