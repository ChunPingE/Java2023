package ch15.exercise.exam07;

import java.util.Iterator;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for (Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
		
		System.out.println();
		
		Iterator<Board> iter = list.iterator();
		while (iter.hasNext()) {
			Board b = iter.next();
			System.out.println(b.getTitle() + "-" + b.getContent());
		}
		
		System.out.println();
		
		list.forEach(b-> System.out.println(b.getTitle() + "-" + b.getContent()));
	}
}
