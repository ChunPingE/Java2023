package ch17.lecture.p03intermediate;

import java.util.List;
import java.util.stream.Stream;

public class C11Map {
	public static void main(String[] args) {
		List<Book> list = List.of(
				new Book("salmdunk", 3000),
				new Book("avatar", 4000),
				new Book("theh glory", 5000),
				new Book("avengers", 2000));

		int sum = list.stream()
				.map(b -> b.getPrice())
				.reduce((a, b) -> a + b)
				.get();

		System.out.println(sum); //14000

		double avg = list.stream()
				.mapToInt(Book::getPrice)
				.average()
				.getAsDouble();

		System.out.println(avg); //3500.0
	}
}

//생성자 getter setter
class Book {
	private String title;
	private int price;

	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
