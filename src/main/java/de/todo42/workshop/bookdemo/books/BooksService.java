package de.todo42.workshop.bookdemo.books;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BooksService {
	
	@Autowired
	private BookRepository bookRepository;
	
	
	public Iterable<Book> getAllBooks() {
		return bookRepository. findAll();
	}

}
