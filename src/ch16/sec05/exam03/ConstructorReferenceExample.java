package ch16.sec05.exam03;

public class ConstructorReferenceExample {
	public static void main(String[] args) {
		Person person = new Person();
		person.getMember1(new Createable1() {
			@Override
			public Member create(String id) {
				Member member = new Member(id);
				return member;
			}
		});

		Member m1 = person.getMember1(id -> new Member(id));
		System.out.println(m1);
		Member m2 = person.getMember1(Member::new);
		System.out.println(m2);
		
		person.getMember2((id, name) -> new Member(id, name));
		Member m3 = person.getMember2(Member::new);
		System.out.println(m3);
	}
}
