package ch18.lecture.p02outputstream;

import java.io.FileOutputStream;

public class C05Close {
	public static void main(String[] args) {
		// var
		String s = "java";
		var s2 = "java";

		// try-with-resources에 var사용가능
		try (var os = new FileOutputStream("")) {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
