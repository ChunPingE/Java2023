package ch12.lecture.p01object;

import java.util.Objects;

public class C22HashCodeEquals {
	public static void main(String[] args) {
		Object o1 = new MyClass22(1, "kim", "seoul", false);
		Object o2 = new MyClass22(1, "kim", "seoul", false);
		
		System.out.println(o1.hashCode()); //1293458344
		System.out.println(o2.hashCode()); //1293458344
		System.out.println(o1.equals(o2)); //true
	}
}

class MyClass22 {
	private int id;
	private String name;
	private String address;
	private boolean married;

	public MyClass22(int id, String name, String address, boolean married) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.married = married;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, id, married, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyClass22 other = (MyClass22) obj;
		return Objects.equals(address, other.address) && id == other.id && married == other.married
				&& Objects.equals(name, other.name);
	}
}
