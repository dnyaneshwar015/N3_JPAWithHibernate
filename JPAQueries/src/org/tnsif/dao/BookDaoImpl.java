package org.tnsif.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.tnsif.entities.Book;

public class BookDaoImpl implements BookDao {

	private EntityManager em;
	
	//default constructor
	public BookDaoImpl() {
		super();
		em=JPAUtil.getEntityManager();				
		
	}

	//unimplemented methods
	@Override
	public Book getBookById(Integer id) {
		Book b = em.find(Book.class, id);
		return b;
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		String str="SELECT b FROM BOOK b where b.title=:ptitle";
		TypedQuery<Book> query=em.createQuery(str, Book.class);
		query.setParameter("ptitle","%"+title+"%");
		return query.getResultList();
	}

	@Override
	public Long getBookCount() {
		String str="SELECT COUNT(b.id) FROM Book b";
		TypedQuery<Long> query=em.createQuery(str, Long.class);
		Long count=query.getSingleResult();
		return count;
	}

	@Override
	public List<Book> getBookByAuthor(String author) {
		String str="SELECT b FROM BOOK b where b.author=:pauthor";
		TypedQuery<Book> query=em.createQuery(str, Book.class);
		query.setParameter("pauthor",author);
		return query.getResultList();
	}

	@Override
	public List<Book> getAllBooks() {
		Query query=em.createNamedQuery("getAllBooks");
		List<Book>obj=query.getResultList();
		return obj;
		
	}

	@Override
	public List<Book> getBooksRange(Double low, double high) {
		String str="SELECT b FROM BOOK b where b.price between : plow and phigh";
		TypedQuery<Book> query=em.createQuery(str, Book.class);
		query.setParameter("plow",low);
		query.setParameter("phigh",high);
		return query.getResultList();
	}

}
