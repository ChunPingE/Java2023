package ch18.lecture.p03inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class C02InputStream {
	public static void main(String[] args) {
		try (InputStream is = new FileInputStream("output/test3.db")) {

			int data = 0;

			while ((data = is.read()) != -1) {
				System.out.println(data);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
}
