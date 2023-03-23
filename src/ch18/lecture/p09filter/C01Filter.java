package ch18.lecture.p09filter;

import java.io.*;

public class C01Filter {
	public static void main(String[] args) {
		// Stream 연결 가능
		String fileName = "output/byte1.txt";

		try (InputStream fis = new FileInputStream(fileName);
				InputStreamReader isr = new InputStreamReader(fis);
				BufferedReader br = new BufferedReader(isr);) {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
