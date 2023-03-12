package org.tnsif.service;

import java.util.List;

import org.tnsif.dao.BookDao;
import org.tnsif.dao.BookDaoImpl;
import org.tnsif.entities.Book;

public class BookServiceImpl implements BookService {

	private BookDao dao;
	
	//default constructor
	public BookServiceImpl() {
		super();
		dao= new BookDaoImpl();
	}

	@Override
	public Book getBookById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getBookCount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getBookByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getBooksRange(float f, double high) {
		// TODO Auto-generated method stub
		return null;
	}

}
