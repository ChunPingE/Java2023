package ch18.lecture.p03inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class C04InputStream {
	public static void main(String[] args) {
		try (InputStream is = new FileInputStream("output/output6.txt")) {

			byte[] arr = new byte[5];

			int len = 0;
			while ((len = is.read(arr)) != -1) {
				System.out.println(Arrays.toString(arr));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
}
