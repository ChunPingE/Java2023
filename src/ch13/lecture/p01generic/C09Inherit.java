package ch13.lecture.p01generic;

public class C09Inherit {
	public static void main(String[] args) {
		
	}
}

class Super09<T> {}
class Sub09<T> extends Super09<T> {}

class Super10<T, U> {}
class Sub10<T, U> extends Super10<T, U> {}

//명시하면 자식엔 작성안해줘도됨
class Super11<T> {}
class Sub011 extends Super11<String> {}

class Super12<T, U> {}
class Sub12<T> extends Super12<T, String> {}

//자식타입에서 필요하면 늘릴수도 있다.
class Super13<T> {}
class Sub13<T, U> extends Super13<T> {}

//부모보다 상위타입으로 제한 불가능하다.
class Super14<T extends Number> {}
//class Sub14<T extends Object> extends Super14<T> {}
class Sub14<T extends Integer> extends Super14<T> {}



