package ch18.lecture.p05reader;

import java.io.FileReader;
import java.io.Reader;
import java.util.Arrays;

public class C03Reader {
	public static void main(String[] args) {
		String name = "output/writer2.txt";
		try (Reader rd = new FileReader(name);) {

			char[] data = new char[5];

			while (true) {
				int len = rd.read(data);
				if (len == -1) {
					break;
				}
				System.out.println(new String(data, 0, len));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
