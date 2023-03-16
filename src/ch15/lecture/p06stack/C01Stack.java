package ch15.lecture.p06stack;

import java.util.Stack;

public class C01Stack {
	public static void main(String[] args) {
		// LIFO(Last In First Out), 후입선출, Stack
		// 주요메소드
		// push : 새 아이템 추가
		// pop : 아이템 꺼내기(삭제)

		Stack<String> stack = new Stack<>();

		stack.push("backho");
		stack.push("chisoo");
		stack.push("taesup");
		stack.push("daeman");
		stack.push("taewoong");

		System.out.println(stack.size()); // 5

		String s1 = stack.pop();
		System.out.println(s1); // taewoong

		while (stack.size() > 0) {
			System.out.println(stack.pop());
		}
	}
}
