package ch18.lecture.p07print;

import java.io.*;

public class C02PrintStream {
	public static void main(String[] args) {
		String name = "output/print2.txt";

		try (PrintStream ps = new PrintStream(name)) {
			
			ps.println(99999);
			ps.println(9.99999999);
			ps.println(false);
			ps.println("hello world");
			ps.println("더 글로리");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
