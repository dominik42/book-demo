package de.todo42.workshop.bookdemo.books;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BooksService {
	
	public List<Book> getAllBooks() {
		Book book1 = new Book("Spring Boot 2", "Simons", "42");
		Book book2 = new Book("JEE Pattern", "Rod Johnson", "23");
		List<Book> books = Arrays.asList(book1, book2);
		return books;
	}

}
