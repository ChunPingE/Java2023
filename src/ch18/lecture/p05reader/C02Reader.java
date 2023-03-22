package ch18.lecture.p05reader;

import java.io.FileReader;
import java.io.Reader;
import java.util.Arrays;

public class C02Reader {
	public static void main(String[] args) {
		String name = "output/writer2.txt";
		try (Reader rd = new FileReader(name);) {

			System.out.println((char) rd.read());
			System.out.println((char) rd.read());
			System.out.println((char) rd.read());

			char[] data = new char[5];

			while (true) {
				int num = rd.read(data);
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
