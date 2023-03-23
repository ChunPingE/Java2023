package ch18.lecture.p06bufferd;

import java.io.*;

public class C06BufferedReader {
	public static void main(String[] args) {
		String name = "output/bufferd5.txt";
		try (FileReader fr = new FileReader(name);
				BufferedReader br = new BufferedReader(fr)) {
			
			while (true){
				String s = br.readLine();
				if(s == null) {
					break;
				}
				System.out.println(s);
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
