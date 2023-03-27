package ch12.sec12;

import java.lang.reflect.*;

public class PrintAnnotationExample {
	public static void main(String[] args)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		for (Method method : declaredMethods) {
			// PrintAnnotaion 얻기
			PrintAnnotation printAnnotaion = method.getAnnotation(PrintAnnotation.class);

			// 설정 정보를 이용해서 선출력
			printLine(printAnnotaion);

			// 메소드 호출
			method.invoke(new Service());

			// 설정 정보를 이용해서 선출력
			printLine(printAnnotaion);
		}
	}

	public static void printLine(PrintAnnotation printAnnotation) {
		if (printAnnotation != null) {
			// number 속성값 얻기
			int number = printAnnotation.number();
			for (int i = 0; i < number; i++) {
				// value 속성값 얻기
				String value = printAnnotation.value();
				System.out.print(value);
			}
			System.out.println();
		}
	}
}
