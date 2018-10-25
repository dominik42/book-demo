package de.todo42.workshop.bookdemo.books;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BooksController {
	
//	@RequestMapping(method = RequestMethod.GET, path = "/books")
//	public List<Book> listAllBooks() {
//		List<Book> result = new ArrayList();
//		Book book1 = new Book("Spring Boot 2", "Simons", "42");
//		result.add(book1);
//		return result;
//	}
	
	@RequestMapping("/books")
    public String start(Model model) {
		
		Book book = new Book("Spring Boot 2", "Simons", "42");
		List<Book> books = new ArrayList<>();
		books.add(book);
		model.addAttribute("books", books);
		
        return "books";
    }
	

}
