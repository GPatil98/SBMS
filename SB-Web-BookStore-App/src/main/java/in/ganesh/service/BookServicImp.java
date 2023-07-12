package in.ganesh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ganesh.entity.Book;
import in.ganesh.repository.BookRepository;




@Service
public class BookServicImp implements BookService {

	
	@Autowired
	private BookRepository bookrepo;
	
	
	@Override
	public boolean saveBook(Book book) {
		Book save = bookrepo.save(book);
		if(save.getId()!= null) {
			return true;
		}
		
		return false;
	}

	@Override
	public List<Book> getAllBooks() {
		
		return bookrepo.findAll();
	}

	
}
