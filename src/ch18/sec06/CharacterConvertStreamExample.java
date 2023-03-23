package ch18.sec06;

import java.io.*;

public class CharacterConvertStreamExample {
	public static void main(String[] args) throws Exception {
		write("문자변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);
	}

	public static void write(String str) throws Exception {
		OutputStream os = new FileOutputStream("output/test.txt");
		Writer writer = new OutputStreamWriter(os, "UTF-8");
		writer.write(str);
		writer.flush();
		writer.close();
	}

	public static String read() throws Exception {
		InputStream is = new FileInputStream("output/test.txt");
		Reader reader = new InputStreamReader(is, "UTF-8");
		/*
		char[] data = new char[5];
		String str = "";
		while (true) {
			int num = reader.read(data);
			if (num == -1) {
				break;
			}
			str += new String(data, 0, num);
		}
		*/
		char[] data = new char[100];
		int num = reader.read(data);
		String str = new String(data, 0, num);
		reader.close();

		return str;
	}
}
