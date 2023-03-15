package ch15.exercise.exam08;

public class Student {
	public int studentNum;
	public String name;

	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	// 코드 작성
	@Override
	public int hashCode() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student target) {
			if (target.studentNum == studentNum) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
}
