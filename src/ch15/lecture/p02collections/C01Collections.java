package ch15.lecture.p02collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C01Collections {
	public static void main(String[] args) {
		//수정불가한 리스트
		List<String> list1 = List.of("java", "css", "spring", "jsp", "html");
		// 수정가능한 리스트로 다시만듬
		List<String> list2 = new ArrayList<>(list1); 
		// sort
		Collections.sort(list2);
		System.out.println(list2);
		//[css, html, java, jsp, spring]
		
		//max
		String maxStr = Collections.max(list2);
		System.out.println(maxStr); //spring
		
		//min
		String minStr = Collections.min(list2);
		System.out.println(minStr); //css
		
		//reverse
		Collections.reverse(list2);
		System.out.println(list2);
		//[spring, jsp, java, html, css]
		
		//fill
		Collections.fill(list2, "web");
		System.out.println(list2);
		//[web, web, web, web, web]
	}
}
