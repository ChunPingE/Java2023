package ch12.lecture.p06annotation;

import java.lang.annotation.*;

public class C03Annotation {
	public static void main(String[] args) {

	}
}

//@MyAnnotation03
class MyClass03 {
	@MyAnnotation03
	String filed;

	//@MyAnnotation03
	public MyClass03() {
	}	
	
	@MyAnnotation03
	public void method1() {
	}
}

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation03 {
}