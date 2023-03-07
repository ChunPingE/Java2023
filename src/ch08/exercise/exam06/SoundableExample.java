package ch08.exercise.exam06;

public class SoundableExample {
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	public static void main(String[] args) {
		printSound(new Cat()); //야옹
		printSound(new Dog()); //멍멍
	}
}
