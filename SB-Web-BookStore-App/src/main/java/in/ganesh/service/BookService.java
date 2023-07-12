package in.ganesh.service;

import java.util.List;

import in.ganesh.entity.Book;

public interface BookService {
	
	public boolean saveBook(Book book);
	
	public List<Book> getAllBooks();
	
	

}
