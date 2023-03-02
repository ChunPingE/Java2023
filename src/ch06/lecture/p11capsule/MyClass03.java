package ch06.lecture.p11capsule;

public class MyClass03 {
	private String name;
	private int age;
	private String address;
	private boolean married;
	
	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	// 메소드 통해서 필드에 접근하도록 설정
	// 쓸때 : public void set필드이름()
	public void setName(String name) {
		//변경
		this.name = name;
	}

	// 읽을때 : public void get필드이름()
	public String getName() {
		//읽기
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
