package ch18.exercise.exam10;

import java.io.*;
import java.util.*;

public class Exmaple {
	public static void main(String[] args) {

		// 파일명 입력받는 코드(option)
		Scanner sc = new Scanner(System.in);

		System.out.print("원본 파일 경로: ");
		String origin = sc.nextLine();

		System.out.print("복사 파일 경로: ");
		String target = sc.nextLine();

		File originFile = new File(origin);

		if (originFile.exists() == false) {
			System.out.println("원본 파일이 존재하지 않습니다.");
			System.exit(0);
		}

		// 복사 파일 경로상에 없는 모든 디렉토리 생성
		File targetFile = new File(target);
		//부모파일 얻기
		File parentFile = targetFile.getParentFile();
		if (parentFile.exists() == false) {
			parentFile.mkdirs();
		}

		try (InputStream is = new FileInputStream(originFile);
				BufferedInputStream bis = new BufferedInputStream(is);
				OutputStream os = new FileOutputStream(targetFile);
				BufferedOutputStream bos = new BufferedOutputStream(os);) {

			byte[] data = new byte[1024];
			while (true) {
				int len = bis.read(data);
				if (len == -1) {
					break;
				}
				os.write(data, 0, len);
			}
			System.out.println("복사가 성공되었습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
