package ch18.sec10;

import java.io.*;

public class ObjectInputOutputStreamExample {
	public static void main(String[] args) throws Exception {
		// FileOutputStream에 ObjectOutputStream 보조스트림연결
		FileOutputStream fos = new FileOutputStream("output.object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		// 객체 생성
		Member m1 = new Member("fall", "단풍이");
		Product p1 = new Product("노트북", 1500000);
		int[] arr1 = { 1, 2, 3 };

		// 객체를 역직렬화해서 파일에 저장
		oos.writeObject(m1);
		oos.writeObject(p1);
		oos.writeObject(arr1);

		oos.flush();
		oos.close();
		fos.close();

		// Input
		FileInputStream fis = new FileInputStream("output.object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Member m2 = (Member) ois.readObject();
		Product p2 = (Product) ois.readObject();
		int[] arr2 = (int[]) ois.readObject();

		ois.close();
		fis.close();
		
		System.out.println(m2);
		System.out.println(p2);
		System.out.println(arr2);
	}
}
