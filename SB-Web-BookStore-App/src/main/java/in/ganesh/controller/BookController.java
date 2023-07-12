package in.ganesh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ganesh.entity.Book;
import in.ganesh.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookservice;
	
	@GetMapping("/book")
	public String loadform( Model model) {
		
		model.addAttribute("book", new Book());
		return "index";
	}
	
	
	@PostMapping("/saveBook")
	public String saveBook(Book book, Model model) {
		
		boolean status = bookservice.saveBook(book);
		if (status) {
			model.addAttribute("success" , "Book saved successfully");
		}
		else {
			model.addAttribute("failure" , "failed to saved");
		}
		return "index";
	}
	
	@GetMapping("/viewBooks")
	public String viewBooks(Model model) {
		
		List<Book> allBooks= bookservice.getAllBooks();
		model.addAttribute("books", allBooks);
		return "data";
	}

}
