package ch12.lecture.p01object;

import java.util.HashSet;
import java.util.Set;

public class C23HashCodeEquals {
	public static void main(String[] args) {
		// 중복 없는 원소들의 모임(Collection)
		Set set = new HashSet();
		System.out.println(set.size()); // 0
		set.add(100);
		System.out.println(set.size()); // 1
		set.add(200);
		System.out.println(set.size()); // 2
		//존재하지 않으면추가
		//이미 있으니가 안들어감
		set.add(100);
		System.out.println(set.size()); // 2
	}
}
