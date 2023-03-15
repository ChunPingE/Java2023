package ch15.lecture.p03set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class C05Contains {
	public static void main(String[] args) {
		Set<Book> set = new HashSet<>();
		set.add(new Book("slamdunk"));
		set.add(new Book("avatar"));
		set.add(new Book("topgun"));
		set.add(new Book("slamdunk")); //안들어감

		System.out.println(set.size()); //3

		System.out.println(set.contains(new Book("avatar"))); // true
	}
}

class Book {
	private String title;

	public Book(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(title, other.title);
	}
}
