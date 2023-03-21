package ch11.exercise.exam07;

public class NonExistIDException extends Exception {
	public NonExistIDException() {
	}
	
	public NonExistIDException(String message) {
		super(message);
	}
}
