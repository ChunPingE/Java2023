package ch07.exercise.exam07;

public class Child extends Parent {
	public String name;

	public Child() {
		this("홍길동");
		System.out.println("Child() call"); //4번

	}

	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call"); //3번
	}
}
