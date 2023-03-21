package ch11.exercise.exam07;

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			login("blue", "54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void login(String id, String password) throws NonExistIDException, WrongPasswordException {
		// id가 blue가 아니라면 NotExistIDException을 발생
		if (!id.equals("blue")) {
			throw new NonExistIDException("아이디가 존재하지 않습니다.");
		}
		if (!password.equals("12345")) {
			throw new WrongPasswordException("패스워드가 틀립니다.");
		}
	}
}
