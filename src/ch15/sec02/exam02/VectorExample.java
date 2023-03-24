package ch15.sec02.exam02;

import java.util.*;

public class VectorExample {
	public static void main(String[] args) {
		//Vector 컬렉션 생성
		List<Board> list = new Vector<>();
		
		//작업 스레드 객체 생성
		Thread threadA = new Thread(()->{
			for (int i = 0; i < 1000; i++) {
				list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
			}
		});
		
		Thread threadB = new Thread(()->{
			for (int i = 0; i < 1000; i++) {
				list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
			}
		});
		
		threadA.start();
		threadB.start();
		
	
		try {
			threadA.join();
			threadB.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		int size = list.size();
		System.out.println("총 객체 수:" + size);
		System.out.println();
	}

}
