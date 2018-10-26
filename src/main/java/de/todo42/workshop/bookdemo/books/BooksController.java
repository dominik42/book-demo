package de.todo42.workshop.bookdemo.books;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BooksController {
	
	@Autowired
	private BooksService booksService;
	
	@RequestMapping("/books")
    public String start(Model model) {
		model.addAttribute("books", 
				booksService.getAllBooks());
        return "books";
    }

}
