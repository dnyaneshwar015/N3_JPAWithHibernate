package org.tnsif.service;

import java.util.List;

import org.tnsif.entities.Book;

public interface BookService {

	public abstract Book getBookById(Integer id); 
	public abstract List<Book> getBookByTitle(String title);
	public abstract Long getBookCount();
	public abstract List<Book> getBookByAuthor(String author);
	public abstract List<Book> getAllBooks();
	public abstract List<Book> getBooksRange (float f, double high); 
	
}
