package ch11.exercise.exam07;

public class WrongPasswordException extends Exception {
	public WrongPasswordException() {
	}
	
	public WrongPasswordException(String message) {
		super(message);
	}
}
