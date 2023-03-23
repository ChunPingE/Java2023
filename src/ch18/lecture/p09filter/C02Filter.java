package ch18.lecture.p09filter;

import java.io.*;

public class C02Filter {
	public static void main(String[] args) {
		// Stream 연결 가능
		String fileName = "output/byte1.txt";

		try (OutputStream fos = new FileOutputStream(fileName);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				OutputStreamWriter osw = new OutputStreamWriter(bos)) {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
