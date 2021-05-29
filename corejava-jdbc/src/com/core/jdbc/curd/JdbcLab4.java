package com.core.jdbc.curd;

import java.util.Iterator;
import java.util.List;

import com.core.jdbc.*;

public class JdbcLab4 {

	public static void main(String[] args) {
		BookService bm = new BookService();

		// Verify user
		// Verify user
		int y = bm.verifyUser("sri", "sri");
		System.out.println("y is " + y);

		// Add the book
		Book b = new Book("B-08", "java", "Srinivas", "JLC", "250", "4",
				"111-12");
		int x = bm.addBook(b);
		System.out.println("x is " + x);

		// Update Book
		Book bk = new Book("B-05", "JDBC", "SD", "SD", "250", "4", "111-12");
		int a = bm.updataBook(bk);
		System.out.println("a is " + a);

		// Delete Book
		int c = bm.deleteBook("B-03");
		System.out.println(c);

		// get Book by B-ID
		System.out.println("Book by B-ID");
		Book bo = bm.getBookByBid("B-05");
		System.out.println(bo);

		// get book by Bname
		System.out.println("Book by Bname");
		List list = bm.getBooksByBname("JDBC");
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Book boo = (Book) it.next();
			System.out.println("Book is " + boo);
		}

		// get book by author
		System.out.println("Book by Author");
		List list1 = bm.getBooksByBname("Srinivas");
		Iterator it1 = list.iterator();
		while (it1.hasNext()) {
			Book boo = (Book) it1.next();
			System.out.println("Book is " + boo);
		}

		// get book by publications
		System.out.println("Book by Publication");
		List list2 = bm.getBooksByBname("JLC");
		Iterator it2 = list.iterator();
		while (it.hasNext()) {
			Book boo = (Book) it2.next();
			System.out.println("Book is " + boo);
		}

		// get Book by Cost
		System.out.println("Book by cost");
		List list3 = bm.getBooksByCost("250");
		Iterator it3 = list3.iterator();
		while (it3.hasNext()) {
			Book boo = (Book) it3.next();
			System.out.println("Book is " + boo);
		}

		// get book byISBN
		System.out.println("Book by cost");
		Book bo1 = bm.getBooksByIsbn("111-12");
		System.out.println("Book is " + bo1);

		// get all books
		System.out.println("All Books");
		List list4 = bm.getAllBooks();
		Iterator it4 = list4.iterator();
		while (it4.hasNext()) {
			Book boo = (Book) it4.next();
			System.out.println("Book is " + boo);
		}

	}

}
