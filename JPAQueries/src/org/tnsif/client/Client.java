package org.tnsif.client;

import org.tnsif.service.BookService;
import org.tnsif.service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {
		BookService service=new BookServiceImpl();

		//to return total no.of books
		System.out.println("Total no.of books: "+service.getBookCount());

		//to return specific book id
		System.out.println("Book with specific Id: "+service.getBookById(3));

		//price range
		System.out.println("Price range between 300 to 600: "+service.getBooksRange(300f, 600d));

		//author name
		System.out.println("Book with specific author: "+service.getBookByAuthor("Yashwanth"));

		//to return all the books
		System.out.println("All books: "+service.getAllBooks());
	}

}