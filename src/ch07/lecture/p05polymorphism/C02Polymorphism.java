package ch07.lecture.p05polymorphism;

import java.math.BigDecimal;

public class C02Polymorphism {
	public static void main(String[] args) {
		Integer i1 = new Integer("66");
		printIntger(i1);
		
		Double d2 = new Double(3.14);
		printIntger(d2);
		
		BigDecimal b2 = new BigDecimal(3.1415);
		printIntger(b2);
	}

	public static void printIntger(Number n) {
		int intNum = n.intValue();
		System.out.println(intNum);
	}
}
