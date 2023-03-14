package ch16.sec05.exam02;

public class MethodReferenceExample {
	public static void main(String[] args) {
		Person person = new Person();

		person.ordering(new Compareable() {
			@Override
			public int compare(String a, String b) {
				int result = a.compareToIgnoreCase(b);
				return result;
			}
		});
		
		person.ordering((a, b) -> a.compareToIgnoreCase(b));
		
		person.ordering(String::compareToIgnoreCase);
	}
}
