package ch18.sec03.exam02;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class ReadExample2 {
	public static void main(String[] args) {
		// 읽을 파일 크기 : 3bytes
		try (InputStream is = new FileInputStream("output/test2.db")) {

			byte[] data = new byte[5]; // {0, 0, 0, 0, 0}

			System.out.println(Arrays.toString(data)); //[0, 0, 0, 0, 0]
			is.read(data);
			System.out.println(Arrays.toString(data)); //[10, 20, 30, 0, 0]
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
