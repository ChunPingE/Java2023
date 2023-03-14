package ch15.sec02.exam03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		//ArrayList생성
		List<String> list1 = new ArrayList<>();
		
		//LinkedList생성
		List<String> list2 = new LinkedList<>();
		
		//시작시간 끝시간
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList걸린시간: " + (endTime - startTime));
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList걸린시간: " + (endTime - startTime));
	}
}
